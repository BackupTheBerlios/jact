package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ReadFile<br>
 * Varname - Result stored here.  File - The name of the file to read.  Length - Maximum number of lines to capture.
 * </p>
 * Created : Sun Jul 09 18:50:53 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ReadFile.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ReadFile extends PbxApplication implements IReadFile{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ReadFile
	**/
	public ReadFile(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ReadFile
	**/
	public ReadFile( String avarname, String afile, String alength){
		super();
	
		this.varname = avarname;	
		this.file = afile;	
		this.length = alength;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ReadFile object){
		this.varname = object.varname;	
		this.file = object.file;	
		this.length = object.length;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String varname;
	public static final String VALUEID_VARNAME="varname" ;

    /**   **/
	protected String file;
	public static final String VALUEID_FILE="file" ;

    /**   **/
	protected String length;
	public static final String VALUEID_LENGTH="length" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_VARNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_FILE.equals(valueid)){
			return true;
		}
		if(VALUEID_LENGTH.equals(valueid)){
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
		if(VALUEID_VARNAME.equals(valueid)){
			setVarname((String)data);
			return;
		}
		if(VALUEID_FILE.equals(valueid)){
			setFile((String)data);
			return;
		}
		if(VALUEID_LENGTH.equals(valueid)){
			setLength((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_VARNAME.equals(valueid)){
			return getVarname();
			
		}
		if(VALUEID_FILE.equals(valueid)){
			return getFile();
			
		}
		if(VALUEID_LENGTH.equals(valueid)){
			return getLength();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getvarname 
	* 
	**/
	public String getVarname(){		return  varname;
	}
	/**
	*setvarname 
	*/
	public void setVarname(String avarname){
		if(avarname==null){
		    changed = (this.varname!=null);
		    this.varname = null;	    
		}else{
			changed = avarname.equals(this.varname);
			this.varname=avarname;
		}
	}


	/**
	* getfile 
	* 
	**/
	public String getFile(){		return  file;
	}
	/**
	*setfile 
	*/
	public void setFile(String afile){
		if(afile==null){
		    changed = (this.file!=null);
		    this.file = null;	    
		}else{
			changed = afile.equals(this.file);
			this.file=afile;
		}
	}


	/**
	* getlength 
	* 
	**/
	public String getLength(){		return  length;
	}
	/**
	*setlength 
	*/
	public void setLength(String alength){
		if(alength==null){
		    changed = (this.length!=null);
		    this.length = null;	    
		}else{
			changed = alength.equals(this.length);
			this.length=alength;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ReadFile, ")		
		//.append("varname=")
		.append(varname)
		.append(",")
		//.append("file=")
		.append(file)
		.append(",")
		//.append("length=")
		.append(length)
    			.append("");

		return sb.toString();		
	}
}