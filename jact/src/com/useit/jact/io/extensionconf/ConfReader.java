/*
 * (c) urs zeidler
 */
package com.useit.jact.io.extensionconf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.ContextImpl;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.ExtensionImpl;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.ExtensionconfImpl;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.GlobalvarsImpl;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.IncludeconfigsImpl;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.IncludecontextImpl;
import com.useit.jact.model.extensionconf.Switch;
import com.useit.jact.model.extensionconf.SwitchImpl;
import com.useit.jact.model.types.PbxApplication;
import com.useit.jact.model.types.PbxContext;


/** 
 * <p> 
 * ConfReader , die Abstract Confreader klasse, zerlegt per tokenieser den Stringstream in 
 * entrys
 * </p> 
 * Created : 31.08.2005 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ConfReader.java,v 1.1 2008/06/24 20:45:24 urszeidler Exp $ 
 */
public class ConfReader extends AbstractConfReader{

    /**
     * 
     */
    public ConfReader() {
        super();
     }
    
    /**
     * ließt den file und bildet die Entrylist
     * @param file
     * @throws FileNotFoundException
     * @throws IOException
     */
     public void readConfFile(String file) throws FileNotFoundException, IOException{
        String content = readStringFromFile(new File(file), 500);
        buildEntryList(content);
        
        
    }


    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingContextEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Context objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Context buildContextModelElement(List aEntryList){
        Context impl = new ContextImpl();
        buildContextModelVaues(aEntryList,impl);
        buildContextModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildContextModelAgg(List entryList,Context impl) {

    //aggregate schreiben
   //maps schreiben
		// ExtensionMap
        for (Iterator iter = impl.getExtensionMap().iterator(); iter.hasNext();) {
            Extension aExtensionM = buildExtensionModelElement(entryList);
            impl.addExtension( aExtensionM);
            //Extension mobj = (Extension) iter.next();
            //writeExtension(strB,mobj);           
        }
		// IncludecontextMap
        for (Iterator iter = impl.getIncludecontextMap().iterator(); iter.hasNext();) {
            Includecontext aIncludecontextM = buildIncludecontextModelElement(entryList);
            impl.addIncludecontext( aIncludecontextM);
            //Includecontext mobj = (Includecontext) iter.next();
            //writeIncludecontext(strB,mobj);           
        }
		// SwitchMap
        for (Iterator iter = impl.getSwitchMap().iterator(); iter.hasNext();) {
            Switch aSwitchM = buildSwitchModelElement(entryList);
            impl.addSwitch( aSwitchM);
            //Switch mobj = (Switch) iter.next();
            //writeSwitch(strB,mobj);           
        }
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildContextModelVaues(List entryList,Context impl) {
		String val=null;
		val = findConfValue("contextname",entryList);
		if(val!=null)
		impl.setContextname(
			 val
			);
 
		val = findConfValue("ignorepat",entryList);
		if(val!=null)
		impl.setIgnorepat(
			 val
			);
 
    }
    

    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingExtensionEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Extension objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Extension buildExtensionModelElement(List aEntryList){
        Extension impl = new ExtensionImpl();
        buildExtensionModelVaues(aEntryList,impl);
        buildExtensionModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildExtensionModelAgg(List entryList,Extension impl) {

    //aggregate schreiben
   //maps schreiben
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildExtensionModelVaues(List entryList,Extension impl) {
		String val=null;
		val = findConfValue("exten",entryList);
		if(val!=null)
		impl.setExten(
			 val
			);
 
		val = findConfValue("priority",entryList);
		if(val!=null)
		impl.setPriority(
				new Integer(val)
				);
 
		val = findConfValue("application",entryList);
		if(val!=null)
		impl.setApplication(
				new PbxApplication(val)
				);
 
    }
    

    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingSwitchEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Switch objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Switch buildSwitchModelElement(List aEntryList){
        Switch impl = new SwitchImpl();
        buildSwitchModelVaues(aEntryList,impl);
        buildSwitchModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildSwitchModelAgg(List entryList,Switch impl) {

    //aggregate schreiben
   //maps schreiben
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildSwitchModelVaues(List entryList,Switch impl) {
		String val=null;
		val = findConfValue("switchdialstr",entryList);
		if(val!=null)
		impl.setSwitchdialstr(
			 val
			);
 
    }
    

    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingIncludecontextEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Includecontext objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Includecontext buildIncludecontextModelElement(List aEntryList){
        Includecontext impl = new IncludecontextImpl();
        buildIncludecontextModelVaues(aEntryList,impl);
        buildIncludecontextModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildIncludecontextModelAgg(List entryList,Includecontext impl) {

    //aggregate schreiben
   //maps schreiben
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildIncludecontextModelVaues(List entryList,Includecontext impl) {
		String val=null;
		val = findConfValue("contexname",entryList);
		if(val!=null)
		impl.setContexname(
				new PbxContext(val)
				);
 
		val = findConfValue("timeing",entryList);
		if(val!=null)
		impl.setTimeing(
			 val
			);
 
    }
    

    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingExtensionconfEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Extensionconf objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Extensionconf buildExtensionconfModelElement(List aEntryList){
        Extensionconf impl = new ExtensionconfImpl();
        buildExtensionconfModelVaues(aEntryList,impl);
        buildExtensionconfModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildExtensionconfModelAgg(List entryList,Extensionconf impl) {

    //aggregate schreiben
   //maps schreiben
		// ContextMap
        for (Iterator iter = impl.getContextMap().iterator(); iter.hasNext();) {
            Context aContextM = buildContextModelElement(entryList);
            impl.addContext( aContextM);
            //Context mobj = (Context) iter.next();
            //writeContext(strB,mobj);           
        }
		// GlobalvarsMap
        for (Iterator iter = impl.getGlobalvarsMap().iterator(); iter.hasNext();) {
            Globalvars aGlobalvarsM = buildGlobalvarsModelElement(entryList);
            impl.addGlobalvars( aGlobalvarsM);
            //Globalvars mobj = (Globalvars) iter.next();
            //writeGlobalvars(strB,mobj);           
        }
		// IncludeconfigsMap
        for (Iterator iter = impl.getIncludeconfigsMap().iterator(); iter.hasNext();) {
            Includeconfigs aIncludeconfigsM = buildIncludeconfigsModelElement(entryList);
            impl.addIncludeconfigs( aIncludeconfigsM);
            //Includeconfigs mobj = (Includeconfigs) iter.next();
            //writeIncludeconfigs(strB,mobj);           
        }
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildExtensionconfModelVaues(List entryList,Extensionconf impl) {
		String val=null;
		val = findConfValue("static_",entryList);
		if(val!=null)
		impl.setStatic_(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("writeprotect",entryList);
		if(val!=null)
		impl.setWriteprotect(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("autofallthrough",entryList);
		if(val!=null)
		impl.setAutofallthrough(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
		val = findConfValue("clearglobalvars",entryList);
		if(val!=null)
		impl.setClearglobalvars(
						com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val)
				);
 
    }
    

    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingIncludeconfigsEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Includeconfigs objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Includeconfigs buildIncludeconfigsModelElement(List aEntryList){
        Includeconfigs impl = new IncludeconfigsImpl();
        buildIncludeconfigsModelVaues(aEntryList,impl);
        buildIncludeconfigsModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildIncludeconfigsModelAgg(List entryList,Includeconfigs impl) {

    //aggregate schreiben
   //maps schreiben
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildIncludeconfigsModelVaues(List entryList,Includeconfigs impl) {
		String val=null;
		val = findConfValue("configname",entryList);
		if(val!=null)
		impl.setConfigname(
			 val
			);
 
    }
    

    /**
      * gibt gelegenheit die entry liste neu zu bestimmen
      * @return
      */
    protected List getWorkingGlobalvarsEntryList(){
        return entrylist;
        
    }
    
   /**
     * erzeugt ein Globalvars objekt und ließt die entry list dafür ein
     * @param aEntryList
     * @return
     */
    protected Globalvars buildGlobalvarsModelElement(List aEntryList){
        Globalvars impl = new GlobalvarsImpl();
        buildGlobalvarsModelVaues(aEntryList,impl);
        buildGlobalvarsModelAgg(aEntryList,impl);
        
        return impl;
    }
     /**
     * @param entryList
     * @param impl
     */
    protected void buildGlobalvarsModelAgg(List entryList,Globalvars impl) {

    //aggregate schreiben
   //maps schreiben
    }
    /**
     * füllt das object mit den werten der entrylist
     * @param entryList
     * @param impl
     */
    protected void buildGlobalvarsModelVaues(List entryList,Globalvars impl) {
		String val=null;
		val = findConfValue("name",entryList);
		if(val!=null)
		impl.setName(
			 val
			);
 
		val = findConfValue("value",entryList);
		if(val!=null)
		impl.setValue(
			 val
			);
 
    }
    

}

