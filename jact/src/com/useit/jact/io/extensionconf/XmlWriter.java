/*
 * (c) urs zeidler
 */
package com.useit.jact.io.extensionconf;


import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.Switch;

/** 
 * <p> 
 * XmlWriter 
 * </p> 
 * Created : 07.08.2005 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.1 2008/06/24 20:45:24 urszeidler Exp $ 
 */
public class  XmlWriter {

    /**
     * ruft die entsprechende write methode auf
     * @param strB
     * @param data
     */
    public static Element writeConf(Document doc,Object data){
	    if(data instanceof Context){
    		return writeContext(doc,(Context)data);
    	}
	    if(data instanceof Extension){
    		return writeExtension(doc,(Extension)data);
    	}
	    if(data instanceof Switch){
    		return writeSwitch(doc,(Switch)data);
    	}
	    if(data instanceof Includecontext){
    		return writeIncludecontext(doc,(Includecontext)data);
    	}
	    if(data instanceof Extensionconf){
    		return writeExtensionconf(doc,(Extensionconf)data);
    	}
	    if(data instanceof Includeconfigs){
    		return writeIncludeconfigs(doc,(Includeconfigs)data);
    	}
	    if(data instanceof Globalvars){
    		return writeGlobalvars(doc,(Globalvars)data);
    	}
	return null;      
    }

 

    /**
     * @param strB
     * @param msec
     */
    public static Element writeContext(Document doc, Context impl) {
     Element xContext = doc.createElement("Context");
 	
 	//felder schreiben
   if(impl.getIgnorepat()!=null)
        xContext.setAttribute("ignorepat", impl.getIgnorepat().toString() );
   if(impl.getContextname()!=null)
        xContext.setAttribute("contextname", impl.getContextname().toString() );
    //aggregate schreiben

   //maps schreiben

        for (Iterator iter = impl.getExtensionMap().iterator(); iter.hasNext();) {
            Extension mobj = (Extension) iter.next();
            
           Element xExtension = writeExtension(doc,mobj);
           xContext.appendChild(xExtension);
            
        }
   //maps schreiben

        for (Iterator iter = impl.getIncludecontextMap().iterator(); iter.hasNext();) {
            Includecontext mobj = (Includecontext) iter.next();
            
           Element xIncludecontext = writeIncludecontext(doc,mobj);
           xContext.appendChild(xIncludecontext);
            
        }
   //maps schreiben

        for (Iterator iter = impl.getSwitchMap().iterator(); iter.hasNext();) {
            Switch mobj = (Switch) iter.next();
            
           Element xSwitch = writeSwitch(doc,mobj);
           xContext.appendChild(xSwitch);
            
        }
    doc.appendChild(xContext);
    return xContext;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeExtension(Document doc, Extension impl) {
     Element xExtension = doc.createElement("Extension");
 	
 	//felder schreiben
   if(impl.getExten()!=null)
        xExtension.setAttribute("exten", impl.getExten().toString() );
   if(impl.getPriority()!=null)
        xExtension.setAttribute("priority", impl.getPriority().toString() );
   if(impl.getApplication()!=null)
        xExtension.setAttribute("application", impl.getApplication().toString() );
    //aggregate schreiben

    doc.appendChild(xExtension);
    return xExtension;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeSwitch(Document doc, Switch impl) {
     Element xSwitch = doc.createElement("Switch");
 	
 	//felder schreiben
   if(impl.getSwitchdialstr()!=null)
        xSwitch.setAttribute("switchdialstr", impl.getSwitchdialstr().toString() );
    //aggregate schreiben

    doc.appendChild(xSwitch);
    return xSwitch;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeIncludecontext(Document doc, Includecontext impl) {
     Element xIncludecontext = doc.createElement("Includecontext");
 	
 	//felder schreiben
   if(impl.getContexname()!=null)
        xIncludecontext.setAttribute("contexname", impl.getContexname().toString() );
   if(impl.getTimeing()!=null)
        xIncludecontext.setAttribute("timeing", impl.getTimeing().toString() );
    //aggregate schreiben

    doc.appendChild(xIncludecontext);
    return xIncludecontext;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeExtensionconf(Document doc, Extensionconf impl) {
     Element xExtensionconf = doc.createElement("Extensionconf");
 	
 	//felder schreiben
   if(impl.getStatic_()!=null)
        xExtensionconf.setAttribute("static_", impl.getStatic_().toString() );
   if(impl.getWriteprotect()!=null)
        xExtensionconf.setAttribute("writeprotect", impl.getWriteprotect().toString() );
   if(impl.getAutofallthrough()!=null)
        xExtensionconf.setAttribute("autofallthrough", impl.getAutofallthrough().toString() );
   if(impl.getClearglobalvars()!=null)
        xExtensionconf.setAttribute("clearglobalvars", impl.getClearglobalvars().toString() );
    //aggregate schreiben

   //maps schreiben

        for (Iterator iter = impl.getContextMap().iterator(); iter.hasNext();) {
            Context mobj = (Context) iter.next();
            
           Element xContext = writeContext(doc,mobj);
           xExtensionconf.appendChild(xContext);
            
        }
   //maps schreiben

        for (Iterator iter = impl.getGlobalvarsMap().iterator(); iter.hasNext();) {
            Globalvars mobj = (Globalvars) iter.next();
            
           Element xGlobalvars = writeGlobalvars(doc,mobj);
           xExtensionconf.appendChild(xGlobalvars);
            
        }
   //maps schreiben

        for (Iterator iter = impl.getIncludeconfigsMap().iterator(); iter.hasNext();) {
            Includeconfigs mobj = (Includeconfigs) iter.next();
            
           Element xIncludeconfigs = writeIncludeconfigs(doc,mobj);
           xExtensionconf.appendChild(xIncludeconfigs);
            
        }
    doc.appendChild(xExtensionconf);
    return xExtensionconf;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeIncludeconfigs(Document doc, Includeconfigs impl) {
     Element xIncludeconfigs = doc.createElement("Includeconfigs");
 	
 	//felder schreiben
   if(impl.getConfigname()!=null)
        xIncludeconfigs.setAttribute("configname", impl.getConfigname().toString() );
    //aggregate schreiben

    doc.appendChild(xIncludeconfigs);
    return xIncludeconfigs;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeGlobalvars(Document doc, Globalvars impl) {
     Element xGlobalvars = doc.createElement("Globalvars");
 	
 	//felder schreiben
   if(impl.getName()!=null)
        xGlobalvars.setAttribute("name", impl.getName().toString() );
   if(impl.getValue()!=null)
        xGlobalvars.setAttribute("value", impl.getValue().toString() );
    //aggregate schreiben

    doc.appendChild(xGlobalvars);
    return xGlobalvars;
    }
}
