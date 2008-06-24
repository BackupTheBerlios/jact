/*
 * (c) urs zeidler
 */
package com.useit.jact.io.extensionconf;

import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.Switch;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.7 2006/01/29 12:03:54
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
        COMMENTTOK = ";";
        SECHEADERTOK = "[";

        theContextwriteHelper = new ContextwriteHelper();
        theContextwriteHelper.contextname_StartToken = "[";
        theContextwriteHelper.contextname_StopToken = "]\n";
        theContextwriteHelper.ignorepat_StartToken = "ignorepat => ";
        theContextwriteHelper.ignorepat_StopToken = "\n";

        theExtensionwriteHelper = new ExtensionwriteHelper();
        theExtensionwriteHelper.exten_StartToken = "exten => ";
        theExtensionwriteHelper.exten_StopToken = ",";
        theExtensionwriteHelper.priority_StartToken = "";
        theExtensionwriteHelper.priority_StopToken = ",";
//        theExtensionwriteHelper.offset_StartToken = null;
//        theExtensionwriteHelper.offset_StopToken = ",";
//        theExtensionwriteHelper.alias_StartToken = null;
//        theExtensionwriteHelper.alias_StopToken = ",";
        theExtensionwriteHelper.application_StartToken = "";
        theExtensionwriteHelper.application_StopToken = "";
