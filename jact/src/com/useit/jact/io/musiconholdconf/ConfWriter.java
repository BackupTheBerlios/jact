/*
 * (c) urs zeidler
 */
package com.useit.jact.io.musiconholdconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.musiconholdconf.MohClasses;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.8 2006/01/12 15:20:12 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class MohClasseswriteHelper {

        public String name_StartToken;

        public String name_StopToken;

        public void writename(StringBuffer strB, MohClasses impl) {
            if (impl.getName() != null && name_StartToken != null) {
                strB.append(name_StartToken).append(impl.getName()).append(
                        name_StopToken);
            }
        }

        public String player_StartToken;

        public String player_StopToken;

        public void writeplayer(StringBuffer strB, MohClasses impl) {
            if (impl.getPlayer() != null && player_StartToken != null) {
                strB.append(player_StartToken).append(impl.getPlayer()).append(
                        player_StopToken);
            }
        }

        public String mohdir_StartToken;

        public String mohdir_StopToken;

        public void writemohdir(StringBuffer strB, MohClasses impl) {
            if (impl.getMohdir() != null && mohdir_StartToken != null) {
                strB.append(mohdir_StartToken).append(impl.getMohdir()).append(
                        mohdir_StopToken);
            }
        }

        public String mohpara_StartToken;

        public String mohpara_StopToken;

        public void writemohpara(StringBuffer strB, MohClasses impl) {
            if (impl.getMohpara() != null && mohpara_StartToken != null) {
                strB.append(mohpara_StartToken).append(impl.getMohpara())
                        .append(mohpara_StopToken);
            }
        }
    }; // end of MohClasseswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class Music_on_HoldConfwriteHelper {

    }; // end of Music_on_HoldConfwriteHelper Declaration

    protected MohClasseswriteHelper theMohClasseswriteHelper;

    protected Music_on_HoldConfwriteHelper theMusic_on_HoldConfwriteHelper;

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
        if (data instanceof MohClasses) {
            writeMohClasses(strB, (MohClasses) data);
            return;
        }
        if (data instanceof Music_on_HoldConf) {
            writeMusic_on_HoldConf(strB, (Music_on_HoldConf) data);
            return;
        }
    }

    /**
     * schreibt die Felder von MohClasses
     * 
     * @param strB
     * @param msec
     */
    protected void writeMohClassesFields(StringBuffer strB, MohClasses impl) {

        // felder schreiben
        theMohClasseswriteHelper.writename(strB, impl);
        theMohClasseswriteHelper.writeplayer(strB, impl);
        theMohClasseswriteHelper.writemohdir(strB, impl);
        theMohClasseswriteHelper.writemohpara(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von MohClasses
     * 
     * @param strB
     * @param msec
     */
    protected void writeMohClassesAggregates(StringBuffer strB, MohClasses impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein MohClasses Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMohClasses(StringBuffer strB, MohClasses impl) {
        writeMohClassesFields(strB, impl);
        writeMohClassesAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Music_on_HoldConf
     * 
     * @param strB
     * @param msec
     */
    protected void writeMusic_on_HoldConfFields(StringBuffer strB,
            Music_on_HoldConf impl) {

        // felder schreiben

    }

    /**
     * schreibt die Aggregierten Objekte von Music_on_HoldConf
     * 
     * @param strB
     * @param msec
     */
    protected void writeMusic_on_HoldConfAggregates(StringBuffer strB,
            Music_on_HoldConf impl) {

        // aggregate schreiben
        // maps schreiben
        // MohClassesMap
        for (Iterator iter = impl.getMohClassesMap().iterator(); iter.hasNext();) {
            MohClasses mobj = (MohClasses) iter.next();
            writeMohClasses(strB, mobj);
        }

    }

    /**
     * schreibt ein Music_on_HoldConf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMusic_on_HoldConf(StringBuffer strB,
            Music_on_HoldConf impl) {
        writeMusic_on_HoldConfFields(strB, impl);
        writeMusic_on_HoldConfAggregates(strB, impl);

    }

    protected void initHelper() {
        theMohClasseswriteHelper = new MohClasseswriteHelper();
        theMohClasseswriteHelper.name_StartToken = "name=";
        theMohClasseswriteHelper.name_StopToken = "\n";
        theMohClasseswriteHelper.player_StartToken = "player=";
        theMohClasseswriteHelper.player_StopToken = "\n";
        theMohClasseswriteHelper.mohdir_StartToken = "mohdir=";
        theMohClasseswriteHelper.mohdir_StopToken = "\n";
        theMohClasseswriteHelper.mohpara_StartToken = "mohpara=";
        theMohClasseswriteHelper.mohpara_StopToken = "\n";

        theMusic_on_HoldConfwriteHelper = new Music_on_HoldConfwriteHelper();

    }

}
