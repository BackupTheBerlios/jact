/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.globalmodel;

import java.awt.Dialog;
import java.awt.Frame;

import com.useit.app.framework.gui.dialogs.AbstractSimpleDataObjectTreeDialog;
import com.useit.app.framework.gui.guiHelper.AbstractSimpleTreePanel;
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
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.featureconf.Featuresconf;
import com.useit.jact.model.globalmodel.ModelFactory;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.misdnconf.Misdnconf;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;
import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.zapataconf.Zapataconf;
import com.useit.jact.model.zaptelconf.Zaptelconf;

// misdndriverconf : MisdnDriverConf
// zapataconf : Zapataconf
// indicationsconf : Indicationsconf
// misdnconf : Misdnconf
// zaptelconf : Zaptelconf
// iaxconf : Iaxgeneral
// sipconf : SipConf
// voicemailconf : VoicemailConf
// extensionconf : Extensionconf
// queueconf : Queuegeneral
// agentconf : Agentsconf
// musiconholdconf : Music_on_HoldConf
// meetmeconf : Meetmeconf
// alarmreciverconf : Alarmreceiverconf
// featureconf : Featuresconf
// managerconf : ManagergeneralSection

public class DialogFactory {

    /**
     * erzeugt ein tree panel nach dem model
     * 
     * @return AbstractSimpleTreePanel
     */
    public static AbstractSimpleTreePanel createTreePanel(Object object) {
        if (object instanceof MisdnDriverConf) {
            AbstractSimpleTreePanel p = createmisdndriverconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Zapataconf) {
            AbstractSimpleTreePanel p = createzapataconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Indicationsconf) {
            AbstractSimpleTreePanel p = createindicationsconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Misdnconf) {
            AbstractSimpleTreePanel p = createmisdnconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Zaptelconf) {
            AbstractSimpleTreePanel p = createzaptelconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Iaxgeneral) {
            AbstractSimpleTreePanel p = createiaxconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof SipConf) {
            AbstractSimpleTreePanel p = createsipconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof VoicemailConf) {
            AbstractSimpleTreePanel p = createvoicemailconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Extensionconf) {
            AbstractSimpleTreePanel p = createextensionconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Queuegeneral) {
            AbstractSimpleTreePanel p = createqueueconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Agentsconf) {
            AbstractSimpleTreePanel p = createagentconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Music_on_HoldConf) {
            AbstractSimpleTreePanel p = createmusiconholdconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Meetmeconf) {
            AbstractSimpleTreePanel p = createmeetmeconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Alarmreceiverconf) {
            AbstractSimpleTreePanel p = createalarmreciverconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof Featuresconf) {
            AbstractSimpleTreePanel p = createfeatureconfTreePanel();
            p.initTree(object);
            return p;
        }
        if (object instanceof ManagergeneralSection) {
            AbstractSimpleTreePanel p = createmanagerconfTreePanel();
            p.initTree(object);
            return p;
        }
        AbstractSimpleTreePanel panel = null;

        panel = com.useit.jact.gui.iaxconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.misdndriverconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.zapataconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.queueconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.musiconholdconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.featureconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.zaptelconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.alarmreciverconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.voicemailconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.managerconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.extensionconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.agentconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.indicationsconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.misdnconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.sipconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        panel = com.useit.jact.gui.meetmeconf.GuiClassFactory
                .createTreePanel(object);
        if (panel != null)
            return panel;

        return null;
    }

