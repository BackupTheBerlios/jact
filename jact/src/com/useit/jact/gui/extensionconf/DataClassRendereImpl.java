/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.extensionconf;

import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.Switch;

/**
 * <p>
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.6 2006/01/29
 *          12:03:54 urs Exp $
 */
public final class DataClassRendereImpl extends DataClassRendere {
    /**
     * 
     */
    protected DataClassRendereImpl() {
        super();
    }

    /**
     * gibt den string des Datenobjectes zurück für Context
     */
    public String displayString(Context aContext) {
        return aContext == null ? "" : aContext.getContextname(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Extension
     */
    public String displayString(Extension aExtension) {
        if(aExtension!=null){
            StringBuilder builder = new StringBuilder();
            builder.append(aExtension.getExten())
            .append("=>")
            .append(aExtension.getPriority())
            .append(",")
            .append(aExtension.getApplication());
            return builder.toString();
            //Extension.getExten() + "=>"
        }
        return "null";
//        return aExtension == null ? "" : aExtension.getExten() + "=>"
//                + aExtension.getPriority().toString();
        // TODO : weiterarbeiten
        // aExtension.toString(); //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Switch
     */
    public String displayString(Switch aSwitch) {
        return aSwitch == null ? "" : aSwitch.getSwitchdialstr(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Includecontext
     */
    public String displayString(Includecontext aIncludecontext) {
        return aIncludecontext == null ? "" : aIncludecontext.getContexname()
                .toString(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Extensionconf
     */
    public String displayString(Extensionconf aExtensionconf) {
        return aExtensionconf == null ? "" : "Extension Conf";// aExtensionconf.toString();
                                                                // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Includeconfigs
     */
    public String displayString(Includeconfigs aIncludeconfigs) {
        return aIncludeconfigs == null ? "" : aIncludeconfigs.getConfigname(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Globalvars
     */
    public String displayString(Globalvars aGlobalvars) {
        return aGlobalvars == null ? "" : aGlobalvars.getName() + "="
                + aGlobalvars.getValue(); // "DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Context
    // */
    // public String displayString(ContextMap aContextMap){
    // return aContextMap == null ? "" : aContextMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Extension
    // */
    // public String displayString(ExtensionMap aExtensionMap){
    // return aExtensionMap == null ? "" : aExtensionMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Switch
    // */
    // public String displayString(SwitchMap aSwitchMap){
    // return aSwitchMap == null ? "" : aSwitchMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Includecontext
    // */
    // public String displayString(IncludecontextMap aIncludecontextMap){
    // return aIncludecontextMap == null ? "" : aIncludecontextMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Extensionconf
    // */
    // public String displayString(ExtensionconfMap aExtensionconfMap){
    // return aExtensionconfMap == null ? "" : aExtensionconfMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Includeconfigs
    // */
    // public String displayString(IncludeconfigsMap aIncludeconfigsMap){
    // return aIncludeconfigsMap == null ? "" : aIncludeconfigsMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Globalvars
    // */
    // public String displayString(GlobalvarsMap aGlobalvarsMap){
    // return aGlobalvarsMap == null ? "" : aGlobalvarsMap.toString();
    // //"DataObjectName";
    // }
}
