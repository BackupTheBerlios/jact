

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Signalling;


/**
 * <p>
 * IZaptelchannel<br>
 * zaptel channel def
 * </p>
 * Created : Fri May 26 14:30:40 CEST 2006
 * 
 * @behavior.elementname Zaptelchannel
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZaptelchannel.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IZaptelchannel {
public static final String MODELNAME = "Zaptelchannel";	
 
// ------   1-1 aggregates
/**
 * @return Analog_Handset_Features the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Analog_Handset_Features 
 */
public IAnalog_Handset_Features getAnalog_Handset_Features();

/**
 * setzt den Analog_Handset_Features und die Analog_Handset_Featuresid	
 * @param Analog_Handset_Features
 */
public void setAnalog_Handset_Features(IAnalog_Handset_Features aAnalog_Handset_Features);
/**
 * @return Analog_Trunk_Features the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Analog_Trunk_Features 
 */
public IAnalog_Trunk_Features getAnalog_Trunk_Features();

/**
 * setzt den Analog_Trunk_Features und die Analog_Trunk_Featuresid	
 * @param Analog_Trunk_Features
 */
public void setAnalog_Trunk_Features(IAnalog_Trunk_Features aAnalog_Trunk_Features);
/**
 * @return Audio_Quality_Tuning_Options the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Audio_Quality_Tuning_Options 
 */
public IAudio_Quality_Tuning_Options getAudio_Quality_Tuning_Options();

/**
 * setzt den Audio_Quality_Tuning_Options und die Audio_Quality_Tuning_Optionsid	
 * @param Audio_Quality_Tuning_Options
 */
public void setAudio_Quality_Tuning_Options(IAudio_Quality_Tuning_Options aAudio_Quality_Tuning_Options);
/**
 * @return Call_Logging_Options the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Call_Logging_Options 
 */
public ICall_Logging_Options getCall_Logging_Options();

/**
 * setzt den Call_Logging_Options und die Call_Logging_Optionsid	
 * @param Call_Logging_Options
 */
public void setCall_Logging_Options(ICall_Logging_Options aCall_Logging_Options);
/**
 * @return Caller_ID_Options the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Caller_ID_Options 
 */
public ICaller_ID_Options getCaller_ID_Options();

/**
 * setzt den Caller_ID_Options und die Caller_ID_Optionsid	
 * @param Caller_ID_Options
 */
public void setCaller_ID_Options(ICaller_ID_Options aCaller_ID_Options);
/**
 * @return ISDN_PRI_Switch the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type ISDN_PRI_Switch 
 */
public IISDN_PRI_Switch getISDN_PRI_Switch();

/**
 * setzt den ISDN_PRI_Switch und die ISDN_PRI_Switchid	
 * @param ISDN_PRI_Switch
 */
public void setISDN_PRI_Switch(IISDN_PRI_Switch aISDN_PRI_Switch);
/**
 * @return Other the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Other 
 */
public IOther getOther();

/**
 * setzt den Other und die Otherid	
 * @param Other
 */
public void setOther(IOther aOther);
/**
 * @return Timing_Parameters the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Timing_Parameters 
 */
public ITiming_Parameters getTiming_Parameters();

/**
 * setzt den Timing_Parameters und die Timing_Parametersid	
 * @param Timing_Parameters
 */
public void setTiming_Parameters(ITiming_Parameters aTiming_Parameters);
// 	public static final String VALUEID_SIGNALLING="signalling" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_CHANNEL="channel" ;
	
	//---------  getter und setter

	/**
	* getsignalling 
	* Sets the channel signaling type. These parameters should match the Zaptel driver configuration. The setting to use depends partly on which interface card you have. Asterisk will fail to start if a channel signaling definition is incorrect or unworkable, if the statements do not match the Zaptel driver configuration, or if the device is not present or properly configured. The correct setting to use is almost certainly one of the following four: fxs_ks, fxo_ks, pri_cpe or pri_net. This setting has no default value; you must set a value before allocating a channel.
	* @behavior.fieldname signalling 
	**/
	public Signalling getSignalling();
	
	/**
	*setsignalling 
	* Sets the channel signaling type. These parameters should match the Zaptel driver configuration. The setting to use depends partly on which interface card you have. Asterisk will fail to start if a channel signaling definition is incorrect or unworkable, if the statements do not match the Zaptel driver configuration, or if the device is not present or properly configured. The correct setting to use is almost certainly one of the following four: fxs_ks, fxo_ks, pri_cpe or pri_net. This setting has no default value; you must set a value before allocating a channel.
	* @behavior.fieldname signalling 
	*/
	public void setSignalling(Signalling asignalling);


	/**
	* getcontext 
	* This specifies which context a call will start in. The context controls how Asterisk will handle the call. Contexts are defined in the Dialplan. Default:"default".    context=internal
	* @behavior.fieldname context 
	**/
	public PbxContext getContext();
	
	/**
	*setcontext 
	* This specifies which context a call will start in. The context controls how Asterisk will handle the call. Contexts are defined in the Dialplan. Default:"default".    context=internal
	* @behavior.fieldname context 
	*/
	public void setContext(PbxContext acontext);


	/**
	* getchannel 
	* This keyword is unlike all the other keywords in this configuration file, because where all the other keywords merely specify settings to use, this keyword causes Asterisk to actually allocate a channel with the settings that have been specified earlier in the file. The channel keyword defines one or more channels. Each channel definition will inherit all options stated ahead of it in this file. Channels maybe specified individually, separated by commas, or as a range separated by a hyphen. Allocating a channel will not "clear" the settings, so any channels defined later on in this file will inherit the options for this channel unless you override settings.
	* @behavior.fieldname channel 
	**/
	public String getChannel();
	
	/**
	*setchannel 
	* This keyword is unlike all the other keywords in this configuration file, because where all the other keywords merely specify settings to use, this keyword causes Asterisk to actually allocate a channel with the settings that have been specified earlier in the file. The channel keyword defines one or more channels. Each channel definition will inherit all options stated ahead of it in this file. Channels maybe specified individually, separated by commas, or as a range separated by a hyphen. Allocating a channel will not "clear" the settings, so any channels defined later on in this file will inherit the options for this channel unless you override settings.
	* @behavior.fieldname channel 
	*/
	public void setChannel(String achannel);


}