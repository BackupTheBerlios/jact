package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * AppendCDRUserField<br>
 * [Description] AppendCDRUserField(value): Append value to the CDR user field  The Call Data Record (CDR) user field is an extra field you  can use for data not stored anywhere else in the record.  CDR records can be used for billing or storing other arbitrary data  (I.E. telephone survey responses)  Also see SetCDRUserField().  Always returns 0
 * </p>
 * Created : Sun Jul 09 18:49:05 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AppendCDRUserField.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class AppendCDRUserField extends PbxApplication implements IAppendCDRUserField{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor f�r AppendCDRUserField
	**/
	public AppendCDRUserField(){
		super();
	
	}
	/**
	* komplexer Konstruktor f�r AppendCDRUserField
	**/
	public AppendCDRUserField( String avalue){
		super();
	
		this.value = avalue;	
	}
	/**
	 * �bernimmt alle Werte aus dem �bergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim �ndern der daten
	 * @param object
	 */
	public void assignTo(AppendCDRUserField object){
		this.value = object.value;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String value;
	public static final String VALUEID_VALUE="value" ;

	/**
	 * �berpr�ft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_VALUE.equals(valueid)){
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
		if(VALUEID_VALUE.equals(valueid)){
			setValue((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zur�ck
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_VALUE.equals(valueid)){
			return getValue();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getvalue 
	* 
	**/
	public String getValue(){		return  value;
	}
	/**
	*setvalue 
	*/
	public void setValue(String avalue){
		if(avalue==null){
		    changed = (this.value!=null);
		    this.value = null;	    
		}else{
			changed = avalue.equals(this.value);
			this.value=avalue;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("AppendCDRUserField, ")		
		//.append("value=")
		.append(value)
    			.append("");

		return sb.toString();		
	}
}