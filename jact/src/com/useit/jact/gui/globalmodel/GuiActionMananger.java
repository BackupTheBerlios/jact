/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.globalmodel;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;
import javax.swing.JMenu;

import com.useit.app.framework.gui.actionController.AbstractGuiActionManager;
import com.useit.jact.gui.agentconf.DefaultagentconfTreeDialog;
import com.useit.jact.gui.agentconf.SimpleagentconfTreePanel;
import com.useit.jact.gui.alarmreciverconf.DefaultalarmreciverconfTreeDialog;
import com.useit.jact.gui.alarmreciverconf.SimplealarmreciverconfTreePanel;
import com.useit.jact.gui.extensionconf.DefaultextensionconfTreeDialog;
import com.useit.jact.gui.extensionconf.SimpleextensionconfTreePanel;
import com.useit.jact.gui.featureconf.DefaultfeatureconfTreeDialog;
import com.useit.jact.gui.featureconf.SimplefeatureconfTreePanel;
import com.useit.jact.gui.iaxconf.DefaultiaxconfTreeDialog;
import com.useit.jact.gui.iaxconf.SimpleiaxconfTreePanel;
import com.useit.jact.gui.indicationsconf.DefaultindicationsconfTreeDialog;
import com.useit.jact.gui.indicationsconf.SimpleindicationsconfTreePanel;
import com.useit.jact.gui.managerconf.DefaultmanagerconfTreeDialog;
import com.useit.jact.gui.managerconf.SimplemanagerconfTreePanel;
import com.useit.jact.gui.meetmeconf.DefaultmeetmeconfTreeDialog;
import com.useit.jact.gui.meetmeconf.SimplemeetmeconfTreePanel;
import com.useit.jact.gui.misdnconf.DefaultmisdnconfTreeDialog;
import com.useit.jact.gui.misdnconf.SimplemisdnconfTreePanel;
import com.useit.jact.gui.misdndriverconf.DefaultmisdndriverconfTreeDialog;
import com.useit.jact.gui.misdndriverconf.SimplemisdndriverconfTreePanel;
import com.useit.jact.gui.musiconholdconf.DefaultmusiconholdconfTreeDialog;
import com.useit.jact.gui.musiconholdconf.SimplemusiconholdconfTreePanel;
import com.useit.jact.gui.queueconf.DefaultqueueconfTreeDialog;
import com.useit.jact.gui.queueconf.SimplequeueconfTreePanel;
import com.useit.jact.gui.sipconf.DefaultsipconfTreeDialog;
import com.useit.jact.gui.sipconf.SimplesipconfTreePanel;
import com.useit.jact.gui.voicemailconf.DefaultvoicemailconfTreeDialog;
import com.useit.jact.gui.voicemailconf.SimplevoicemailconfTreePanel;
import com.useit.jact.gui.zapataconf.DefaultzapataconfTreeDialog;
import com.useit.jact.gui.zapataconf.SimplezapataconfTreePanel;
import com.useit.jact.gui.zaptelconf.DefaultzaptelconfTreeDialog;
import com.useit.jact.gui.zaptelconf.SimplezaptelconfTreePanel;

public class GuiActionMananger extends AbstractGuiActionManager {
    private ResourceBundle resBundel = ResourceBundle
            .getBundle("resourceBundels/actionMananger");

    public GuiActionMananger() {
        super();
        initActions();
    }

    public ResourceBundle getResBundel() {
        return resBundel;
    }

    public class ActionShowextensionconfDialog extends AbstractAction {
        public ActionShowextensionconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowextensionconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowextensionconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowextensionconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultextensionconfTreeDialog dlg = DialogFactory
                    .createextensionconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowextensionconfDialog Declaration

    protected ActionShowextensionconfDialog showextensionconfDialog;

    public ActionShowextensionconfDialog getShowextensionconfDialog() {
        return showextensionconfDialog;
    }

    public class ActionShowextensionconfPanel extends AbstractAction {
        public ActionShowextensionconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowextensionconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowextensionconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowextensionconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimpleextensionconfTreePanel p = DialogFactory
                    .createextensionconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowextensionconfPanel Declaration

    protected ActionShowextensionconfPanel showextensionconfPanel;

    public ActionShowextensionconfPanel getShowextensionconfPanel() {
        return showextensionconfPanel;
    }

    public class ActionShowsipconfDialog extends AbstractAction {
        public ActionShowsipconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowsipconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowsipconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowsipconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultsipconfTreeDialog dlg = DialogFactory
                    .createsipconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowsipconfDialog Declaration

    protected ActionShowsipconfDialog showsipconfDialog;

