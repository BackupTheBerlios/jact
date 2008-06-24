/*
 * (c) urs zeidler
 */
package com.useit.jact.io.indicationsconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.ToneDefinitions;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.8 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class ToneDefinitionswriteHelper {

        public String countrycode_StartToken;

        public String countrycode_StopToken;

        public void writecountrycode(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getCountrycode() != null && countrycode_StartToken != null) {
                strB.append(countrycode_StartToken).append(
                        impl.getCountrycode()).append(countrycode_StopToken);
            }
        }

        public String description_StartToken;

        public String description_StopToken;

        public void writedescription(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getDescription() != null && description_StartToken != null) {
                strB.append(description_StartToken).append(
                        impl.getDescription()).append(description_StopToken);
            }
        }

        public String alias_StartToken;

        public String alias_StopToken;

        public void writealias(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getAlias() != null && alias_StartToken != null) {
                strB.append(alias_StartToken).append(impl.getAlias()).append(
                        alias_StopToken);
            }
        }

        public String ringcadence_StartToken;

        public String ringcadence_StopToken;

        public void writeringcadence(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getRingcadence() != null && ringcadence_StartToken != null) {
                strB.append(ringcadence_StartToken).append(
                        impl.getRingcadence()).append(ringcadence_StopToken);
            }
        }

        public String dial_StartToken;

        public String dial_StopToken;

        public void writedial(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getDial() != null && dial_StartToken != null) {
                strB.append(dial_StartToken).append(impl.getDial()).append(
                        dial_StopToken);
            }
        }

        public String busy_StartToken;

        public String busy_StopToken;

        public void writebusy(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getBusy() != null && busy_StartToken != null) {
                strB.append(busy_StartToken).append(impl.getBusy()).append(
                        busy_StopToken);
            }
        }

        public String ring_StartToken;

        public String ring_StopToken;

        public void writering(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getRing() != null && ring_StartToken != null) {
                strB.append(ring_StartToken).append(impl.getRing()).append(
                        ring_StopToken);
            }
        }

        public String congestion_StartToken;

        public String congestion_StopToken;

        public void writecongestion(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getCongestion() != null && congestion_StartToken != null) {
                strB.append(congestion_StartToken).append(impl.getCongestion())
                        .append(congestion_StopToken);
            }
        }

        public String callwaiting_StartToken;

        public String callwaiting_StopToken;

        public void writecallwaiting(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getCallwaiting() != null && callwaiting_StartToken != null) {
                strB.append(callwaiting_StartToken).append(
                        impl.getCallwaiting()).append(callwaiting_StopToken);
            }
        }

        public String dialrecall_StartToken;

        public String dialrecall_StopToken;

        public void writedialrecall(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getDialrecall() != null && dialrecall_StartToken != null) {
                strB.append(dialrecall_StartToken).append(impl.getDialrecall())
                        .append(dialrecall_StopToken);
            }
        }

        public String record_StartToken;

        public String record_StopToken;

        public void writerecord(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getRecord() != null && record_StartToken != null) {
                strB.append(record_StartToken).append(impl.getRecord()).append(
                        record_StopToken);
            }
        }

        public String info_StartToken;

        public String info_StopToken;

        public void writeinfo(StringBuffer strB, ToneDefinitions impl) {
            if (impl.getInfo() != null && info_StartToken != null) {
                strB.append(info_StartToken).append(impl.getInfo()).append(
                        info_StopToken);
            }
        }
    }; // end of ToneDefinitionswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class IndicationsconfwriteHelper {

        public String country_StartToken;

        public String country_StopToken;

        public void writecountry(StringBuffer strB, Indicationsconf impl) {
            if (impl.getCountry() != null && country_StartToken != null) {
                strB.append(country_StartToken).append(impl.getCountry())
                        .append(country_StopToken);
            }
        }
    }; // end of IndicationsconfwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class CustomTonewriteHelper {

        public String tonecode_StartToken;

        public String tonecode_StopToken;

        public void writetonecode(StringBuffer strB, CustomTone impl) {
            if (impl.getTonecode() != null && tonecode_StartToken != null) {
                strB.append(tonecode_StartToken).append(impl.getTonecode())
                        .append(tonecode_StopToken);
            }
        }

        public String name_StartToken;

        public String name_StopToken;

        public void writename(StringBuffer strB, CustomTone impl) {
            if (impl.getName() != null && name_StartToken != null) {
                strB.append(name_StartToken).append(impl.getName()).append(
                        name_StopToken);
            }
        }
    }; // end of CustomTonewriteHelper Declaration

    protected ToneDefinitionswriteHelper theToneDefinitionswriteHelper;

    protected IndicationsconfwriteHelper theIndicationsconfwriteHelper;

    protected CustomTonewriteHelper theCustomTonewriteHelper;

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
        if (data instanceof ToneDefinitions) {
            writeToneDefinitions(strB, (ToneDefinitions) data);
            return;
        }
        if (data instanceof Indicationsconf) {
            writeIndicationsconf(strB, (Indicationsconf) data);
            return;
        }
        if (data instanceof CustomTone) {
            writeCustomTone(strB, (CustomTone) data);
            return;
        }
    }

    /**
     * schreibt die Felder von ToneDefinitions
     * 
     * @param strB
     * @param msec
     */
    protected void writeToneDefinitionsFields(StringBuffer strB,
            ToneDefinitions impl) {

        // felder schreiben
        theToneDefinitionswriteHelper.writecountrycode(strB, impl);
        theToneDefinitionswriteHelper.writedescription(strB, impl);
        theToneDefinitionswriteHelper.writealias(strB, impl);
        theToneDefinitionswriteHelper.writeringcadence(strB, impl);
        theToneDefinitionswriteHelper.writedial(strB, impl);
        theToneDefinitionswriteHelper.writebusy(strB, impl);
        theToneDefinitionswriteHelper.writering(strB, impl);
        theToneDefinitionswriteHelper.writecongestion(strB, impl);
        theToneDefinitionswriteHelper.writecallwaiting(strB, impl);
        theToneDefinitionswriteHelper.writedialrecall(strB, impl);
        theToneDefinitionswriteHelper.writerecord(strB, impl);
        theToneDefinitionswriteHelper.writeinfo(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von ToneDefinitions
     * 
     * @param strB
     * @param msec
     */
    protected void writeToneDefinitionsAggregates(StringBuffer strB,
            ToneDefinitions impl) {

        // aggregate schreiben
        // maps schreiben
        // CustomToneMap
        for (Iterator iter = impl.getCustomToneMap().iterator(); iter.hasNext();) {
            CustomTone mobj = (CustomTone) iter.next();
            writeCustomTone(strB, mobj);
        }

    }

    /**
     * schreibt ein ToneDefinitions Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeToneDefinitions(StringBuffer strB, ToneDefinitions impl) {
        writeToneDefinitionsFields(strB, impl);
        writeToneDefinitionsAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Indicationsconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeIndicationsconfFields(StringBuffer strB,
            Indicationsconf impl) {

        // felder schreiben
        theIndicationsconfwriteHelper.writecountry(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Indicationsconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeIndicationsconfAggregates(StringBuffer strB,
            Indicationsconf impl) {

        // aggregate schreiben
        // maps schreiben
        // ToneDefinitionsMap
        for (Iterator iter = impl.getToneDefinitionsMap().iterator(); iter
                .hasNext();) {
            ToneDefinitions mobj = (ToneDefinitions) iter.next();
            writeToneDefinitions(strB, mobj);
        }

    }

    /**
     * schreibt ein Indicationsconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIndicationsconf(StringBuffer strB, Indicationsconf impl) {
        writeIndicationsconfFields(strB, impl);
        writeIndicationsconfAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von CustomTone
     * 
     * @param strB
     * @param msec
     */
    protected void writeCustomToneFields(StringBuffer strB, CustomTone impl) {

        // felder schreiben
        theCustomTonewriteHelper.writetonecode(strB, impl);
        theCustomTonewriteHelper.writename(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von CustomTone
     * 
     * @param strB
     * @param msec
     */
    protected void writeCustomToneAggregates(StringBuffer strB, CustomTone impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein CustomTone Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeCustomTone(StringBuffer strB, CustomTone impl) {
        writeCustomToneFields(strB, impl);
        writeCustomToneAggregates(strB, impl);

    }

    protected void initHelper() {
        theToneDefinitionswriteHelper = new ToneDefinitionswriteHelper();
        theToneDefinitionswriteHelper.countrycode_StartToken = "countrycode=";
        theToneDefinitionswriteHelper.countrycode_StopToken = "\n";
        theToneDefinitionswriteHelper.description_StartToken = "description=";
        theToneDefinitionswriteHelper.description_StopToken = "\n";
        theToneDefinitionswriteHelper.alias_StartToken = "alias=";
        theToneDefinitionswriteHelper.alias_StopToken = "\n";
        theToneDefinitionswriteHelper.ringcadence_StartToken = "ringcadence=";
        theToneDefinitionswriteHelper.ringcadence_StopToken = "\n";
        theToneDefinitionswriteHelper.dial_StartToken = "dial=";
        theToneDefinitionswriteHelper.dial_StopToken = "\n";
        theToneDefinitionswriteHelper.busy_StartToken = "busy=";
        theToneDefinitionswriteHelper.busy_StopToken = "\n";
        theToneDefinitionswriteHelper.ring_StartToken = "ring=";
        theToneDefinitionswriteHelper.ring_StopToken = "\n";
        theToneDefinitionswriteHelper.congestion_StartToken = "congestion=";
        theToneDefinitionswriteHelper.congestion_StopToken = "\n";
        theToneDefinitionswriteHelper.callwaiting_StartToken = "callwaiting=";
        theToneDefinitionswriteHelper.callwaiting_StopToken = "\n";
        theToneDefinitionswriteHelper.dialrecall_StartToken = "dialrecall=";
        theToneDefinitionswriteHelper.dialrecall_StopToken = "\n";
        theToneDefinitionswriteHelper.record_StartToken = "record=";
        theToneDefinitionswriteHelper.record_StopToken = "\n";
        theToneDefinitionswriteHelper.info_StartToken = "info=";
        theToneDefinitionswriteHelper.info_StopToken = "\n";

        theIndicationsconfwriteHelper = new IndicationsconfwriteHelper();
        theIndicationsconfwriteHelper.country_StartToken = "country=";
        theIndicationsconfwriteHelper.country_StopToken = "\n";

        theCustomTonewriteHelper = new CustomTonewriteHelper();
        theCustomTonewriteHelper.tonecode_StartToken = "tonecode=";
        theCustomTonewriteHelper.tonecode_StopToken = "\n";
        theCustomTonewriteHelper.name_StartToken = "name=";
        theCustomTonewriteHelper.name_StopToken = "\n";

    }

}
