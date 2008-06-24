package com.useit.jact.model.featureconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.PbxContext;


/**
 * <p>
 * Featuresconf<br>
 * By default extension 700 is used to park a call. While in a conversation, press # to initiate a transfer, then dial 700. Asterisk will now announce the parking extension, most probably 701 or 702. Now hang up - the caller will be left on hold at the announced extention. Walk up to a different phone, dial 701 and voil? - the conversation can be continued. If a caller has been parked for a longer time than the specified time limit then Asterisk will again ring the originally dialed extension.
 * </p>
 * Created : Fri May 26 14:31:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Featuresconf.java,v 1.1 2008/06/24 20:45:12 urszeidler Exp $
 */
 public  class Featuresconf extends AbstractSimpleDataClass implements IFeaturesconf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Featuresconf
	**/
	public Featuresconf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Featuresconf
	**/
	public Featuresconf( String aparkext, String aparkpos, PbxContext acontext, Integer aparkingtime, Integer atransferdigittimeout, String acourtesytone, String axfersound, String axferfailsound, Boolean aadsipark, String apickupexten, Integer afeaturedigittimeout){
		super();
	
		this.parkext = aparkext;	
		this.parkpos = aparkpos;	
		this.context = acontext;	
		this.parkingtime = aparkingtime;	
		this.transferdigittimeout = atransferdigittimeout;	
		this.courtesytone = acourtesytone;	
		this.xfersound = axfersound;	
		this.xferfailsound = axferfailsound;	
		this.adsipark = aadsipark;	
		this.pickupexten = apickupexten;	
		this.featuredigittimeout = afeaturedigittimeout;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Featuresconf object){
		this.parkext = object.parkext;	
		this.parkpos = object.parkpos;	
		this.context = object.context;	
		this.parkingtime = object.parkingtime;	
		this.transferdigittimeout = object.transferdigittimeout;	
		this.courtesytone = object.courtesytone;	
		this.xfersound = object.xfersound;	
		this.xferfailsound = object.xferfailsound;	
		this.adsipark = object.adsipark;	
		this.pickupexten = object.pickupexten;	
		this.featuredigittimeout = object.featuredigittimeout;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
protected Featuremap fFeaturemap= new FeaturemapImpl();
/**
 * @return
 */
public Featuremap getFeaturemap() {
	return fFeaturemap;
}

/**
 * setzt den Featuremap und die Featuremapid	
 * @param Featuremap
 */
public void setFeaturemap(IFeaturemap aFeaturemap) {
	if (aFeaturemap!=null) {
	fFeaturemap = (Featuremap)aFeaturemap;
	//featuremap = aFeaturemap.get();
	} //end of if
	
}
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  What ext. to dial to park **/
	protected String parkext;
	public static final String VALUEID_PARKEXT="parkext" ;

    /**  What extensions to park calls on **/
	protected String parkpos;
	public static final String VALUEID_PARKPOS="parkpos" ;

    /**  Which context parked calls are in **/
	protected PbxContext context;
	public static final String VALUEID_CONTEXT="context" ;

    /**  Number of seconds a call can be parked for (default is 45 seconds) **/
	protected Integer parkingtime;
	public static final String VALUEID_PARKINGTIME="parkingtime" ;

    /**  Number of seconds to wait between digits when transfering a call **/
	protected Integer transferdigittimeout;
	public static final String VALUEID_TRANSFERDIGITTIMEOUT="transferdigittimeout" ;

    /**  Sound file to play to the parked caller **/
	protected String courtesytone;
	public static final String VALUEID_COURTESYTONE="courtesytone" ;

    /**  to indicate an attended transfer is complete **/
	protected String xfersound;
	public static final String VALUEID_XFERSOUND="xfersound" ;

    /**  to indicate a failed transfer **/
	protected String xferfailsound;
	public static final String VALUEID_XFERFAILSOUND="xferfailsound" ;

    /**  if you want ADSI parking announcements **/
	protected Boolean adsipark;
	public static final String VALUEID_ADSIPARK="adsipark" ;

    /**  Configure the pickup extension.  Default is *8 **/
	protected String pickupexten;
	public static final String VALUEID_PICKUPEXTEN="pickupexten" ;

    /**  Max time (ms) between digits for feature activation.  Default is 500 **/
	protected Integer featuredigittimeout;
	public static final String VALUEID_FEATUREDIGITTIMEOUT="featuredigittimeout" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_PARKEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_PARKPOS.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_PARKINGTIME.equals(valueid)){
			return true;
		}
		if(VALUEID_TRANSFERDIGITTIMEOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_COURTESYTONE.equals(valueid)){
			return true;
		}
		if(VALUEID_XFERSOUND.equals(valueid)){
			return true;
		}
		if(VALUEID_XFERFAILSOUND.equals(valueid)){
			return true;
		}
		if(VALUEID_ADSIPARK.equals(valueid)){
			return true;
		}
		if(VALUEID_PICKUPEXTEN.equals(valueid)){
			return true;
		}
		if(VALUEID_FEATUREDIGITTIMEOUT.equals(valueid)){
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
		if(VALUEID_PARKEXT.equals(valueid)){
			setParkext((String)data);
			return;
		}
		if(VALUEID_PARKPOS.equals(valueid)){
			setParkpos((String)data);
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
		if(VALUEID_PARKINGTIME.equals(valueid)){
			if(data instanceof String){
		        setParkingtime(new Integer((String)data));
		        return;
		    }
			setParkingtime((Integer)data);
			return;
		}
		if(VALUEID_TRANSFERDIGITTIMEOUT.equals(valueid)){
			if(data instanceof String){
		        setTransferdigittimeout(new Integer((String)data));
		        return;
		    }
			setTransferdigittimeout((Integer)data);
			return;
		}
		if(VALUEID_COURTESYTONE.equals(valueid)){
			setCourtesytone((String)data);
			return;
		}
		if(VALUEID_XFERSOUND.equals(valueid)){
			setXfersound((String)data);
			return;
		}
		if(VALUEID_XFERFAILSOUND.equals(valueid)){
			setXferfailsound((String)data);
			return;
		}
		if(VALUEID_ADSIPARK.equals(valueid)){
			if(data instanceof String){
		        setAdsipark(new Boolean((String)data));
		        return;
		    }
			setAdsipark((Boolean)data);
			return;
		}
		if(VALUEID_PICKUPEXTEN.equals(valueid)){
			setPickupexten((String)data);
			return;
		}
		if(VALUEID_FEATUREDIGITTIMEOUT.equals(valueid)){
			if(data instanceof String){
		        setFeaturedigittimeout(new Integer((String)data));
		        return;
		    }
			setFeaturedigittimeout((Integer)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_PARKEXT.equals(valueid)){
			return getParkext();
			
		}
		if(VALUEID_PARKPOS.equals(valueid)){
			return getParkpos();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_PARKINGTIME.equals(valueid)){
			return getParkingtime();
			
		}
		if(VALUEID_TRANSFERDIGITTIMEOUT.equals(valueid)){
			return getTransferdigittimeout();
			
		}
		if(VALUEID_COURTESYTONE.equals(valueid)){
			return getCourtesytone();
			
		}
		if(VALUEID_XFERSOUND.equals(valueid)){
			return getXfersound();
			
		}
		if(VALUEID_XFERFAILSOUND.equals(valueid)){
			return getXferfailsound();
			
		}
		if(VALUEID_ADSIPARK.equals(valueid)){
			return getAdsipark();
			
		}
		if(VALUEID_PICKUPEXTEN.equals(valueid)){
			return getPickupexten();
			
		}
		if(VALUEID_FEATUREDIGITTIMEOUT.equals(valueid)){
			return getFeaturedigittimeout();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getparkext 
	* What ext. to dial to park
	**/
	public String getParkext(){		return  parkext;
	}
	/**
	*setparkext 
	*/
	public void setParkext(String aparkext){
		if(aparkext==null){
		    changed = (this.parkext!=null);
		    this.parkext = null;	    
		}else{
			changed = aparkext.equals(this.parkext);
			this.parkext=aparkext;
		}
	}


	/**
	* getparkpos 
	* What extensions to park calls on
	**/
	public String getParkpos(){		return  parkpos;
	}
	/**
	*setparkpos 
	*/
	public void setParkpos(String aparkpos){
		if(aparkpos==null){
		    changed = (this.parkpos!=null);
		    this.parkpos = null;	    
		}else{
			changed = aparkpos.equals(this.parkpos);
			this.parkpos=aparkpos;
		}
	}


	/**
	* getcontext 
	* Which context parked calls are in
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
	* getparkingtime 
	* Number of seconds a call can be parked for (default is 45 seconds)
	**/
	public Integer getParkingtime(){		return  parkingtime;
	}
	/**
	*setparkingtime 
	*/
	public void setParkingtime(Integer aparkingtime){
		if(aparkingtime==null){
		    changed = (this.parkingtime!=null);
		    this.parkingtime = null;	    
		}else{
			changed = aparkingtime.equals(this.parkingtime);
			this.parkingtime=aparkingtime;
		}
	}


	/**
	* gettransferdigittimeout 
	* Number of seconds to wait between digits when transfering a call
	**/
	public Integer getTransferdigittimeout(){		return  transferdigittimeout;
	}
	/**
	*settransferdigittimeout 
	*/
	public void setTransferdigittimeout(Integer atransferdigittimeout){
		if(atransferdigittimeout==null){
		    changed = (this.transferdigittimeout!=null);
		    this.transferdigittimeout = null;	    
		}else{
			changed = atransferdigittimeout.equals(this.transferdigittimeout);
			this.transferdigittimeout=atransferdigittimeout;
		}
	}


	/**
	* getcourtesytone 
	* Sound file to play to the parked caller
	**/
	public String getCourtesytone(){		return  courtesytone;
	}
	/**
	*setcourtesytone 
	*/
	public void setCourtesytone(String acourtesytone){
		if(acourtesytone==null){
		    changed = (this.courtesytone!=null);
		    this.courtesytone = null;	    
		}else{
			changed = acourtesytone.equals(this.courtesytone);
			this.courtesytone=acourtesytone;
		}
	}


	/**
	* getxfersound 
	* to indicate an attended transfer is complete
	**/
	public String getXfersound(){		return  xfersound;
	}
	/**
	*setxfersound 
	*/
	public void setXfersound(String axfersound){
		if(axfersound==null){
		    changed = (this.xfersound!=null);
		    this.xfersound = null;	    
		}else{
			changed = axfersound.equals(this.xfersound);
			this.xfersound=axfersound;
		}
	}


	/**
	* getxferfailsound 
	* to indicate a failed transfer
	**/
	public String getXferfailsound(){		return  xferfailsound;
	}
	/**
	*setxferfailsound 
	*/
	public void setXferfailsound(String axferfailsound){
		if(axferfailsound==null){
		    changed = (this.xferfailsound!=null);
		    this.xferfailsound = null;	    
		}else{
			changed = axferfailsound.equals(this.xferfailsound);
			this.xferfailsound=axferfailsound;
		}
	}


	/**
	* getadsipark 
	* if you want ADSI parking announcements
	**/
	public Boolean getAdsipark(){		return  adsipark;
	}
	/**
	*setadsipark 
	*/
	public void setAdsipark(Boolean aadsipark){
		if(aadsipark==null){
		    changed = (this.adsipark!=null);
		    this.adsipark = null;	    
		}else{
			changed = aadsipark.equals(this.adsipark);
			this.adsipark=aadsipark;
		}
	}


	/**
	* getpickupexten 
	* Configure the pickup extension.  Default is *8
	**/
	public String getPickupexten(){		return  pickupexten;
	}
	/**
	*setpickupexten 
	*/
	public void setPickupexten(String apickupexten){
		if(apickupexten==null){
		    changed = (this.pickupexten!=null);
		    this.pickupexten = null;	    
		}else{
			changed = apickupexten.equals(this.pickupexten);
			this.pickupexten=apickupexten;
		}
	}


	/**
	* getfeaturedigittimeout 
	* Max time (ms) between digits for feature activation.  Default is 500
	**/
	public Integer getFeaturedigittimeout(){		return  featuredigittimeout;
	}
	/**
	*setfeaturedigittimeout 
	*/
	public void setFeaturedigittimeout(Integer afeaturedigittimeout){
		if(afeaturedigittimeout==null){
		    changed = (this.featuredigittimeout!=null);
		    this.featuredigittimeout = null;	    
		}else{
			changed = afeaturedigittimeout.equals(this.featuredigittimeout);
			this.featuredigittimeout=afeaturedigittimeout;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("parkext=")
		.append(parkext)
		.append(",")
		.append("parkpos=")
		.append(parkpos)
		.append(",")
		.append("context=")
		.append(context)
		.append(",")
		.append("parkingtime=")
		.append(parkingtime)
		.append(",")
		.append("transferdigittimeout=")
		.append(transferdigittimeout)
		.append(",")
		.append("courtesytone=")
		.append(courtesytone)
		.append(",")
		.append("xfersound=")
		.append(xfersound)
		.append(",")
		.append("xferfailsound=")
		.append(xferfailsound)
		.append(",")
		.append("adsipark=")
		.append(adsipark)
		.append(",")
		.append("pickupexten=")
		.append(pickupexten)
		.append(",")
		.append("featuredigittimeout=")
		.append(featuredigittimeout)
    			.append("]");

		return sb.toString();		
	}}