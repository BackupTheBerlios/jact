

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IReadFile<br>
 * Varname - Result stored here.  File - The name of the file to read.  Length - Maximum number of lines to capture.
 * </p>
 * Created : Wed Jul 05 18:55:32 CEST 2006
 * 
 * @behavior.elementname ReadFile
 * @author urs
 * @version $Revision: 1.1 $, $Id: IReadFile.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IReadFile {
public static final String MODELNAME = "ReadFile";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_VARNAME="varname" ;
// 	public static final String VALUEID_FILE="file" ;
// 	public static final String VALUEID_LENGTH="length" ;
	//test
	//---------  getter und setter
	/**
	* getvarname 
	* 
	* @behavior.fieldname varname 
	**/
	public String getVarname();
	
	/**
	*setvarname 
	* 
	* @behavior.fieldname varname 
	*/
	public void setVarname(String avarname);
	/**
	* getfile 
	* 
	* @behavior.fieldname file 
	**/
	public String getFile();
	
	/**
	*setfile 
	* 
	* @behavior.fieldname file 
	*/
	public void setFile(String afile);
	/**
	* getlength 
	* 
	* @behavior.fieldname length 
	**/
	public String getLength();
	
	/**
	*setlength 
	* 
	* @behavior.fieldname length 
	*/
	public void setLength(String alength);

}