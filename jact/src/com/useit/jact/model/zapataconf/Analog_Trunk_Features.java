package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Analog_Trunk_Features<br>
 * analog features
 * </p>
 * Created : Fri May 26 14:32:07 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Analog_Trunk_Features.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Analog_Trunk_Features extends AbstractSimpleDataClass implements IAnalog_Trunk_Features{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Analog_Trunk_Features
	**/
	public Analog_Trunk_Features(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Analog_Trunk_Features
	**/
	public Analog_Trunk_Features( Boolean ausedistinctiveringdetection, String adring1, String adring2, String adring3, String adring1context, String adring2context, String adring3context, Boolean abusydetect, Integer abusycount, Boolean acallprogress, Boolean apulse){
		super();
	
		this.usedistinctiveringdetection = ausedistinctiveringdetection;	
		this.dring1 = adring1;	
		this.dring2 = adring2;	
		this.dring3 = adring3;	
		this.dring1context = adring1context;	
		this.dring2context = adring2context;	
		this.dring3context = adring3context;	
		this.busydetect = abusydetect;	
		this.busycount = abusycount;	
		this.callprogress = acallprogress;	
		this.pulse = apulse;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Analog_Trunk_Features object){
		this.usedistinctiveringdetection = object.usedistinctiveringdetection;	
		this.dring1 = object.dring1;	
		this.dring2 = object.dring2;	
		this.dring3 = object.dring3;	
		this.dring1context = object.dring1context;	
		this.dring2context = object.dring2context;	
		this.dring3context = object.dring3context;	
		this.busydetect = object.busydetect;	
		this.busycount = object.busycount;	
		this.callprogress = object.callprogress;	
		this.pulse = object.pulse;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Whether or not to attempt to recognize distinctive ring styles on incoming calls. This does not require audio analyisis because rings are simple transitions of the analog line. It's merely a matter of matching the transition pattern. Default no.    usedistinctiveringdetection=yes **/
	protected Boolean usedistinctiveringdetection;
	public static final String VALUEID_USEDISTINCTIVERINGDETECTION="usedistinctiveringdetection" ;

    /**  If you set usedistinctiveringdetection=yes, then you may define up to three different distinctive ring styles for Asterisk to attempt to recognize. Each style is defined as a comma separated list of up to three integers. Nobody has yet documented what these numbers mean, so you're on your own when it comes to trying to figure out what numbers to use for the distinctive ring syles used by your phone company in your country. But the tip is to use the Asterisk console in verbose mode, and apparently it reports numbers describing the ring patterns it sees. These patterns may be a starting point: **/
	protected String dring1;
	public static final String VALUEID_DRING1="dring1" ;

    /**  see 1 **/
	protected String dring2;
	public static final String VALUEID_DRING2="dring2" ;

    /**  see 2 **/
	protected String dring3;
	public static final String VALUEID_DRING3="dring3" ;

    /**  Along with setting up to three distinctive ring patterns with dring1, dring2 and dring3, you also set corresponding contexts for incoming calls matching those distinctive ring patterns to jump into. If an incoming call does not match any of the distinctive ring patterns defined, then of course it will enter Asterisk with the default context defined for this channel. **/
	protected String dring1context;
	public static final String VALUEID_DRING1CONTEXT="dring1context" ;

    /**  see 1 **/
	protected String dring2context;
	public static final String VALUEID_DRING2CONTEXT="dring2context" ;

    /**  see 1 too **/
	protected String dring3context;
	public static final String VALUEID_DRING3CONTEXT="dring3context" ;

    /**  If enabled, Asterisk will analyze the audio coming in on the line during a call or a dial attempt to attempt to recognize busy signals. This is useful on analog trunk interfaces both to detect a busy signal when dialing out, and for detecting when the person has hung up. See also Disconnect Supervision. Be sure that you don't use this on digital interfaces like QuadBri cards and so on. Otherwise you will run in "broken calls" problems. default=no    busydetect=yes **/
	protected Boolean busydetect;
	public static final String VALUEID_BUSYDETECT="busydetect" ;

    /**  This option requires busydetect=yes. You can specify how many busy tones to wait before hanging up. The default is 3, but better results can be achieved if set to 6 or even 8. The higher the number, the more time is needed to detect a disconnected channel, but the lower the probability mistaking some other sound as being a busy tone.   busycount=5 **/
	protected Integer busycount;
	public static final String VALUEID_BUSYCOUNT="busycount" ;

    /**  Asterisk can attempt to monitor the state of the call to listen for a ringing tone, busy tone, congestion tone, and sounds indicating that the line has been answered. It appears that this feature is independent of the busydetect feature; it seems that both can run in parallel, and both will independently attempt to recognize a busy tone. The callprogress feature is highly experimental and can easily detect false answers, so don't count on it being very accurate. Also, it is currently configured only for standard U.S. phone tones. Default no.   callprogress = yes **/
	protected Boolean callprogress;
	public static final String VALUEID_CALLPROGRESS="callprogress" ;

    /**  The standard installation of Asterisk does not permit you to specify that a Zaptel device use pulse dialing, even though the Zaptel driver supports pulse dialing. But you can apply a patch file to enable you to specify pulse dialing with the pulse keyword. See Pulse Dialing on Zap Channels for the patch.    pulse=yes **/
	protected Boolean pulse;
	public static final String VALUEID_PULSE="pulse" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_USEDISTINCTIVERINGDETECTION.equals(valueid)){
			return true;
		}
		if(VALUEID_DRING1.equals(valueid)){
			return true;
		}
		if(VALUEID_DRING2.equals(valueid)){
			return true;
		}
		if(VALUEID_DRING3.equals(valueid)){
			return true;
		}
		if(VALUEID_DRING1CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_DRING2CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_DRING3CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_BUSYDETECT.equals(valueid)){
			return true;
		}
		if(VALUEID_BUSYCOUNT.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLPROGRESS.equals(valueid)){
			return true;
		}
		if(VALUEID_PULSE.equals(valueid)){
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
		if(VALUEID_USEDISTINCTIVERINGDETECTION.equals(valueid)){
			if(data instanceof String){
		        setUsedistinctiveringdetection(new Boolean((String)data));
		        return;
		    }
			setUsedistinctiveringdetection((Boolean)data);
			return;
		}
		if(VALUEID_DRING1.equals(valueid)){
			setDring1((String)data);
			return;
		}
		if(VALUEID_DRING2.equals(valueid)){
			setDring2((String)data);
			return;
		}
		if(VALUEID_DRING3.equals(valueid)){
			setDring3((String)data);
			return;
		}
		if(VALUEID_DRING1CONTEXT.equals(valueid)){
			setDring1context((String)data);
			return;
		}
		if(VALUEID_DRING2CONTEXT.equals(valueid)){
			setDring2context((String)data);
			return;
		}
		if(VALUEID_DRING3CONTEXT.equals(valueid)){
			setDring3context((String)data);
			return;
		}
		if(VALUEID_BUSYDETECT.equals(valueid)){
			if(data instanceof String){
		        setBusydetect(new Boolean((String)data));
		        return;
		    }
			setBusydetect((Boolean)data);
			return;
		}
		if(VALUEID_BUSYCOUNT.equals(valueid)){
			if(data instanceof String){
		        setBusycount(new Integer((String)data));
		        return;
		    }
			setBusycount((Integer)data);
			return;
		}
		if(VALUEID_CALLPROGRESS.equals(valueid)){
			if(data instanceof String){
		        setCallprogress(new Boolean((String)data));
		        return;
		    }
			setCallprogress((Boolean)data);
			return;
		}
		if(VALUEID_PULSE.equals(valueid)){
			if(data instanceof String){
		        setPulse(new Boolean((String)data));
		        return;
		    }
			setPulse((Boolean)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_USEDISTINCTIVERINGDETECTION.equals(valueid)){
			return getUsedistinctiveringdetection();
			
		}
		if(VALUEID_DRING1.equals(valueid)){
			return getDring1();
			
		}
		if(VALUEID_DRING2.equals(valueid)){
			return getDring2();
			
		}
		if(VALUEID_DRING3.equals(valueid)){
			return getDring3();
			
		}
		if(VALUEID_DRING1CONTEXT.equals(valueid)){
			return getDring1context();
			
		}
		if(VALUEID_DRING2CONTEXT.equals(valueid)){
			return getDring2context();
			
		}
		if(VALUEID_DRING3CONTEXT.equals(valueid)){
			return getDring3context();
			
		}
		if(VALUEID_BUSYDETECT.equals(valueid)){
			return getBusydetect();
			
		}
		if(VALUEID_BUSYCOUNT.equals(valueid)){
			return getBusycount();
			
		}
		if(VALUEID_CALLPROGRESS.equals(valueid)){
			return getCallprogress();
			
		}
		if(VALUEID_PULSE.equals(valueid)){
			return getPulse();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getusedistinctiveringdetection 
	* Whether or not to attempt to recognize distinctive ring styles on incoming calls. This does not require audio analyisis because rings are simple transitions of the analog line. It's merely a matter of matching the transition pattern. Default no.    usedistinctiveringdetection=yes
	**/
	public Boolean getUsedistinctiveringdetection(){		return  usedistinctiveringdetection;
	}
	/**
	*setusedistinctiveringdetection 
	*/
	public void setUsedistinctiveringdetection(Boolean ausedistinctiveringdetection){
		if(ausedistinctiveringdetection==null){
		    changed = (this.usedistinctiveringdetection!=null);
		    this.usedistinctiveringdetection = null;	    
		}else{
			changed = ausedistinctiveringdetection.equals(this.usedistinctiveringdetection);
			this.usedistinctiveringdetection=ausedistinctiveringdetection;
		}
	}


	/**
	* getdring1 
	* If you set usedistinctiveringdetection=yes, then you may define up to three different distinctive ring styles for Asterisk to attempt to recognize. Each style is defined as a comma separated list of up to three integers. Nobody has yet documented what these numbers mean, so you're on your own when it comes to trying to figure out what numbers to use for the distinctive ring syles used by your phone company in your country. But the tip is to use the Asterisk console in verbose mode, and apparently it reports numbers describing the ring patterns it sees. These patterns may be a starting point:
	**/
	public String getDring1(){		return  dring1;
	}
	/**
	*setdring1 
	*/
	public void setDring1(String adring1){
		if(adring1==null){
		    changed = (this.dring1!=null);
		    this.dring1 = null;	    
		}else{
			changed = adring1.equals(this.dring1);
			this.dring1=adring1;
		}
	}


	/**
	* getdring2 
	* see 1
	**/
	public String getDring2(){		return  dring2;
	}
	/**
	*setdring2 
	*/
	public void setDring2(String adring2){
		if(adring2==null){
		    changed = (this.dring2!=null);
		    this.dring2 = null;	    
		}else{
			changed = adring2.equals(this.dring2);
			this.dring2=adring2;
		}
	}


	/**
	* getdring3 
	* see 2
	**/
	public String getDring3(){		return  dring3;
	}
	/**
	*setdring3 
	*/
	public void setDring3(String adring3){
		if(adring3==null){
		    changed = (this.dring3!=null);
		    this.dring3 = null;	    
		}else{
			changed = adring3.equals(this.dring3);
			this.dring3=adring3;
		}
	}


	/**
	* getdring1context 
	* Along with setting up to three distinctive ring patterns with dring1, dring2 and dring3, you also set corresponding contexts for incoming calls matching those distinctive ring patterns to jump into. If an incoming call does not match any of the distinctive ring patterns defined, then of course it will enter Asterisk with the default context defined for this channel.
	**/
	public String getDring1context(){		return  dring1context;
	}
	/**
	*setdring1context 
	*/
	public void setDring1context(String adring1context){
		if(adring1context==null){
		    changed = (this.dring1context!=null);
		    this.dring1context = null;	    
		}else{
			changed = adring1context.equals(this.dring1context);
			this.dring1context=adring1context;
		}
	}


	/**
	* getdring2context 
	* see 1
	**/
	public String getDring2context(){		return  dring2context;
	}
	/**
	*setdring2context 
	*/
	public void setDring2context(String adring2context){
		if(adring2context==null){
		    changed = (this.dring2context!=null);
		    this.dring2context = null;	    
		}else{
			changed = adring2context.equals(this.dring2context);
			this.dring2context=adring2context;
		}
	}


	/**
	* getdring3context 
	* see 1 too
	**/
	public String getDring3context(){		return  dring3context;
	}
	/**
	*setdring3context 
	*/
	public void setDring3context(String adring3context){
		if(adring3context==null){
		    changed = (this.dring3context!=null);
		    this.dring3context = null;	    
		}else{
			changed = adring3context.equals(this.dring3context);
			this.dring3context=adring3context;
		}
	}


	/**
	* getbusydetect 
	* If enabled, Asterisk will analyze the audio coming in on the line during a call or a dial attempt to attempt to recognize busy signals. This is useful on analog trunk interfaces both to detect a busy signal when dialing out, and for detecting when the person has hung up. See also Disconnect Supervision. Be sure that you don't use this on digital interfaces like QuadBri cards and so on. Otherwise you will run in "broken calls" problems. default=no    busydetect=yes
	**/
	public Boolean getBusydetect(){		return  busydetect;
	}
	/**
	*setbusydetect 
	*/
	public void setBusydetect(Boolean abusydetect){
		if(abusydetect==null){
		    changed = (this.busydetect!=null);
		    this.busydetect = null;	    
		}else{
			changed = abusydetect.equals(this.busydetect);
			this.busydetect=abusydetect;
		}
	}


	/**
	* getbusycount 
	* This option requires busydetect=yes. You can specify how many busy tones to wait before hanging up. The default is 3, but better results can be achieved if set to 6 or even 8. The higher the number, the more time is needed to detect a disconnected channel, but the lower the probability mistaking some other sound as being a busy tone.   busycount=5
	**/
	public Integer getBusycount(){		return  busycount;
	}
	/**
	*setbusycount 
	*/
	public void setBusycount(Integer abusycount){
		if(abusycount==null){
		    changed = (this.busycount!=null);
		    this.busycount = null;	    
		}else{
			changed = abusycount.equals(this.busycount);
			this.busycount=abusycount;
		}
	}


	/**
	* getcallprogress 
	* Asterisk can attempt to monitor the state of the call to listen for a ringing tone, busy tone, congestion tone, and sounds indicating that the line has been answered. It appears that this feature is independent of the busydetect feature; it seems that both can run in parallel, and both will independently attempt to recognize a busy tone. The callprogress feature is highly experimental and can easily detect false answers, so don't count on it being very accurate. Also, it is currently configured only for standard U.S. phone tones. Default no.   callprogress = yes
	**/
	public Boolean getCallprogress(){		return  callprogress;
	}
	/**
	*setcallprogress 
	*/
	public void setCallprogress(Boolean acallprogress){
		if(acallprogress==null){
		    changed = (this.callprogress!=null);
		    this.callprogress = null;	    
		}else{
			changed = acallprogress.equals(this.callprogress);
			this.callprogress=acallprogress;
		}
	}


	/**
	* getpulse 
	* The standard installation of Asterisk does not permit you to specify that a Zaptel device use pulse dialing, even though the Zaptel driver supports pulse dialing. But you can apply a patch file to enable you to specify pulse dialing with the pulse keyword. See Pulse Dialing on Zap Channels for the patch.    pulse=yes
	**/
	public Boolean getPulse(){		return  pulse;
	}
	/**
	*setpulse 
	*/
	public void setPulse(Boolean apulse){
		if(apulse==null){
		    changed = (this.pulse!=null);
		    this.pulse = null;	    
		}else{
			changed = apulse.equals(this.pulse);
			this.pulse=apulse;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("usedistinctiveringdetection=")
		.append(usedistinctiveringdetection)
		.append(",")
		.append("dring1=")
		.append(dring1)
		.append(",")
		.append("dring2=")
		.append(dring2)
		.append(",")
		.append("dring3=")
		.append(dring3)
		.append(",")
		.append("dring1context=")
		.append(dring1context)
		.append(",")
		.append("dring2context=")
		.append(dring2context)
		.append(",")
		.append("dring3context=")
		.append(dring3context)
		.append(",")
		.append("busydetect=")
		.append(busydetect)
		.append(",")
		.append("busycount=")
		.append(busycount)
		.append(",")
		.append("callprogress=")
		.append(callprogress)
		.append(",")
		.append("pulse=")
		.append(pulse)
    			.append("]");

		return sb.toString();		
	}}