//        theExtensionwriteHelper.application_para_StartToken = "";
//        theExtensionwriteHelper.application_para_StopToken = "";

        theSwitchwriteHelper = new SwitchwriteHelper();
        theSwitchwriteHelper.switchdialstr_StartToken = "switch => ";
        theSwitchwriteHelper.switchdialstr_StopToken = "\n";

        theIncludecontextwriteHelper = new IncludecontextwriteHelper();
        theIncludecontextwriteHelper.contexname_StartToken = "include => ";
        theIncludecontextwriteHelper.contexname_StopToken = "";
        theIncludecontextwriteHelper.timeing_StartToken = " ";
        theIncludecontextwriteHelper.timeing_StopToken = "\n";

        theExtensionconfwriteHelper = new ExtensionconfwriteHelper() {
            @Override
            public void writestatic_(StringBuffer strB, Extensionconf impl) {
                if (impl.getStatic_() != null && static__StartToken != null) {
                    if (impl.getStatic_().booleanValue())
                        strB.append(static__StartToken).append("yes").append(
                                static__StopToken);
                } else {
                    strB.append(static__StartToken).append("no").append(
                            static__StopToken);

                }
            }

            @Override
            public void writewriteprotect(StringBuffer strB, Extensionconf impl) {
                if (impl.getWriteprotect() != null
                        && writeprotect_StartToken != null) {
                    if (impl.getWriteprotect().booleanValue())
                        strB.append(writeprotect_StartToken).append("yes")
                                .append(writeprotect_StopToken);
                    else
                        strB.append(writeprotect_StartToken).append("no")
                                .append(writeprotect_StopToken);

                }
            }

            @Override
            public void writeautofallthrough(StringBuffer strB,
                    Extensionconf impl) {
                if (impl.getAutofallthrough() != null
                        && autofallthrough_StartToken != null) {
                    if (impl.getAutofallthrough().booleanValue())
                        strB.append(autofallthrough_StartToken).append("yes")
                                .append(autofallthrough_StopToken);
                    else
                        strB.append(autofallthrough_StartToken).append("no")
                                .append(autofallthrough_StopToken);

                }
            }

            @Override
            public void writeclearglobalvars(StringBuffer strB,
                    Extensionconf impl) {
                if (impl.getClearglobalvars() != null
                        && clearglobalvars_StartToken != null) {
                    if (impl.getClearglobalvars().booleanValue())
                        strB.append(clearglobalvars_StartToken).append("yes")
                                .append(clearglobalvars_StopToken);
                    else
                        strB.append(clearglobalvars_StartToken).append("no")
                                .append(clearglobalvars_StopToken);
                }
            }
        };
        theExtensionconfwriteHelper.static__StartToken = "static=";
        theExtensionconfwriteHelper.static__StopToken = "\n";
        theExtensionconfwriteHelper.writeprotect_StartToken = "writeprotect=";
        theExtensionconfwriteHelper.writeprotect_StopToken = "\n";
        theExtensionconfwriteHelper.autofallthrough_StartToken = "autofallthrough=";
        theExtensionconfwriteHelper.autofallthrough_StopToken = "\n";
        theExtensionconfwriteHelper.clearglobalvars_StartToken = "clearglobalvars=";
        theExtensionconfwriteHelper.clearglobalvars_StopToken = "\n";

        theIncludeconfigswriteHelper = new IncludeconfigswriteHelper();
        theIncludeconfigswriteHelper.configname_StartToken = "#include \"";
        theIncludeconfigswriteHelper.configname_StopToken = "\"\n";

        theGlobalvarswriteHelper = new GlobalvarswriteHelper();
        theGlobalvarswriteHelper.name_StartToken = "";
        theGlobalvarswriteHelper.name_StopToken = "";
        theGlobalvarswriteHelper.value_StartToken = "=";
        theGlobalvarswriteHelper.value_StopToken = "\n";
    }

    /**
     * schreibt ein Context Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeContext(StringBuffer strB, Context impl) {
        writeEmtypLine(strB);
        writeComment(strB, impl);

        super.writeContext(strB, impl);

    }

    /**
     * schreibt ein Extension Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeExtension(StringBuffer strB, Extension impl) {
        writeComment(strB, impl);
        super.writeExtension(strB, impl);
        writeEmtypLine(strB);

    }

    /**
     * schreibt ein Switch Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeSwitch(StringBuffer strB, Switch impl) {
        super.writeSwitch(strB, impl);

    }

    /**
     * schreibt ein Includecontext Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIncludecontext(StringBuffer strB, Includecontext impl) {
        super.writeIncludecontext(strB, impl);

    }

    /**
     * schreibt ein Extensionconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeExtensionconf(StringBuffer strB, Extensionconf impl) {
        strB.append(";Extension config generated by jact\n");
        writeComment(strB, impl);
        writeSecHeader(strB, ConfReaderImpl.GENERAL);

        super.writeExtensionconf(strB, impl);

    }

    /**
     * schreibt ein Includeconfigs Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIncludeconfigs(StringBuffer strB, Includeconfigs impl) {
        super.writeIncludeconfigs(strB, impl);

    }

    /**
     * schreibt ein Globalvars Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeGlobalvars(StringBuffer strB, Globalvars impl) {
        writeComment(strB, impl);
        super.writeGlobalvars(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Extensionconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeExtensionconfAggregates(StringBuffer strB,
            Extensionconf impl) {

        // aggregate schreiben
        // maps schreiben

        for (Iterator iter = impl.getIncludeconfigsMap().iterator(); iter
                .hasNext();) {
            Includeconfigs mobj = (Includeconfigs) iter.next();
            writeIncludeconfigs(strB, mobj);
        }

        // GlobalvarsMap
        writeEmtypLine(strB);
        writeSecHeader(strB, ConfReaderImpl.GLOBALVARS);

        for (Iterator iter = impl.getGlobalvarsMap().iterator(); iter.hasNext();) {
            Globalvars mobj = (Globalvars) iter.next();
            writeGlobalvars(strB, mobj);
        }
        // IncludeconfigsMap
        // ContextMap
        for (Iterator iter = impl.getContextMap().iterator(); iter.hasNext();) {
            Context mobj = (Context) iter.next();
            writeContext(strB, mobj);
        }

    }

    /**
     * schreibt die Felder von Context
     * @param strB
     * @param msec
     */
    protected void writeContextFields(StringBuffer strB, Context impl) {

    //felder schreiben
        theContextwriteHelper.writecontextname(strB, impl);
        theContextwriteHelper.writeignorepat(strB,impl);

    }

}
