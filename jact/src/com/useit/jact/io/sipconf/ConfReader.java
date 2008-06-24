/*
 * (c) urs zeidler
 */
package com.useit.jact.io.sipconf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.SipConfImpl;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.SipauthImpl;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.SipgeneralImpl;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.SippeersImpl;
import com.useit.jact.model.sipconf.Sipregister;
import com.useit.jact.model.sipconf.SipregisterImpl;
import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;


/** 
 * <p> 
 * ConfReader , die Abstract Confreader klasse, zerlegt per tokenieser den Stringstream in 
 * entrys
 * </p> 
 * Created : 31.08.2005 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ConfReader.java,v 1.1 2008/06/24 20:45:23 urszeidler Exp $ 
 */
public class ConfReader extends AbstractConfReader{

    /**
     * 
     */
    public ConfReader() {
        super();
     }
    
    /**
     * ließt den file und bildet die Entrylist
     * @param file
     * @throws FileNotFoundException
     * @throws IOException
     */
     public void readConfFile(String file) throws FileNotFoundException, IOException{
        String content = readStringFromFile(new File(file), 500);
        buildEntryList(content);
        
        
    }


    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingSipregisterEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Sipregister objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Sipregister buildSipregisterModelElement(List aEntryList){
        Sipregister impl = new SipregisterImpl();
        buildSipregisterModelVaues(aEntryList,impl);
        buildSipregisterModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildSipregisterModelAgg(List entryList,Sipregister impl) {

    //aggregate schreiben
   //maps schreiben
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildSipregisterModelVaues(List entryList,Sipregister impl) {
		String val=null;
		val = findConfValue("user",entryList);
		if(val!=null)
		impl.setUser(
			 val
			);
 
		val = findConfValue("authuser",entryList);
		if(val!=null)
		impl.setAuthuser(
			 val
			);
 
		val = findConfValue("secret",entryList);
		if(val!=null)
		impl.setSecret(
			 val
			);
 
		val = findConfValue("host",entryList);
		if(val!=null)
		impl.setHost(
			 val
			);
 
		val = findConfValue("port",entryList);
		if(val!=null)
		impl.setPort(
				new Integer(val)
				);
 
		val = findConfValue("extension",entryList);
		if(val!=null)
		impl.setExtension(
			 val
			);
 
    }
    

    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingSipauthEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Sipauth objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Sipauth buildSipauthModelElement(List aEntryList){
        Sipauth impl = new SipauthImpl();
        buildSipauthModelVaues(aEntryList,impl);
        buildSipauthModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildSipauthModelAgg(List entryList,Sipauth impl) {

    //aggregate schreiben
   //maps schreiben
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildSipauthModelVaues(List entryList,Sipauth impl) {
		String val=null;
		val = findConfValue("user",entryList);
		if(val!=null)
		impl.setUser(
			 val
			);
 
		val = findConfValue("secret",entryList);
		if(val!=null)
		impl.setSecret(
			 val
			);
 
		val = findConfValue("md5secret",entryList);
		if(val!=null)
		impl.setMd5secret(
			 val
			);
 
		val = findConfValue("realm",entryList);
		if(val!=null)
		impl.setRealm(
			 val
			);
 
    }
    

    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingSipConfEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein SipConf objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected SipConf buildSipConfModelElement(List aEntryList){
        SipConf impl = new SipConfImpl();
        buildSipConfModelVaues(aEntryList,impl);
        buildSipConfModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildSipConfModelAgg(List entryList,SipConf impl) {

    //aggregate schreiben
		// Sipgeneral
      	Sipgeneral aSipgeneral = buildSipgeneralModelElement(entryList);
      	impl.setSipgeneral(aSipgeneral);
      	//writeSipgeneral(strB, impl.getSipgeneral());
   //maps schreiben
		// SippeersMap
        for (Iterator iter = impl.getSippeersMap().iterator(); iter.hasNext();) {
            Sippeers aSippeersM = buildSippeersModelElement(entryList);
            impl.addSippeers( aSippeersM);
            //Sippeers mobj = (Sippeers) iter.next();
            //writeSippeers(strB,mobj);           
        }
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildSipConfModelVaues(List entryList,SipConf impl) {
		String val=null;
    }
    

    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingSipgeneralEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Sipgeneral objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Sipgeneral buildSipgeneralModelElement(List aEntryList){
        Sipgeneral impl = new SipgeneralImpl();
        buildSipgeneralModelVaues(aEntryList,impl);
        buildSipgeneralModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildSipgeneralModelAgg(List entryList,Sipgeneral impl) {

    //aggregate schreiben
   //maps schreiben
		// SipauthMap
        for (Iterator iter = impl.getSipauthMap().iterator(); iter.hasNext();) {
            Sipauth aSipauthM = buildSipauthModelElement(entryList);
            impl.addSipauth( aSipauthM);
            //Sipauth mobj = (Sipauth) iter.next();
            //writeSipauth(strB,mobj);           
        }
		// SipregisterMap
        for (Iterator iter = impl.getSipregisterMap().iterator(); iter.hasNext();) {
            Sipregister aSipregisterM = buildSipregisterModelElement(entryList);
            impl.addSipregister( aSipregisterM);
            //Sipregister mobj = (Sipregister) iter.next();
            //writeSipregister(strB,mobj);           
        }
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildSipgeneralModelVaues(List entryList,Sipgeneral impl) {
		String val=null;
		val = findConfValue("autocreatepeer",entryList);
		if(val!=null)
		impl.setAutocreatepeer(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("bindaddr",entryList);
		if(val!=null)
		impl.setBindaddr(
			 val
			);
 
		val = findConfValue("bindport",entryList);
		if(val!=null)
		impl.setBindport(
				new Integer(val)
				);
 
		val = findConfValue("canreinvite",entryList);
		if(val!=null)
		impl.setCanreinvite(
			 val
			);
 
		val = findConfValue("context",entryList);
		if(val!=null)
		impl.setContext(
				new PbxContext(val)
				);
 
		val = findConfValue("defaultexpirey",entryList);
		if(val!=null)
		impl.setDefaultexpirey(
				new Integer(val)
				);
 
		val = findConfValue("dtmfmode",entryList);
		if(val!=null)
		impl.setDtmfmode(
				new Dtmfmode(val)
				);
 
		val = findConfValue("externip",entryList);
		if(val!=null)
		impl.setExternip(
			 val
			);
 
		val = findConfValue("externhost",entryList);
		if(val!=null)
		impl.setExternhost(
			 val
			);
 
		val = findConfValue("externrefresh",entryList);
		if(val!=null)
		impl.setExternrefresh(
			 val
			);
 
		val = findConfValue("localnet",entryList);
		if(val!=null)
		impl.setLocalnet(
			 val
			);
 
		val = findConfValue("fromdomain",entryList);
		if(val!=null)
		impl.setFromdomain(
			 val
			);
 
		val = findConfValue("maxexpirey",entryList);
		if(val!=null)
		impl.setMaxexpirey(
				new Integer(val)
				);
 
		val = findConfValue("nat",entryList);
		if(val!=null)
		impl.setNat(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("notifymimetype",entryList);
		if(val!=null)
		impl.setNotifymimetype(
			 val
			);
 
		val = findConfValue("pedantic",entryList);
		if(val!=null)
		impl.setPedantic(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("port",entryList);
		if(val!=null)
		impl.setPort(
				new Integer(val)
				);
 
		val = findConfValue("promiscredir",entryList);
		if(val!=null)
		impl.setPromiscredir(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("srvlookup",entryList);
		if(val!=null)
		impl.setSrvlookup(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("tos",entryList);
		if(val!=null)
		impl.setTos(
			 val
			);
 
		val = findConfValue("videosupport",entryList);
		if(val!=null)
		impl.setVideosupport(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("useragent",entryList);
		if(val!=null)
		impl.setUseragent(
			 val
			);
 
		val = findConfValue("trustrpid",entryList);
		if(val!=null)
		impl.setTrustrpid(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("realm",entryList);
		if(val!=null)
		impl.setRealm(
			 val
			);
 
		val = findConfValue("rtptimeout",entryList);
		if(val!=null)
		impl.setRtptimeout(
				new Integer(val)
				);
 
		val = findConfValue("relaxdtmf",entryList);
		if(val!=null)
		impl.setRelaxdtmf(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("rtpholdtimeout",entryList);
		if(val!=null)
		impl.setRtpholdtimeout(
				new Integer(val)
				);
 
		val = findConfValue("progressinband",entryList);
		if(val!=null)
		impl.setProgressinband(
			 val
			);
 
		val = findConfValue("usereqphone",entryList);
		if(val!=null)
		impl.setUsereqphone(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("compactheaders",entryList);
		if(val!=null)
		impl.setCompactheaders(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("sipdebug",entryList);
		if(val!=null)
		impl.setSipdebug(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("checkmwi",entryList);
		if(val!=null)
		impl.setCheckmwi(
				new Integer(val)
				);
 
		val = findConfValue("recordhistory",entryList);
		if(val!=null)
		impl.setRecordhistory(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("allow",entryList);
		if(val!=null)
		impl.setAllow(
				new CodecsSet(val)
				);
 
		val = findConfValue("disallow",entryList);
		if(val!=null)
		impl.setDisallow(
				new CodecsSet(val)
				);
 
    }
    

    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingSippeersEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Sippeers objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Sippeers buildSippeersModelElement(List aEntryList){
        Sippeers impl = new SippeersImpl();
        buildSippeersModelVaues(aEntryList,impl);
        buildSippeersModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildSippeersModelAgg(List entryList,Sippeers impl) {

    //aggregate schreiben
   //maps schreiben
		// SipauthMap
        for (Iterator iter = impl.getSipauthMap().iterator(); iter.hasNext();) {
            Sipauth aSipauthM = buildSipauthModelElement(entryList);
            impl.addSipauth( aSipauthM);
            //Sipauth mobj = (Sipauth) iter.next();
            //writeSipauth(strB,mobj);           
        }
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildSippeersModelVaues(List entryList,Sippeers impl) {
		String val=null;
		val = findConfValue("sectionname",entryList);
		if(val!=null)
		impl.setSectionname(
			 val
			);
 
		val = findConfValue("accountcode",entryList);
		if(val!=null)
		impl.setAccountcode(
			 val
			);
 
		val = findConfValue("amaflags",entryList);
		if(val!=null)
		impl.setAmaflags(
				new Amaflags(val)
				);
 
		val = findConfValue("callgroup",entryList);
		if(val!=null)
		impl.setCallgroup(
			 val
			);
 
		val = findConfValue("canreinvite",entryList);
		if(val!=null)
		impl.setCanreinvite(
			 val
			);
 
		val = findConfValue("context",entryList);
		if(val!=null)
		impl.setContext(
				new PbxContext(val)
				);
 
		val = findConfValue("defaultip",entryList);
		if(val!=null)
		impl.setDefaultip(
			 val
			);
 
		val = findConfValue("dtmfmode",entryList);
		if(val!=null)
		impl.setDtmfmode(
				new Dtmfmode(val)
				);
 
		val = findConfValue("fromuser",entryList);
		if(val!=null)
		impl.setFromuser(
			 val
			);
 
		val = findConfValue("fromdomain",entryList);
		if(val!=null)
		impl.setFromdomain(
			 val
			);
 
		val = findConfValue("host",entryList);
		if(val!=null)
		impl.setHost(
			 val
			);
 
		val = findConfValue("incominglimit",entryList);
		if(val!=null)
		impl.setIncominglimit(
				new Integer(val)
				);
 
		val = findConfValue("outgoinglimit",entryList);
		if(val!=null)
		impl.setOutgoinglimit(
				new Integer(val)
				);
 
		val = findConfValue("insecure",entryList);
		if(val!=null)
		impl.setInsecure(
			 val
			);
 
		val = findConfValue("language",entryList);
		if(val!=null)
		impl.setLanguage(
			 val
			);
 
		val = findConfValue("mailbox",entryList);
		if(val!=null)
		impl.setMailbox(
			 val
			);
 
		val = findConfValue("md5secret",entryList);
		if(val!=null)
		impl.setMd5secret(
			 val
			);
 
		val = findConfValue("nat",entryList);
		if(val!=null)
		impl.setNat(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("pickupgroup",entryList);
		if(val!=null)
		impl.setPickupgroup(
			 val
			);
 
		val = findConfValue("port",entryList);
		if(val!=null)
		impl.setPort(
				new Integer(val)
				);
 
		val = findConfValue("qualify",entryList);
		if(val!=null)
		impl.setQualify(
			 val
			);
 
		val = findConfValue("restrictcid",entryList);
		if(val!=null)
		impl.setRestrictcid(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("rtptimeout",entryList);
		if(val!=null)
		impl.setRtptimeout(
				new Integer(val)
				);
 
		val = findConfValue("rtpholdtimeout",entryList);
		if(val!=null)
		impl.setRtpholdtimeout(
				new Integer(val)
				);
 
		val = findConfValue("secret",entryList);
		if(val!=null)
		impl.setSecret(
			 val
			);
 
		val = findConfValue("type",entryList);
		if(val!=null)
		impl.setType(
				new PeerType(val)
				);
 
		val = findConfValue("username",entryList);
		if(val!=null)
		impl.setUsername(
			 val
			);
 
		val = findConfValue("musiconhold",entryList);
		if(val!=null)
		impl.setMusiconhold(
			 val
			);
 
		val = findConfValue("callerid",entryList);
		if(val!=null)
		impl.setCallerid(
			 val
			);
 
		val = findConfValue("disallow",entryList);
		if(val!=null)
		impl.setDisallow(
				new CodecsSet(val)
				);
 
		val = findConfValue("allow",entryList);
		if(val!=null)
		impl.setAllow(
				new CodecsSet(val)
				);
 
    }
    

}

