/*
 * (c) urs zeidler
 */
package com.useit.jact.io.globalmodel;

import java.util.List;

import org.hibernate.classic.Session;

import com.useit.app.framework.db.HibernateUtil;
import com.useit.jact.model.agentconf.AgentsImpl;
import com.useit.jact.model.agentconf.AgentsconfImpl;
import com.useit.jact.model.agentconf.AgentsrecordingImpl;
import com.useit.jact.model.alarmreciverconf.AlarmreceiverconfImpl;
import com.useit.jact.model.extensionconf.ContextImpl;
import com.useit.jact.model.extensionconf.ExtensionImpl;
import com.useit.jact.model.extensionconf.ExtensionconfImpl;
import com.useit.jact.model.extensionconf.GlobalvarsImpl;
import com.useit.jact.model.extensionconf.IncludeconfigsImpl;
import com.useit.jact.model.extensionconf.IncludecontextImpl;
import com.useit.jact.model.extensionconf.SwitchImpl;
import com.useit.jact.model.featureconf.FeaturemapImpl;
import com.useit.jact.model.featureconf.FeaturesconfImpl;
import com.useit.jact.model.iaxconf.IaxdenyImpl;
import com.useit.jact.model.iaxconf.IaxgeneralImpl;
import com.useit.jact.model.iaxconf.IaxjitterImpl;
import com.useit.jact.model.iaxconf.IaxpeerImpl;
import com.useit.jact.model.iaxconf.IaxpermitImpl;
import com.useit.jact.model.iaxconf.IaxregisterImpl;
import com.useit.jact.model.indicationsconf.CustomToneImpl;
import com.useit.jact.model.indicationsconf.IndicationsconfImpl;
import com.useit.jact.model.indicationsconf.ToneDefinitionsImpl;
import com.useit.jact.model.managerconf.ManagerSectionImpl;
import com.useit.jact.model.managerconf.ManagerdenyImpl;
import com.useit.jact.model.managerconf.ManagergeneralSectionImpl;
import com.useit.jact.model.managerconf.ManagerpermitImpl;
import com.useit.jact.model.meetmeconf.MeetmeconfImpl;
import com.useit.jact.model.meetmeconf.MeetmeroomsImpl;
import com.useit.jact.model.misdnconf.MisdnCryptkeyImpl;
import com.useit.jact.model.misdnconf.MisdnPortsImpl;
import com.useit.jact.model.misdnconf.MisdnSectionsImpl;
import com.useit.jact.model.misdnconf.MisdnconfImpl;
import com.useit.jact.model.misdndriverconf.MisdnCardsImpl;
import com.useit.jact.model.misdndriverconf.MisdnDriverConfImpl;
import com.useit.jact.model.misdndriverconf.MisdncardPortsImpl;
import com.useit.jact.model.musiconholdconf.MohClassesImpl;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConfImpl;
import com.useit.jact.model.queueconf.QueuegeneralImpl;
import com.useit.jact.model.queueconf.QueuememberImpl;
import com.useit.jact.model.queueconf.QueuesectionImpl;
import com.useit.jact.model.sipconf.SipConfImpl;
import com.useit.jact.model.sipconf.SipauthImpl;
import com.useit.jact.model.sipconf.SipgeneralImpl;
import com.useit.jact.model.sipconf.SippeersImpl;
import com.useit.jact.model.sipconf.SipregisterImpl;
import com.useit.jact.model.voicemailconf.VoicemailConfImpl;
import com.useit.jact.model.voicemailconf.VoicemailcontextImpl;
import com.useit.jact.model.voicemailconf.VoicemailcontextentryImpl;
import com.useit.jact.model.voicemailconf.VoicemailgeneralImpl;
import com.useit.jact.model.voicemailconf.ZonemessagesImpl;
import com.useit.jact.model.zapataconf.Analog_Handset_FeaturesImpl;
import com.useit.jact.model.zapataconf.Analog_Trunk_FeaturesImpl;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_OptionsImpl;
import com.useit.jact.model.zapataconf.Call_Logging_OptionsImpl;
import com.useit.jact.model.zapataconf.Caller_ID_OptionsImpl;
import com.useit.jact.model.zapataconf.ISDN_PRI_SwitchImpl;
import com.useit.jact.model.zapataconf.Multilink_PPPImpl;
import com.useit.jact.model.zapataconf.OtherImpl;
import com.useit.jact.model.zapataconf.Timing_ParametersImpl;
import com.useit.jact.model.zapataconf.ZapataconfImpl;
import com.useit.jact.model.zapataconf.ZaptelchannelImpl;
import com.useit.jact.model.zaptelconf.ZaptelchannelsImpl;
import com.useit.jact.model.zaptelconf.ZaptelconfImpl;
import com.useit.jact.model.zaptelconf.ZapteldynamicspanImpl;
import com.useit.jact.model.zaptelconf.ZaptelspanImpl;
import com.useit.jact.model.zaptelconf.ZapteltonezoneImpl;

