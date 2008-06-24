/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.applet;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.rmi.RMISecurityManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import com.useit.app.framework.gui.dbactions.AbstractHibernateActionManager;
import com.useit.app.framework.gui.models.AbstractElementTableModel;
import com.useit.app.framework.model.dataModel.ModelManagerInterface;
import com.useit.jact.gui.globalmodel.GuiActionMananger;
import com.useit.jact.gui.globalmodel.HibernateActionMananger;
import com.useit.jact.gui.mainforms.HibernateGridTreePanel;
import com.useit.jact.io.globalmodel.HibernateObjectLoader;
import com.useit.jact.model.globalmodel.ModelFactoryImpl;

public class SimpleConfApplet extends JApplet {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(SimpleConfApplet.class);

    private JPanel jContentPane = null;

    private JMenuBar jJMenuBar = null;

    private JPanel jPanel = null;

    private GuiActionMananger actmananger;

    private JPanel centerPanel = null;

    private JMenu jMenuFile = null;

    private JMenu jMenuConfigs = null;

    protected Object dataObject;

    private JButton jButtonSave = null;

    private HibernateActionMananger hactmananger;

    private AbstractElementTableModel etm;

    // private SimpleListPanel p;

    protected ModelManagerInterface mmiterface;

    protected String currenType;

    // private SimpleGridPanel gridPanel;

    private HibernateGridTreePanel hibernateGridTreePanel;

    private JMenuItem menuItemSwitchpanel;

    /**
     * This is the default constructor
     */
    public SimpleConfApplet() {
        super();

    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    public void init() {

        ModelFactoryImpl.getInstance();
        System.setSecurityManager(new RMISecurityManager());
        SecurityManager securityManager = System.getSecurityManager();
        LOGGER.info(securityManager);

        this.setSize(300, 200);
        this.setJMenuBar(getJJMenuBar());
        this.setContentPane(getJContentPane());
        initActions();
        etm = new AbstractElementTableModel();
        etm.setNewList(HibernateObjectLoader.loadAgentsconfList());
        // createListPanel();
        // getCenterPanel().add(p);
        // createGridPanel();
    }

    //
    // private void createGridPanel() {
    // gridPanel = new SimpleGridPanel();
    // gridPanel.setControll(new GridControll() {
    //
    // public TableModel getTabelModel() {
    // return etm;
    // }
    //
    // public void showEditDialog(int row) {
    // if (row < 0)
    // return;
    // AbstractSimpleDataClass dataClass = etm.get(row);
    // AbstractSimpleDataObjectTreeDialog dlg = DialogFactory
    // .createTreeDialog(dataClass);
    // dlg.setModal(true);
    // dlg.setVisible(true);
    //
    // HibernateActionMananger.saveObject(dataClass);
    //
    // }
    //
    // public void deleteObject(int row) {
    // // TODO Automatisch erstellter Methoden-Stub
    //
    // }
    //
    // public void newObject() {
    // Object object = mmiterface.newObject(currenType);
    // etm.add((AbstractSimpleDataClass) object);
    // }
    //
    // });
    //
    // gridPanel.setTableModel(etm);
    // setCenterPanel(gridPanel);
    // }

    // /**
    // *
    // */
    // private void createListPanel() {
    // p = new SimpleListPanel();
    // p.setControll(new ListControll() {
    //
    // public TableModel getTabelModel() {
    // return etm;
    // }
    //
    // public Component getPanel(Object object) {
    // Component panel = null;
    // if (object instanceof Integer) {
    // Integer integer = (Integer) object;
    // if (integer.intValue() < 0)
    // return null;
    // AbstractSimpleDataClass dataClass = etm.get(integer
    // .intValue());
    // panel = GuiModelResolver.resolvePanel(dataClass);
    //
    // }// end of if (object instanceof Integer)
    //
    // return panel;
    // }
    //
    // });
    // p.setTableModel(etm);
    // setCenterPanel(p);
    // }
    //
    // private void setCenterPanel(Component p) {
    // getCenterPanel().removeAll();
    // getCenterPanel().add(p);
    // getCenterPanel().revalidate();
    // }

    private void initActions() {
        actmananger = new GuiActionMananger();
        hactmananger = new HibernateActionMananger();

        List<Action> aList = new ArrayList<Action>();
        hactmananger.fillListActions(aList, hibernateGridTreePanel);
        JMenu menu = getJMenuBar().add(new JMenu("view"));
        this.menuItemSwitchpanel = new JMenuItem(hibernateGridTreePanel
                .getSwitchPanel());
        // menuItemSwitchpanel.setSelected(false)
        menu.add(menuItemSwitchpanel);
        AbstractHibernateActionManager.fillMenu(getJMenuBar().add(
                new JMenu("test")), aList);

        jMenuFile.add(hactmananger.getFsAction());

        jMenuFile.add(hibernateGridTreePanel.getSaveObject());

        jMenuConfigs.add(hibernateGridTreePanel.getLcnf());
        jMenuConfigs.add(hibernateGridTreePanel.getScnf());
        jMenuConfigs.add(hibernateGridTreePanel.getLxml());
        jMenuConfigs.add(hibernateGridTreePanel.getSxml());
    }

    /**
     * This method initializes jContentPane
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getJPanel(), java.awt.BorderLayout.SOUTH);
            jContentPane.add(getHibernateGridTreePanel(),
                    java.awt.BorderLayout.CENTER);
        }
        return jContentPane;
    }

    /**
     * This method initializes jJMenuBar
     * 
     * @return javax.swing.JMenuBar
     */
    private JMenuBar getJJMenuBar() {
        if (jJMenuBar == null) {
            jJMenuBar = new JMenuBar();
            jJMenuBar.add(getJMenuFile());
            jJMenuBar.add(getJMenuConfigs());
        }
        return jJMenuBar;
    }

    /**
     * This method initializes jPanel
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel() {
        if (jPanel == null) {
            FlowLayout flowLayout = new FlowLayout();
            flowLayout.setAlignment(java.awt.FlowLayout.LEFT);
            jPanel = new JPanel();
            jPanel.setLayout(flowLayout);
            jPanel.add(getJButtonSave(), null);
        }
        return jPanel;
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

    /**
     * This method initializes jMenuFile
     * 
     * @return javax.swing.JMenu
     */
    private JMenu getJMenuFile() {
        if (jMenuFile == null) {
            jMenuFile = new JMenu("file");
        }
        return jMenuFile;
    }

    /**
     * This method initializes jMenuFile
     * 
     * @return javax.swing.JMenu
     */
    private HibernateGridTreePanel getHibernateGridTreePanel() {
        if (hibernateGridTreePanel == null) {
            hibernateGridTreePanel = new HibernateGridTreePanel();// new
                                                                    // JMenu("file");
        }
        return hibernateGridTreePanel;
    }

    /**
     * This method initializes jMenuConfigs
     * 
     * @return javax.swing.JMenu
     */
    private JMenu getJMenuConfigs() {
        if (jMenuConfigs == null) {
            jMenuConfigs = new JMenu("configs");
        }
        return jMenuConfigs;
    }

    /**
     * This method initializes jButtonSave
     * 
     * @return javax.swing.JButton
     */
    private JButton getJButtonSave() {
        if (jButtonSave == null) {
            jButtonSave = new JButton();
        }
        return jButtonSave;
    }

}
