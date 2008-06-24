/*
 * (c) urs zeidler
 */
package com.useit.jact.model.types;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactorypxbtypes
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactorypxbtypes.java,v 1.1 2008/06/24 20:45:01 urszeidler Exp $ 
 */
public abstract class ModelFactorypxbtypes extends CompositeModelFactory {
    public static final String MODELNAME="pxbtypes";
//	public static final String MISDNPORTOPTIONSSET=IMisdnPortOptionsSet.MODELNAME;
//	public static final String MCARDOPTIONSET=IMCardOptionSet.MODELNAME;
//	public static final String MISDNCARDTYPESSET=IMisdnCardTypesSet.MODELNAME;
//	public static final String PEERTYPESET=IPeerTypeSet.MODELNAME;
//	public static final String MPORTOPTIONSET=IMPortOptionSet.MODELNAME;
//	public static final String DIALPLANSET=IDialplanSet.MODELNAME;
//	public static final String CODECSSET=ICodecsSet.MODELNAME;
//	public static final String PRESENTATIONSET=IPresentationSet.MODELNAME;
//	public static final String DTMFMODESET=IDtmfmodeSet.MODELNAME;
//	public static final String PBXCONTEXT=IPbxContext.MODELNAME;
//	public static final String APPLICATION=IApplication.MODELNAME;
//	public static final String SWITCHTYPESET=ISwitchtypeSet.MODELNAME;
//	public static final String SIGNALLINGSET=ISignallingSet.MODELNAME;
//	public static final String AMAFLAGSSET=IAmaflagsSet.MODELNAME;
//	public static final String ABSTRACTEXTENSION=IAbstractExtension.MODELNAME;
       public static final String MISDNPORTOPTIONS = "MisdnPortOptions";
       public static final String MCARDOPTION = "MCardOption";
       public static final String MISDNCARDTYPES = "MisdnCardTypes";
       public static final String PEERTYPE = "PeerType";
       public static final String MPORTOPTION = "MPortOption";
       public static final String DIALPLAN = "Dialplan";
       public static final String CODECS = "Codecs";
       public static final String PRESENTATION = "Presentation";
       public static final String DTMFMODE = "Dtmfmode";
       public static final String SWITCHTYPE = "Switchtype";
       public static final String SIGNALLING = "Signalling";
       public static final String AMAFLAGS = "Amaflags";

