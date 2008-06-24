/*
 * (c) urs zeidler
 */
package com.useit.jact.model.extensionconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactoryextensionconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryextensionconf.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $ 
 */
public abstract class ModelFactoryextensionconf extends CompositeModelFactory {
   public static final String MODELNAME="extensionconf";
	public static final String EXTENSION=IExtension.MODELNAME;
	public static final String CONTEXT=IContext.MODELNAME;
	public static final String INCLUDECONTEXT=IIncludecontext.MODELNAME;
	public static final String SWITCH=ISwitch.MODELNAME;
	public static final String EXTENSIONCONF=IExtensionconf.MODELNAME;
	public static final String GLOBALVARS=IGlobalvars.MODELNAME;
	public static final String INCLUDECONFIGS=IIncludeconfigs.MODELNAME;

    public Object createModelElement(String modelName) {
        if(EXTENSION.equalsIgnoreCase(modelName))
            return new ExtensionImpl();
         if(CONTEXT.equalsIgnoreCase(modelName))
            return new ContextImpl();
         if(INCLUDECONTEXT.equalsIgnoreCase(modelName))
            return new IncludecontextImpl();
         if(SWITCH.equalsIgnoreCase(modelName))
            return new SwitchImpl();
         if(EXTENSIONCONF.equalsIgnoreCase(modelName))
            return new ExtensionconfImpl();
         if(GLOBALVARS.equalsIgnoreCase(modelName))
            return new GlobalvarsImpl();
         if(INCLUDECONFIGS.equalsIgnoreCase(modelName))
            return new IncludeconfigsImpl();
         if(MODELNAME.concat(".").concat(EXTENSION).equalsIgnoreCase(modelName))
            return  createModelElement_Extension();
         if(MODELNAME.concat(".").concat(CONTEXT).equalsIgnoreCase(modelName))
            return  createModelElement_Context();
         if(MODELNAME.concat(".").concat(INCLUDECONTEXT).equalsIgnoreCase(modelName))
            return  createModelElement_Includecontext();
         if(MODELNAME.concat(".").concat(SWITCH).equalsIgnoreCase(modelName))
            return  createModelElement_Switch();
         if(MODELNAME.concat(".").concat(EXTENSIONCONF).equalsIgnoreCase(modelName))
            return  createModelElement_Extensionconf();
         if(MODELNAME.concat(".").concat(GLOBALVARS).equalsIgnoreCase(modelName))
            return  createModelElement_Globalvars();
         if(MODELNAME.concat(".").concat(INCLUDECONFIGS).equalsIgnoreCase(modelName))
            return  createModelElement_Includeconfigs();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IExtension.class.isAssignableFrom(modelClass))
            return  createModelElement_Extension();
        if(IContext.class.isAssignableFrom(modelClass))
            return  createModelElement_Context();
        if(IIncludecontext.class.isAssignableFrom(modelClass))
            return  createModelElement_Includecontext();
        if(ISwitch.class.isAssignableFrom(modelClass))
            return  createModelElement_Switch();
        if(IExtensionconf.class.isAssignableFrom(modelClass))
            return  createModelElement_Extensionconf();
        if(IGlobalvars.class.isAssignableFrom(modelClass))
            return  createModelElement_Globalvars();
        if(IIncludeconfigs.class.isAssignableFrom(modelClass))
            return  createModelElement_Includeconfigs();
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

 protected  Object createModelElement_Extension() {
            return new ExtensionImpl();
}
 protected  Object createModelElement_Context() {
            return new ContextImpl();
}
 protected  Object createModelElement_Includecontext() {
            return new IncludecontextImpl();
}
 protected  Object createModelElement_Switch() {
            return new SwitchImpl();
}
 protected  Object createModelElement_Extensionconf() {
            return new ExtensionconfImpl();
}
 protected  Object createModelElement_Globalvars() {
            return new GlobalvarsImpl();
}
 protected  Object createModelElement_Includeconfigs() {
            return new IncludeconfigsImpl();
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

