/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.globalmodel;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;
import javax.swing.JMenu;

import com.useit.app.framework.gui.dbactions.AbstractHibernateActionManager;
import com.useit.app.framework.model.dataModel.ModelManagerInterface;
import com.useit.jact.gui.agentconf.DefaultagentconfTreeDialog;
import com.useit.jact.gui.alarmreciverconf.DefaultalarmreciverconfTreeDialog;
import com.useit.jact.gui.extensionconf.DefaultextensionconfTreeDialog;
import com.useit.jact.gui.featureconf.DefaultfeatureconfTreeDialog;
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
import com.useit.jact.io.globalmodel.HibernateObjectLoader;
import com.useit.jact.model.agentconf.MMFagentconf;
import com.useit.jact.model.alarmreciverconf.MMFalarmreciverconf;
import com.useit.jact.model.extensionconf.MMFextensionconf;
import com.useit.jact.model.featureconf.MMFfeatureconf;
import com.useit.jact.model.iaxconf.MMFiaxconf;
import com.useit.jact.model.indicationsconf.MMFindicationsconf;
import com.useit.jact.model.managerconf.MMFmanagerconf;
import com.useit.jact.model.meetmeconf.MMFmeetmeconf;
import com.useit.jact.model.misdnconf.MMFmisdnconf;
import com.useit.jact.model.misdndriverconf.MMFmisdndriverconf;
import com.useit.jact.model.musiconholdconf.MMFmusiconholdconf;
import com.useit.jact.model.queueconf.MMFqueueconf;
import com.useit.jact.model.sipconf.MMFsipconf;
import com.useit.jact.model.voicemailconf.MMFvoicemailconf;
import com.useit.jact.model.zapataconf.MMFzapataconf;
import com.useit.jact.model.zaptelconf.MMFzaptelconf;

public class HibernateActionMananger extends AbstractHibernateActionManager {
    private ResourceBundle resBundel = ResourceBundle
            .getBundle("resourceBundels/actionMananger");

