

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAudio_Quality_Tuning_Options<br>
 * These options adjust certain parameters of Asterisk that affect the audio quality of Zapata channels. See also:     * Echo Cancellation on the Wildcard X100P     * Echo Cancellation in Asterisk     * Asterisk Echo Cancellation<paraDesc>FXO and FXS lines     * Asterisk Echo Avoidance     * Echo Analysis for Voice over IP
 * </p>
 * Created : Fri May 26 14:30:40 CEST 2006
 * 
 * @behavior.elementname Audio_Quality_Tuning_Options
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAudio_Quality_Tuning_Options.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IAudio_Quality_Tuning_Options {
public static final String MODELNAME = "Audio_Quality_Tuning_Options";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_RELAXDTMF="relaxdtmf" ;
// 	public static final String VALUEID_ECHOCANCEL="echocancel" ;
// 	public static final String VALUEID_ECHOCANCELWHENBRIDGED="echocancelwhenbridged" ;
// 	public static final String VALUEID_ECHOTRAINING="echotraining" ;
// 	public static final String VALUEID_RXGAIN="rxgain" ;
// 	public static final String VALUEID_TXGAIN="txgain" ;
	
	//---------  getter und setter

	/**
	* getrelaxdtmf 
	* If you are having trouble with DTMF detection, you can relax the DTMF detection parameters. Relaxing them may make the DTMF detector more likely to have "talkoff" where DTMF is detected when it shouldn't be. Default:no.    relaxdtmf=yes
	* @behavior.fieldname relaxdtmf 
	**/
	public Boolean getRelaxdtmf();
	
	/**
	*setrelaxdtmf 
	* If you are having trouble with DTMF detection, you can relax the DTMF detection parameters. Relaxing them may make the DTMF detector more likely to have "talkoff" where DTMF is detected when it shouldn't be. Default:no.    relaxdtmf=yes
	* @behavior.fieldname relaxdtmf 
	*/
	public void setRelaxdtmf(Boolean arelaxdtmf);


	/**
	* getechocancel 
	* Disable or enable echo cancellation (default is 'yes'). It is recommended that you do not turn this off. You may specify echocancel as 'yes' (128 taps), 'no' (0 taps, disabled), or a preset number of taps which are one of 16, 32, 64, 128, or 256. Each tap is one sample from the data stream, so on a T1 this will be 1/8000 of a second. Accordingly the number of taps equate to a 2ms, 4ms, 8ms, 16ms or 32ms tail length. Beware that if you set echocancel to a different value, Asterisk will fall back to the default of 128 taps without warning.    echocancel=no
	* @behavior.fieldname echocancel 
	**/
	public Boolean getEchocancel();
	
	/**
	*setechocancel 
	* Disable or enable echo cancellation (default is 'yes'). It is recommended that you do not turn this off. You may specify echocancel as 'yes' (128 taps), 'no' (0 taps, disabled), or a preset number of taps which are one of 16, 32, 64, 128, or 256. Each tap is one sample from the data stream, so on a T1 this will be 1/8000 of a second. Accordingly the number of taps equate to a 2ms, 4ms, 8ms, 16ms or 32ms tail length. Beware that if you set echocancel to a different value, Asterisk will fall back to the default of 128 taps without warning.    echocancel=no
	* @behavior.fieldname echocancel 
	*/
	public void setEchocancel(Boolean aechocancel);


	/**
	* getechocancelwhenbridged 
	* Enables or disables echo cancellation during a bridged TDM call. In principle, TDM bridged calls should not require echo cancellation, but often times audio performance is improved with this option enabled. Default:no.    echocancelwhenbridged=yes
	* @behavior.fieldname echocancelwhenbridged 
	**/
	public Boolean getEchocancelwhenbridged();
	
	/**
	*setechocancelwhenbridged 
	* Enables or disables echo cancellation during a bridged TDM call. In principle, TDM bridged calls should not require echo cancellation, but often times audio performance is improved with this option enabled. Default:no.    echocancelwhenbridged=yes
	* @behavior.fieldname echocancelwhenbridged 
	*/
	public void setEchocancelwhenbridged(Boolean aechocancelwhenbridged);


	/**
	* getechotraining 
	* In some cases, the echo canceller doesn't train quickly enough and there is echo at the beginning of the call which then quickly fades out. Enabling echo training will cause Asterisk to briefly mute the channel, send an impulse, and use the impulse response to pre-train the echo canceller so it can start out with a much closer idea of the actual echo. However, the characteristics of some trunks may change as the endpoints become connected and, if there is a considerable delay between the circuit being 'up' and the endpoints being finalised, the training impulse may measure the characteristics of the open trunk rather than the completed circuit. Accordingly you may either specify a value between 10ms and 4000ms to delay before starting the impulse response process or 'yes', which equates to 400ms. Default:undefined.    echotraining=no
	* @behavior.fieldname echotraining 
	**/
	public Boolean getEchotraining();
	
	/**
	*setechotraining 
	* In some cases, the echo canceller doesn't train quickly enough and there is echo at the beginning of the call which then quickly fades out. Enabling echo training will cause Asterisk to briefly mute the channel, send an impulse, and use the impulse response to pre-train the echo canceller so it can start out with a much closer idea of the actual echo. However, the characteristics of some trunks may change as the endpoints become connected and, if there is a considerable delay between the circuit being 'up' and the endpoints being finalised, the training impulse may measure the characteristics of the open trunk rather than the completed circuit. Accordingly you may either specify a value between 10ms and 4000ms to delay before starting the impulse response process or 'yes', which equates to 400ms. Default:undefined.    echotraining=no
	* @behavior.fieldname echotraining 
	*/
	public void setEchotraining(Boolean aechotraining);


	/**
	* getrxgain 
	* Adjusts receive gain. This can be used to raise or lower the incoming volume to compensate for hardware differences. You specify gain as a decimal number from -100 to 100 representing 100% to 100% of capacity. Default value 0.0    rxgain=4.2
	* @behavior.fieldname rxgain 
	**/
	public Float getRxgain();
	
	/**
	*setrxgain 
	* Adjusts receive gain. This can be used to raise or lower the incoming volume to compensate for hardware differences. You specify gain as a decimal number from -100 to 100 representing 100% to 100% of capacity. Default value 0.0    rxgain=4.2
	* @behavior.fieldname rxgain 
	*/
	public void setRxgain(Float arxgain);


	/**
	* gettxgain 
	* Adjusts transmit gain. This can be used to raise or lower the outgoing volume to compensate for hardware differences. Takes the same type of argument as rxgain. Default:0.0    txgain=-15.9
	* @behavior.fieldname txgain 
	**/
	public Float getTxgain();
	
	/**
	*settxgain 
	* Adjusts transmit gain. This can be used to raise or lower the outgoing volume to compensate for hardware differences. Takes the same type of argument as rxgain. Default:0.0    txgain=-15.9
	* @behavior.fieldname txgain 
	*/
	public void setTxgain(Float atxgain);


}