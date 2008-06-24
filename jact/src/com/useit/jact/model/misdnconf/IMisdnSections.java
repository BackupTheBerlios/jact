

package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;

import com.useit.jact.model.types.Dialplan;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Presentation;


/**
 * <p>
 * IMisdnSections<br>
 * name your sections as you which but not "general" !  the secions are Groups, you can dial out in extensions.conf with Dial(mISDN/g:extern/101) where extern is a section name,  chan_misdn tries every port in this section to find a  new free channel The default section is not a group section, it just contains config elements  which are inherited by group sections.
 * </p>
 * Created : Fri May 26 14:30:33 CEST 2006
 * 
 * @behavior.elementname MisdnSections
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMisdnSections.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  IMisdnSections {
public static final String MODELNAME = "MisdnSections";	

/**
 * gibt die List<MisdnPorts> misdnPortsMap zurück	
 * @return List<MisdnPorts>
 * @behavior.list MisdnPortsMap 
 * @behavior.list.type MisdnPorts 
 */
public List getMisdnPortsMap();
/**
 * setzt die Map MisdnPortsMap
 * @param map misdnPortsMapMap
 * @behavior.list MisdnPortsMap 
 * @behavior.list.type MisdnPorts 
 */
public void setMisdnPortsMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_LANGUAGE="language" ;
// 	public static final String VALUEID_NATIONALPREFIX="nationalprefix" ;
// 	public static final String VALUEID_INTERNATIONALPREFIX="internationalprefix" ;
// 	public static final String VALUEID_RXGAIN="rxgain" ;
// 	public static final String VALUEID_TXGAIN="txgain" ;
// 	public static final String VALUEID_TE_CHOOSE_CHANNEL="te_choose_channel" ;
// 	public static final String VALUEID_EARLY_BCONNECT="early_bconnect" ;
// 	public static final String VALUEID_DIALPLAN="dialplan" ;
// 	public static final String VALUEID_USE_CALLINGPRES="use_callingpres" ;
// 	public static final String VALUEID_ALWAYS_IMMEDIATE="always_immediate" ;
// 	public static final String VALUEID_IMMEDIATE="immediate" ;
// 	public static final String VALUEID_HOLD_ALLOWED="hold_allowed" ;
// 	public static final String VALUEID_PICKGROUP="pickgroup" ;
// 	public static final String VALUEID_CALLGROUP="callgroup" ;
// 	public static final String VALUEID_PRESENTATION="presentation" ;
// 	public static final String VALUEID_ECHOCANCEL="echocancel" ;
// 	public static final String VALUEID_ECHOCANCELWHENBRIDGED="echocancelwhenbridged" ;
// 	public static final String VALUEID_ECHOTRAINING="echotraining" ;
// 	public static final String VALUEID_SECTIONNAME="sectionname" ;
	
	//---------  getter und setter

	/**
	* getcontext 
	* define your default context here
	* @behavior.fieldname context 
	**/
	public PbxContext getContext();
	
	/**
	*setcontext 
	* define your default context here
	* @behavior.fieldname context 
	*/
	public void setContext(PbxContext acontext);


	/**
	* getlanguage 
	* Group Specific Language
	* @behavior.fieldname language 
	**/
	public String getLanguage();
	
	/**
	*setlanguage 
	* Group Specific Language
	* @behavior.fieldname language 
	*/
	public void setLanguage(String alanguage);


	/**
	* getnationalprefix 
	* Prefixes for national and international, those are putted before the 
  oad if an according dialplan is set by the other end.
	* @behavior.fieldname nationalprefix 
	**/
	public String getNationalprefix();
	
	/**
	*setnationalprefix 
	* Prefixes for national and international, those are putted before the 
  oad if an according dialplan is set by the other end.
	* @behavior.fieldname nationalprefix 
	*/
	public void setNationalprefix(String anationalprefix);


	/**
	* getinternationalprefix 
	* Prefixes for national and international, those are putted before the  oad if an according dialplan is set by the other end.
	* @behavior.fieldname internationalprefix 
	**/
	public String getInternationalprefix();
	
	/**
	*setinternationalprefix 
	* Prefixes for national and international, those are putted before the  oad if an according dialplan is set by the other end.
	* @behavior.fieldname internationalprefix 
	*/
	public void setInternationalprefix(String ainternationalprefix);


	/**
	* getrxgain 
	* set rx/tx gains between -8 and 8 to change the RX/TX Gain
	* @behavior.fieldname rxgain 
	**/
	public Integer getRxgain();
	
	/**
	*setrxgain 
	* set rx/tx gains between -8 and 8 to change the RX/TX Gain
	* @behavior.fieldname rxgain 
	*/
	public void setRxgain(Integer arxgain);


	/**
	* gettxgain 
	* set rx/tx gains between -8 and 8 to change the RX/TX Gain
	* @behavior.fieldname txgain 
	**/
	public Integer getTxgain();
	
	/**
	*settxgain 
	* set rx/tx gains between -8 and 8 to change the RX/TX Gain
	* @behavior.fieldname txgain 
	*/
	public void setTxgain(Integer atxgain);


	/**
	* gette_choose_channel 
	* Some telcos espacially in NL seem to need this set to yes, this is disabled  by default, also in switzerland this seems to be important
	* @behavior.fieldname te_choose_channel 
	**/
	public Boolean getTe_choose_channel();
	
	/**
	*sette_choose_channel 
	* Some telcos espacially in NL seem to need this set to yes, this is disabled  by default, also in switzerland this seems to be important
	* @behavior.fieldname te_choose_channel 
	*/
	public void setTe_choose_channel(Boolean ate_choose_channel);


	/**
	* getearly_bconnect 
	* wether to connect bchannel when getting proceeding
	* @behavior.fieldname early_bconnect 
	**/
	public Boolean getEarly_bconnect();
	
	/**
	*setearly_bconnect 
	* wether to connect bchannel when getting proceeding
	* @behavior.fieldname early_bconnect 
	*/
	public void setEarly_bconnect(Boolean aearly_bconnect);


	/**
	* getdialplan 
	* dialplan options:   0 - unknown  1 - National  2 - International  4 - Subscriber This setting is used for outgoing calls
	* @behavior.fieldname dialplan 
	**/
	public Dialplan getDialplan();
	
	/**
	*setdialplan 
	* dialplan options:   0 - unknown  1 - National  2 - International  4 - Subscriber This setting is used for outgoing calls
	* @behavior.fieldname dialplan 
	*/
	public void setDialplan(Dialplan adialplan);


	/**
	* getuse_callingpres 
	* This is only for asterisk head and will result in only considering  misdn.confs and misdn_set_opts callingpresentation informations if set to no. Otherwise asterisks callingpresentation overwrites misdn.confs settings.
	* @behavior.fieldname use_callingpres 
	**/
	public Boolean getUse_callingpres();
	
	/**
	*setuse_callingpres 
	* This is only for asterisk head and will result in only considering  misdn.confs and misdn_set_opts callingpresentation informations if set to no. Otherwise asterisks callingpresentation overwrites misdn.confs settings.
	* @behavior.fieldname use_callingpres 
	*/
	public void setUse_callingpres(Boolean ause_callingpres);


	/**
	* getalways_immediate 
	* uncomment the following to get into s extension at extension conf
  there you can use DigitTimeout if you can't or don't want to use
  isdn overlap dial. 
  note: This will jump into the s exten for every exten !
	* @behavior.fieldname always_immediate 
	**/
	public Boolean getAlways_immediate();
	
	/**
	*setalways_immediate 
	* uncomment the following to get into s extension at extension conf
  there you can use DigitTimeout if you can't or don't want to use
  isdn overlap dial. 
  note: This will jump into the s exten for every exten !
	* @behavior.fieldname always_immediate 
	*/
	public void setAlways_immediate(Boolean aalways_immediate);


	/**
	* getimmediate 
	* uncomment the following if you want callers which called exactly the 
  base number (so no extension is set) jump to the s extension.
  if the user dials something more it jumps to the correct extension 
  instead
	* @behavior.fieldname immediate 
	**/
	public Boolean getImmediate();
	
	/**
	*setimmediate 
	* uncomment the following if you want callers which called exactly the 
  base number (so no extension is set) jump to the s extension.
  if the user dials something more it jumps to the correct extension 
  instead
	* @behavior.fieldname immediate 
	*/
	public void setImmediate(Boolean aimmediate);


	/**
	* gethold_allowed 
	* uncomment the following to have hold and retrieve support hold_allowed
	* @behavior.fieldname hold_allowed 
	**/
	public Boolean getHold_allowed();
	
	/**
	*sethold_allowed 
	* uncomment the following to have hold and retrieve support hold_allowed
	* @behavior.fieldname hold_allowed 
	*/
	public void setHold_allowed(Boolean ahold_allowed);


	/**
	* getpickgroup 
	* Pickup and Callgroup
	* @behavior.fieldname pickgroup 
	**/
	public String getPickgroup();
	
	/**
	*setpickgroup 
	* Pickup and Callgroup
	* @behavior.fieldname pickgroup 
	*/
	public void setPickgroup(String apickgroup);


	/**
	* getcallgroup 
	* Pickup and Callgroup
	* @behavior.fieldname callgroup 
	**/
	public String getCallgroup();
	
	/**
	*setcallgroup 
	* Pickup and Callgroup
	* @behavior.fieldname callgroup 
	*/
	public void setCallgroup(String acallgroup);


	/**
	* getpresentation 
	* Allows/Screens Callerid  possible values:  allowed not_screened be aware, if you set to allowed you need to set a correct  callerid in the dialplan or set it here in the misdn.conf Some Telcos don't care about wrong callerids, others do !
	* @behavior.fieldname presentation 
	**/
	public Presentation getPresentation();
	
	/**
	*setpresentation 
	* Allows/Screens Callerid  possible values:  allowed not_screened be aware, if you set to allowed you need to set a correct  callerid in the dialplan or set it here in the misdn.conf Some Telcos don't care about wrong callerids, others do !
	* @behavior.fieldname presentation 
	*/
	public void setPresentation(Presentation apresentation);


	/**
	* getechocancel 
	* this enables echocancelation, with the given number of taps  be aware, move this setting only to outgoing portgroups !
	* @behavior.fieldname echocancel 
	**/
	public Boolean getEchocancel();
	
	/**
	*setechocancel 
	* this enables echocancelation, with the given number of taps  be aware, move this setting only to outgoing portgroups !
	* @behavior.fieldname echocancel 
	*/
	public void setEchocancel(Boolean aechocancel);


	/**
	* getechocancelwhenbridged 
	* this disables echocancellation when the call is bridged between  mISDN channels
	* @behavior.fieldname echocancelwhenbridged 
	**/
	public Boolean getEchocancelwhenbridged();
	
	/**
	*setechocancelwhenbridged 
	* this disables echocancellation when the call is bridged between  mISDN channels
	* @behavior.fieldname echocancelwhenbridged 
	*/
	public void setEchocancelwhenbridged(Boolean aechocancelwhenbridged);


	/**
	* getechotraining 
	* Set this to 0 to disable echotraining
	* @behavior.fieldname echotraining 
	**/
	public String getEchotraining();
	
	/**
	*setechotraining 
	* Set this to 0 to disable echotraining
	* @behavior.fieldname echotraining 
	*/
	public void setEchotraining(String aechotraining);


	/**
	* getsectionname 
	* 
	* @behavior.fieldname sectionname 
	**/
	public String getSectionname();
	
	/**
	*setsectionname 
	* 
	* @behavior.fieldname sectionname 
	*/
	public void setSectionname(String asectionname);


}