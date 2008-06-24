package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Audio_Quality_Tuning_Options<br>
 * These options adjust certain parameters of Asterisk that affect the audio quality of Zapata channels. See also:     * Echo Cancellation on the Wildcard X100P     * Echo Cancellation in Asterisk     * Asterisk Echo Cancellation<paraDesc>FXO and FXS lines     * Asterisk Echo Avoidance     * Echo Analysis for Voice over IP
 * </p>
 * Created : Fri May 26 14:32:08 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Audio_Quality_Tuning_Options.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Audio_Quality_Tuning_Options extends AbstractSimpleDataClass implements IAudio_Quality_Tuning_Options{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Audio_Quality_Tuning_Options
	**/
	public Audio_Quality_Tuning_Options(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Audio_Quality_Tuning_Options
	**/
	public Audio_Quality_Tuning_Options( Boolean arelaxdtmf, Boolean aechocancel, Boolean aechocancelwhenbridged, Boolean aechotraining, Float arxgain, Float atxgain){
		super();
	
		this.relaxdtmf = arelaxdtmf;	
		this.echocancel = aechocancel;	
		this.echocancelwhenbridged = aechocancelwhenbridged;	
		this.echotraining = aechotraining;	
		this.rxgain = arxgain;	
		this.txgain = atxgain;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Audio_Quality_Tuning_Options object){
		this.relaxdtmf = object.relaxdtmf;	
		this.echocancel = object.echocancel;	
		this.echocancelwhenbridged = object.echocancelwhenbridged;	
		this.echotraining = object.echotraining;	
		this.rxgain = object.rxgain;	
		this.txgain = object.txgain;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  If you are having trouble with DTMF detection, you can relax the DTMF detection parameters. Relaxing them may make the DTMF detector more likely to have "talkoff" where DTMF is detected when it shouldn't be. Default:no.    relaxdtmf=yes **/
	protected Boolean relaxdtmf;
	public static final String VALUEID_RELAXDTMF="relaxdtmf" ;

    /**  Disable or enable echo cancellation (default is 'yes'). It is recommended that you do not turn this off. You may specify echocancel as 'yes' (128 taps), 'no' (0 taps, disabled), or a preset number of taps which are one of 16, 32, 64, 128, or 256. Each tap is one sample from the data stream, so on a T1 this will be 1/8000 of a second. Accordingly the number of taps equate to a 2ms, 4ms, 8ms, 16ms or 32ms tail length. Beware that if you set echocancel to a different value, Asterisk will fall back to the default of 128 taps without warning.    echocancel=no **/
	protected Boolean echocancel;
	public static final String VALUEID_ECHOCANCEL="echocancel" ;

    /**  Enables or disables echo cancellation during a bridged TDM call. In principle, TDM bridged calls should not require echo cancellation, but often times audio performance is improved with this option enabled. Default:no.    echocancelwhenbridged=yes **/
	protected Boolean echocancelwhenbridged;
	public static final String VALUEID_ECHOCANCELWHENBRIDGED="echocancelwhenbridged" ;

    /**  In some cases, the echo canceller doesn't train quickly enough and there is echo at the beginning of the call which then quickly fades out. Enabling echo training will cause Asterisk to briefly mute the channel, send an impulse, and use the impulse response to pre-train the echo canceller so it can start out with a much closer idea of the actual echo. However, the characteristics of some trunks may change as the endpoints become connected and, if there is a considerable delay between the circuit being 'up' and the endpoints being finalised, the training impulse may measure the characteristics of the open trunk rather than the completed circuit. Accordingly you may either specify a value between 10ms and 4000ms to delay before starting the impulse response process or 'yes', which equates to 400ms. Default:undefined.    echotraining=no **/
	protected Boolean echotraining;
	public static final String VALUEID_ECHOTRAINING="echotraining" ;

    /**  Adjusts receive gain. This can be used to raise or lower the incoming volume to compensate for hardware differences. You specify gain as a decimal number from -100 to 100 representing 100% to 100% of capacity. Default value 0.0    rxgain=4.2 **/
	protected Float rxgain;
	public static final String VALUEID_RXGAIN="rxgain" ;

    /**  Adjusts transmit gain. This can be used to raise or lower the outgoing volume to compensate for hardware differences. Takes the same type of argument as rxgain. Default:0.0    txgain=-15.9 **/
	protected Float txgain;
	public static final String VALUEID_TXGAIN="txgain" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_RELAXDTMF.equals(valueid)){
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
		if(VALUEID_RXGAIN.equals(valueid)){
			return true;
		}
		if(VALUEID_TXGAIN.equals(valueid)){
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
		if(VALUEID_RELAXDTMF.equals(valueid)){
			if(data instanceof String){
		        setRelaxdtmf(new Boolean((String)data));
		        return;
		    }
			setRelaxdtmf((Boolean)data);
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
			if(data instanceof String){
		        setEchotraining(new Boolean((String)data));
		        return;
		    }
			setEchotraining((Boolean)data);
			return;
		}
		if(VALUEID_RXGAIN.equals(valueid)){
			if(data instanceof String){
		        setRxgain(new Float((String)data));
		        return;
		    }
			setRxgain((Float)data);
			return;
		}
		if(VALUEID_TXGAIN.equals(valueid)){
			if(data instanceof String){
		        setTxgain(new Float((String)data));
		        return;
		    }
			setTxgain((Float)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_RELAXDTMF.equals(valueid)){
			return getRelaxdtmf();
			
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
		if(VALUEID_RXGAIN.equals(valueid)){
			return getRxgain();
			
		}
		if(VALUEID_TXGAIN.equals(valueid)){
			return getTxgain();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getrelaxdtmf 
	* If you are having trouble with DTMF detection, you can relax the DTMF detection parameters. Relaxing them may make the DTMF detector more likely to have "talkoff" where DTMF is detected when it shouldn't be. Default:no.    relaxdtmf=yes
	**/
	public Boolean getRelaxdtmf(){		return  relaxdtmf;
	}
	/**
	*setrelaxdtmf 
	*/
	public void setRelaxdtmf(Boolean arelaxdtmf){
		if(arelaxdtmf==null){
		    changed = (this.relaxdtmf!=null);
		    this.relaxdtmf = null;	    
		}else{
			changed = arelaxdtmf.equals(this.relaxdtmf);
			this.relaxdtmf=arelaxdtmf;
		}
	}


	/**
	* getechocancel 
	* Disable or enable echo cancellation (default is 'yes'). It is recommended that you do not turn this off. You may specify echocancel as 'yes' (128 taps), 'no' (0 taps, disabled), or a preset number of taps which are one of 16, 32, 64, 128, or 256. Each tap is one sample from the data stream, so on a T1 this will be 1/8000 of a second. Accordingly the number of taps equate to a 2ms, 4ms, 8ms, 16ms or 32ms tail length. Beware that if you set echocancel to a different value, Asterisk will fall back to the default of 128 taps without warning.    echocancel=no
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
	* Enables or disables echo cancellation during a bridged TDM call. In principle, TDM bridged calls should not require echo cancellation, but often times audio performance is improved with this option enabled. Default:no.    echocancelwhenbridged=yes
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
	* In some cases, the echo canceller doesn't train quickly enough and there is echo at the beginning of the call which then quickly fades out. Enabling echo training will cause Asterisk to briefly mute the channel, send an impulse, and use the impulse response to pre-train the echo canceller so it can start out with a much closer idea of the actual echo. However, the characteristics of some trunks may change as the endpoints become connected and, if there is a considerable delay between the circuit being 'up' and the endpoints being finalised, the training impulse may measure the characteristics of the open trunk rather than the completed circuit. Accordingly you may either specify a value between 10ms and 4000ms to delay before starting the impulse response process or 'yes', which equates to 400ms. Default:undefined.    echotraining=no
	**/
	public Boolean getEchotraining(){		return  echotraining;
	}
	/**
	*setechotraining 
	*/
	public void setEchotraining(Boolean aechotraining){
		if(aechotraining==null){
		    changed = (this.echotraining!=null);
		    this.echotraining = null;	    
		}else{
			changed = aechotraining.equals(this.echotraining);
			this.echotraining=aechotraining;
		}
	}


	/**
	* getrxgain 
	* Adjusts receive gain. This can be used to raise or lower the incoming volume to compensate for hardware differences. You specify gain as a decimal number from -100 to 100 representing 100% to 100% of capacity. Default value 0.0    rxgain=4.2
	**/
	public Float getRxgain(){		return  rxgain;
	}
	/**
	*setrxgain 
	*/
	public void setRxgain(Float arxgain){
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
	* Adjusts transmit gain. This can be used to raise or lower the outgoing volume to compensate for hardware differences. Takes the same type of argument as rxgain. Default:0.0    txgain=-15.9
	**/
	public Float getTxgain(){		return  txgain;
	}
	/**
	*settxgain 
	*/
	public void setTxgain(Float atxgain){
		if(atxgain==null){
		    changed = (this.txgain!=null);
		    this.txgain = null;	    
		}else{
			changed = atxgain.equals(this.txgain);
			this.txgain=atxgain;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("relaxdtmf=")
		.append(relaxdtmf)
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
		.append("rxgain=")
		.append(rxgain)
		.append(",")
		.append("txgain=")
		.append(txgain)
    			.append("]");

		return sb.toString();		
	}}