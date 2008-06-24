/*
 * (c) urs zeidler
 */
package com.useit.jact.model.voicemailconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactoryvoicemailconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryvoicemailconf.java,v 1.1 2008/06/24 20:45:17 urszeidler Exp $ 
 */
public abstract class ModelFactoryvoicemailconf extends CompositeModelFactory {
   public static final String MODELNAME="voicemailconf";
	public static final String VOICEMAILGENERAL=IVoicemailgeneral.MODELNAME;
	public static final String VOICEMAILCONF=IVoicemailConf.MODELNAME;
	public static final String VOICEMAILCONTEXT=IVoicemailcontext.MODELNAME;
	public static final String ZONEMESSAGES=IZonemessages.MODELNAME;
	public static final String VOICEMAILCONTEXTENTRY=IVoicemailcontextentry.MODELNAME;

    public Object createModelElement(String modelName) {
        if(VOICEMAILGENERAL.equalsIgnoreCase(modelName))
            return new VoicemailgeneralImpl();
         if(VOICEMAILCONF.equalsIgnoreCase(modelName))
            return new VoicemailConfImpl();
         if(VOICEMAILCONTEXT.equalsIgnoreCase(modelName))
            return new VoicemailcontextImpl();
         if(ZONEMESSAGES.equalsIgnoreCase(modelName))
            return new ZonemessagesImpl();
         if(VOICEMAILCONTEXTENTRY.equalsIgnoreCase(modelName))
            return new VoicemailcontextentryImpl();
         if(MODELNAME.concat(".").concat(VOICEMAILGENERAL).equalsIgnoreCase(modelName))
            return  createModelElement_Voicemailgeneral();
         if(MODELNAME.concat(".").concat(VOICEMAILCONF).equalsIgnoreCase(modelName))
            return  createModelElement_VoicemailConf();
         if(MODELNAME.concat(".").concat(VOICEMAILCONTEXT).equalsIgnoreCase(modelName))
            return  createModelElement_Voicemailcontext();
         if(MODELNAME.concat(".").concat(ZONEMESSAGES).equalsIgnoreCase(modelName))
            return  createModelElement_Zonemessages();
         if(MODELNAME.concat(".").concat(VOICEMAILCONTEXTENTRY).equalsIgnoreCase(modelName))
            return  createModelElement_Voicemailcontextentry();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IVoicemailgeneral.class.isAssignableFrom(modelClass))
            return  createModelElement_Voicemailgeneral();
        if(IVoicemailConf.class.isAssignableFrom(modelClass))
            return  createModelElement_VoicemailConf();
        if(IVoicemailcontext.class.isAssignableFrom(modelClass))
            return  createModelElement_Voicemailcontext();
        if(IZonemessages.class.isAssignableFrom(modelClass))
            return  createModelElement_Zonemessages();
        if(IVoicemailcontextentry.class.isAssignableFrom(modelClass))
            return  createModelElement_Voicemailcontextentry();
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

 protected  Object createModelElement_Voicemailgeneral() {
            return new VoicemailgeneralImpl();
}
 protected  Object createModelElement_VoicemailConf() {
            return new VoicemailConfImpl();
}
 protected  Object createModelElement_Voicemailcontext() {
            return new VoicemailcontextImpl();
}
 protected  Object createModelElement_Zonemessages() {
            return new ZonemessagesImpl();
}
 protected  Object createModelElement_Voicemailcontextentry() {
            return new VoicemailcontextentryImpl();
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

