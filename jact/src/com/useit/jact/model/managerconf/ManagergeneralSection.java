package com.useit.jact.model.managerconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * ManagergeneralSection<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagergeneralSection.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class ManagergeneralSection extends AbstractSimpleDataClass implements IManagergeneralSection{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ManagergeneralSection
	**/
	public ManagergeneralSection(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ManagergeneralSection
	**/
	public ManagergeneralSection( String ageneralid, Boolean aenabled, Integer aportno, String abindaddr, Integer aport, String afileid){
		super();
	
		this.generalid = ageneralid;	
		this.enabled = aenabled;	
		this.portno = aportno;	
		this.bindaddr = abindaddr;	
		this.port = aport;	
		this.fileid = afileid;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ManagergeneralSection object){
		this.generalid = object.generalid;	
		this.enabled = object.enabled;	
		this.portno = object.portno;	
		this.bindaddr = object.bindaddr;	
		this.port = object.port;	
		this.fileid = object.fileid;	

	}
//--------------  map Funktionen
	//public static final String MANAGERSECTIONMAP = "managerSectionMap";
	/** die typisierte List die die Aggregierten objekte(ManagerSectionImpl) enthält */
	protected List<ManagerSection> managerSectionMap = new ArrayList<ManagerSection>();
	/** die typisierte Map die die Aggregierten objekte(ManagerSectionImpl) enthält */
	//protected ManagerSectionMap managerSectionMapMap = new ManagerSectionMap();

	/**
	 * fügt ein ManagerSection Objekt zu der Mapp hinzu
	 * @param aManagerSection
	 */
	public boolean addManagerSection(ManagerSection aManagerSection){
		return managerSectionMap.add(aManagerSection);
	}

	/**
	 * removed ein ManagerSection Objekt aus der Map
	 * @param aManagerSection
	 */
	public boolean removeManagerSection(ManagerSection aManagerSection){
		return managerSectionMap.remove(aManagerSection);
	}

	

/**
 * gibt die List<ManagerSection> managerSectionMap zurück	
 * @return List<ManagerSection>
 * @see  IManagergeneralSection#getManagerSectionMap
 */
public List<ManagerSection> getManagerSectionMap() {
	return managerSectionMap;
}
/**
 * setzt die Map ManagerSectionMap
 * @param map managerSectionMapMap
 */
 @SuppressWarnings("unchecked")
public void setManagerSectionMap(List aList){
    managerSectionMap = aList;
   // managerSectionMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String generalid;
	public static final String VALUEID_GENERALID="generalid" ;

    /**   **/
	protected Boolean enabled;
	public static final String VALUEID_ENABLED="enabled" ;

    /**  Note: "portno" is changing to "port" in a forthcoming CVS version.  **/
	protected Integer portno;
	public static final String VALUEID_PORTNO="portno" ;

    /**   **/
	protected String bindaddr;
	public static final String VALUEID_BINDADDR="bindaddr" ;

    /**   **/
	protected Integer port;
	public static final String VALUEID_PORT="port" ;

    /**   **/
	protected String fileid;
	public static final String VALUEID_FILEID="fileid" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_GENERALID.equals(valueid)){
			return true;
		}
		if(VALUEID_ENABLED.equals(valueid)){
			return true;
		}
		if(VALUEID_PORTNO.equals(valueid)){
			return true;
		}
		if(VALUEID_BINDADDR.equals(valueid)){
			return true;
		}
		if(VALUEID_PORT.equals(valueid)){
			return true;
		}
		if(VALUEID_FILEID.equals(valueid)){
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
		if(VALUEID_GENERALID.equals(valueid)){
			setGeneralid((String)data);
			return;
		}
		if(VALUEID_ENABLED.equals(valueid)){
			if(data instanceof String){
		        setEnabled(new Boolean((String)data));
		        return;
		    }
			setEnabled((Boolean)data);
			return;
		}
		if(VALUEID_PORTNO.equals(valueid)){
			if(data instanceof String){
		        setPortno(new Integer((String)data));
		        return;
		    }
			setPortno((Integer)data);
			return;
		}
		if(VALUEID_BINDADDR.equals(valueid)){
			setBindaddr((String)data);
			return;
		}
		if(VALUEID_PORT.equals(valueid)){
			if(data instanceof String){
		        setPort(new Integer((String)data));
		        return;
		    }
			setPort((Integer)data);
			return;
		}
		if(VALUEID_FILEID.equals(valueid)){
			setFileid((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_GENERALID.equals(valueid)){
			return getGeneralid();
			
		}
		if(VALUEID_ENABLED.equals(valueid)){
			return getEnabled();
			
		}
		if(VALUEID_PORTNO.equals(valueid)){
			return getPortno();
			
		}
		if(VALUEID_BINDADDR.equals(valueid)){
			return getBindaddr();
			
		}
		if(VALUEID_PORT.equals(valueid)){
			return getPort();
			
		}
		if(VALUEID_FILEID.equals(valueid)){
			return getFileid();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getgeneralid 
	* 
	**/
	public String getGeneralid(){		return  generalid;
	}
	/**
	*setgeneralid 
	*/
	public void setGeneralid(String ageneralid){
		if(ageneralid==null){
		    changed = (this.generalid!=null);
		    this.generalid = null;	    
		}else{
			changed = ageneralid.equals(this.generalid);
			this.generalid=ageneralid;
		}
	}


	/**
	* getenabled 
	* 
	**/
	public Boolean getEnabled(){		return  enabled;
	}
	/**
	*setenabled 
	*/
	public void setEnabled(Boolean aenabled){
		if(aenabled==null){
		    changed = (this.enabled!=null);
		    this.enabled = null;	    
		}else{
			changed = aenabled.equals(this.enabled);
			this.enabled=aenabled;
		}
	}


	/**
	* getportno 
	* Note: "portno" is changing to "port" in a forthcoming CVS version. 
	**/
	public Integer getPortno(){		return  portno;
	}
	/**
	*setportno 
	*/
	public void setPortno(Integer aportno){
		if(aportno==null){
		    changed = (this.portno!=null);
		    this.portno = null;	    
		}else{
			changed = aportno.equals(this.portno);
			this.portno=aportno;
		}
	}


	/**
	* getbindaddr 
	* 
	**/
	public String getBindaddr(){		return  bindaddr;
	}
	/**
	*setbindaddr 
	*/
	public void setBindaddr(String abindaddr){
		if(abindaddr==null){
		    changed = (this.bindaddr!=null);
		    this.bindaddr = null;	    
		}else{
			changed = abindaddr.equals(this.bindaddr);
			this.bindaddr=abindaddr;
		}
	}


	/**
	* getport 
	* 
	**/
	public Integer getPort(){		return  port;
	}
	/**
	*setport 
	*/
	public void setPort(Integer aport){
		if(aport==null){
		    changed = (this.port!=null);
		    this.port = null;	    
		}else{
			changed = aport.equals(this.port);
			this.port=aport;
		}
	}


	/**
	* getfileid 
	* 
	**/
	public String getFileid(){		return  fileid;
	}
	/**
	*setfileid 
	*/
	public void setFileid(String afileid){
		if(afileid==null){
		    changed = (this.fileid!=null);
		    this.fileid = null;	    
		}else{
			changed = afileid.equals(this.fileid);
			this.fileid=afileid;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("generalid=")
		.append(generalid)
		.append(",")
		.append("enabled=")
		.append(enabled)
		.append(",")
		.append("portno=")
		.append(portno)
		.append(",")
		.append("bindaddr=")
		.append(bindaddr)
		.append(",")
		.append("port=")
		.append(port)
		.append(",")
		.append("fileid=")
		.append(fileid)
    			.append("]");

		return sb.toString();		
	}}