/*
 * (c) urs zeidler
 */
package com.useit.jact.model.zaptelconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactoryzaptelconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryzaptelconf.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $ 
 */
public abstract class ModelFactoryzaptelconf extends CompositeModelFactory {
   public static final String MODELNAME="zaptelconf";
	public static final String ZAPTELCHANNELS=IZaptelchannels.MODELNAME;
	public static final String ZAPTELTONEZONE=IZapteltonezone.MODELNAME;
	public static final String ZAPTELSPAN=IZaptelspan.MODELNAME;
	public static final String ZAPTELDYNAMICSPAN=IZapteldynamicspan.MODELNAME;
	public static final String ZAPTELCONF=IZaptelconf.MODELNAME;

    public Object createModelElement(String modelName) {
        if(ZAPTELCHANNELS.equalsIgnoreCase(modelName))
            return new ZaptelchannelsImpl();
         if(ZAPTELTONEZONE.equalsIgnoreCase(modelName))
            return new ZapteltonezoneImpl();
         if(ZAPTELSPAN.equalsIgnoreCase(modelName))
            return new ZaptelspanImpl();
         if(ZAPTELDYNAMICSPAN.equalsIgnoreCase(modelName))
            return new ZapteldynamicspanImpl();
         if(ZAPTELCONF.equalsIgnoreCase(modelName))
            return new ZaptelconfImpl();
         if(MODELNAME.concat(".").concat(ZAPTELCHANNELS).equalsIgnoreCase(modelName))
            return  createModelElement_Zaptelchannels();
         if(MODELNAME.concat(".").concat(ZAPTELTONEZONE).equalsIgnoreCase(modelName))
            return  createModelElement_Zapteltonezone();
         if(MODELNAME.concat(".").concat(ZAPTELSPAN).equalsIgnoreCase(modelName))
            return  createModelElement_Zaptelspan();
         if(MODELNAME.concat(".").concat(ZAPTELDYNAMICSPAN).equalsIgnoreCase(modelName))
            return  createModelElement_Zapteldynamicspan();
         if(MODELNAME.concat(".").concat(ZAPTELCONF).equalsIgnoreCase(modelName))
            return  createModelElement_Zaptelconf();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IZaptelchannels.class.isAssignableFrom(modelClass))
            return  createModelElement_Zaptelchannels();
        if(IZapteltonezone.class.isAssignableFrom(modelClass))
            return  createModelElement_Zapteltonezone();
        if(IZaptelspan.class.isAssignableFrom(modelClass))
            return  createModelElement_Zaptelspan();
        if(IZapteldynamicspan.class.isAssignableFrom(modelClass))
            return  createModelElement_Zapteldynamicspan();
        if(IZaptelconf.class.isAssignableFrom(modelClass))
            return  createModelElement_Zaptelconf();
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

 protected  Object createModelElement_Zaptelchannels() {
            return new ZaptelchannelsImpl();
}
 protected  Object createModelElement_Zapteltonezone() {
            return new ZapteltonezoneImpl();
}
 protected  Object createModelElement_Zaptelspan() {
            return new ZaptelspanImpl();
}
 protected  Object createModelElement_Zapteldynamicspan() {
            return new ZapteldynamicspanImpl();
}
 protected  Object createModelElement_Zaptelconf() {
            return new ZaptelconfImpl();
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