    /**
     * erzeugt ein dialog und initalisiert ihn
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleDataObjectTreeDialog createTreeDialog(Object obj) {
        if (obj instanceof MisdnDriverConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Zapataconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Indicationsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Misdnconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Zaptelconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Iaxgeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof SipConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof VoicemailConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Extensionconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Queuegeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Agentsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Music_on_HoldConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmusiconholdconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Meetmeconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmeetmeconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Alarmreceiverconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultalarmreciverconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Featuresconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultfeatureconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof ManagergeneralSection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    obj);
            return p;
        }
        AbstractSimpleDataObjectTreeDialog dlg = null;

        dlg = com.useit.jact.gui.iaxconf.GuiClassFactory.createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.misdndriverconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.zapataconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.queueconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.musiconholdconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.featureconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.zaptelconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.alarmreciverconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.voicemailconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.managerconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.extensionconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.agentconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.indicationsconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.misdnconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.sipconf.GuiClassFactory.createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.meetmeconf.GuiClassFactory
                .createTreeDialog(obj);
        if (dlg != null)
            return dlg;

        return null;
    }

    /**
     * erzeugt ein dialog und initalisiert ihn
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleDataObjectTreeDialog createTreeDialog(
            Frame aFrame, Object obj) {
        if (obj instanceof MisdnDriverConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Zapataconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Indicationsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Misdnconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Zaptelconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Iaxgeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof SipConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof VoicemailConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Extensionconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Queuegeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Agentsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Music_on_HoldConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmusiconholdconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Meetmeconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmeetmeconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Alarmreceiverconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultalarmreciverconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Featuresconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultfeatureconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof ManagergeneralSection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        AbstractSimpleDataObjectTreeDialog dlg = null;

        dlg = com.useit.jact.gui.iaxconf.GuiClassFactory.createTreeDialog(
                aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.misdndriverconf.GuiClassFactory
                .createTreeDialog(aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.zapataconf.GuiClassFactory.createTreeDialog(
                aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.queueconf.GuiClassFactory.createTreeDialog(
                aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.musiconholdconf.GuiClassFactory
                .createTreeDialog(aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.featureconf.GuiClassFactory.createTreeDialog(
                aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.zaptelconf.GuiClassFactory.createTreeDialog(
                aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.alarmreciverconf.GuiClassFactory
                .createTreeDialog(aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.voicemailconf.GuiClassFactory
                .createTreeDialog(aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.managerconf.GuiClassFactory.createTreeDialog(
                aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.extensionconf.GuiClassFactory
                .createTreeDialog(aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.agentconf.GuiClassFactory.createTreeDialog(
                aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.indicationsconf.GuiClassFactory
                .createTreeDialog(aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.misdnconf.GuiClassFactory.createTreeDialog(
                aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.sipconf.GuiClassFactory.createTreeDialog(
                aFrame, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.meetmeconf.GuiClassFactory.createTreeDialog(
                aFrame, obj);
        if (dlg != null)
            return dlg;
        return null;
    }

    /**
     * erzeugt ein dialog und initalisiert ihn
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleDataObjectTreeDialog createTreeDialog(
            Dialog aDialog, Object obj) {
        if (obj instanceof MisdnDriverConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Zapataconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Indicationsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Misdnconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Zaptelconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Iaxgeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof SipConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof VoicemailConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Extensionconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Queuegeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Agentsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Music_on_HoldConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmusiconholdconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Meetmeconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmeetmeconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Alarmreceiverconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultalarmreciverconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Featuresconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultfeatureconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof ManagergeneralSection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        AbstractSimpleDataObjectTreeDialog dlg = null;

        dlg = com.useit.jact.gui.iaxconf.GuiClassFactory.createTreeDialog(
                aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.misdndriverconf.GuiClassFactory
                .createTreeDialog(aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.zapataconf.GuiClassFactory.createTreeDialog(
                aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.queueconf.GuiClassFactory.createTreeDialog(
                aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.musiconholdconf.GuiClassFactory
                .createTreeDialog(aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.featureconf.GuiClassFactory.createTreeDialog(
                aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.zaptelconf.GuiClassFactory.createTreeDialog(
                aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.alarmreciverconf.GuiClassFactory
                .createTreeDialog(aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.voicemailconf.GuiClassFactory
                .createTreeDialog(aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.managerconf.GuiClassFactory.createTreeDialog(
                aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.extensionconf.GuiClassFactory
                .createTreeDialog(aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.agentconf.GuiClassFactory.createTreeDialog(
                aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.indicationsconf.GuiClassFactory
                .createTreeDialog(aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.misdnconf.GuiClassFactory.createTreeDialog(
                aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.sipconf.GuiClassFactory.createTreeDialog(
                aDialog, obj);
        if (dlg != null)
            return dlg;

        dlg = com.useit.jact.gui.meetmeconf.GuiClassFactory.createTreeDialog(
                aDialog, obj);
        if (dlg != null)
            return dlg;
        return null;
    }

    // misdndriverconf : MisdnDriverConf
    /**
     * erzeugt ein misdndriverconf treedialog mit model
     * 
     * @return DefaultmisdndriverconfTreeDialog
     */
    public static DefaultmisdndriverconfTreeDialog createmisdndriverconfTreeDialog() {
        DefaultmisdndriverconfTreeDialog dlg = new DefaultmisdndriverconfTreeDialog(
                ModelFactory.getInstance().createmisdndriverconfModel());
        return dlg;
    }

