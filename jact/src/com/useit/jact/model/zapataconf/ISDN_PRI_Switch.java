package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.Switchtype;


/**
 * <p>
 * ISDN_PRI_Switch<br>
 * If you have a PRI line, specify your type of switch here. (PRI is a type of ISDN typically used to connect a PBX to a telephone exchange. They have multiple channels on the one connection.)
 * </p>
 * Created : Fri May 26 14:32:07 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISDN_PRI_Switch.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class ISDN_PRI_Switch extends AbstractSimpleDataClass implements IISDN_PRI_Switch{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ISDN_PRI_Switch
	**/
	public ISDN_PRI_Switch(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ISDN_PRI_Switch
	**/
	public ISDN_PRI_Switch( Switchtype aswitchtype, String aoverlapdial, String apridialplan, String apriindication){
		super();
	
		this.switchtype = aswitchtype;	
		this.overlapdial = aoverlapdial;	
		this.pridialplan = apridialplan;	
		this.priindication = apriindication;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ISDN_PRI_Switch object){
		this.switchtype = object.switchtype;	
		this.overlapdial = object.overlapdial;	
		this.pridialplan = object.pridialplan;	
		this.priindication = object.priindication;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
protected Multilink_PPP fMultilink_PPP= new Multilink_PPPImpl();
/**
 * @return
 */
public Multilink_PPP getMultilink_PPP() {
	return fMultilink_PPP;
}

/**
 * setzt den Multilink_PPP und die Multilink_PPPid	
 * @param Multilink_PPP
 */
public void setMultilink_PPP(IMultilink_PPP aMultilink_PPP) {
	if (aMultilink_PPP!=null) {
	fMultilink_PPP = (Multilink_PPP)aMultilink_PPP;
	//multilink_PPP = aMultilink_PPP.get();
	} //end of if
	
}
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Sets the type of PRI switch being used. Defaultnational. Acceptable values are:     * national:National ISDN type2 (common in the US)     * ni1:National ISDN type 1     * dms100:Nortel DMS100     * 4ess:AT&T 4ESS     * 5ess:Lucent 5ESS     * euroisdn:EuroISDN     * qsig:Minimalistic protocol to build a "network" with two or more PBX of different vendors! **/
	protected Switchtype switchtype;
	public static final String VALUEID_SWITCHTYPE="switchtype" ;

    /**  Whether Asterisk can dial this switch using overlap digits. Default    overlapdial=yes **/
	protected String overlapdial;
	public static final String VALUEID_OVERLAPDIAL="overlapdial" ;

    /**  Sets an option required for some (rare) switches that require a dialplan parameter to be passed. This option is ignored by most PRI switches. It may be necessary on a few pieces of hardware. Valid options are unknown, local, private, national, and international. This option can almost always be left unchanged from the default. Default national.    pridialplan=local **/
	protected String pridialplan;
	public static final String VALUEID_PRIDIALPLAN="pridialplan" ;

    /**  Tells how Asterisk should indicate Busy() and Congestion() to the switch/user. Default inband. Accepted values are:     * inband:Asterisk plays indication tones without answering; not available on all PRI/BRI subscription lines     * outofband:Asterisk disconnects with busy/congestion information code so the switch will play the indication tones to the caller. Busy() will now do same as setting PRI_CAUSE=17 and Hangup().     priindication=outofband **/
	protected String priindication;
	public static final String VALUEID_PRIINDICATION="priindication" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_SWITCHTYPE.equals(valueid)){
			return true;
		}
		if(VALUEID_OVERLAPDIAL.equals(valueid)){
			return true;
		}
		if(VALUEID_PRIDIALPLAN.equals(valueid)){
			return true;
		}
		if(VALUEID_PRIINDICATION.equals(valueid)){
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
		if(VALUEID_SWITCHTYPE.equals(valueid)){
			if(data instanceof String){
		        setSwitchtype(new Switchtype((String)data));
		        return;
		    }
			setSwitchtype((Switchtype)data);
			return;
		}
		if(VALUEID_OVERLAPDIAL.equals(valueid)){
			setOverlapdial((String)data);
			return;
		}
		if(VALUEID_PRIDIALPLAN.equals(valueid)){
			setPridialplan((String)data);
			return;
		}
		if(VALUEID_PRIINDICATION.equals(valueid)){
			setPriindication((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_SWITCHTYPE.equals(valueid)){
			return getSwitchtype();
			
		}
		if(VALUEID_OVERLAPDIAL.equals(valueid)){
			return getOverlapdial();
			
		}
		if(VALUEID_PRIDIALPLAN.equals(valueid)){
			return getPridialplan();
			
		}
		if(VALUEID_PRIINDICATION.equals(valueid)){
			return getPriindication();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getswitchtype 
	* Sets the type of PRI switch being used. Defaultnational. Acceptable values are:     * national:National ISDN type2 (common in the US)     * ni1:National ISDN type 1     * dms100:Nortel DMS100     * 4ess:AT&T 4ESS     * 5ess:Lucent 5ESS     * euroisdn:EuroISDN     * qsig:Minimalistic protocol to build a "network" with two or more PBX of different vendors!
	**/
	public Switchtype getSwitchtype(){		return  switchtype;
	}
	/**
	*setswitchtype 
	*/
	public void setSwitchtype(Switchtype aswitchtype){
		if(aswitchtype==null){
		    changed = (this.switchtype!=null);
		    this.switchtype = null;	    
		}else{
			changed = aswitchtype.equals(this.switchtype);
			this.switchtype=aswitchtype;
		}
	}


	/**
	* getoverlapdial 
	* Whether Asterisk can dial this switch using overlap digits. Default    overlapdial=yes
	**/
	public String getOverlapdial(){		return  overlapdial;
	}
	/**
	*setoverlapdial 
	*/
	public void setOverlapdial(String aoverlapdial){
		if(aoverlapdial==null){
		    changed = (this.overlapdial!=null);
		    this.overlapdial = null;	    
		}else{
			changed = aoverlapdial.equals(this.overlapdial);
			this.overlapdial=aoverlapdial;
		}
	}


	/**
	* getpridialplan 
	* Sets an option required for some (rare) switches that require a dialplan parameter to be passed. This option is ignored by most PRI switches. It may be necessary on a few pieces of hardware. Valid options are unknown, local, private, national, and international. This option can almost always be left unchanged from the default. Default national.    pridialplan=local
	**/
	public String getPridialplan(){		return  pridialplan;
	}
	/**
	*setpridialplan 
	*/
	public void setPridialplan(String apridialplan){
		if(apridialplan==null){
		    changed = (this.pridialplan!=null);
		    this.pridialplan = null;	    
		}else{
			changed = apridialplan.equals(this.pridialplan);
			this.pridialplan=apridialplan;
		}
	}


	/**
	* getpriindication 
	* Tells how Asterisk should indicate Busy() and Congestion() to the switch/user. Default inband. Accepted values are:     * inband:Asterisk plays indication tones without answering; not available on all PRI/BRI subscription lines     * outofband:Asterisk disconnects with busy/congestion information code so the switch will play the indication tones to the caller. Busy() will now do same as setting PRI_CAUSE=17 and Hangup().     priindication=outofband
	**/
	public String getPriindication(){		return  priindication;
	}
	/**
	*setpriindication 
	*/
	public void setPriindication(String apriindication){
		if(apriindication==null){
		    changed = (this.priindication!=null);
		    this.priindication = null;	    
		}else{
			changed = apriindication.equals(this.priindication);
			this.priindication=apriindication;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("switchtype=")
		.append(switchtype)
		.append(",")
		.append("overlapdial=")
		.append(overlapdial)
		.append(",")
		.append("pridialplan=")
		.append(pridialplan)
		.append(",")
		.append("priindication=")
		.append(priindication)
    			.append("]");

		return sb.toString();		
	}}