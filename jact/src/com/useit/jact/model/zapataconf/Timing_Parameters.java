package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Timing_Parameters<br>
 * These keywords are used only with (non-PRI) T1 lines. All values are in milliseconds. These do not need to be set in most configurations, as the defaults work with most hardware. It has been noted that the common Adtran Atlas uses long winks of about 300 milliseconds, and channels from them should be configured accordingly.
 * </p>
 * Created : Fri May 26 14:32:06 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Timing_Parameters.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Timing_Parameters extends AbstractSimpleDataClass implements ITiming_Parameters{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Timing_Parameters
	**/
	public Timing_Parameters(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Timing_Parameters
	**/
	public Timing_Parameters( Integer aprewink, Integer apreflash, Integer awink, Integer arxwink, Integer arxflash, Integer aflash, Integer astart, Integer adebounce){
		super();
	
		this.prewink = aprewink;	
		this.preflash = apreflash;	
		this.wink = awink;	
		this.rxwink = arxwink;	
		this.rxflash = arxflash;	
		this.flash = aflash;	
		this.start = astart;	
		this.debounce = adebounce;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Timing_Parameters object){
		this.prewink = object.prewink;	
		this.preflash = object.preflash;	
		this.wink = object.wink;	
		this.rxwink = object.rxwink;	
		this.rxflash = object.rxflash;	
		this.flash = object.flash;	
		this.start = object.start;	
		this.debounce = object.debounce;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Sets the pre-wink timing. **/
	protected Integer prewink;
	public static final String VALUEID_PREWINK="prewink" ;

    /**  Sets the pre-flash timing. **/
	protected Integer preflash;
	public static final String VALUEID_PREFLASH="preflash" ;

    /**  Sets the wink timing. **/
	protected Integer wink;
	public static final String VALUEID_WINK="wink" ;

    /**  Sets the receive wink timing. **/
	protected Integer rxwink;
	public static final String VALUEID_RXWINK="rxwink" ;

    /**  Sets the receive flash timing. **/
	protected Integer rxflash;
	public static final String VALUEID_RXFLASH="rxflash" ;

    /**  Sets the flash timing. **/
	protected Integer flash;
	public static final String VALUEID_FLASH="flash" ;

    /**  Sets the start timing. **/
	protected Integer start;
	public static final String VALUEID_START="start" ;

    /**  Sets the debounce timing. "The debounce settings in the Asterisk configuration affects how Asterisk handles hookswitch transitions on its FXO/FXS interfaces." **/
	protected Integer debounce;
	public static final String VALUEID_DEBOUNCE="debounce" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_PREWINK.equals(valueid)){
			return true;
		}
		if(VALUEID_PREFLASH.equals(valueid)){
			return true;
		}
		if(VALUEID_WINK.equals(valueid)){
			return true;
		}
		if(VALUEID_RXWINK.equals(valueid)){
			return true;
		}
		if(VALUEID_RXFLASH.equals(valueid)){
			return true;
		}
		if(VALUEID_FLASH.equals(valueid)){
			return true;
		}
		if(VALUEID_START.equals(valueid)){
			return true;
		}
		if(VALUEID_DEBOUNCE.equals(valueid)){
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
		if(VALUEID_PREWINK.equals(valueid)){
			if(data instanceof String){
		        setPrewink(new Integer((String)data));
		        return;
		    }
			setPrewink((Integer)data);
			return;
		}
		if(VALUEID_PREFLASH.equals(valueid)){
			if(data instanceof String){
		        setPreflash(new Integer((String)data));
		        return;
		    }
			setPreflash((Integer)data);
			return;
		}
		if(VALUEID_WINK.equals(valueid)){
			if(data instanceof String){
		        setWink(new Integer((String)data));
		        return;
		    }
			setWink((Integer)data);
			return;
		}
		if(VALUEID_RXWINK.equals(valueid)){
			if(data instanceof String){
		        setRxwink(new Integer((String)data));
		        return;
		    }
			setRxwink((Integer)data);
			return;
		}
		if(VALUEID_RXFLASH.equals(valueid)){
			if(data instanceof String){
		        setRxflash(new Integer((String)data));
		        return;
		    }
			setRxflash((Integer)data);
			return;
		}
		if(VALUEID_FLASH.equals(valueid)){
			if(data instanceof String){
		        setFlash(new Integer((String)data));
		        return;
		    }
			setFlash((Integer)data);
			return;
		}
		if(VALUEID_START.equals(valueid)){
			if(data instanceof String){
		        setStart(new Integer((String)data));
		        return;
		    }
			setStart((Integer)data);
			return;
		}
		if(VALUEID_DEBOUNCE.equals(valueid)){
			if(data instanceof String){
		        setDebounce(new Integer((String)data));
		        return;
		    }
			setDebounce((Integer)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_PREWINK.equals(valueid)){
			return getPrewink();
			
		}
		if(VALUEID_PREFLASH.equals(valueid)){
			return getPreflash();
			
		}
		if(VALUEID_WINK.equals(valueid)){
			return getWink();
			
		}
		if(VALUEID_RXWINK.equals(valueid)){
			return getRxwink();
			
		}
		if(VALUEID_RXFLASH.equals(valueid)){
			return getRxflash();
			
		}
		if(VALUEID_FLASH.equals(valueid)){
			return getFlash();
			
		}
		if(VALUEID_START.equals(valueid)){
			return getStart();
			
		}
		if(VALUEID_DEBOUNCE.equals(valueid)){
			return getDebounce();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getprewink 
	* Sets the pre-wink timing.
	**/
	public Integer getPrewink(){		return  prewink;
	}
	/**
	*setprewink 
	*/
	public void setPrewink(Integer aprewink){
		if(aprewink==null){
		    changed = (this.prewink!=null);
		    this.prewink = null;	    
		}else{
			changed = aprewink.equals(this.prewink);
			this.prewink=aprewink;
		}
	}


	/**
	* getpreflash 
	* Sets the pre-flash timing.
	**/
	public Integer getPreflash(){		return  preflash;
	}
	/**
	*setpreflash 
	*/
	public void setPreflash(Integer apreflash){
		if(apreflash==null){
		    changed = (this.preflash!=null);
		    this.preflash = null;	    
		}else{
			changed = apreflash.equals(this.preflash);
			this.preflash=apreflash;
		}
	}


	/**
	* getwink 
	* Sets the wink timing.
	**/
	public Integer getWink(){		return  wink;
	}
	/**
	*setwink 
	*/
	public void setWink(Integer awink){
		if(awink==null){
		    changed = (this.wink!=null);
		    this.wink = null;	    
		}else{
			changed = awink.equals(this.wink);
			this.wink=awink;
		}
	}


	/**
	* getrxwink 
	* Sets the receive wink timing.
	**/
	public Integer getRxwink(){		return  rxwink;
	}
	/**
	*setrxwink 
	*/
	public void setRxwink(Integer arxwink){
		if(arxwink==null){
		    changed = (this.rxwink!=null);
		    this.rxwink = null;	    
		}else{
			changed = arxwink.equals(this.rxwink);
			this.rxwink=arxwink;
		}
	}


	/**
	* getrxflash 
	* Sets the receive flash timing.
	**/
	public Integer getRxflash(){		return  rxflash;
	}
	/**
	*setrxflash 
	*/
	public void setRxflash(Integer arxflash){
		if(arxflash==null){
		    changed = (this.rxflash!=null);
		    this.rxflash = null;	    
		}else{
			changed = arxflash.equals(this.rxflash);
			this.rxflash=arxflash;
		}
	}


	/**
	* getflash 
	* Sets the flash timing.
	**/
	public Integer getFlash(){		return  flash;
	}
	/**
	*setflash 
	*/
	public void setFlash(Integer aflash){
		if(aflash==null){
		    changed = (this.flash!=null);
		    this.flash = null;	    
		}else{
			changed = aflash.equals(this.flash);
			this.flash=aflash;
		}
	}


	/**
	* getstart 
	* Sets the start timing.
	**/
	public Integer getStart(){		return  start;
	}
	/**
	*setstart 
	*/
	public void setStart(Integer astart){
		if(astart==null){
		    changed = (this.start!=null);
		    this.start = null;	    
		}else{
			changed = astart.equals(this.start);
			this.start=astart;
		}
	}


	/**
	* getdebounce 
	* Sets the debounce timing. "The debounce settings in the Asterisk configuration affects how Asterisk handles hookswitch transitions on its FXO/FXS interfaces."
	**/
	public Integer getDebounce(){		return  debounce;
	}
	/**
	*setdebounce 
	*/
	public void setDebounce(Integer adebounce){
		if(adebounce==null){
		    changed = (this.debounce!=null);
		    this.debounce = null;	    
		}else{
			changed = adebounce.equals(this.debounce);
			this.debounce=adebounce;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("prewink=")
		.append(prewink)
		.append(",")
		.append("preflash=")
		.append(preflash)
		.append(",")
		.append("wink=")
		.append(wink)
		.append(",")
		.append("rxwink=")
		.append(rxwink)
		.append(",")
		.append("rxflash=")
		.append(rxflash)
		.append(",")
		.append("flash=")
		.append(flash)
		.append(",")
		.append("start=")
		.append(start)
		.append(",")
		.append("debounce=")
		.append(debounce)
    			.append("]");

		return sb.toString();		
	}}