    /**
     * erzeugt ein misdndriverconf Treedialog
     * 
     * @param obj
     *            das model object (misdndriverconf)
     * @return DefaultmisdndriverconfTreeDialog
     */
    public static DefaultmisdndriverconfTreeDialog createmisdndriverconfTreeDialog(
            Object obj) {
        DefaultmisdndriverconfTreeDialog dlg = new DefaultmisdndriverconfTreeDialog(
                obj);
        return dlg;
    }

    /**
     * erzeugt ein misdndriverconf panel mit neuem model
     * 
     * @return SimplemisdndriverconfTreePanel
     */
    public static SimplemisdndriverconfTreePanel createmisdndriverconfTreePanelAndModel() {
        SimplemisdndriverconfTreePanel p = new SimplemisdndriverconfTreePanel();
        p.initTree(ModelFactory.getInstance().createmisdndriverconfModel());
        return p;
    }

    /**
     * erzeugt ein misdndriverconf panel ohne model
     * 
     * @return SimplemisdndriverconfTreePanel
     */
    public static SimplemisdndriverconfTreePanel createmisdndriverconfTreePanel() {
        SimplemisdndriverconfTreePanel p = new SimplemisdndriverconfTreePanel();
        return p;
    }

    // zapataconf : Zapataconf
    /**
     * erzeugt ein zapataconf treedialog mit model
     * 
     * @return DefaultzapataconfTreeDialog
     */
    public static DefaultzapataconfTreeDialog createzapataconfTreeDialog() {
        DefaultzapataconfTreeDialog dlg = new DefaultzapataconfTreeDialog(
                ModelFactory.getInstance().createzapataconfModel());
        return dlg;
    }

    /**
     * erzeugt ein zapataconf Treedialog
     * 
     * @param obj
     *            das model object (zapataconf)
     * @return DefaultzapataconfTreeDialog
     */
    public static DefaultzapataconfTreeDialog createzapataconfTreeDialog(
            Object obj) {
        DefaultzapataconfTreeDialog dlg = new DefaultzapataconfTreeDialog(obj);
        return dlg;
    }

    /**
     * erzeugt ein zapataconf panel mit neuem model
     * 
     * @return SimplezapataconfTreePanel
     */
    public static SimplezapataconfTreePanel createzapataconfTreePanelAndModel() {
        SimplezapataconfTreePanel p = new SimplezapataconfTreePanel();
        p.initTree(ModelFactory.getInstance().createzapataconfModel());
        return p;
    }

    /**
     * erzeugt ein zapataconf panel ohne model
     * 
     * @return SimplezapataconfTreePanel
     */
    public static SimplezapataconfTreePanel createzapataconfTreePanel() {
        SimplezapataconfTreePanel p = new SimplezapataconfTreePanel();
        return p;
    }

    // indicationsconf : Indicationsconf
    /**
     * erzeugt ein indicationsconf treedialog mit model
     * 
     * @return DefaultindicationsconfTreeDialog
     */
    public static DefaultindicationsconfTreeDialog createindicationsconfTreeDialog() {
        DefaultindicationsconfTreeDialog dlg = new DefaultindicationsconfTreeDialog(
                ModelFactory.getInstance().createindicationsconfModel());
        return dlg;
    }

    /**
     * erzeugt ein indicationsconf Treedialog
     * 
     * @param obj
     *            das model object (indicationsconf)
     * @return DefaultindicationsconfTreeDialog
     */
    public static DefaultindicationsconfTreeDialog createindicationsconfTreeDialog(
            Object obj) {
        DefaultindicationsconfTreeDialog dlg = new DefaultindicationsconfTreeDialog(
                obj);
        return dlg;
    }

