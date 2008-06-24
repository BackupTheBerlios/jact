package com.useit.jact.model.channelconfig;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdnDriverConfImpl;
import com.useit.jact.model.zapataconf.Zapataconf;
import com.useit.jact.model.zapataconf.ZapataconfImpl;

/**
 * <p>
 * HardwareConf<br>
 * 
 * </p>
 * Created : Sun Dec 25 18:50:56 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: HardwareConf.java,v 1.2 2005/12/29 19:14:23
 *          urs Exp $
 */
public class HardwareConf extends AbstractSimpleDataClass {
    // --------------- Konstruktor ---------------------
    /**
     * einfacher Konstruktor für HardwareConf
     */
    public HardwareConf() {
        super();

    }

    /**
     * Übernimmt alle Werte aus dem übergebenen object, werden nur als
     * referenzen Kopiert, also aufpaassen beim ändern der daten
     * 
     * @param object
     */
    public void assignTo(HardwareConf object) {

    }

    // -------------- map Funktionen

    // -------------- Aggregat Funktionen
    // ------ 1-1 aggregates
    protected MisdnDriverConf fMisdnDriverConf = new MisdnDriverConfImpl();

    /**
     * @return
     */
    public MisdnDriverConf getMisdnDriverConf() {
        return fMisdnDriverConf;
    }

    /**
     * setzt den MisdnDriverConf und die MisdnDriverConfid
     * 
     * @param MisdnDriverConf
     */
    public void setMisdnDriverConf(MisdnDriverConf aMisdnDriverConf) {
        if (aMisdnDriverConf != null) {
            fMisdnDriverConf = aMisdnDriverConf;
            // misdndriver = aMisdnDriverConf.get();
        } // end of if

    }

    protected Zapataconf fZapataconf = new ZapataconfImpl();

    /**
     * @return
     */
    public Zapataconf getZapataconf() {
        return fZapataconf;
    }

    /**
     * setzt den Zapataconf und die Zapataconfid
     * 
     * @param Zapataconf
     */
    public void setZapataconf(Zapataconf aZapataconf) {
        if (aZapataconf != null) {
            fZapataconf = aZapataconf;
            // zapataconf = aZapataconf.get();
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