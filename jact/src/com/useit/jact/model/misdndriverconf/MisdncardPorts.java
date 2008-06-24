package com.useit.jact.model.misdndriverconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.MPortOptionSet;
import com.useit.jact.model.types.MisdnPortOptions;


/**
 * <p>
 * MisdncardPorts<br>
 * 
 * </p>
 * Created : Fri May 26 14:31:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdncardPorts.java,v 1.1 2008/06/24 20:45:02 urszeidler Exp $
 */
 public  class MisdncardPorts extends AbstractSimpleDataClass implements IMisdncardPorts{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MisdncardPorts
	**/
	public MisdncardPorts(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MisdncardPorts
	**/
	public MisdncardPorts( Integer aportN, MisdnPortOptions aportOption, MPortOptionSet amPortOption){
		super();
	
		this.portN = aportN;	
		this.portOption = aportOption;	
		this.mPortOption = amPortOption;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MisdncardPorts object){
		this.portN = object.portN;	
		this.portOption = object.portOption;	
		this.mPortOption = object.mPortOption;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected Integer portN;
	public static final String VALUEID_PORTN="portn" ;

    /**   **/
	protected MisdnPortOptions portOption;
	public static final String VALUEID_PORTOPTION="portoption" ;

    /**   **/
	protected MPortOptionSet mPortOption;
	public static final String VALUEID_MPORTOPTION="mportoption" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_PORTN.equals(valueid)){
			return true;
		}
		if(VALUEID_PORTOPTION.equals(valueid)){
			return true;
		}
		if(VALUEID_MPORTOPTION.equals(valueid)){
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
		if(VALUEID_PORTN.equals(valueid)){
			if(data instanceof String){
		        setPortN(new Integer((String)data));
		        return;
		    }
			setPortN((Integer)data);
			return;
		}
		if(VALUEID_PORTOPTION.equals(valueid)){
			if(data instanceof String){
		        setPortOption(new MisdnPortOptions((String)data));
		        return;
		    }
			setPortOption((MisdnPortOptions)data);
			return;
		}
		if(VALUEID_MPORTOPTION.equals(valueid)){
			if(data instanceof String){
		        setMPortOption(new MPortOptionSet((String)data));
		        return;
		    }
			setMPortOption((MPortOptionSet)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_PORTN.equals(valueid)){
			return getPortN();
			
		}
		if(VALUEID_PORTOPTION.equals(valueid)){
			return getPortOption();
			
		}
		if(VALUEID_MPORTOPTION.equals(valueid)){
			return getMPortOption();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getportN 
	* 
	**/
	public Integer getPortN(){		return  portN;
	}
	/**
	*setportN 
	*/
	public void setPortN(Integer aportN){
		if(aportN==null){
		    changed = (this.portN!=null);
		    this.portN = null;	    
		}else{
			changed = aportN.equals(this.portN);
			this.portN=aportN;
		}
	}


	/**
	* getportOption 
	* 
	**/
	public MisdnPortOptions getPortOption(){		return  portOption;
	}
	/**
	*setportOption 
	*/
	public void setPortOption(MisdnPortOptions aportOption){
		if(aportOption==null){
		    changed = (this.portOption!=null);
		    this.portOption = null;	    
		}else{
			changed = aportOption.equals(this.portOption);
			this.portOption=aportOption;
		}
	}


	/**
	* getmPortOption 
	* 
	**/
	public MPortOptionSet getMPortOption(){		return  mPortOption;
	}
	/**
	*setmPortOption 
	*/
	public void setMPortOption(MPortOptionSet amPortOption){
		if(amPortOption==null){
		    changed = (this.mPortOption!=null);
		    this.mPortOption = null;	    
		}else{
			changed = amPortOption.equals(this.mPortOption);
			this.mPortOption=amPortOption;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("portN=")
		.append(portN)
		.append(",")
		.append("portOption=")
		.append(portOption)
		.append(",")
		.append("mPortOption=")
		.append(mPortOption)
    			.append("]");

		return sb.toString();		
	}}