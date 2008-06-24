package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.PbxContext;


/**
 * <p>
 * Misdnconf<br>
 * chan_misdn sample config general section:  for debugging and general setup, things that are not bound to port groups
 * </p>
 * Created : Fri May 26 14:32:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Misdnconf.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class Misdnconf extends AbstractSimpleDataClass implements IMisdnconf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Misdnconf
	**/
	public Misdnconf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Misdnconf
	**/
	public Misdnconf( Integer adebug, String atracefile, Boolean atrace_calls, String atrace_dir, Boolean abridging, Boolean astop_tone_after_first_digit, Boolean aappend_digits2exten, Boolean al1_info_ok, Boolean aclear_l3, Boolean adynamic_crypt, String acrypt_prefix, String afileid, PbxContext acontext){
		super();
	
		this.debug = adebug;	
		this.tracefile = atracefile;	
		this.trace_calls = atrace_calls;	
		this.trace_dir = atrace_dir;	
		this.bridging = abridging;	
		this.stop_tone_after_first_digit = astop_tone_after_first_digit;	
		this.append_digits2exten = aappend_digits2exten;	
		this.l1_info_ok = al1_info_ok;	
		this.clear_l3 = aclear_l3;	
		this.dynamic_crypt = adynamic_crypt;	
		this.crypt_prefix = acrypt_prefix;	
		this.fileid = afileid;	
		this.context = acontext;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Misdnconf object){
		this.debug = object.debug;	
		this.tracefile = object.tracefile;	
		this.trace_calls = object.trace_calls;	
		this.trace_dir = object.trace_dir;	
		this.bridging = object.bridging;	
		this.stop_tone_after_first_digit = object.stop_tone_after_first_digit;	
		this.append_digits2exten = object.append_digits2exten;	
		this.l1_info_ok = object.l1_info_ok;	
		this.clear_l3 = object.clear_l3;	
		this.dynamic_crypt = object.dynamic_crypt;	
		this.crypt_prefix = object.crypt_prefix;	
		this.fileid = object.fileid;	
		this.context = object.context;	

	}
//--------------  map Funktionen
	//public static final String MISDNCRYPTKEYMAP = "misdnCryptkeyMap";
	/** die typisierte List die die Aggregierten objekte(MisdnCryptkeyImpl) enthält */
	protected List<MisdnCryptkey> misdnCryptkeyMap = new ArrayList<MisdnCryptkey>();
	//public static final String MISDNSECTIONSMAP = "misdnSectionsMap";
	/** die typisierte List die die Aggregierten objekte(MisdnSectionsImpl) enthält */
	protected List<MisdnSections> misdnSectionsMap = new ArrayList<MisdnSections>();
	/** die typisierte Map die die Aggregierten objekte(MisdnCryptkeyImpl) enthält */
	//protected MisdnCryptkeyMap misdnCryptkeyMapMap = new MisdnCryptkeyMap();
	/** die typisierte Map die die Aggregierten objekte(MisdnSectionsImpl) enthält */
	//protected MisdnSectionsMap misdnSectionsMapMap = new MisdnSectionsMap();

	/**
	 * fügt ein MisdnCryptkey Objekt zu der Mapp hinzu
	 * @param aMisdnCryptkey
	 */
	public boolean addMisdnCryptkey(MisdnCryptkey aMisdnCryptkey){
		return misdnCryptkeyMap.add(aMisdnCryptkey);
	}

	/**
	 * removed ein MisdnCryptkey Objekt aus der Map
	 * @param aMisdnCryptkey
	 */
	public boolean removeMisdnCryptkey(MisdnCryptkey aMisdnCryptkey){
		return misdnCryptkeyMap.remove(aMisdnCryptkey);
	}


	/**
	 * fügt ein MisdnSections Objekt zu der Mapp hinzu
	 * @param aMisdnSections
	 */
	public boolean addMisdnSections(MisdnSections aMisdnSections){
		return misdnSectionsMap.add(aMisdnSections);
	}

	/**
	 * removed ein MisdnSections Objekt aus der Map
	 * @param aMisdnSections
	 */
	public boolean removeMisdnSections(MisdnSections aMisdnSections){
		return misdnSectionsMap.remove(aMisdnSections);
	}

	

