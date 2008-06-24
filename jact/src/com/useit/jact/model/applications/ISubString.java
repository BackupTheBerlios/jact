

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISubString<br>
 * (Deprecated, use ${variable:a:b} instead)   SubString(variable=string_of_digits|count1|count2): Assigns the substring of string_of_digits to a given variable. Parameter count1 may be positive or negative. If it's positive then we skip the first count1 digits from the left. If it's negative, we move count1 digits counting from the end of the string to the left. Parameter count2 implies how many digits we are taking from the point that count1 placed us. If count2 is negative, then that many digits are omitted from the end. For example: exten => _NXXXXXX,1,SubString,test=2564286161|0|3 assigns the area code (3 first digits) to variable test. exten => _NXXXXXX,1,SubString,test=2564286161|-7|7 assigns the last 7 digits to variable test. exten => _NXXXXXX,1,SubString,test=2564286161|0|-4 assigns all but the last 4 digits to variable test. If there are no parameters it'll return with -1. If there wrong parameters it go on and return with 0
 * </p>
 * Created : Wed Jul 05 18:54:46 CEST 2006
 * 
 * @behavior.elementname SubString
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISubString.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ISubString {
public static final String MODELNAME = "SubString";	
 
// ------   1-1 aggregates
	//test
	//---------  getter und setter

}