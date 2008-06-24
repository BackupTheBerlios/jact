/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.mainforms;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.table.TableModel;

import org.apache.log4j.Logger;
import org.hibernate.classic.Session;

import com.useit.app.framework.db.HibernateUtil;
import com.useit.app.framework.gui.dbactions.AbstractHibernateActionManager;
import com.useit.app.framework.gui.dialogs.AbstractSimpleDataObjectTreeDialog;
import com.useit.app.framework.gui.guiHelper.GlobalIconManager;
import com.useit.app.framework.gui.models.AbstractElementTableModel;
import com.useit.app.framework.gui.panel.SimpleGridPanel;
import com.useit.app.framework.gui.panel.SimpleGridPanel.GridControll;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.app.framework.model.dataModel.ModelManagerInterface;
import com.useit.jact.gui.agentconf.DefaultagentconfTreeDialog;
import com.useit.jact.gui.extensionconf.DefaultextensionconfTreeDialog;
import com.useit.jact.gui.featureconf.DefaultfeatureconfTreeDialog;
import com.useit.jact.gui.globalmodel.DialogFactory;
import com.useit.jact.gui.globalmodel.GuiActionMananger;
import com.useit.jact.gui.globalmodel.HibernateActionMananger;
import com.useit.jact.gui.iaxconf.DefaultiaxconfTreeDialog;
import com.useit.jact.gui.indicationsconf.DefaultindicationsconfTreeDialog;
import com.useit.jact.gui.managerconf.DefaultmanagerconfTreeDialog;
import com.useit.jact.gui.meetmeconf.DefaultmeetmeconfTreeDialog;
import com.useit.jact.gui.misdnconf.DefaultmisdnconfTreeDialog;
import com.useit.jact.gui.misdndriverconf.DefaultmisdndriverconfTreeDialog;
import com.useit.jact.gui.musiconholdconf.DefaultmusiconholdconfTreeDialog;
import com.useit.jact.gui.queueconf.DefaultqueueconfTreeDialog;
import com.useit.jact.gui.sipconf.DefaultsipconfTreeDialog;
import com.useit.jact.gui.voicemailconf.DefaultvoicemailconfTreeDialog;
import com.useit.jact.gui.zapataconf.DefaultzapataconfTreeDialog;
import com.useit.jact.gui.zaptelconf.DefaultzaptelconfTreeDialog;
import com.useit.jact.model.agentconf.AgentsconfImpl;
import com.useit.jact.model.extensionconf.ExtensionconfImpl;
import com.useit.jact.model.featureconf.FeaturesconfImpl;
import com.useit.jact.model.globalmodel.ModelFactoryImpl;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.IaxgeneralImpl;
import com.useit.jact.model.indicationsconf.IndicationsconfImpl;
import com.useit.jact.model.managerconf.ManagergeneralSectionImpl;
import com.useit.jact.model.meetmeconf.MeetmeconfImpl;
import com.useit.jact.model.misdnconf.MisdnconfImpl;
import com.useit.jact.model.misdndriverconf.MisdnDriverConfImpl;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConfImpl;
import com.useit.jact.model.queueconf.QueuegeneralImpl;
import com.useit.jact.model.sipconf.SipConfImpl;
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.VoicemailConfImpl;
import com.useit.jact.model.zapataconf.ZapataconfImpl;
import com.useit.jact.model.zaptelconf.ZaptelconfImpl;

/**
 * <p>
 * SimpleConfigForm
 * </p>
 * Created : 13.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleConfigForm.java,v 1.4 2005/08/17
 *          00:02:08 urs Exp $
 */
public class SimpleConfigForm extends JFrame {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(SimpleConfigForm.class);

    private static Session session;

    private javax.swing.JPanel jContentPane = null;

    private JPanel jPanel = null;

    private JMenuBar jJMenuBar = null;

    private JMenu jMenuFile = null;

    private JMenu jMenuChannelConf = null;

    private JMenu jMenuDialplanConf = null;

    private ResourceBundle resbundel = ResourceBundle
            .getBundle("resourceBundels/mainform");

    private ResourceBundle defaultresBundel = ResourceBundle
            .getBundle("resourceBundels/DefaultResBundel");

