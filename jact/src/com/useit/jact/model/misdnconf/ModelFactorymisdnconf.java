/*
 * (c) urs zeidler
 */
package com.useit.jact.model.misdnconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactorymisdnconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactorymisdnconf.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $ 
 */
public abstract class ModelFactorymisdnconf extends CompositeModelFactory {
   public static final String MODELNAME="misdnconf";
	public static final String MISDNCONF=IMisdnconf.MODELNAME;
	public static final String MISDNCRYPTKEY=IMisdnCryptkey.MODELNAME;
	public static final String MISDNSECTIONS=IMisdnSections.MODELNAME;
	public static final String MISDNPORTS=IMisdnPorts.MODELNAME;

    public Object createModelElement(String modelName) {
        if(MISDNCONF.equalsIgnoreCase(modelName))
            return new MisdnconfImpl();
         if(MISDNCRYPTKEY.equalsIgnoreCase(modelName))
            return new MisdnCryptkeyImpl();
         if(MISDNSECTIONS.equalsIgnoreCase(modelName))
            return new MisdnSectionsImpl();
         if(MISDNPORTS.equalsIgnoreCase(modelName))
            return new MisdnPortsImpl();
         if(MODELNAME.concat(".").concat(MISDNCONF).equalsIgnoreCase(modelName))
            return  createModelElement_Misdnconf();
         if(MODELNAME.concat(".").concat(MISDNCRYPTKEY).equalsIgnoreCase(modelName))
            return  createModelElement_MisdnCryptkey();
         if(MODELNAME.concat(".").concat(MISDNSECTIONS).equalsIgnoreCase(modelName))
            return  createModelElement_MisdnSections();
         if(MODELNAME.concat(".").concat(MISDNPORTS).equalsIgnoreCase(modelName))
            return  createModelElement_MisdnPorts();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IMisdnconf.class.isAssignableFrom(modelClass))
            return  createModelElement_Misdnconf();
        if(IMisdnCryptkey.class.isAssignableFrom(modelClass))
            return  createModelElement_MisdnCryptkey();
        if(IMisdnSections.class.isAssignableFrom(modelClass))
            return  createModelElement_MisdnSections();
        if(IMisdnPorts.class.isAssignableFrom(modelClass))
            return  createModelElement_MisdnPorts();
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

 protected  Object createModelElement_Misdnconf() {
            return new MisdnconfImpl();
}
 protected  Object createModelElement_MisdnCryptkey() {
            return new MisdnCryptkeyImpl();
}
 protected  Object createModelElement_MisdnSections() {
            return new MisdnSectionsImpl();
}
 protected  Object createModelElement_MisdnPorts() {
            return new MisdnPortsImpl();
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

