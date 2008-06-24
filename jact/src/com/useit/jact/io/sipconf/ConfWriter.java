/*
 * (c) urs zeidler
 */
package com.useit.jact.io.sipconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.Sipregister;


/** 
 * <p> 
 * ConfWriter , schreibet einen Objektbaum als string
 * </p> 
 * Created : 07.08.2005 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.1 2008/06/24 20:45:24 urszeidler Exp $ 
 */
public class  ConfWriter extends AbstractConfWriter{
   /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);


   /** der Token speicher um zu writen **/
   protected class  SipregisterwriteHelper {

	public String user_StartToken;
	public String user_StopToken;
	public void writeuser(StringBuffer strB,Sipregister impl){
      if(impl.getUser()!=null
      	&& user_StartToken!=null
      ){
      strB
       	.append(user_StartToken)
       	.append(impl.getUser())
       	.append(user_StopToken);
	   } 
	}
	public String authuser_StartToken;
	public String authuser_StopToken;
	public void writeauthuser(StringBuffer strB,Sipregister impl){
      if(impl.getAuthuser()!=null
      	&& authuser_StartToken!=null
      ){
      strB
       	.append(authuser_StartToken)
       	.append(impl.getAuthuser())
       	.append(authuser_StopToken);
	   } 
	}
	public String secret_StartToken;
	public String secret_StopToken;
	public void writesecret(StringBuffer strB,Sipregister impl){
      if(impl.getSecret()!=null
      	&& secret_StartToken!=null
      ){
      strB
       	.append(secret_StartToken)
       	.append(impl.getSecret())
       	.append(secret_StopToken);
	   } 
	}
	public String host_StartToken;
	public String host_StopToken;
	public void writehost(StringBuffer strB,Sipregister impl){
      if(impl.getHost()!=null
      	&& host_StartToken!=null
      ){
      strB
       	.append(host_StartToken)
       	.append(impl.getHost())
       	.append(host_StopToken);
	   } 
	}
	public String port_StartToken;
	public String port_StopToken;
	public void writeport(StringBuffer strB,Sipregister impl){
      if(impl.getPort()!=null
      	&& port_StartToken!=null
      ){
      strB
       	.append(port_StartToken)
       	.append(impl.getPort())
       	.append(port_StopToken);
	   } 
	}
	public String extension_StartToken;
	public String extension_StopToken;
	public void writeextension(StringBuffer strB,Sipregister impl){
      if(impl.getExtension()!=null
      	&& extension_StartToken!=null
      ){
      strB
       	.append(extension_StartToken)
       	.append(impl.getExtension())
       	.append(extension_StopToken);
	   } 
	}
    }; // end of SipregisterwriteHelper Declaration


   /** der Token speicher um zu writen **/
   protected class  SipauthwriteHelper {

	public String user_StartToken;
	public String user_StopToken;
	public void writeuser(StringBuffer strB,Sipauth impl){
      if(impl.getUser()!=null
      	&& user_StartToken!=null
      ){
      strB
       	.append(user_StartToken)
       	.append(impl.getUser())
       	.append(user_StopToken);
	   } 
	}
	public String secret_StartToken;
	public String secret_StopToken;
	public void writesecret(StringBuffer strB,Sipauth impl){
      if(impl.getSecret()!=null
      	&& secret_StartToken!=null
      ){
      strB
       	.append(secret_StartToken)
       	.append(impl.getSecret())
       	.append(secret_StopToken);
	   } 
	}
	public String md5secret_StartToken;
	public String md5secret_StopToken;
	public void writemd5secret(StringBuffer strB,Sipauth impl){
      if(impl.getMd5secret()!=null
      	&& md5secret_StartToken!=null
      ){
      strB
       	.append(md5secret_StartToken)
       	.append(impl.getMd5secret())
       	.append(md5secret_StopToken);
	   } 
	}
	public String realm_StartToken;
	public String realm_StopToken;
	public void writerealm(StringBuffer strB,Sipauth impl){
      if(impl.getRealm()!=null
      	&& realm_StartToken!=null
      ){
      strB
       	.append(realm_StartToken)
       	.append(impl.getRealm())
       	.append(realm_StopToken);
	   } 
	}
    }; // end of SipauthwriteHelper Declaration


   /** der Token speicher um zu writen **/
   protected class  SipConfwriteHelper {

    }; // end of SipConfwriteHelper Declaration


   /** der Token speicher um zu writen **/
   protected class  SipgeneralwriteHelper {

	public String autocreatepeer_StartToken;
	public String autocreatepeer_StopToken;
	public void writeautocreatepeer(StringBuffer strB,Sipgeneral impl){
      if(impl.getAutocreatepeer()!=null
      	&& autocreatepeer_StartToken!=null
      ){
      strB
       	.append(autocreatepeer_StartToken)
       	.append(impl.getAutocreatepeer())
       	.append(autocreatepeer_StopToken);
	   } 
	}
	public String bindaddr_StartToken;
	public String bindaddr_StopToken;
	public void writebindaddr(StringBuffer strB,Sipgeneral impl){
      if(impl.getBindaddr()!=null
      	&& bindaddr_StartToken!=null
      ){
      strB
       	.append(bindaddr_StartToken)
       	.append(impl.getBindaddr())
       	.append(bindaddr_StopToken);
	   } 
	}
	public String bindport_StartToken;
	public String bindport_StopToken;
	public void writebindport(StringBuffer strB,Sipgeneral impl){
      if(impl.getBindport()!=null
      	&& bindport_StartToken!=null
      ){
      strB
       	.append(bindport_StartToken)
       	.append(impl.getBindport())
       	.append(bindport_StopToken);
	   } 
	}
	public String canreinvite_StartToken;
	public String canreinvite_StopToken;
	public void writecanreinvite(StringBuffer strB,Sipgeneral impl){
      if(impl.getCanreinvite()!=null
      	&& canreinvite_StartToken!=null
      ){
      strB
       	.append(canreinvite_StartToken)
       	.append(impl.getCanreinvite())
       	.append(canreinvite_StopToken);
	   } 
	}
	public String context_StartToken;
	public String context_StopToken;
	public void writecontext(StringBuffer strB,Sipgeneral impl){
      if(impl.getContext()!=null
      	&& context_StartToken!=null
      ){
      strB
       	.append(context_StartToken)
       	.append(impl.getContext())
       	.append(context_StopToken);
	   } 
	}
	public String defaultexpirey_StartToken;
	public String defaultexpirey_StopToken;
	public void writedefaultexpirey(StringBuffer strB,Sipgeneral impl){
      if(impl.getDefaultexpirey()!=null
      	&& defaultexpirey_StartToken!=null
      ){
      strB
       	.append(defaultexpirey_StartToken)
       	.append(impl.getDefaultexpirey())
       	.append(defaultexpirey_StopToken);
	   } 
	}
	public String dtmfmode_StartToken;
	public String dtmfmode_StopToken;
	public void writedtmfmode(StringBuffer strB,Sipgeneral impl){
      if(impl.getDtmfmode()!=null
      	&& dtmfmode_StartToken!=null
      ){
      strB
       	.append(dtmfmode_StartToken)
       	.append(impl.getDtmfmode())
       	.append(dtmfmode_StopToken);
	   } 
	}
	public String externip_StartToken;
	public String externip_StopToken;
	public void writeexternip(StringBuffer strB,Sipgeneral impl){
      if(impl.getExternip()!=null
      	&& externip_StartToken!=null
      ){
      strB
       	.append(externip_StartToken)
       	.append(impl.getExternip())
       	.append(externip_StopToken);
	   } 
	}
	public String externhost_StartToken;
	public String externhost_StopToken;
	public void writeexternhost(StringBuffer strB,Sipgeneral impl){
      if(impl.getExternhost()!=null
      	&& externhost_StartToken!=null
      ){
      strB
       	.append(externhost_StartToken)
       	.append(impl.getExternhost())
       	.append(externhost_StopToken);
	   } 
	}
	public String externrefresh_StartToken;
	public String externrefresh_StopToken;
	public void writeexternrefresh(StringBuffer strB,Sipgeneral impl){
      if(impl.getExternrefresh()!=null
      	&& externrefresh_StartToken!=null
      ){
      strB
       	.append(externrefresh_StartToken)
       	.append(impl.getExternrefresh())
       	.append(externrefresh_StopToken);
	   } 
	}
	public String localnet_StartToken;
	public String localnet_StopToken;
	public void writelocalnet(StringBuffer strB,Sipgeneral impl){
      if(impl.getLocalnet()!=null
      	&& localnet_StartToken!=null
      ){
      strB
       	.append(localnet_StartToken)
       	.append(impl.getLocalnet())
       	.append(localnet_StopToken);
	   } 
	}
	public String fromdomain_StartToken;
	public String fromdomain_StopToken;
	public void writefromdomain(StringBuffer strB,Sipgeneral impl){
      if(impl.getFromdomain()!=null
      	&& fromdomain_StartToken!=null
      ){
      strB
       	.append(fromdomain_StartToken)
       	.append(impl.getFromdomain())
       	.append(fromdomain_StopToken);
	   } 
	}
	public String maxexpirey_StartToken;
	public String maxexpirey_StopToken;
	public void writemaxexpirey(StringBuffer strB,Sipgeneral impl){
      if(impl.getMaxexpirey()!=null
      	&& maxexpirey_StartToken!=null
      ){
      strB
       	.append(maxexpirey_StartToken)
       	.append(impl.getMaxexpirey())
       	.append(maxexpirey_StopToken);
	   } 
	}
	public String nat_StartToken;
	public String nat_StopToken;
	public void writenat(StringBuffer strB,Sipgeneral impl){
      if(impl.getNat()!=null
      	&& nat_StartToken!=null
      ){
      strB
       	.append(nat_StartToken)
       	.append(impl.getNat())
       	.append(nat_StopToken);
	   } 
	}
	public String notifymimetype_StartToken;
	public String notifymimetype_StopToken;
	public void writenotifymimetype(StringBuffer strB,Sipgeneral impl){
      if(impl.getNotifymimetype()!=null
      	&& notifymimetype_StartToken!=null
      ){
      strB
       	.append(notifymimetype_StartToken)
       	.append(impl.getNotifymimetype())
       	.append(notifymimetype_StopToken);
	   } 
	}
	public String pedantic_StartToken;
	public String pedantic_StopToken;
	public void writepedantic(StringBuffer strB,Sipgeneral impl){
      if(impl.getPedantic()!=null
      	&& pedantic_StartToken!=null
      ){
      strB
       	.append(pedantic_StartToken)
       	.append(impl.getPedantic())
       	.append(pedantic_StopToken);
	   } 
	}
	public String port_StartToken;
	public String port_StopToken;
	public void writeport(StringBuffer strB,Sipgeneral impl){
      if(impl.getPort()!=null
      	&& port_StartToken!=null
      ){
      strB
       	.append(port_StartToken)
       	.append(impl.getPort())
       	.append(port_StopToken);
	   } 
	}
	public String promiscredir_StartToken;
	public String promiscredir_StopToken;
	public void writepromiscredir(StringBuffer strB,Sipgeneral impl){
      if(impl.getPromiscredir()!=null
      	&& promiscredir_StartToken!=null
      ){
      strB
       	.append(promiscredir_StartToken)
       	.append(impl.getPromiscredir())
       	.append(promiscredir_StopToken);
	   } 
	}
	public String srvlookup_StartToken;
	public String srvlookup_StopToken;
	public void writesrvlookup(StringBuffer strB,Sipgeneral impl){
      if(impl.getSrvlookup()!=null
      	&& srvlookup_StartToken!=null
      ){
      strB
       	.append(srvlookup_StartToken)
       	.append(impl.getSrvlookup())
       	.append(srvlookup_StopToken);
	   } 
	}
	public String tos_StartToken;
	public String tos_StopToken;
	public void writetos(StringBuffer strB,Sipgeneral impl){
      if(impl.getTos()!=null
      	&& tos_StartToken!=null
      ){
      strB
       	.append(tos_StartToken)
       	.append(impl.getTos())
       	.append(tos_StopToken);
	   } 
	}
	public String videosupport_StartToken;
	public String videosupport_StopToken;
	public void writevideosupport(StringBuffer strB,Sipgeneral impl){
      if(impl.getVideosupport()!=null
      	&& videosupport_StartToken!=null
      ){
      strB
       	.append(videosupport_StartToken)
       	.append(impl.getVideosupport())
       	.append(videosupport_StopToken);
	   } 
	}
	public String useragent_StartToken;
	public String useragent_StopToken;
	public void writeuseragent(StringBuffer strB,Sipgeneral impl){
      if(impl.getUseragent()!=null
      	&& useragent_StartToken!=null
      ){
      strB
       	.append(useragent_StartToken)
       	.append(impl.getUseragent())
       	.append(useragent_StopToken);
	   } 
	}
	public String trustrpid_StartToken;
	public String trustrpid_StopToken;
	public void writetrustrpid(StringBuffer strB,Sipgeneral impl){
      if(impl.getTrustrpid()!=null
      	&& trustrpid_StartToken!=null
      ){
      strB
       	.append(trustrpid_StartToken)
       	.append(impl.getTrustrpid())
       	.append(trustrpid_StopToken);
	   } 
	}
	public String realm_StartToken;
	public String realm_StopToken;
	public void writerealm(StringBuffer strB,Sipgeneral impl){
      if(impl.getRealm()!=null
      	&& realm_StartToken!=null
      ){
      strB
       	.append(realm_StartToken)
       	.append(impl.getRealm())
       	.append(realm_StopToken);
	   } 
	}
	public String relaxdtmf_StartToken;
	public String relaxdtmf_StopToken;
	public void writerelaxdtmf(StringBuffer strB,Sipgeneral impl){
      if(impl.getRelaxdtmf()!=null
      	&& relaxdtmf_StartToken!=null
      ){
      strB
       	.append(relaxdtmf_StartToken)
       	.append(impl.getRelaxdtmf())
       	.append(relaxdtmf_StopToken);
	   } 
	}
	public String rtptimeout_StartToken;
	public String rtptimeout_StopToken;
	public void writertptimeout(StringBuffer strB,Sipgeneral impl){
      if(impl.getRtptimeout()!=null
      	&& rtptimeout_StartToken!=null
      ){
      strB
       	.append(rtptimeout_StartToken)
       	.append(impl.getRtptimeout())
       	.append(rtptimeout_StopToken);
	   } 
	}
	public String rtpholdtimeout_StartToken;
	public String rtpholdtimeout_StopToken;
	public void writertpholdtimeout(StringBuffer strB,Sipgeneral impl){
      if(impl.getRtpholdtimeout()!=null
      	&& rtpholdtimeout_StartToken!=null
      ){
      strB
       	.append(rtpholdtimeout_StartToken)
       	.append(impl.getRtpholdtimeout())
       	.append(rtpholdtimeout_StopToken);
	   } 
	}
	public String progressinband_StartToken;
	public String progressinband_StopToken;
	public void writeprogressinband(StringBuffer strB,Sipgeneral impl){
      if(impl.getProgressinband()!=null
      	&& progressinband_StartToken!=null
      ){
      strB
       	.append(progressinband_StartToken)
       	.append(impl.getProgressinband())
       	.append(progressinband_StopToken);
	   } 
	}
	public String usereqphone_StartToken;
	public String usereqphone_StopToken;
	public void writeusereqphone(StringBuffer strB,Sipgeneral impl){
      if(impl.getUsereqphone()!=null
      	&& usereqphone_StartToken!=null
      ){
      strB
       	.append(usereqphone_StartToken)
       	.append(impl.getUsereqphone())
       	.append(usereqphone_StopToken);
	   } 
	}
	public String compactheaders_StartToken;
	public String compactheaders_StopToken;
	public void writecompactheaders(StringBuffer strB,Sipgeneral impl){
      if(impl.getCompactheaders()!=null
      	&& compactheaders_StartToken!=null
      ){
      strB
       	.append(compactheaders_StartToken)
       	.append(impl.getCompactheaders())
       	.append(compactheaders_StopToken);
	   } 
	}
	public String sipdebug_StartToken;
	public String sipdebug_StopToken;
	public void writesipdebug(StringBuffer strB,Sipgeneral impl){
      if(impl.getSipdebug()!=null
      	&& sipdebug_StartToken!=null
      ){
      strB
       	.append(sipdebug_StartToken)
       	.append(impl.getSipdebug())
       	.append(sipdebug_StopToken);
	   } 
	}
	public String checkmwi_StartToken;
	public String checkmwi_StopToken;
	public void writecheckmwi(StringBuffer strB,Sipgeneral impl){
      if(impl.getCheckmwi()!=null
      	&& checkmwi_StartToken!=null
      ){
      strB
       	.append(checkmwi_StartToken)
       	.append(impl.getCheckmwi())
       	.append(checkmwi_StopToken);
	   } 
	}
	public String recordhistory_StartToken;
	public String recordhistory_StopToken;
	public void writerecordhistory(StringBuffer strB,Sipgeneral impl){
      if(impl.getRecordhistory()!=null
      	&& recordhistory_StartToken!=null
      ){
      strB
       	.append(recordhistory_StartToken)
       	.append(impl.getRecordhistory())
       	.append(recordhistory_StopToken);
	   } 
	}
	public String allow_StartToken;
	public String allow_StopToken;
	public void writeallow(StringBuffer strB,Sipgeneral impl){
      if(impl.getAllow()!=null
      	&& allow_StartToken!=null
      ){
      strB
       	.append(allow_StartToken)
       	.append(impl.getAllow())
       	.append(allow_StopToken);
	   } 
	}
	public String disallow_StartToken;
	public String disallow_StopToken;
	public void writedisallow(StringBuffer strB,Sipgeneral impl){
      if(impl.getDisallow()!=null
      	&& disallow_StartToken!=null
      ){
      strB
       	.append(disallow_StartToken)
       	.append(impl.getDisallow())
       	.append(disallow_StopToken);
	   } 
	}
    }; // end of SipgeneralwriteHelper Declaration


   /** der Token speicher um zu writen **/
   protected class  SippeerswriteHelper {

	public String sectionname_StartToken;
	public String sectionname_StopToken;
	public void writesectionname(StringBuffer strB,Sippeers impl){
      if(impl.getSectionname()!=null
      	&& sectionname_StartToken!=null
      ){
      strB
       	.append(sectionname_StartToken)
       	.append(impl.getSectionname())
       	.append(sectionname_StopToken);
	   } 
	}
	public String accountcode_StartToken;
	public String accountcode_StopToken;
	public void writeaccountcode(StringBuffer strB,Sippeers impl){
      if(impl.getAccountcode()!=null
      	&& accountcode_StartToken!=null
      ){
      strB
       	.append(accountcode_StartToken)
       	.append(impl.getAccountcode())
       	.append(accountcode_StopToken);
	   } 
	}
	public String amaflags_StartToken;
	public String amaflags_StopToken;
	public void writeamaflags(StringBuffer strB,Sippeers impl){
      if(impl.getAmaflags()!=null
      	&& amaflags_StartToken!=null
      ){
      strB
       	.append(amaflags_StartToken)
       	.append(impl.getAmaflags())
       	.append(amaflags_StopToken);
	   } 
	}
	public String callgroup_StartToken;
	public String callgroup_StopToken;
	public void writecallgroup(StringBuffer strB,Sippeers impl){
      if(impl.getCallgroup()!=null
      	&& callgroup_StartToken!=null
      ){
      strB
       	.append(callgroup_StartToken)
       	.append(impl.getCallgroup())
       	.append(callgroup_StopToken);
	   } 
	}
	public String canreinvite_StartToken;
	public String canreinvite_StopToken;
	public void writecanreinvite(StringBuffer strB,Sippeers impl){
      if(impl.getCanreinvite()!=null
      	&& canreinvite_StartToken!=null
      ){
      strB
       	.append(canreinvite_StartToken)
       	.append(impl.getCanreinvite())
       	.append(canreinvite_StopToken);
	   } 
	}
	public String context_StartToken;
	public String context_StopToken;
	public void writecontext(StringBuffer strB,Sippeers impl){
      if(impl.getContext()!=null
      	&& context_StartToken!=null
      ){
      strB
       	.append(context_StartToken)
       	.append(impl.getContext())
       	.append(context_StopToken);
	   } 
	}
	public String defaultip_StartToken;
	public String defaultip_StopToken;
	public void writedefaultip(StringBuffer strB,Sippeers impl){
      if(impl.getDefaultip()!=null
      	&& defaultip_StartToken!=null
      ){
      strB
       	.append(defaultip_StartToken)
       	.append(impl.getDefaultip())
       	.append(defaultip_StopToken);
	   } 
	}
	public String dtmfmode_StartToken;
	public String dtmfmode_StopToken;
	public void writedtmfmode(StringBuffer strB,Sippeers impl){
      if(impl.getDtmfmode()!=null
      	&& dtmfmode_StartToken!=null
      ){
      strB
       	.append(dtmfmode_StartToken)
       	.append(impl.getDtmfmode())
       	.append(dtmfmode_StopToken);
	   } 
	}
	public String fromuser_StartToken;
	public String fromuser_StopToken;
	public void writefromuser(StringBuffer strB,Sippeers impl){
      if(impl.getFromuser()!=null
      	&& fromuser_StartToken!=null
      ){
      strB
       	.append(fromuser_StartToken)
       	.append(impl.getFromuser())
       	.append(fromuser_StopToken);
	   } 
	}
	public String fromdomain_StartToken;
	public String fromdomain_StopToken;
	public void writefromdomain(StringBuffer strB,Sippeers impl){
      if(impl.getFromdomain()!=null
      	&& fromdomain_StartToken!=null
      ){
      strB
       	.append(fromdomain_StartToken)
       	.append(impl.getFromdomain())
       	.append(fromdomain_StopToken);
	   } 
	}
	public String host_StartToken;
	public String host_StopToken;
	public void writehost(StringBuffer strB,Sippeers impl){
      if(impl.getHost()!=null
      	&& host_StartToken!=null
      ){
      strB
       	.append(host_StartToken)
       	.append(impl.getHost())
       	.append(host_StopToken);
	   } 
	}
	public String incominglimit_StartToken;
	public String incominglimit_StopToken;
	public void writeincominglimit(StringBuffer strB,Sippeers impl){
      if(impl.getIncominglimit()!=null
      	&& incominglimit_StartToken!=null
      ){
      strB
       	.append(incominglimit_StartToken)
       	.append(impl.getIncominglimit())
       	.append(incominglimit_StopToken);
	   } 
	}
	public String outgoinglimit_StartToken;
	public String outgoinglimit_StopToken;
	public void writeoutgoinglimit(StringBuffer strB,Sippeers impl){
      if(impl.getOutgoinglimit()!=null
      	&& outgoinglimit_StartToken!=null
      ){
      strB
       	.append(outgoinglimit_StartToken)
       	.append(impl.getOutgoinglimit())
       	.append(outgoinglimit_StopToken);
	   } 
	}
	public String insecure_StartToken;
	public String insecure_StopToken;
	public void writeinsecure(StringBuffer strB,Sippeers impl){
      if(impl.getInsecure()!=null
      	&& insecure_StartToken!=null
      ){
      strB
       	.append(insecure_StartToken)
       	.append(impl.getInsecure())
       	.append(insecure_StopToken);
	   } 
	}
	public String language_StartToken;
	public String language_StopToken;
	public void writelanguage(StringBuffer strB,Sippeers impl){
      if(impl.getLanguage()!=null
      	&& language_StartToken!=null
      ){
      strB
       	.append(language_StartToken)
       	.append(impl.getLanguage())
       	.append(language_StopToken);
	   } 
	}
	public String mailbox_StartToken;
	public String mailbox_StopToken;
	public void writemailbox(StringBuffer strB,Sippeers impl){
      if(impl.getMailbox()!=null
      	&& mailbox_StartToken!=null
      ){
      strB
       	.append(mailbox_StartToken)
       	.append(impl.getMailbox())
       	.append(mailbox_StopToken);
	   } 
	}
	public String md5secret_StartToken;
	public String md5secret_StopToken;
	public void writemd5secret(StringBuffer strB,Sippeers impl){
      if(impl.getMd5secret()!=null
      	&& md5secret_StartToken!=null
      ){
      strB
       	.append(md5secret_StartToken)
       	.append(impl.getMd5secret())
       	.append(md5secret_StopToken);
	   } 
	}
	public String nat_StartToken;
	public String nat_StopToken;
	public void writenat(StringBuffer strB,Sippeers impl){
      if(impl.getNat()!=null
      	&& nat_StartToken!=null
      ){
      strB
       	.append(nat_StartToken)
       	.append(impl.getNat())
       	.append(nat_StopToken);
	   } 
	}
	public String pickupgroup_StartToken;
	public String pickupgroup_StopToken;
	public void writepickupgroup(StringBuffer strB,Sippeers impl){
      if(impl.getPickupgroup()!=null
      	&& pickupgroup_StartToken!=null
      ){
      strB
       	.append(pickupgroup_StartToken)
       	.append(impl.getPickupgroup())
       	.append(pickupgroup_StopToken);
	   } 
	}
	public String port_StartToken;
	public String port_StopToken;
	public void writeport(StringBuffer strB,Sippeers impl){
      if(impl.getPort()!=null
      	&& port_StartToken!=null
      ){
      strB
       	.append(port_StartToken)
       	.append(impl.getPort())
       	.append(port_StopToken);
	   } 
	}
	public String qualify_StartToken;
	public String qualify_StopToken;
	public void writequalify(StringBuffer strB,Sippeers impl){
      if(impl.getQualify()!=null
      	&& qualify_StartToken!=null
      ){
      strB
       	.append(qualify_StartToken)
       	.append(impl.getQualify())
       	.append(qualify_StopToken);
	   } 
	}
	public String restrictcid_StartToken;
	public String restrictcid_StopToken;
	public void writerestrictcid(StringBuffer strB,Sippeers impl){
      if(impl.getRestrictcid()!=null
      	&& restrictcid_StartToken!=null
      ){
      strB
       	.append(restrictcid_StartToken)
       	.append(impl.getRestrictcid())
       	.append(restrictcid_StopToken);
	   } 
	}
	public String rtptimeout_StartToken;
	public String rtptimeout_StopToken;
	public void writertptimeout(StringBuffer strB,Sippeers impl){
      if(impl.getRtptimeout()!=null
      	&& rtptimeout_StartToken!=null
      ){
      strB
       	.append(rtptimeout_StartToken)
       	.append(impl.getRtptimeout())
       	.append(rtptimeout_StopToken);
	   } 
	}
	public String rtpholdtimeout_StartToken;
	public String rtpholdtimeout_StopToken;
	public void writertpholdtimeout(StringBuffer strB,Sippeers impl){
      if(impl.getRtpholdtimeout()!=null
      	&& rtpholdtimeout_StartToken!=null
      ){
      strB
       	.append(rtpholdtimeout_StartToken)
       	.append(impl.getRtpholdtimeout())
       	.append(rtpholdtimeout_StopToken);
	   } 
	}
	public String secret_StartToken;
	public String secret_StopToken;
	public void writesecret(StringBuffer strB,Sippeers impl){
      if(impl.getSecret()!=null
      	&& secret_StartToken!=null
      ){
      strB
       	.append(secret_StartToken)
       	.append(impl.getSecret())
       	.append(secret_StopToken);
	   } 
	}
	public String type_StartToken;
	public String type_StopToken;
	public void writetype(StringBuffer strB,Sippeers impl){
      if(impl.getType()!=null
      	&& type_StartToken!=null
      ){
      strB
       	.append(type_StartToken)
       	.append(impl.getType())
       	.append(type_StopToken);
	   } 
	}
	public String username_StartToken;
	public String username_StopToken;
	public void writeusername(StringBuffer strB,Sippeers impl){
      if(impl.getUsername()!=null
      	&& username_StartToken!=null
      ){
      strB
       	.append(username_StartToken)
       	.append(impl.getUsername())
       	.append(username_StopToken);
	   } 
	}
	public String musiconhold_StartToken;
	public String musiconhold_StopToken;
	public void writemusiconhold(StringBuffer strB,Sippeers impl){
      if(impl.getMusiconhold()!=null
      	&& musiconhold_StartToken!=null
      ){
      strB
       	.append(musiconhold_StartToken)
       	.append(impl.getMusiconhold())
       	.append(musiconhold_StopToken);
	   } 
	}
	public String callerid_StartToken;
	public String callerid_StopToken;
	public void writecallerid(StringBuffer strB,Sippeers impl){
      if(impl.getCallerid()!=null
      	&& callerid_StartToken!=null
      ){
      strB
       	.append(callerid_StartToken)
       	.append(impl.getCallerid())
       	.append(callerid_StopToken);
	   } 
	}
	public String disallow_StartToken;
	public String disallow_StopToken;
	public void writedisallow(StringBuffer strB,Sippeers impl){
      if(impl.getDisallow()!=null
      	&& disallow_StartToken!=null
      ){
      strB
       	.append(disallow_StartToken)
       	.append(impl.getDisallow())
       	.append(disallow_StopToken);
	   } 
	}
	public String allow_StartToken;
	public String allow_StopToken;
	public void writeallow(StringBuffer strB,Sippeers impl){
      if(impl.getAllow()!=null
      	&& allow_StartToken!=null
      ){
      strB
       	.append(allow_StartToken)
       	.append(impl.getAllow())
       	.append(allow_StopToken);
	   } 
	}
    }; // end of SippeerswriteHelper Declaration



	protected SipregisterwriteHelper theSipregisterwriteHelper;	
	protected SipauthwriteHelper theSipauthwriteHelper;	
	protected SipConfwriteHelper theSipConfwriteHelper;	
	protected SipgeneralwriteHelper theSipgeneralwriteHelper;	
	protected SippeerswriteHelper theSippeerswriteHelper;	
    /**
     * 
     */
    public ConfWriter() {
        super();

    }
    /**
     * schreibt die config als datei
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String string){
        File file = new File(string);
        try {
            UseFileHelper.writeStringToFile(file, writetoString(data));
        } catch (FileNotFoundException e) {
            LOGGER.error("writetoFile(Object data = " + data
                    + ", String string = " + string + ")", e);
        } catch (IOException e) {
            LOGGER.error("writetoFile(Object data = " + data
                    + ", String string = " + string + ")", e);
        }
        
    }

    /**
     * gibt die config als string zurück
     * @param data
     */
    public String writetoString(Object data) {
        StringBuffer strb= new StringBuffer();
        writeConf(strb, data);
        return strb.toString();
    }
   
    /**
     * ruft die entsprechende write methode auf
     * @param strB
     * @param data
     */
    public void writeConf(StringBuffer strB,Object data){
    if(data instanceof Sipregister){
    	writeSipregister(strB,(Sipregister)data);
    	return;
    }
    if(data instanceof Sipauth){
    	writeSipauth(strB,(Sipauth)data);
    	return;
    }
    if(data instanceof SipConf){
    	writeSipConf(strB,(SipConf)data);
    	return;
    }
    if(data instanceof Sipgeneral){
    	writeSipgeneral(strB,(Sipgeneral)data);
    	return;
    }
    if(data instanceof Sippeers){
    	writeSippeers(strB,(Sippeers)data);
    	return;
    }
    }

    /**
     * schreibt die Felder von Sipregister
     * @param strB
     * @param msec
     */
    protected void writeSipregisterFields(StringBuffer strB, Sipregister impl) {

 	//felder schreiben
        theSipregisterwriteHelper.writeuser(strB,impl);
        theSipregisterwriteHelper.writeauthuser(strB,impl);
        theSipregisterwriteHelper.writesecret(strB,impl);
        theSipregisterwriteHelper.writehost(strB,impl);
        theSipregisterwriteHelper.writeport(strB,impl);
        theSipregisterwriteHelper.writeextension(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Sipregister
     * @param strB
     * @param msec
     */
    protected void writeSipregisterAggregates(StringBuffer strB, Sipregister impl) {

    //aggregate schreiben
   //maps schreiben
	
	}
    /**
     * schreibt ein Sipregister Objekt
     * @param strB
     * @param msec
     */
    protected void writeSipregister(StringBuffer strB, Sipregister impl) {
	writeSipregisterFields(strB, impl);
    writeSipregisterAggregates(strB, impl);
    
    }
    /**
     * schreibt die Felder von Sipauth
     * @param strB
     * @param msec
     */
    protected void writeSipauthFields(StringBuffer strB, Sipauth impl) {

 	//felder schreiben
        theSipauthwriteHelper.writeuser(strB,impl);
        theSipauthwriteHelper.writesecret(strB,impl);
        theSipauthwriteHelper.writemd5secret(strB,impl);
        theSipauthwriteHelper.writerealm(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Sipauth
     * @param strB
     * @param msec
     */
    protected void writeSipauthAggregates(StringBuffer strB, Sipauth impl) {

    //aggregate schreiben
   //maps schreiben
	
	}
    /**
     * schreibt ein Sipauth Objekt
     * @param strB
     * @param msec
     */
    protected void writeSipauth(StringBuffer strB, Sipauth impl) {
	writeSipauthFields(strB, impl);
    writeSipauthAggregates(strB, impl);
    
    }
    /**
     * schreibt die Felder von SipConf
     * @param strB
     * @param msec
     */
    protected void writeSipConfFields(StringBuffer strB, SipConf impl) {

 	//felder schreiben

	}
   /**
   	 * schreibt die Aggregierten Objekte von SipConf
     * @param strB
     * @param msec
     */
    protected void writeSipConfAggregates(StringBuffer strB, SipConf impl) {

    //aggregate schreiben
		// Sipgeneral
      	writeSipgeneral(strB, impl.getSipgeneral());
   //maps schreiben
		// SippeersMap
        for (Iterator iter = impl.getSippeersMap().iterator(); iter.hasNext();) {
            Sippeers mobj = (Sippeers) iter.next();
            writeSippeers(strB,mobj);           
        }
	
	}
    /**
     * schreibt ein SipConf Objekt
     * @param strB
     * @param msec
     */
    protected void writeSipConf(StringBuffer strB, SipConf impl) {
	writeSipConfFields(strB, impl);
    writeSipConfAggregates(strB, impl);
    
    }
    /**
     * schreibt die Felder von Sipgeneral
     * @param strB
     * @param msec
     */
    protected void writeSipgeneralFields(StringBuffer strB, Sipgeneral impl) {

 	//felder schreiben
        theSipgeneralwriteHelper.writeautocreatepeer(strB,impl);
        theSipgeneralwriteHelper.writebindaddr(strB,impl);
        theSipgeneralwriteHelper.writebindport(strB,impl);
        theSipgeneralwriteHelper.writecanreinvite(strB,impl);
        theSipgeneralwriteHelper.writecontext(strB,impl);
        theSipgeneralwriteHelper.writedefaultexpirey(strB,impl);
        theSipgeneralwriteHelper.writedtmfmode(strB,impl);
        theSipgeneralwriteHelper.writeexternip(strB,impl);
        theSipgeneralwriteHelper.writeexternhost(strB,impl);
        theSipgeneralwriteHelper.writeexternrefresh(strB,impl);
        theSipgeneralwriteHelper.writelocalnet(strB,impl);
        theSipgeneralwriteHelper.writefromdomain(strB,impl);
        theSipgeneralwriteHelper.writemaxexpirey(strB,impl);
        theSipgeneralwriteHelper.writenat(strB,impl);
        theSipgeneralwriteHelper.writenotifymimetype(strB,impl);
        theSipgeneralwriteHelper.writepedantic(strB,impl);
        theSipgeneralwriteHelper.writeport(strB,impl);
        theSipgeneralwriteHelper.writepromiscredir(strB,impl);
        theSipgeneralwriteHelper.writesrvlookup(strB,impl);
        theSipgeneralwriteHelper.writetos(strB,impl);
        theSipgeneralwriteHelper.writevideosupport(strB,impl);
        theSipgeneralwriteHelper.writeuseragent(strB,impl);
        theSipgeneralwriteHelper.writetrustrpid(strB,impl);
        theSipgeneralwriteHelper.writerealm(strB,impl);
        theSipgeneralwriteHelper.writerelaxdtmf(strB,impl);
        theSipgeneralwriteHelper.writertptimeout(strB,impl);
        theSipgeneralwriteHelper.writertpholdtimeout(strB,impl);
        theSipgeneralwriteHelper.writeprogressinband(strB,impl);
        theSipgeneralwriteHelper.writeusereqphone(strB,impl);
        theSipgeneralwriteHelper.writecompactheaders(strB,impl);
        theSipgeneralwriteHelper.writesipdebug(strB,impl);
        theSipgeneralwriteHelper.writecheckmwi(strB,impl);
        theSipgeneralwriteHelper.writerecordhistory(strB,impl);
        theSipgeneralwriteHelper.writeallow(strB,impl);
        theSipgeneralwriteHelper.writedisallow(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Sipgeneral
     * @param strB
     * @param msec
     */
    protected void writeSipgeneralAggregates(StringBuffer strB, Sipgeneral impl) {

    //aggregate schreiben
   //maps schreiben
		// SipauthMap
        for (Iterator iter = impl.getSipauthMap().iterator(); iter.hasNext();) {
            Sipauth mobj = (Sipauth) iter.next();
            writeSipauth(strB,mobj);           
        }
		// SipregisterMap
        for (Iterator iter = impl.getSipregisterMap().iterator(); iter.hasNext();) {
            Sipregister mobj = (Sipregister) iter.next();
            writeSipregister(strB,mobj);           
        }
	
	}
    /**
     * schreibt ein Sipgeneral Objekt
     * @param strB
     * @param msec
     */
    protected void writeSipgeneral(StringBuffer strB, Sipgeneral impl) {
	writeSipgeneralFields(strB, impl);
    writeSipgeneralAggregates(strB, impl);
    
    }
    /**
     * schreibt die Felder von Sippeers
     * @param strB
     * @param msec
     */
    protected void writeSippeersFields(StringBuffer strB, Sippeers impl) {

 	//felder schreiben
        theSippeerswriteHelper.writesectionname(strB,impl);
        theSippeerswriteHelper.writeaccountcode(strB,impl);
        theSippeerswriteHelper.writeamaflags(strB,impl);
        theSippeerswriteHelper.writecallgroup(strB,impl);
        theSippeerswriteHelper.writecanreinvite(strB,impl);
        theSippeerswriteHelper.writecontext(strB,impl);
        theSippeerswriteHelper.writedefaultip(strB,impl);
        theSippeerswriteHelper.writedtmfmode(strB,impl);
        theSippeerswriteHelper.writefromuser(strB,impl);
        theSippeerswriteHelper.writefromdomain(strB,impl);
        theSippeerswriteHelper.writehost(strB,impl);
        theSippeerswriteHelper.writeincominglimit(strB,impl);
        theSippeerswriteHelper.writeoutgoinglimit(strB,impl);
        theSippeerswriteHelper.writeinsecure(strB,impl);
        theSippeerswriteHelper.writelanguage(strB,impl);
        theSippeerswriteHelper.writemailbox(strB,impl);
        theSippeerswriteHelper.writemd5secret(strB,impl);
        theSippeerswriteHelper.writenat(strB,impl);
        theSippeerswriteHelper.writepickupgroup(strB,impl);
        theSippeerswriteHelper.writeport(strB,impl);
        theSippeerswriteHelper.writequalify(strB,impl);
        theSippeerswriteHelper.writerestrictcid(strB,impl);
        theSippeerswriteHelper.writertptimeout(strB,impl);
        theSippeerswriteHelper.writertpholdtimeout(strB,impl);
        theSippeerswriteHelper.writesecret(strB,impl);
        theSippeerswriteHelper.writetype(strB,impl);
        theSippeerswriteHelper.writeusername(strB,impl);
        theSippeerswriteHelper.writemusiconhold(strB,impl);
        theSippeerswriteHelper.writecallerid(strB,impl);
        theSippeerswriteHelper.writedisallow(strB,impl);
        theSippeerswriteHelper.writeallow(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Sippeers
     * @param strB
     * @param msec
     */
    protected void writeSippeersAggregates(StringBuffer strB, Sippeers impl) {

    //aggregate schreiben
   //maps schreiben
		// SipauthMap
        for (Iterator iter = impl.getSipauthMap().iterator(); iter.hasNext();) {
            Sipauth mobj = (Sipauth) iter.next();
            writeSipauth(strB,mobj);           
        }
	
	}
    /**
     * schreibt ein Sippeers Objekt
     * @param strB
     * @param msec
     */
    protected void writeSippeers(StringBuffer strB, Sippeers impl) {
	writeSippeersFields(strB, impl);
    writeSippeersAggregates(strB, impl);
    
    }

	protected void initHelper(){
		theSipregisterwriteHelper = new SipregisterwriteHelper();
	theSipregisterwriteHelper.user_StartToken="user=";
	theSipregisterwriteHelper.user_StopToken="\n";
	theSipregisterwriteHelper.authuser_StartToken="authuser=";
	theSipregisterwriteHelper.authuser_StopToken="\n";
	theSipregisterwriteHelper.secret_StartToken="secret=";
	theSipregisterwriteHelper.secret_StopToken="\n";
	theSipregisterwriteHelper.host_StartToken="host=";
	theSipregisterwriteHelper.host_StopToken="\n";
	theSipregisterwriteHelper.port_StartToken="port=";
	theSipregisterwriteHelper.port_StopToken="\n";
	theSipregisterwriteHelper.extension_StartToken="extension=";
	theSipregisterwriteHelper.extension_StopToken="\n";

	theSipauthwriteHelper = new SipauthwriteHelper();
	theSipauthwriteHelper.user_StartToken="user=";
	theSipauthwriteHelper.user_StopToken="\n";
	theSipauthwriteHelper.secret_StartToken="secret=";
	theSipauthwriteHelper.secret_StopToken="\n";
	theSipauthwriteHelper.md5secret_StartToken="md5secret=";
	theSipauthwriteHelper.md5secret_StopToken="\n";
	theSipauthwriteHelper.realm_StartToken="realm=";
	theSipauthwriteHelper.realm_StopToken="\n";

	theSipConfwriteHelper = new SipConfwriteHelper();

	theSipgeneralwriteHelper = new SipgeneralwriteHelper();
	theSipgeneralwriteHelper.autocreatepeer_StartToken="autocreatepeer=";
	theSipgeneralwriteHelper.autocreatepeer_StopToken="\n";
	theSipgeneralwriteHelper.bindaddr_StartToken="bindaddr=";
	theSipgeneralwriteHelper.bindaddr_StopToken="\n";
	theSipgeneralwriteHelper.bindport_StartToken="bindport=";
	theSipgeneralwriteHelper.bindport_StopToken="\n";
	theSipgeneralwriteHelper.canreinvite_StartToken="canreinvite=";
	theSipgeneralwriteHelper.canreinvite_StopToken="\n";
	theSipgeneralwriteHelper.context_StartToken="context=";
	theSipgeneralwriteHelper.context_StopToken="\n";
	theSipgeneralwriteHelper.defaultexpirey_StartToken="defaultexpirey=";
	theSipgeneralwriteHelper.defaultexpirey_StopToken="\n";
	theSipgeneralwriteHelper.dtmfmode_StartToken="dtmfmode=";
	theSipgeneralwriteHelper.dtmfmode_StopToken="\n";
	theSipgeneralwriteHelper.externip_StartToken="externip=";
	theSipgeneralwriteHelper.externip_StopToken="\n";
	theSipgeneralwriteHelper.externhost_StartToken="externhost=";
	theSipgeneralwriteHelper.externhost_StopToken="\n";
	theSipgeneralwriteHelper.externrefresh_StartToken="externrefresh=";
	theSipgeneralwriteHelper.externrefresh_StopToken="\n";
	theSipgeneralwriteHelper.localnet_StartToken="localnet=";
	theSipgeneralwriteHelper.localnet_StopToken="\n";
	theSipgeneralwriteHelper.fromdomain_StartToken="fromdomain=";
	theSipgeneralwriteHelper.fromdomain_StopToken="\n";
	theSipgeneralwriteHelper.maxexpirey_StartToken="maxexpirey=";
	theSipgeneralwriteHelper.maxexpirey_StopToken="\n";
	theSipgeneralwriteHelper.nat_StartToken="nat=";
	theSipgeneralwriteHelper.nat_StopToken="\n";
	theSipgeneralwriteHelper.notifymimetype_StartToken="notifymimetype=";
	theSipgeneralwriteHelper.notifymimetype_StopToken="\n";
	theSipgeneralwriteHelper.pedantic_StartToken="pedantic=";
	theSipgeneralwriteHelper.pedantic_StopToken="\n";
	theSipgeneralwriteHelper.port_StartToken="port=";
	theSipgeneralwriteHelper.port_StopToken="\n";
	theSipgeneralwriteHelper.promiscredir_StartToken="promiscredir=";
	theSipgeneralwriteHelper.promiscredir_StopToken="\n";
	theSipgeneralwriteHelper.srvlookup_StartToken="srvlookup=";
	theSipgeneralwriteHelper.srvlookup_StopToken="\n";
	theSipgeneralwriteHelper.tos_StartToken="tos=";
	theSipgeneralwriteHelper.tos_StopToken="\n";
	theSipgeneralwriteHelper.videosupport_StartToken="videosupport=";
	theSipgeneralwriteHelper.videosupport_StopToken="\n";
	theSipgeneralwriteHelper.useragent_StartToken="useragent=";
	theSipgeneralwriteHelper.useragent_StopToken="\n";
	theSipgeneralwriteHelper.trustrpid_StartToken="trustrpid=";
	theSipgeneralwriteHelper.trustrpid_StopToken="\n";
	theSipgeneralwriteHelper.realm_StartToken="realm=";
	theSipgeneralwriteHelper.realm_StopToken="\n";
	theSipgeneralwriteHelper.relaxdtmf_StartToken="relaxdtmf=";
	theSipgeneralwriteHelper.relaxdtmf_StopToken="\n";
	theSipgeneralwriteHelper.rtptimeout_StartToken="rtptimeout=";
	theSipgeneralwriteHelper.rtptimeout_StopToken="\n";
	theSipgeneralwriteHelper.rtpholdtimeout_StartToken="rtpholdtimeout=";
	theSipgeneralwriteHelper.rtpholdtimeout_StopToken="\n";
	theSipgeneralwriteHelper.progressinband_StartToken="progressinband=";
	theSipgeneralwriteHelper.progressinband_StopToken="\n";
	theSipgeneralwriteHelper.usereqphone_StartToken="usereqphone=";
	theSipgeneralwriteHelper.usereqphone_StopToken="\n";
	theSipgeneralwriteHelper.compactheaders_StartToken="compactheaders=";
	theSipgeneralwriteHelper.compactheaders_StopToken="\n";
	theSipgeneralwriteHelper.sipdebug_StartToken="sipdebug=";
	theSipgeneralwriteHelper.sipdebug_StopToken="\n";
	theSipgeneralwriteHelper.checkmwi_StartToken="checkmwi=";
	theSipgeneralwriteHelper.checkmwi_StopToken="\n";
	theSipgeneralwriteHelper.recordhistory_StartToken="recordhistory=";
	theSipgeneralwriteHelper.recordhistory_StopToken="\n";
	theSipgeneralwriteHelper.allow_StartToken="allow=";
	theSipgeneralwriteHelper.allow_StopToken="\n";
	theSipgeneralwriteHelper.disallow_StartToken="disallow=";
	theSipgeneralwriteHelper.disallow_StopToken="\n";

	theSippeerswriteHelper = new SippeerswriteHelper();
	theSippeerswriteHelper.sectionname_StartToken="sectionname=";
	theSippeerswriteHelper.sectionname_StopToken="\n";
	theSippeerswriteHelper.accountcode_StartToken="accountcode=";
	theSippeerswriteHelper.accountcode_StopToken="\n";
	theSippeerswriteHelper.amaflags_StartToken="amaflags=";
	theSippeerswriteHelper.amaflags_StopToken="\n";
	theSippeerswriteHelper.callgroup_StartToken="callgroup=";
	theSippeerswriteHelper.callgroup_StopToken="\n";
	theSippeerswriteHelper.canreinvite_StartToken="canreinvite=";
	theSippeerswriteHelper.canreinvite_StopToken="\n";
	theSippeerswriteHelper.context_StartToken="context=";
	theSippeerswriteHelper.context_StopToken="\n";
	theSippeerswriteHelper.defaultip_StartToken="defaultip=";
	theSippeerswriteHelper.defaultip_StopToken="\n";
	theSippeerswriteHelper.dtmfmode_StartToken="dtmfmode=";
	theSippeerswriteHelper.dtmfmode_StopToken="\n";
	theSippeerswriteHelper.fromuser_StartToken="fromuser=";
	theSippeerswriteHelper.fromuser_StopToken="\n";
	theSippeerswriteHelper.fromdomain_StartToken="fromdomain=";
	theSippeerswriteHelper.fromdomain_StopToken="\n";
	theSippeerswriteHelper.host_StartToken="host=";
	theSippeerswriteHelper.host_StopToken="\n";
	theSippeerswriteHelper.incominglimit_StartToken="incominglimit=";
	theSippeerswriteHelper.incominglimit_StopToken="\n";
	theSippeerswriteHelper.outgoinglimit_StartToken="outgoinglimit=";
	theSippeerswriteHelper.outgoinglimit_StopToken="\n";
	theSippeerswriteHelper.insecure_StartToken="insecure=";
	theSippeerswriteHelper.insecure_StopToken="\n";
	theSippeerswriteHelper.language_StartToken="language=";
	theSippeerswriteHelper.language_StopToken="\n";
	theSippeerswriteHelper.mailbox_StartToken="mailbox=";
	theSippeerswriteHelper.mailbox_StopToken="\n";
	theSippeerswriteHelper.md5secret_StartToken="md5secret=";
	theSippeerswriteHelper.md5secret_StopToken="\n";
	theSippeerswriteHelper.nat_StartToken="nat=";
	theSippeerswriteHelper.nat_StopToken="\n";
	theSippeerswriteHelper.pickupgroup_StartToken="pickupgroup=";
	theSippeerswriteHelper.pickupgroup_StopToken="\n";
	theSippeerswriteHelper.port_StartToken="port=";
	theSippeerswriteHelper.port_StopToken="\n";
	theSippeerswriteHelper.qualify_StartToken="qualify=";
	theSippeerswriteHelper.qualify_StopToken="\n";
	theSippeerswriteHelper.restrictcid_StartToken="restrictcid=";
	theSippeerswriteHelper.restrictcid_StopToken="\n";
	theSippeerswriteHelper.rtptimeout_StartToken="rtptimeout=";
	theSippeerswriteHelper.rtptimeout_StopToken="\n";
	theSippeerswriteHelper.rtpholdtimeout_StartToken="rtpholdtimeout=";
	theSippeerswriteHelper.rtpholdtimeout_StopToken="\n";
	theSippeerswriteHelper.secret_StartToken="secret=";
	theSippeerswriteHelper.secret_StopToken="\n";
	theSippeerswriteHelper.type_StartToken="type=";
	theSippeerswriteHelper.type_StopToken="\n";
	theSippeerswriteHelper.username_StartToken="username=";
	theSippeerswriteHelper.username_StopToken="\n";
	theSippeerswriteHelper.musiconhold_StartToken="musiconhold=";
	theSippeerswriteHelper.musiconhold_StopToken="\n";
	theSippeerswriteHelper.callerid_StartToken="callerid=";
	theSippeerswriteHelper.callerid_StopToken="\n";
	theSippeerswriteHelper.disallow_StartToken="disallow=";
	theSippeerswriteHelper.disallow_StopToken="\n";
	theSippeerswriteHelper.allow_StartToken="allow=";
	theSippeerswriteHelper.allow_StopToken="\n";

	
	}

}