    /**
     * erzeugt ein indicationsconf panel mit neuem model
     * 
     * @return SimpleindicationsconfTreePanel
     */
    public static SimpleindicationsconfTreePanel createindicationsconfTreePanelAndModel() {
        SimpleindicationsconfTreePanel p = new SimpleindicationsconfTreePanel();
        p.initTree(ModelFactory.getInstance().createindicationsconfModel());
        return p;
    }

    /**
     * erzeugt ein indicationsconf panel ohne model
     * 
     * @return SimpleindicationsconfTreePanel
     */
    public static SimpleindicationsconfTreePanel createindicationsconfTreePanel() {
        SimpleindicationsconfTreePanel p = new SimpleindicationsconfTreePanel();
        return p;
    }

    // misdnconf : Misdnconf
    /**
     * erzeugt ein misdnconf treedialog mit model
     * 
     * @return DefaultmisdnconfTreeDialog
     */
    public static DefaultmisdnconfTreeDialog createmisdnconfTreeDialog() {
        DefaultmisdnconfTreeDialog dlg = new DefaultmisdnconfTreeDialog(
                ModelFactory.getInstance().createmisdnconfModel());
        return dlg;
    }

    /**
     * erzeugt ein misdnconf Treedialog
     * 
     * @param obj
     *            das model object (misdnconf)
     * @return DefaultmisdnconfTreeDialog
     */
    public static DefaultmisdnconfTreeDialog createmisdnconfTreeDialog(
            Object obj) {
        DefaultmisdnconfTreeDialog dlg = new DefaultmisdnconfTreeDialog(obj);
        return dlg;
    }

    /**
     * erzeugt ein misdnconf panel mit neuem model
     * 
     * @return SimplemisdnconfTreePanel
     */
    public static SimplemisdnconfTreePanel createmisdnconfTreePanelAndModel() {
        SimplemisdnconfTreePanel p = new SimplemisdnconfTreePanel();
        p.initTree(ModelFactory.getInstance().createmisdnconfModel());
        return p;
    }

    /**
     * erzeugt ein misdnconf panel ohne model
     * 
     * @return SimplemisdnconfTreePanel
     */
    public static SimplemisdnconfTreePanel createmisdnconfTreePanel() {
        SimplemisdnconfTreePanel p = new SimplemisdnconfTreePanel();
        return p;
    }

    // zaptelconf : Zaptelconf
    /**
     * erzeugt ein zaptelconf treedialog mit model
     * 
     * @return DefaultzaptelconfTreeDialog
     */
    public static DefaultzaptelconfTreeDialog createzaptelconfTreeDialog() {
        DefaultzaptelconfTreeDialog dlg = new DefaultzaptelconfTreeDialog(
                ModelFactory.getInstance().createzaptelconfModel());
        return dlg;
    }

    /**
     * erzeugt ein zaptelconf Treedialog
     * 
     * @param obj
     *            das model object (zaptelconf)
     * @return DefaultzaptelconfTreeDialog
     */
    public static DefaultzaptelconfTreeDialog createzaptelconfTreeDialog(
            Object obj) {
        DefaultzaptelconfTreeDialog dlg = new DefaultzaptelconfTreeDialog(obj);
        return dlg;
    }

    /**
     * erzeugt ein zaptelconf panel mit neuem model
     * 
     * @return SimplezaptelconfTreePanel
     */
    public static SimplezaptelconfTreePanel createzaptelconfTreePanelAndModel() {
        SimplezaptelconfTreePanel p = new SimplezaptelconfTreePanel();
        p.initTree(ModelFactory.getInstance().createzaptelconfModel());
        return p;
    }

    /**
     * erzeugt ein zaptelconf panel ohne model
     * 
     * @return SimplezaptelconfTreePanel
     */
    public static SimplezaptelconfTreePanel createzaptelconfTreePanel() {
        SimplezaptelconfTreePanel p = new SimplezaptelconfTreePanel();
        return p;
    }

    // iaxconf : Iaxgeneral
    /**
     * erzeugt ein iaxconf treedialog mit model
     * 
     * @return DefaultiaxconfTreeDialog
     */
    public static DefaultiaxconfTreeDialog createiaxconfTreeDialog() {
        DefaultiaxconfTreeDialog dlg = new DefaultiaxconfTreeDialog(
                ModelFactory.getInstance().createiaxconfModel());
        return dlg;
    }

