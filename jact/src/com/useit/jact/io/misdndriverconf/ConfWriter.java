/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdndriverconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.7 2006/01/12 15:20:12 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class MisdnCardswriteHelper {

        public String cardName_StartToken;

        public String cardName_StopToken;

        public void writecardName(StringBuffer strB, MisdnCards impl) {
            if (impl.getCardName() != null && cardName_StartToken != null) {
                strB.append(cardName_StartToken).append(impl.getCardName())
                        .append(cardName_StopToken);
            }
        }

        public String cardType_StartToken;

        public String cardType_StopToken;

        public void writecardType(StringBuffer strB, MisdnCards impl) {
            if (impl.getCardType() != null && cardType_StartToken != null) {
                strB.append(cardType_StartToken).append(impl.getCardType())
                        .append(cardType_StopToken);
            }
        }

        public String cardOptions_StartToken;

        public String cardOptions_StopToken;

        public void writecardOptions(StringBuffer strB, MisdnCards impl) {
            if (impl.getCardOptions() != null && cardOptions_StartToken != null) {
                strB.append(cardOptions_StartToken).append(
                        impl.getCardOptions()).append(cardOptions_StopToken);
            }
        }
    }; // end of MisdnCardswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class MisdnDriverConfwriteHelper {

        public String poll_StartToken;

        public String poll_StopToken;

        public void writepoll(StringBuffer strB, MisdnDriverConf impl) {
            if (impl.getPoll() != null && poll_StartToken != null) {
                strB.append(poll_StartToken).append(impl.getPoll()).append(
                        poll_StopToken);
            }
        }

        public String pcm_StartToken;

        public String pcm_StopToken;

        public void writepcm(StringBuffer strB, MisdnDriverConf impl) {
            if (impl.getPcm() != null && pcm_StartToken != null) {
                strB.append(pcm_StartToken).append(impl.getPcm()).append(
                        pcm_StopToken);
            }
        }

        public String debug_StartToken;

        public String debug_StopToken;

        public void writedebug(StringBuffer strB, MisdnDriverConf impl) {
            if (impl.getDebug() != null && debug_StartToken != null) {
                strB.append(debug_StartToken).append(impl.getDebug()).append(
                        debug_StopToken);
            }
        }
    }; // end of MisdnDriverConfwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class MisdncardPortswriteHelper {

        public String portN_StartToken;

        public String portN_StopToken;

        public void writeportN(StringBuffer strB, MisdncardPorts impl) {
            if (impl.getPortN() != null && portN_StartToken != null) {
                strB.append(portN_StartToken).append(impl.getPortN()).append(
                        portN_StopToken);
            }
        }

        public String portOption_StartToken;

        public String portOption_StopToken;

        public void writeportOption(StringBuffer strB, MisdncardPorts impl) {
            if (impl.getPortOption() != null && portOption_StartToken != null) {
                strB.append(portOption_StartToken).append(impl.getPortOption())
                        .append(portOption_StopToken);
            }
        }

        public String mPortOption_StartToken;

        public String mPortOption_StopToken;

        public void writemPortOption(StringBuffer strB, MisdncardPorts impl) {
            if (impl.getMPortOption() != null && mPortOption_StartToken != null) {
                strB.append(mPortOption_StartToken).append(
                        impl.getMPortOption()).append(mPortOption_StopToken);
            }
        }
    }; // end of MisdncardPortswriteHelper Declaration

    protected MisdnCardswriteHelper theMisdnCardswriteHelper;

    protected MisdnDriverConfwriteHelper theMisdnDriverConfwriteHelper;

    protected MisdncardPortswriteHelper theMisdncardPortswriteHelper;

    /**
     * 
     */
    public ConfWriter() {
        super();

    }

    /**
     * schreibt die config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String string) {
        File file = new File(string);
        try {
            UseFileHelper.writeStringToFile(file, writetoString(data));
        } catch (FileNotFoundException e) {
            LOGGER.error("writetoFile(Object data = " + data
                    + ", String string = " + string + ")", e);
        } catch (IOException e) {
            LOGGER.error("writetoFile(Object data = " + data
                    + ", String string = " + string + ")", e);
        }

    }

    /**
     * gibt die config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        StringBuffer strb = new StringBuffer();
        writeConf(strb, data);
        return strb.toString();
    }

    /**
     * ruft die entsprechende write methode auf
     * 
     * @param strB
     * @param data
     */
    public void writeConf(StringBuffer strB, Object data) {
        if (data instanceof MisdnCards) {
            writeMisdnCards(strB, (MisdnCards) data);
            return;
        }
        if (data instanceof MisdnDriverConf) {
            writeMisdnDriverConf(strB, (MisdnDriverConf) data);
            return;
        }
        if (data instanceof MisdncardPorts) {
            writeMisdncardPorts(strB, (MisdncardPorts) data);
            return;
        }
    }

    /**
     * schreibt die Felder von MisdnCards
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnCardsFields(StringBuffer strB, MisdnCards impl) {

        // felder schreiben
        theMisdnCardswriteHelper.writecardName(strB, impl);
        theMisdnCardswriteHelper.writecardType(strB, impl);
        theMisdnCardswriteHelper.writecardOptions(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von MisdnCards
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnCardsAggregates(StringBuffer strB, MisdnCards impl) {

        // aggregate schreiben
        // maps schreiben
        // MisdncardPortsMap
        for (Iterator iter = impl.getMisdncardPortsMap().iterator(); iter
                .hasNext();) {
            MisdncardPorts mobj = (MisdncardPorts) iter.next();
            writeMisdncardPorts(strB, mobj);
        }

    }

    /**
     * schreibt ein MisdnCards Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnCards(StringBuffer strB, MisdnCards impl) {
        writeMisdnCardsFields(strB, impl);
        writeMisdnCardsAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von MisdnDriverConf
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnDriverConfFields(StringBuffer strB,
            MisdnDriverConf impl) {

        // felder schreiben
        theMisdnDriverConfwriteHelper.writepoll(strB, impl);
        theMisdnDriverConfwriteHelper.writepcm(strB, impl);
        theMisdnDriverConfwriteHelper.writedebug(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von MisdnDriverConf
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnDriverConfAggregates(StringBuffer strB,
            MisdnDriverConf impl) {

        // aggregate schreiben
        // maps schreiben
        // MisdnCardsMap
        for (Iterator iter = impl.getMisdnCardsMap().iterator(); iter.hasNext();) {
            MisdnCards mobj = (MisdnCards) iter.next();
            writeMisdnCards(strB, mobj);
        }

    }

    /**
     * schreibt ein MisdnDriverConf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnDriverConf(StringBuffer strB, MisdnDriverConf impl) {
        writeMisdnDriverConfFields(strB, impl);
        writeMisdnDriverConfAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von MisdncardPorts
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdncardPortsFields(StringBuffer strB,
            MisdncardPorts impl) {

        // felder schreiben
        theMisdncardPortswriteHelper.writeportN(strB, impl);
        theMisdncardPortswriteHelper.writeportOption(strB, impl);
        theMisdncardPortswriteHelper.writemPortOption(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von MisdncardPorts
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdncardPortsAggregates(StringBuffer strB,
            MisdncardPorts impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein MisdncardPorts Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdncardPorts(StringBuffer strB, MisdncardPorts impl) {
        writeMisdncardPortsFields(strB, impl);
        writeMisdncardPortsAggregates(strB, impl);

    }

    protected void initHelper() {
        theMisdnCardswriteHelper = new MisdnCardswriteHelper();
        theMisdnCardswriteHelper.cardName_StartToken = "cardname=";
        theMisdnCardswriteHelper.cardName_StopToken = "\n";
        theMisdnCardswriteHelper.cardType_StartToken = "cardtype=";
        theMisdnCardswriteHelper.cardType_StopToken = "\n";
        theMisdnCardswriteHelper.cardOptions_StartToken = "cardoptions=";
        theMisdnCardswriteHelper.cardOptions_StopToken = "\n";

        theMisdnDriverConfwriteHelper = new MisdnDriverConfwriteHelper();
        theMisdnDriverConfwriteHelper.poll_StartToken = "poll=";
        theMisdnDriverConfwriteHelper.poll_StopToken = "\n";
        theMisdnDriverConfwriteHelper.pcm_StartToken = "pcm=";
        theMisdnDriverConfwriteHelper.pcm_StopToken = "\n";
        theMisdnDriverConfwriteHelper.debug_StartToken = "debug=";
        theMisdnDriverConfwriteHelper.debug_StopToken = "\n";

        theMisdncardPortswriteHelper = new MisdncardPortswriteHelper();
        theMisdncardPortswriteHelper.portN_StartToken = "portn=";
        theMisdncardPortswriteHelper.portN_StopToken = "\n";
        theMisdncardPortswriteHelper.portOption_StartToken = "portoption=";
        theMisdncardPortswriteHelper.portOption_StopToken = "\n";
        theMisdncardPortswriteHelper.mPortOption_StartToken = "mportoption=";
        theMisdncardPortswriteHelper.mPortOption_StopToken = "\n";

    }

}
