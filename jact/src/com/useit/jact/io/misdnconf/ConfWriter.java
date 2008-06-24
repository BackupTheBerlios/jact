/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdnconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.misdnconf.MisdnCryptkey;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.Misdnconf;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.12 2006/01/12 15:20:11
 *          urs Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class MisdnCryptkeywriteHelper {

        public String keyname_StartToken;

        public String keyname_StopToken;

        public void writekeyname(StringBuffer strB, MisdnCryptkey impl) {
            if (impl.getKeyname() != null && keyname_StartToken != null) {
                strB.append(keyname_StartToken).append(impl.getKeyname())
                        .append(keyname_StopToken);
            }
        }

        public String keyvalue_StartToken;

        public String keyvalue_StopToken;

        public void writekeyvalue(StringBuffer strB, MisdnCryptkey impl) {
            if (impl.getKeyvalue() != null && keyvalue_StartToken != null) {
                strB.append(keyvalue_StartToken).append(impl.getKeyvalue())
                        .append(keyvalue_StopToken);
            }
        }
    }; // end of MisdnCryptkeywriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class MisdnPortswriteHelper {

        public String portN_StartToken;

        public String portN_StopToken;

        public void writeportN(StringBuffer strB, MisdnPorts impl) {
            if (impl.getPortN() != null && portN_StartToken != null) {
                strB.append(portN_StartToken).append(impl.getPortN()).append(
                        portN_StopToken);
            }
        }

        public String portOption_StartToken;

        public String portOption_StopToken;

        public void writeportOption(StringBuffer strB, MisdnPorts impl) {
            if (impl.getPortOption() != null && portOption_StartToken != null) {
                strB.append(portOption_StartToken).append(impl.getPortOption())
                        .append(portOption_StopToken);
            }
        }
    }; // end of MisdnPortswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class MisdnSectionswriteHelper {

        public String context_StartToken;

        public String context_StopToken;

        public void writecontext(StringBuffer strB, MisdnSections impl) {
            if (impl.getContext() != null && context_StartToken != null) {
                strB.append(context_StartToken).append(impl.getContext())
                        .append(context_StopToken);
            }
        }

        public String language_StartToken;

        public String language_StopToken;

        public void writelanguage(StringBuffer strB, MisdnSections impl) {
            if (impl.getLanguage() != null && language_StartToken != null) {
                strB.append(language_StartToken).append(impl.getLanguage())
                        .append(language_StopToken);
            }
        }

        public String nationalprefix_StartToken;

        public String nationalprefix_StopToken;

        public void writenationalprefix(StringBuffer strB, MisdnSections impl) {
            if (impl.getNationalprefix() != null
                    && nationalprefix_StartToken != null) {
                strB.append(nationalprefix_StartToken).append(
                        impl.getNationalprefix()).append(
                        nationalprefix_StopToken);
            }
        }

        public String internationalprefix_StartToken;

        public String internationalprefix_StopToken;

        public void writeinternationalprefix(StringBuffer strB,
                MisdnSections impl) {
            if (impl.getInternationalprefix() != null
                    && internationalprefix_StartToken != null) {
                strB.append(internationalprefix_StartToken).append(
                        impl.getInternationalprefix()).append(
                        internationalprefix_StopToken);
            }
        }

        public String rxgain_StartToken;

        public String rxgain_StopToken;

        public void writerxgain(StringBuffer strB, MisdnSections impl) {
            if (impl.getRxgain() != null && rxgain_StartToken != null) {
                strB.append(rxgain_StartToken).append(impl.getRxgain()).append(
                        rxgain_StopToken);
            }
        }

        public String txgain_StartToken;

        public String txgain_StopToken;

        public void writetxgain(StringBuffer strB, MisdnSections impl) {
            if (impl.getTxgain() != null && txgain_StartToken != null) {
                strB.append(txgain_StartToken).append(impl.getTxgain()).append(
                        txgain_StopToken);
            }
        }

        public String te_choose_channel_StartToken;

        public String te_choose_channel_StopToken;

        public void writete_choose_channel(StringBuffer strB, MisdnSections impl) {
            if (impl.getTe_choose_channel() != null
                    && te_choose_channel_StartToken != null) {
                strB.append(te_choose_channel_StartToken).append(
                        impl.getTe_choose_channel()).append(
                        te_choose_channel_StopToken);
            }
        }

        public String early_bconnect_StartToken;

        public String early_bconnect_StopToken;

        public void writeearly_bconnect(StringBuffer strB, MisdnSections impl) {
            if (impl.getEarly_bconnect() != null
                    && early_bconnect_StartToken != null) {
                strB.append(early_bconnect_StartToken).append(
                        impl.getEarly_bconnect()).append(
                        early_bconnect_StopToken);
            }
        }

        public String dialplan_StartToken;

        public String dialplan_StopToken;

        public void writedialplan(StringBuffer strB, MisdnSections impl) {
            if (impl.getDialplan() != null && dialplan_StartToken != null) {
                strB.append(dialplan_StartToken).append(impl.getDialplan())
                        .append(dialplan_StopToken);
            }
        }

        public String use_callingpres_StartToken;

        public String use_callingpres_StopToken;

        public void writeuse_callingpres(StringBuffer strB, MisdnSections impl) {
            if (impl.getUse_callingpres() != null
                    && use_callingpres_StartToken != null) {
                strB.append(use_callingpres_StartToken).append(
                        impl.getUse_callingpres()).append(
                        use_callingpres_StopToken);
            }
        }

        public String always_immediate_StartToken;

        public String always_immediate_StopToken;

        public void writealways_immediate(StringBuffer strB, MisdnSections impl) {
            if (impl.getAlways_immediate() != null
                    && always_immediate_StartToken != null) {
                strB.append(always_immediate_StartToken).append(
                        impl.getAlways_immediate()).append(
                        always_immediate_StopToken);
            }
        }

        public String immediate_StartToken;

        public String immediate_StopToken;

        public void writeimmediate(StringBuffer strB, MisdnSections impl) {
            if (impl.getImmediate() != null && immediate_StartToken != null) {
                strB.append(immediate_StartToken).append(impl.getImmediate())
                        .append(immediate_StopToken);
            }
        }

        public String hold_allowed_StartToken;

        public String hold_allowed_StopToken;

        public void writehold_allowed(StringBuffer strB, MisdnSections impl) {
            if (impl.getHold_allowed() != null
                    && hold_allowed_StartToken != null) {
                strB.append(hold_allowed_StartToken).append(
                        impl.getHold_allowed()).append(hold_allowed_StopToken);
            }
        }

        public String pickgroup_StartToken;

        public String pickgroup_StopToken;

        public void writepickgroup(StringBuffer strB, MisdnSections impl) {
            if (impl.getPickgroup() != null && pickgroup_StartToken != null) {
                strB.append(pickgroup_StartToken).append(impl.getPickgroup())
                        .append(pickgroup_StopToken);
            }
        }

        public String callgroup_StartToken;

        public String callgroup_StopToken;

        public void writecallgroup(StringBuffer strB, MisdnSections impl) {
            if (impl.getCallgroup() != null && callgroup_StartToken != null) {
                strB.append(callgroup_StartToken).append(impl.getCallgroup())
                        .append(callgroup_StopToken);
            }
        }

        public String presentation_StartToken;

        public String presentation_StopToken;

        public void writepresentation(StringBuffer strB, MisdnSections impl) {
            if (impl.getPresentation() != null
                    && presentation_StartToken != null) {
                strB.append(presentation_StartToken).append(
                        impl.getPresentation()).append(presentation_StopToken);
            }
        }

        public String echocancel_StartToken;

        public String echocancel_StopToken;

        public void writeechocancel(StringBuffer strB, MisdnSections impl) {
            if (impl.getEchocancel() != null && echocancel_StartToken != null) {
                strB.append(echocancel_StartToken).append(impl.getEchocancel())
                        .append(echocancel_StopToken);
            }
        }

        public String echocancelwhenbridged_StartToken;

        public String echocancelwhenbridged_StopToken;

        public void writeechocancelwhenbridged(StringBuffer strB,
                MisdnSections impl) {
            if (impl.getEchocancelwhenbridged() != null
                    && echocancelwhenbridged_StartToken != null) {
                strB.append(echocancelwhenbridged_StartToken).append(
                        impl.getEchocancelwhenbridged()).append(
                        echocancelwhenbridged_StopToken);
            }
        }

        public String echotraining_StartToken;

        public String echotraining_StopToken;

        public void writeechotraining(StringBuffer strB, MisdnSections impl) {
            if (impl.getEchotraining() != null
                    && echotraining_StartToken != null) {
                strB.append(echotraining_StartToken).append(
                        impl.getEchotraining()).append(echotraining_StopToken);
            }
        }

        public String sectionname_StartToken;

        public String sectionname_StopToken;

        public void writesectionname(StringBuffer strB, MisdnSections impl) {
            if (impl.getSectionname() != null && sectionname_StartToken != null) {
                strB.append(sectionname_StartToken).append(
                        impl.getSectionname()).append(sectionname_StopToken);
            }
        }
    }; // end of MisdnSectionswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class MisdnconfwriteHelper {

        public String debug_StartToken;

        public String debug_StopToken;

        public void writedebug(StringBuffer strB, Misdnconf impl) {
            if (impl.getDebug() != null && debug_StartToken != null) {
                strB.append(debug_StartToken).append(impl.getDebug()).append(
                        debug_StopToken);
            }
        }

        public String tracefile_StartToken;

        public String tracefile_StopToken;

        public void writetracefile(StringBuffer strB, Misdnconf impl) {
            if (impl.getTracefile() != null && tracefile_StartToken != null) {
                strB.append(tracefile_StartToken).append(impl.getTracefile())
                        .append(tracefile_StopToken);
            }
        }

        public String trace_calls_StartToken;

        public String trace_calls_StopToken;

        public void writetrace_calls(StringBuffer strB, Misdnconf impl) {
            if (impl.getTrace_calls() != null && trace_calls_StartToken != null) {
                strB.append(trace_calls_StartToken).append(
                        impl.getTrace_calls()).append(trace_calls_StopToken);
            }
        }

        public String trace_dir_StartToken;

        public String trace_dir_StopToken;

        public void writetrace_dir(StringBuffer strB, Misdnconf impl) {
            if (impl.getTrace_dir() != null && trace_dir_StartToken != null) {
                strB.append(trace_dir_StartToken).append(impl.getTrace_dir())
                        .append(trace_dir_StopToken);
            }
        }

        public String bridging_StartToken;

        public String bridging_StopToken;

        public void writebridging(StringBuffer strB, Misdnconf impl) {
            if (impl.getBridging() != null && bridging_StartToken != null) {
                strB.append(bridging_StartToken).append(impl.getBridging())
                        .append(bridging_StopToken);
            }
        }

        public String stop_tone_after_first_digit_StartToken;

        public String stop_tone_after_first_digit_StopToken;

        public void writestop_tone_after_first_digit(StringBuffer strB,
                Misdnconf impl) {
            if (impl.getStop_tone_after_first_digit() != null
                    && stop_tone_after_first_digit_StartToken != null) {
                strB.append(stop_tone_after_first_digit_StartToken).append(
                        impl.getStop_tone_after_first_digit()).append(
                        stop_tone_after_first_digit_StopToken);
            }
        }

        public String append_digits2exten_StartToken;

        public String append_digits2exten_StopToken;

        public void writeappend_digits2exten(StringBuffer strB, Misdnconf impl) {
            if (impl.getAppend_digits2exten() != null
                    && append_digits2exten_StartToken != null) {
                strB.append(append_digits2exten_StartToken).append(
                        impl.getAppend_digits2exten()).append(
                        append_digits2exten_StopToken);
            }
        }

        public String l1_info_ok_StartToken;

        public String l1_info_ok_StopToken;

        public void writel1_info_ok(StringBuffer strB, Misdnconf impl) {
            if (impl.getL1_info_ok() != null && l1_info_ok_StartToken != null) {
                strB.append(l1_info_ok_StartToken).append(impl.getL1_info_ok())
                        .append(l1_info_ok_StopToken);
            }
        }

        public String clear_l3_StartToken;

        public String clear_l3_StopToken;

        public void writeclear_l3(StringBuffer strB, Misdnconf impl) {
            if (impl.getClear_l3() != null && clear_l3_StartToken != null) {
                strB.append(clear_l3_StartToken).append(impl.getClear_l3())
                        .append(clear_l3_StopToken);
            }
        }

        public String dynamic_crypt_StartToken;

        public String dynamic_crypt_StopToken;

        public void writedynamic_crypt(StringBuffer strB, Misdnconf impl) {
            if (impl.getDynamic_crypt() != null
                    && dynamic_crypt_StartToken != null) {
                strB.append(dynamic_crypt_StartToken).append(
                        impl.getDynamic_crypt())
                        .append(dynamic_crypt_StopToken);
            }
        }

        public String crypt_prefix_StartToken;

        public String crypt_prefix_StopToken;

        public void writecrypt_prefix(StringBuffer strB, Misdnconf impl) {
            if (impl.getCrypt_prefix() != null
                    && crypt_prefix_StartToken != null) {
                strB.append(crypt_prefix_StartToken).append(
                        impl.getCrypt_prefix()).append(crypt_prefix_StopToken);
            }
        }

        public String fileid_StartToken;

        public String fileid_StopToken;

        public void writefileid(StringBuffer strB, Misdnconf impl) {
            if (impl.getFileid() != null && fileid_StartToken != null) {
                strB.append(fileid_StartToken).append(impl.getFileid()).append(
                        fileid_StopToken);
            }
        }

        public String context_StartToken;

        public String context_StopToken;

        public void writecontext(StringBuffer strB, Misdnconf impl) {
            if (impl.getContext() != null && context_StartToken != null) {
                strB.append(context_StartToken).append(impl.getContext())
                        .append(context_StopToken);
            }
        }
    }; // end of MisdnconfwriteHelper Declaration

    protected MisdnCryptkeywriteHelper theMisdnCryptkeywriteHelper;

    protected MisdnPortswriteHelper theMisdnPortswriteHelper;

    protected MisdnSectionswriteHelper theMisdnSectionswriteHelper;

    protected MisdnconfwriteHelper theMisdnconfwriteHelper;

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
        if (data instanceof MisdnCryptkey) {
            writeMisdnCryptkey(strB, (MisdnCryptkey) data);
            return;
        }
        if (data instanceof MisdnPorts) {
            writeMisdnPorts(strB, (MisdnPorts) data);
            return;
        }
        if (data instanceof MisdnSections) {
            writeMisdnSections(strB, (MisdnSections) data);
            return;
        }
        if (data instanceof Misdnconf) {
            writeMisdnconf(strB, (Misdnconf) data);
            return;
        }
    }

    /**
     * schreibt die Felder von MisdnCryptkey
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnCryptkeyFields(StringBuffer strB,
            MisdnCryptkey impl) {

        // felder schreiben
        theMisdnCryptkeywriteHelper.writekeyname(strB, impl);
        theMisdnCryptkeywriteHelper.writekeyvalue(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von MisdnCryptkey
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnCryptkeyAggregates(StringBuffer strB,
            MisdnCryptkey impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein MisdnCryptkey Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnCryptkey(StringBuffer strB, MisdnCryptkey impl) {
        writeMisdnCryptkeyFields(strB, impl);
        writeMisdnCryptkeyAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von MisdnPorts
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnPortsFields(StringBuffer strB, MisdnPorts impl) {

        // felder schreiben
        theMisdnPortswriteHelper.writeportN(strB, impl);
        theMisdnPortswriteHelper.writeportOption(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von MisdnPorts
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnPortsAggregates(StringBuffer strB, MisdnPorts impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein MisdnPorts Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnPorts(StringBuffer strB, MisdnPorts impl) {
        writeMisdnPortsFields(strB, impl);
        writeMisdnPortsAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von MisdnSections
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnSectionsFields(StringBuffer strB,
            MisdnSections impl) {

        // felder schreiben
        theMisdnSectionswriteHelper.writecontext(strB, impl);
        theMisdnSectionswriteHelper.writelanguage(strB, impl);
        theMisdnSectionswriteHelper.writenationalprefix(strB, impl);
        theMisdnSectionswriteHelper.writeinternationalprefix(strB, impl);
        theMisdnSectionswriteHelper.writerxgain(strB, impl);
        theMisdnSectionswriteHelper.writetxgain(strB, impl);
        theMisdnSectionswriteHelper.writete_choose_channel(strB, impl);
        theMisdnSectionswriteHelper.writeearly_bconnect(strB, impl);
        theMisdnSectionswriteHelper.writedialplan(strB, impl);
        theMisdnSectionswriteHelper.writeuse_callingpres(strB, impl);
        theMisdnSectionswriteHelper.writealways_immediate(strB, impl);
        theMisdnSectionswriteHelper.writeimmediate(strB, impl);
        theMisdnSectionswriteHelper.writehold_allowed(strB, impl);
        theMisdnSectionswriteHelper.writepickgroup(strB, impl);
        theMisdnSectionswriteHelper.writecallgroup(strB, impl);
        theMisdnSectionswriteHelper.writepresentation(strB, impl);
        theMisdnSectionswriteHelper.writeechocancel(strB, impl);
        theMisdnSectionswriteHelper.writeechocancelwhenbridged(strB, impl);
        theMisdnSectionswriteHelper.writeechotraining(strB, impl);
        theMisdnSectionswriteHelper.writesectionname(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von MisdnSections
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnSectionsAggregates(StringBuffer strB,
            MisdnSections impl) {

        // aggregate schreiben
        // maps schreiben
        // MisdnPortsMap
        for (Iterator iter = impl.getMisdnPortsMap().iterator(); iter.hasNext();) {
            MisdnPorts mobj = (MisdnPorts) iter.next();
            writeMisdnPorts(strB, mobj);
        }

    }

    /**
     * schreibt ein MisdnSections Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnSections(StringBuffer strB, MisdnSections impl) {
        writeMisdnSectionsFields(strB, impl);
        writeMisdnSectionsAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Misdnconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnconfFields(StringBuffer strB, Misdnconf impl) {

        // felder schreiben
        theMisdnconfwriteHelper.writedebug(strB, impl);
        theMisdnconfwriteHelper.writetracefile(strB, impl);
        theMisdnconfwriteHelper.writetrace_calls(strB, impl);
        theMisdnconfwriteHelper.writetrace_dir(strB, impl);
        theMisdnconfwriteHelper.writebridging(strB, impl);
        theMisdnconfwriteHelper.writestop_tone_after_first_digit(strB, impl);
        theMisdnconfwriteHelper.writeappend_digits2exten(strB, impl);
        theMisdnconfwriteHelper.writel1_info_ok(strB, impl);
        theMisdnconfwriteHelper.writeclear_l3(strB, impl);
        theMisdnconfwriteHelper.writedynamic_crypt(strB, impl);
        theMisdnconfwriteHelper.writecrypt_prefix(strB, impl);
        theMisdnconfwriteHelper.writefileid(strB, impl);
        theMisdnconfwriteHelper.writecontext(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Misdnconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnconfAggregates(StringBuffer strB, Misdnconf impl) {

        // aggregate schreiben
        // MisdnSections
        writeMisdnSections(strB, impl.getMisdnSections());
        // maps schreiben
        // MisdnCryptkeyMap
        for (Iterator iter = impl.getMisdnCryptkeyMap().iterator(); iter
                .hasNext();) {
            MisdnCryptkey mobj = (MisdnCryptkey) iter.next();
            writeMisdnCryptkey(strB, mobj);
        }
        // MisdnSectionsMap
        for (Iterator iter = impl.getMisdnSectionsMap().iterator(); iter
                .hasNext();) {
            MisdnSections mobj = (MisdnSections) iter.next();
            writeMisdnSections(strB, mobj);
        }

    }

    /**
     * schreibt ein Misdnconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnconf(StringBuffer strB, Misdnconf impl) {
        writeMisdnconfFields(strB, impl);
        writeMisdnconfAggregates(strB, impl);

    }

    protected void initHelper() {
        theMisdnCryptkeywriteHelper = new MisdnCryptkeywriteHelper();
        theMisdnCryptkeywriteHelper.keyname_StartToken = "keyname=";
        theMisdnCryptkeywriteHelper.keyname_StopToken = "\n";
        theMisdnCryptkeywriteHelper.keyvalue_StartToken = "keyvalue=";
        theMisdnCryptkeywriteHelper.keyvalue_StopToken = "\n";

        theMisdnPortswriteHelper = new MisdnPortswriteHelper();
        theMisdnPortswriteHelper.portN_StartToken = "portn=";
        theMisdnPortswriteHelper.portN_StopToken = "\n";
        theMisdnPortswriteHelper.portOption_StartToken = "portoption=";
        theMisdnPortswriteHelper.portOption_StopToken = "\n";

        theMisdnSectionswriteHelper = new MisdnSectionswriteHelper();
        theMisdnSectionswriteHelper.context_StartToken = "context=";
        theMisdnSectionswriteHelper.context_StopToken = "\n";
        theMisdnSectionswriteHelper.language_StartToken = "language=";
        theMisdnSectionswriteHelper.language_StopToken = "\n";
        theMisdnSectionswriteHelper.nationalprefix_StartToken = "nationalprefix=";
        theMisdnSectionswriteHelper.nationalprefix_StopToken = "\n";
        theMisdnSectionswriteHelper.internationalprefix_StartToken = "internationalprefix=";
        theMisdnSectionswriteHelper.internationalprefix_StopToken = "\n";
        theMisdnSectionswriteHelper.rxgain_StartToken = "rxgain=";
        theMisdnSectionswriteHelper.rxgain_StopToken = "\n";
        theMisdnSectionswriteHelper.txgain_StartToken = "txgain=";
        theMisdnSectionswriteHelper.txgain_StopToken = "\n";
        theMisdnSectionswriteHelper.te_choose_channel_StartToken = "te_choose_channel=";
        theMisdnSectionswriteHelper.te_choose_channel_StopToken = "\n";
        theMisdnSectionswriteHelper.early_bconnect_StartToken = "early_bconnect=";
        theMisdnSectionswriteHelper.early_bconnect_StopToken = "\n";
        theMisdnSectionswriteHelper.dialplan_StartToken = "dialplan=";
        theMisdnSectionswriteHelper.dialplan_StopToken = "\n";
        theMisdnSectionswriteHelper.use_callingpres_StartToken = "use_callingpres=";
        theMisdnSectionswriteHelper.use_callingpres_StopToken = "\n";
        theMisdnSectionswriteHelper.always_immediate_StartToken = "always_immediate=";
        theMisdnSectionswriteHelper.always_immediate_StopToken = "\n";
        theMisdnSectionswriteHelper.immediate_StartToken = "immediate=";
        theMisdnSectionswriteHelper.immediate_StopToken = "\n";
        theMisdnSectionswriteHelper.hold_allowed_StartToken = "hold_allowed=";
        theMisdnSectionswriteHelper.hold_allowed_StopToken = "\n";
        theMisdnSectionswriteHelper.pickgroup_StartToken = "pickgroup=";
        theMisdnSectionswriteHelper.pickgroup_StopToken = "\n";
        theMisdnSectionswriteHelper.callgroup_StartToken = "callgroup=";
        theMisdnSectionswriteHelper.callgroup_StopToken = "\n";
        theMisdnSectionswriteHelper.presentation_StartToken = "presentation=";
        theMisdnSectionswriteHelper.presentation_StopToken = "\n";
        theMisdnSectionswriteHelper.echocancel_StartToken = "echocancel=";
        theMisdnSectionswriteHelper.echocancel_StopToken = "\n";
        theMisdnSectionswriteHelper.echocancelwhenbridged_StartToken = "echocancelwhenbridged=";
        theMisdnSectionswriteHelper.echocancelwhenbridged_StopToken = "\n";
        theMisdnSectionswriteHelper.echotraining_StartToken = "echotraining=";
        theMisdnSectionswriteHelper.echotraining_StopToken = "\n";
        theMisdnSectionswriteHelper.sectionname_StartToken = "sectionname=";
        theMisdnSectionswriteHelper.sectionname_StopToken = "\n";

        theMisdnconfwriteHelper = new MisdnconfwriteHelper();
        theMisdnconfwriteHelper.debug_StartToken = "debug=";
        theMisdnconfwriteHelper.debug_StopToken = "\n";
        theMisdnconfwriteHelper.tracefile_StartToken = "tracefile=";
        theMisdnconfwriteHelper.tracefile_StopToken = "\n";
        theMisdnconfwriteHelper.trace_calls_StartToken = "trace_calls=";
        theMisdnconfwriteHelper.trace_calls_StopToken = "\n";
        theMisdnconfwriteHelper.trace_dir_StartToken = "trace_dir=";
        theMisdnconfwriteHelper.trace_dir_StopToken = "\n";
        theMisdnconfwriteHelper.bridging_StartToken = "bridging=";
        theMisdnconfwriteHelper.bridging_StopToken = "\n";
        theMisdnconfwriteHelper.stop_tone_after_first_digit_StartToken = "stop_tone_after_first_digit=";
        theMisdnconfwriteHelper.stop_tone_after_first_digit_StopToken = "\n";
        theMisdnconfwriteHelper.append_digits2exten_StartToken = "append_digits2exten=";
        theMisdnconfwriteHelper.append_digits2exten_StopToken = "\n";
        theMisdnconfwriteHelper.l1_info_ok_StartToken = "l1_info_ok=";
        theMisdnconfwriteHelper.l1_info_ok_StopToken = "\n";
        theMisdnconfwriteHelper.clear_l3_StartToken = "clear_l3=";
        theMisdnconfwriteHelper.clear_l3_StopToken = "\n";
        theMisdnconfwriteHelper.dynamic_crypt_StartToken = "dynamic_crypt=";
        theMisdnconfwriteHelper.dynamic_crypt_StopToken = "\n";
        theMisdnconfwriteHelper.crypt_prefix_StartToken = "crypt_prefix=";
        theMisdnconfwriteHelper.crypt_prefix_StopToken = "\n";
        theMisdnconfwriteHelper.fileid_StartToken = "fileid=";
        theMisdnconfwriteHelper.fileid_StopToken = "\n";
        theMisdnconfwriteHelper.context_StartToken = "context=";
        theMisdnconfwriteHelper.context_StopToken = "\n";

    }

}
