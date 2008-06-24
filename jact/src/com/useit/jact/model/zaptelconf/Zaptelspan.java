package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Zaptelspan<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Zaptelspan.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Zaptelspan extends AbstractSimpleDataClass implements IZaptelspan{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Zaptelspan
	**/
	public Zaptelspan(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Zaptelspan
	**/
	public Zaptelspan( Integer aspan_num, Integer atiming, Integer albo, String aframing, String acoding, String ayellow){
		super();
	
		this.span_num = aspan_num;	
		this.timing = atiming;	
		this.lbo = albo;	
		this.framing = aframing;	
		this.coding = acoding;	
		this.yellow = ayellow;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Zaptelspan object){
		this.span_num = object.span_num;	
		this.timing = object.timing;	
		this.lbo = object.lbo;	
		this.framing = object.framing;	
		this.coding = object.coding;	
		this.yellow = object.yellow;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected Integer span_num;
	public static final String VALUEID_SPAN_NUM="span_num" ;

    /**  The timing parameter determines the selection of primary, secondary, and so on sync sources.  If this span should be considered a primary sync source, then give it a value of "1".  For a secondary, use "2", and so on. To not use this as a sync source, just use "0"  **/
	protected Integer timing;
	public static final String VALUEID_TIMING="timing" ;

    /**  The line build-out (or LBO) is an integer, from the following table: 0: 0 db (CSU) / 0-133 feet (DSX-1) 1: 133-266 feet (DSX-1) 2: 266-399 feet (DSX-1) 3: 399-533 feet (DSX-1) 4: 533-655 feet (DSX-1) 5: -7.5db (CSU) 6: -15db (CSU) 7: -22.5db (CSU)  **/
	protected Integer lbo;
	public static final String VALUEID_LBO="lbo" ;

    /**  The framing is one of "d4" or "esf" for T1 or "cas" or "ccs" for E1  Note: "d4" could be referred to as "sf" or "superframe"  **/
	protected String framing;
	public static final String VALUEID_FRAMING="framing" ;

    /**  The coding is one of "ami" or "b8zs" for T1 or "ami" or "hdb3" for E1 E1's may have the additional keyword "crc4" to enable CRC4 checking **/
	protected String coding;
	public static final String VALUEID_CODING="coding" ;

    /**  If the keyword "yellow" follows, yellow alarm is transmitted when no channels are open. **/
	protected String yellow;
	public static final String VALUEID_YELLOW="yellow" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_SPAN_NUM.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMING.equals(valueid)){
			return true;
		}
		if(VALUEID_LBO.equals(valueid)){
			return true;
		}
		if(VALUEID_FRAMING.equals(valueid)){
			return true;
		}
		if(VALUEID_CODING.equals(valueid)){
			return true;
		}
		if(VALUEID_YELLOW.equals(valueid)){
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
		if(VALUEID_SPAN_NUM.equals(valueid)){
			if(data instanceof String){
		        setSpan_num(new Integer((String)data));
		        return;
		    }
			setSpan_num((Integer)data);
			return;
		}
		if(VALUEID_TIMING.equals(valueid)){
			if(data instanceof String){
		        setTiming(new Integer((String)data));
		        return;
		    }
			setTiming((Integer)data);
			return;
		}
		if(VALUEID_LBO.equals(valueid)){
			if(data instanceof String){
		        setLbo(new Integer((String)data));
		        return;
		    }
			setLbo((Integer)data);
			return;
		}
		if(VALUEID_FRAMING.equals(valueid)){
			setFraming((String)data);
			return;
		}
		if(VALUEID_CODING.equals(valueid)){
			setCoding((String)data);
			return;
		}
		if(VALUEID_YELLOW.equals(valueid)){
			setYellow((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_SPAN_NUM.equals(valueid)){
			return getSpan_num();
			
		}
		if(VALUEID_TIMING.equals(valueid)){
			return getTiming();
			
		}
		if(VALUEID_LBO.equals(valueid)){
			return getLbo();
			
		}
		if(VALUEID_FRAMING.equals(valueid)){
			return getFraming();
			
		}
		if(VALUEID_CODING.equals(valueid)){
			return getCoding();
			
		}
		if(VALUEID_YELLOW.equals(valueid)){
			return getYellow();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getspan_num 
	* 
	**/
	public Integer getSpan_num(){		return  span_num;
	}
	/**
	*setspan_num 
	*/
	public void setSpan_num(Integer aspan_num){
		if(aspan_num==null){
		    changed = (this.span_num!=null);
		    this.span_num = null;	    
		}else{
			changed = aspan_num.equals(this.span_num);
			this.span_num=aspan_num;
		}
	}


	/**
	* gettiming 
	* The timing parameter determines the selection of primary, secondary, and so on sync sources.  If this span should be considered a primary sync source, then give it a value of "1".  For a secondary, use "2", and so on. To not use this as a sync source, just use "0" 
	**/
	public Integer getTiming(){		return  timing;
	}
	/**
	*settiming 
	*/
	public void setTiming(Integer atiming){
		if(atiming==null){
		    changed = (this.timing!=null);
		    this.timing = null;	    
		}else{
			changed = atiming.equals(this.timing);
			this.timing=atiming;
		}
	}


	/**
	* getlbo 
	* The line build-out (or LBO) is an integer, from the following table: 0: 0 db (CSU) / 0-133 feet (DSX-1) 1: 133-266 feet (DSX-1) 2: 266-399 feet (DSX-1) 3: 399-533 feet (DSX-1) 4: 533-655 feet (DSX-1) 5: -7.5db (CSU) 6: -15db (CSU) 7: -22.5db (CSU) 
	**/
	public Integer getLbo(){		return  lbo;
	}
	/**
	*setlbo 
	*/
	public void setLbo(Integer albo){
		if(albo==null){
		    changed = (this.lbo!=null);
		    this.lbo = null;	    
		}else{
			changed = albo.equals(this.lbo);
			this.lbo=albo;
		}
	}


	/**
	* getframing 
	* The framing is one of "d4" or "esf" for T1 or "cas" or "ccs" for E1  Note: "d4" could be referred to as "sf" or "superframe" 
	**/
	public String getFraming(){		return  framing;
	}
	/**
	*setframing 
	*/
	public void setFraming(String aframing){
		if(aframing==null){
		    changed = (this.framing!=null);
		    this.framing = null;	    
		}else{
			changed = aframing.equals(this.framing);
			this.framing=aframing;
		}
	}


	/**
	* getcoding 
	* The coding is one of "ami" or "b8zs" for T1 or "ami" or "hdb3" for E1 E1's may have the additional keyword "crc4" to enable CRC4 checking
	**/
	public String getCoding(){		return  coding;
	}
	/**
	*setcoding 
	*/
	public void setCoding(String acoding){
		if(acoding==null){
		    changed = (this.coding!=null);
		    this.coding = null;	    
		}else{
			changed = acoding.equals(this.coding);
			this.coding=acoding;
		}
	}


	/**
	* getyellow 
	* If the keyword "yellow" follows, yellow alarm is transmitted when no channels are open.
	**/
	public String getYellow(){		return  yellow;
	}
	/**
	*setyellow 
	*/
	public void setYellow(String ayellow){
		if(ayellow==null){
		    changed = (this.yellow!=null);
		    this.yellow = null;	    
		}else{
			changed = ayellow.equals(this.yellow);
			this.yellow=ayellow;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("span_num=")
		.append(span_num)
		.append(",")
		.append("timing=")
		.append(timing)
		.append(",")
		.append("lbo=")
		.append(lbo)
		.append(",")
		.append("framing=")
		.append(framing)
		.append(",")
		.append("coding=")
		.append(coding)
		.append(",")
		.append("yellow=")
		.append(yellow)
    			.append("]");

		return sb.toString();		
	}}