    public ActionShowsipconfDialog getShowsipconfDialog() {
        return showsipconfDialog;
    }

    public class ActionShowsipconfPanel extends AbstractAction {
        public ActionShowsipconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowsipconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowsipconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowsipconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplesipconfTreePanel p = DialogFactory
                    .createsipconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowsipconfPanel Declaration

    protected ActionShowsipconfPanel showsipconfPanel;

    public ActionShowsipconfPanel getShowsipconfPanel() {
        return showsipconfPanel;
    }

    public class ActionShowvoicemailconfDialog extends AbstractAction {
        public ActionShowvoicemailconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowvoicemailconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowvoicemailconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowvoicemailconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultvoicemailconfTreeDialog dlg = DialogFactory
                    .createvoicemailconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowvoicemailconfDialog Declaration

    protected ActionShowvoicemailconfDialog showvoicemailconfDialog;

    public ActionShowvoicemailconfDialog getShowvoicemailconfDialog() {
        return showvoicemailconfDialog;
    }

    public class ActionShowvoicemailconfPanel extends AbstractAction {
        public ActionShowvoicemailconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowvoicemailconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowvoicemailconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowvoicemailconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplevoicemailconfTreePanel p = DialogFactory
                    .createvoicemailconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowvoicemailconfPanel Declaration

    protected ActionShowvoicemailconfPanel showvoicemailconfPanel;

    public ActionShowvoicemailconfPanel getShowvoicemailconfPanel() {
        return showvoicemailconfPanel;
    }

    public class ActionShowqueueconfDialog extends AbstractAction {
        public ActionShowqueueconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowqueueconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowqueueconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowqueueconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultqueueconfTreeDialog dlg = DialogFactory
                    .createqueueconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowqueueconfDialog Declaration

    protected ActionShowqueueconfDialog showqueueconfDialog;

    public ActionShowqueueconfDialog getShowqueueconfDialog() {
        return showqueueconfDialog;
    }

    public class ActionShowqueueconfPanel extends AbstractAction {
        public ActionShowqueueconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowqueueconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowqueueconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowqueueconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplequeueconfTreePanel p = DialogFactory
                    .createqueueconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowqueueconfPanel Declaration

    protected ActionShowqueueconfPanel showqueueconfPanel;

    public ActionShowqueueconfPanel getShowqueueconfPanel() {
        return showqueueconfPanel;
    }

    public class ActionShowagentconfDialog extends AbstractAction {
        public ActionShowagentconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowagentconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowagentconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowagentconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultagentconfTreeDialog dlg = DialogFactory
                    .createagentconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowagentconfDialog Declaration

    protected ActionShowagentconfDialog showagentconfDialog;

    public ActionShowagentconfDialog getShowagentconfDialog() {
        return showagentconfDialog;
    }

    public class ActionShowagentconfPanel extends AbstractAction {
        public ActionShowagentconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowagentconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowagentconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowagentconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimpleagentconfTreePanel p = DialogFactory
                    .createagentconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowagentconfPanel Declaration

    protected ActionShowagentconfPanel showagentconfPanel;

    public ActionShowagentconfPanel getShowagentconfPanel() {
        return showagentconfPanel;
    }

    public class ActionShowalarmreciverconfDialog extends AbstractAction {
        public ActionShowalarmreciverconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowalarmreciverconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowalarmreciverconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowalarmreciverconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultalarmreciverconfTreeDialog dlg = DialogFactory
                    .createalarmreciverconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowalarmreciverconfDialog Declaration

    protected ActionShowalarmreciverconfDialog showalarmreciverconfDialog;

    public ActionShowalarmreciverconfDialog getShowalarmreciverconfDialog() {
        return showalarmreciverconfDialog;
    }

    public class ActionShowalarmreciverconfPanel extends AbstractAction {
        public ActionShowalarmreciverconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowalarmreciverconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowalarmreciverconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowalarmreciverconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplealarmreciverconfTreePanel p = DialogFactory
                    .createalarmreciverconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowalarmreciverconfPanel Declaration

    protected ActionShowalarmreciverconfPanel showalarmreciverconfPanel;

    public ActionShowalarmreciverconfPanel getShowalarmreciverconfPanel() {
        return showalarmreciverconfPanel;
    }

    public class ActionShowmisdndriverconfDialog extends AbstractAction {
        public ActionShowmisdndriverconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmisdndriverconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmisdndriverconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmisdndriverconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultmisdndriverconfTreeDialog dlg = DialogFactory
                    .createmisdndriverconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowmisdndriverconfDialog Declaration

