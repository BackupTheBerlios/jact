/*
 * (c) urs zeidler
 */
package com.useit.jact.model.featureconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactoryfeatureconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryfeatureconf.java,v 1.1 2008/06/24 20:45:12 urszeidler Exp $ 
 */
public abstract class ModelFactoryfeatureconf extends CompositeModelFactory {
   public static final String MODELNAME="featureconf";
	public static final String FEATUREMAP=IFeaturemap.MODELNAME;
	public static final String FEATURESCONF=IFeaturesconf.MODELNAME;

    public Object createModelElement(String modelName) {
        if(FEATUREMAP.equalsIgnoreCase(modelName))
            return new FeaturemapImpl();
         if(FEATURESCONF.equalsIgnoreCase(modelName))
            return new FeaturesconfImpl();
         if(MODELNAME.concat(".").concat(FEATUREMAP).equalsIgnoreCase(modelName))
            return  createModelElement_Featuremap();
         if(MODELNAME.concat(".").concat(FEATURESCONF).equalsIgnoreCase(modelName))
            return  createModelElement_Featuresconf();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IFeaturemap.class.isAssignableFrom(modelClass))
            return  createModelElement_Featuremap();
        if(IFeaturesconf.class.isAssignableFrom(modelClass))
            return  createModelElement_Featuresconf();
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

 protected  Object createModelElement_Featuremap() {
            return new FeaturemapImpl();
}
 protected  Object createModelElement_Featuresconf() {
            return new FeaturesconfImpl();
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

