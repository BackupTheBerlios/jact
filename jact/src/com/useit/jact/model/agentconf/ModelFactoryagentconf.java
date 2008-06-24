/*
 * (c) urs zeidler
 */
package com.useit.jact.model.agentconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactoryagentconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryagentconf.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $ 
 */
public abstract class ModelFactoryagentconf extends CompositeModelFactory {
   public static final String MODELNAME="agentconf";
	public static final String AGENTS=IAgents.MODELNAME;
	public static final String AGENTSCONF=IAgentsconf.MODELNAME;
	public static final String AGENTSRECORDING=IAgentsrecording.MODELNAME;

    public Object createModelElement(String modelName) {
        if(AGENTS.equalsIgnoreCase(modelName))
            return new AgentsImpl();
         if(AGENTSCONF.equalsIgnoreCase(modelName))
            return new AgentsconfImpl();
         if(AGENTSRECORDING.equalsIgnoreCase(modelName))
            return new AgentsrecordingImpl();
         if(MODELNAME.concat(".").concat(AGENTS).equalsIgnoreCase(modelName))
            return  createModelElement_Agents();
         if(MODELNAME.concat(".").concat(AGENTSCONF).equalsIgnoreCase(modelName))
            return  createModelElement_Agentsconf();
         if(MODELNAME.concat(".").concat(AGENTSRECORDING).equalsIgnoreCase(modelName))
            return  createModelElement_Agentsrecording();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IAgents.class.isAssignableFrom(modelClass))
            return  createModelElement_Agents();
        if(IAgentsconf.class.isAssignableFrom(modelClass))
            return  createModelElement_Agentsconf();
        if(IAgentsrecording.class.isAssignableFrom(modelClass))
            return  createModelElement_Agentsrecording();
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

 protected  Object createModelElement_Agents() {
            return new AgentsImpl();
}
 protected  Object createModelElement_Agentsconf() {
            return new AgentsconfImpl();
}
 protected  Object createModelElement_Agentsrecording() {
            return new AgentsrecordingImpl();
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

