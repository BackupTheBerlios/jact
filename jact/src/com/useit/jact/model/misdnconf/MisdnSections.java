package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.Dialplan;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Presentation;


/**
 * <p>
 * MisdnSections<br>
 * name your sections as you which but not "general" !  the secions are Groups, you can dial out in extensions.conf with Dial(mISDN/g:extern/101) where extern is a section name,  chan_misdn tries every port in this section to find a  new free channel The default section is not a group section, it just contains config elements  which are inherited by group sections.
 * </p>
 * Created : Fri May 26 14:32:01 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnSections.java,v 1.1 2008/06/24 20:45:14 urszeidler Exp $
 */
 public  class MisdnSections extends AbstractSimpleDataClass implements IMisdnSections{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MisdnSections
	**/
	public MisdnSections(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MisdnSections
	**/
	public MisdnSections( PbxContext acontext, String alanguage, String anationalprefix, String ainternationalprefix, Integer arxgain, Integer atxgain, Boolean ate_choose_channel, Boolean aearly_bconnect, Dialplan adialplan, Boolean ause_callingpres, Boolean aalways_immediate, Boolean aimmediate, Boolean ahold_allowed, String apickgroup, String acallgroup, Presentation apresentation, Boolean aechocancel, Boolean aechocancelwhenbridged, String aechotraining, String asectionname){
		super();
	
		this.context = acontext;	
		this.language = alanguage;	
		this.nationalprefix = anationalprefix;	
		this.internationalprefix = ainternationalprefix;	
		this.rxgain = arxgain;	
		this.txgain = atxgain;	
		this.te_choose_channel = ate_choose_channel;	
		this.early_bconnect = aearly_bconnect;	
		this.dialplan = adialplan;	
		this.use_callingpres = ause_callingpres;	
		this.always_immediate = aalways_immediate;	
		this.immediate = aimmediate;	
		this.hold_allowed = ahold_allowed;	
		this.pickgroup = apickgroup;	
		this.callgroup = acallgroup;	
		this.presentation = apresentation;	
		this.echocancel = aechocancel;	
		this.echocancelwhenbridged = aechocancelwhenbridged;	
		this.echotraining = aechotraining;	
		this.sectionname = asectionname;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MisdnSections object){
		this.context = object.context;	
		this.language = object.language;	
		this.nationalprefix = object.nationalprefix;	
		this.internationalprefix = object.internationalprefix;	
		this.rxgain = object.rxgain;	
		this.txgain = object.txgain;	
		this.te_choose_channel = object.te_choose_channel;	
		this.early_bconnect = object.early_bconnect;	
		this.dialplan = object.dialplan;	
		this.use_callingpres = object.use_callingpres;	
		this.always_immediate = object.always_immediate;	
		this.immediate = object.immediate;	
		this.hold_allowed = object.hold_allowed;	
		this.pickgroup = object.pickgroup;	
		this.callgroup = object.callgroup;	
		this.presentation = object.presentation;	
		this.echocancel = object.echocancel;	
		this.echocancelwhenbridged = object.echocancelwhenbridged;	
		this.echotraining = object.echotraining;	
		this.sectionname = object.sectionname;	

	}
//--------------  map Funktionen
	//public static final String MISDNPORTSMAP = "misdnPortsMap";
	/** die typisierte List die die Aggregierten objekte(MisdnPortsImpl) enthält */
	protected List<MisdnPorts> misdnPortsMap = new ArrayList<MisdnPorts>();
	/** die typisierte Map die die Aggregierten objekte(MisdnPortsImpl) enthält */
	//protected MisdnPortsMap misdnPortsMapMap = new MisdnPortsMap();

	/**
	 * fügt ein MisdnPorts Objekt zu der Mapp hinzu
	 * @param aMisdnPorts
	 */
	public boolean addMisdnPorts(MisdnPorts aMisdnPorts){
		return misdnPortsMap.add(aMisdnPorts);
	}

	/**
	 * removed ein MisdnPorts Objekt aus der Map
	 * @param aMisdnPorts
	 */
	public boolean removeMisdnPorts(MisdnPorts aMisdnPorts){
		return misdnPortsMap.remove(aMisdnPorts);
	}

	

/**
 * gibt die List<MisdnPorts> misdnPortsMap zurück	
 * @return List<MisdnPorts>
 * @see  IMisdnSections#getMisdnPortsMap
 */
public List<MisdnPorts> getMisdnPortsMap() {
	return misdnPortsMap;
}
/**
 * setzt die Map MisdnPortsMap
 * @param map misdnPortsMapMap
 */
 @SuppressWarnings("unchecked")
public void setMisdnPortsMap(List aList){
    misdnPortsMap = aList;
   // misdnPortsMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  define your default context here **/
	protected PbxContext context;
	public static final String VALUEID_CONTEXT="context" ;

    /**  Group Specific Language **/
	protected String language;
	public static final String VALUEID_LANGUAGE="language" ;

    /**  Prefixes for national and international, those are putted before the 
  oad if an according dialplan is set by the other end. **/
	protected String nationalprefix;
	public static final String VALUEID_NATIONALPREFIX="nationalprefix" ;

    /**  Prefixes for national and international, those are putted before the  oad if an according dialplan is set by the other end. **/
	protected String internationalprefix;
	public static final String VALUEID_INTERNATIONALPREFIX="internationalprefix" ;

    /**  set rx/tx gains between -8 and 8 to change the RX/TX Gain **/
	protected Integer rxgain;
	public static final String VALUEID_RXGAIN="rxgain" ;

    /**  set rx/tx gains between -8 and 8 to change the RX/TX Gain **/
	protected Integer txgain;
	public static final String VALUEID_TXGAIN="txgain" ;

    /**  Some telcos espacially in NL seem to need this set to yes, this is disabled  by default, also in switzerland this seems to be important **/
	protected Boolean te_choose_channel;
	public static final String VALUEID_TE_CHOOSE_CHANNEL="te_choose_channel" ;

    /**  wether to connect bchannel when getting proceeding **/
	protected Boolean early_bconnect;
	public static final String VALUEID_EARLY_BCONNECT="early_bconnect" ;

    /**  dialplan options:   0 - unknown  1 - National  2 - International  4 - Subscriber This setting is used for outgoing calls **/
	protected Dialplan dialplan;
	public static final String VALUEID_DIALPLAN="dialplan" ;

    /**  This is only for asterisk head and will result in only considering  misdn.confs and misdn_set_opts callingpresentation informations if set to no. Otherwise asterisks callingpresentation overwrites misdn.confs settings. **/
	protected Boolean use_callingpres;
	public static final String VALUEID_USE_CALLINGPRES="use_callingpres" ;

    /**  uncomment the following to get into s extension at extension conf
  there you can use DigitTimeout if you can't or don't want to use
  isdn overlap dial. 
  note: This will jump into the s exten for every exten ! **/
	protected Boolean always_immediate;
	public static final String VALUEID_ALWAYS_IMMEDIATE="always_immediate" ;

    /**  uncomment the following if you want callers which called exactly the 
  base number (so no extension is set) jump to the s extension.
  if the user dials something more it jumps to the correct extension 
  instead **/
	protected Boolean immediate;
	public static final String VALUEID_IMMEDIATE="immediate" ;

    /**  uncomment the following to have hold and retrieve support hold_allowed **/
	protected Boolean hold_allowed;
	public static final String VALUEID_HOLD_ALLOWED="hold_allowed" ;

    /**  Pickup and Callgroup **/
	protected String pickgroup;
	public static final String VALUEID_PICKGROUP="pickgroup" ;

    /**  Pickup and Callgroup **/
	protected String callgroup;
	public static final String VALUEID_CALLGROUP="callgroup" ;

    /**  Allows/Screens Callerid  possible values:  allowed not_screened be aware, if you set to allowed you need to set a correct  callerid in the dialplan or set it here in the misdn.conf Some Telcos don't care about wrong callerids, others do ! **/
	protected Presentation presentation;
	public static final String VALUEID_PRESENTATION="presentation" ;

    /**  this enables echocancelation, with the given number of taps  be aware, move this setting only to outgoing portgroups ! **/
	protected Boolean echocancel;
	public static final String VALUEID_ECHOCANCEL="echocancel" ;

    /**  this disables echocancellation when the call is bridged between  mISDN channels **/
	protected Boolean echocancelwhenbridged;
	public static final String VALUEID_ECHOCANCELWHENBRIDGED="echocancelwhenbridged" ;

    /**  Set this to 0 to disable echotraining **/
	protected String echotraining;
	public static final String VALUEID_ECHOTRAINING="echotraining" ;

    /**   **/
	protected String sectionname;
	public static final String VALUEID_SECTIONNAME="sectionname" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			return true;
		}
		if(VALUEID_NATIONALPREFIX.equals(valueid)){
			return true;
		}
		if(VALUEID_INTERNATIONALPREFIX.equals(valueid)){
			return true;
		}
		if(VALUEID_RXGAIN.equals(valueid)){
			return true;
		}
		if(VALUEID_TXGAIN.equals(valueid)){
			return true;
		}
		if(VALUEID_TE_CHOOSE_CHANNEL.equals(valueid)){
			return true;
		}
		if(VALUEID_EARLY_BCONNECT.equals(valueid)){
			return true;
		}
		if(VALUEID_DIALPLAN.equals(valueid)){
			return true;
		}
		if(VALUEID_USE_CALLINGPRES.equals(valueid)){
			return true;
		}
		if(VALUEID_ALWAYS_IMMEDIATE.equals(valueid)){
			return true;
		}
		if(VALUEID_IMMEDIATE.equals(valueid)){
			return true;
		}
		if(VALUEID_HOLD_ALLOWED.equals(valueid)){
			return true;
		}
		if(VALUEID_PICKGROUP.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLGROUP.equals(valueid)){
			return true;
		}
		if(VALUEID_PRESENTATION.equals(valueid)){
			return true;
		}
		if(VALUEID_ECHOCANCEL.equals(valueid)){
			return true;
		}
		if(VALUEID_ECHOCANCELWHENBRIDGED.equals(valueid)){
			return true;
		}
		if(VALUEID_ECHOTRAINING.equals(valueid)){
			return true;
		}
		if(VALUEID_SECTIONNAME.equals(valueid)){
			return true;
		}
	    return false;
	}
	
	/**
	 * setzt einen Wert per valueid
	 * @param valueid
	 * @param data
	 */
	public void setByValue(String valueid,Object data){
		if(VALUEID_CONTEXT.equals(valueid)){
			if(data instanceof String){
		        setContext(new PbxContext((String)data));
		        return;
		    }
			setContext((PbxContext)data);
			return;
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			setLanguage((String)data);
			return;
		}
		if(VALUEID_NATIONALPREFIX.equals(valueid)){
			setNationalprefix((String)data);
			return;
		}
		if(VALUEID_INTERNATIONALPREFIX.equals(valueid)){
			setInternationalprefix((String)data);
			return;
		}
		if(VALUEID_RXGAIN.equals(valueid)){
			if(data instanceof String){
		        setRxgain(new Integer((String)data));
		        return;
		    }
			setRxgain((Integer)data);
			return;
		}
		if(VALUEID_TXGAIN.equals(valueid)){
			if(data instanceof String){
		        setTxgain(new Integer((String)data));
		        return;
		    }
			setTxgain((Integer)data);
			return;
		}
		if(VALUEID_TE_CHOOSE_CHANNEL.equals(valueid)){
			if(data instanceof String){
		        setTe_choose_channel(new Boolean((String)data));
		        return;
		    }
			setTe_choose_channel((Boolean)data);
			return;
		}
		if(VALUEID_EARLY_BCONNECT.equals(valueid)){
			if(data instanceof String){
		        setEarly_bconnect(new Boolean((String)data));
		        return;
		    }
			setEarly_bconnect((Boolean)data);
			return;
		}
		if(VALUEID_DIALPLAN.equals(valueid)){
			if(data instanceof String){
		        setDialplan(new Dialplan((String)data));
		        return;
		    }
			setDialplan((Dialplan)data);
			return;
		}
		if(VALUEID_USE_CALLINGPRES.equals(valueid)){
			if(data instanceof String){
		        setUse_callingpres(new Boolean((String)data));
		        return;
		    }
			setUse_callingpres((Boolean)data);
			return;
		}
		if(VALUEID_ALWAYS_IMMEDIATE.equals(valueid)){
			if(data instanceof String){
		        setAlways_immediate(new Boolean((String)data));
		        return;
		    }
			setAlways_immediate((Boolean)data);
			return;
		}
		if(VALUEID_IMMEDIATE.equals(valueid)){
			if(data instanceof String){
		        setImmediate(new Boolean((String)data));
		        return;
		    }
			setImmediate((Boolean)data);
			return;
		}
		if(VALUEID_HOLD_ALLOWED.equals(valueid)){
			if(data instanceof String){
		        setHold_allowed(new Boolean((String)data));
		        return;
		    }
			setHold_allowed((Boolean)data);
			return;
		}
		if(VALUEID_PICKGROUP.equals(valueid)){
			setPickgroup((String)data);
			return;
		}
		if(VALUEID_CALLGROUP.equals(valueid)){
			setCallgroup((String)data);
			return;
		}
		if(VALUEID_PRESENTATION.equals(valueid)){
			if(data instanceof String){
		        setPresentation(new Presentation((String)data));
		        return;
		    }
			setPresentation((Presentation)data);
			return;
		}
		if(VALUEID_ECHOCANCEL.equals(valueid)){
			if(data instanceof String){
		        setEchocancel(new Boolean((String)data));
		        return;
		    }
			setEchocancel((Boolean)data);
			return;
		}
		if(VALUEID_ECHOCANCELWHENBRIDGED.equals(valueid)){
			if(data instanceof String){
		        setEchocancelwhenbridged(new Boolean((String)data));
		        return;
		    }
			setEchocancelwhenbridged((Boolean)data);
			return;
		}
		if(VALUEID_ECHOTRAINING.equals(valueid)){
			setEchotraining((String)data);
			return;
		}
		if(VALUEID_SECTIONNAME.equals(valueid)){
			setSectionname((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			return getLanguage();
			
		}
		if(VALUEID_NATIONALPREFIX.equals(valueid)){
			return getNationalprefix();
			
		}
		if(VALUEID_INTERNATIONALPREFIX.equals(valueid)){
			return getInternationalprefix();
			
		}
		if(VALUEID_RXGAIN.equals(valueid)){
			return getRxgain();
			
		}
		if(VALUEID_TXGAIN.equals(valueid)){
			return getTxgain();
			
		}
		if(VALUEID_TE_CHOOSE_CHANNEL.equals(valueid)){
			return getTe_choose_channel();
			
		}
		if(VALUEID_EARLY_BCONNECT.equals(valueid)){
			return getEarly_bconnect();
			
		}
		if(VALUEID_DIALPLAN.equals(valueid)){
			return getDialplan();
			
		}
		if(VALUEID_USE_CALLINGPRES.equals(valueid)){
			return getUse_callingpres();
			
		}
		if(VALUEID_ALWAYS_IMMEDIATE.equals(valueid)){
			return getAlways_immediate();
			
		}
		if(VALUEID_IMMEDIATE.equals(valueid)){
			return getImmediate();
			
		}
		if(VALUEID_HOLD_ALLOWED.equals(valueid)){
			return getHold_allowed();
			
		}
		if(VALUEID_PICKGROUP.equals(valueid)){
			return getPickgroup();
			
		}
		if(VALUEID_CALLGROUP.equals(valueid)){
			return getCallgroup();
			
		}
		if(VALUEID_PRESENTATION.equals(valueid)){
			return getPresentation();
			
		}
		if(VALUEID_ECHOCANCEL.equals(valueid)){
			return getEchocancel();
			
		}
		if(VALUEID_ECHOCANCELWHENBRIDGED.equals(valueid)){
			return getEchocancelwhenbridged();
			
		}
		if(VALUEID_ECHOTRAINING.equals(valueid)){
			return getEchotraining();
			
		}
		if(VALUEID_SECTIONNAME.equals(valueid)){
			return getSectionname();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcontext 
	* define your default context here
	**/
	public PbxContext getContext(){		return  context;
	}
	/**
	*setcontext 
	*/
	public void setContext(PbxContext acontext){
		if(acontext==null){
		    changed = (this.context!=null);
		    this.context = null;	    
		}else{
			changed = acontext.equals(this.context);
			this.context=acontext;
		}
	}


	/**
	* getlanguage 
	* Group Specific Language
	**/
	public String getLanguage(){		return  language;
	}
	/**
	*setlanguage 
	*/
	public void setLanguage(String alanguage){
		if(alanguage==null){
		    changed = (this.language!=null);
		    this.language = null;	    
		}else{
			changed = alanguage.equals(this.language);
			this.language=alanguage;
		}
	}


	/**
	* getnationalprefix 
	* Prefixes for national and international, those are putted before the 
  oad if an according dialplan is set by the other end.
	**/
	public String getNationalprefix(){		return  nationalprefix;
	}
	/**
	*setnationalprefix 
	*/
	public void setNationalprefix(String anationalprefix){
		if(anationalprefix==null){
		    changed = (this.nationalprefix!=null);
		    this.nationalprefix = null;	    
		}else{
			changed = anationalprefix.equals(this.nationalprefix);
			this.nationalprefix=anationalprefix;
		}
	}


	/**
	* getinternationalprefix 
	* Prefixes for national and international, those are putted before the  oad if an according dialplan is set by the other end.
	**/
	public String getInternationalprefix(){		return  internationalprefix;
	}
	/**
	*setinternationalprefix 
	*/
	public void setInternationalprefix(String ainternationalprefix){
		if(ainternationalprefix==null){
		    changed = (this.internationalprefix!=null);
		    this.internationalprefix = null;	    
		}else{
			changed = ainternationalprefix.equals(this.internationalprefix);
			this.internationalprefix=ainternationalprefix;
		}
	}


	/**
	* getrxgain 
	* set rx/tx gains between -8 and 8 to change the RX/TX Gain
	**/
	public Integer getRxgain(){		return  rxgain;
	}
	/**
	*setrxgain 
	*/
	public void setRxgain(Integer arxgain){
		if(arxgain==null){
		    changed = (this.rxgain!=null);
		    this.rxgain = null;	    
		}else{
			changed = arxgain.equals(this.rxgain);
			this.rxgain=arxgain;
		}
	}


	/**
	* gettxgain 
	* set rx/tx gains between -8 and 8 to change the RX/TX Gain
	**/
	public Integer getTxgain(){		return  txgain;
	}
	/**
	*settxgain 
	*/
	public void setTxgain(Integer atxgain){
		if(atxgain==null){
		    changed = (this.txgain!=null);
		    this.txgain = null;	    
		}else{
			changed = atxgain.equals(this.txgain);
			this.txgain=atxgain;
		}
	}


	/**
	* gette_choose_channel 
	* Some telcos espacially in NL seem to need this set to yes, this is disabled  by default, also in switzerland this seems to be important
	**/
	public Boolean getTe_choose_channel(){		return  te_choose_channel;
	}
	/**
	*sette_choose_channel 
	*/
	public void setTe_choose_channel(Boolean ate_choose_channel){
		if(ate_choose_channel==null){
		    changed = (this.te_choose_channel!=null);
		    this.te_choose_channel = null;	    
		}else{
			changed = ate_choose_channel.equals(this.te_choose_channel);
			this.te_choose_channel=ate_choose_channel;
		}
	}


	/**
	* getearly_bconnect 
	* wether to connect bchannel when getting proceeding
	**/
	public Boolean getEarly_bconnect(){		return  early_bconnect;
	}
	/**
	*setearly_bconnect 
	*/
	public void setEarly_bconnect(Boolean aearly_bconnect){
		if(aearly_bconnect==null){
		    changed = (this.early_bconnect!=null);
		    this.early_bconnect = null;	    
		}else{
			changed = aearly_bconnect.equals(this.early_bconnect);
			this.early_bconnect=aearly_bconnect;
		}
	}


	/**
	* getdialplan 
	* dialplan options:   0 - unknown  1 - National  2 - International  4 - Subscriber This setting is used for outgoing calls
	**/
	public Dialplan getDialplan(){		return  dialplan;
	}
	/**
	*setdialplan 
	*/
	public void setDialplan(Dialplan adialplan){
		if(adialplan==null){
		    changed = (this.dialplan!=null);
		    this.dialplan = null;	    
		}else{
			changed = adialplan.equals(this.dialplan);
			this.dialplan=adialplan;
		}
	}


	/**
	* getuse_callingpres 
	* This is only for asterisk head and will result in only considering  misdn.confs and misdn_set_opts callingpresentation informations if set to no. Otherwise asterisks callingpresentation overwrites misdn.confs settings.
	**/
	public Boolean getUse_callingpres(){		return  use_callingpres;
	}
	/**
	*setuse_callingpres 
	*/
	public void setUse_callingpres(Boolean ause_callingpres){
		if(ause_callingpres==null){
		    changed = (this.use_callingpres!=null);
		    this.use_callingpres = null;	    
		}else{
			changed = ause_callingpres.equals(this.use_callingpres);
			this.use_callingpres=ause_callingpres;
		}
	}


	/**
	* getalways_immediate 
	* uncomment the following to get into s extension at extension conf
  there you can use DigitTimeout if you can't or don't want to use
  isdn overlap dial. 
  note: This will jump into the s exten for every exten !
	**/
	public Boolean getAlways_immediate(){		return  always_immediate;
	}
	/**
	*setalways_immediate 
	*/
	public void setAlways_immediate(Boolean aalways_immediate){
		if(aalways_immediate==null){
		    changed = (this.always_immediate!=null);
		    this.always_immediate = null;	    
		}else{
			changed = aalways_immediate.equals(this.always_immediate);
			this.always_immediate=aalways_immediate;
		}
	}


	/**
	* getimmediate 
	* uncomment the following if you want callers which called exactly the 
  base number (so no extension is set) jump to the s extension.
  if the user dials something more it jumps to the correct extension 
  instead
	**/
	public Boolean getImmediate(){		return  immediate;
	}
	/**
	*setimmediate 
	*/
	public void setImmediate(Boolean aimmediate){
		if(aimmediate==null){
		    changed = (this.immediate!=null);
		    this.immediate = null;	    
		}else{
			changed = aimmediate.equals(this.immediate);
			this.immediate=aimmediate;
		}
	}


	/**
	* gethold_allowed 
	* uncomment the following to have hold and retrieve support hold_allowed
	**/
	public Boolean getHold_allowed(){		return  hold_allowed;
	}
	/**
	*sethold_allowed 
	*/
	public void setHold_allowed(Boolean ahold_allowed){
		if(ahold_allowed==null){
		    changed = (this.hold_allowed!=null);
		    this.hold_allowed = null;	    
		}else{
			changed = ahold_allowed.equals(this.hold_allowed);
			this.hold_allowed=ahold_allowed;
		}
	}


	/**
	* getpickgroup 
	* Pickup and Callgroup
	**/
	public String getPickgroup(){		return  pickgroup;
	}
	/**
	*setpickgroup 
	*/
	public void setPickgroup(String apickgroup){
		if(apickgroup==null){
		    changed = (this.pickgroup!=null);
		    this.pickgroup = null;	    
		}else{
			changed = apickgroup.equals(this.pickgroup);
			this.pickgroup=apickgroup;
		}
	}


	/**
	* getcallgroup 
	* Pickup and Callgroup
	**/
	public String getCallgroup(){		return  callgroup;
	}
	/**
	*setcallgroup 
	*/
	public void setCallgroup(String acallgroup){
		if(acallgroup==null){
		    changed = (this.callgroup!=null);
		    this.callgroup = null;	    
		}else{
			changed = acallgroup.equals(this.callgroup);
			this.callgroup=acallgroup;
		}
	}


	/**
	* getpresentation 
	* Allows/Screens Callerid  possible values:  allowed not_screened be aware, if you set to allowed you need to set a correct  callerid in the dialplan or set it here in the misdn.conf Some Telcos don't care about wrong callerids, others do !
	**/
	public Presentation getPresentation(){		return  presentation;
	}
	/**
	*setpresentation 
	*/
	public void setPresentation(Presentation apresentation){
		if(apresentation==null){
		    changed = (this.presentation!=null);
		    this.presentation = null;	    
		}else{
			changed = apresentation.equals(this.presentation);
			this.presentation=apresentation;
		}
	}


	/**
	* getechocancel 
	* this enables echocancelation, with the given number of taps  be aware, move this setting only to outgoing portgroups !
	**/
	public Boolean getEchocancel(){		return  echocancel;
	}
	/**
	*setechocancel 
	*/
	public void setEchocancel(Boolean aechocancel){
		if(aechocancel==null){
		    changed = (this.echocancel!=null);
		    this.echocancel = null;	    
		}else{
			changed = aechocancel.equals(this.echocancel);
			this.echocancel=aechocancel;
		}
	}


	/**
	* getechocancelwhenbridged 
	* this disables echocancellation when the call is bridged between  mISDN channels
	**/
	public Boolean getEchocancelwhenbridged(){		return  echocancelwhenbridged;
	}
	/**
	*setechocancelwhenbridged 
	*/
	public void setEchocancelwhenbridged(Boolean aechocancelwhenbridged){
		if(aechocancelwhenbridged==null){
		    changed = (this.echocancelwhenbridged!=null);
		    this.echocancelwhenbridged = null;	    
		}else{
			changed = aechocancelwhenbridged.equals(this.echocancelwhenbridged);
			this.echocancelwhenbridged=aechocancelwhenbridged;
		}
	}


	/**
	* getechotraining 
	* Set this to 0 to disable echotraining
	**/
	public String getEchotraining(){		return  echotraining;
	}
	/**
	*setechotraining 
	*/
	public void setEchotraining(String aechotraining){
		if(aechotraining==null){
		    changed = (this.echotraining!=null);
		    this.echotraining = null;	    
		}else{
			changed = aechotraining.equals(this.echotraining);
			this.echotraining=aechotraining;
		}
	}


	/**
	* getsectionname 
	* 
	**/
	public String getSectionname(){		return  sectionname;
	}
	/**
	*setsectionname 
	*/
	public void setSectionname(String asectionname){
		if(asectionname==null){
		    changed = (this.sectionname!=null);
		    this.sectionname = null;	    
		}else{
			changed = asectionname.equals(this.sectionname);
			this.sectionname=asectionname;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("context=")
		.append(context)
		.append(",")
		.append("language=")
		.append(language)
		.append(",")
		.append("nationalprefix=")
		.append(nationalprefix)
		.append(",")
		.append("internationalprefix=")
		.append(internationalprefix)
		.append(",")
		.append("rxgain=")
		.append(rxgain)
		.append(",")
		.append("txgain=")
		.append(txgain)
		.append(",")
		.append("te_choose_channel=")
		.append(te_choose_channel)
		.append(",")
		.append("early_bconnect=")
		.append(early_bconnect)
		.append(",")
		.append("dialplan=")
		.append(dialplan)
		.append(",")
		.append("use_callingpres=")
		.append(use_callingpres)
		.append(",")
		.append("always_immediate=")
		.append(always_immediate)
		.append(",")
		.append("immediate=")
		.append(immediate)
		.append(",")
		.append("hold_allowed=")
		.append(hold_allowed)
		.append(",")
		.append("pickgroup=")
		.append(pickgroup)
		.append(",")
		.append("callgroup=")
		.append(callgroup)
		.append(",")
		.append("presentation=")
		.append(presentation)
		.append(",")
		.append("echocancel=")
		.append(echocancel)
		.append(",")
		.append("echocancelwhenbridged=")
		.append(echocancelwhenbridged)
		.append(",")
		.append("echotraining=")
		.append(echotraining)
		.append(",")
		.append("sectionname=")
		.append(sectionname)
    			.append("]");

		return sb.toString();		
	}}