/**
 * gibt die List<MisdnCryptkey> misdnCryptkeyMap zurück	
 * @return List<MisdnCryptkey>
 * @see  IMisdnconf#getMisdnCryptkeyMap
 */
public List<MisdnCryptkey> getMisdnCryptkeyMap() {
	return misdnCryptkeyMap;
}
/**
 * setzt die Map MisdnCryptkeyMap
 * @param map misdnCryptkeyMapMap
 */
 @SuppressWarnings("unchecked")
public void setMisdnCryptkeyMap(List aList){
    misdnCryptkeyMap = aList;
   // misdnCryptkeyMapTyper.setList(aList); 
}


/**
 * gibt die List<MisdnSections> misdnSectionsMap zurück	
 * @return List<MisdnSections>
 * @see  IMisdnconf#getMisdnSectionsMap
 */
public List<MisdnSections> getMisdnSectionsMap() {
	return misdnSectionsMap;
}
/**
 * setzt die Map MisdnSectionsMap
 * @param map misdnSectionsMapMap
 */
 @SuppressWarnings("unchecked")
public void setMisdnSectionsMap(List aList){
    misdnSectionsMap = aList;
   // misdnSectionsMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
protected MisdnSections fMisdnSections= new MisdnSectionsImpl();
/**
 * @return
 */
public MisdnSections getMisdnSections() {
	return fMisdnSections;
}

/**
 * setzt den MisdnSections und die MisdnSectionsid	
 * @param MisdnSections
 */
public void setMisdnSections(IMisdnSections aMisdnSections) {
	if (aMisdnSections!=null) {
	fMisdnSections = (MisdnSections)aMisdnSections;
	//misdnSections = aMisdnSections.get();
	} //end of if
	
}
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  set debugging flag:  0 - No Debug  1 - mISDN Messages and * - Messages, and * - State changes  2 - Messages + Message specific Informations (e.g. bearer capability)  3 - very Verbose, the above + lots of Driver specific infos 4 - even more Verbose than 3 **/
	protected Integer debug;
	public static final String VALUEID_DEBUG="debug" ;

    /**  the big trace **/
	protected String tracefile;
	public static final String VALUEID_TRACEFILE="tracefile" ;

    /**  single call trace files set to true if you want to have them  they depend on debug level **/
	protected Boolean trace_calls;
	public static final String VALUEID_TRACE_CALLS="trace_calls" ;

    /**  single call trace files  set to true if you want to have them  they depend on debug level **/
	protected String trace_dir;
	public static final String VALUEID_TRACE_DIR="trace_dir" ;

    /**  set to yes if you want mISDN_dsp to bridge the calls in HW **/
	protected Boolean bridging;
	public static final String VALUEID_BRIDGING="bridging" ;

    /**  Stops dialtone after getting first digit on nt Port **/
	protected Boolean stop_tone_after_first_digit;
	public static final String VALUEID_STOP_TONE_AFTER_FIRST_DIGIT="stop_tone_after_first_digit" ;

    /**  Wether to append overlapdialed Digits to Extension or not **/
	protected Boolean append_digits2exten;
	public static final String VALUEID_APPEND_DIGITS2EXTEN="append_digits2exten" ;

    /**  set this to yes if you have jollys mISDN which sends correct L1 Infos **/
	protected Boolean l1_info_ok;
	public static final String VALUEID_L1_INFO_OK="l1_info_ok" ;

    /**  set this to yes if you want to clear the l3 in case the l2 deactivates some environments have a flickering l2 which causes this option to  damage active calls .. highly experimental **/
	protected Boolean clear_l3;
	public static final String VALUEID_CLEAR_L3="clear_l3" ;

    /**  CRYPTION STUFF  Wether to look for dynamic crypting attempt **/
	protected Boolean dynamic_crypt;
	public static final String VALUEID_DYNAMIC_CRYPT="dynamic_crypt" ;

    /**  crypt_prefix, what is used for crypting Protocol **/
	protected String crypt_prefix;
	public static final String VALUEID_CRYPT_PREFIX="crypt_prefix" ;

    /**   **/
	protected String fileid;
	public static final String VALUEID_FILEID="fileid" ;

    /**   **/
	protected PbxContext context;
	public static final String VALUEID_CONTEXT="context" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_DEBUG.equals(valueid)){
			return true;
		}
		if(VALUEID_TRACEFILE.equals(valueid)){
			return true;
		}
		if(VALUEID_TRACE_CALLS.equals(valueid)){
			return true;
		}
		if(VALUEID_TRACE_DIR.equals(valueid)){
			return true;
		}
		if(VALUEID_BRIDGING.equals(valueid)){
			return true;
		}
		if(VALUEID_STOP_TONE_AFTER_FIRST_DIGIT.equals(valueid)){
			return true;
		}
		if(VALUEID_APPEND_DIGITS2EXTEN.equals(valueid)){
			return true;
		}
		if(VALUEID_L1_INFO_OK.equals(valueid)){
			return true;
		}
		if(VALUEID_CLEAR_L3.equals(valueid)){
			return true;
		}
		if(VALUEID_DYNAMIC_CRYPT.equals(valueid)){
			return true;
		}
		if(VALUEID_CRYPT_PREFIX.equals(valueid)){
			return true;
		}
		if(VALUEID_FILEID.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
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
		if(VALUEID_DEBUG.equals(valueid)){
			if(data instanceof String){
		        setDebug(new Integer((String)data));
		        return;
		    }
			setDebug((Integer)data);
			return;
		}
		if(VALUEID_TRACEFILE.equals(valueid)){
			setTracefile((String)data);
			return;
		}
		if(VALUEID_TRACE_CALLS.equals(valueid)){
			if(data instanceof String){
		        setTrace_calls(new Boolean((String)data));
		        return;
		    }
			setTrace_calls((Boolean)data);
			return;
		}
		if(VALUEID_TRACE_DIR.equals(valueid)){
			setTrace_dir((String)data);
			return;
		}
		if(VALUEID_BRIDGING.equals(valueid)){
			if(data instanceof String){
		        setBridging(new Boolean((String)data));
		        return;
		    }
			setBridging((Boolean)data);
			return;
		}
		if(VALUEID_STOP_TONE_AFTER_FIRST_DIGIT.equals(valueid)){
			if(data instanceof String){
		        setStop_tone_after_first_digit(new Boolean((String)data));
		        return;
		    }
			setStop_tone_after_first_digit((Boolean)data);
			return;
		}
		if(VALUEID_APPEND_DIGITS2EXTEN.equals(valueid)){
			if(data instanceof String){
		        setAppend_digits2exten(new Boolean((String)data));
		        return;
		    }
			setAppend_digits2exten((Boolean)data);
			return;
		}
		if(VALUEID_L1_INFO_OK.equals(valueid)){
			if(data instanceof String){
		        setL1_info_ok(new Boolean((String)data));
		        return;
		    }
			setL1_info_ok((Boolean)data);
			return;
		}
		if(VALUEID_CLEAR_L3.equals(valueid)){
			if(data instanceof String){
		        setClear_l3(new Boolean((String)data));
		        return;
		    }
			setClear_l3((Boolean)data);
			return;
		}
		if(VALUEID_DYNAMIC_CRYPT.equals(valueid)){
			if(data instanceof String){
		        setDynamic_crypt(new Boolean((String)data));
		        return;
		    }
			setDynamic_crypt((Boolean)data);
			return;
		}
		if(VALUEID_CRYPT_PREFIX.equals(valueid)){
			setCrypt_prefix((String)data);
			return;
		}
		if(VALUEID_FILEID.equals(valueid)){
			setFileid((String)data);
			return;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			if(data instanceof String){
		        setContext(new PbxContext((String)data));
		        return;
		    }
			setContext((PbxContext)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_DEBUG.equals(valueid)){
			return getDebug();
			
		}
		if(VALUEID_TRACEFILE.equals(valueid)){
			return getTracefile();
			
		}
		if(VALUEID_TRACE_CALLS.equals(valueid)){
			return getTrace_calls();
			
		}
		if(VALUEID_TRACE_DIR.equals(valueid)){
			return getTrace_dir();
			
		}
		if(VALUEID_BRIDGING.equals(valueid)){
			return getBridging();
			
		}
		if(VALUEID_STOP_TONE_AFTER_FIRST_DIGIT.equals(valueid)){
			return getStop_tone_after_first_digit();
			
		}
		if(VALUEID_APPEND_DIGITS2EXTEN.equals(valueid)){
			return getAppend_digits2exten();
			
		}
		if(VALUEID_L1_INFO_OK.equals(valueid)){
			return getL1_info_ok();
			
		}
		if(VALUEID_CLEAR_L3.equals(valueid)){
			return getClear_l3();
			
		}
		if(VALUEID_DYNAMIC_CRYPT.equals(valueid)){
			return getDynamic_crypt();
			
		}
		if(VALUEID_CRYPT_PREFIX.equals(valueid)){
			return getCrypt_prefix();
			
		}
		if(VALUEID_FILEID.equals(valueid)){
			return getFileid();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getdebug 
	* set debugging flag:  0 - No Debug  1 - mISDN Messages and * - Messages, and * - State changes  2 - Messages + Message specific Informations (e.g. bearer capability)  3 - very Verbose, the above + lots of Driver specific infos 4 - even more Verbose than 3
	**/
	public Integer getDebug(){		return  debug;
	}
	/**
	*setdebug 
	*/
	public void setDebug(Integer adebug){
		if(adebug==null){
		    changed = (this.debug!=null);
		    this.debug = null;	    
		}else{
			changed = adebug.equals(this.debug);
			this.debug=adebug;
		}
	}


	/**
	* gettracefile 
	* the big trace
	**/
	public String getTracefile(){		return  tracefile;
	}
	/**
	*settracefile 
	*/
	public void setTracefile(String atracefile){
		if(atracefile==null){
		    changed = (this.tracefile!=null);
		    this.tracefile = null;	    
		}else{
			changed = atracefile.equals(this.tracefile);
			this.tracefile=atracefile;
		}
	}


	/**
	* gettrace_calls 
	* single call trace files set to true if you want to have them  they depend on debug level
	**/
	public Boolean getTrace_calls(){		return  trace_calls;
	}
	/**
	*settrace_calls 
	*/
	public void setTrace_calls(Boolean atrace_calls){
		if(atrace_calls==null){
		    changed = (this.trace_calls!=null);
		    this.trace_calls = null;	    
		}else{
			changed = atrace_calls.equals(this.trace_calls);
			this.trace_calls=atrace_calls;
		}
	}


	/**
	* gettrace_dir 
	* single call trace files  set to true if you want to have them  they depend on debug level
	**/
	public String getTrace_dir(){		return  trace_dir;
	}
	/**
	*settrace_dir 
	*/
	public void setTrace_dir(String atrace_dir){
		if(atrace_dir==null){
		    changed = (this.trace_dir!=null);
		    this.trace_dir = null;	    
		}else{
			changed = atrace_dir.equals(this.trace_dir);
			this.trace_dir=atrace_dir;
		}
	}


	/**
	* getbridging 
	* set to yes if you want mISDN_dsp to bridge the calls in HW
	**/
	public Boolean getBridging(){		return  bridging;
	}
	/**
	*setbridging 
	*/
	public void setBridging(Boolean abridging){
		if(abridging==null){
		    changed = (this.bridging!=null);
		    this.bridging = null;	    
		}else{
			changed = abridging.equals(this.bridging);
			this.bridging=abridging;
		}
	}


	/**
	* getstop_tone_after_first_digit 
	* Stops dialtone after getting first digit on nt Port
	**/
	public Boolean getStop_tone_after_first_digit(){		return  stop_tone_after_first_digit;
	}
	/**
	*setstop_tone_after_first_digit 
	*/
	public void setStop_tone_after_first_digit(Boolean astop_tone_after_first_digit){
		if(astop_tone_after_first_digit==null){
		    changed = (this.stop_tone_after_first_digit!=null);
		    this.stop_tone_after_first_digit = null;	    
		}else{
			changed = astop_tone_after_first_digit.equals(this.stop_tone_after_first_digit);
			this.stop_tone_after_first_digit=astop_tone_after_first_digit;
		}
	}


	/**
	* getappend_digits2exten 
	* Wether to append overlapdialed Digits to Extension or not
	**/
	public Boolean getAppend_digits2exten(){		return  append_digits2exten;
	}
	/**
	*setappend_digits2exten 
	*/
	public void setAppend_digits2exten(Boolean aappend_digits2exten){
		if(aappend_digits2exten==null){
		    changed = (this.append_digits2exten!=null);
		    this.append_digits2exten = null;	    
		}else{
			changed = aappend_digits2exten.equals(this.append_digits2exten);
			this.append_digits2exten=aappend_digits2exten;
		}
	}


	/**
	* getl1_info_ok 
	* set this to yes if you have jollys mISDN which sends correct L1 Infos
	**/
	public Boolean getL1_info_ok(){		return  l1_info_ok;
	}
	/**
	*setl1_info_ok 
	*/
	public void setL1_info_ok(Boolean al1_info_ok){
		if(al1_info_ok==null){
		    changed = (this.l1_info_ok!=null);
		    this.l1_info_ok = null;	    
		}else{
			changed = al1_info_ok.equals(this.l1_info_ok);
			this.l1_info_ok=al1_info_ok;
		}
	}


	/**
	* getclear_l3 
	* set this to yes if you want to clear the l3 in case the l2 deactivates some environments have a flickering l2 which causes this option to  damage active calls .. highly experimental
	**/
	public Boolean getClear_l3(){		return  clear_l3;
	}
	/**
	*setclear_l3 
	*/
	public void setClear_l3(Boolean aclear_l3){
		if(aclear_l3==null){
		    changed = (this.clear_l3!=null);
		    this.clear_l3 = null;	    
		}else{
			changed = aclear_l3.equals(this.clear_l3);
			this.clear_l3=aclear_l3;
		}
	}


	/**
	* getdynamic_crypt 
	* CRYPTION STUFF  Wether to look for dynamic crypting attempt
	**/
	public Boolean getDynamic_crypt(){		return  dynamic_crypt;
	}
	/**
	*setdynamic_crypt 
	*/
	public void setDynamic_crypt(Boolean adynamic_crypt){
		if(adynamic_crypt==null){
		    changed = (this.dynamic_crypt!=null);
		    this.dynamic_crypt = null;	    
		}else{
			changed = adynamic_crypt.equals(this.dynamic_crypt);
			this.dynamic_crypt=adynamic_crypt;
		}
	}


	/**
	* getcrypt_prefix 
	* crypt_prefix, what is used for crypting Protocol
	**/
	public String getCrypt_prefix(){		return  crypt_prefix;
	}
	/**
	*setcrypt_prefix 
	*/
	public void setCrypt_prefix(String acrypt_prefix){
		if(acrypt_prefix==null){
		    changed = (this.crypt_prefix!=null);
		    this.crypt_prefix = null;	    
		}else{
			changed = acrypt_prefix.equals(this.crypt_prefix);
			this.crypt_prefix=acrypt_prefix;
		}
	}


	/**
	* getfileid 
	* 
	**/
	public String getFileid(){		return  fileid;
	}
	/**
	*setfileid 
	*/
	public void setFileid(String afileid){
		if(afileid==null){
		    changed = (this.fileid!=null);
		    this.fileid = null;	    
		}else{
			changed = afileid.equals(this.fileid);
			this.fileid=afileid;
		}
	}


	/**
	* getcontext 
	* 
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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("debug=")
		.append(debug)
		.append(",")
		.append("tracefile=")
		.append(tracefile)
		.append(",")
		.append("trace_calls=")
		.append(trace_calls)
		.append(",")
		.append("trace_dir=")
		.append(trace_dir)
		.append(",")
		.append("bridging=")
		.append(bridging)
		.append(",")
		.append("stop_tone_after_first_digit=")
		.append(stop_tone_after_first_digit)
		.append(",")
		.append("append_digits2exten=")
		.append(append_digits2exten)
		.append(",")
		.append("l1_info_ok=")
		.append(l1_info_ok)
		.append(",")
		.append("clear_l3=")
		.append(clear_l3)
		.append(",")
		.append("dynamic_crypt=")
		.append(dynamic_crypt)
		.append(",")
		.append("crypt_prefix=")
		.append(crypt_prefix)
		.append(",")
		.append("fileid=")
		.append(fileid)
		.append(",")
		.append("context=")
		.append(context)
    			.append("]");

		return sb.toString();		
	}}