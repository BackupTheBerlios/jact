

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISayCountPL<br>
 * Polish grammar has some funny rules for counting words. for example 1 zloty, 2 zlote, 5 zlotych. This application will take the words for 1, 2-4 and 5 and decide based on grammar rules which one to use with the number you pass to it.  Example: saycountpl(zloty,zlote,zlotych,122) will give: zlote
 * </p>
 * Created : Wed Jul 05 18:55:01 CEST 2006
 * 
 * @behavior.elementname SayCountPL
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISayCountPL.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ISayCountPL {
public static final String MODELNAME = "SayCountPL";	
 
// ------   1-1 aggregates
	//test
	//---------  getter und setter

}