    protected ActionShowmisdndriverconfDialog showmisdndriverconfDialog;

    public ActionShowmisdndriverconfDialog getShowmisdndriverconfDialog() {
        return showmisdndriverconfDialog;
    }

    public class ActionShowmisdndriverconfPanel extends AbstractAction {
        public ActionShowmisdndriverconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmisdndriverconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmisdndriverconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmisdndriverconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplemisdndriverconfTreePanel p = DialogFactory
                    .createmisdndriverconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowmisdndriverconfPanel Declaration

    protected ActionShowmisdndriverconfPanel showmisdndriverconfPanel;

    public ActionShowmisdndriverconfPanel getShowmisdndriverconfPanel() {
        return showmisdndriverconfPanel;
    }

    public class ActionShowzapataconfDialog extends AbstractAction {
        public ActionShowzapataconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowzapataconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowzapataconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowzapataconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultzapataconfTreeDialog dlg = DialogFactory
                    .createzapataconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowzapataconfDialog Declaration

    protected ActionShowzapataconfDialog showzapataconfDialog;

    public ActionShowzapataconfDialog getShowzapataconfDialog() {
        return showzapataconfDialog;
    }

    public class ActionShowzapataconfPanel extends AbstractAction {
        public ActionShowzapataconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowzapataconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowzapataconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowzapataconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplezapataconfTreePanel p = DialogFactory
                    .createzapataconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowzapataconfPanel Declaration

    protected ActionShowzapataconfPanel showzapataconfPanel;

    public ActionShowzapataconfPanel getShowzapataconfPanel() {
        return showzapataconfPanel;
    }

    public class ActionShowfeatureconfDialog extends AbstractAction {
        public ActionShowfeatureconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowfeatureconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowfeatureconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowfeatureconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultfeatureconfTreeDialog dlg = DialogFactory
                    .createfeatureconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowfeatureconfDialog Declaration

    protected ActionShowfeatureconfDialog showfeatureconfDialog;

    public ActionShowfeatureconfDialog getShowfeatureconfDialog() {
        return showfeatureconfDialog;
    }

    public class ActionShowfeatureconfPanel extends AbstractAction {
        public ActionShowfeatureconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowfeatureconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowfeatureconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowfeatureconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplefeatureconfTreePanel p = DialogFactory
                    .createfeatureconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowfeatureconfPanel Declaration

    protected ActionShowfeatureconfPanel showfeatureconfPanel;

    public ActionShowfeatureconfPanel getShowfeatureconfPanel() {
        return showfeatureconfPanel;
    }

    public class ActionShowindicationsconfDialog extends AbstractAction {
        public ActionShowindicationsconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowindicationsconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowindicationsconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowindicationsconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultindicationsconfTreeDialog dlg = DialogFactory
                    .createindicationsconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowindicationsconfDialog Declaration

    protected ActionShowindicationsconfDialog showindicationsconfDialog;

    public ActionShowindicationsconfDialog getShowindicationsconfDialog() {
        return showindicationsconfDialog;
    }

    public class ActionShowindicationsconfPanel extends AbstractAction {
        public ActionShowindicationsconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowindicationsconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowindicationsconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowindicationsconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimpleindicationsconfTreePanel p = DialogFactory
                    .createindicationsconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowindicationsconfPanel Declaration

    protected ActionShowindicationsconfPanel showindicationsconfPanel;

    public ActionShowindicationsconfPanel getShowindicationsconfPanel() {
        return showindicationsconfPanel;
    }

    public class ActionShowmanagerconfDialog extends AbstractAction {
        public ActionShowmanagerconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmanagerconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmanagerconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmanagerconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultmanagerconfTreeDialog dlg = DialogFactory
                    .createmanagerconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowmanagerconfDialog Declaration

    protected ActionShowmanagerconfDialog showmanagerconfDialog;

    public ActionShowmanagerconfDialog getShowmanagerconfDialog() {
        return showmanagerconfDialog;
    }

    public class ActionShowmanagerconfPanel extends AbstractAction {
        public ActionShowmanagerconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmanagerconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmanagerconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmanagerconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplemanagerconfTreePanel p = DialogFactory
                    .createmanagerconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowmanagerconfPanel Declaration

    protected ActionShowmanagerconfPanel showmanagerconfPanel;

    public ActionShowmanagerconfPanel getShowmanagerconfPanel() {
        return showmanagerconfPanel;
    }

    public class ActionShowmusiconholdconfDialog extends AbstractAction {
        public ActionShowmusiconholdconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmusiconholdconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmusiconholdconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmusiconholdconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultmusiconholdconfTreeDialog dlg = DialogFactory
                    .createmusiconholdconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowmusiconholdconfDialog Declaration

