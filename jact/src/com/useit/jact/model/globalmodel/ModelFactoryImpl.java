/*
 * (c) urs zeidler
 */
package com.useit.jact.model.globalmodel;

import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.AgentsconfImpl;
import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;
import com.useit.jact.model.alarmreciverconf.AlarmreceiverconfImpl;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.ExtensionconfImpl;
import com.useit.jact.model.featureconf.Featuresconf;
import com.useit.jact.model.featureconf.FeaturesconfImpl;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.IaxgeneralImpl;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.IndicationsconfImpl;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.ManagergeneralSectionImpl;
import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.MeetmeconfImpl;
import com.useit.jact.model.misdnconf.Misdnconf;
import com.useit.jact.model.misdnconf.MisdnconfImpl;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdnDriverConfImpl;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConfImpl;
import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.QueuegeneralImpl;
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.SipConfImpl;
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.VoicemailConfImpl;
import com.useit.jact.model.zapataconf.Zapataconf;
import com.useit.jact.model.zapataconf.ZapataconfImpl;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.ZaptelconfImpl;

public class ModelFactoryImpl extends ModelFactory {

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactoryImpl();
        }
        return instance;
    }

    public Object createextensionconfModel() {
        return new ExtensionconfImpl();
    }

    public Object createindicationsconfModel() {
        return new IndicationsconfImpl();
    }

    public Object createsipconfModel() {
        return new SipConfImpl();
    }

    public Object createfeatureconfModel() {
        return new FeaturesconfImpl();
    }

    public Object createiaxconfModel() {
        return new IaxgeneralImpl();
    }

    public Object createmanagerconfModel() {
        return new ManagergeneralSectionImpl();
    }

    public Object createqueueconfModel() {
        return new QueuegeneralImpl();
    }

    public Object createzapataconfModel() {
        return new ZapataconfImpl();
    }

    public Object createalarmreciverconfModel() {
        return new AlarmreceiverconfImpl();
    }

    public Object createzaptelconfModel() {
        return new ZaptelconfImpl();
    }

    public Object createmisdnconfModel() {
        return new MisdnconfImpl();
    }

    public Object createmeetmeconfModel() {
        return new MeetmeconfImpl();
    }

    public Object createvoicemailconfModel() {
        return new VoicemailConfImpl();
    }

    public Object createmisdndriverconfModel() {
        return new MisdnDriverConfImpl();
    }

    public Object createmusiconholdconfModel() {
        return new Music_on_HoldConfImpl();
    }

    public Object createagentconfModel() {
        return new AgentsconfImpl();
    }

    public boolean isfeatureconfModel(Object obj) {
        return obj instanceof Featuresconf;
    }

    public boolean isqueueconfModel(Object obj) {
        return obj instanceof Queuegeneral;
    }

    public boolean ismanagerconfModel(Object obj) {
        return obj instanceof ManagergeneralSection;
    }

    public boolean isextensionconfModel(Object obj) {
        return obj instanceof Extensionconf;
    }

    public boolean ismisdnconfModel(Object obj) {
        return obj instanceof Misdnconf;
    }

    public boolean issipconfModel(Object obj) {
        return obj instanceof SipConf;
    }

    public boolean isindicationsconfModel(Object obj) {
        return obj instanceof Indicationsconf;
    }

    public boolean isagentconfModel(Object obj) {
        return obj instanceof Agentsconf;
    }

    public boolean isvoicemailconfModel(Object obj) {
        return obj instanceof VoicemailConf;
    }

    public boolean iszapataconfModel(Object obj) {
        return obj instanceof Zapataconf;
    }

    public boolean isalarmreciverconfModel(Object obj) {
        return obj instanceof Alarmreceiverconf;
    }

    public boolean ismisdndriverconfModel(Object obj) {
        return obj instanceof MisdnDriverConf;
    }

    public boolean ismeetmeconfModel(Object obj) {
        return obj instanceof Meetmeconf;
    }

    public boolean ismusiconholdconfModel(Object obj) {
        return obj instanceof Music_on_HoldConf;
    }

    public boolean iszaptelconfModel(Object obj) {
        return obj instanceof Zaptelconf;
    }

    public boolean isiaxconfModel(Object obj) {
        return obj instanceof Iaxgeneral;
    }

}
