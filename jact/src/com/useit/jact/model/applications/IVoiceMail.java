

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IVoiceMail<br>
 * Leavesvoicemail for a given extension (must be configured in voicemail.conf).  If the extension is preceded by  * 's' then instructions for leaving the message will be skipped. * 'u' then the "unavailable" message will be played.  (/var/lib/asterisk/sounds/vm/<exten>/unavail) if it exists. * 'b' then the the busy message will be played (that is, busy instead of unavail). If the caller presses '0' (zero) during the prompt, the call jumps to extension 'o' in the current context. If the caller presses '*' during the prompt, the call jumps to extension 'a' in the current context. If the requested mailbox does not exist, and there exists a priority n + 101, then that priority will be taken next. When multiple mailboxes are specified, the unavailable or busy message will be taken from the first mailbox specified. Returns -1 on error or mailbox not found, or if the user hangs up. Otherwise, it returns 0.
 * </p>
 * Created : Wed Jul 05 18:54:58 CEST 2006
 * 
 * @behavior.elementname VoiceMail
 * @author urs
 * @version $Revision: 1.1 $, $Id: IVoiceMail.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IVoiceMail {
public static final String MODELNAME = "VoiceMail";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_S="s" ;
// 	public static final String VALUEID_U="u" ;
// 	public static final String VALUEID_B="b" ;
// 	public static final String VALUEID_EXTENSION="extension" ;
// 	public static final String VALUEID_CONTEXT="context" ;
	//test
	//---------  getter und setter
	/**
	* gets 
	* 
	* @behavior.fieldname s 
	**/
	public String getS();
	
	/**
	*sets 
	* 
	* @behavior.fieldname s 
	*/
	public void setS(String as);
	/**
	* getu 
	* 
	* @behavior.fieldname u 
	**/
	public String getU();
	
	/**
	*setu 
	* 
	* @behavior.fieldname u 
	*/
	public void setU(String au);
	/**
	* getb 
	* 
	* @behavior.fieldname b 
	**/
	public String getB();
	
	/**
	*setb 
	* 
	* @behavior.fieldname b 
	*/
	public void setB(String ab);
	/**
	* getextension 
	* 
	* @behavior.fieldname extension 
	**/
	public String getExtension();
	
	/**
	*setextension 
	* 
	* @behavior.fieldname extension 
	*/
	public void setExtension(String aextension);
	/**
	* getcontext 
	* 
	* @behavior.fieldname context 
	**/
	public String getContext();
	
	/**
	*setcontext 
	* 
	* @behavior.fieldname context 
	*/
	public void setContext(String acontext);

}