    public Object createModelElement(String modelName) {
//        if(MISDNPORTOPTIONSSET.equalsIgnoreCase(modelName))
//            return  createModelElement_MisdnPortOptionsSet();
//         if(MCARDOPTIONSET.equalsIgnoreCase(modelName))
//            return  createModelElement_MCardOptionSet();
//         if(MISDNCARDTYPESSET.equalsIgnoreCase(modelName))
//            return  createModelElement_MisdnCardTypesSet();
//         if(PEERTYPESET.equalsIgnoreCase(modelName))
//            return  createModelElement_PeerTypeSet();
//         if(MPORTOPTIONSET.equalsIgnoreCase(modelName))
//            return  createModelElement_MPortOptionSet();
//         if(DIALPLANSET.equalsIgnoreCase(modelName))
//            return  createModelElement_DialplanSet();
//         if(CODECSSET.equalsIgnoreCase(modelName))
//            return  createModelElement_CodecsSet();
//         if(PRESENTATIONSET.equalsIgnoreCase(modelName))
//            return  createModelElement_PresentationSet();
//         if(DTMFMODESET.equalsIgnoreCase(modelName))
//            return  createModelElement_DtmfmodeSet();
//         if(PBXCONTEXT.equalsIgnoreCase(modelName))
//            return  createModelElement_PbxContext();
//         if(APPLICATION.equalsIgnoreCase(modelName))
//            return  createModelElement_Application();
//         if(SWITCHTYPESET.equalsIgnoreCase(modelName))
//            return  createModelElement_SwitchtypeSet();
//         if(SIGNALLINGSET.equalsIgnoreCase(modelName))
//            return  createModelElement_SignallingSet();
//         if(AMAFLAGSSET.equalsIgnoreCase(modelName))
//            return  createModelElement_AmaflagsSet();
//         if(ABSTRACTEXTENSION.equalsIgnoreCase(modelName))
//            return  createModelElement_AbstractExtension();
//         if(MODELNAME.concat(".").concat(MISDNPORTOPTIONSSET).equalsIgnoreCase(modelName))
//            return  createModelElement_MisdnPortOptionsSet();
//         if(MODELNAME.concat(".").concat(MCARDOPTIONSET).equalsIgnoreCase(modelName))
//            return  createModelElement_MCardOptionSet();
//         if(MODELNAME.concat(".").concat(MISDNCARDTYPESSET).equalsIgnoreCase(modelName))
//            return  createModelElement_MisdnCardTypesSet();
//         if(MODELNAME.concat(".").concat(PEERTYPESET).equalsIgnoreCase(modelName))
//            return  createModelElement_PeerTypeSet();
//         if(MODELNAME.concat(".").concat(MPORTOPTIONSET).equalsIgnoreCase(modelName))
//            return  createModelElement_MPortOptionSet();
//         if(MODELNAME.concat(".").concat(DIALPLANSET).equalsIgnoreCase(modelName))
//            return  createModelElement_DialplanSet();
//         if(MODELNAME.concat(".").concat(CODECSSET).equalsIgnoreCase(modelName))
//            return  createModelElement_CodecsSet();
//         if(MODELNAME.concat(".").concat(PRESENTATIONSET).equalsIgnoreCase(modelName))
//            return  createModelElement_PresentationSet();
//         if(MODELNAME.concat(".").concat(DTMFMODESET).equalsIgnoreCase(modelName))
//            return  createModelElement_DtmfmodeSet();
//         if(MODELNAME.concat(".").concat(PBXCONTEXT).equalsIgnoreCase(modelName))
//            return  createModelElement_PbxContext();
//         if(MODELNAME.concat(".").concat(APPLICATION).equalsIgnoreCase(modelName))
//            return  createModelElement_Application();
//         if(MODELNAME.concat(".").concat(SWITCHTYPESET).equalsIgnoreCase(modelName))
//            return  createModelElement_SwitchtypeSet();
//         if(MODELNAME.concat(".").concat(SIGNALLINGSET).equalsIgnoreCase(modelName))
//            return  createModelElement_SignallingSet();
//         if(MODELNAME.concat(".").concat(AMAFLAGSSET).equalsIgnoreCase(modelName))
//            return  createModelElement_AmaflagsSet();
//         if(MODELNAME.concat(".").concat(ABSTRACTEXTENSION).equalsIgnoreCase(modelName))
//            return  createModelElement_AbstractExtension();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
//        if(IMisdnPortOptionsSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_MisdnPortOptionsSet();
//        if(IMCardOptionSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_MCardOptionSet();
//        if(IMisdnCardTypesSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_MisdnCardTypesSet();
//        if(IPeerTypeSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_PeerTypeSet();
//        if(IMPortOptionSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_MPortOptionSet();
//        if(IDialplanSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_DialplanSet();
//        if(ICodecsSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_CodecsSet();
//        if(IPresentationSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_PresentationSet();
//        if(IDtmfmodeSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_DtmfmodeSet();
//        if(IPbxContext.class.isAssignableFrom(modelClass))
//            return  createModelElement_PbxContext();
//        if(IApplication.class.isAssignableFrom(modelClass))
//            return  createModelElement_Application();
//        if(ISwitchtypeSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_SwitchtypeSet();
//        if(ISignallingSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_SignallingSet();
//        if(IAmaflagsSet.class.isAssignableFrom(modelClass))
//            return  createModelElement_AmaflagsSet();
//        if(IAbstractExtension.class.isAssignableFrom(modelClass))
//            return  createModelElement_AbstractExtension();
        return super.createModelElement(modelClass);
    }

    public Object createModelElement(Object model) {
        return super.createModelElement(model);
    }