    /**
     * erzeugt ein iaxconf Treedialog
     * 
     * @param obj
     *            das model object (iaxconf)
     * @return DefaultiaxconfTreeDialog
     */
    public static DefaultiaxconfTreeDialog createiaxconfTreeDialog(Object obj) {
        DefaultiaxconfTreeDialog dlg = new DefaultiaxconfTreeDialog(obj);
        return dlg;
    }

    /**
     * erzeugt ein iaxconf panel mit neuem model
     * 
     * @return SimpleiaxconfTreePanel
     */
    public static SimpleiaxconfTreePanel createiaxconfTreePanelAndModel() {
        SimpleiaxconfTreePanel p = new SimpleiaxconfTreePanel();
        p.initTree(ModelFactory.getInstance().createiaxconfModel());
        return p;
    }

    /**
     * erzeugt ein iaxconf panel ohne model
     * 
     * @return SimpleiaxconfTreePanel
     */
    public static SimpleiaxconfTreePanel createiaxconfTreePanel() {
        SimpleiaxconfTreePanel p = new SimpleiaxconfTreePanel();
        return p;
    }

    // sipconf : SipConf
    /**
     * erzeugt ein sipconf treedialog mit model
     * 
     * @return DefaultsipconfTreeDialog
     */
    public static DefaultsipconfTreeDialog createsipconfTreeDialog() {
        DefaultsipconfTreeDialog dlg = new DefaultsipconfTreeDialog(
                ModelFactory.getInstance().createsipconfModel());
        return dlg;
    }

    /**
     * erzeugt ein sipconf Treedialog
     * 
     * @param obj
     *            das model object (sipconf)
     * @return DefaultsipconfTreeDialog
     */
    public static DefaultsipconfTreeDialog createsipconfTreeDialog(Object obj) {
        DefaultsipconfTreeDialog dlg = new DefaultsipconfTreeDialog(obj);
        return dlg;
    }

    /**
     * erzeugt ein sipconf panel mit neuem model
     * 
     * @return SimplesipconfTreePanel
     */
    public static SimplesipconfTreePanel createsipconfTreePanelAndModel() {
        SimplesipconfTreePanel p = new SimplesipconfTreePanel();
        p.initTree(ModelFactory.getInstance().createsipconfModel());
        return p;
    }

    /**
     * erzeugt ein sipconf panel ohne model
     * 
     * @return SimplesipconfTreePanel
     */
    public static SimplesipconfTreePanel createsipconfTreePanel() {
        SimplesipconfTreePanel p = new SimplesipconfTreePanel();
        return p;
    }

    // voicemailconf : VoicemailConf
    /**
     * erzeugt ein voicemailconf treedialog mit model
     * 
     * @return DefaultvoicemailconfTreeDialog
     */
    public static DefaultvoicemailconfTreeDialog createvoicemailconfTreeDialog() {
        DefaultvoicemailconfTreeDialog dlg = new DefaultvoicemailconfTreeDialog(
                ModelFactory.getInstance().createvoicemailconfModel());
        return dlg;
    }

    /**
     * erzeugt ein voicemailconf Treedialog
     * 
     * @param obj
     *            das model object (voicemailconf)
     * @return DefaultvoicemailconfTreeDialog
     */
    public static DefaultvoicemailconfTreeDialog createvoicemailconfTreeDialog(
            Object obj) {
        DefaultvoicemailconfTreeDialog dlg = new DefaultvoicemailconfTreeDialog(
                obj);
        return dlg;
    }

    /**
     * erzeugt ein voicemailconf panel mit neuem model
     * 
     * @return SimplevoicemailconfTreePanel
     */
    public static SimplevoicemailconfTreePanel createvoicemailconfTreePanelAndModel() {
        SimplevoicemailconfTreePanel p = new SimplevoicemailconfTreePanel();
        p.initTree(ModelFactory.getInstance().createvoicemailconfModel());
        return p;
    }

    /**
     * erzeugt ein voicemailconf panel ohne model
     * 
     * @return SimplevoicemailconfTreePanel
     */
    public static SimplevoicemailconfTreePanel createvoicemailconfTreePanel() {
        SimplevoicemailconfTreePanel p = new SimplevoicemailconfTreePanel();
        return p;
    }

