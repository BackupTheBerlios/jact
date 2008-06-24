/*
 * (c) urs zeidler
 */
package com.useit.jact.model.iaxconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactoryiaxconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryiaxconf.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $ 
 */
public abstract class ModelFactoryiaxconf extends CompositeModelFactory {
   public static final String MODELNAME="iaxconf";
	public static final String IAXJITTER=IIaxjitter.MODELNAME;
	public static final String IAXREGISTER=IIaxregister.MODELNAME;
	public static final String IAXDENY=IIaxdeny.MODELNAME;
	public static final String IAXPERMIT=IIaxpermit.MODELNAME;
	public static final String IAXPEER=IIaxpeer.MODELNAME;
	public static final String IAXGENERAL=IIaxgeneral.MODELNAME;

    public Object createModelElement(String modelName) {
        if(IAXJITTER.equalsIgnoreCase(modelName))
            return new IaxjitterImpl();
         if(IAXREGISTER.equalsIgnoreCase(modelName))
            return new IaxregisterImpl();
         if(IAXDENY.equalsIgnoreCase(modelName))
            return new IaxdenyImpl();
         if(IAXPERMIT.equalsIgnoreCase(modelName))
            return new IaxpermitImpl();
         if(IAXPEER.equalsIgnoreCase(modelName))
            return new IaxpeerImpl();
         if(IAXGENERAL.equalsIgnoreCase(modelName))
            return new IaxgeneralImpl();
         if(MODELNAME.concat(".").concat(IAXJITTER).equalsIgnoreCase(modelName))
            return  createModelElement_Iaxjitter();
         if(MODELNAME.concat(".").concat(IAXREGISTER).equalsIgnoreCase(modelName))
            return  createModelElement_Iaxregister();
         if(MODELNAME.concat(".").concat(IAXDENY).equalsIgnoreCase(modelName))
            return  createModelElement_Iaxdeny();
         if(MODELNAME.concat(".").concat(IAXPERMIT).equalsIgnoreCase(modelName))
            return  createModelElement_Iaxpermit();
         if(MODELNAME.concat(".").concat(IAXPEER).equalsIgnoreCase(modelName))
            return  createModelElement_Iaxpeer();
         if(MODELNAME.concat(".").concat(IAXGENERAL).equalsIgnoreCase(modelName))
            return  createModelElement_Iaxgeneral();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IIaxjitter.class.isAssignableFrom(modelClass))
            return  createModelElement_Iaxjitter();
        if(IIaxregister.class.isAssignableFrom(modelClass))
            return  createModelElement_Iaxregister();
        if(IIaxdeny.class.isAssignableFrom(modelClass))
            return  createModelElement_Iaxdeny();
        if(IIaxpermit.class.isAssignableFrom(modelClass))
            return  createModelElement_Iaxpermit();
        if(IIaxpeer.class.isAssignableFrom(modelClass))
            return  createModelElement_Iaxpeer();
        if(IIaxgeneral.class.isAssignableFrom(modelClass))
            return  createModelElement_Iaxgeneral();
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

 protected  Object createModelElement_Iaxjitter() {
            return new IaxjitterImpl();
}
 protected  Object createModelElement_Iaxregister() {
            return new IaxregisterImpl();
}
 protected  Object createModelElement_Iaxdeny() {
            return new IaxdenyImpl();
}
 protected  Object createModelElement_Iaxpermit() {
            return new IaxpermitImpl();
}
 protected  Object createModelElement_Iaxpeer() {
            return new IaxpeerImpl();
}
 protected  Object createModelElement_Iaxgeneral() {
            return new IaxgeneralImpl();
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

