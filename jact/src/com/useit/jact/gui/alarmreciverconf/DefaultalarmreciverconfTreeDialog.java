/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.alarmreciverconf;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.event.TreeModelEvent;

import com.useit.app.framework.gui.baseForms.BaseAppDialogInterface;
import com.useit.app.framework.gui.dialogs.AbstractSimpleDataObjectTreeDialog;
import com.useit.app.framework.gui.dialogs.SimpleObjectDialogScrollPane;
import com.useit.app.framework.gui.guiHelper.ObjectHandler;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.app.framework.gui.guiHelper.SimpleMapDataPanel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.io.alarmreciverconf.ConfReaderImpl;
import com.useit.jact.io.alarmreciverconf.ConfWriterImpl;
import com.useit.jact.io.alarmreciverconf.XmlHandlerImpl;

/**
 * <p>
 * DefaultalarmreciverconfTreeDialog
 * </p>
 * Created : 12.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DefaultalarmreciverconfTreeDialog.java,v 1.5
 *          2006/01/09 10:17:42 urs Exp $
 */
public class DefaultalarmreciverconfTreeDialog extends
        AbstractSimpleDataObjectTreeDialog implements ObjectHandler {
    private ActionSaveXML sxml;

    private ActionLoadXML lxml;

    private ActionSaveConfig scnf;

    private ActionLoadConf lcnf;

    private class ActionSaveXML extends AbstractAction {

        public ActionSaveXML() {
            super();
            putValue(NAME, "SaveXML");
            putValue(ACTION_COMMAND_KEY, "ActionSaveXML");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
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
            loadConf();
        }

    }; // end of ActionLoadConf Declaration

    /**
     * @param owner
     * @param data
     * @throws HeadlessException
     */
    public DefaultalarmreciverconfTreeDialog(Dialog owner, Object data)
            throws HeadlessException {
        super(owner, data);
        initTree(data);
    }

    /**
     * @param owner
     * @param data
     * @throws HeadlessException
     */
    public DefaultalarmreciverconfTreeDialog(Frame owner, Object data)
            throws HeadlessException {
        super(owner, data);
        initTree(data);
    }

    /**
     * @param data
     */
    public DefaultalarmreciverconfTreeDialog(Object data) {
        super(data);
        initTree(data);
        // SimpleTreeModelImpl m = new SimpleTreeModelImpl();
        // m.setRoot((VoicemailConf) data);
        // setTreeModel(m);
        // setTreeCellRenderer(GuiClassFactory.simpleTreeRendere());
    }

    /**
     * @param data
     */
    private void initTree(Object data) {
        SimpleTreeModelImpl m = new SimpleTreeModelImpl();
        m.setRoot(data);
        setTreeModel(m);
        setTreeCellRenderer(GuiClassFactory.simpleTreeRendere());

        selectRoot();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.dialogs.AbstractSimpleDataObjectTreeDialog#initActions()
     */
    protected void initActions() {
        super.initActions();
        JMenu filemenu = new JMenu("file");
        filemenu.add(sxml = new ActionSaveXML());
        filemenu.add(lxml = new ActionLoadXML());
        filemenu.add(scnf = new ActionSaveConfig());
        filemenu.add(lcnf = new ActionLoadConf());
        getJMenuBar().add(filemenu);

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.dialogs.AbstractSimpleDataObjectTreeDialog#createPanel(java.lang.Object)
     */
    protected SimpleDataObjectPanel createPanel(Object object) {
        SimpleDataObjectPanel p = GuiClassFactory.createPanel(object);
        if (p instanceof SimpleMapDataPanel) {
            SimpleMapDataPanel mp = (SimpleMapDataPanel) p;
            mp.setObjectHandler(this);
        }
        return p;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.gui.ObjectHandler#deleteObject(com.useit.app.framework.model.modelHelper.AbstractObjectMap,
     *      java.lang.Object)
     */
    public void deleteObject(MapTyper dataMapT, Object selectedObject) {
        List dataMap = dataMapT.getList();
        if (dataMap.contains(selectedObject))
            dataMap.remove(selectedObject);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.gui.ObjectHandler#addObject(com.useit.app.framework.model.modelHelper.AbstractObjectMap)
     */
    public void addObject(MapTyper dataMap) {
        Object object = dataMap.newObject();
        SimpleDataObjectPanel p = GuiClassFactory.createPanel(object);
        SimpleObjectDialogScrollPane dlg = new SimpleObjectDialogScrollPane(
                null, true, p);
        dlg.setVisible(true);
        if (dlg.returnCode == BaseAppDialogInterface.RETURNOK) {
            dataMap.addObject(object);
            if (getJTree().getAnchorSelectionPath() != null)
                if (getJTree().getAnchorSelectionPath().getParentPath() != null)
                    treeModel.fireTreeStructureChanged(new TreeModelEvent(
                            getJTree(), getJTree().getAnchorSelectionPath()
                                    .getParentPath()));
        }
        lastPanel.updateData();

    }

    /**
     * @throws HeadlessException
     */
    void saveXml() throws HeadlessException {
        JFileChooser ch = new JFileChooser();
        int ret = ch.showSaveDialog(this);
        if (ret == JFileChooser.CANCEL_OPTION)
            return;
        XmlHandlerImpl.writeConf(ch.getSelectedFile().getAbsolutePath(), data);
    }

    /**
     * @throws HeadlessException
     */
    void loadXml() throws HeadlessException {
        JFileChooser ch = new JFileChooser();
        int ret = ch.showOpenDialog(this);
        if (ret == JFileChooser.CANCEL_OPTION)
            return;
        data = XmlHandlerImpl.readConf(ch.getSelectedFile().getAbsolutePath());
        initTree(data);
    }

    /**
     * @throws HeadlessException
     */
    void saveConf() throws HeadlessException {
        JFileChooser ch = new JFileChooser();
        int ret = ch.showSaveDialog(this);
        if (ret == JFileChooser.CANCEL_OPTION)
            return;

        ConfWriterImpl writer = new ConfWriterImpl();
        writer.writetoFile(data, ch.getSelectedFile().getAbsolutePath());

    }

    /**
     * 
     */
    void loadConf() {
        JFileChooser ch = new JFileChooser();
        int ret = ch.showOpenDialog(this);
        if (ret == JFileChooser.CANCEL_OPTION)
            return;
        ConfReaderImpl reader = new ConfReaderImpl();
        try {
            data = reader.readConf(ch.getSelectedFile());// XmlHandlerImpl.readConf(ch.getSelectedFile().getAbsolutePath());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        initTree(data);
    }

}
