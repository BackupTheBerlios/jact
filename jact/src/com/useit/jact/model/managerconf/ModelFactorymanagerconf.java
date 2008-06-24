/*
 * (c) urs zeidler
 */
package com.useit.jact.model.managerconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactorymanagerconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactorymanagerconf.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $ 
 */
public abstract class ModelFactorymanagerconf extends CompositeModelFactory {
   public static final String MODELNAME="managerconf";
	public static final String MANAGERSECTION=IManagerSection.MODELNAME;
	public static final String MANAGERDENY=IManagerdeny.MODELNAME;
	public static final String MANAGERPERMIT=IManagerpermit.MODELNAME;
	public static final String MANAGERGENERALSECTION=IManagergeneralSection.MODELNAME;

    public Object createModelElement(String modelName) {
        if(MANAGERSECTION.equalsIgnoreCase(modelName))
            return new ManagerSectionImpl();
         if(MANAGERDENY.equalsIgnoreCase(modelName))
            return new ManagerdenyImpl();
         if(MANAGERPERMIT.equalsIgnoreCase(modelName))
            return new ManagerpermitImpl();
         if(MANAGERGENERALSECTION.equalsIgnoreCase(modelName))
            return new ManagergeneralSectionImpl();
         if(MODELNAME.concat(".").concat(MANAGERSECTION).equalsIgnoreCase(modelName))
            return  createModelElement_ManagerSection();
         if(MODELNAME.concat(".").concat(MANAGERDENY).equalsIgnoreCase(modelName))
            return  createModelElement_Managerdeny();
         if(MODELNAME.concat(".").concat(MANAGERPERMIT).equalsIgnoreCase(modelName))
            return  createModelElement_Managerpermit();
         if(MODELNAME.concat(".").concat(MANAGERGENERALSECTION).equalsIgnoreCase(modelName))
            return  createModelElement_ManagergeneralSection();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IManagerSection.class.isAssignableFrom(modelClass))
            return  createModelElement_ManagerSection();
        if(IManagerdeny.class.isAssignableFrom(modelClass))
            return  createModelElement_Managerdeny();
        if(IManagerpermit.class.isAssignableFrom(modelClass))
            return  createModelElement_Managerpermit();
        if(IManagergeneralSection.class.isAssignableFrom(modelClass))
            return  createModelElement_ManagergeneralSection();
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

 protected  Object createModelElement_ManagerSection() {
            return new ManagerSectionImpl();
}
 protected  Object createModelElement_Managerdeny() {
            return new ManagerdenyImpl();
}
 protected  Object createModelElement_Managerpermit() {
            return new ManagerpermitImpl();
}
 protected  Object createModelElement_ManagergeneralSection() {
            return new ManagergeneralSectionImpl();
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