    // extensionconf : Extensionconf
    /**
     * erzeugt ein extensionconf treedialog mit model
     * 
     * @return DefaultextensionconfTreeDialog
     */
    public static DefaultextensionconfTreeDialog createextensionconfTreeDialog() {
        DefaultextensionconfTreeDialog dlg = new DefaultextensionconfTreeDialog(
                ModelFactory.getInstance().createextensionconfModel());
        return dlg;
    }

    /**
     * erzeugt ein extensionconf Treedialog
     * 
     * @param obj
     *            das model object (extensionconf)
     * @return DefaultextensionconfTreeDialog
     */
    public static DefaultextensionconfTreeDialog createextensionconfTreeDialog(
            Object obj) {
        DefaultextensionconfTreeDialog dlg = new DefaultextensionconfTreeDialog(
                obj);
        return dlg;
    }

    /**
     * erzeugt ein extensionconf panel mit neuem model
     * 
     * @return SimpleextensionconfTreePanel
     */
    public static SimpleextensionconfTreePanel createextensionconfTreePanelAndModel() {
        SimpleextensionconfTreePanel p = new SimpleextensionconfTreePanel();
        p.initTree(ModelFactory.getInstance().createextensionconfModel());
        return p;
    }

    /**
     * erzeugt ein extensionconf panel ohne model
     * 
     * @return SimpleextensionconfTreePanel
     */
    public static SimpleextensionconfTreePanel createextensionconfTreePanel() {
        SimpleextensionconfTreePanel p = new SimpleextensionconfTreePanel();
        return p;
    }

    // queueconf : Queuegeneral
    /**
     * erzeugt ein queueconf treedialog mit model
     * 
     * @return DefaultqueueconfTreeDialog
     */
    public static DefaultqueueconfTreeDialog createqueueconfTreeDialog() {
        DefaultqueueconfTreeDialog dlg = new DefaultqueueconfTreeDialog(
                ModelFactory.getInstance().createqueueconfModel());
        return dlg;
    }

    /**
     * erzeugt ein queueconf Treedialog
     * 
     * @param obj
     *            das model object (queueconf)
     * @return DefaultqueueconfTreeDialog
     */
    public static DefaultqueueconfTreeDialog createqueueconfTreeDialog(
            Object obj) {
        DefaultqueueconfTreeDialog dlg = new DefaultqueueconfTreeDialog(obj);
        return dlg;
    }

    /**
     * erzeugt ein queueconf panel mit neuem model
     * 
     * @return SimplequeueconfTreePanel
     */
    public static SimplequeueconfTreePanel createqueueconfTreePanelAndModel() {
        SimplequeueconfTreePanel p = new SimplequeueconfTreePanel();
        p.initTree(ModelFactory.getInstance().createqueueconfModel());
        return p;
    }

    /**
     * erzeugt ein queueconf panel ohne model
     * 
     * @return SimplequeueconfTreePanel
     */
    public static SimplequeueconfTreePanel createqueueconfTreePanel() {
        SimplequeueconfTreePanel p = new SimplequeueconfTreePanel();
        return p;
    }

    // agentconf : Agentsconf
    /**
     * erzeugt ein agentconf treedialog mit model
     * 
     * @return DefaultagentconfTreeDialog
     */
    public static DefaultagentconfTreeDialog createagentconfTreeDialog() {
        DefaultagentconfTreeDialog dlg = new DefaultagentconfTreeDialog(
                ModelFactory.getInstance().createagentconfModel());
        return dlg;
    }

    /**
     * erzeugt ein agentconf Treedialog
     * 
     * @param obj
     *            das model object (agentconf)
     * @return DefaultagentconfTreeDialog
     */
    public static DefaultagentconfTreeDialog createagentconfTreeDialog(
            Object obj) {
        DefaultagentconfTreeDialog dlg = new DefaultagentconfTreeDialog(obj);
        return dlg;
    }

    /**
     * erzeugt ein agentconf panel mit neuem model
     * 
     * @return SimpleagentconfTreePanel
     */
    public static SimpleagentconfTreePanel createagentconfTreePanelAndModel() {
        SimpleagentconfTreePanel p = new SimpleagentconfTreePanel();
        p.initTree(ModelFactory.getInstance().createagentconfModel());
        return p;
    }

