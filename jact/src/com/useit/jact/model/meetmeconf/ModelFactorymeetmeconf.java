/*
 * (c) urs zeidler
 */
package com.useit.jact.model.meetmeconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactorymeetmeconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactorymeetmeconf.java,v 1.1 2008/06/24 20:45:17 urszeidler Exp $ 
 */
public abstract class ModelFactorymeetmeconf extends CompositeModelFactory {
   public static final String MODELNAME="meetmeconf";
	public static final String MEETMECONF=IMeetmeconf.MODELNAME;
	public static final String MEETMEROOMS=IMeetmerooms.MODELNAME;

    public Object createModelElement(String modelName) {
        if(MEETMECONF.equalsIgnoreCase(modelName))
            return new MeetmeconfImpl();
         if(MEETMEROOMS.equalsIgnoreCase(modelName))
            return new MeetmeroomsImpl();
         if(MODELNAME.concat(".").concat(MEETMECONF).equalsIgnoreCase(modelName))
            return  createModelElement_Meetmeconf();
         if(MODELNAME.concat(".").concat(MEETMEROOMS).equalsIgnoreCase(modelName))
            return  createModelElement_Meetmerooms();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IMeetmeconf.class.isAssignableFrom(modelClass))
            return  createModelElement_Meetmeconf();
        if(IMeetmerooms.class.isAssignableFrom(modelClass))
            return  createModelElement_Meetmerooms();
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

 protected  Object createModelElement_Meetmeconf() {
            return new MeetmeconfImpl();
}
 protected  Object createModelElement_Meetmerooms() {
            return new MeetmeroomsImpl();
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