    private JMenu jMenuDialplanCommandsConf = null;

    private JMenu jMenuMisc = null;

    //private GuiActionMananger actionmananger = new GuiActionMananger();

    //private HibernateActionMananger hactionMananger = new HibernateActionMananger();

    private SimpleGridPanel gridPanel;

    private ModelManagerInterface mmiterface;

    private String currenType;

    private AbstractElementTableModel etm;

    private JPanel jPanel1;

    private JPanel centerPanel;

    protected boolean showGrid = true;

    private HibernateGridTreePanel hibernateGridTreePanel;

    private JMenuItem menuItemSwitchpanel;

    private GuiActionMananger actmananger;

    private HibernateActionMananger hactmananger;

    private class ActionClose extends AbstractAction {
        public ActionClose() {
            super();
            putValue(NAME, defaultresBundel.getString("cmdClose"));
            putValue(SHORT_DESCRIPTION, defaultresBundel
                    .getString("cmdCloseDesc"));
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_C));
            putValue(SMALL_ICON, GlobalIconManager.getBtnClose());

        }

        public void actionPerformed(ActionEvent arg0) {
            setVisible(false);
            dispose();
        }

    }

    protected abstract class ActionConf extends AbstractAction {
        protected Object model;

        public ActionConf() {
            super();
        }

    }; // end of ActionCanofAction Declaration

    protected class ActionSipConf extends ActionConf {
        // protected SipConfImpl model;

        public ActionSipConf() {
            super();
            putValue(NAME, getResBundel().getString("resNameActionSipConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSipConf"));
            putValue(ACTION_COMMAND_KEY, "ActionSipConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            model = new SipConfImpl();

            DefaultsipconfTreeDialog dlg = new DefaultsipconfTreeDialog(model);
            dlg.setVisible(true);

        }

    }; // end of ActionSipConf Declaration

    protected class ActionVoicemailConf extends ActionConf {
        public ActionVoicemailConf() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionVoicemailConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionVoicemailConf"));
            putValue(ACTION_COMMAND_KEY, "ActionVoicemailConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            VoicemailConf voiceconf = new VoicemailConfImpl();
            model = voiceconf;
            DefaultvoicemailconfTreeDialog dlg = new DefaultvoicemailconfTreeDialog(
                    SimpleConfigForm.this, voiceconf);

            dlg.setVisible(true);
        }

    }; // end of ActionVoicemailConf Declaration

    protected class ActionManagerConf extends ActionConf {
        public ActionManagerConf() {
            super();
            putValue(NAME, getResBundel().getString("resNameActionManagerConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionManagerConf"));
            putValue(ACTION_COMMAND_KEY, "ActionManagerConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            ManagergeneralSectionImpl mconf = new ManagergeneralSectionImpl();
            model = mconf;
            DefaultmanagerconfTreeDialog treedlg = new DefaultmanagerconfTreeDialog(
                    mconf);
            treedlg.setVisible(true);

        }

    }; // end of ActionManagerConf Declaration

    protected class ActionAgentConf extends ActionConf {
        public ActionAgentConf() {
            super();
            putValue(NAME, getResBundel().getString("resNameActionAgentConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionAgentConf"));
            putValue(ACTION_COMMAND_KEY, "ActionAgentConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            AgentsconfImpl impl = new AgentsconfImpl();
            model = impl;
            DefaultagentconfTreeDialog treeDialog = new DefaultagentconfTreeDialog(
                    impl);
            treeDialog.setVisible(true);
        }

    }; // end of ActionAgentConf Declaration

    protected class ActionextensionConf extends ActionConf {
        public ActionextensionConf() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionextensionConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionextensionConf"));
            putValue(ACTION_COMMAND_KEY, "ActionextensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            ExtensionconfImpl econf = new ExtensionconfImpl();
            model = econf;
            DefaultextensionconfTreeDialog dlg = new DefaultextensionconfTreeDialog(
                    econf);
            dlg.setVisible(true);
        }

    }; // end of ActionextensionConf Declaration

    protected class ActionQueueConf extends ActionConf {
        public ActionQueueConf() {
            super();
            putValue(NAME, getResBundel().getString("resNameActionQueueConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionQueueConf"));
            putValue(ACTION_COMMAND_KEY, "ActionQueueConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            QueuegeneralImpl gconf = new QueuegeneralImpl();
            model = gconf;
            DefaultqueueconfTreeDialog dlg = new DefaultqueueconfTreeDialog(
                    gconf);
            dlg.setVisible(true);
        }

    }; // end of ActionQueueConf Declaration

    protected class ActionFeatureConf extends ActionConf {
        public ActionFeatureConf() {
            super();
            putValue(NAME, getResBundel().getString("resNameActionFeatureConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionFeatureConf"));
            putValue(ACTION_COMMAND_KEY, "ActionFeatureConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            FeaturesconfImpl impl = new FeaturesconfImpl();
            DefaultfeatureconfTreeDialog dlg = new DefaultfeatureconfTreeDialog(
                    impl);
            model = impl;
            dlg.setVisible(true);
        }

    }; // end of ActionFeatureConf Declaration

    protected class ActionMisdnConf extends ActionConf {
        public ActionMisdnConf() {
            super();
            putValue(NAME, getResBundel().getString("resNameActionMisdnConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionMisdnConf"));
            putValue(ACTION_COMMAND_KEY, "ActionMisdnConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            MisdnconfImpl impl = new MisdnconfImpl();
            model = impl;
            DefaultmisdnconfTreeDialog dlg = new DefaultmisdnconfTreeDialog(
                    impl);
            dlg.setVisible(true);
        }

    }; // end of ActionMisdnConf Declaration

    protected class ActionZaptelConf extends ActionConf {
        public ActionZaptelConf() {
            super();
            putValue(NAME, getResBundel().getString("resNameActionZaptelConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionZaptelConf"));
            putValue(ACTION_COMMAND_KEY, "ActionZaptelConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            ZaptelconfImpl impl = new ZaptelconfImpl();
            model = impl;
            DefaultzaptelconfTreeDialog dlg = new DefaultzaptelconfTreeDialog(
                    impl);
            dlg.setVisible(true);
        }

    }; // end of ActionZaptelConf Declaration

    protected class ActionMeetmeConf extends ActionConf {
        public ActionMeetmeConf() {
            super();
            putValue(NAME, getResBundel().getString("resNameActionMeetmeConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionMeetmeConf"));
            putValue(ACTION_COMMAND_KEY, "ActionMeetmeConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            MeetmeconfImpl impl = new MeetmeconfImpl();
            model = impl;
            DefaultmeetmeconfTreeDialog dlg = new DefaultmeetmeconfTreeDialog(
                    impl);
            dlg.setVisible(true);
        }

    }; // end of ActionMeetmeConf Declaration

    protected class ActionIndicationConf extends ActionConf {
        public ActionIndicationConf() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionIndicationConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionIndicationConf"));
            putValue(ACTION_COMMAND_KEY, "ActionIndicationConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            IndicationsconfImpl impl = new IndicationsconfImpl();
            model = impl;
            DefaultindicationsconfTreeDialog dlg = new DefaultindicationsconfTreeDialog(
                    impl);
            dlg.setVisible(true);
        }

    }; // end of ActionIndicationConf Declaration

    protected class ActionMusicOnHoldConf extends ActionConf {
        public ActionMusicOnHoldConf() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionMusicOnHoldConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionMusicOnHoldConf"));
            putValue(ACTION_COMMAND_KEY, "ActionMusicOnHoldConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            Music_on_HoldConfImpl impl = new Music_on_HoldConfImpl();
            model = impl;
            DefaultmusiconholdconfTreeDialog dlg = new DefaultmusiconholdconfTreeDialog(
                    impl);
            dlg.setVisible(true);
        }

    }; // end of ActionMusicOnHoldConf Declaration

    protected class ActionZapataConf extends ActionConf {
        public ActionZapataConf() {
            super();
            putValue(NAME, getResBundel().getString("resNameActionZapataConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionZapataConf"));
            putValue(ACTION_COMMAND_KEY, "ActionZapataConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            ZapataconfImpl impl = new ZapataconfImpl();
            model = impl;
            DefaultzapataconfTreeDialog dlg = new DefaultzapataconfTreeDialog(
                    impl);
            dlg.setVisible(true);
        }

    }; // end of ActionZapataConf Declaration

    protected class ActionMisdnCardConf extends ActionConf {
        public ActionMisdnCardConf() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionMisdnCardConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionMisdnCardConf"));
            putValue(ACTION_COMMAND_KEY, "ActionMisdnCardConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            com.useit.jact.model.misdndriverconf.MisdnDriverConfImpl driverConfImpl = new MisdnDriverConfImpl();
            model = driverConfImpl;
            DefaultmisdndriverconfTreeDialog dlg = new DefaultmisdndriverconfTreeDialog(
                    driverConfImpl);
            dlg.setVisible(true);
        }

    }; // end of ActionMisdnCardConf Declaration

    protected class ActionIaxConf extends ActionConf {
        public ActionIaxConf() {
            super();
            putValue(NAME, getResBundel().getString("resNameActionIaxConf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionIaxConf"));
            putValue(ACTION_COMMAND_KEY, "ActionIaxConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            Iaxgeneral iaxconf = new IaxgeneralImpl();
            model = iaxconf;
            DefaultiaxconfTreeDialog dlg = new DefaultiaxconfTreeDialog(iaxconf);
            dlg.setVisible(true);
        }

    }; // end of ActionIaxConf Declaration

    public static void main(String[] args) {
        ModelFactoryImpl.getInstance();
        session = HibernateUtil.getSessionFactory().openSession();

        SimpleConfigForm dlg = new SimpleConfigForm();
        dlg.setVisible(true);
        // System.exit(0);
    }

    /**
     * @throws java.awt.HeadlessException
     */
    public SimpleConfigForm(boolean doInit) throws HeadlessException {
        super();
        if (doInit)
            initialize();
    }

    /**
     * @throws java.awt.HeadlessException
     */
    public SimpleConfigForm() throws HeadlessException {
        super();
        initialize();
    }

    /**
     * @param gc
     */
    public SimpleConfigForm(GraphicsConfiguration gc) {
        super(gc);
        initialize();
    }

    /**
     * @param title
     * @throws java.awt.HeadlessException
     */
    public SimpleConfigForm(String title) throws HeadlessException {
        super(title);
        initialize();
    }

    /**
     * @param title
     * @param gc
     */
    public SimpleConfigForm(String title, GraphicsConfiguration gc) {
        super(title, gc);
        initialize();
    }

    public ResourceBundle getResBundel() {
        return resbundel;
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(getJJMenuBar());
        this.setSize(445, 146);
        this.setContentPane(getJContentPane());
        this.setTitle("jact default Config Manager");
        etm = new AbstractElementTableModel();
        etm.setNewList(Collections.EMPTY_LIST);
        jContentPane.add(getHibernateGridTreePanel(),
                java.awt.BorderLayout.CENTER);

        // createGridPanel();

        initActions();
        
    }

    /**
     * 
     */
    private void initActions() {
        jMenuFile.add(new ActionClose());

//        jMenuChannelConf.add(new ActionSipConf());
//        jMenuChannelConf.add(new ActionMisdnConf());
//        jMenuChannelConf.add(new ActionZaptelConf());
//        jMenuChannelConf.add(new ActionZapataConf());
//        jMenuChannelConf.add(new ActionAgentConf());
//        jMenuChannelConf.add(new ActionIaxConf());
//
//        jMenuDialplanConf.add(new ActionextensionConf());
//        jMenuDialplanConf.add(new ActionFeatureConf());
//
//        jMenuDialplanCommandsConf.add(new ActionVoicemailConf());
//        jMenuDialplanCommandsConf.add(new ActionQueueConf());
//        jMenuDialplanCommandsConf.add(new ActionMeetmeConf());
//        jMenuDialplanCommandsConf.add(new ActionIndicationConf());
//        jMenuDialplanCommandsConf.add(new ActionMusicOnHoldConf());

        // final JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("show
        // grid");
        // cbMenuItem.setAction(new AbstractAction("show grid") {
        //
        // public void actionPerformed(ActionEvent e) {
        // showGrid = !showGrid;
        //
        // if (showGrid) {
        // setCenterPanel(gridPanel);
        // } else {
        // AbstractSimpleTreePanel p = DialogFactory
        // .createTreePanel(etm.get(0));
        //
        // if (p != null) {
        // p.initTree(etm.getList());
        // setCenterPanel(p);
        // }
        // }
        // cbMenuItem.setState(showGrid);
        // }
        //
        // });
        // // jMenuMisc.add(
        // jMenuMisc.add(cbMenuItem);
        // // jMenuMisc.add(new ActionMisdnCardConf());
        // // jMenuMisc.add(new ActionManagerConf());
        // // actionmananger.fillDialogActions(jMenuMisc);
        // // hactionMananger.fillDialogActions(getJMenuMisc());
        // List<Action> aList = new ArrayList<Action>();
        //
        // hactionMananger.fillListActions(aList,
        // new AbstractHibernateActionManager.CallbackHandlerList() {
        //
        // public void setList(List list) {
        // // TODO Automatisch erstellter Methoden-Stub
        // etm.setNewList(list);
        // // setCenterPanel(p);
        // if (!showGrid) {
        // if (list.size() > 0) {
        // AbstractSimpleTreePanel p = DialogFactory
        // .createTreePanel(list.get(0));
        //
        // if (p != null) {
        // p.initTree(list);
        // setCenterPanel(p);
        //
        // }
        // } else
        // setCenterPanel(gridPanel);
        // }
        // }
        //
        // public void cleanSession() {
        // if (HibernateUtil.getSession().isDirty())
        // if (JOptionPane.showConfirmDialog(null, "test",
        // "save ", JOptionPane.OK_CANCEL_OPTION,
        // JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION) {
        // try {
        // HibernateUtil.getSession().flush();
        //
        // } catch (Exception e) {
        // LOGGER.error("cleanSession()", e);
        //
        // HibernateUtil.getSession().close();
        //
        // }
        //
        // }
        // // setCenterPanel(gridPanel);
        // }
        //
        // public void setModelFactory(ModelManagerInterface mmi,
        // String currentType) {
        // mmiterface = mmi;
        // currenType = currentType;
        //
        // }
        //
        // });
        //
        // AbstractHibernateActionManager.fillMenu(getJMenuBar().add(
        // new JMenu("test")), aList);

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
                new JMenu("db")), aList);

        jMenuFile.add(HibernateActionMananger.getFsAction());

        jMenuFile.add(hibernateGridTreePanel.getSaveObject());

        jMenuFile.add(hibernateGridTreePanel.getLcnf());
        jMenuFile.add(hibernateGridTreePanel.getScnf());
        jMenuFile.add(hibernateGridTreePanel.getLxml());
        jMenuFile.add(hibernateGridTreePanel.getSxml());

        if(aList.size()>0){
            aList.get(0).actionPerformed(null);
        }
    }

    /**
     * This method initializes centerPanel
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getCenterPanel() {
        if (centerPanel == null) {
            centerPanel = new JPanel();
            centerPanel.setLayout(new java.awt.BorderLayout());
        }
        return centerPanel;
    }

    /**
     * This method initializes jContentPane
     * 
     * @return javax.swing.JPanel
     */
    private javax.swing.JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new javax.swing.JPanel();
            jContentPane.setLayout(new java.awt.BorderLayout());
            jContentPane.add(getJPanel(), java.awt.BorderLayout.SOUTH);
            // jContentPane.add(getJPanel1(), java.awt.BorderLayout.CENTER);
            jContentPane.add(getCenterPanel(), java.awt.BorderLayout.CENTER);

        }
        return jContentPane;
    }

    /**
     * This method initializes jPanel
     * 
     * @return javax.swing.JPanel
     */
    protected JPanel getJPanel() {
        if (jPanel == null) {
            try {
                FlowLayout flowLayout = new FlowLayout();
                flowLayout.setAlignment(java.awt.FlowLayout.LEFT);
                jPanel = new JPanel();
                jPanel.setLayout(flowLayout);
            } catch (java.lang.Throwable e) {
                LOGGER.error("in init",e);
            }
        }
        return jPanel;
    }

    /*
     * This method initializes jPanel
     * 
     * @return javax.swing.JPanel
     */
    protected JPanel getJPanel1() {
        if (jPanel1 == null) {
            try {
                jPanel1 = new JPanel();
                jPanel1.setLayout(new java.awt.BorderLayout());
            } catch (java.lang.Throwable e) {
                LOGGER.error("in init",e);

            }
        }
        return jPanel;
    }

    /**
     * This method initializes jJMenuBar
     * 
     * @return javax.swing.JMenuBar
     */
    protected JMenuBar getJJMenuBar() {
        if (jJMenuBar == null) {
            try {
                jJMenuBar = new JMenuBar();
                jJMenuBar.add(getJMenuFile());
//                jJMenuBar.add(getJMenuChannelConf());
//                jJMenuBar.add(getJMenuDialplanConf());
//                jJMenuBar.add(getJMenuDialplanCommandsConf());
                jJMenuBar.add(getJMenuMisc());
            } catch (java.lang.Throwable e) {
                LOGGER.error("in init",e);
            }
        }
        return jJMenuBar;
    }

    /**
     * This method initializes jMenu
     * 
     * @return javax.swing.JMenu
     */
    protected JMenu getJMenuFile() {
        if (jMenuFile == null) {
            try {
                jMenuFile = new JMenu("file");
            } catch (java.lang.Throwable e) {
                LOGGER.error("in init",e);
            }
        }
        return jMenuFile;
    }

    /**
     * This method initializes jMenu
     * 
     * @return javax.swing.JMenu
     */
    protected JMenu getJMenuChannelConf() {
        if (jMenuChannelConf == null) {
            try {
                jMenuChannelConf = new JMenu("channels");
            } catch (java.lang.Throwable e) {
                LOGGER.error("in init",e);
            }
        }
        return jMenuChannelConf;
    }

    /**
     * This method initializes jMenu
     * 
     * @return javax.swing.JMenu
     */
    protected JMenu getJMenuDialplanConf() {
        if (jMenuDialplanConf == null) {
            try {
                jMenuDialplanConf = new JMenu("dialplan");
            } catch (java.lang.Throwable e) {
                LOGGER.error("in init",e);
            }
        }
        return jMenuDialplanConf;
    }

    /**
     * This method initializes jMenu
     * 
     * @return javax.swing.JMenu
     */
    protected JMenu getJMenuDialplanCommandsConf() {
        if (jMenuDialplanCommandsConf == null) {
            try {
                jMenuDialplanCommandsConf = new JMenu();
                jMenuDialplanCommandsConf.setText("dial commands");
            } catch (java.lang.Throwable e) {
                LOGGER.error("in init",e);
            }
        }
        return jMenuDialplanCommandsConf;
    }

    private void createGridPanel() {
        gridPanel = new SimpleGridPanel();
        gridPanel.setControll(new GridControll() {

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
            }

            public void newObject() {
                Object object = mmiterface.newObject(currenType);
                etm.add((AbstractSimpleDataClass) object);
            }

        });

        gridPanel.setTableModel(etm);
        setCenterPanel(gridPanel);
    }

    private void setCenterPanel(Component fPanel) {
        // jContentPane.re
        // getjjContentPane.add(fPanel, java.awt.BorderLayout.CENTER);
        getCenterPanel().removeAll();
        getCenterPanel().add(fPanel);
        getCenterPanel().revalidate();
        getCenterPanel().update(getCenterPanel().getGraphics());
    }

    /**
     * This method initializes jMenu
     * 
     * @return javax.swing.JMenu
     */
    protected JMenu getJMenuMisc() {
        if (jMenuMisc == null) {
            try {
                jMenuMisc = new JMenu();
                jMenuMisc.setText("misc");
            } catch (java.lang.Throwable e) {
                LOGGER.error("in init",e);
            }
        }
        return jMenuMisc;
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

} // @jve:decl-index=0:visual-constraint="10,10"