    public Object createTypeFromString(String typeName, String value) {
//        if(MISDNPORTOPTIONS.equalsIgnoreCase(typeName))
//        	return createType_MisdnPortOptions(value);
//        if(MISDNPORTOPTIONSSET.equalsIgnoreCase(typeName))
//        	return createType_MisdnPortOptionsSet(value);
//        if(MCARDOPTION.equalsIgnoreCase(typeName))
//        	return createType_MCardOption(value);
//        if(MCARDOPTIONSET.equalsIgnoreCase(typeName))
//        	return createType_MCardOptionSet(value);
//        if(MISDNCARDTYPES.equalsIgnoreCase(typeName))
//        	return createType_MisdnCardTypes(value);
//        if(MISDNCARDTYPESSET.equalsIgnoreCase(typeName))
//        	return createType_MisdnCardTypesSet(value);
//        if(PEERTYPE.equalsIgnoreCase(typeName))
//        	return createType_PeerType(value);
//        if(PEERTYPESET.equalsIgnoreCase(typeName))
//        	return createType_PeerTypeSet(value);
//        if(MPORTOPTION.equalsIgnoreCase(typeName))
//        	return createType_MPortOption(value);
//        if(MPORTOPTIONSET.equalsIgnoreCase(typeName))
//        	return createType_MPortOptionSet(value);
//        if(DIALPLAN.equalsIgnoreCase(typeName))
//        	return createType_Dialplan(value);
//        if(DIALPLANSET.equalsIgnoreCase(typeName))
//        	return createType_DialplanSet(value);
//        if(CODECS.equalsIgnoreCase(typeName))
//        	return createType_Codecs(value);
//        if(CODECSSET.equalsIgnoreCase(typeName))
//        	return createType_CodecsSet(value);
//        if(PRESENTATION.equalsIgnoreCase(typeName))
//        	return createType_Presentation(value);
//        if(PRESENTATIONSET.equalsIgnoreCase(typeName))
//        	return createType_PresentationSet(value);
//        if(DTMFMODE.equalsIgnoreCase(typeName))
//        	return createType_Dtmfmode(value);
//        if(DTMFMODESET.equalsIgnoreCase(typeName))
//        	return createType_DtmfmodeSet(value);
//        if(PBXCONTEXT.equalsIgnoreCase(typeName))
//        	return createType_PbxContext(value);
//        if(APPLICATION.equalsIgnoreCase(typeName))
//        	return createType_Application(value);
//        if(SWITCHTYPE.equalsIgnoreCase(typeName))
//        	return createType_Switchtype(value);
//        if(SWITCHTYPESET.equalsIgnoreCase(typeName))
//        	return createType_SwitchtypeSet(value);
//        if(SIGNALLING.equalsIgnoreCase(typeName))
//        	return createType_Signalling(value);
//        if(SIGNALLINGSET.equalsIgnoreCase(typeName))
//        	return createType_SignallingSet(value);
//        if(AMAFLAGS.equalsIgnoreCase(typeName))
//        	return createType_Amaflags(value);
//        if(AMAFLAGSSET.equalsIgnoreCase(typeName))
//        	return createType_AmaflagsSet(value);
//        if(ABSTRACTEXTENSION.equalsIgnoreCase(typeName))
//        	return createType_AbstractExtension(value);
        return super.createTypeFromString(typeName, value);
    }

    public Object createTypeFromString(Class type, String value) {
	 if(MisdnPortOptions.class.isAssignableFrom(type))
       	return createType_MisdnPortOptions(value);
	 if(MisdnPortOptionsSet.class.isAssignableFrom(type))
       	return createType_MisdnPortOptionsSet(value);
	 if(MCardOption.class.isAssignableFrom(type))
       	return createType_MCardOption(value);
	 if(MCardOptionSet.class.isAssignableFrom(type))
       	return createType_MCardOptionSet(value);
	 if(MisdnCardTypes.class.isAssignableFrom(type))
       	return createType_MisdnCardTypes(value);
	 if(MisdnCardTypesSet.class.isAssignableFrom(type))
       	return createType_MisdnCardTypesSet(value);
	 if(PeerType.class.isAssignableFrom(type))
       	return createType_PeerType(value);
	 if(PeerTypeSet.class.isAssignableFrom(type))
       	return createType_PeerTypeSet(value);
	 if(MPortOption.class.isAssignableFrom(type))
       	return createType_MPortOption(value);
	 if(MPortOptionSet.class.isAssignableFrom(type))
       	return createType_MPortOptionSet(value);
	 if(Dialplan.class.isAssignableFrom(type))
       	return createType_Dialplan(value);
	 if(DialplanSet.class.isAssignableFrom(type))
       	return createType_DialplanSet(value);
	 if(Codecs.class.isAssignableFrom(type))
       	return createType_Codecs(value);
	 if(CodecsSet.class.isAssignableFrom(type))
       	return createType_CodecsSet(value);
	 if(Presentation.class.isAssignableFrom(type))
       	return createType_Presentation(value);
	 if(PresentationSet.class.isAssignableFrom(type))
       	return createType_PresentationSet(value);
	 if(Dtmfmode.class.isAssignableFrom(type))
       	return createType_Dtmfmode(value);
	 if(DtmfmodeSet.class.isAssignableFrom(type))
       	return createType_DtmfmodeSet(value);
	 if(PbxContext.class.isAssignableFrom(type))
       	return createType_PbxContext(value);
	 if(Application.class.isAssignableFrom(type))
       	return createType_Application(value);
	 if(Switchtype.class.isAssignableFrom(type))
       	return createType_Switchtype(value);
	 if(SwitchtypeSet.class.isAssignableFrom(type))
       	return createType_SwitchtypeSet(value);
	 if(Signalling.class.isAssignableFrom(type))
       	return createType_Signalling(value);
	 if(SignallingSet.class.isAssignableFrom(type))
       	return createType_SignallingSet(value);
	 if(Amaflags.class.isAssignableFrom(type))
       	return createType_Amaflags(value);
	 if(AmaflagsSet.class.isAssignableFrom(type))
       	return createType_AmaflagsSet(value);
	 if(AbstractExtension.class.isAssignableFrom(type))
       	return createType_AbstractExtension(value);
        return super.createTypeFromString(type, value);
    }

