package com.useit.jact.model.misdndriverconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.MCardOptionSet;
import com.useit.jact.model.types.MisdnCardTypes;


/**
 * <p>
 * MisdnCards<br>
 * 
 * </p>
 * Created : Fri May 26 14:31:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCards.java,v 1.1 2008/06/24 20:45:01 urszeidler Exp $
 */
 public  class MisdnCards extends AbstractSimpleDataClass implements IMisdnCards{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MisdnCards
	**/
	public MisdnCards(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MisdnCards
	**/
	public MisdnCards( String acardName, MisdnCardTypes acardType, MCardOptionSet acardOptions){
		super();
	
		this.cardName = acardName;	
		this.cardType = acardType;	
		this.cardOptions = acardOptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MisdnCards object){
		this.cardName = object.cardName;	
		this.cardType = object.cardType;	
		this.cardOptions = object.cardOptions;	

	}
//--------------  map Funktionen
	//public static final String MISDNCARDPORTSMAP = "misdncardPortsMap";
	/** die typisierte List die die Aggregierten objekte(MisdncardPortsImpl) enthält */
	protected List<MisdncardPorts> misdncardPortsMap = new ArrayList<MisdncardPorts>();
	/** die typisierte Map die die Aggregierten objekte(MisdncardPortsImpl) enthält */
	//protected MisdncardPortsMap misdncardPortsMapMap = new MisdncardPortsMap();

	/**
	 * fügt ein MisdncardPorts Objekt zu der Mapp hinzu
	 * @param aMisdncardPorts
	 */
	public boolean addMisdncardPorts(MisdncardPorts aMisdncardPorts){
		return misdncardPortsMap.add(aMisdncardPorts);
	}

	/**
	 * removed ein MisdncardPorts Objekt aus der Map
	 * @param aMisdncardPorts
	 */
	public boolean removeMisdncardPorts(MisdncardPorts aMisdncardPorts){
		return misdncardPortsMap.remove(aMisdncardPorts);
	}

	

/**
 * gibt die List<MisdncardPorts> misdncardPortsMap zurück	
 * @return List<MisdncardPorts>
 * @see  IMisdnCards#getMisdncardPortsMap
 */
public List<MisdncardPorts> getMisdncardPortsMap() {
	return misdncardPortsMap;
}
/**
 * setzt die Map MisdncardPortsMap
 * @param map misdncardPortsMapMap
 */
 @SuppressWarnings("unchecked")
public void setMisdncardPortsMap(List aList){
    misdncardPortsMap = aList;
   // misdncardPortsMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String cardName;
	public static final String VALUEID_CARDNAME="cardname" ;

    /**   **/
	protected MisdnCardTypes cardType;
	public static final String VALUEID_CARDTYPE="cardtype" ;

    /**   **/
	protected MCardOptionSet cardOptions;
	public static final String VALUEID_CARDOPTIONS="cardoptions" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CARDNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_CARDTYPE.equals(valueid)){
			return true;
		}
		if(VALUEID_CARDOPTIONS.equals(valueid)){
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
		if(VALUEID_CARDNAME.equals(valueid)){
			setCardName((String)data);
			return;
		}
		if(VALUEID_CARDTYPE.equals(valueid)){
			if(data instanceof String){
		        setCardType(new MisdnCardTypes((String)data));
		        return;
		    }
			setCardType((MisdnCardTypes)data);
			return;
		}
		if(VALUEID_CARDOPTIONS.equals(valueid)){
			if(data instanceof String){
		        setCardOptions(new MCardOptionSet((String)data));
		        return;
		    }
			setCardOptions((MCardOptionSet)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CARDNAME.equals(valueid)){
			return getCardName();
			
		}
		if(VALUEID_CARDTYPE.equals(valueid)){
			return getCardType();
			
		}
		if(VALUEID_CARDOPTIONS.equals(valueid)){
			return getCardOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcardName 
	* 
	**/
	public String getCardName(){		return  cardName;
	}
	/**
	*setcardName 
	*/
	public void setCardName(String acardName){
		if(acardName==null){
		    changed = (this.cardName!=null);
		    this.cardName = null;	    
		}else{
			changed = acardName.equals(this.cardName);
			this.cardName=acardName;
		}
	}


	/**
	* getcardType 
	* 
	**/
	public MisdnCardTypes getCardType(){		return  cardType;
	}
	/**
	*setcardType 
	*/
	public void setCardType(MisdnCardTypes acardType){
		if(acardType==null){
		    changed = (this.cardType!=null);
		    this.cardType = null;	    
		}else{
			changed = acardType.equals(this.cardType);
			this.cardType=acardType;
		}
	}


	/**
	* getcardOptions 
	* 
	**/
	public MCardOptionSet getCardOptions(){		return  cardOptions;
	}
	/**
	*setcardOptions 
	*/
	public void setCardOptions(MCardOptionSet acardOptions){
		if(acardOptions==null){
		    changed = (this.cardOptions!=null);
		    this.cardOptions = null;	    
		}else{
			changed = acardOptions.equals(this.cardOptions);
			this.cardOptions=acardOptions;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("cardName=")
		.append(cardName)
		.append(",")
		.append("cardType=")
		.append(cardType)
		.append(",")
		.append("cardOptions=")
		.append(cardOptions)
    			.append("]");

		return sb.toString();		
	}}