    protected ActionShowmusiconholdconfDialog showmusiconholdconfDialog;

    public ActionShowmusiconholdconfDialog getShowmusiconholdconfDialog() {
        return showmusiconholdconfDialog;
    }

    public class ActionShowmusiconholdconfPanel extends AbstractAction {
        public ActionShowmusiconholdconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmusiconholdconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmusiconholdconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmusiconholdconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplemusiconholdconfTreePanel p = DialogFactory
                    .createmusiconholdconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowmusiconholdconfPanel Declaration

    protected ActionShowmusiconholdconfPanel showmusiconholdconfPanel;

    public ActionShowmusiconholdconfPanel getShowmusiconholdconfPanel() {
        return showmusiconholdconfPanel;
    }

    public class ActionShowzaptelconfDialog extends AbstractAction {
        public ActionShowzaptelconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowzaptelconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowzaptelconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowzaptelconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultzaptelconfTreeDialog dlg = DialogFactory
                    .createzaptelconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowzaptelconfDialog Declaration

    protected ActionShowzaptelconfDialog showzaptelconfDialog;

    public ActionShowzaptelconfDialog getShowzaptelconfDialog() {
        return showzaptelconfDialog;
    }

    public class ActionShowzaptelconfPanel extends AbstractAction {
        public ActionShowzaptelconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowzaptelconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowzaptelconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowzaptelconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplezaptelconfTreePanel p = DialogFactory
                    .createzaptelconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowzaptelconfPanel Declaration

    protected ActionShowzaptelconfPanel showzaptelconfPanel;

    public ActionShowzaptelconfPanel getShowzaptelconfPanel() {
        return showzaptelconfPanel;
    }

    public class ActionShowmisdnconfDialog extends AbstractAction {
        public ActionShowmisdnconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmisdnconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmisdnconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmisdnconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultmisdnconfTreeDialog dlg = DialogFactory
                    .createmisdnconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowmisdnconfDialog Declaration

    protected ActionShowmisdnconfDialog showmisdnconfDialog;

    public ActionShowmisdnconfDialog getShowmisdnconfDialog() {
        return showmisdnconfDialog;
    }

    public class ActionShowmisdnconfPanel extends AbstractAction {
        public ActionShowmisdnconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmisdnconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmisdnconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmisdnconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplemisdnconfTreePanel p = DialogFactory
                    .createmisdnconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowmisdnconfPanel Declaration

    protected ActionShowmisdnconfPanel showmisdnconfPanel;

    public ActionShowmisdnconfPanel getShowmisdnconfPanel() {
        return showmisdnconfPanel;
    }

    public class ActionShowiaxconfDialog extends AbstractAction {
        public ActionShowiaxconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowiaxconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowiaxconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowiaxconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultiaxconfTreeDialog dlg = DialogFactory
                    .createiaxconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowiaxconfDialog Declaration

    protected ActionShowiaxconfDialog showiaxconfDialog;

    public ActionShowiaxconfDialog getShowiaxconfDialog() {
        return showiaxconfDialog;
    }

    public class ActionShowiaxconfPanel extends AbstractAction {
        public ActionShowiaxconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowiaxconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowiaxconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowiaxconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimpleiaxconfTreePanel p = DialogFactory
                    .createiaxconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowiaxconfPanel Declaration

    protected ActionShowiaxconfPanel showiaxconfPanel;

    public ActionShowiaxconfPanel getShowiaxconfPanel() {
        return showiaxconfPanel;
    }

    public class ActionShowmeetmeconfDialog extends AbstractAction {
        public ActionShowmeetmeconfDialog() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmeetmeconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmeetmeconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmeetmeconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            DefaultmeetmeconfTreeDialog dlg = DialogFactory
                    .createmeetmeconfTreeDialog();
            dlg.setVisible(true);

        }

    }; // end of ActionShowmeetmeconfDialog Declaration

    protected ActionShowmeetmeconfDialog showmeetmeconfDialog;

    public ActionShowmeetmeconfDialog getShowmeetmeconfDialog() {
        return showmeetmeconfDialog;
    }

    public class ActionShowmeetmeconfPanel extends AbstractAction {
        public ActionShowmeetmeconfPanel() {
            super();
            putValue(NAME, getResBundel().getString(
                    "resNameActionShowmeetmeconfDialog"));
            putValue(SHORT_DESCRIPTION, getResBundel().getString(
                    "resDescActionShowmeetmeconfDialog"));
            putValue(ACTION_COMMAND_KEY, "ActionShowmeetmeconfDialog");
            putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));

        }

