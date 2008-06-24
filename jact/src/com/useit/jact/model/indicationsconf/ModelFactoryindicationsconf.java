/*
 * (c) urs zeidler
 */
package com.useit.jact.model.indicationsconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactoryindicationsconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryindicationsconf.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $ 
 */
public abstract class ModelFactoryindicationsconf extends CompositeModelFactory {
   public static final String MODELNAME="indicationsconf";
	public static final String TONEDEFINITIONS=IToneDefinitions.MODELNAME;
	public static final String CUSTOMTONE=ICustomTone.MODELNAME;
	public static final String INDICATIONSCONF=IIndicationsconf.MODELNAME;

    public Object createModelElement(String modelName) {
        if(TONEDEFINITIONS.equalsIgnoreCase(modelName))
            return new ToneDefinitionsImpl();
         if(CUSTOMTONE.equalsIgnoreCase(modelName))
            return new CustomToneImpl();
         if(INDICATIONSCONF.equalsIgnoreCase(modelName))
            return new IndicationsconfImpl();
         if(MODELNAME.concat(".").concat(TONEDEFINITIONS).equalsIgnoreCase(modelName))
            return  createModelElement_ToneDefinitions();
         if(MODELNAME.concat(".").concat(CUSTOMTONE).equalsIgnoreCase(modelName))
            return  createModelElement_CustomTone();
         if(MODELNAME.concat(".").concat(INDICATIONSCONF).equalsIgnoreCase(modelName))
            return  createModelElement_Indicationsconf();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IToneDefinitions.class.isAssignableFrom(modelClass))
            return  createModelElement_ToneDefinitions();
        if(ICustomTone.class.isAssignableFrom(modelClass))
            return  createModelElement_CustomTone();
        if(IIndicationsconf.class.isAssignableFrom(modelClass))
            return  createModelElement_Indicationsconf();
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

 protected  Object createModelElement_ToneDefinitions() {
            return new ToneDefinitionsImpl();
}
 protected  Object createModelElement_CustomTone() {
            return new CustomToneImpl();
}
 protected  Object createModelElement_Indicationsconf() {
            return new IndicationsconfImpl();
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