public class HibernateObjectLoader {
    /**
     * l�d ein misdndriverconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadmisdndriverconfList() {
        // session.close();
        return loadMisdnDriverConfList();
    }

    /**
     * l�d ein misdndriverconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadmisdndriverconfList(String where) {
        return loadMisdnDriverConfList(where);
    }

    /**
     * l�d ein misdndriverconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MisdnDriverConfImpl loadmisdndriverconfObject(Integer id) {
        return loadMisdnDriverConfObject(id);
    }

    // misdndriverconf : MisdnDriverConf
    /**
     * l�d ein zapataconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadzapataconfList() {
        // session.close();
        return loadZapataconfList();
    }

    /**
     * l�d ein zapataconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadzapataconfList(String where) {
        return loadZapataconfList(where);
    }

    /**
     * l�d ein zapataconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ZapataconfImpl loadzapataconfObject(Integer id) {
        return loadZapataconfObject(id);
    }

    // zapataconf : Zapataconf
    /**
     * l�d ein indicationsconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadindicationsconfList() {
        // session.close();
        return loadIndicationsconfList();
    }

    /**
     * l�d ein indicationsconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadindicationsconfList(String where) {
        return loadIndicationsconfList(where);
    }

    /**
     * l�d ein indicationsconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IndicationsconfImpl loadindicationsconfObject(Integer id) {
        return loadIndicationsconfObject(id);
    }

    // indicationsconf : Indicationsconf
    /**
     * l�d ein misdnconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadmisdnconfList() {
        // session.close();
        return loadMisdnconfList();
    }

    /**
     * l�d ein misdnconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadmisdnconfList(String where) {
        return loadMisdnconfList(where);
    }

    /**
     * l�d ein misdnconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MisdnconfImpl loadmisdnconfObject(Integer id) {
        return loadMisdnconfObject(id);
    }

    // misdnconf : Misdnconf
    /**
     * l�d ein zaptelconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadzaptelconfList() {
        // session.close();
        return loadZaptelconfList();
    }

    /**
     * l�d ein zaptelconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadzaptelconfList(String where) {
        return loadZaptelconfList(where);
    }

    /**
     * l�d ein zaptelconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ZaptelconfImpl loadzaptelconfObject(Integer id) {
        return loadZaptelconfObject(id);
    }

    // zaptelconf : Zaptelconf
    /**
     * l�d ein iaxconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadiaxconfList() {
        // session.close();
        return loadIaxgeneralList();
    }

    /**
     * l�d ein iaxconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadiaxconfList(String where) {
        return loadIaxgeneralList(where);
    }

    /**
     * l�d ein iaxconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IaxgeneralImpl loadiaxconfObject(Integer id) {
        return loadIaxgeneralObject(id);
    }

    // iaxconf : Iaxgeneral
    /**
     * l�d ein sipconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadsipconfList() {
        // session.close();
        return loadSipConfList();
    }

    /**
     * l�d ein sipconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadsipconfList(String where) {
        return loadSipConfList(where);
    }

    /**
     * l�d ein sipconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static SipConfImpl loadsipconfObject(Integer id) {
        return loadSipConfObject(id);
    }

    // sipconf : SipConf
    /**
     * l�d ein voicemailconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadvoicemailconfList() {
        // session.close();
        return loadVoicemailConfList();
    }

    /**
     * l�d ein voicemailconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadvoicemailconfList(String where) {
        return loadVoicemailConfList(where);
    }

    /**
     * l�d ein voicemailconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static VoicemailConfImpl loadvoicemailconfObject(Integer id) {
        return loadVoicemailConfObject(id);
    }

    // voicemailconf : VoicemailConf
    /**
     * l�d ein extensionconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadextensionconfList() {
        // session.close();
        return loadExtensionconfList();
    }

    /**
     * l�d ein extensionconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadextensionconfList(String where) {
        return loadExtensionconfList(where);
    }

    /**
     * l�d ein extensionconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ExtensionconfImpl loadextensionconfObject(Integer id) {
        return loadExtensionconfObject(id);
    }

    // extensionconf : Extensionconf
    /**
     * l�d ein queueconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadqueueconfList() {
        // session.close();
        return loadQueuegeneralList();
    }

    /**
     * l�d ein queueconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadqueueconfList(String where) {
        return loadQueuegeneralList(where);
    }

    /**
     * l�d ein queueconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static QueuegeneralImpl loadqueueconfObject(Integer id) {
        return loadQueuegeneralObject(id);
    }

    // queueconf : Queuegeneral
    /**
     * l�d ein agentconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadagentconfList() {
        // session.close();
        return loadAgentsconfList();
    }

    /**
     * l�d ein agentconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadagentconfList(String where) {
        return loadAgentsconfList(where);
    }

    /**
     * l�d ein agentconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static AgentsconfImpl loadagentconfObject(Integer id) {
        return loadAgentsconfObject(id);
    }

    // agentconf : Agentsconf
    /**
     * l�d ein musiconholdconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadmusiconholdconfList() {
        // session.close();
        return loadMusic_on_HoldConfList();
    }

    /**
     * l�d ein musiconholdconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadmusiconholdconfList(String where) {
        return loadMusic_on_HoldConfList(where);
    }

    /**
     * l�d ein musiconholdconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static Music_on_HoldConfImpl loadmusiconholdconfObject(Integer id) {
        return loadMusic_on_HoldConfObject(id);
    }

    // musiconholdconf : Music_on_HoldConf
    /**
     * l�d ein meetmeconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadmeetmeconfList() {
        // session.close();
        return loadMeetmeconfList();
    }

    /**
     * l�d ein meetmeconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadmeetmeconfList(String where) {
        return loadMeetmeconfList(where);
    }

    /**
     * l�d ein meetmeconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MeetmeconfImpl loadmeetmeconfObject(Integer id) {
        return loadMeetmeconfObject(id);
    }

    // meetmeconf : Meetmeconf
    /**
     * l�d ein alarmreciverconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadalarmreciverconfList() {
        // session.close();
        return loadAlarmreceiverconfList();
    }

    /**
     * l�d ein alarmreciverconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadalarmreciverconfList(String where) {
        return loadAlarmreceiverconfList(where);
    }

    /**
     * l�d ein alarmreciverconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static AlarmreceiverconfImpl loadalarmreciverconfObject(Integer id) {
        return loadAlarmreceiverconfObject(id);
    }

    // alarmreciverconf : Alarmreceiverconf
    /**
     * l�d ein featureconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadfeatureconfList() {
        // session.close();
        return loadFeaturesconfList();
    }

    /**
     * l�d ein featureconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadfeatureconfList(String where) {
        return loadFeaturesconfList(where);
    }

    /**
     * l�d ein featureconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static FeaturesconfImpl loadfeatureconfObject(Integer id) {
        return loadFeaturesconfObject(id);
    }

    // featureconf : Featuresconf
    /**
     * l�d ein managerconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadmanagerconfList() {
        // session.close();
        return loadManagergeneralSectionList();
    }

    /**
     * l�d ein managerconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadmanagerconfList(String where) {
        return loadManagergeneralSectionList(where);
    }

    /**
     * l�d ein managerconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ManagergeneralSectionImpl loadmanagerconfObject(Integer id) {
        return loadManagergeneralSectionObject(id);
    }

    // managerconf : ManagergeneralSection

    /**
     * l�d ein QueuegeneralImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadQueuegeneralList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from QueuegeneralImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein QueuegeneralImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadQueuegeneralList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from QueuegeneralImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein QueuegeneralImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static QueuegeneralImpl loadQueuegeneralObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(QueuegeneralImpl.class, id);
        // session.close();
        return (QueuegeneralImpl) object;
    }

    /**
     * l�d ein QueuesectionImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadQueuesectionList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from QueuesectionImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein QueuesectionImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadQueuesectionList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from QueuesectionImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein QueuesectionImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static QueuesectionImpl loadQueuesectionObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(QueuesectionImpl.class, id);
        // session.close();
        return (QueuesectionImpl) object;
    }

    /**
     * l�d ein QueuememberImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadQueuememberList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from QueuememberImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein QueuememberImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadQueuememberList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from QueuememberImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein QueuememberImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static QueuememberImpl loadQueuememberObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(QueuememberImpl.class, id);
        // session.close();
        return (QueuememberImpl) object;
    }

    /**
     * l�d ein SipregisterImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadSipregisterList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from SipregisterImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SipregisterImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadSipregisterList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from SipregisterImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SipregisterImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static SipregisterImpl loadSipregisterObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(SipregisterImpl.class, id);
        // session.close();
        return (SipregisterImpl) object;
    }

    /**
     * l�d ein SipauthImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadSipauthList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from SipauthImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SipauthImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadSipauthList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from SipauthImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SipauthImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static SipauthImpl loadSipauthObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(SipauthImpl.class, id);
        // session.close();
        return (SipauthImpl) object;
    }

    /**
     * l�d ein SipConfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadSipConfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from SipConfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SipConfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadSipConfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from SipConfImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SipConfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static SipConfImpl loadSipConfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(SipConfImpl.class, id);
        // session.close();
        return (SipConfImpl) object;
    }

    /**
     * l�d ein SippeersImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadSippeersList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from SippeersImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SippeersImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadSippeersList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from SippeersImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SippeersImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static SippeersImpl loadSippeersObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(SippeersImpl.class, id);
        // session.close();
        return (SippeersImpl) object;
    }

    /**
     * l�d ein SipgeneralImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadSipgeneralList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from SipgeneralImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SipgeneralImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadSipgeneralList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from SipgeneralImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SipgeneralImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static SipgeneralImpl loadSipgeneralObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(SipgeneralImpl.class, id);
        // session.close();
        return (SipgeneralImpl) object;
    }

    /**
     * l�d ein ManagerSectionImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadManagerSectionList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ManagerSectionImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ManagerSectionImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadManagerSectionList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ManagerSectionImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ManagerSectionImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ManagerSectionImpl loadManagerSectionObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ManagerSectionImpl.class, id);
        // session.close();
        return (ManagerSectionImpl) object;
    }

    /**
     * l�d ein ManagerdenyImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadManagerdenyList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ManagerdenyImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ManagerdenyImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadManagerdenyList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ManagerdenyImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ManagerdenyImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ManagerdenyImpl loadManagerdenyObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ManagerdenyImpl.class, id);
        // session.close();
        return (ManagerdenyImpl) object;
    }

    /**
     * l�d ein ManagerpermitImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadManagerpermitList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ManagerpermitImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ManagerpermitImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadManagerpermitList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ManagerpermitImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ManagerpermitImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ManagerpermitImpl loadManagerpermitObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ManagerpermitImpl.class, id);
        // session.close();
        return (ManagerpermitImpl) object;
    }

    /**
     * l�d ein ManagergeneralSectionImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadManagergeneralSectionList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from ManagergeneralSectionImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ManagergeneralSectionImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadManagergeneralSectionList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from ManagergeneralSectionImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ManagergeneralSectionImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ManagergeneralSectionImpl loadManagergeneralSectionObject(
            Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ManagergeneralSectionImpl.class, id);
        // session.close();
        return (ManagergeneralSectionImpl) object;
    }

    /**
     * l�d ein AlarmreceiverconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadAlarmreceiverconfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from AlarmreceiverconfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein AlarmreceiverconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadAlarmreceiverconfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from AlarmreceiverconfImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein AlarmreceiverconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static AlarmreceiverconfImpl loadAlarmreceiverconfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(AlarmreceiverconfImpl.class, id);
        // session.close();
        return (AlarmreceiverconfImpl) object;
    }

    /**
     * l�d ein AgentsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadAgentsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from AgentsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein AgentsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadAgentsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from AgentsImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein AgentsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static AgentsImpl loadAgentsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(AgentsImpl.class, id);
        // session.close();
        return (AgentsImpl) object;
    }

    /**
     * l�d ein AgentsconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadAgentsconfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from AgentsconfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein AgentsconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadAgentsconfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from AgentsconfImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein AgentsconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static AgentsconfImpl loadAgentsconfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(AgentsconfImpl.class, id);
        // session.close();
        return (AgentsconfImpl) object;
    }

    /**
     * l�d ein AgentsrecordingImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadAgentsrecordingList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from AgentsrecordingImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein AgentsrecordingImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadAgentsrecordingList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from AgentsrecordingImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein AgentsrecordingImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static AgentsrecordingImpl loadAgentsrecordingObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(AgentsrecordingImpl.class, id);
        // session.close();
        return (AgentsrecordingImpl) object;
    }

    /**
     * l�d ein ZaptelchannelsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadZaptelchannelsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZaptelchannelsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZaptelchannelsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadZaptelchannelsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZaptelchannelsImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZaptelchannelsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ZaptelchannelsImpl loadZaptelchannelsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ZaptelchannelsImpl.class, id);
        // session.close();
        return (ZaptelchannelsImpl) object;
    }

    /**
     * l�d ein ZapteltonezoneImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadZapteltonezoneList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZapteltonezoneImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZapteltonezoneImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadZapteltonezoneList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZapteltonezoneImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZapteltonezoneImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ZapteltonezoneImpl loadZapteltonezoneObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ZapteltonezoneImpl.class, id);
        // session.close();
        return (ZapteltonezoneImpl) object;
    }

    /**
     * l�d ein ZaptelspanImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadZaptelspanList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZaptelspanImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZaptelspanImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadZaptelspanList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZaptelspanImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZaptelspanImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ZaptelspanImpl loadZaptelspanObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ZaptelspanImpl.class, id);
        // session.close();
        return (ZaptelspanImpl) object;
    }

    /**
     * l�d ein ZapteldynamicspanImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadZapteldynamicspanList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from ZapteldynamicspanImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZapteldynamicspanImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadZapteldynamicspanList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from ZapteldynamicspanImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZapteldynamicspanImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ZapteldynamicspanImpl loadZapteldynamicspanObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ZapteldynamicspanImpl.class, id);
        // session.close();
        return (ZapteldynamicspanImpl) object;
    }

    /**
     * l�d ein ZaptelconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadZaptelconfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZaptelconfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZaptelconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadZaptelconfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZaptelconfImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZaptelconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ZaptelconfImpl loadZaptelconfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ZaptelconfImpl.class, id);
        // session.close();
        return (ZaptelconfImpl) object;
    }

    /**
     * l�d ein IaxjitterImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadIaxjitterList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IaxjitterImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxjitterImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadIaxjitterList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IaxjitterImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxjitterImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IaxjitterImpl loadIaxjitterObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(IaxjitterImpl.class, id);
        // session.close();
        return (IaxjitterImpl) object;
    }

    /**
     * l�d ein IaxregisterImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadIaxregisterList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IaxregisterImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxregisterImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadIaxregisterList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IaxregisterImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxregisterImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IaxregisterImpl loadIaxregisterObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(IaxregisterImpl.class, id);
        // session.close();
        return (IaxregisterImpl) object;
    }

    /**
     * l�d ein IaxdenyImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadIaxdenyList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IaxdenyImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxdenyImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadIaxdenyList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from IaxdenyImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxdenyImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IaxdenyImpl loadIaxdenyObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(IaxdenyImpl.class, id);
        // session.close();
        return (IaxdenyImpl) object;
    }

    /**
     * l�d ein IaxpermitImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadIaxpermitList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IaxpermitImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxpermitImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadIaxpermitList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IaxpermitImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxpermitImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IaxpermitImpl loadIaxpermitObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(IaxpermitImpl.class, id);
        // session.close();
        return (IaxpermitImpl) object;
    }

    /**
     * l�d ein IaxpeerImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadIaxpeerList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IaxpeerImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxpeerImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadIaxpeerList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from IaxpeerImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxpeerImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IaxpeerImpl loadIaxpeerObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(IaxpeerImpl.class, id);
        // session.close();
        return (IaxpeerImpl) object;
    }

    /**
     * l�d ein IaxgeneralImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadIaxgeneralList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IaxgeneralImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxgeneralImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadIaxgeneralList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IaxgeneralImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IaxgeneralImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IaxgeneralImpl loadIaxgeneralObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(IaxgeneralImpl.class, id);
        // session.close();
        return (IaxgeneralImpl) object;
    }

    /**
     * l�d ein OtherImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadOtherList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from OtherImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein OtherImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadOtherList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from OtherImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein OtherImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static OtherImpl loadOtherObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(OtherImpl.class, id);
        // session.close();
        return (OtherImpl) object;
    }

    /**
     * l�d ein Analog_Handset_FeaturesImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadAnalog_Handset_FeaturesList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Analog_Handset_FeaturesImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Analog_Handset_FeaturesImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadAnalog_Handset_FeaturesList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Analog_Handset_FeaturesImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Analog_Handset_FeaturesImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static Analog_Handset_FeaturesImpl loadAnalog_Handset_FeaturesObject(
            Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(Analog_Handset_FeaturesImpl.class, id);
        // session.close();
        return (Analog_Handset_FeaturesImpl) object;
    }

    /**
     * l�d ein Timing_ParametersImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadTiming_ParametersList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Timing_ParametersImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Timing_ParametersImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadTiming_ParametersList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Timing_ParametersImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Timing_ParametersImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static Timing_ParametersImpl loadTiming_ParametersObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(Timing_ParametersImpl.class, id);
        // session.close();
        return (Timing_ParametersImpl) object;
    }

    /**
     * l�d ein Analog_Trunk_FeaturesImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadAnalog_Trunk_FeaturesList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Analog_Trunk_FeaturesImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Analog_Trunk_FeaturesImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadAnalog_Trunk_FeaturesList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Analog_Trunk_FeaturesImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Analog_Trunk_FeaturesImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static Analog_Trunk_FeaturesImpl loadAnalog_Trunk_FeaturesObject(
            Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(Analog_Trunk_FeaturesImpl.class, id);
        // session.close();
        return (Analog_Trunk_FeaturesImpl) object;
    }

    /**
     * l�d ein ISDN_PRI_SwitchImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadISDN_PRI_SwitchList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ISDN_PRI_SwitchImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ISDN_PRI_SwitchImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadISDN_PRI_SwitchList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ISDN_PRI_SwitchImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ISDN_PRI_SwitchImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ISDN_PRI_SwitchImpl loadISDN_PRI_SwitchObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ISDN_PRI_SwitchImpl.class, id);
        // session.close();
        return (ISDN_PRI_SwitchImpl) object;
    }

    /**
     * l�d ein Multilink_PPPImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMultilink_PPPList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from Multilink_PPPImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Multilink_PPPImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMultilink_PPPList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from Multilink_PPPImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Multilink_PPPImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static Multilink_PPPImpl loadMultilink_PPPObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(Multilink_PPPImpl.class, id);
        // session.close();
        return (Multilink_PPPImpl) object;
    }

    /**
     * l�d ein Audio_Quality_Tuning_OptionsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadAudio_Quality_Tuning_OptionsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Audio_Quality_Tuning_OptionsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Audio_Quality_Tuning_OptionsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadAudio_Quality_Tuning_OptionsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Audio_Quality_Tuning_OptionsImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Audio_Quality_Tuning_OptionsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static Audio_Quality_Tuning_OptionsImpl loadAudio_Quality_Tuning_OptionsObject(
            Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session
                .load(Audio_Quality_Tuning_OptionsImpl.class, id);
        // session.close();
        return (Audio_Quality_Tuning_OptionsImpl) object;
    }

    /**
     * l�d ein ZaptelchannelImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadZaptelchannelList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZaptelchannelImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZaptelchannelImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadZaptelchannelList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZaptelchannelImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZaptelchannelImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ZaptelchannelImpl loadZaptelchannelObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ZaptelchannelImpl.class, id);
        // session.close();
        return (ZaptelchannelImpl) object;
    }

    /**
     * l�d ein Call_Logging_OptionsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadCall_Logging_OptionsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Call_Logging_OptionsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Call_Logging_OptionsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadCall_Logging_OptionsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Call_Logging_OptionsImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Call_Logging_OptionsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static Call_Logging_OptionsImpl loadCall_Logging_OptionsObject(
            Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(Call_Logging_OptionsImpl.class, id);
        // session.close();
        return (Call_Logging_OptionsImpl) object;
    }

    /**
     * l�d ein Caller_ID_OptionsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadCaller_ID_OptionsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Caller_ID_OptionsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Caller_ID_OptionsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadCaller_ID_OptionsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Caller_ID_OptionsImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Caller_ID_OptionsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static Caller_ID_OptionsImpl loadCaller_ID_OptionsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(Caller_ID_OptionsImpl.class, id);
        // session.close();
        return (Caller_ID_OptionsImpl) object;
    }

    /**
     * l�d ein ZapataconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadZapataconfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZapataconfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZapataconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadZapataconfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZapataconfImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZapataconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ZapataconfImpl loadZapataconfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ZapataconfImpl.class, id);
        // session.close();
        return (ZapataconfImpl) object;
    }

    /**
     * l�d ein MeetmeconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMeetmeconfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MeetmeconfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MeetmeconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMeetmeconfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MeetmeconfImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MeetmeconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MeetmeconfImpl loadMeetmeconfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(MeetmeconfImpl.class, id);
        // session.close();
        return (MeetmeconfImpl) object;
    }

    /**
     * l�d ein MeetmeroomsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMeetmeroomsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MeetmeroomsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MeetmeroomsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMeetmeroomsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MeetmeroomsImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MeetmeroomsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MeetmeroomsImpl loadMeetmeroomsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(MeetmeroomsImpl.class, id);
        // session.close();
        return (MeetmeroomsImpl) object;
    }

    /**
     * l�d ein VoicemailgeneralImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadVoicemailgeneralList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from VoicemailgeneralImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein VoicemailgeneralImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadVoicemailgeneralList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from VoicemailgeneralImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein VoicemailgeneralImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static VoicemailgeneralImpl loadVoicemailgeneralObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(VoicemailgeneralImpl.class, id);
        // session.close();
        return (VoicemailgeneralImpl) object;
    }

    /**
     * l�d ein VoicemailConfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadVoicemailConfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from VoicemailConfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein VoicemailConfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadVoicemailConfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from VoicemailConfImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein VoicemailConfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static VoicemailConfImpl loadVoicemailConfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(VoicemailConfImpl.class, id);
        // session.close();
        return (VoicemailConfImpl) object;
    }

    /**
     * l�d ein VoicemailcontextImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadVoicemailcontextList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from VoicemailcontextImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein VoicemailcontextImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadVoicemailcontextList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from VoicemailcontextImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein VoicemailcontextImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static VoicemailcontextImpl loadVoicemailcontextObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(VoicemailcontextImpl.class, id);
        // session.close();
        return (VoicemailcontextImpl) object;
    }

    /**
     * l�d ein ZonemessagesImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadZonemessagesList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZonemessagesImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZonemessagesImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadZonemessagesList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ZonemessagesImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ZonemessagesImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ZonemessagesImpl loadZonemessagesObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ZonemessagesImpl.class, id);
        // session.close();
        return (ZonemessagesImpl) object;
    }

    /**
     * l�d ein VoicemailcontextentryImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadVoicemailcontextentryList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from VoicemailcontextentryImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein VoicemailcontextentryImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadVoicemailcontextentryList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from VoicemailcontextentryImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein VoicemailcontextentryImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static VoicemailcontextentryImpl loadVoicemailcontextentryObject(
            Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(VoicemailcontextentryImpl.class, id);
        // session.close();
        return (VoicemailcontextentryImpl) object;
    }

    /**
     * l�d ein MohClassesImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMohClassesList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MohClassesImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MohClassesImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMohClassesList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MohClassesImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MohClassesImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MohClassesImpl loadMohClassesObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(MohClassesImpl.class, id);
        // session.close();
        return (MohClassesImpl) object;
    }

    /**
     * l�d ein Music_on_HoldConfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMusic_on_HoldConfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Music_on_HoldConfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Music_on_HoldConfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMusic_on_HoldConfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from Music_on_HoldConfImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein Music_on_HoldConfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static Music_on_HoldConfImpl loadMusic_on_HoldConfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(Music_on_HoldConfImpl.class, id);
        // session.close();
        return (Music_on_HoldConfImpl) object;
    }

    /**
     * l�d ein FeaturemapImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadFeaturemapList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from FeaturemapImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein FeaturemapImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadFeaturemapList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from FeaturemapImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein FeaturemapImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static FeaturemapImpl loadFeaturemapObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(FeaturemapImpl.class, id);
        // session.close();
        return (FeaturemapImpl) object;
    }

    /**
     * l�d ein FeaturesconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadFeaturesconfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from FeaturesconfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein FeaturesconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadFeaturesconfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from FeaturesconfImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein FeaturesconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static FeaturesconfImpl loadFeaturesconfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(FeaturesconfImpl.class, id);
        // session.close();
        return (FeaturesconfImpl) object;
    }

    /**
     * l�d ein ToneDefinitionsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadToneDefinitionsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ToneDefinitionsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ToneDefinitionsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadToneDefinitionsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ToneDefinitionsImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ToneDefinitionsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ToneDefinitionsImpl loadToneDefinitionsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ToneDefinitionsImpl.class, id);
        // session.close();
        return (ToneDefinitionsImpl) object;
    }

    /**
     * l�d ein CustomToneImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadCustomToneList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from CustomToneImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein CustomToneImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadCustomToneList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from CustomToneImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein CustomToneImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static CustomToneImpl loadCustomToneObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(CustomToneImpl.class, id);
        // session.close();
        return (CustomToneImpl) object;
    }

    /**
     * l�d ein IndicationsconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadIndicationsconfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IndicationsconfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IndicationsconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadIndicationsconfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IndicationsconfImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IndicationsconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IndicationsconfImpl loadIndicationsconfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(IndicationsconfImpl.class, id);
        // session.close();
        return (IndicationsconfImpl) object;
    }

    /**
     * l�d ein MisdncardPortsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMisdncardPortsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdncardPortsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdncardPortsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMisdncardPortsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdncardPortsImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdncardPortsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MisdncardPortsImpl loadMisdncardPortsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(MisdncardPortsImpl.class, id);
        // session.close();
        return (MisdncardPortsImpl) object;
    }

    /**
     * l�d ein MisdnCardsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMisdnCardsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnCardsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnCardsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMisdnCardsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnCardsImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnCardsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MisdnCardsImpl loadMisdnCardsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(MisdnCardsImpl.class, id);
        // session.close();
        return (MisdnCardsImpl) object;
    }

    /**
     * l�d ein MisdnDriverConfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMisdnDriverConfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnDriverConfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnDriverConfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMisdnDriverConfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnDriverConfImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnDriverConfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MisdnDriverConfImpl loadMisdnDriverConfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(MisdnDriverConfImpl.class, id);
        // session.close();
        return (MisdnDriverConfImpl) object;
    }

    /**
     * l�d ein MisdnconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMisdnconfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnconfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMisdnconfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnconfImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MisdnconfImpl loadMisdnconfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(MisdnconfImpl.class, id);
        // session.close();
        return (MisdnconfImpl) object;
    }

    /**
     * l�d ein MisdnCryptkeyImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMisdnCryptkeyList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnCryptkeyImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnCryptkeyImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMisdnCryptkeyList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnCryptkeyImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnCryptkeyImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MisdnCryptkeyImpl loadMisdnCryptkeyObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(MisdnCryptkeyImpl.class, id);
        // session.close();
        return (MisdnCryptkeyImpl) object;
    }

    /**
     * l�d ein MisdnSectionsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMisdnSectionsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnSectionsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnSectionsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMisdnSectionsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnSectionsImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnSectionsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MisdnSectionsImpl loadMisdnSectionsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(MisdnSectionsImpl.class, id);
        // session.close();
        return (MisdnSectionsImpl) object;
    }

    /**
     * l�d ein MisdnPortsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadMisdnPortsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnPortsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnPortsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadMisdnPortsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from MisdnPortsImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein MisdnPortsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static MisdnPortsImpl loadMisdnPortsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(MisdnPortsImpl.class, id);
        // session.close();
        return (MisdnPortsImpl) object;
    }

    /**
     * l�d ein ExtensionImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadExtensionList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ExtensionImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ExtensionImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadExtensionList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ExtensionImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ExtensionImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ExtensionImpl loadExtensionObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ExtensionImpl.class, id);
        // session.close();
        return (ExtensionImpl) object;
    }

    /**
     * l�d ein ContextImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadContextList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ContextImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ContextImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadContextList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session
                .createQuery("from ContextImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ContextImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ContextImpl loadContextObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ContextImpl.class, id);
        // session.close();
        return (ContextImpl) object;
    }

    /**
     * l�d ein IncludecontextImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadIncludecontextList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IncludecontextImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IncludecontextImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadIncludecontextList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IncludecontextImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IncludecontextImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IncludecontextImpl loadIncludecontextObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(IncludecontextImpl.class, id);
        // session.close();
        return (IncludecontextImpl) object;
    }

    /**
     * l�d ein SwitchImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadSwitchList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from SwitchImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SwitchImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadSwitchList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from SwitchImpl " + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein SwitchImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static SwitchImpl loadSwitchObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(SwitchImpl.class, id);
        // session.close();
        return (SwitchImpl) object;
    }

    /**
     * l�d ein ExtensionconfImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadExtensionconfList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ExtensionconfImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ExtensionconfImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadExtensionconfList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from ExtensionconfImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein ExtensionconfImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static ExtensionconfImpl loadExtensionconfObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(ExtensionconfImpl.class, id);
        // session.close();
        return (ExtensionconfImpl) object;
    }

    /**
     * l�d ein GlobalvarsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadGlobalvarsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from GlobalvarsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein GlobalvarsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadGlobalvarsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from GlobalvarsImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein GlobalvarsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static GlobalvarsImpl loadGlobalvarsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(GlobalvarsImpl.class, id);
        // session.close();
        return (GlobalvarsImpl) object;
    }

    /**
     * l�d ein IncludeconfigsImpl liste aus der datenbank
     * 
     * @param id
     * @return
     */
    public static List loadIncludeconfigsList() {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IncludeconfigsImpl");
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IncludeconfigsImpl liste aus der datenbank
     * 
     * @param id
     * @param wehere
     * @return
     */
    public static List loadIncludeconfigsList(String where) {
        Session session = HibernateUtil.getSession();
        session.flush();
        org.hibernate.Query q = session.createQuery("from IncludeconfigsImpl "
                + where);
        List ls = q.list(); //
        // session.close();
        return ls;
    }

    /**
     * l�d ein IncludeconfigsImpl aus der datenbank
     * 
     * @param id
     * @return
     */
    public static IncludeconfigsImpl loadIncludeconfigsObject(Integer id) {
        Session session = HibernateUtil.getSession();
        session.flush();
        Object object = session.load(IncludeconfigsImpl.class, id);
        // session.close();
        return (IncludeconfigsImpl) object;
    }

}
