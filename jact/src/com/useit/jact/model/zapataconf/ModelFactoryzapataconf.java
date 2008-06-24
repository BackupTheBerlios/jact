/*
 * (c) urs zeidler
 */
package com.useit.jact.model.zapataconf;


import com.useit.app.framework.model.dataModel.CompositeModelFactory;

/** 
 * <p> 
 * ModelFactoryzapataconf
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryzapataconf.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $ 
 */
public abstract class ModelFactoryzapataconf extends CompositeModelFactory {
   public static final String MODELNAME="zapataconf";
	public static final String OTHER=IOther.MODELNAME;
	public static final String ANALOG_HANDSET_FEATURES=IAnalog_Handset_Features.MODELNAME;
	public static final String TIMING_PARAMETERS=ITiming_Parameters.MODELNAME;
	public static final String ANALOG_TRUNK_FEATURES=IAnalog_Trunk_Features.MODELNAME;
	public static final String ISDN_PRI_SWITCH=IISDN_PRI_Switch.MODELNAME;
	public static final String MULTILINK_PPP=IMultilink_PPP.MODELNAME;
	public static final String AUDIO_QUALITY_TUNING_OPTIONS=IAudio_Quality_Tuning_Options.MODELNAME;
	public static final String ZAPTELCHANNEL=IZaptelchannel.MODELNAME;
	public static final String CALL_LOGGING_OPTIONS=ICall_Logging_Options.MODELNAME;
	public static final String CALLER_ID_OPTIONS=ICaller_ID_Options.MODELNAME;
	public static final String ZAPATACONF=IZapataconf.MODELNAME;

    public Object createModelElement(String modelName) {
        if(OTHER.equalsIgnoreCase(modelName))
            return new OtherImpl();
         if(ANALOG_HANDSET_FEATURES.equalsIgnoreCase(modelName))
            return new Analog_Handset_FeaturesImpl();
         if(TIMING_PARAMETERS.equalsIgnoreCase(modelName))
            return new Timing_ParametersImpl();
         if(ANALOG_TRUNK_FEATURES.equalsIgnoreCase(modelName))
            return new Analog_Trunk_FeaturesImpl();
         if(ISDN_PRI_SWITCH.equalsIgnoreCase(modelName))
            return new ISDN_PRI_SwitchImpl();
         if(MULTILINK_PPP.equalsIgnoreCase(modelName))
            return new Multilink_PPPImpl();
         if(AUDIO_QUALITY_TUNING_OPTIONS.equalsIgnoreCase(modelName))
            return new Audio_Quality_Tuning_OptionsImpl();
         if(ZAPTELCHANNEL.equalsIgnoreCase(modelName))
            return new ZaptelchannelImpl();
         if(CALL_LOGGING_OPTIONS.equalsIgnoreCase(modelName))
            return new Call_Logging_OptionsImpl();
         if(CALLER_ID_OPTIONS.equalsIgnoreCase(modelName))
            return new Caller_ID_OptionsImpl();
         if(ZAPATACONF.equalsIgnoreCase(modelName))
            return new ZapataconfImpl();
         if(MODELNAME.concat(".").concat(OTHER).equalsIgnoreCase(modelName))
            return  createModelElement_Other();
         if(MODELNAME.concat(".").concat(ANALOG_HANDSET_FEATURES).equalsIgnoreCase(modelName))
            return  createModelElement_Analog_Handset_Features();
         if(MODELNAME.concat(".").concat(TIMING_PARAMETERS).equalsIgnoreCase(modelName))
            return  createModelElement_Timing_Parameters();
         if(MODELNAME.concat(".").concat(ANALOG_TRUNK_FEATURES).equalsIgnoreCase(modelName))
            return  createModelElement_Analog_Trunk_Features();
         if(MODELNAME.concat(".").concat(ISDN_PRI_SWITCH).equalsIgnoreCase(modelName))
            return  createModelElement_ISDN_PRI_Switch();
         if(MODELNAME.concat(".").concat(MULTILINK_PPP).equalsIgnoreCase(modelName))
            return  createModelElement_Multilink_PPP();
         if(MODELNAME.concat(".").concat(AUDIO_QUALITY_TUNING_OPTIONS).equalsIgnoreCase(modelName))
            return  createModelElement_Audio_Quality_Tuning_Options();
         if(MODELNAME.concat(".").concat(ZAPTELCHANNEL).equalsIgnoreCase(modelName))
            return  createModelElement_Zaptelchannel();
         if(MODELNAME.concat(".").concat(CALL_LOGGING_OPTIONS).equalsIgnoreCase(modelName))
            return  createModelElement_Call_Logging_Options();
         if(MODELNAME.concat(".").concat(CALLER_ID_OPTIONS).equalsIgnoreCase(modelName))
            return  createModelElement_Caller_ID_Options();
         if(MODELNAME.concat(".").concat(ZAPATACONF).equalsIgnoreCase(modelName))
            return  createModelElement_Zapataconf();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IOther.class.isAssignableFrom(modelClass))
            return  createModelElement_Other();
        if(IAnalog_Handset_Features.class.isAssignableFrom(modelClass))
            return  createModelElement_Analog_Handset_Features();
        if(ITiming_Parameters.class.isAssignableFrom(modelClass))
            return  createModelElement_Timing_Parameters();
        if(IAnalog_Trunk_Features.class.isAssignableFrom(modelClass))
            return  createModelElement_Analog_Trunk_Features();
        if(IISDN_PRI_Switch.class.isAssignableFrom(modelClass))
            return  createModelElement_ISDN_PRI_Switch();
        if(IMultilink_PPP.class.isAssignableFrom(modelClass))
            return  createModelElement_Multilink_PPP();
        if(IAudio_Quality_Tuning_Options.class.isAssignableFrom(modelClass))
            return  createModelElement_Audio_Quality_Tuning_Options();
        if(IZaptelchannel.class.isAssignableFrom(modelClass))
            return  createModelElement_Zaptelchannel();
        if(ICall_Logging_Options.class.isAssignableFrom(modelClass))
            return  createModelElement_Call_Logging_Options();
        if(ICaller_ID_Options.class.isAssignableFrom(modelClass))
            return  createModelElement_Caller_ID_Options();
        if(IZapataconf.class.isAssignableFrom(modelClass))
            return  createModelElement_Zapataconf();
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

 protected  Object createModelElement_Other() {
            return new OtherImpl();
}
 protected  Object createModelElement_Analog_Handset_Features() {
            return new Analog_Handset_FeaturesImpl();
}
 protected  Object createModelElement_Timing_Parameters() {
            return new Timing_ParametersImpl();
}
 protected  Object createModelElement_Analog_Trunk_Features() {
            return new Analog_Trunk_FeaturesImpl();
}
 protected  Object createModelElement_ISDN_PRI_Switch() {
            return new ISDN_PRI_SwitchImpl();
}
 protected  Object createModelElement_Multilink_PPP() {
            return new Multilink_PPPImpl();
}
 protected  Object createModelElement_Audio_Quality_Tuning_Options() {
            return new Audio_Quality_Tuning_OptionsImpl();
}
 protected  Object createModelElement_Zaptelchannel() {
            return new ZaptelchannelImpl();
}
 protected  Object createModelElement_Call_Logging_Options() {
            return new Call_Logging_OptionsImpl();
}
 protected  Object createModelElement_Caller_ID_Options() {
            return new Caller_ID_OptionsImpl();
}
 protected  Object createModelElement_Zapataconf() {
            return new ZapataconfImpl();
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