    // MisdnDriverConf
    public class ActionListmisdndriverconf extends ActionShowList {
        public ActionListmisdndriverconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListmisdndriverconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListmisdndriverconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFmisdndriverconf.MISDNDRIVERCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFmisdndriverconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadmisdndriverconfList();
        }
    }; // end of ActionListmisdndriverconf Declaration

    public class ActionShowmisdndriverconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowmisdndriverconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmisdndriverconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmisdndriverconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmisdndriverconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultmisdndriverconfTreeDialog dlg = DialogFactory
                    .createmisdndriverconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowmisdndriverconfDialog Declaration

    protected ActionShowmisdndriverconfDialog showmisdndriverconfDialog;

    public ActionShowmisdndriverconfDialog getShowmisdndriverconfDialog() {
        return showmisdndriverconfDialog;
    }

    public class ActionSavemisdndriverconf extends AbstractAction {
        private Object obj;

        public ActionSavemisdndriverconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmisdndriverconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavemisdndriverconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavemisdndriverconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavemisdndriverconf Declaration

    public ActionSavemisdndriverconf getSavemisdndriverconf(Object obj) {
        return new ActionSavemisdndriverconf(obj);// savemisdndriverconf;
    }

    // Zapataconf
    public class ActionListzapataconf extends ActionShowList {
        public ActionListzapataconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListzapataconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListzapataconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFzapataconf.ZAPATACONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFzapataconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadzapataconfList();
        }
    }; // end of ActionListzapataconf Declaration

    public class ActionShowzapataconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowzapataconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowzapataconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowzapataconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowzapataconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultzapataconfTreeDialog dlg = DialogFactory
                    .createzapataconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowzapataconfDialog Declaration

    protected ActionShowzapataconfDialog showzapataconfDialog;

    public ActionShowzapataconfDialog getShowzapataconfDialog() {
        return showzapataconfDialog;
    }

    public class ActionSavezapataconf extends AbstractAction {
        private Object obj;

        public ActionSavezapataconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowzapataconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavezapataconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavezapataconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavezapataconf Declaration

    public ActionSavezapataconf getSavezapataconf(Object obj) {
        return new ActionSavezapataconf(obj);// savezapataconf;
    }

    // Indicationsconf
    public class ActionListindicationsconf extends ActionShowList {
        public ActionListindicationsconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListindicationsconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListindicationsconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFindicationsconf.INDICATIONSCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFindicationsconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadindicationsconfList();
        }
    }; // end of ActionListindicationsconf Declaration

    public class ActionShowindicationsconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowindicationsconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowindicationsconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowindicationsconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowindicationsconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultindicationsconfTreeDialog dlg = DialogFactory
                    .createindicationsconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowindicationsconfDialog Declaration

    protected ActionShowindicationsconfDialog showindicationsconfDialog;

    public ActionShowindicationsconfDialog getShowindicationsconfDialog() {
        return showindicationsconfDialog;
    }

    public class ActionSaveindicationsconf extends AbstractAction {
        private Object obj;

        public ActionSaveindicationsconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowindicationsconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSaveindicationsconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSaveindicationsconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSaveindicationsconf Declaration

    public ActionSaveindicationsconf getSaveindicationsconf(Object obj) {
        return new ActionSaveindicationsconf(obj);// saveindicationsconf;
    }

    // Misdnconf
    public class ActionListmisdnconf extends ActionShowList {
        public ActionListmisdnconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListmisdnconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListmisdnconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFmisdnconf.MISDNCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFmisdnconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadmisdnconfList();
        }
    }; // end of ActionListmisdnconf Declaration

    public class ActionShowmisdnconfDialog extends AbstractShowSaveDialogAction {
        public ActionShowmisdnconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmisdnconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmisdnconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmisdnconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultmisdnconfTreeDialog dlg = DialogFactory
                    .createmisdnconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowmisdnconfDialog Declaration

    protected ActionShowmisdnconfDialog showmisdnconfDialog;

    public ActionShowmisdnconfDialog getShowmisdnconfDialog() {
        return showmisdnconfDialog;
    }

    public class ActionSavemisdnconf extends AbstractAction {
        private Object obj;

        public ActionSavemisdnconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmisdnconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavemisdnconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavemisdnconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavemisdnconf Declaration

    public ActionSavemisdnconf getSavemisdnconf(Object obj) {
        return new ActionSavemisdnconf(obj);// savemisdnconf;
    }

    // Zaptelconf
    public class ActionListzaptelconf extends ActionShowList {
        public ActionListzaptelconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListzaptelconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListzaptelconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFzaptelconf.ZAPTELCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFzaptelconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadzaptelconfList();
        }
    }; // end of ActionListzaptelconf Declaration

    public class ActionShowzaptelconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowzaptelconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowzaptelconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowzaptelconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowzaptelconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultzaptelconfTreeDialog dlg = DialogFactory
                    .createzaptelconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowzaptelconfDialog Declaration

    protected ActionShowzaptelconfDialog showzaptelconfDialog;

    public ActionShowzaptelconfDialog getShowzaptelconfDialog() {
        return showzaptelconfDialog;
    }

    public class ActionSavezaptelconf extends AbstractAction {
        private Object obj;

        public ActionSavezaptelconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowzaptelconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavezaptelconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavezaptelconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavezaptelconf Declaration

    public ActionSavezaptelconf getSavezaptelconf(Object obj) {
        return new ActionSavezaptelconf(obj);// savezaptelconf;
    }

    // Iaxgeneral
    public class ActionListiaxconf extends ActionShowList {
        public ActionListiaxconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString("resNameActionListiaxconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListiaxconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFiaxconf.IAXGENERAL;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFiaxconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadiaxconfList();
        }
    }; // end of ActionListiaxconf Declaration

    public class ActionShowiaxconfDialog extends AbstractShowSaveDialogAction {
        public ActionShowiaxconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowiaxconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowiaxconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowiaxconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultiaxconfTreeDialog dlg = DialogFactory
                    .createiaxconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowiaxconfDialog Declaration

    protected ActionShowiaxconfDialog showiaxconfDialog;

    public ActionShowiaxconfDialog getShowiaxconfDialog() {
        return showiaxconfDialog;
    }

    public class ActionSaveiaxconf extends AbstractAction {
        private Object obj;

        public ActionSaveiaxconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowiaxconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSaveiaxconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSaveiaxconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSaveiaxconf Declaration

    public ActionSaveiaxconf getSaveiaxconf(Object obj) {
        return new ActionSaveiaxconf(obj);// saveiaxconf;
    }

    // SipConf
    public class ActionListsipconf extends ActionShowList {
        public ActionListsipconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString("resNameActionListsipconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListsipconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFsipconf.SIPCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFsipconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadsipconfList();
        }
    }; // end of ActionListsipconf Declaration

    public class ActionShowsipconfDialog extends AbstractShowSaveDialogAction {
        public ActionShowsipconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowsipconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowsipconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowsipconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultsipconfTreeDialog dlg = DialogFactory
                    .createsipconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowsipconfDialog Declaration

    protected ActionShowsipconfDialog showsipconfDialog;

    public ActionShowsipconfDialog getShowsipconfDialog() {
        return showsipconfDialog;
    }

    public class ActionSavesipconf extends AbstractAction {
        private Object obj;

        public ActionSavesipconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowsipconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavesipconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavesipconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavesipconf Declaration

    public ActionSavesipconf getSavesipconf(Object obj) {
        return new ActionSavesipconf(obj);// savesipconf;
    }

    // VoicemailConf
    public class ActionListvoicemailconf extends ActionShowList {
        public ActionListvoicemailconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListvoicemailconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListvoicemailconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFvoicemailconf.VOICEMAILCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFvoicemailconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadvoicemailconfList();
        }
    }; // end of ActionListvoicemailconf Declaration

    public class ActionShowvoicemailconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowvoicemailconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowvoicemailconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowvoicemailconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowvoicemailconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultvoicemailconfTreeDialog dlg = DialogFactory
                    .createvoicemailconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowvoicemailconfDialog Declaration

    protected ActionShowvoicemailconfDialog showvoicemailconfDialog;

    public ActionShowvoicemailconfDialog getShowvoicemailconfDialog() {
        return showvoicemailconfDialog;
    }

    public class ActionSavevoicemailconf extends AbstractAction {
        private Object obj;

        public ActionSavevoicemailconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowvoicemailconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavevoicemailconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavevoicemailconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavevoicemailconf Declaration

    public ActionSavevoicemailconf getSavevoicemailconf(Object obj) {
        return new ActionSavevoicemailconf(obj);// savevoicemailconf;
    }

    // Extensionconf
    public class ActionListextensionconf extends ActionShowList {
        public ActionListextensionconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListextensionconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListextensionconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFextensionconf.EXTENSIONCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFextensionconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadextensionconfList();
        }
    }; // end of ActionListextensionconf Declaration

    public class ActionShowextensionconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowextensionconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowextensionconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowextensionconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowextensionconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultextensionconfTreeDialog dlg = DialogFactory
                    .createextensionconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowextensionconfDialog Declaration

    protected ActionShowextensionconfDialog showextensionconfDialog;

    public ActionShowextensionconfDialog getShowextensionconfDialog() {
        return showextensionconfDialog;
    }

    public class ActionSaveextensionconf extends AbstractAction {
        private Object obj;

        public ActionSaveextensionconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowextensionconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSaveextensionconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSaveextensionconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSaveextensionconf Declaration

    public ActionSaveextensionconf getSaveextensionconf(Object obj) {
        return new ActionSaveextensionconf(obj);// saveextensionconf;
    }

    // Queuegeneral
    public class ActionListqueueconf extends ActionShowList {
        public ActionListqueueconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListqueueconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListqueueconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFqueueconf.QUEUEGENERAL;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFqueueconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadqueueconfList();
        }
    }; // end of ActionListqueueconf Declaration

    public class ActionShowqueueconfDialog extends AbstractShowSaveDialogAction {
        public ActionShowqueueconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowqueueconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowqueueconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowqueueconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultqueueconfTreeDialog dlg = DialogFactory
                    .createqueueconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowqueueconfDialog Declaration

    protected ActionShowqueueconfDialog showqueueconfDialog;

    public ActionShowqueueconfDialog getShowqueueconfDialog() {
        return showqueueconfDialog;
    }

    public class ActionSavequeueconf extends AbstractAction {
        private Object obj;

        public ActionSavequeueconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowqueueconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavequeueconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavequeueconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavequeueconf Declaration

    public ActionSavequeueconf getSavequeueconf(Object obj) {
        return new ActionSavequeueconf(obj);// savequeueconf;
    }

    // Agentsconf
    public class ActionListagentconf extends ActionShowList {
        public ActionListagentconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListagentconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListagentconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFagentconf.AGENTSCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFagentconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadagentconfList();
        }
    }; // end of ActionListagentconf Declaration

    public class ActionShowagentconfDialog extends AbstractShowSaveDialogAction {
        public ActionShowagentconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowagentconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowagentconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowagentconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultagentconfTreeDialog dlg = DialogFactory
                    .createagentconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowagentconfDialog Declaration

    protected ActionShowagentconfDialog showagentconfDialog;

    public ActionShowagentconfDialog getShowagentconfDialog() {
        return showagentconfDialog;
    }

    public class ActionSaveagentconf extends AbstractAction {
        private Object obj;

        public ActionSaveagentconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowagentconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSaveagentconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSaveagentconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSaveagentconf Declaration

    public ActionSaveagentconf getSaveagentconf(Object obj) {
        return new ActionSaveagentconf(obj);// saveagentconf;
    }

    // Music_on_HoldConf
    public class ActionListmusiconholdconf extends ActionShowList {
        public ActionListmusiconholdconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListmusiconholdconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListmusiconholdconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFmusiconholdconf.MUSIC_ON_HOLDCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFmusiconholdconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadmusiconholdconfList();
        }
    }; // end of ActionListmusiconholdconf Declaration

    public class ActionShowmusiconholdconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowmusiconholdconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmusiconholdconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmusiconholdconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmusiconholdconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultmusiconholdconfTreeDialog dlg = DialogFactory
                    .createmusiconholdconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowmusiconholdconfDialog Declaration

    protected ActionShowmusiconholdconfDialog showmusiconholdconfDialog;

    public ActionShowmusiconholdconfDialog getShowmusiconholdconfDialog() {
        return showmusiconholdconfDialog;
    }

    public class ActionSavemusiconholdconf extends AbstractAction {
        private Object obj;

        public ActionSavemusiconholdconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmusiconholdconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavemusiconholdconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavemusiconholdconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavemusiconholdconf Declaration

    public ActionSavemusiconholdconf getSavemusiconholdconf(Object obj) {
        return new ActionSavemusiconholdconf(obj);// savemusiconholdconf;
    }

    // Meetmeconf
    public class ActionListmeetmeconf extends ActionShowList {
        public ActionListmeetmeconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListmeetmeconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListmeetmeconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFmeetmeconf.MEETMECONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFmeetmeconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadmeetmeconfList();
        }
    }; // end of ActionListmeetmeconf Declaration

    public class ActionShowmeetmeconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowmeetmeconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmeetmeconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmeetmeconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmeetmeconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultmeetmeconfTreeDialog dlg = DialogFactory
                    .createmeetmeconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowmeetmeconfDialog Declaration

    protected ActionShowmeetmeconfDialog showmeetmeconfDialog;

    public ActionShowmeetmeconfDialog getShowmeetmeconfDialog() {
        return showmeetmeconfDialog;
    }

    public class ActionSavemeetmeconf extends AbstractAction {
        private Object obj;

        public ActionSavemeetmeconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmeetmeconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavemeetmeconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavemeetmeconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavemeetmeconf Declaration

    public ActionSavemeetmeconf getSavemeetmeconf(Object obj) {
        return new ActionSavemeetmeconf(obj);// savemeetmeconf;
    }

    // Alarmreceiverconf
    public class ActionListalarmreciverconf extends ActionShowList {
        public ActionListalarmreciverconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListalarmreciverconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListalarmreciverconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFalarmreciverconf.ALARMRECEIVERCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFalarmreciverconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadalarmreciverconfList();
        }
    }; // end of ActionListalarmreciverconf Declaration

    public class ActionShowalarmreciverconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowalarmreciverconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowalarmreciverconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowalarmreciverconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowalarmreciverconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultalarmreciverconfTreeDialog dlg = DialogFactory
                    .createalarmreciverconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowalarmreciverconfDialog Declaration

    protected ActionShowalarmreciverconfDialog showalarmreciverconfDialog;

    public ActionShowalarmreciverconfDialog getShowalarmreciverconfDialog() {
        return showalarmreciverconfDialog;
    }

    public class ActionSavealarmreciverconf extends AbstractAction {
        private Object obj;

        public ActionSavealarmreciverconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowalarmreciverconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavealarmreciverconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavealarmreciverconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavealarmreciverconf Declaration

    public ActionSavealarmreciverconf getSavealarmreciverconf(Object obj) {
        return new ActionSavealarmreciverconf(obj);// savealarmreciverconf;
    }

    // Featuresconf
    public class ActionListfeatureconf extends ActionShowList {
        public ActionListfeatureconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListfeatureconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListfeatureconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFfeatureconf.FEATURESCONF;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFfeatureconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadfeatureconfList();
        }
    }; // end of ActionListfeatureconf Declaration

    public class ActionShowfeatureconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowfeatureconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowfeatureconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowfeatureconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowfeatureconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultfeatureconfTreeDialog dlg = DialogFactory
                    .createfeatureconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowfeatureconfDialog Declaration

    protected ActionShowfeatureconfDialog showfeatureconfDialog;

    public ActionShowfeatureconfDialog getShowfeatureconfDialog() {
        return showfeatureconfDialog;
    }

    public class ActionSavefeatureconf extends AbstractAction {
        private Object obj;

        public ActionSavefeatureconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowfeatureconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavefeatureconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavefeatureconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavefeatureconf Declaration

    public ActionSavefeatureconf getSavefeatureconf(Object obj) {
        return new ActionSavefeatureconf(obj);// savefeatureconf;
    }

    // ManagergeneralSection
    public class ActionListmanagerconf extends ActionShowList {
        public ActionListmanagerconf(CallbackHandlerList callbackhandler) {
            super(callbackhandler);
            putValue(NAME, getResBundel().getString(
                    "resNameActionListmanagerconf"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionListmanagerconf"));
            putValue(ACTION_COMMAND_KEY, "ActionListExtensionConf");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected String getCurrentType() {
            return MMFmanagerconf.MANAGERGENERALSECTION;
        }

        protected ModelManagerInterface getModelFactory() {
            return MMFmanagerconf.getInstance();
        }

        protected List getList() {
            return HibernateObjectLoader.loadmanagerconfList();
        }
    }; // end of ActionListmanagerconf Declaration

    public class ActionShowmanagerconfDialog extends
            AbstractShowSaveDialogAction {
        public ActionShowmanagerconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmanagerconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmanagerconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmanagerconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        protected Object showDialog() {
            DefaultmanagerconfTreeDialog dlg = DialogFactory
                    .createmanagerconfTreeDialog();
            dlg.setVisible(true);
            return dlg.getData();
        }

    }; // end of ActionShowmanagerconfDialog Declaration

    protected ActionShowmanagerconfDialog showmanagerconfDialog;

    public ActionShowmanagerconfDialog getShowmanagerconfDialog() {
        return showmanagerconfDialog;
    }

    public class ActionSavemanagerconf extends AbstractAction {
        private Object obj;

        public ActionSavemanagerconf(Object obj) {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmanagerconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionSavemanagerconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionSavemanagerconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
            this.obj = obj;
        }

        public void actionPerformed(ActionEvent arg0) {
            saveObject(this.obj);

        }

    }; // end of ActionSavemanagerconf Declaration

    public ActionSavemanagerconf getSavemanagerconf(Object obj) {
        return new ActionSavemanagerconf(obj);// savemanagerconf;
    }

    /**
     * initalisiert die Actionen
     * 
     */
    protected void initActions() {
        showqueueconfDialog = new ActionShowqueueconfDialog();
        // showqueueconfPanel = new ActionShowqueueconfPanel();
        showsipconfDialog = new ActionShowsipconfDialog();
        // showsipconfPanel = new ActionShowsipconfPanel();
        showmanagerconfDialog = new ActionShowmanagerconfDialog();
        // showmanagerconfPanel = new ActionShowmanagerconfPanel();
        showalarmreciverconfDialog = new ActionShowalarmreciverconfDialog();
        // showalarmreciverconfPanel = new ActionShowalarmreciverconfPanel();
        showagentconfDialog = new ActionShowagentconfDialog();
        // showagentconfPanel = new ActionShowagentconfPanel();
        showzaptelconfDialog = new ActionShowzaptelconfDialog();
        // showzaptelconfPanel = new ActionShowzaptelconfPanel();
        showiaxconfDialog = new ActionShowiaxconfDialog();
        // showiaxconfPanel = new ActionShowiaxconfPanel();
        showzapataconfDialog = new ActionShowzapataconfDialog();
        // showzapataconfPanel = new ActionShowzapataconfPanel();
        showmeetmeconfDialog = new ActionShowmeetmeconfDialog();
        // showmeetmeconfPanel = new ActionShowmeetmeconfPanel();
        showvoicemailconfDialog = new ActionShowvoicemailconfDialog();
        // showvoicemailconfPanel = new ActionShowvoicemailconfPanel();
        showmusiconholdconfDialog = new ActionShowmusiconholdconfDialog();
        // showmusiconholdconfPanel = new ActionShowmusiconholdconfPanel();
        showfeatureconfDialog = new ActionShowfeatureconfDialog();
        // showfeatureconfPanel = new ActionShowfeatureconfPanel();
        showindicationsconfDialog = new ActionShowindicationsconfDialog();
        // showindicationsconfPanel = new ActionShowindicationsconfPanel();
        showmisdndriverconfDialog = new ActionShowmisdndriverconfDialog();
        // showmisdndriverconfPanel = new ActionShowmisdndriverconfPanel();
        showmisdnconfDialog = new ActionShowmisdnconfDialog();
        // showmisdnconfPanel = new ActionShowmisdnconfPanel();
        showextensionconfDialog = new ActionShowextensionconfDialog();
        // showextensionconfPanel = new ActionShowextensionconfPanel();
    }

    public void fillDialogActions(JMenu m) {
        m.add(showqueueconfDialog);
        m.add(showsipconfDialog);
        m.add(showmanagerconfDialog);
        m.add(showalarmreciverconfDialog);
        m.add(showagentconfDialog);
        m.add(showzaptelconfDialog);
        m.add(showiaxconfDialog);
        m.add(showzapataconfDialog);
        m.add(showmeetmeconfDialog);
        m.add(showvoicemailconfDialog);
        m.add(showmusiconholdconfDialog);
        m.add(showfeatureconfDialog);
        m.add(showindicationsconfDialog);
        m.add(showmisdndriverconfDialog);
        m.add(showmisdnconfDialog);
        m.add(showextensionconfDialog);
    }

    public void fillListActions(List aList, CallbackHandlerList chandler) {
        aList.add(new ActionListqueueconf(chandler));
        aList.add(new ActionListsipconf(chandler));
        aList.add(new ActionListmanagerconf(chandler));
        aList.add(new ActionListalarmreciverconf(chandler));
        aList.add(new ActionListagentconf(chandler));
        aList.add(new ActionListzaptelconf(chandler));
        aList.add(new ActionListiaxconf(chandler));
        aList.add(new ActionListzapataconf(chandler));
        aList.add(new ActionListmeetmeconf(chandler));
        aList.add(new ActionListvoicemailconf(chandler));
        aList.add(new ActionListmusiconholdconf(chandler));
        aList.add(new ActionListfeatureconf(chandler));
        aList.add(new ActionListindicationsconf(chandler));
        aList.add(new ActionListmisdndriverconf(chandler));
        aList.add(new ActionListmisdnconf(chandler));
        aList.add(new ActionListextensionconf(chandler));
    }

    public HibernateActionMananger() {
        super();
        initActions();
    }

    public ResourceBundle getResBundel() {
        return resBundel;
    }

}
