/*
 * (c) urs zeidler
 */
package com.useit.jact.io.sipconf;


import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.Sipregister;

/** 
 * <p> 
 * XmlWriter 
 * </p> 
 * Created : 07.08.2005 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.1 2008/06/24 20:45:24 urszeidler Exp $ 
 */
public class  XmlWriter {

    /**
     * ruft die entsprechende write methode auf
     * @param strB
     * @param data
     */
    public static Element writeConf(Document doc,Object data){
	    if(data instanceof Sipregister){
    		return writeSipregister(doc,(Sipregister)data);
    	}
	    if(data instanceof Sipauth){
    		return writeSipauth(doc,(Sipauth)data);
    	}
	    if(data instanceof SipConf){
    		return writeSipConf(doc,(SipConf)data);
    	}
	    if(data instanceof Sipgeneral){
    		return writeSipgeneral(doc,(Sipgeneral)data);
    	}
	    if(data instanceof Sippeers){
    		return writeSippeers(doc,(Sippeers)data);
    	}
	return null;      
    }

 

    /**
     * @param strB
     * @param msec
     */
    public static Element writeSipregister(Document doc, Sipregister impl) {
     Element xSipregister = doc.createElement("Sipregister");
 	
 	//felder schreiben
   if(impl.getUser()!=null)
        xSipregister.setAttribute("user", impl.getUser().toString() );
   if(impl.getAuthuser()!=null)
        xSipregister.setAttribute("authuser", impl.getAuthuser().toString() );
   if(impl.getSecret()!=null)
        xSipregister.setAttribute("secret", impl.getSecret().toString() );
   if(impl.getHost()!=null)
        xSipregister.setAttribute("host", impl.getHost().toString() );
   if(impl.getPort()!=null)
        xSipregister.setAttribute("port", impl.getPort().toString() );
   if(impl.getExtension()!=null)
        xSipregister.setAttribute("extension", impl.getExtension().toString() );
    //aggregate schreiben

    doc.appendChild(xSipregister);
    return xSipregister;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeSipauth(Document doc, Sipauth impl) {
     Element xSipauth = doc.createElement("Sipauth");
 	
 	//felder schreiben
   if(impl.getUser()!=null)
        xSipauth.setAttribute("user", impl.getUser().toString() );
   if(impl.getSecret()!=null)
        xSipauth.setAttribute("secret", impl.getSecret().toString() );
   if(impl.getMd5secret()!=null)
        xSipauth.setAttribute("md5secret", impl.getMd5secret().toString() );
   if(impl.getRealm()!=null)
        xSipauth.setAttribute("realm", impl.getRealm().toString() );
    //aggregate schreiben

    doc.appendChild(xSipauth);
    return xSipauth;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeSipConf(Document doc, SipConf impl) {
     Element xSipConf = doc.createElement("SipConf");
 	
 	//felder schreiben
    //aggregate schreiben
     Element xSipgeneralAgg = writeSipgeneral(doc, impl.getSipgeneral());
     xSipConf.appendChild(xSipgeneralAgg);

   //maps schreiben

        for (Iterator iter = impl.getSippeersMap().iterator(); iter.hasNext();) {
            Sippeers mobj = (Sippeers) iter.next();
            
           Element xSippeers = writeSippeers(doc,mobj);
           xSipConf.appendChild(xSippeers);
            
        }
    doc.appendChild(xSipConf);
    return xSipConf;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeSipgeneral(Document doc, Sipgeneral impl) {
     Element xSipgeneral = doc.createElement("Sipgeneral");
 	
 	//felder schreiben
   if(impl.getAutocreatepeer()!=null)
        xSipgeneral.setAttribute("autocreatepeer", impl.getAutocreatepeer().toString() );
   if(impl.getBindaddr()!=null)
        xSipgeneral.setAttribute("bindaddr", impl.getBindaddr().toString() );
   if(impl.getBindport()!=null)
        xSipgeneral.setAttribute("bindport", impl.getBindport().toString() );
   if(impl.getCanreinvite()!=null)
        xSipgeneral.setAttribute("canreinvite", impl.getCanreinvite().toString() );
   if(impl.getContext()!=null)
        xSipgeneral.setAttribute("context", impl.getContext().toString() );
   if(impl.getDefaultexpirey()!=null)
        xSipgeneral.setAttribute("defaultexpirey", impl.getDefaultexpirey().toString() );
   if(impl.getDtmfmode()!=null)
        xSipgeneral.setAttribute("dtmfmode", impl.getDtmfmode().toString() );
   if(impl.getExternip()!=null)
        xSipgeneral.setAttribute("externip", impl.getExternip().toString() );
   if(impl.getExternhost()!=null)
        xSipgeneral.setAttribute("externhost", impl.getExternhost().toString() );
   if(impl.getExternrefresh()!=null)
        xSipgeneral.setAttribute("externrefresh", impl.getExternrefresh().toString() );
   if(impl.getLocalnet()!=null)
        xSipgeneral.setAttribute("localnet", impl.getLocalnet().toString() );
   if(impl.getFromdomain()!=null)
        xSipgeneral.setAttribute("fromdomain", impl.getFromdomain().toString() );
   if(impl.getMaxexpirey()!=null)
        xSipgeneral.setAttribute("maxexpirey", impl.getMaxexpirey().toString() );
   if(impl.getNat()!=null)
        xSipgeneral.setAttribute("nat", impl.getNat().toString() );
   if(impl.getNotifymimetype()!=null)
        xSipgeneral.setAttribute("notifymimetype", impl.getNotifymimetype().toString() );
   if(impl.getPedantic()!=null)
        xSipgeneral.setAttribute("pedantic", impl.getPedantic().toString() );
   if(impl.getPort()!=null)
        xSipgeneral.setAttribute("port", impl.getPort().toString() );
   if(impl.getPromiscredir()!=null)
        xSipgeneral.setAttribute("promiscredir", impl.getPromiscredir().toString() );
   if(impl.getSrvlookup()!=null)
        xSipgeneral.setAttribute("srvlookup", impl.getSrvlookup().toString() );
   if(impl.getTos()!=null)
        xSipgeneral.setAttribute("tos", impl.getTos().toString() );
   if(impl.getVideosupport()!=null)
        xSipgeneral.setAttribute("videosupport", impl.getVideosupport().toString() );
   if(impl.getUseragent()!=null)
        xSipgeneral.setAttribute("useragent", impl.getUseragent().toString() );
   if(impl.getTrustrpid()!=null)
        xSipgeneral.setAttribute("trustrpid", impl.getTrustrpid().toString() );
   if(impl.getRealm()!=null)
        xSipgeneral.setAttribute("realm", impl.getRealm().toString() );
   if(impl.getRtptimeout()!=null)
        xSipgeneral.setAttribute("rtptimeout", impl.getRtptimeout().toString() );
   if(impl.getRelaxdtmf()!=null)
        xSipgeneral.setAttribute("relaxdtmf", impl.getRelaxdtmf().toString() );
   if(impl.getRtpholdtimeout()!=null)
        xSipgeneral.setAttribute("rtpholdtimeout", impl.getRtpholdtimeout().toString() );
   if(impl.getProgressinband()!=null)
        xSipgeneral.setAttribute("progressinband", impl.getProgressinband().toString() );
   if(impl.getUsereqphone()!=null)
        xSipgeneral.setAttribute("usereqphone", impl.getUsereqphone().toString() );
   if(impl.getCompactheaders()!=null)
        xSipgeneral.setAttribute("compactheaders", impl.getCompactheaders().toString() );
   if(impl.getSipdebug()!=null)
        xSipgeneral.setAttribute("sipdebug", impl.getSipdebug().toString() );
   if(impl.getCheckmwi()!=null)
        xSipgeneral.setAttribute("checkmwi", impl.getCheckmwi().toString() );
   if(impl.getRecordhistory()!=null)
        xSipgeneral.setAttribute("recordhistory", impl.getRecordhistory().toString() );
   if(impl.getAllow()!=null)
        xSipgeneral.setAttribute("allow", impl.getAllow().toString() );
   if(impl.getDisallow()!=null)
        xSipgeneral.setAttribute("disallow", impl.getDisallow().toString() );
    //aggregate schreiben

   //maps schreiben

        for (Iterator iter = impl.getSipauthMap().iterator(); iter.hasNext();) {
            Sipauth mobj = (Sipauth) iter.next();
            
           Element xSipauth = writeSipauth(doc,mobj);
           xSipgeneral.appendChild(xSipauth);
            
        }
   //maps schreiben

        for (Iterator iter = impl.getSipregisterMap().iterator(); iter.hasNext();) {
            Sipregister mobj = (Sipregister) iter.next();
            
           Element xSipregister = writeSipregister(doc,mobj);
           xSipgeneral.appendChild(xSipregister);
            
        }
    doc.appendChild(xSipgeneral);
    return xSipgeneral;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeSippeers(Document doc, Sippeers impl) {
     Element xSippeers = doc.createElement("Sippeers");
 	
 	//felder schreiben
   if(impl.getSectionname()!=null)
        xSippeers.setAttribute("sectionname", impl.getSectionname().toString() );
   if(impl.getAccountcode()!=null)
        xSippeers.setAttribute("accountcode", impl.getAccountcode().toString() );
   if(impl.getAmaflags()!=null)
        xSippeers.setAttribute("amaflags", impl.getAmaflags().toString() );
   if(impl.getCallgroup()!=null)
        xSippeers.setAttribute("callgroup", impl.getCallgroup().toString() );
   if(impl.getCanreinvite()!=null)
        xSippeers.setAttribute("canreinvite", impl.getCanreinvite().toString() );
   if(impl.getContext()!=null)
        xSippeers.setAttribute("context", impl.getContext().toString() );
   if(impl.getDefaultip()!=null)
        xSippeers.setAttribute("defaultip", impl.getDefaultip().toString() );
   if(impl.getDtmfmode()!=null)
        xSippeers.setAttribute("dtmfmode", impl.getDtmfmode().toString() );
   if(impl.getFromuser()!=null)
        xSippeers.setAttribute("fromuser", impl.getFromuser().toString() );
   if(impl.getFromdomain()!=null)
        xSippeers.setAttribute("fromdomain", impl.getFromdomain().toString() );
   if(impl.getHost()!=null)
        xSippeers.setAttribute("host", impl.getHost().toString() );
   if(impl.getIncominglimit()!=null)
        xSippeers.setAttribute("incominglimit", impl.getIncominglimit().toString() );
   if(impl.getOutgoinglimit()!=null)
        xSippeers.setAttribute("outgoinglimit", impl.getOutgoinglimit().toString() );
   if(impl.getInsecure()!=null)
        xSippeers.setAttribute("insecure", impl.getInsecure().toString() );
   if(impl.getLanguage()!=null)
        xSippeers.setAttribute("language", impl.getLanguage().toString() );
   if(impl.getMailbox()!=null)
        xSippeers.setAttribute("mailbox", impl.getMailbox().toString() );
   if(impl.getMd5secret()!=null)
        xSippeers.setAttribute("md5secret", impl.getMd5secret().toString() );
   if(impl.getNat()!=null)
        xSippeers.setAttribute("nat", impl.getNat().toString() );
   if(impl.getPickupgroup()!=null)
        xSippeers.setAttribute("pickupgroup", impl.getPickupgroup().toString() );
   if(impl.getPort()!=null)
        xSippeers.setAttribute("port", impl.getPort().toString() );
   if(impl.getQualify()!=null)
        xSippeers.setAttribute("qualify", impl.getQualify().toString() );
   if(impl.getRestrictcid()!=null)
        xSippeers.setAttribute("restrictcid", impl.getRestrictcid().toString() );
   if(impl.getRtptimeout()!=null)
        xSippeers.setAttribute("rtptimeout", impl.getRtptimeout().toString() );
   if(impl.getRtpholdtimeout()!=null)
        xSippeers.setAttribute("rtpholdtimeout", impl.getRtpholdtimeout().toString() );
   if(impl.getSecret()!=null)
        xSippeers.setAttribute("secret", impl.getSecret().toString() );
   if(impl.getType()!=null)
        xSippeers.setAttribute("type", impl.getType().toString() );
   if(impl.getUsername()!=null)
        xSippeers.setAttribute("username", impl.getUsername().toString() );
   if(impl.getMusiconhold()!=null)
        xSippeers.setAttribute("musiconhold", impl.getMusiconhold().toString() );
   if(impl.getCallerid()!=null)
        xSippeers.setAttribute("callerid", impl.getCallerid().toString() );
   if(impl.getDisallow()!=null)
        xSippeers.setAttribute("disallow", impl.getDisallow().toString() );
   if(impl.getAllow()!=null)
        xSippeers.setAttribute("allow", impl.getAllow().toString() );
    //aggregate schreiben

   //maps schreiben

        for (Iterator iter = impl.getSipauthMap().iterator(); iter.hasNext();) {
            Sipauth mobj = (Sipauth) iter.next();
            
           Element xSipauth = writeSipauth(doc,mobj);
           xSippeers.appendChild(xSipauth);
            
        }
    doc.appendChild(xSippeers);
    return xSippeers;
    }
}
