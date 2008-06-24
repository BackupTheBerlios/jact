

package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;

import com.useit.jact.model.types.PbxContext;


/**
 * <p>
 * IMisdnconf<br>
 * chan_misdn sample config general section:  for debugging and general setup, things that are not bound to port groups
 * </p>
 * Created : Fri May 26 14:30:32 CEST 2006
 * 
 * @behavior.elementname Misdnconf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMisdnconf.java,v 1.1 2008/06/24 20:45:14 urszeidler Exp $
 */
 public  interface  IMisdnconf {
public static final String MODELNAME = "Misdnconf";	

/**
 * gibt die List<MisdnCryptkey> misdnCryptkeyMap zurück	
 * @return List<MisdnCryptkey>
 * @behavior.list MisdnCryptkeyMap 
 * @behavior.list.type MisdnCryptkey 
 */
public List getMisdnCryptkeyMap();
/**
 * setzt die Map MisdnCryptkeyMap
 * @param map misdnCryptkeyMapMap
 * @behavior.list MisdnCryptkeyMap 
 * @behavior.list.type MisdnCryptkey 
 */
public void setMisdnCryptkeyMap(List aList);

/**
 * gibt die List<MisdnSections> misdnSectionsMap zurück	
 * @return List<MisdnSections>
 * @behavior.list MisdnSectionsMap 
 * @behavior.list.type MisdnSections 
 */
public List getMisdnSectionsMap();
/**
 * setzt die Map MisdnSectionsMap
 * @param map misdnSectionsMapMap
 * @behavior.list MisdnSectionsMap 
 * @behavior.list.type MisdnSections 
 */
public void setMisdnSectionsMap(List aList);
 
// ------   1-1 aggregates
/**
 * @return MisdnSections the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type MisdnSections 
 */
public IMisdnSections getMisdnSections();

/**
 * setzt den MisdnSections und die MisdnSectionsid	
 * @param MisdnSections
 */
public void setMisdnSections(IMisdnSections aMisdnSections);
// 	public static final String VALUEID_DEBUG="debug" ;
// 	public static final String VALUEID_TRACEFILE="tracefile" ;
// 	public static final String VALUEID_TRACE_CALLS="trace_calls" ;
// 	public static final String VALUEID_TRACE_DIR="trace_dir" ;
// 	public static final String VALUEID_BRIDGING="bridging" ;
// 	public static final String VALUEID_STOP_TONE_AFTER_FIRST_DIGIT="stop_tone_after_first_digit" ;
// 	public static final String VALUEID_APPEND_DIGITS2EXTEN="append_digits2exten" ;
// 	public static final String VALUEID_L1_INFO_OK="l1_info_ok" ;
// 	public static final String VALUEID_CLEAR_L3="clear_l3" ;
// 	public static final String VALUEID_DYNAMIC_CRYPT="dynamic_crypt" ;
// 	public static final String VALUEID_CRYPT_PREFIX="crypt_prefix" ;
// 	public static final String VALUEID_FILEID="fileid" ;
// 	public static final String VALUEID_CONTEXT="context" ;
	
	//---------  getter und setter

	/**
	* getdebug 
	* set debugging flag:  0 - No Debug  1 - mISDN Messages and * - Messages, and * - State changes  2 - Messages + Message specific Informations (e.g. bearer capability)  3 - very Verbose, the above + lots of Driver specific infos 4 - even more Verbose than 3
	* @behavior.fieldname debug 
	**/
	public Integer getDebug();
	
	/**
	*setdebug 
	* set debugging flag:  0 - No Debug  1 - mISDN Messages and * - Messages, and * - State changes  2 - Messages + Message specific Informations (e.g. bearer capability)  3 - very Verbose, the above + lots of Driver specific infos 4 - even more Verbose than 3
	* @behavior.fieldname debug 
	*/
	public void setDebug(Integer adebug);


	/**
	* gettracefile 
	* the big trace
	* @behavior.fieldname tracefile 
	**/
	public String getTracefile();
	
	/**
	*settracefile 
	* the big trace
	* @behavior.fieldname tracefile 
	*/
	public void setTracefile(String atracefile);


	/**
	* gettrace_calls 
	* single call trace files set to true if you want to have them  they depend on debug level
	* @behavior.fieldname trace_calls 
	**/
	public Boolean getTrace_calls();
	
	/**
	*settrace_calls 
	* single call trace files set to true if you want to have them  they depend on debug level
	* @behavior.fieldname trace_calls 
	*/
	public void setTrace_calls(Boolean atrace_calls);


	/**
	* gettrace_dir 
	* single call trace files  set to true if you want to have them  they depend on debug level
	* @behavior.fieldname trace_dir 
	**/
	public String getTrace_dir();
	
	/**
	*settrace_dir 
	* single call trace files  set to true if you want to have them  they depend on debug level
	* @behavior.fieldname trace_dir 
	*/
	public void setTrace_dir(String atrace_dir);


	/**
	* getbridging 
	* set to yes if you want mISDN_dsp to bridge the calls in HW
	* @behavior.fieldname bridging 
	**/
	public Boolean getBridging();
	
	/**
	*setbridging 
	* set to yes if you want mISDN_dsp to bridge the calls in HW
	* @behavior.fieldname bridging 
	*/
	public void setBridging(Boolean abridging);


	/**
	* getstop_tone_after_first_digit 
	* Stops dialtone after getting first digit on nt Port
	* @behavior.fieldname stop_tone_after_first_digit 
	**/
	public Boolean getStop_tone_after_first_digit();
	
	/**
	*setstop_tone_after_first_digit 
	* Stops dialtone after getting first digit on nt Port
	* @behavior.fieldname stop_tone_after_first_digit 
	*/
	public void setStop_tone_after_first_digit(Boolean astop_tone_after_first_digit);


	/**
	* getappend_digits2exten 
	* Wether to append overlapdialed Digits to Extension or not
	* @behavior.fieldname append_digits2exten 
	**/
	public Boolean getAppend_digits2exten();
	
	/**
	*setappend_digits2exten 
	* Wether to append overlapdialed Digits to Extension or not
	* @behavior.fieldname append_digits2exten 
	*/
	public void setAppend_digits2exten(Boolean aappend_digits2exten);


	/**
	* getl1_info_ok 
	* set this to yes if you have jollys mISDN which sends correct L1 Infos
	* @behavior.fieldname l1_info_ok 
	**/
	public Boolean getL1_info_ok();
	
	/**
	*setl1_info_ok 
	* set this to yes if you have jollys mISDN which sends correct L1 Infos
	* @behavior.fieldname l1_info_ok 
	*/
	public void setL1_info_ok(Boolean al1_info_ok);


	/**
	* getclear_l3 
	* set this to yes if you want to clear the l3 in case the l2 deactivates some environments have a flickering l2 which causes this option to  damage active calls .. highly experimental
	* @behavior.fieldname clear_l3 
	**/
	public Boolean getClear_l3();
	
	/**
	*setclear_l3 
	* set this to yes if you want to clear the l3 in case the l2 deactivates some environments have a flickering l2 which causes this option to  damage active calls .. highly experimental
	* @behavior.fieldname clear_l3 
	*/
	public void setClear_l3(Boolean aclear_l3);


	/**
	* getdynamic_crypt 
	* CRYPTION STUFF  Wether to look for dynamic crypting attempt
	* @behavior.fieldname dynamic_crypt 
	**/
	public Boolean getDynamic_crypt();
	
	/**
	*setdynamic_crypt 
	* CRYPTION STUFF  Wether to look for dynamic crypting attempt
	* @behavior.fieldname dynamic_crypt 
	*/
	public void setDynamic_crypt(Boolean adynamic_crypt);


	/**
	* getcrypt_prefix 
	* crypt_prefix, what is used for crypting Protocol
	* @behavior.fieldname crypt_prefix 
	**/
	public String getCrypt_prefix();
	
	/**
	*setcrypt_prefix 
	* crypt_prefix, what is used for crypting Protocol
	* @behavior.fieldname crypt_prefix 
	*/
	public void setCrypt_prefix(String acrypt_prefix);


	/**
	* getfileid 
	* 
	* @behavior.fieldname fileid 
	**/
	public String getFileid();
	
	/**
	*setfileid 
	* 
	* @behavior.fieldname fileid 
	*/
	public void setFileid(String afileid);


	/**
	* getcontext 
	* 
	* @behavior.fieldname context 
	**/
	public PbxContext getContext();
	
	/**
	*setcontext 
	* 
	* @behavior.fieldname context 
	*/
	public void setContext(PbxContext acontext);


}