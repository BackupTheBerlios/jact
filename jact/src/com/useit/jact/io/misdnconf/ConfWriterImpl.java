/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdnconf;

import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.jact.model.misdnconf.MisdnCryptkey;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.Misdnconf;
import com.useit.jact.model.types.MisdnPortOptions;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.10 2006/01/14
 *          15:00:13 urs Exp $
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
        //        
        // theMisdnconfwriteHelper = new MisdnconfwriteHelper();
        // theMisdnconfwriteHelper.debug_StartToken="debug=";
        // theMisdnconfwriteHelper.Debug_StopToken="\n";
        // theMisdnconfwriteHelper.Tracefile_StartToken="tracefile=";
        // theMisdnconfwriteHelper.Tracefile_StopToken="\n";
        // theMisdnconfwriteHelper.Trace_calls_StartToken="trace_calls=";
        // theMisdnconfwriteHelper.Trace_calls_StopToken="\n";
        // theMisdnconfwriteHelper.Trace_dir_StartToken="trace_dir=";
        // theMisdnconfwriteHelper.Trace_dir_StopToken="\n";
        // theMisdnconfwriteHelper.Bridging_StartToken="bridging=";
        // theMisdnconfwriteHelper.Bridging_StopToken="\n";
        // theMisdnconfwriteHelper.Stop_tone_after_first_digit_StartToken="stop_tone_after_first_digit=";
        // theMisdnconfwriteHelper.Stop_tone_after_first_digit_StopToken="\n";
        // theMisdnconfwriteHelper.Append_digits2exten_StartToken="append_digits2exten=";
        // theMisdnconfwriteHelper.Append_digits2exten_StopToken="\n";
        // theMisdnconfwriteHelper.L1_info_ok_StartToken="l1_info_ok=";
        // theMisdnconfwriteHelper.L1_info_ok_StopToken="\n";
        // theMisdnconfwriteHelper.Clear_l3_StartToken="clear_l3=";
        // theMisdnconfwriteHelper.Clear_l3_StopToken="\n";
        // theMisdnconfwriteHelper.Dynamic_crypt_StartToken="dynamic_crypt=";
        // theMisdnconfwriteHelper.Dynamic_crypt_StopToken="\n";
        // theMisdnconfwriteHelper.Crypt_prefix_StartToken="crypt_prefix=";
        // theMisdnconfwriteHelper.Crypt_prefix_StopToken="\n";
        // theMisdnconfwriteHelper.Fileid_StartToken="fileid=";
        // theMisdnconfwriteHelper.Fileid_StopToken="\n";
        //
        // theMisdnPortswriteHelper = new MisdnPortswriteHelper();
        // theMisdnPortswriteHelper.PortN_StartToken="";
        // theMisdnPortswriteHelper.PortN_StopToken="";
        // theMisdnPortswriteHelper.PortOption_StartToken="";
        // theMisdnPortswriteHelper.PortOption_StopToken="";
        //
        // theMisdnCryptkeywriteHelper = new MisdnCryptkeywriteHelper();
        // theMisdnCryptkeywriteHelper.Keyname_StartToken="crypt_keys=";
        // theMisdnCryptkeywriteHelper.Keyname_StopToken="";
        // theMisdnCryptkeywriteHelper.Keyvalue_StartToken=",";
        // theMisdnCryptkeywriteHelper.Keyvalue_StopToken="\n";
        //
        // theMisdnSectionswriteHelper = new MisdnSectionswriteHelper();
        // theMisdnSectionswriteHelper.Context_StartToken="context=";
        // theMisdnSectionswriteHelper.Context_StopToken="\n";
        // theMisdnSectionswriteHelper.Language_StartToken="language=";
        // theMisdnSectionswriteHelper.Language_StopToken="\n";
        // theMisdnSectionswriteHelper.Nationalprefix_StartToken="nationalprefix=";
        // theMisdnSectionswriteHelper.Nationalprefix_StopToken="\n";
        // theMisdnSectionswriteHelper.Internationalprefix_StartToken="internationalprefix=";
        // theMisdnSectionswriteHelper.Internationalprefix_StopToken="\n";
        // theMisdnSectionswriteHelper.Rxgain_StartToken="rxgain=";
        // theMisdnSectionswriteHelper.Rxgain_StopToken="\n";
        // theMisdnSectionswriteHelper.Txgain_StartToken="txgain=";
        // theMisdnSectionswriteHelper.Txgain_StopToken="\n";
        // theMisdnSectionswriteHelper.Te_choose_channel_StartToken="te_choose_channel=";
        // theMisdnSectionswriteHelper.Te_choose_channel_StopToken="\n";
        // theMisdnSectionswriteHelper.Early_bconnect_StartToken="early_bconnect=";
        // theMisdnSectionswriteHelper.Early_bconnect_StopToken="\n";
        // theMisdnSectionswriteHelper.Dialplan_StartToken="dialplan=";
        // theMisdnSectionswriteHelper.Dialplan_StopToken="\n";
        // theMisdnSectionswriteHelper.Use_callingpres_StartToken="use_callingpres=";
        // theMisdnSectionswriteHelper.Use_callingpres_StopToken="\n";
        // theMisdnSectionswriteHelper.Always_immediate_StartToken="always_immediate=";
        // theMisdnSectionswriteHelper.Always_immediate_StopToken="\n";
        // theMisdnSectionswriteHelper.Immediate_StartToken="immediate=";
        // theMisdnSectionswriteHelper.Immediate_StopToken="\n";
        // theMisdnSectionswriteHelper.Hold_allowed_StartToken="hold_allowed=";
        // theMisdnSectionswriteHelper.Hold_allowed_StopToken="\n";
        // theMisdnSectionswriteHelper.Pickgroup_StartToken="pickgroup=";
        // theMisdnSectionswriteHelper.Pickgroup_StopToken="\n";
        // theMisdnSectionswriteHelper.Callgroup_StartToken="callgroup=";
        // theMisdnSectionswriteHelper.Callgroup_StopToken="\n";
        // theMisdnSectionswriteHelper.Presentation_StartToken="presentation=";
        // theMisdnSectionswriteHelper.Presentation_StopToken="\n";
        // theMisdnSectionswriteHelper.Echocancel_StartToken="echocancel=";
        // theMisdnSectionswriteHelper.Echocancel_StopToken="\n";
        // theMisdnSectionswriteHelper.Echocancelwhenbridged_StartToken="echocancelwhenbridged=";
        // theMisdnSectionswriteHelper.Echocancelwhenbridged_StopToken="\n";
        // theMisdnSectionswriteHelper.Echotraining_StartToken="echotraining=";
        // theMisdnSectionswriteHelper.Echotraining_StopToken="\n";
        // theMisdnSectionswriteHelper.Sectionname_StartToken="[";
        // theMisdnSectionswriteHelper.Sectionname_StopToken="]\n";

        theMisdnCryptkeywriteHelper = new MisdnCryptkeywriteHelper();
        theMisdnCryptkeywriteHelper.keyname_StartToken = "crypt_keys=";
        theMisdnCryptkeywriteHelper.keyname_StopToken = "";
        theMisdnCryptkeywriteHelper.keyvalue_StartToken = ",";
        theMisdnCryptkeywriteHelper.keyvalue_StopToken = "\n";

        theMisdnPortswriteHelper = new MisdnPortswriteHelper();
        theMisdnPortswriteHelper.portN_StartToken = "";
        theMisdnPortswriteHelper.portN_StopToken = "";
        theMisdnPortswriteHelper.portOption_StartToken = "";
        theMisdnPortswriteHelper.portOption_StopToken = "";

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
        theMisdnSectionswriteHelper.sectionname_StartToken = null;
        theMisdnSectionswriteHelper.sectionname_StopToken = "]\n";

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
        theMisdnconfwriteHelper.fileid_StartToken = null;
        theMisdnconfwriteHelper.fileid_StopToken = "\n";
        theMisdnconfwriteHelper.context_StartToken = "context=";
        theMisdnconfwriteHelper.context_StopToken = "\n";

    }

    /**
     * schreibt ein Misdnconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnconf(StringBuffer strB, Misdnconf impl) {
        strB.append(";misdn config generated by jact\n\n[general]\n");
        writeComment(strB, impl);
        writeMisdnconfFields(strB, impl);

        writeMisdnconfAggregates(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Misdnconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnconfAggregates(StringBuffer strB, Misdnconf impl) {

        // maps schreiben
        // MisdnCryptkeyMap
        for (Iterator iter = impl.getMisdnCryptkeyMap().iterator(); iter
                .hasNext();) {
            MisdnCryptkey mobj = (MisdnCryptkey) iter.next();
            writeMisdnCryptkey(strB, mobj);
        }
        // aggregate schreiben
        // MisdnSections
        writeMisdnSections(strB, impl.getMisdnSections());
        // MisdnSectionsMap
        for (Iterator iter = impl.getMisdnSectionsMap().iterator(); iter
                .hasNext();) {
            MisdnSections mobj = (MisdnSections) iter.next();
            writeMisdnSections(strB, mobj);
        }

    }

    /**
     * schreibt ein MisdnPorts Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnPorts(StringBuffer strB, MisdnPorts impl) {
        theMisdnPortswriteHelper.writeportN(strB, impl);
        if (impl.getPortOption().getEnumInt() == MisdnPortOptions.EVAL_NT_PTP)
            strB.append("ptp");
        // theMisdnPortswriteHelper.writePortOption(strB,impl);

    }

    /**
     * schreibt ein MisdnCryptkey Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnCryptkey(StringBuffer strB, MisdnCryptkey impl) {
        super.writeMisdnCryptkey(strB, impl);
        strB.append("\n");
    }

    /**
     * schreibt ein MisdnSections Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnSections(StringBuffer strB, MisdnSections impl) {
        writeEmtypLine(strB);
        writeComment(strB, impl);
        writeSecHeader(strB, impl.getSectionname());

        writeMisdnSectionsAggregates(strB, impl);
        writeMisdnSectionsFields(strB, impl);

    }

    // /**
    // * schreibt die Felder von MisdnSections
    // * @param strB
    // * @param msec
    // */
    // protected void writeMisdnSectionsFields(StringBuffer strB, MisdnSections
    // impl) {
    //    
    // //felder schreiben
    // theMisdnSectionswriteHelper.writeContext(strB,impl);
    // theMisdnSectionswriteHelper.writeLanguage(strB,impl);
    // theMisdnSectionswriteHelper.writeNationalprefix(strB,impl);
    // theMisdnSectionswriteHelper.writeInternationalprefix(strB,impl);
    // theMisdnSectionswriteHelper.writeRxgain(strB,impl);
    // theMisdnSectionswriteHelper.writeTxgain(strB,impl);
    // theMisdnSectionswriteHelper.writeTe_choose_channel(strB,impl);
    // theMisdnSectionswriteHelper.writeEarly_bconnect(strB,impl);
    // theMisdnSectionswriteHelper.writeDialplan(strB,impl);
    // theMisdnSectionswriteHelper.writeUse_callingpres(strB,impl);
    // theMisdnSectionswriteHelper.writeAlways_immediate(strB,impl);
    // theMisdnSectionswriteHelper.writeImmediate(strB,impl);
    // theMisdnSectionswriteHelper.writeHold_allowed(strB,impl);
    // theMisdnSectionswriteHelper.writePickgroup(strB,impl);
    // theMisdnSectionswriteHelper.writeCallgroup(strB,impl);
    // theMisdnSectionswriteHelper.writePresentation(strB,impl);
    // theMisdnSectionswriteHelper.writeEchocancel(strB,impl);
    // theMisdnSectionswriteHelper.writeEchocancelwhenbridged(strB,impl);
    // theMisdnSectionswriteHelper.writeEchotraining(strB,impl);
    //    
    // }
    /**
     * schreibt die Aggregierten Objekte von MisdnSections
     * 
     * @param strB
     * @param msec
     */
    protected void writeMisdnSectionsAggregates(StringBuffer strB,
            MisdnSections impl) {
        if (impl.getMisdnPortsMap().size() > 0) {
            strB.append("ports=");

            // aggregate schreiben
            // maps schreiben
            // MisdnPortsMap
            for (Iterator iter = impl.getMisdnPortsMap().iterator(); iter
                    .hasNext();) {
                MisdnPorts mobj = (MisdnPorts) iter.next();
                writeMisdnPorts(strB, mobj);
                if (iter.hasNext())
                    strB.append(",");
            }
            strB.append("\n");

        }

    }

}