        public void actionPerformed(ActionEvent arg0) {
            SimplemeetmeconfTreePanel p = DialogFactory
                    .createmeetmeconfTreePanelAndModel();
            callbackhandler.setDataObject(p.getData());
            callbackhandler.getContainer().removeAll();
            callbackhandler.getContainer().add(p);
            callbackhandler.getContainer().validate();
        }

    }; // end of ActionShowmeetmeconfPanel Declaration

    protected ActionShowmeetmeconfPanel showmeetmeconfPanel;

    public ActionShowmeetmeconfPanel getShowmeetmeconfPanel() {
        return showmeetmeconfPanel;
    }

    /**
     * initalisiert die Actionen
     * 
     */
    protected void initActions() {
        showextensionconfDialog = new ActionShowextensionconfDialog();
        showextensionconfPanel = new ActionShowextensionconfPanel();
        showsipconfDialog = new ActionShowsipconfDialog();
        showsipconfPanel = new ActionShowsipconfPanel();
        showvoicemailconfDialog = new ActionShowvoicemailconfDialog();
        showvoicemailconfPanel = new ActionShowvoicemailconfPanel();
        showqueueconfDialog = new ActionShowqueueconfDialog();
        showqueueconfPanel = new ActionShowqueueconfPanel();
        showagentconfDialog = new ActionShowagentconfDialog();
        showagentconfPanel = new ActionShowagentconfPanel();
        showalarmreciverconfDialog = new ActionShowalarmreciverconfDialog();
        showalarmreciverconfPanel = new ActionShowalarmreciverconfPanel();
        showmisdndriverconfDialog = new ActionShowmisdndriverconfDialog();
        showmisdndriverconfPanel = new ActionShowmisdndriverconfPanel();
        showzapataconfDialog = new ActionShowzapataconfDialog();
        showzapataconfPanel = new ActionShowzapataconfPanel();
        showfeatureconfDialog = new ActionShowfeatureconfDialog();
        showfeatureconfPanel = new ActionShowfeatureconfPanel();
        showindicationsconfDialog = new ActionShowindicationsconfDialog();
        showindicationsconfPanel = new ActionShowindicationsconfPanel();
        showmanagerconfDialog = new ActionShowmanagerconfDialog();
        showmanagerconfPanel = new ActionShowmanagerconfPanel();
        showmusiconholdconfDialog = new ActionShowmusiconholdconfDialog();
        showmusiconholdconfPanel = new ActionShowmusiconholdconfPanel();
        showzaptelconfDialog = new ActionShowzaptelconfDialog();
        showzaptelconfPanel = new ActionShowzaptelconfPanel();
        showmisdnconfDialog = new ActionShowmisdnconfDialog();
        showmisdnconfPanel = new ActionShowmisdnconfPanel();
        showiaxconfDialog = new ActionShowiaxconfDialog();
        showiaxconfPanel = new ActionShowiaxconfPanel();
        showmeetmeconfDialog = new ActionShowmeetmeconfDialog();
        showmeetmeconfPanel = new ActionShowmeetmeconfPanel();
    }

    public void fillDialogActions(JMenu m) {
        m.add(showextensionconfDialog);
        m.add(showsipconfDialog);
        m.add(showvoicemailconfDialog);
        m.add(showqueueconfDialog);
        m.add(showagentconfDialog);
        m.add(showalarmreciverconfDialog);
        m.add(showmisdndriverconfDialog);
        m.add(showzapataconfDialog);
        m.add(showfeatureconfDialog);
        m.add(showindicationsconfDialog);
        m.add(showmanagerconfDialog);
        m.add(showmusiconholdconfDialog);
        m.add(showzaptelconfDialog);
        m.add(showmisdnconfDialog);
        m.add(showiaxconfDialog);
        m.add(showmeetmeconfDialog);
    }

    public void fillPanelActions(JMenu m) {
        m.add(showextensionconfPanel);
        m.add(showsipconfPanel);
        m.add(showvoicemailconfPanel);
        m.add(showqueueconfPanel);
        m.add(showagentconfPanel);
        m.add(showalarmreciverconfPanel);
        m.add(showmisdndriverconfPanel);
        m.add(showzapataconfPanel);
        m.add(showfeatureconfPanel);
        m.add(showindicationsconfPanel);
        m.add(showmanagerconfPanel);
        m.add(showmusiconholdconfPanel);
        m.add(showzaptelconfPanel);
        m.add(showmisdnconfPanel);
        m.add(showiaxconfPanel);
        m.add(showmeetmeconfPanel);
    }

}
