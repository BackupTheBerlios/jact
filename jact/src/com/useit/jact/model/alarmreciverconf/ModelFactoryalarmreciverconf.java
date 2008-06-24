/*
 * (c) urs zeidler
 */
package com.useit.jact.model.alarmreciverconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactoryalarmreciverconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryalarmreciverconf.java,v 1.1 2008/06/24 20:45:23 urszeidler Exp $ 
 */
public abstract class ModelFactoryalarmreciverconf extends CompositeModelFactory {
   public static final String MODELNAME="alarmreciverconf";
	public static final String ALARMRECEIVERCONF=IAlarmreceiverconf.MODELNAME;

    public Object createModelElement(String modelName) {
        if(ALARMRECEIVERCONF.equalsIgnoreCase(modelName))
            return new AlarmreceiverconfImpl();
         if(MODELNAME.concat(".").concat(ALARMRECEIVERCONF).equalsIgnoreCase(modelName))
            return  createModelElement_Alarmreceiverconf();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IAlarmreceiverconf.class.isAssignableFrom(modelClass))
            return  createModelElement_Alarmreceiverconf();
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

 protected  Object createModelElement_Alarmreceiverconf() {
            return new AlarmreceiverconfImpl();
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

