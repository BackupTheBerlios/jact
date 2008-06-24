/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.mainforms;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.TableModel;

import org.apache.log4j.Logger;

import com.useit.app.framework.db.HibernateUtil;
import com.useit.app.framework.gui.dbactions.AbstractHibernateActionManager.AbstractShowSaveDialogAction;
import com.useit.app.framework.gui.dbactions.AbstractHibernateActionManager.CallbackHandlerList;
import com.useit.app.framework.gui.dialogs.AbstractSimpleDataObjectTreeDialog;
import com.useit.app.framework.gui.guiHelper.AbstractSimpleTreePanel;
import com.useit.app.framework.gui.models.AbstractElementTableModel;
import com.useit.app.framework.gui.panel.SimpleGridPanel;
import com.useit.app.framework.gui.panel.SimpleGridPanel.GridControll;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.app.framework.model.dataModel.ModelManagerInterface;
import com.useit.jact.gui.globalmodel.DialogFactory;
import com.useit.jact.gui.globalmodel.HibernateActionMananger;

public class HibernateGridTreePanel extends JPanel implements GridControll,
        CallbackHandlerList {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(HibernateGridTreePanel.class);

    private JPanel centerPanel = null;

    private SimpleGridPanel gridPanel;

    ModelManagerInterface mmiterface;

    private String currenType;

    private AbstractElementTableModel etm;

    protected boolean showGrid = true;

    private GridTreeSwitchAction switchPanel;

    private ActionSaveXML sxml;

    private ActionLoadXML lxml;

    private ActionSaveConfig scnf;

    private ActionLoadConf lcnf;

    private JPanel jPanelHeader = null;

    private JLabel jLabel = null;

    AbstractSimpleTreePanel treePanel;

    private SaveObject saveObject;

    private class ActionSaveXML extends AbstractAction {

        public ActionSaveXML() {
            super();
            putValue(NAME, "SaveXML");
            putValue(ACTION_COMMAND_KEY, "ActionSaveXML");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            if (getSelectedObject() != null)
                saveXml();

        }

    }; // end of ActionSaveXML Declaration

    private class ActionLoadXML extends AbstractAction {
        public ActionLoadXML() {
            super();
            putValue(NAME, "LoadXML");
            putValue(ACTION_COMMAND_KEY, "ActionloadXML");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            // if(getSelectedObject()!=null)
            loadXml();

        }

    }; // end of ActionloadXML Declaration

    private class ActionSaveConfig extends AbstractAction {
        public ActionSaveConfig() {
            super();
            putValue(NAME, "SaveConfig");
            putValue(ACTION_COMMAND_KEY, "ActionSaveConfig");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            if (getSelectedObject() != null)
                saveConf();
        }

    }; // end of ActionSaveConfig Declaration

    private class ActionLoadConf extends AbstractAction {
        public ActionLoadConf() {
            super();
            putValue(NAME, "load conf");
            // putValue(SHORT_DESCRIPTION, getResBundel().getString(
            // "resDescActionLoadConf"));
            putValue(ACTION_COMMAND_KEY, "ActionLoadConf");
            // putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            // if(getSelectedObject()!=null)
            loadConf();
            // JFileChooser ch = new JFileChooser();
            // int ret = ch.showSaveDialog(null);
            // if (ret==JFileChooser.CANCEL_OPTION) return;
            // //XmlHandlerImpl.writeConf(ch.getSelectedFile().getAbsolutePath(),data);
            // //
            // mmiterface.writeConfXML(ch.getSelectedFile().getAbsolutePath(),
            // // conf);
        }

    }; // end of ActionLoadConf Declaration

    private class SaveObject extends AbstractShowSaveDialogAction {
        public SaveObject() {
            super();
            putValue(NAME, "Save Object");
        }

        @Override
        protected Object showDialog() {
            return getSelectedObject();
        }
    }

    public class GridTreeSwitchAction extends AbstractAction {
        private boolean selected;

        public GridTreeSwitchAction() {
            super();
        }

        public GridTreeSwitchAction(String name, Icon icon) {
            super(name, icon);
        }

        public GridTreeSwitchAction(String name) {
            super(name);
        }

        public void actionPerformed(ActionEvent e) {
            showGrid = !showGrid;

            if (showGrid) {
                treePanel = null;
                setCenterPanel(gridPanel);
            } else {
                treePanel = DialogFactory.createTreePanel(etm.get(0));

                if (treePanel != null) {
                    treePanel.initTree(etm.getList());
                    setCenterPanel(treePanel);
                }
            }

        }

        public boolean isSelected() {
            return this.selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

    }

    /**
     * This is the default constructor
     */
    public HibernateGridTreePanel() {
        super();
        // HibernateUtil.getSessionFactory()

        initialize();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setLayout(new BorderLayout());
        this.setSize(300, 200);
        this.add(getCenterPanel(), java.awt.BorderLayout.CENTER);
        this.add(getJPanelHeader(), java.awt.BorderLayout.NORTH);
        etm = new AbstractElementTableModel();
        etm.setNewList(Collections.EMPTY_LIST);
        createGridPanel();
        initActions();
    }

    private void initActions() {
        switchPanel = new GridTreeSwitchAction("switch");
        sxml = new ActionSaveXML();
        lxml = new ActionLoadXML();
        lcnf = new ActionLoadConf();
        scnf = new ActionSaveConfig();
        saveObject = new SaveObject();
    }

    /**
     * This method initializes centerPanel
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getCenterPanel() {
        if (centerPanel == null) {
            centerPanel = new JPanel();
            centerPanel.setLayout(new BorderLayout());
        }
        return centerPanel;
    }

    private void createGridPanel() {
        if (gridPanel == null) {
            gridPanel = new SimpleGridPanel();
            gridPanel.setControll(this);

            gridPanel.setTableModel(etm);
            setCenterPanel(gridPanel);
        }
    }

    Object getSelectedObject() {
        if (treePanel != null) {
            return treePanel.getLastObj();
        } else {
            return etm.get(gridPanel.getSelectedRow());
        }

        // return null;
    }

    void setCenterPanel(Component fPanel) {
        getCenterPanel().removeAll();
        getCenterPanel().add(fPanel);
        getCenterPanel().invalidate();
        getCenterPanel().revalidate();
        getCenterPanel().update(getCenterPanel().getGraphics());
    }

    public void setList(List list) {
        etm.setNewList(list);
        // setCenterPanel(p);
        if (!showGrid) {
            AbstractSimpleTreePanel p = DialogFactory.createTreePanel(list
                    .get(0));

            if (p != null) {
                p.initTree(list);
                setCenterPanel(p);

            }
        } else
            setCenterPanel(gridPanel);
    }

    public void cleanSession() {
        if (HibernateUtil.getSession().isDirty())
            if (JOptionPane.showConfirmDialog(null,
                    "sollen die änderungen gespeichert werden", "save ",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION) {
                try {
                    HibernateUtil.getSession().flush();

                } catch (Exception e) {
                    LOGGER.error("cleanSession()", e);

                    HibernateUtil.getSession().close();

                }

            }
        // setCenterPanel(gridPanel);
    }

    public void setModelFactory(ModelManagerInterface mmi, String currentType) {
        mmiterface = mmi;
        currenType = currentType;
        jLabel.setText(mmi.getMODELNAME());

    }

    public TableModel getTabelModel() {
        return etm;
    }

    public void showEditDialog(int row) {
        if (row < 0)
            return;
        AbstractSimpleDataClass dataClass = etm.get(row);
        AbstractSimpleDataObjectTreeDialog dlg = DialogFactory
                .createTreeDialog(dataClass);
        dlg.setModal(true);
        dlg.setVisible(true);

        HibernateActionMananger.saveObject(dataClass);

    }

    public void deleteObject(int row) {
        AbstractSimpleDataClass obj = etm.get(row);
        HibernateActionMananger.deleteObject(obj);
        etm.remove(obj);
    }

    public void newObject() {
        Object object = mmiterface.newObject(currenType);
        etm.add((AbstractSimpleDataClass) object);
    }

    public GridTreeSwitchAction getSwitchPanel() {
        return this.switchPanel;
    }

    /**
     * This method initializes jPanelHeader
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getJPanelHeader() {
        if (jPanelHeader == null) {
            jLabel = new JLabel();
            jLabel.setText("JLabel");
            jPanelHeader = new JPanel();
            jPanelHeader.add(jLabel, null);
        }
        return jPanelHeader;
    }

    public ActionLoadConf getLcnf() {
        return this.lcnf;
    }

    public ActionLoadXML getLxml() {
        return this.lxml;
    }

    public ActionSaveConfig getScnf() {
        return this.scnf;
    }

    public ActionSaveXML getSxml() {
        return this.sxml;
    }

    /**
     * @throws HeadlessException
     */
    void saveXml() throws HeadlessException {
        JFileChooser ch = new JFileChooser();
        int ret = ch.showSaveDialog(this);
        if (ret == JFileChooser.CANCEL_OPTION)
            return;
        mmiterface.writeConfXML(ch.getSelectedFile().getAbsolutePath(),
                getSelectedObject());
        // riteConf(,getSelectedObject());
    }

    /**
     * @throws HeadlessException
     */
    void loadXml() throws HeadlessException {
        JFileChooser ch = new JFileChooser();
        int ret = ch.showOpenDialog(this);
        if (ret == JFileChooser.CANCEL_OPTION)
            return;
        Object object = mmiterface.readConfXML(ch.getSelectedFile()
                .getAbsolutePath());
        // data =
        // XmlHandlerImpl.readConf(ch.getSelectedFile().getAbsolutePath());
        // initTree(data);
        etm.add((AbstractSimpleDataClass) object);
        if (treePanel != null) {
            treePanel.initTree(etm.getList());
        }
    }

    /**
     * @throws HeadlessException
     */
    void saveConf() throws HeadlessException {
        JFileChooser ch = new JFileChooser();
        int ret = ch.showSaveDialog(this);
        if (ret == JFileChooser.CANCEL_OPTION)
            return;

        try {
            mmiterface.writetoFile(getSelectedObject(), ch.getSelectedFile()
                    .getAbsolutePath());
        } catch (FileNotFoundException e) {
            LOGGER.error("saveConf()", e);
        } catch (IOException e) {
            LOGGER.error("saveConf()", e);
        }

        // writer.writetoFile(data,ch.getSelectedFile().getAbsolutePath());

    }

    /**
     * 
     */
    void loadConf() {
        JFileChooser ch = new JFileChooser();
        int ret = ch.showOpenDialog(this);
        if (ret == JFileChooser.CANCEL_OPTION)
            return;

        try {
            Object object = mmiterface.readConf(ch.getSelectedFile());
            etm.add((AbstractSimpleDataClass) object);
            if (treePanel != null) {
                treePanel.initTree(etm.getList());
            }

        } catch (FileNotFoundException e) {
            LOGGER.error("loadConf()", e);
        } catch (IOException e) {
            LOGGER.error("loadConf()", e);
        }
    }

    public SaveObject getSaveObject() {
        return this.saveObject;
    }

    public void setSaveObject(SaveObject saveObject) {
        this.saveObject = saveObject;
    }

}
