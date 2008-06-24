/*
 * (c) urs zeidler
 */
package com.useit.jact.model.musiconholdconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactorymusiconholdconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactorymusiconholdconf.java,v 1.1 2008/06/24 20:45:26 urszeidler Exp $ 
 */
public abstract class ModelFactorymusiconholdconf extends CompositeModelFactory {
   public static final String MODELNAME="musiconholdconf";
	public static final String MOHCLASSES=IMohClasses.MODELNAME;
	public static final String MUSIC_ON_HOLDCONF=IMusic_on_HoldConf.MODELNAME;

    public Object createModelElement(String modelName) {
        if(MOHCLASSES.equalsIgnoreCase(modelName))
            return new MohClassesImpl();
         if(MUSIC_ON_HOLDCONF.equalsIgnoreCase(modelName))
            return new Music_on_HoldConfImpl();
         if(MODELNAME.concat(".").concat(MOHCLASSES).equalsIgnoreCase(modelName))
            return  createModelElement_MohClasses();
         if(MODELNAME.concat(".").concat(MUSIC_ON_HOLDCONF).equalsIgnoreCase(modelName))
            return  createModelElement_Music_on_HoldConf();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IMohClasses.class.isAssignableFrom(modelClass))
            return  createModelElement_MohClasses();
        if(IMusic_on_HoldConf.class.isAssignableFrom(modelClass))
            return  createModelElement_Music_on_HoldConf();
        return super.createModelElement(modelClass);
    }

    public Object createModelElement(Object model) {
        // TODO Automatisch erstellter Methoden-Stub
        return super.createModelElement(model);
    }

    public Object createTypeFromString(String typeName, String value) {
		return super.createTypeFromString(typeName, value);
    }

    public Object createTypeFromString(Class type, String value) {
        return super.createTypeFromString(type, value);
    }

    public String typeToString(Object obj) {
        return super.typeToString(obj);
    }

 protected  Object createModelElement_MohClasses() {
            return new MohClassesImpl();
}
 protected  Object createModelElement_Music_on_HoldConf() {
            return new Music_on_HoldConfImpl();
}


    public boolean isAdapterFor(Class adapter,Object obj) {
        // TODO Automatisch erstellter Methoden-Stub
        return false;
    }

    public Object adapt(Class adapter,Object obj) {
        // TODO Automatisch erstellter Methoden-Stub
        return null;
    }

    public Object getAdapter(Class adapter) {
        // TODO Automatisch erstellter Methoden-Stub
        return null;
    }

}

