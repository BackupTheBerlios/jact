package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Cut<br>
 * newvar - new variable created from result string  varname - variable you want cut  delimiter - defaults to '-'  fieldspec - number of the field you want (1-based offset)  may also be specified as a range (with -)  or group of ranges and fields (with &)  Returns 0 or -1 on hangup or error.
 * </p>
 * Created : Sun Jul 09 18:51:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Cut.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class Cut extends PbxApplication implements ICut{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Cut
	**/
	public Cut(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Cut
	**/
	public Cut( String anewvar, String avarname, String adelimiter, String afield){
		super();
	
		this.newvar = anewvar;	
		this.varname = avarname;	
		this.delimiter = adelimiter;	
		this.field = afield;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Cut object){
		this.newvar = object.newvar;	
		this.varname = object.varname;	
		this.delimiter = object.delimiter;	
		this.field = object.field;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String newvar;
	public static final String VALUEID_NEWVAR="newvar" ;

    /**   **/
	protected String varname;
	public static final String VALUEID_VARNAME="varname" ;

    /**   **/
	protected String delimiter;
	public static final String VALUEID_DELIMITER="delimiter" ;

    /**   **/
	protected String field;
	public static final String VALUEID_FIELD="field" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_NEWVAR.equals(valueid)){
			return true;
		}
		if(VALUEID_VARNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_DELIMITER.equals(valueid)){
			return true;
		}
		if(VALUEID_FIELD.equals(valueid)){
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
		if(VALUEID_NEWVAR.equals(valueid)){
			setNewvar((String)data);
			return;
		}
		if(VALUEID_VARNAME.equals(valueid)){
			setVarname((String)data);
			return;
		}
		if(VALUEID_DELIMITER.equals(valueid)){
			setDelimiter((String)data);
			return;
		}
		if(VALUEID_FIELD.equals(valueid)){
			setField((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_NEWVAR.equals(valueid)){
			return getNewvar();
			
		}
		if(VALUEID_VARNAME.equals(valueid)){
			return getVarname();
			
		}
		if(VALUEID_DELIMITER.equals(valueid)){
			return getDelimiter();
			
		}
		if(VALUEID_FIELD.equals(valueid)){
			return getField();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getnewvar 
	* 
	**/
	public String getNewvar(){		return  newvar;
	}
	/**
	*setnewvar 
	*/
	public void setNewvar(String anewvar){
		if(anewvar==null){
		    changed = (this.newvar!=null);
		    this.newvar = null;	    
		}else{
			changed = anewvar.equals(this.newvar);
			this.newvar=anewvar;
		}
	}


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
	* getdelimiter 
	* 
	**/
	public String getDelimiter(){		return  delimiter;
	}
	/**
	*setdelimiter 
	*/
	public void setDelimiter(String adelimiter){
		if(adelimiter==null){
		    changed = (this.delimiter!=null);
		    this.delimiter = null;	    
		}else{
			changed = adelimiter.equals(this.delimiter);
			this.delimiter=adelimiter;
		}
	}


	/**
	* getfield 
	* 
	**/
	public String getField(){		return  field;
	}
	/**
	*setfield 
	*/
	public void setField(String afield){
		if(afield==null){
		    changed = (this.field!=null);
		    this.field = null;	    
		}else{
			changed = afield.equals(this.field);
			this.field=afield;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Cut, ")		
		//.append("newvar=")
		.append(newvar)
		.append(",")
		//.append("varname=")
		.append(varname)
		.append(",")
		//.append("delimiter=")
		.append(delimiter)
		.append(",")
		//.append("field=")
		.append(field)
    			.append("");

		return sb.toString();		
	}
}