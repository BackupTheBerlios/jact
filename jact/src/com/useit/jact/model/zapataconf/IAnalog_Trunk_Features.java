

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAnalog_Trunk_Features<br>
 * analog features
 * </p>
 * Created : Fri May 26 14:30:39 CEST 2006
 * 
 * @behavior.elementname Analog_Trunk_Features
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAnalog_Trunk_Features.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IAnalog_Trunk_Features {
public static final String MODELNAME = "Analog_Trunk_Features";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_USEDISTINCTIVERINGDETECTION="usedistinctiveringdetection" ;
// 	public static final String VALUEID_DRING1="dring1" ;
// 	public static final String VALUEID_DRING2="dring2" ;
// 	public static final String VALUEID_DRING3="dring3" ;
// 	public static final String VALUEID_DRING1CONTEXT="dring1context" ;
// 	public static final String VALUEID_DRING2CONTEXT="dring2context" ;
// 	public static final String VALUEID_DRING3CONTEXT="dring3context" ;
// 	public static final String VALUEID_BUSYDETECT="busydetect" ;
// 	public static final String VALUEID_BUSYCOUNT="busycount" ;
// 	public static final String VALUEID_CALLPROGRESS="callprogress" ;
// 	public static final String VALUEID_PULSE="pulse" ;
	
	//---------  getter und setter

	/**
	* getusedistinctiveringdetection 
	* Whether or not to attempt to recognize distinctive ring styles on incoming calls. This does not require audio analyisis because rings are simple transitions of the analog line. It's merely a matter of matching the transition pattern. Default no.    usedistinctiveringdetection=yes
	* @behavior.fieldname usedistinctiveringdetection 
	**/
	public Boolean getUsedistinctiveringdetection();
	
	/**
	*setusedistinctiveringdetection 
	* Whether or not to attempt to recognize distinctive ring styles on incoming calls. This does not require audio analyisis because rings are simple transitions of the analog line. It's merely a matter of matching the transition pattern. Default no.    usedistinctiveringdetection=yes
	* @behavior.fieldname usedistinctiveringdetection 
	*/
	public void setUsedistinctiveringdetection(Boolean ausedistinctiveringdetection);


	/**
	* getdring1 
	* If you set usedistinctiveringdetection=yes, then you may define up to three different distinctive ring styles for Asterisk to attempt to recognize. Each style is defined as a comma separated list of up to three integers. Nobody has yet documented what these numbers mean, so you're on your own when it comes to trying to figure out what numbers to use for the distinctive ring syles used by your phone company in your country. But the tip is to use the Asterisk console in verbose mode, and apparently it reports numbers describing the ring patterns it sees. These patterns may be a starting point:
	* @behavior.fieldname dring1 
	**/
	public String getDring1();
	
	/**
	*setdring1 
	* If you set usedistinctiveringdetection=yes, then you may define up to three different distinctive ring styles for Asterisk to attempt to recognize. Each style is defined as a comma separated list of up to three integers. Nobody has yet documented what these numbers mean, so you're on your own when it comes to trying to figure out what numbers to use for the distinctive ring syles used by your phone company in your country. But the tip is to use the Asterisk console in verbose mode, and apparently it reports numbers describing the ring patterns it sees. These patterns may be a starting point:
	* @behavior.fieldname dring1 
	*/
	public void setDring1(String adring1);


	/**
	* getdring2 
	* see 1
	* @behavior.fieldname dring2 
	**/
	public String getDring2();
	
	/**
	*setdring2 
	* see 1
	* @behavior.fieldname dring2 
	*/
	public void setDring2(String adring2);


	/**
	* getdring3 
	* see 2
	* @behavior.fieldname dring3 
	**/
	public String getDring3();
	
	/**
	*setdring3 
	* see 2
	* @behavior.fieldname dring3 
	*/
	public void setDring3(String adring3);


	/**
	* getdring1context 
	* Along with setting up to three distinctive ring patterns with dring1, dring2 and dring3, you also set corresponding contexts for incoming calls matching those distinctive ring patterns to jump into. If an incoming call does not match any of the distinctive ring patterns defined, then of course it will enter Asterisk with the default context defined for this channel.
	* @behavior.fieldname dring1context 
	**/
	public String getDring1context();
	
	/**
	*setdring1context 
	* Along with setting up to three distinctive ring patterns with dring1, dring2 and dring3, you also set corresponding contexts for incoming calls matching those distinctive ring patterns to jump into. If an incoming call does not match any of the distinctive ring patterns defined, then of course it will enter Asterisk with the default context defined for this channel.
	* @behavior.fieldname dring1context 
	*/
	public void setDring1context(String adring1context);


	/**
	* getdring2context 
	* see 1
	* @behavior.fieldname dring2context 
	**/
	public String getDring2context();
	
	/**
	*setdring2context 
	* see 1
	* @behavior.fieldname dring2context 
	*/
	public void setDring2context(String adring2context);


	/**
	* getdring3context 
	* see 1 too
	* @behavior.fieldname dring3context 
	**/
	public String getDring3context();
	
	/**
	*setdring3context 
	* see 1 too
	* @behavior.fieldname dring3context 
	*/
	public void setDring3context(String adring3context);


	/**
	* getbusydetect 
	* If enabled, Asterisk will analyze the audio coming in on the line during a call or a dial attempt to attempt to recognize busy signals. This is useful on analog trunk interfaces both to detect a busy signal when dialing out, and for detecting when the person has hung up. See also Disconnect Supervision. Be sure that you don't use this on digital interfaces like QuadBri cards and so on. Otherwise you will run in "broken calls" problems. default=no    busydetect=yes
	* @behavior.fieldname busydetect 
	**/
	public Boolean getBusydetect();
	
	/**
	*setbusydetect 
	* If enabled, Asterisk will analyze the audio coming in on the line during a call or a dial attempt to attempt to recognize busy signals. This is useful on analog trunk interfaces both to detect a busy signal when dialing out, and for detecting when the person has hung up. See also Disconnect Supervision. Be sure that you don't use this on digital interfaces like QuadBri cards and so on. Otherwise you will run in "broken calls" problems. default=no    busydetect=yes
	* @behavior.fieldname busydetect 
	*/
	public void setBusydetect(Boolean abusydetect);


	/**
	* getbusycount 
	* This option requires busydetect=yes. You can specify how many busy tones to wait before hanging up. The default is 3, but better results can be achieved if set to 6 or even 8. The higher the number, the more time is needed to detect a disconnected channel, but the lower the probability mistaking some other sound as being a busy tone.   busycount=5
	* @behavior.fieldname busycount 
	**/
	public Integer getBusycount();
	
	/**
	*setbusycount 
	* This option requires busydetect=yes. You can specify how many busy tones to wait before hanging up. The default is 3, but better results can be achieved if set to 6 or even 8. The higher the number, the more time is needed to detect a disconnected channel, but the lower the probability mistaking some other sound as being a busy tone.   busycount=5
	* @behavior.fieldname busycount 
	*/
	public void setBusycount(Integer abusycount);


	/**
	* getcallprogress 
	* Asterisk can attempt to monitor the state of the call to listen for a ringing tone, busy tone, congestion tone, and sounds indicating that the line has been answered. It appears that this feature is independent of the busydetect feature; it seems that both can run in parallel, and both will independently attempt to recognize a busy tone. The callprogress feature is highly experimental and can easily detect false answers, so don't count on it being very accurate. Also, it is currently configured only for standard U.S. phone tones. Default no.   callprogress = yes
	* @behavior.fieldname callprogress 
	**/
	public Boolean getCallprogress();
	
	/**
	*setcallprogress 
	* Asterisk can attempt to monitor the state of the call to listen for a ringing tone, busy tone, congestion tone, and sounds indicating that the line has been answered. It appears that this feature is independent of the busydetect feature; it seems that both can run in parallel, and both will independently attempt to recognize a busy tone. The callprogress feature is highly experimental and can easily detect false answers, so don't count on it being very accurate. Also, it is currently configured only for standard U.S. phone tones. Default no.   callprogress = yes
	* @behavior.fieldname callprogress 
	*/
	public void setCallprogress(Boolean acallprogress);


	/**
	* getpulse 
	* The standard installation of Asterisk does not permit you to specify that a Zaptel device use pulse dialing, even though the Zaptel driver supports pulse dialing. But you can apply a patch file to enable you to specify pulse dialing with the pulse keyword. See Pulse Dialing on Zap Channels for the patch.    pulse=yes
	* @behavior.fieldname pulse 
	**/
	public Boolean getPulse();
	
	/**
	*setpulse 
	* The standard installation of Asterisk does not permit you to specify that a Zaptel device use pulse dialing, even though the Zaptel driver supports pulse dialing. But you can apply a patch file to enable you to specify pulse dialing with the pulse keyword. See Pulse Dialing on Zap Channels for the patch.    pulse=yes
	* @behavior.fieldname pulse 
	*/
	public void setPulse(Boolean apulse);


}