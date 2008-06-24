/*
 * (c) urs zeidler
 */
package com.useit.jact.model.queueconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactoryqueueconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryqueueconf.java,v 1.1 2008/06/24 20:45:20 urszeidler Exp $ 
 */
public abstract class ModelFactoryqueueconf extends CompositeModelFactory {
   public static final String MODELNAME="queueconf";
	public static final String QUEUEGENERAL=IQueuegeneral.MODELNAME;
	public static final String QUEUESECTION=IQueuesection.MODELNAME;
	public static final String QUEUEMEMBER=IQueuemember.MODELNAME;

    public Object createModelElement(String modelName) {
        if(QUEUEGENERAL.equalsIgnoreCase(modelName))
            return new QueuegeneralImpl();
         if(QUEUESECTION.equalsIgnoreCase(modelName))
            return new QueuesectionImpl();
         if(QUEUEMEMBER.equalsIgnoreCase(modelName))
            return new QueuememberImpl();
         if(MODELNAME.concat(".").concat(QUEUEGENERAL).equalsIgnoreCase(modelName))
            return  createModelElement_Queuegeneral();
         if(MODELNAME.concat(".").concat(QUEUESECTION).equalsIgnoreCase(modelName))
            return  createModelElement_Queuesection();
         if(MODELNAME.concat(".").concat(QUEUEMEMBER).equalsIgnoreCase(modelName))
            return  createModelElement_Queuemember();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IQueuegeneral.class.isAssignableFrom(modelClass))
            return  createModelElement_Queuegeneral();
        if(IQueuesection.class.isAssignableFrom(modelClass))
            return  createModelElement_Queuesection();
        if(IQueuemember.class.isAssignableFrom(modelClass))
            return  createModelElement_Queuemember();
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

 protected  Object createModelElement_Queuegeneral() {
            return new QueuegeneralImpl();
}
 protected  Object createModelElement_Queuesection() {
            return new QueuesectionImpl();
}
 protected  Object createModelElement_Queuemember() {
            return new QueuememberImpl();
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