    /**
     * erzeugt ein agentconf panel ohne model
     * 
     * @return SimpleagentconfTreePanel
     */
    public static SimpleagentconfTreePanel createagentconfTreePanel() {
        SimpleagentconfTreePanel p = new SimpleagentconfTreePanel();
        return p;
    }

    // musiconholdconf : Music_on_HoldConf
    /**
     * erzeugt ein musiconholdconf treedialog mit model
     * 
     * @return DefaultmusiconholdconfTreeDialog
     */
    public static DefaultmusiconholdconfTreeDialog createmusiconholdconfTreeDialog() {
        DefaultmusiconholdconfTreeDialog dlg = new DefaultmusiconholdconfTreeDialog(
                ModelFactory.getInstance().createmusiconholdconfModel());
        return dlg;
    }

    /**
     * erzeugt ein musiconholdconf Treedialog
     * 
     * @param obj
     *            das model object (musiconholdconf)
     * @return DefaultmusiconholdconfTreeDialog
     */
    public static DefaultmusiconholdconfTreeDialog createmusiconholdconfTreeDialog(
            Object obj) {
        DefaultmusiconholdconfTreeDialog dlg = new DefaultmusiconholdconfTreeDialog(
                obj);
        return dlg;
    }

    /**
     * erzeugt ein musiconholdconf panel mit neuem model
     * 
     * @return SimplemusiconholdconfTreePanel
     */
    public static SimplemusiconholdconfTreePanel createmusiconholdconfTreePanelAndModel() {
        SimplemusiconholdconfTreePanel p = new SimplemusiconholdconfTreePanel();
        p.initTree(ModelFactory.getInstance().createmusiconholdconfModel());
        return p;
    }

    /**
     * erzeugt ein musiconholdconf panel ohne model
     * 
     * @return SimplemusiconholdconfTreePanel
     */
    public static SimplemusiconholdconfTreePanel createmusiconholdconfTreePanel() {
        SimplemusiconholdconfTreePanel p = new SimplemusiconholdconfTreePanel();
        return p;
    }

    // meetmeconf : Meetmeconf
    /**
     * erzeugt ein meetmeconf treedialog mit model
     * 
     * @return DefaultmeetmeconfTreeDialog
     */
    public static DefaultmeetmeconfTreeDialog createmeetmeconfTreeDialog() {
        DefaultmeetmeconfTreeDialog dlg = new DefaultmeetmeconfTreeDialog(
                ModelFactory.getInstance().createmeetmeconfModel());
        return dlg;
    }

    /**
     * erzeugt ein meetmeconf Treedialog
     * 
     * @param obj
     *            das model object (meetmeconf)
     * @return DefaultmeetmeconfTreeDialog
     */
    public static DefaultmeetmeconfTreeDialog createmeetmeconfTreeDialog(
            Object obj) {
        DefaultmeetmeconfTreeDialog dlg = new DefaultmeetmeconfTreeDialog(obj);
        return dlg;
    }

    /**
     * erzeugt ein meetmeconf panel mit neuem model
     * 
     * @return SimplemeetmeconfTreePanel
     */
    public static SimplemeetmeconfTreePanel createmeetmeconfTreePanelAndModel() {
        SimplemeetmeconfTreePanel p = new SimplemeetmeconfTreePanel();
        p.initTree(ModelFactory.getInstance().createmeetmeconfModel());
        return p;
    }

    /**
     * erzeugt ein meetmeconf panel ohne model
     * 
     * @return SimplemeetmeconfTreePanel
     */
    public static SimplemeetmeconfTreePanel createmeetmeconfTreePanel() {
        SimplemeetmeconfTreePanel p = new SimplemeetmeconfTreePanel();
        return p;
    }

    // alarmreciverconf : Alarmreceiverconf
    /**
     * erzeugt ein alarmreciverconf treedialog mit model
     * 
     * @return DefaultalarmreciverconfTreeDialog
     */
    public static DefaultalarmreciverconfTreeDialog createalarmreciverconfTreeDialog() {
        DefaultalarmreciverconfTreeDialog dlg = new DefaultalarmreciverconfTreeDialog(
                ModelFactory.getInstance().createalarmreciverconfModel());
        return dlg;
    }

