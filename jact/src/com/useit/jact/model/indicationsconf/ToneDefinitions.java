package com.useit.jact.model.indicationsconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * ToneDefinitions<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ToneDefinitions.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class ToneDefinitions extends AbstractSimpleDataClass implements IToneDefinitions{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ToneDefinitions
	**/
	public ToneDefinitions(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ToneDefinitions
	**/
	public ToneDefinitions( String acountrycode, String adescription, String aalias, String aringcadence, String adial, String abusy, String aring, String acongestion, String acallwaiting, String adialrecall, String arecord, String ainfo){
		super();
	
		this.countrycode = acountrycode;	
		this.description = adescription;	
		this.alias = aalias;	
		this.ringcadence = aringcadence;	
		this.dial = adial;	
		this.busy = abusy;	
		this.ring = aring;	
		this.congestion = acongestion;	
		this.callwaiting = acallwaiting;	
		this.dialrecall = adialrecall;	
		this.record = arecord;	
		this.info = ainfo;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ToneDefinitions object){
		this.countrycode = object.countrycode;	
		this.description = object.description;	
		this.alias = object.alias;	
		this.ringcadence = object.ringcadence;	
		this.dial = object.dial;	
		this.busy = object.busy;	
		this.ring = object.ring;	
		this.congestion = object.congestion;	
		this.callwaiting = object.callwaiting;	
		this.dialrecall = object.dialrecall;	
		this.record = object.record;	
		this.info = object.info;	

	}
//--------------  map Funktionen
	//public static final String CUSTOMTONEMAP = "customToneMap";
	/** die typisierte List die die Aggregierten objekte(CustomToneImpl) enthält */
	protected List<CustomTone> customToneMap = new ArrayList<CustomTone>();
	/** die typisierte Map die die Aggregierten objekte(CustomToneImpl) enthält */
	//protected CustomToneMap customToneMapMap = new CustomToneMap();

	/**
	 * fügt ein CustomTone Objekt zu der Mapp hinzu
	 * @param aCustomTone
	 */
	public boolean addCustomTone(CustomTone aCustomTone){
		return customToneMap.add(aCustomTone);
	}

	/**
	 * removed ein CustomTone Objekt aus der Map
	 * @param aCustomTone
	 */
	public boolean removeCustomTone(CustomTone aCustomTone){
		return customToneMap.remove(aCustomTone);
	}

	

/**
 * gibt die List<CustomTone> customToneMap zurück	
 * @return List<CustomTone>
 * @see  IToneDefinitions#getCustomToneMap
 */
public List<CustomTone> getCustomToneMap() {
	return customToneMap;
}
/**
 * setzt die Map CustomToneMap
 * @param map customToneMapMap
 */
 @SuppressWarnings("unchecked")
public void setCustomToneMap(List aList){
    customToneMap = aList;
   // customToneMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String countrycode;
	public static final String VALUEID_COUNTRYCODE="countrycode" ;

    /**   **/
	protected String description;
	public static final String VALUEID_DESCRIPTION="description" ;

    /**   **/
	protected String alias;
	public static final String VALUEID_ALIAS="alias" ;

    /**   **/
	protected String ringcadence;
	public static final String VALUEID_RINGCADENCE="ringcadence" ;

    /**   **/
	protected String dial;
	public static final String VALUEID_DIAL="dial" ;

    /**   **/
	protected String busy;
	public static final String VALUEID_BUSY="busy" ;

    /**   **/
	protected String ring;
	public static final String VALUEID_RING="ring" ;

    /**   **/
	protected String congestion;
	public static final String VALUEID_CONGESTION="congestion" ;

    /**   **/
	protected String callwaiting;
	public static final String VALUEID_CALLWAITING="callwaiting" ;

    /**   **/
	protected String dialrecall;
	public static final String VALUEID_DIALRECALL="dialrecall" ;

    /**   **/
	protected String record;
	public static final String VALUEID_RECORD="record" ;

    /**   **/
	protected String info;
	public static final String VALUEID_INFO="info" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_COUNTRYCODE.equals(valueid)){
			return true;
		}
		if(VALUEID_DESCRIPTION.equals(valueid)){
			return true;
		}
		if(VALUEID_ALIAS.equals(valueid)){
			return true;
		}
		if(VALUEID_RINGCADENCE.equals(valueid)){
			return true;
		}
		if(VALUEID_DIAL.equals(valueid)){
			return true;
		}
		if(VALUEID_BUSY.equals(valueid)){
			return true;
		}
		if(VALUEID_RING.equals(valueid)){
			return true;
		}
		if(VALUEID_CONGESTION.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLWAITING.equals(valueid)){
			return true;
		}
		if(VALUEID_DIALRECALL.equals(valueid)){
			return true;
		}
		if(VALUEID_RECORD.equals(valueid)){
			return true;
		}
		if(VALUEID_INFO.equals(valueid)){
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
		if(VALUEID_COUNTRYCODE.equals(valueid)){
			setCountrycode((String)data);
			return;
		}
		if(VALUEID_DESCRIPTION.equals(valueid)){
			setDescription((String)data);
			return;
		}
		if(VALUEID_ALIAS.equals(valueid)){
			setAlias((String)data);
			return;
		}
		if(VALUEID_RINGCADENCE.equals(valueid)){
			setRingcadence((String)data);
			return;
		}
		if(VALUEID_DIAL.equals(valueid)){
			setDial((String)data);
			return;
		}
		if(VALUEID_BUSY.equals(valueid)){
			setBusy((String)data);
			return;
		}
		if(VALUEID_RING.equals(valueid)){
			setRing((String)data);
			return;
		}
		if(VALUEID_CONGESTION.equals(valueid)){
			setCongestion((String)data);
			return;
		}
		if(VALUEID_CALLWAITING.equals(valueid)){
			setCallwaiting((String)data);
			return;
		}
		if(VALUEID_DIALRECALL.equals(valueid)){
			setDialrecall((String)data);
			return;
		}
		if(VALUEID_RECORD.equals(valueid)){
			setRecord((String)data);
			return;
		}
		if(VALUEID_INFO.equals(valueid)){
			setInfo((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_COUNTRYCODE.equals(valueid)){
			return getCountrycode();
			
		}
		if(VALUEID_DESCRIPTION.equals(valueid)){
			return getDescription();
			
		}
		if(VALUEID_ALIAS.equals(valueid)){
			return getAlias();
			
		}
		if(VALUEID_RINGCADENCE.equals(valueid)){
			return getRingcadence();
			
		}
		if(VALUEID_DIAL.equals(valueid)){
			return getDial();
			
		}
		if(VALUEID_BUSY.equals(valueid)){
			return getBusy();
			
		}
		if(VALUEID_RING.equals(valueid)){
			return getRing();
			
		}
		if(VALUEID_CONGESTION.equals(valueid)){
			return getCongestion();
			
		}
		if(VALUEID_CALLWAITING.equals(valueid)){
			return getCallwaiting();
			
		}
		if(VALUEID_DIALRECALL.equals(valueid)){
			return getDialrecall();
			
		}
		if(VALUEID_RECORD.equals(valueid)){
			return getRecord();
			
		}
		if(VALUEID_INFO.equals(valueid)){
			return getInfo();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcountrycode 
	* 
	**/
	public String getCountrycode(){		return  countrycode;
	}
	/**
	*setcountrycode 
	*/
	public void setCountrycode(String acountrycode){
		if(acountrycode==null){
		    changed = (this.countrycode!=null);
		    this.countrycode = null;	    
		}else{
			changed = acountrycode.equals(this.countrycode);
			this.countrycode=acountrycode;
		}
	}


	/**
	* getdescription 
	* 
	**/
	public String getDescription(){		return  description;
	}
	/**
	*setdescription 
	*/
	public void setDescription(String adescription){
		if(adescription==null){
		    changed = (this.description!=null);
		    this.description = null;	    
		}else{
			changed = adescription.equals(this.description);
			this.description=adescription;
		}
	}


	/**
	* getalias 
	* 
	**/
	public String getAlias(){		return  alias;
	}
	/**
	*setalias 
	*/
	public void setAlias(String aalias){
		if(aalias==null){
		    changed = (this.alias!=null);
		    this.alias = null;	    
		}else{
			changed = aalias.equals(this.alias);
			this.alias=aalias;
		}
	}


	/**
	* getringcadence 
	* 
	**/
	public String getRingcadence(){		return  ringcadence;
	}
	/**
	*setringcadence 
	*/
	public void setRingcadence(String aringcadence){
		if(aringcadence==null){
		    changed = (this.ringcadence!=null);
		    this.ringcadence = null;	    
		}else{
			changed = aringcadence.equals(this.ringcadence);
			this.ringcadence=aringcadence;
		}
	}


	/**
	* getdial 
	* 
	**/
	public String getDial(){		return  dial;
	}
	/**
	*setdial 
	*/
	public void setDial(String adial){
		if(adial==null){
		    changed = (this.dial!=null);
		    this.dial = null;	    
		}else{
			changed = adial.equals(this.dial);
			this.dial=adial;
		}
	}


	/**
	* getbusy 
	* 
	**/
	public String getBusy(){		return  busy;
	}
	/**
	*setbusy 
	*/
	public void setBusy(String abusy){
		if(abusy==null){
		    changed = (this.busy!=null);
		    this.busy = null;	    
		}else{
			changed = abusy.equals(this.busy);
			this.busy=abusy;
		}
	}


	/**
	* getring 
	* 
	**/
	public String getRing(){		return  ring;
	}
	/**
	*setring 
	*/
	public void setRing(String aring){
		if(aring==null){
		    changed = (this.ring!=null);
		    this.ring = null;	    
		}else{
			changed = aring.equals(this.ring);
			this.ring=aring;
		}
	}


	/**
	* getcongestion 
	* 
	**/
	public String getCongestion(){		return  congestion;
	}
	/**
	*setcongestion 
	*/
	public void setCongestion(String acongestion){
		if(acongestion==null){
		    changed = (this.congestion!=null);
		    this.congestion = null;	    
		}else{
			changed = acongestion.equals(this.congestion);
			this.congestion=acongestion;
		}
	}


	/**
	* getcallwaiting 
	* 
	**/
	public String getCallwaiting(){		return  callwaiting;
	}
	/**
	*setcallwaiting 
	*/
	public void setCallwaiting(String acallwaiting){
		if(acallwaiting==null){
		    changed = (this.callwaiting!=null);
		    this.callwaiting = null;	    
		}else{
			changed = acallwaiting.equals(this.callwaiting);
			this.callwaiting=acallwaiting;
		}
	}


	/**
	* getdialrecall 
	* 
	**/
	public String getDialrecall(){		return  dialrecall;
	}
	/**
	*setdialrecall 
	*/
	public void setDialrecall(String adialrecall){
		if(adialrecall==null){
		    changed = (this.dialrecall!=null);
		    this.dialrecall = null;	    
		}else{
			changed = adialrecall.equals(this.dialrecall);
			this.dialrecall=adialrecall;
		}
	}


	/**
	* getrecord 
	* 
	**/
	public String getRecord(){		return  record;
	}
	/**
	*setrecord 
	*/
	public void setRecord(String arecord){
		if(arecord==null){
		    changed = (this.record!=null);
		    this.record = null;	    
		}else{
			changed = arecord.equals(this.record);
			this.record=arecord;
		}
	}


	/**
	* getinfo 
	* 
	**/
	public String getInfo(){		return  info;
	}
	/**
	*setinfo 
	*/
	public void setInfo(String ainfo){
		if(ainfo==null){
		    changed = (this.info!=null);
		    this.info = null;	    
		}else{
			changed = ainfo.equals(this.info);
			this.info=ainfo;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("countrycode=")
		.append(countrycode)
		.append(",")
		.append("description=")
		.append(description)
		.append(",")
		.append("alias=")
		.append(alias)
		.append(",")
		.append("ringcadence=")
		.append(ringcadence)
		.append(",")
		.append("dial=")
		.append(dial)
		.append(",")
		.append("busy=")
		.append(busy)
		.append(",")
		.append("ring=")
		.append(ring)
		.append(",")
		.append("congestion=")
		.append(congestion)
		.append(",")
		.append("callwaiting=")
		.append(callwaiting)
		.append(",")
		.append("dialrecall=")
		.append(dialrecall)
		.append(",")
		.append("record=")
		.append(record)
		.append(",")
		.append("info=")
		.append(info)
    			.append("]");

		return sb.toString();		
	}}