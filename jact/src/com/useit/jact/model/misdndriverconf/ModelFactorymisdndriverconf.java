/*
 * (c) urs zeidler
 */
package com.useit.jact.model.misdndriverconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactorymisdndriverconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactorymisdndriverconf.java,v 1.1 2008/06/24 20:45:01 urszeidler Exp $ 
 */
public abstract class ModelFactorymisdndriverconf extends CompositeModelFactory {
   public static final String MODELNAME="misdndriverconf";
	public static final String MISDNCARDPORTS=IMisdncardPorts.MODELNAME;
	public static final String MISDNCARDS=IMisdnCards.MODELNAME;
	public static final String MISDNDRIVERCONF=IMisdnDriverConf.MODELNAME;

    public Object createModelElement(String modelName) {
        if(MISDNCARDPORTS.equalsIgnoreCase(modelName))
            return new MisdncardPortsImpl();
         if(MISDNCARDS.equalsIgnoreCase(modelName))
            return new MisdnCardsImpl();
         if(MISDNDRIVERCONF.equalsIgnoreCase(modelName))
            return new MisdnDriverConfImpl();
         if(MODELNAME.concat(".").concat(MISDNCARDPORTS).equalsIgnoreCase(modelName))
            return  createModelElement_MisdncardPorts();
         if(MODELNAME.concat(".").concat(MISDNCARDS).equalsIgnoreCase(modelName))
            return  createModelElement_MisdnCards();
         if(MODELNAME.concat(".").concat(MISDNDRIVERCONF).equalsIgnoreCase(modelName))
            return  createModelElement_MisdnDriverConf();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IMisdncardPorts.class.isAssignableFrom(modelClass))
            return  createModelElement_MisdncardPorts();
        if(IMisdnCards.class.isAssignableFrom(modelClass))
            return  createModelElement_MisdnCards();
        if(IMisdnDriverConf.class.isAssignableFrom(modelClass))
            return  createModelElement_MisdnDriverConf();
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

 protected  Object createModelElement_MisdncardPorts() {
            return new MisdncardPortsImpl();
}
 protected  Object createModelElement_MisdnCards() {
            return new MisdnCardsImpl();
}
 protected  Object createModelElement_MisdnDriverConf() {
            return new MisdnDriverConfImpl();
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

