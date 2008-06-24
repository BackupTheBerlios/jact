

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.Switchtype;


/**
 * <p>
 * IISDN_PRI_Switch<br>
 * If you have a PRI line, specify your type of switch here. (PRI is a type of ISDN typically used to connect a PBX to a telephone exchange. They have multiple channels on the one connection.)
 * </p>
 * Created : Fri May 26 14:30:39 CEST 2006
 * 
 * @behavior.elementname ISDN_PRI_Switch
 * @author urs
 * @version $Revision: 1.1 $, $Id: IISDN_PRI_Switch.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IISDN_PRI_Switch {
public static final String MODELNAME = "ISDN_PRI_Switch";	
 
// ------   1-1 aggregates
/**
 * @return Multilink_PPP the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Multilink_PPP 
 */
public IMultilink_PPP getMultilink_PPP();

/**
 * setzt den Multilink_PPP und die Multilink_PPPid	
 * @param Multilink_PPP
 */
public void setMultilink_PPP(IMultilink_PPP aMultilink_PPP);
// 	public static final String VALUEID_SWITCHTYPE="switchtype" ;
// 	public static final String VALUEID_OVERLAPDIAL="overlapdial" ;
// 	public static final String VALUEID_PRIDIALPLAN="pridialplan" ;
// 	public static final String VALUEID_PRIINDICATION="priindication" ;
	
	//---------  getter und setter

	/**
	* getswitchtype 
	* Sets the type of PRI switch being used. Defaultnational. Acceptable values are:     * national:National ISDN type2 (common in the US)     * ni1:National ISDN type 1     * dms100:Nortel DMS100     * 4ess:AT&T 4ESS     * 5ess:Lucent 5ESS     * euroisdn:EuroISDN     * qsig:Minimalistic protocol to build a "network" with two or more PBX of different vendors!
	* @behavior.fieldname switchtype 
	**/
	public Switchtype getSwitchtype();
	
	/**
	*setswitchtype 
	* Sets the type of PRI switch being used. Defaultnational. Acceptable values are:     * national:National ISDN type2 (common in the US)     * ni1:National ISDN type 1     * dms100:Nortel DMS100     * 4ess:AT&T 4ESS     * 5ess:Lucent 5ESS     * euroisdn:EuroISDN     * qsig:Minimalistic protocol to build a "network" with two or more PBX of different vendors!
	* @behavior.fieldname switchtype 
	*/
	public void setSwitchtype(Switchtype aswitchtype);


	/**
	* getoverlapdial 
	* Whether Asterisk can dial this switch using overlap digits. Default    overlapdial=yes
	* @behavior.fieldname overlapdial 
	**/
	public String getOverlapdial();
	
	/**
	*setoverlapdial 
	* Whether Asterisk can dial this switch using overlap digits. Default    overlapdial=yes
	* @behavior.fieldname overlapdial 
	*/
	public void setOverlapdial(String aoverlapdial);


	/**
	* getpridialplan 
	* Sets an option required for some (rare) switches that require a dialplan parameter to be passed. This option is ignored by most PRI switches. It may be necessary on a few pieces of hardware. Valid options are unknown, local, private, national, and international. This option can almost always be left unchanged from the default. Default national.    pridialplan=local
	* @behavior.fieldname pridialplan 
	**/
	public String getPridialplan();
	
	/**
	*setpridialplan 
	* Sets an option required for some (rare) switches that require a dialplan parameter to be passed. This option is ignored by most PRI switches. It may be necessary on a few pieces of hardware. Valid options are unknown, local, private, national, and international. This option can almost always be left unchanged from the default. Default national.    pridialplan=local
	* @behavior.fieldname pridialplan 
	*/
	public void setPridialplan(String apridialplan);


	/**
	* getpriindication 
	* Tells how Asterisk should indicate Busy() and Congestion() to the switch/user. Default inband. Accepted values are:     * inband:Asterisk plays indication tones without answering; not available on all PRI/BRI subscription lines     * outofband:Asterisk disconnects with busy/congestion information code so the switch will play the indication tones to the caller. Busy() will now do same as setting PRI_CAUSE=17 and Hangup().     priindication=outofband
	* @behavior.fieldname priindication 
	**/
	public String getPriindication();
	
	/**
	*setpriindication 
	* Tells how Asterisk should indicate Busy() and Congestion() to the switch/user. Default inband. Accepted values are:     * inband:Asterisk plays indication tones without answering; not available on all PRI/BRI subscription lines     * outofband:Asterisk disconnects with busy/congestion information code so the switch will play the indication tones to the caller. Busy() will now do same as setting PRI_CAUSE=17 and Hangup().     priindication=outofband
	* @behavior.fieldname priindication 
	*/
	public void setPriindication(String apriindication);


}