    /**
     * erzeugt ein alarmreciverconf Treedialog
     * 
     * @param obj
     *            das model object (alarmreciverconf)
     * @return DefaultalarmreciverconfTreeDialog
     */
    public static DefaultalarmreciverconfTreeDialog createalarmreciverconfTreeDialog(
            Object obj) {
        DefaultalarmreciverconfTreeDialog dlg = new DefaultalarmreciverconfTreeDialog(
                obj);
        return dlg;
    }

    /**
     * erzeugt ein alarmreciverconf panel mit neuem model
     * 
     * @return SimplealarmreciverconfTreePanel
     */
    public static SimplealarmreciverconfTreePanel createalarmreciverconfTreePanelAndModel() {
        SimplealarmreciverconfTreePanel p = new SimplealarmreciverconfTreePanel();
        p.initTree(ModelFactory.getInstance().createalarmreciverconfModel());
        return p;
    }

    /**
     * erzeugt ein alarmreciverconf panel ohne model
     * 
     * @return SimplealarmreciverconfTreePanel
     */
    public static SimplealarmreciverconfTreePanel createalarmreciverconfTreePanel() {
        SimplealarmreciverconfTreePanel p = new SimplealarmreciverconfTreePanel();
        return p;
    }

    // featureconf : Featuresconf
    /**
     * erzeugt ein featureconf treedialog mit model
     * 
     * @return DefaultfeatureconfTreeDialog
     */
    public static DefaultfeatureconfTreeDialog createfeatureconfTreeDialog() {
        DefaultfeatureconfTreeDialog dlg = new DefaultfeatureconfTreeDialog(
                ModelFactory.getInstance().createfeatureconfModel());
        return dlg;
    }

    /**
     * erzeugt ein featureconf Treedialog
     * 
     * @param obj
     *            das model object (featureconf)
     * @return DefaultfeatureconfTreeDialog
     */
    public static DefaultfeatureconfTreeDialog createfeatureconfTreeDialog(
            Object obj) {
        DefaultfeatureconfTreeDialog dlg = new DefaultfeatureconfTreeDialog(obj);
        return dlg;
    }

    /**
     * erzeugt ein featureconf panel mit neuem model
     * 
     * @return SimplefeatureconfTreePanel
     */
    public static SimplefeatureconfTreePanel createfeatureconfTreePanelAndModel() {
        SimplefeatureconfTreePanel p = new SimplefeatureconfTreePanel();
        p.initTree(ModelFactory.getInstance().createfeatureconfModel());
        return p;
    }

    /**
     * erzeugt ein featureconf panel ohne model
     * 
     * @return SimplefeatureconfTreePanel
     */
    public static SimplefeatureconfTreePanel createfeatureconfTreePanel() {
        SimplefeatureconfTreePanel p = new SimplefeatureconfTreePanel();
        return p;
    }

    // managerconf : ManagergeneralSection
    /**
     * erzeugt ein managerconf treedialog mit model
     * 
     * @return DefaultmanagerconfTreeDialog
     */
    public static DefaultmanagerconfTreeDialog createmanagerconfTreeDialog() {
        DefaultmanagerconfTreeDialog dlg = new DefaultmanagerconfTreeDialog(
                ModelFactory.getInstance().createmanagerconfModel());
        return dlg;
    }

    /**
     * erzeugt ein managerconf Treedialog
     * 
     * @param obj
     *            das model object (managerconf)
     * @return DefaultmanagerconfTreeDialog
     */
    public static DefaultmanagerconfTreeDialog createmanagerconfTreeDialog(
            Object obj) {
        DefaultmanagerconfTreeDialog dlg = new DefaultmanagerconfTreeDialog(obj);
        return dlg;
    }

    /**
     * erzeugt ein managerconf panel mit neuem model
     * 
     * @return SimplemanagerconfTreePanel
     */
    public static SimplemanagerconfTreePanel createmanagerconfTreePanelAndModel() {
        SimplemanagerconfTreePanel p = new SimplemanagerconfTreePanel();
        p.initTree(ModelFactory.getInstance().createmanagerconfModel());
        return p;
    }

    /**
     * erzeugt ein managerconf panel ohne model
     * 
     * @return SimplemanagerconfTreePanel
     */
    public static SimplemanagerconfTreePanel createmanagerconfTreePanel() {
        SimplemanagerconfTreePanel p = new SimplemanagerconfTreePanel();
        return p;
    }

}
