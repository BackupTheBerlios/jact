

package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IIaxjitter<br>
 * There are presently two jitterbuffer implementations available for * and chan_iax2<para>the classic and the new, channel/application independent implementation.  These

are controlled at compile-time.  The new jitterbuffer additionally has support for PLC

which greatly improves quality as the jitterbuffer adapts size, and in compensating for lost packets. All the jitter buffer settings except dropcount are in milliseconds. The jitter buffer works for INCOMING audio - the outbound audio will  be dejittered by the jitter buffer at the other end.
 * </p>
 * Created : Fri May 26 14:30:27 CEST 2006
 * 
 * @behavior.elementname Iaxjitter
 * @author urs
 * @version $Revision: 1.1 $, $Id: IIaxjitter.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
 public  interface  IIaxjitter {
public static final String MODELNAME = "Iaxjitter";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_JITTERBUFFER="jitterbuffer" ;
// 	public static final String VALUEID_FORCEJITTERBUFFER="forcejitterbuffer" ;
// 	public static final String VALUEID_DROPCOUNT="dropcount" ;
// 	public static final String VALUEID_MAXJITTERBUFFER="maxjitterbuffer" ;
// 	public static final String VALUEID_RESYNCTHRESHOLD="resyncthreshold" ;
// 	public static final String VALUEID_MAXJITTERINTERPS="maxjitterinterps" ;
// 	public static final String VALUEID_MAXEXCESSBUFFER="maxexcessbuffer" ;
// 	public static final String VALUEID_MINEXCESSBUFFER="minexcessbuffer" ;
// 	public static final String VALUEID_JITTERSHRINKRATE="jittershrinkrate" ;
	
	//---------  getter und setter

	/**
	* getjitterbuffer 
	* yes|no
	* @behavior.fieldname jitterbuffer 
	**/
	public Boolean getJitterbuffer();
	
	/**
	*setjitterbuffer 
	* yes|no
	* @behavior.fieldname jitterbuffer 
	*/
	public void setJitterbuffer(Boolean ajitterbuffer);


	/**
	* getforcejitterbuffer 
	* yes|no
	* @behavior.fieldname forcejitterbuffer 
	**/
	public Boolean getForcejitterbuffer();
	
	/**
	*setforcejitterbuffer 
	* yes|no
	* @behavior.fieldname forcejitterbuffer 
	*/
	public void setForcejitterbuffer(Boolean aforcejitterbuffer);


	/**
	* getdropcount 
	* the jitter buffer is sized such that no more than "dropcount" frames would have been "too late" over the last 2 seconds. Set to a small number.  "3" represents 1.5% of frames dropped [This option is not applicable to, and ignored by the new jitterbuffer implementation]
	* @behavior.fieldname dropcount 
	**/
	public Integer getDropcount();
	
	/**
	*setdropcount 
	* the jitter buffer is sized such that no more than "dropcount" frames would have been "too late" over the last 2 seconds. Set to a small number.  "3" represents 1.5% of frames dropped [This option is not applicable to, and ignored by the new jitterbuffer implementation]
	* @behavior.fieldname dropcount 
	*/
	public void setDropcount(Integer adropcount);


	/**
	* getmaxjitterbuffer 
	* a maximum size for the jitter buffer. Setting a reasonable maximum here will prevent the call delay from rising to silly values in extreme situations; you'll hear SOMETHING, even though it will be jittery.
	* @behavior.fieldname maxjitterbuffer 
	**/
	public Integer getMaxjitterbuffer();
	
	/**
	*setmaxjitterbuffer 
	* a maximum size for the jitter buffer. Setting a reasonable maximum here will prevent the call delay from rising to silly values in extreme situations; you'll hear SOMETHING, even though it will be jittery.
	* @behavior.fieldname maxjitterbuffer 
	*/
	public void setMaxjitterbuffer(Integer amaxjitterbuffer);


	/**
	* getresyncthreshold 
	* when the jitterbuffer notices a significant change in delay that continues over a few frames, it will resync, assuming that the change in delay was caused by a timestamping mix-up. The threshold for noticing a change in delay is measured as twice the measured jitter plus this resync threshold. Resycning can be disabled by setting this parameter to -1. [This option presently applies only to the new jitterbuffer implementation]
	* @behavior.fieldname resyncthreshold 
	**/
	public Integer getResyncthreshold();
	
	/**
	*setresyncthreshold 
	* when the jitterbuffer notices a significant change in delay that continues over a few frames, it will resync, assuming that the change in delay was caused by a timestamping mix-up. The threshold for noticing a change in delay is measured as twice the measured jitter plus this resync threshold. Resycning can be disabled by setting this parameter to -1. [This option presently applies only to the new jitterbuffer implementation]
	* @behavior.fieldname resyncthreshold 
	*/
	public void setResyncthreshold(Integer aresyncthreshold);


	/**
	* getmaxjitterinterps 
	* the maximum number of interpolation frames the jitterbuffer should return in a row. Since some clients do not send CNG/DTX frames to indicate silence, the jitterbuffer will assume silence has begun after returning this many interpolations. This prevents interpolating throughout a long silence. [This option presently applies only to the new jitterbuffer implementation]
	* @behavior.fieldname maxjitterinterps 
	**/
	public Integer getMaxjitterinterps();
	
	/**
	*setmaxjitterinterps 
	* the maximum number of interpolation frames the jitterbuffer should return in a row. Since some clients do not send CNG/DTX frames to indicate silence, the jitterbuffer will assume silence has begun after returning this many interpolations. This prevents interpolating throughout a long silence. [This option presently applies only to the new jitterbuffer implementation]
	* @behavior.fieldname maxjitterinterps 
	*/
	public void setMaxjitterinterps(Integer amaxjitterinterps);


	/**
	* getmaxexcessbuffer 
	* If conditions improve after a period of high jitter, the jitter buffer can end up bigger than necessary.  If it ends up more than "maxexcessbuffer" bigger than needed, Asterisk will start gradually decreasing the amount of jitter buffering. [This option is not applicable to, and ignored by the new jitterbuffer implementation]
	* @behavior.fieldname maxexcessbuffer 
	**/
	public Integer getMaxexcessbuffer();
	
	/**
	*setmaxexcessbuffer 
	* If conditions improve after a period of high jitter, the jitter buffer can end up bigger than necessary.  If it ends up more than "maxexcessbuffer" bigger than needed, Asterisk will start gradually decreasing the amount of jitter buffering. [This option is not applicable to, and ignored by the new jitterbuffer implementation]
	* @behavior.fieldname maxexcessbuffer 
	*/
	public void setMaxexcessbuffer(Integer amaxexcessbuffer);


	/**
	* getminexcessbuffer 
	* Sets a desired mimimum amount of headroom in  the jitter buffer.  If Asterisk has less headroom than this, then it will start gradually increasing the amount of jitter buffering. [This option is not applicable to, and ignored by the new jitterbuffer implementation]
	* @behavior.fieldname minexcessbuffer 
	**/
	public Integer getMinexcessbuffer();
	
	/**
	*setminexcessbuffer 
	* Sets a desired mimimum amount of headroom in  the jitter buffer.  If Asterisk has less headroom than this, then it will start gradually increasing the amount of jitter buffering. [This option is not applicable to, and ignored by the new jitterbuffer implementation]
	* @behavior.fieldname minexcessbuffer 
	*/
	public void setMinexcessbuffer(Integer aminexcessbuffer);


	/**
	* getjittershrinkrate 
	* when the jitter buffer is being gradually shrunk  (or enlarged), how many millisecs shall we take off per 20ms frame received?  Use a small number, or you will be able to hear it changing.  An example
	* @behavior.fieldname jittershrinkrate 
	**/
	public Integer getJittershrinkrate();
	
	/**
	*setjittershrinkrate 
	* when the jitter buffer is being gradually shrunk  (or enlarged), how many millisecs shall we take off per 20ms frame received?  Use a small number, or you will be able to hear it changing.  An example
	* @behavior.fieldname jittershrinkrate 
	*/
	public void setJittershrinkrate(Integer ajittershrinkrate);


}