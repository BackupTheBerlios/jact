/*
 * (c) urs zeidler
 */
package com.useit.jact.io.extensionconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.Switch;


/** 
 * <p> 
 * ConfWriter , schreibet einen Objektbaum als string
 * </p> 
 * Created : 07.08.2005 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.1 2008/06/24 20:45:24 urszeidler Exp $ 
 */
public class  ConfWriter extends AbstractConfWriter{
   /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);


   /** der Token speicher um zu writen **/
   protected class  ContextwriteHelper {

	public String ignorepat_StartToken;
	public String ignorepat_StopToken;
	public void writeignorepat(StringBuffer strB,Context impl){
      if(impl.getIgnorepat()!=null
      	&& ignorepat_StartToken!=null
      ){
      strB
       	.append(ignorepat_StartToken)
       	.append(impl.getIgnorepat())
       	.append(ignorepat_StopToken);
	   } 
	}
	public String contextname_StartToken;
	public String contextname_StopToken;
	public void writecontextname(StringBuffer strB,Context impl){
      if(impl.getContextname()!=null
      	&& contextname_StartToken!=null
      ){
      strB
       	.append(contextname_StartToken)
       	.append(impl.getContextname())
       	.append(contextname_StopToken);
	   } 
	}
    }; // end of ContextwriteHelper Declaration


   /** der Token speicher um zu writen **/
   protected class  ExtensionwriteHelper {

	public String exten_StartToken;
	public String exten_StopToken;
	public void writeexten(StringBuffer strB,Extension impl){
      if(impl.getExten()!=null
      	&& exten_StartToken!=null
      ){
      strB
       	.append(exten_StartToken)
       	.append(impl.getExten())
       	.append(exten_StopToken);
	   } 
	}
	public String priority_StartToken;
	public String priority_StopToken;
	public void writepriority(StringBuffer strB,Extension impl){
      if(impl.getPriority()!=null
      	&& priority_StartToken!=null
      ){
      strB
       	.append(priority_StartToken)
       	.append(impl.getPriority())
       	.append(priority_StopToken);
	   } 
	}
	public String application_StartToken;
	public String application_StopToken;
	public void writeapplication(StringBuffer strB,Extension impl){
      if(impl.getApplication()!=null
      	&& application_StartToken!=null
      ){
      strB
       	.append(application_StartToken)
       	.append(impl.getApplication())
       	.append(application_StopToken);
	   } 
	}
    }; // end of ExtensionwriteHelper Declaration


   /** der Token speicher um zu writen **/
   protected class  SwitchwriteHelper {

	public String switchdialstr_StartToken;
	public String switchdialstr_StopToken;
	public void writeswitchdialstr(StringBuffer strB,Switch impl){
      if(impl.getSwitchdialstr()!=null
      	&& switchdialstr_StartToken!=null
      ){
      strB
       	.append(switchdialstr_StartToken)
       	.append(impl.getSwitchdialstr())
       	.append(switchdialstr_StopToken);
	   } 
	}
    }; // end of SwitchwriteHelper Declaration


   /** der Token speicher um zu writen **/
   protected class  IncludecontextwriteHelper {

	public String contexname_StartToken;
	public String contexname_StopToken;
	public void writecontexname(StringBuffer strB,Includecontext impl){
      if(impl.getContexname()!=null
      	&& contexname_StartToken!=null
      ){
      strB
       	.append(contexname_StartToken)
       	.append(impl.getContexname())
       	.append(contexname_StopToken);
	   } 
	}
	public String timeing_StartToken;
	public String timeing_StopToken;
	public void writetimeing(StringBuffer strB,Includecontext impl){
      if(impl.getTimeing()!=null
      	&& timeing_StartToken!=null
      ){
      strB
       	.append(timeing_StartToken)
       	.append(impl.getTimeing())
       	.append(timeing_StopToken);
	   } 
	}
    }; // end of IncludecontextwriteHelper Declaration


   /** der Token speicher um zu writen **/
   protected class  ExtensionconfwriteHelper {

	public String static__StartToken;
	public String static__StopToken;
	public void writestatic_(StringBuffer strB,Extensionconf impl){
      if(impl.getStatic_()!=null
      	&& static__StartToken!=null
      ){
      strB
       	.append(static__StartToken)
       	.append(impl.getStatic_())
       	.append(static__StopToken);
	   } 
	}
	public String writeprotect_StartToken;
	public String writeprotect_StopToken;
	public void writewriteprotect(StringBuffer strB,Extensionconf impl){
      if(impl.getWriteprotect()!=null
      	&& writeprotect_StartToken!=null
      ){
      strB
       	.append(writeprotect_StartToken)
       	.append(impl.getWriteprotect())
       	.append(writeprotect_StopToken);
	   } 
	}
	public String autofallthrough_StartToken;
	public String autofallthrough_StopToken;
	public void writeautofallthrough(StringBuffer strB,Extensionconf impl){
      if(impl.getAutofallthrough()!=null
      	&& autofallthrough_StartToken!=null
      ){
      strB
       	.append(autofallthrough_StartToken)
       	.append(impl.getAutofallthrough())
       	.append(autofallthrough_StopToken);
	   } 
	}
	public String clearglobalvars_StartToken;
	public String clearglobalvars_StopToken;
	public void writeclearglobalvars(StringBuffer strB,Extensionconf impl){
      if(impl.getClearglobalvars()!=null
      	&& clearglobalvars_StartToken!=null
      ){
      strB
       	.append(clearglobalvars_StartToken)
       	.append(impl.getClearglobalvars())
       	.append(clearglobalvars_StopToken);
	   } 
	}
    }; // end of ExtensionconfwriteHelper Declaration


   /** der Token speicher um zu writen **/
   protected class  IncludeconfigswriteHelper {

	public String configname_StartToken;
	public String configname_StopToken;
	public void writeconfigname(StringBuffer strB,Includeconfigs impl){
      if(impl.getConfigname()!=null
      	&& configname_StartToken!=null
      ){
      strB
       	.append(configname_StartToken)
       	.append(impl.getConfigname())
       	.append(configname_StopToken);
	   } 
	}
    }; // end of IncludeconfigswriteHelper Declaration


   /** der Token speicher um zu writen **/
   protected class  GlobalvarswriteHelper {

	public String name_StartToken;
	public String name_StopToken;
	public void writename(StringBuffer strB,Globalvars impl){
      if(impl.getName()!=null
      	&& name_StartToken!=null
      ){
      strB
       	.append(name_StartToken)
       	.append(impl.getName())
       	.append(name_StopToken);
	   } 
	}
	public String value_StartToken;
	public String value_StopToken;
	public void writevalue(StringBuffer strB,Globalvars impl){
      if(impl.getValue()!=null
      	&& value_StartToken!=null
      ){
      strB
       	.append(value_StartToken)
       	.append(impl.getValue())
       	.append(value_StopToken);
	   } 
	}
    }; // end of GlobalvarswriteHelper Declaration



	protected ContextwriteHelper theContextwriteHelper;	
	protected ExtensionwriteHelper theExtensionwriteHelper;	
	protected SwitchwriteHelper theSwitchwriteHelper;	
	protected IncludecontextwriteHelper theIncludecontextwriteHelper;	
	protected ExtensionconfwriteHelper theExtensionconfwriteHelper;	
	protected IncludeconfigswriteHelper theIncludeconfigswriteHelper;	
	protected GlobalvarswriteHelper theGlobalvarswriteHelper;	
    /**
     * 
     */
    public ConfWriter() {
        super();

    }
    /**
     * schreibt die config als datei
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String string){
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
     * @param data
     */
    public String writetoString(Object data) {
        StringBuffer strb= new StringBuffer();
        writeConf(strb, data);
        return strb.toString();
    }
   
    /**
     * ruft die entsprechende write methode auf
     * @param strB
     * @param data
     */
    public void writeConf(StringBuffer strB,Object data){
    if(data instanceof Context){
    	writeContext(strB,(Context)data);
    	return;
    }
    if(data instanceof Extension){
    	writeExtension(strB,(Extension)data);
    	return;
    }
    if(data instanceof Switch){
    	writeSwitch(strB,(Switch)data);
    	return;
    }
    if(data instanceof Includecontext){
    	writeIncludecontext(strB,(Includecontext)data);
    	return;
    }
    if(data instanceof Extensionconf){
    	writeExtensionconf(strB,(Extensionconf)data);
    	return;
    }
    if(data instanceof Includeconfigs){
    	writeIncludeconfigs(strB,(Includeconfigs)data);
    	return;
    }
    if(data instanceof Globalvars){
    	writeGlobalvars(strB,(Globalvars)data);
    	return;
    }
    }

    /**
     * schreibt die Felder von Context
     * @param strB
     * @param msec
     */
    protected void writeContextFields(StringBuffer strB, Context impl) {

 	//felder schreiben
        theContextwriteHelper.writeignorepat(strB,impl);
        theContextwriteHelper.writecontextname(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Context
     * @param strB
     * @param msec
     */
    protected void writeContextAggregates(StringBuffer strB, Context impl) {

    //aggregate schreiben
   //maps schreiben
		// ExtensionMap
        for (Iterator iter = impl.getExtensionMap().iterator(); iter.hasNext();) {
            Extension mobj = (Extension) iter.next();
            writeExtension(strB,mobj);           
        }
		// IncludecontextMap
        for (Iterator iter = impl.getIncludecontextMap().iterator(); iter.hasNext();) {
            Includecontext mobj = (Includecontext) iter.next();
            writeIncludecontext(strB,mobj);           
        }
		// SwitchMap
        for (Iterator iter = impl.getSwitchMap().iterator(); iter.hasNext();) {
            Switch mobj = (Switch) iter.next();
            writeSwitch(strB,mobj);           
        }
	
	}
    /**
     * schreibt ein Context Objekt
     * @param strB
     * @param msec
     */
    protected void writeContext(StringBuffer strB, Context impl) {
	writeContextFields(strB, impl);
    writeContextAggregates(strB, impl);
    
    }
    /**
     * schreibt die Felder von Extension
     * @param strB
     * @param msec
     */
    protected void writeExtensionFields(StringBuffer strB, Extension impl) {

 	//felder schreiben
        theExtensionwriteHelper.writeexten(strB,impl);
        theExtensionwriteHelper.writepriority(strB,impl);
        theExtensionwriteHelper.writeapplication(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Extension
     * @param strB
     * @param msec
     */
    protected void writeExtensionAggregates(StringBuffer strB, Extension impl) {

    //aggregate schreiben
   //maps schreiben
	
	}
    /**
     * schreibt ein Extension Objekt
     * @param strB
     * @param msec
     */
    protected void writeExtension(StringBuffer strB, Extension impl) {
	writeExtensionFields(strB, impl);
    writeExtensionAggregates(strB, impl);
    
    }
    /**
     * schreibt die Felder von Switch
     * @param strB
     * @param msec
     */
    protected void writeSwitchFields(StringBuffer strB, Switch impl) {

 	//felder schreiben
        theSwitchwriteHelper.writeswitchdialstr(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Switch
     * @param strB
     * @param msec
     */
    protected void writeSwitchAggregates(StringBuffer strB, Switch impl) {

    //aggregate schreiben
   //maps schreiben
	
	}
    /**
     * schreibt ein Switch Objekt
     * @param strB
     * @param msec
     */
    protected void writeSwitch(StringBuffer strB, Switch impl) {
	writeSwitchFields(strB, impl);
    writeSwitchAggregates(strB, impl);
    
    }
    /**
     * schreibt die Felder von Includecontext
     * @param strB
     * @param msec
     */
    protected void writeIncludecontextFields(StringBuffer strB, Includecontext impl) {

 	//felder schreiben
        theIncludecontextwriteHelper.writecontexname(strB,impl);
        theIncludecontextwriteHelper.writetimeing(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Includecontext
     * @param strB
     * @param msec
     */
    protected void writeIncludecontextAggregates(StringBuffer strB, Includecontext impl) {

    //aggregate schreiben
   //maps schreiben
	
	}
    /**
     * schreibt ein Includecontext Objekt
     * @param strB
     * @param msec
     */
    protected void writeIncludecontext(StringBuffer strB, Includecontext impl) {
	writeIncludecontextFields(strB, impl);
    writeIncludecontextAggregates(strB, impl);
    
    }
    /**
     * schreibt die Felder von Extensionconf
     * @param strB
     * @param msec
     */
    protected void writeExtensionconfFields(StringBuffer strB, Extensionconf impl) {

 	//felder schreiben
        theExtensionconfwriteHelper.writestatic_(strB,impl);
        theExtensionconfwriteHelper.writewriteprotect(strB,impl);
        theExtensionconfwriteHelper.writeautofallthrough(strB,impl);
        theExtensionconfwriteHelper.writeclearglobalvars(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Extensionconf
     * @param strB
     * @param msec
     */
    protected void writeExtensionconfAggregates(StringBuffer strB, Extensionconf impl) {

    //aggregate schreiben
   //maps schreiben
		// ContextMap
        for (Iterator iter = impl.getContextMap().iterator(); iter.hasNext();) {
            Context mobj = (Context) iter.next();
            writeContext(strB,mobj);           
        }
		// GlobalvarsMap
        for (Iterator iter = impl.getGlobalvarsMap().iterator(); iter.hasNext();) {
            Globalvars mobj = (Globalvars) iter.next();
            writeGlobalvars(strB,mobj);           
        }
		// IncludeconfigsMap
        for (Iterator iter = impl.getIncludeconfigsMap().iterator(); iter.hasNext();) {
            Includeconfigs mobj = (Includeconfigs) iter.next();
            writeIncludeconfigs(strB,mobj);           
        }
	
	}
    /**
     * schreibt ein Extensionconf Objekt
     * @param strB
     * @param msec
     */
    protected void writeExtensionconf(StringBuffer strB, Extensionconf impl) {
	writeExtensionconfFields(strB, impl);
    writeExtensionconfAggregates(strB, impl);
    
    }
    /**
     * schreibt die Felder von Includeconfigs
     * @param strB
     * @param msec
     */
    protected void writeIncludeconfigsFields(StringBuffer strB, Includeconfigs impl) {

 	//felder schreiben
        theIncludeconfigswriteHelper.writeconfigname(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Includeconfigs
     * @param strB
     * @param msec
     */
    protected void writeIncludeconfigsAggregates(StringBuffer strB, Includeconfigs impl) {

    //aggregate schreiben
   //maps schreiben
	
	}
    /**
     * schreibt ein Includeconfigs Objekt
     * @param strB
     * @param msec
     */
    protected void writeIncludeconfigs(StringBuffer strB, Includeconfigs impl) {
	writeIncludeconfigsFields(strB, impl);
    writeIncludeconfigsAggregates(strB, impl);
    
    }
    /**
     * schreibt die Felder von Globalvars
     * @param strB
     * @param msec
     */
    protected void writeGlobalvarsFields(StringBuffer strB, Globalvars impl) {

 	//felder schreiben
        theGlobalvarswriteHelper.writename(strB,impl);
        theGlobalvarswriteHelper.writevalue(strB,impl);

	}
   /**
   	 * schreibt die Aggregierten Objekte von Globalvars
     * @param strB
     * @param msec
     */
    protected void writeGlobalvarsAggregates(StringBuffer strB, Globalvars impl) {

    //aggregate schreiben
   //maps schreiben
	
	}
    /**
     * schreibt ein Globalvars Objekt
     * @param strB
     * @param msec
     */
    protected void writeGlobalvars(StringBuffer strB, Globalvars impl) {
	writeGlobalvarsFields(strB, impl);
    writeGlobalvarsAggregates(strB, impl);
    
    }

	protected void initHelper(){
		theContextwriteHelper = new ContextwriteHelper();
	theContextwriteHelper.ignorepat_StartToken="ignorepat=";
	theContextwriteHelper.ignorepat_StopToken="\n";
	theContextwriteHelper.contextname_StartToken="contextname=";
	theContextwriteHelper.contextname_StopToken="\n";

	theExtensionwriteHelper = new ExtensionwriteHelper();
	theExtensionwriteHelper.exten_StartToken="exten=";
	theExtensionwriteHelper.exten_StopToken="\n";
	theExtensionwriteHelper.priority_StartToken="priority=";
	theExtensionwriteHelper.priority_StopToken="\n";
	theExtensionwriteHelper.application_StartToken="application=";
	theExtensionwriteHelper.application_StopToken="\n";

	theSwitchwriteHelper = new SwitchwriteHelper();
	theSwitchwriteHelper.switchdialstr_StartToken="switchdialstr=";
	theSwitchwriteHelper.switchdialstr_StopToken="\n";

	theIncludecontextwriteHelper = new IncludecontextwriteHelper();
	theIncludecontextwriteHelper.contexname_StartToken="contexname=";
	theIncludecontextwriteHelper.contexname_StopToken="\n";
	theIncludecontextwriteHelper.timeing_StartToken="timeing=";
	theIncludecontextwriteHelper.timeing_StopToken="\n";

	theExtensionconfwriteHelper = new ExtensionconfwriteHelper();
	theExtensionconfwriteHelper.static__StartToken="static_=";
	theExtensionconfwriteHelper.static__StopToken="\n";
	theExtensionconfwriteHelper.writeprotect_StartToken="writeprotect=";
	theExtensionconfwriteHelper.writeprotect_StopToken="\n";
	theExtensionconfwriteHelper.autofallthrough_StartToken="autofallthrough=";
	theExtensionconfwriteHelper.autofallthrough_StopToken="\n";
	theExtensionconfwriteHelper.clearglobalvars_StartToken="clearglobalvars=";
	theExtensionconfwriteHelper.clearglobalvars_StopToken="\n";

	theIncludeconfigswriteHelper = new IncludeconfigswriteHelper();
	theIncludeconfigswriteHelper.configname_StartToken="configname=";
	theIncludeconfigswriteHelper.configname_StopToken="\n";

	theGlobalvarswriteHelper = new GlobalvarswriteHelper();
	theGlobalvarswriteHelper.name_StartToken="name=";
	theGlobalvarswriteHelper.name_StopToken="\n";
	theGlobalvarswriteHelper.value_StartToken="value=";
	theGlobalvarswriteHelper.value_StopToken="\n";

	
	}

}
