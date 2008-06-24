/*
 * (c) urs zeidler
 */
package com.useit.jact.model.sipconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactorysipconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactorysipconf.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $ 
 */
public abstract class ModelFactorysipconf extends CompositeModelFactory {
   public static final String MODELNAME="sipconf";
	public static final String SIPREGISTER=ISipregister.MODELNAME;
	public static final String SIPAUTH=ISipauth.MODELNAME;
	public static final String SIPCONF=ISipConf.MODELNAME;
	public static final String SIPPEERS=ISippeers.MODELNAME;
	public static final String SIPGENERAL=ISipgeneral.MODELNAME;

    public Object createModelElement(String modelName) {
        if(SIPREGISTER.equalsIgnoreCase(modelName))
            return new SipregisterImpl();
         if(SIPAUTH.equalsIgnoreCase(modelName))
            return new SipauthImpl();
         if(SIPCONF.equalsIgnoreCase(modelName))
            return new SipConfImpl();
         if(SIPPEERS.equalsIgnoreCase(modelName))
            return new SippeersImpl();
         if(SIPGENERAL.equalsIgnoreCase(modelName))
            return new SipgeneralImpl();
         if(MODELNAME.concat(".").concat(SIPREGISTER).equalsIgnoreCase(modelName))
            return  createModelElement_Sipregister();
         if(MODELNAME.concat(".").concat(SIPAUTH).equalsIgnoreCase(modelName))
            return  createModelElement_Sipauth();
         if(MODELNAME.concat(".").concat(SIPCONF).equalsIgnoreCase(modelName))
            return  createModelElement_SipConf();
         if(MODELNAME.concat(".").concat(SIPPEERS).equalsIgnoreCase(modelName))
            return  createModelElement_Sippeers();
         if(MODELNAME.concat(".").concat(SIPGENERAL).equalsIgnoreCase(modelName))
            return  createModelElement_Sipgeneral();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(ISipregister.class.isAssignableFrom(modelClass))
            return  createModelElement_Sipregister();
        if(ISipauth.class.isAssignableFrom(modelClass))
            return  createModelElement_Sipauth();
        if(ISipConf.class.isAssignableFrom(modelClass))
            return  createModelElement_SipConf();
        if(ISippeers.class.isAssignableFrom(modelClass))
            return  createModelElement_Sippeers();
        if(ISipgeneral.class.isAssignableFrom(modelClass))
            return  createModelElement_Sipgeneral();
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

 protected  Object createModelElement_Sipregister() {
            return new SipregisterImpl();
}
 protected  Object createModelElement_Sipauth() {
            return new SipauthImpl();
}
 protected  Object createModelElement_SipConf() {
            return new SipConfImpl();
}
 protected  Object createModelElement_Sippeers() {
            return new SippeersImpl();
}
 protected  Object createModelElement_Sipgeneral() {
            return new SipgeneralImpl();
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

