package com.useit.jact.model.channelconfig;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.IaxgeneralImpl;
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.SipConfImpl;

/**
 * <p>
 * VoipChannelConfig<br>
 * 
 * </p>
 * Created : Sun Dec 25 18:50:56 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoipChannelConfig.java,v 1.2 2005/12/29
 *          19:14:23 urs Exp $
 */
public class VoipChannelConfig extends AbstractSimpleDataClass {
    // --------------- Konstruktor ---------------------
    /**
     * einfacher Konstruktor für VoipChannelConfig
     */
    public VoipChannelConfig() {
        super();

    }

    /**
     * Übernimmt alle Werte aus dem übergebenen object, werden nur als
     * referenzen Kopiert, also aufpaassen beim ändern der daten
     * 
     * @param object
     */
    public void assignTo(VoipChannelConfig object) {

    }

    // -------------- map Funktionen

    // -------------- Aggregat Funktionen
    // ------ 1-1 aggregates
    protected Iaxgeneral fIaxgeneral = new IaxgeneralImpl();

    /**
     * @return
     */
    public Iaxgeneral getIaxgeneral() {
        return fIaxgeneral;
    }

    /**
     * setzt den Iaxgeneral und die Iaxgeneralid
     * 
     * @param Iaxgeneral
     */
    public void setIaxgeneral(Iaxgeneral aIaxgeneral) {
        if (aIaxgeneral != null) {
            fIaxgeneral = aIaxgeneral;
            // iaxconf = aIaxgeneral.get();
        } // end of if

    }

    protected SipConf fSipConf = new SipConfImpl();

    /**
     * @return
     */
    public SipConf getSipConf() {
        return fSipConf;
    }

    /**
     * setzt den SipConf und die SipConfid
     * 
     * @param SipConf
     */
    public void setSipConf(SipConf aSipConf) {
        if (aSipConf != null) {
            fSipConf = aSipConf;
            // sipconf = aSipConf.get();
        } // end of if

    }

    // -------------- loadsavedelete Methoden
    // -------------- getter und setter und felder

    /**
     * überprüft ob es das value in dem Objekt gibt
     * 
     * @param valueid
     * @return
     */
    public static boolean hasValue(String valueid) {
        return false;
    }

    /**
     * setzt einen Wert per valueid
     * 
     * @param valueid
     * @param data
     */
    public void setByValue(String valueid, Object data) {
    }

    /**
     * gibt einen Wert by Vauleid zurück
     * 
     * @param valueid
     * @return
     */
    public Object getByValue(String valueid) {

        return null;
    }

    // --------- getter und setter

    /**
     * eine einfache to string methode die nur die Felder anzeigt.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[").append("]");

        return sb.toString();
    }
}