    public String typeToString(Object obj) {
        // TODO Automatisch erstellter Methoden-Stub
        return super.typeToString(obj);
    }

  	protected  Object createType_MisdnPortOptions(String value) {       
            return new MisdnPortOptions(value);
    }
  	protected  Object createType_MisdnPortOptionsSet(String value) {       
            return new MisdnPortOptionsSet(value);
    }
  	protected  Object createType_MCardOption(String value) {       
            return new MCardOption(value);
    }
  	protected  Object createType_MCardOptionSet(String value) {       
            return new MCardOptionSet(value);
    }
  	protected  Object createType_MisdnCardTypes(String value) {       
            return new MisdnCardTypes(value);
    }
  	protected  Object createType_MisdnCardTypesSet(String value) {       
            return new MisdnCardTypesSet(value);
    }
  	protected  Object createType_PeerType(String value) {       
            return new PeerType(value);
    }
  	protected  Object createType_PeerTypeSet(String value) {       
            return new PeerTypeSet(value);
    }
  	protected  Object createType_MPortOption(String value) {       
            return new MPortOption(value);
    }
  	protected  Object createType_MPortOptionSet(String value) {       
            return new MPortOptionSet(value);
    }
  	protected  Object createType_Dialplan(String value) {       
            return new Dialplan(value);
    }
  	protected  Object createType_DialplanSet(String value) {       
            return new DialplanSet(value);
    }
  	protected  Object createType_Codecs(String value) {       
            return new Codecs(value);
    }
  	protected  Object createType_CodecsSet(String value) {       
            return new CodecsSet(value);
    }
  	protected  Object createType_Presentation(String value) {       
            return new Presentation(value);
    }
  	protected  Object createType_PresentationSet(String value) {       
            return new PresentationSet(value);
    }
  	protected  Object createType_Dtmfmode(String value) {       
            return new Dtmfmode(value);
    }
  	protected  Object createType_DtmfmodeSet(String value) {       
            return new DtmfmodeSet(value);
    }
  	protected  Object createType_PbxContext(String value) {       
            return new PbxContext(value);
    }
  	protected  Object createType_Application(String value) {       
            return new Application(value);
    }
  	protected  Object createType_Switchtype(String value) {       
            return new Switchtype(value);
    }
  	protected  Object createType_SwitchtypeSet(String value) {       
            return new SwitchtypeSet(value);
    }
  	protected  Object createType_Signalling(String value) {       
            return new Signalling(value);
    }
  	protected  Object createType_SignallingSet(String value) {       
            return new SignallingSet(value);
    }
  	protected  Object createType_Amaflags(String value) {       
            return new Amaflags(value);
    }
  	protected  Object createType_AmaflagsSet(String value) {       
            return new AmaflagsSet(value);
    }
  	protected  Object createType_AbstractExtension(String value) {       
            return new AbstractExtension(value);
    }


 	protected  Object createModelElement_MisdnPortOptionsSet() {       
            return new MisdnPortOptionsSet();
    }
 	protected  Object createModelElement_MCardOptionSet() {       
            return new MCardOptionSet();
    }
 	protected  Object createModelElement_MisdnCardTypesSet() {       
            return new MisdnCardTypesSet();
    }
 	protected  Object createModelElement_PeerTypeSet() {       
            return new PeerTypeSet();
    }
 	protected  Object createModelElement_MPortOptionSet() {       
            return new MPortOptionSet();
    }
 	protected  Object createModelElement_DialplanSet() {       
            return new DialplanSet();
    }
 	protected  Object createModelElement_CodecsSet() {       
            return new CodecsSet();
    }
 	protected  Object createModelElement_PresentationSet() {       
            return new PresentationSet();
    }
 	protected  Object createModelElement_DtmfmodeSet() {       
            return new DtmfmodeSet();
    }
 	protected  Object createModelElement_PbxContext() {       
            return new PbxContext();
    }
 	protected  Object createModelElement_Application() {       
            return new Application();
    }
 	protected  Object createModelElement_SwitchtypeSet() {       
            return new SwitchtypeSet();
    }
 	protected  Object createModelElement_SignallingSet() {       
            return new SignallingSet();
    }
 	protected  Object createModelElement_AmaflagsSet() {       
            return new AmaflagsSet();
    }
 	protected  Object createModelElement_AbstractExtension() {       
            return new AbstractExtension();
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

