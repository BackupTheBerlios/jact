package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Iaxjitter<br>
 * There are presently two jitterbuffer implementations available for * and chan_iax2<para>the classic and the new, channel/application independent implementation.  These

are controlled at compile-time.  The new jitterbuffer additionally has support for PLC

which greatly improves quality as the jitterbuffer adapts size, and in compensating for lost packets. All the jitter buffer settings except dropcount are in milliseconds. The jitter buffer works for INCOMING audio - the outbound audio will  be dejittered by the jitter buffer at the other end.
 * </p>
 * Created : Fri May 26 14:31:55 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Iaxjitter.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
 public  class Iaxjitter extends AbstractSimpleDataClass implements IIaxjitter{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Iaxjitter
	**/
	public Iaxjitter(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Iaxjitter
	**/
	public Iaxjitter( Boolean ajitterbuffer, Boolean aforcejitterbuffer, Integer adropcount, Integer amaxjitterbuffer, Integer aresyncthreshold, Integer amaxjitterinterps, Integer amaxexcessbuffer, Integer aminexcessbuffer, Integer ajittershrinkrate){
		super();
	
		this.jitterbuffer = ajitterbuffer;	
		this.forcejitterbuffer = aforcejitterbuffer;	
		this.dropcount = adropcount;	
		this.maxjitterbuffer = amaxjitterbuffer;	
		this.resyncthreshold = aresyncthreshold;	
		this.maxjitterinterps = amaxjitterinterps;	
		this.maxexcessbuffer = amaxexcessbuffer;	
		this.minexcessbuffer = aminexcessbuffer;	
		this.jittershrinkrate = ajittershrinkrate;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Iaxjitter object){
		this.jitterbuffer = object.jitterbuffer;	
		this.forcejitterbuffer = object.forcejitterbuffer;	
		this.dropcount = object.dropcount;	
		this.maxjitterbuffer = object.maxjitterbuffer;	
		this.resyncthreshold = object.resyncthreshold;	
		this.maxjitterinterps = object.maxjitterinterps;	
		this.maxexcessbuffer = object.maxexcessbuffer;	
		this.minexcessbuffer = object.minexcessbuffer;	
		this.jittershrinkrate = object.jittershrinkrate;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  yes|no **/
	protected Boolean jitterbuffer;
	public static final String VALUEID_JITTERBUFFER="jitterbuffer" ;

    /**  yes|no **/
	protected Boolean forcejitterbuffer;
	public static final String VALUEID_FORCEJITTERBUFFER="forcejitterbuffer" ;

    /**  the jitter buffer is sized such that no more than "dropcount" frames would have been "too late" over the last 2 seconds. Set to a small number.  "3" represents 1.5% of frames dropped [This option is not applicable to, and ignored by the new jitterbuffer implementation] **/
	protected Integer dropcount;
	public static final String VALUEID_DROPCOUNT="dropcount" ;

    /**  a maximum size for the jitter buffer. Setting a reasonable maximum here will prevent the call delay from rising to silly values in extreme situations; you'll hear SOMETHING, even though it will be jittery. **/
	protected Integer maxjitterbuffer;
	public static final String VALUEID_MAXJITTERBUFFER="maxjitterbuffer" ;

    /**  when the jitterbuffer notices a significant change in delay that continues over a few frames, it will resync, assuming that the change in delay was caused by a timestamping mix-up. The threshold for noticing a change in delay is measured as twice the measured jitter plus this resync threshold. Resycning can be disabled by setting this parameter to -1. [This option presently applies only to the new jitterbuffer implementation] **/
	protected Integer resyncthreshold;
	public static final String VALUEID_RESYNCTHRESHOLD="resyncthreshold" ;

    /**  the maximum number of interpolation frames the jitterbuffer should return in a row. Since some clients do not send CNG/DTX frames to indicate silence, the jitterbuffer will assume silence has begun after returning this many interpolations. This prevents interpolating throughout a long silence. [This option presently applies only to the new jitterbuffer implementation] **/
	protected Integer maxjitterinterps;
	public static final String VALUEID_MAXJITTERINTERPS="maxjitterinterps" ;

    /**  If conditions improve after a period of high jitter, the jitter buffer can end up bigger than necessary.  If it ends up more than "maxexcessbuffer" bigger than needed, Asterisk will start gradually decreasing the amount of jitter buffering. [This option is not applicable to, and ignored by the new jitterbuffer implementation] **/
	protected Integer maxexcessbuffer;
	public static final String VALUEID_MAXEXCESSBUFFER="maxexcessbuffer" ;

    /**  Sets a desired mimimum amount of headroom in  the jitter buffer.  If Asterisk has less headroom than this, then it will start gradually increasing the amount of jitter buffering. [This option is not applicable to, and ignored by the new jitterbuffer implementation] **/
	protected Integer minexcessbuffer;
	public static final String VALUEID_MINEXCESSBUFFER="minexcessbuffer" ;

    /**  when the jitter buffer is being gradually shrunk  (or enlarged), how many millisecs shall we take off per 20ms frame received?  Use a small number, or you will be able to hear it changing.  An example **/
	protected Integer jittershrinkrate;
	public static final String VALUEID_JITTERSHRINKRATE="jittershrinkrate" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_JITTERBUFFER.equals(valueid)){
			return true;
		}
		if(VALUEID_FORCEJITTERBUFFER.equals(valueid)){
			return true;
		}
		if(VALUEID_DROPCOUNT.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXJITTERBUFFER.equals(valueid)){
			return true;
		}
		if(VALUEID_RESYNCTHRESHOLD.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXJITTERINTERPS.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXEXCESSBUFFER.equals(valueid)){
			return true;
		}
		if(VALUEID_MINEXCESSBUFFER.equals(valueid)){
			return true;
		}
		if(VALUEID_JITTERSHRINKRATE.equals(valueid)){
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
		if(VALUEID_JITTERBUFFER.equals(valueid)){
			if(data instanceof String){
		        setJitterbuffer(new Boolean((String)data));
		        return;
		    }
			setJitterbuffer((Boolean)data);
			return;
		}
		if(VALUEID_FORCEJITTERBUFFER.equals(valueid)){
			if(data instanceof String){
		        setForcejitterbuffer(new Boolean((String)data));
		        return;
		    }
			setForcejitterbuffer((Boolean)data);
			return;
		}
		if(VALUEID_DROPCOUNT.equals(valueid)){
			if(data instanceof String){
		        setDropcount(new Integer((String)data));
		        return;
		    }
			setDropcount((Integer)data);
			return;
		}
		if(VALUEID_MAXJITTERBUFFER.equals(valueid)){
			if(data instanceof String){
		        setMaxjitterbuffer(new Integer((String)data));
		        return;
		    }
			setMaxjitterbuffer((Integer)data);
			return;
		}
		if(VALUEID_RESYNCTHRESHOLD.equals(valueid)){
			if(data instanceof String){
		        setResyncthreshold(new Integer((String)data));
		        return;
		    }
			setResyncthreshold((Integer)data);
			return;
		}
		if(VALUEID_MAXJITTERINTERPS.equals(valueid)){
			if(data instanceof String){
		        setMaxjitterinterps(new Integer((String)data));
		        return;
		    }
			setMaxjitterinterps((Integer)data);
			return;
		}
		if(VALUEID_MAXEXCESSBUFFER.equals(valueid)){
			if(data instanceof String){
		        setMaxexcessbuffer(new Integer((String)data));
		        return;
		    }
			setMaxexcessbuffer((Integer)data);
			return;
		}
		if(VALUEID_MINEXCESSBUFFER.equals(valueid)){
			if(data instanceof String){
		        setMinexcessbuffer(new Integer((String)data));
		        return;
		    }
			setMinexcessbuffer((Integer)data);
			return;
		}
		if(VALUEID_JITTERSHRINKRATE.equals(valueid)){
			if(data instanceof String){
		        setJittershrinkrate(new Integer((String)data));
		        return;
		    }
			setJittershrinkrate((Integer)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_JITTERBUFFER.equals(valueid)){
			return getJitterbuffer();
			
		}
		if(VALUEID_FORCEJITTERBUFFER.equals(valueid)){
			return getForcejitterbuffer();
			
		}
		if(VALUEID_DROPCOUNT.equals(valueid)){
			return getDropcount();
			
		}
		if(VALUEID_MAXJITTERBUFFER.equals(valueid)){
			return getMaxjitterbuffer();
			
		}
		if(VALUEID_RESYNCTHRESHOLD.equals(valueid)){
			return getResyncthreshold();
			
		}
		if(VALUEID_MAXJITTERINTERPS.equals(valueid)){
			return getMaxjitterinterps();
			
		}
		if(VALUEID_MAXEXCESSBUFFER.equals(valueid)){
			return getMaxexcessbuffer();
			
		}
		if(VALUEID_MINEXCESSBUFFER.equals(valueid)){
			return getMinexcessbuffer();
			
		}
		if(VALUEID_JITTERSHRINKRATE.equals(valueid)){
			return getJittershrinkrate();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getjitterbuffer 
	* yes|no
	**/
	public Boolean getJitterbuffer(){		return  jitterbuffer;
	}
	/**
	*setjitterbuffer 
	*/
	public void setJitterbuffer(Boolean ajitterbuffer){
		if(ajitterbuffer==null){
		    changed = (this.jitterbuffer!=null);
		    this.jitterbuffer = null;	    
		}else{
			changed = ajitterbuffer.equals(this.jitterbuffer);
			this.jitterbuffer=ajitterbuffer;
		}
	}


	/**
	* getforcejitterbuffer 
	* yes|no
	**/
	public Boolean getForcejitterbuffer(){		return  forcejitterbuffer;
	}
	/**
	*setforcejitterbuffer 
	*/
	public void setForcejitterbuffer(Boolean aforcejitterbuffer){
		if(aforcejitterbuffer==null){
		    changed = (this.forcejitterbuffer!=null);
		    this.forcejitterbuffer = null;	    
		}else{
			changed = aforcejitterbuffer.equals(this.forcejitterbuffer);
			this.forcejitterbuffer=aforcejitterbuffer;
		}
	}


	/**
	* getdropcount 
	* the jitter buffer is sized such that no more than "dropcount" frames would have been "too late" over the last 2 seconds. Set to a small number.  "3" represents 1.5% of frames dropped [This option is not applicable to, and ignored by the new jitterbuffer implementation]
	**/
	public Integer getDropcount(){		return  dropcount;
	}
	/**
	*setdropcount 
	*/
	public void setDropcount(Integer adropcount){
		if(adropcount==null){
		    changed = (this.dropcount!=null);
		    this.dropcount = null;	    
		}else{
			changed = adropcount.equals(this.dropcount);
			this.dropcount=adropcount;
		}
	}


	/**
	* getmaxjitterbuffer 
	* a maximum size for the jitter buffer. Setting a reasonable maximum here will prevent the call delay from rising to silly values in extreme situations; you'll hear SOMETHING, even though it will be jittery.
	**/
	public Integer getMaxjitterbuffer(){		return  maxjitterbuffer;
	}
	/**
	*setmaxjitterbuffer 
	*/
	public void setMaxjitterbuffer(Integer amaxjitterbuffer){
		if(amaxjitterbuffer==null){
		    changed = (this.maxjitterbuffer!=null);
		    this.maxjitterbuffer = null;	    
		}else{
			changed = amaxjitterbuffer.equals(this.maxjitterbuffer);
			this.maxjitterbuffer=amaxjitterbuffer;
		}
	}


	/**
	* getresyncthreshold 
	* when the jitterbuffer notices a significant change in delay that continues over a few frames, it will resync, assuming that the change in delay was caused by a timestamping mix-up. The threshold for noticing a change in delay is measured as twice the measured jitter plus this resync threshold. Resycning can be disabled by setting this parameter to -1. [This option presently applies only to the new jitterbuffer implementation]
	**/
	public Integer getResyncthreshold(){		return  resyncthreshold;
	}
	/**
	*setresyncthreshold 
	*/
	public void setResyncthreshold(Integer aresyncthreshold){
		if(aresyncthreshold==null){
		    changed = (this.resyncthreshold!=null);
		    this.resyncthreshold = null;	    
		}else{
			changed = aresyncthreshold.equals(this.resyncthreshold);
			this.resyncthreshold=aresyncthreshold;
		}
	}


	/**
	* getmaxjitterinterps 
	* the maximum number of interpolation frames the jitterbuffer should return in a row. Since some clients do not send CNG/DTX frames to indicate silence, the jitterbuffer will assume silence has begun after returning this many interpolations. This prevents interpolating throughout a long silence. [This option presently applies only to the new jitterbuffer implementation]
	**/
	public Integer getMaxjitterinterps(){		return  maxjitterinterps;
	}
	/**
	*setmaxjitterinterps 
	*/
	public void setMaxjitterinterps(Integer amaxjitterinterps){
		if(amaxjitterinterps==null){
		    changed = (this.maxjitterinterps!=null);
		    this.maxjitterinterps = null;	    
		}else{
			changed = amaxjitterinterps.equals(this.maxjitterinterps);
			this.maxjitterinterps=amaxjitterinterps;
		}
	}


	/**
	* getmaxexcessbuffer 
	* If conditions improve after a period of high jitter, the jitter buffer can end up bigger than necessary.  If it ends up more than "maxexcessbuffer" bigger than needed, Asterisk will start gradually decreasing the amount of jitter buffering. [This option is not applicable to, and ignored by the new jitterbuffer implementation]
	**/
	public Integer getMaxexcessbuffer(){		return  maxexcessbuffer;
	}
	/**
	*setmaxexcessbuffer 
	*/
	public void setMaxexcessbuffer(Integer amaxexcessbuffer){
		if(amaxexcessbuffer==null){
		    changed = (this.maxexcessbuffer!=null);
		    this.maxexcessbuffer = null;	    
		}else{
			changed = amaxexcessbuffer.equals(this.maxexcessbuffer);
			this.maxexcessbuffer=amaxexcessbuffer;
		}
	}


	/**
	* getminexcessbuffer 
	* Sets a desired mimimum amount of headroom in  the jitter buffer.  If Asterisk has less headroom than this, then it will start gradually increasing the amount of jitter buffering. [This option is not applicable to, and ignored by the new jitterbuffer implementation]
	**/
	public Integer getMinexcessbuffer(){		return  minexcessbuffer;
	}
	/**
	*setminexcessbuffer 
	*/
	public void setMinexcessbuffer(Integer aminexcessbuffer){
		if(aminexcessbuffer==null){
		    changed = (this.minexcessbuffer!=null);
		    this.minexcessbuffer = null;	    
		}else{
			changed = aminexcessbuffer.equals(this.minexcessbuffer);
			this.minexcessbuffer=aminexcessbuffer;
		}
	}


	/**
	* getjittershrinkrate 
	* when the jitter buffer is being gradually shrunk  (or enlarged), how many millisecs shall we take off per 20ms frame received?  Use a small number, or you will be able to hear it changing.  An example
	**/
	public Integer getJittershrinkrate(){		return  jittershrinkrate;
	}
	/**
	*setjittershrinkrate 
	*/
	public void setJittershrinkrate(Integer ajittershrinkrate){
		if(ajittershrinkrate==null){
		    changed = (this.jittershrinkrate!=null);
		    this.jittershrinkrate = null;	    
		}else{
			changed = ajittershrinkrate.equals(this.jittershrinkrate);
			this.jittershrinkrate=ajittershrinkrate;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("jitterbuffer=")
		.append(jitterbuffer)
		.append(",")
		.append("forcejitterbuffer=")
		.append(forcejitterbuffer)
		.append(",")
		.append("dropcount=")
		.append(dropcount)
		.append(",")
		.append("maxjitterbuffer=")
		.append(maxjitterbuffer)
		.append(",")
		.append("resyncthreshold=")
		.append(resyncthreshold)
		.append(",")
		.append("maxjitterinterps=")
		.append(maxjitterinterps)
		.append(",")
		.append("maxexcessbuffer=")
		.append(maxexcessbuffer)
		.append(",")
		.append("minexcessbuffer=")
		.append(minexcessbuffer)
		.append(",")
		.append("jittershrinkrate=")
		.append(jittershrinkrate)
    			.append("]");

		return sb.toString();		
	}}