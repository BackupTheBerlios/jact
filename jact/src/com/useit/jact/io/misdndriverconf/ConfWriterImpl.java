/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdndriverconf;

import org.apache.log4j.Logger;

import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.2 2006/01/03 13:37:51
 *          urs Exp $
 */
public class ConfWriterImpl extends ConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriterImpl.class);

    /**
     * 
     */
    public ConfWriterImpl() {
        super();
        // TODO: die tokens anpassen

        theMisdnCardswriteHelper = new MisdnCardswriteHelper();

        theMisdnDriverConfwriteHelper = new MisdnDriverConfwriteHelper();
        // theMisdnDriverConfwriteHelper.fileid_StartToken="fileid=";
        // theMisdnDriverConfwriteHelper.fileid_StopToken="\n";
        theMisdnDriverConfwriteHelper.poll_StartToken = "poll=";
        theMisdnDriverConfwriteHelper.poll_StopToken = "\n";
        theMisdnDriverConfwriteHelper.pcm_StartToken = "pcm=";
        theMisdnDriverConfwriteHelper.pcm_StopToken = "\n";
        theMisdnDriverConfwriteHelper.debug_StartToken = "debug=";
        theMisdnDriverConfwriteHelper.debug_StopToken = "\n";

        theMisdncardPortswriteHelper = new MisdncardPortswriteHelper();

    }

    /**
     * schreibt ein MisdnCards Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnCards(StringBuffer strB, MisdnCards impl) {
        super.writeMisdnCards(strB, impl);

    }

    /**
     * schreibt ein MisdnDriverConf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnDriverConf(StringBuffer strB, MisdnDriverConf impl) {
        super.writeMisdnDriverConf(strB, impl);

    }

    /**
     * schreibt ein MisdncardPorts Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdncardPorts(StringBuffer strB, MisdncardPorts impl) {
        super.writeMisdncardPorts(strB, impl);

    }

    // /**
    // * schreibt die config als datei
    // * @param data
    // * @param string
    // * @throws IOException
    // * @throws FileNotFoundException
    // */
    // public void writetoFile(Object data, String string){
    // File file = new File(string);
    // try {
    // UseFileHelper.writeStringToFile(file, writetoString(data));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("writetoFile(Object data = " + data
    // + ", String string = " + string + ")", e);
    // } catch (IOException e) {
    // LOGGER.error("writetoFile(Object data = " + data
    // + ", String string = " + string + ")", e);
    // }
    //        
    // }
    //
    // /**
    // * gibt die config als string zurück
    // * @param data
    // */
    // public String writetoString(Object data) {
    // StringBuffer strb= new StringBuffer();
    // // TODO writetoString(Object data) implementieren
    //        
    // return strb.toString();
    // }

}
