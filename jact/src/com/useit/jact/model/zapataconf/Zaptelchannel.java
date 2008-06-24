package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Signalling;


/**
 * <p>
 * Zaptelchannel<br>
 * zaptel channel def
 * </p>
 * Created : Fri May 26 14:32:08 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Zaptelchannel.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Zaptelchannel extends AbstractSimpleDataClass implements IZaptelchannel{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Zaptelchannel
	**/
	public Zaptelchannel(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Zaptelchannel
	**/
	public Zaptelchannel( Signalling asignalling, PbxContext acontext, String achannel){
		super();
	
		this.signalling = asignalling;	
		this.context = acontext;	
		this.channel = achannel;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Zaptelchannel object){
		this.signalling = object.signalling;	
		this.context = object.context;	
		this.channel = object.channel;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
protected Analog_Handset_Features fAnalog_Handset_Features= new Analog_Handset_FeaturesImpl();
/**
 * @return
 */
public Analog_Handset_Features getAnalog_Handset_Features() {
	return fAnalog_Handset_Features;
}

/**
 * setzt den Analog_Handset_Features und die Analog_Handset_Featuresid	
 * @param Analog_Handset_Features
 */
public void setAnalog_Handset_Features(IAnalog_Handset_Features aAnalog_Handset_Features) {
	if (aAnalog_Handset_Features!=null) {
	fAnalog_Handset_Features = (Analog_Handset_Features)aAnalog_Handset_Features;
	//analog_Handset_Features = aAnalog_Handset_Features.get();
	} //end of if
	
}
protected Analog_Trunk_Features fAnalog_Trunk_Features= new Analog_Trunk_FeaturesImpl();
/**
 * @return
 */
public Analog_Trunk_Features getAnalog_Trunk_Features() {
	return fAnalog_Trunk_Features;
}

/**
 * setzt den Analog_Trunk_Features und die Analog_Trunk_Featuresid	
 * @param Analog_Trunk_Features
 */
public void setAnalog_Trunk_Features(IAnalog_Trunk_Features aAnalog_Trunk_Features) {
	if (aAnalog_Trunk_Features!=null) {
	fAnalog_Trunk_Features = (Analog_Trunk_Features)aAnalog_Trunk_Features;
	//analog_Trunk_Features = aAnalog_Trunk_Features.get();
	} //end of if
	
}
protected Audio_Quality_Tuning_Options fAudio_Quality_Tuning_Options= new Audio_Quality_Tuning_OptionsImpl();
/**
 * @return
 */
public Audio_Quality_Tuning_Options getAudio_Quality_Tuning_Options() {
	return fAudio_Quality_Tuning_Options;
}

/**
 * setzt den Audio_Quality_Tuning_Options und die Audio_Quality_Tuning_Optionsid	
 * @param Audio_Quality_Tuning_Options
 */
public void setAudio_Quality_Tuning_Options(IAudio_Quality_Tuning_Options aAudio_Quality_Tuning_Options) {
	if (aAudio_Quality_Tuning_Options!=null) {
	fAudio_Quality_Tuning_Options = (Audio_Quality_Tuning_Options)aAudio_Quality_Tuning_Options;
	//audio_Quality_Tuning_Options = aAudio_Quality_Tuning_Options.get();
	} //end of if
	
}
protected Call_Logging_Options fCall_Logging_Options= new Call_Logging_OptionsImpl();
/**
 * @return
 */
public Call_Logging_Options getCall_Logging_Options() {
	return fCall_Logging_Options;
}

/**
 * setzt den Call_Logging_Options und die Call_Logging_Optionsid	
 * @param Call_Logging_Options
 */
public void setCall_Logging_Options(ICall_Logging_Options aCall_Logging_Options) {
	if (aCall_Logging_Options!=null) {
	fCall_Logging_Options = (Call_Logging_Options)aCall_Logging_Options;
	//call_Logging_Options = aCall_Logging_Options.get();
	} //end of if
	
}
protected Caller_ID_Options fCaller_ID_Options= new Caller_ID_OptionsImpl();
/**
 * @return
 */
public Caller_ID_Options getCaller_ID_Options() {
	return fCaller_ID_Options;
}

/**
 * setzt den Caller_ID_Options und die Caller_ID_Optionsid	
 * @param Caller_ID_Options
 */
public void setCaller_ID_Options(ICaller_ID_Options aCaller_ID_Options) {
	if (aCaller_ID_Options!=null) {
	fCaller_ID_Options = (Caller_ID_Options)aCaller_ID_Options;
	//caller_ID_Options = aCaller_ID_Options.get();
	} //end of if
	
}
protected ISDN_PRI_Switch fISDN_PRI_Switch= new ISDN_PRI_SwitchImpl();
/**
 * @return
 */
public ISDN_PRI_Switch getISDN_PRI_Switch() {
	return fISDN_PRI_Switch;
}

/**
 * setzt den ISDN_PRI_Switch und die ISDN_PRI_Switchid	
 * @param ISDN_PRI_Switch
 */
public void setISDN_PRI_Switch(IISDN_PRI_Switch aISDN_PRI_Switch) {
	if (aISDN_PRI_Switch!=null) {
	fISDN_PRI_Switch = (ISDN_PRI_Switch)aISDN_PRI_Switch;
	//iSDN_PRI_Switch = aISDN_PRI_Switch.get();
	} //end of if
	
}
protected Other fOther= new OtherImpl();
/**
 * @return
 */
public Other getOther() {
	return fOther;
}

/**
 * setzt den Other und die Otherid	
 * @param Other
 */
public void setOther(IOther aOther) {
	if (aOther!=null) {
	fOther = (Other)aOther;
	//other = aOther.get();
	} //end of if
	
}
protected Timing_Parameters fTiming_Parameters= new Timing_ParametersImpl();
/**
 * @return
 */
public Timing_Parameters getTiming_Parameters() {
	return fTiming_Parameters;
}

/**
 * setzt den Timing_Parameters und die Timing_Parametersid	
 * @param Timing_Parameters
 */
public void setTiming_Parameters(ITiming_Parameters aTiming_Parameters) {
	if (aTiming_Parameters!=null) {
	fTiming_Parameters = (Timing_Parameters)aTiming_Parameters;
	//timing_Parameters = aTiming_Parameters.get();
	} //end of if
	
}
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Sets the channel signaling type. These parameters should match the Zaptel driver configuration. The setting to use depends partly on which interface card you have. Asterisk will fail to start if a channel signaling definition is incorrect or unworkable, if the statements do not match the Zaptel driver configuration, or if the device is not present or properly configured. The correct setting to use is almost certainly one of the following four: fxs_ks, fxo_ks, pri_cpe or pri_net. This setting has no default value; you must set a value before allocating a channel. **/
	protected Signalling signalling;
	public static final String VALUEID_SIGNALLING="signalling" ;

    /**  This specifies which context a call will start in. The context controls how Asterisk will handle the call. Contexts are defined in the Dialplan. Default:"default".    context=internal **/
	protected PbxContext context;
	public static final String VALUEID_CONTEXT="context" ;

    /**  This keyword is unlike all the other keywords in this configuration file, because where all the other keywords merely specify settings to use, this keyword causes Asterisk to actually allocate a channel with the settings that have been specified earlier in the file. The channel keyword defines one or more channels. Each channel definition will inherit all options stated ahead of it in this file. Channels maybe specified individually, separated by commas, or as a range separated by a hyphen. Allocating a channel will not "clear" the settings, so any channels defined later on in this file will inherit the options for this channel unless you override settings. **/
	protected String channel;
	public static final String VALUEID_CHANNEL="channel" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_SIGNALLING.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_CHANNEL.equals(valueid)){
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
		if(VALUEID_SIGNALLING.equals(valueid)){
			if(data instanceof String){
		        setSignalling(new Signalling((String)data));
		        return;
		    }
			setSignalling((Signalling)data);
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
		if(VALUEID_CHANNEL.equals(valueid)){
			setChannel((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_SIGNALLING.equals(valueid)){
			return getSignalling();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_CHANNEL.equals(valueid)){
			return getChannel();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getsignalling 
	* Sets the channel signaling type. These parameters should match the Zaptel driver configuration. The setting to use depends partly on which interface card you have. Asterisk will fail to start if a channel signaling definition is incorrect or unworkable, if the statements do not match the Zaptel driver configuration, or if the device is not present or properly configured. The correct setting to use is almost certainly one of the following four: fxs_ks, fxo_ks, pri_cpe or pri_net. This setting has no default value; you must set a value before allocating a channel.
	**/
	public Signalling getSignalling(){		return  signalling;
	}
	/**
	*setsignalling 
	*/
	public void setSignalling(Signalling asignalling){
		if(asignalling==null){
		    changed = (this.signalling!=null);
		    this.signalling = null;	    
		}else{
			changed = asignalling.equals(this.signalling);
			this.signalling=asignalling;
		}
	}


	/**
	* getcontext 
	* This specifies which context a call will start in. The context controls how Asterisk will handle the call. Contexts are defined in the Dialplan. Default:"default".    context=internal
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
	* getchannel 
	* This keyword is unlike all the other keywords in this configuration file, because where all the other keywords merely specify settings to use, this keyword causes Asterisk to actually allocate a channel with the settings that have been specified earlier in the file. The channel keyword defines one or more channels. Each channel definition will inherit all options stated ahead of it in this file. Channels maybe specified individually, separated by commas, or as a range separated by a hyphen. Allocating a channel will not "clear" the settings, so any channels defined later on in this file will inherit the options for this channel unless you override settings.
	**/
	public String getChannel(){		return  channel;
	}
	/**
	*setchannel 
	*/
	public void setChannel(String achannel){
		if(achannel==null){
		    changed = (this.channel!=null);
		    this.channel = null;	    
		}else{
			changed = achannel.equals(this.channel);
			this.channel=achannel;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("signalling=")
		.append(signalling)
		.append(",")
		.append("context=")
		.append(context)
		.append(",")
		.append("channel=")
		.append(channel)
    			.append("]");

		return sb.toString();		
	}}