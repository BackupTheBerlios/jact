/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.zapataconf;

import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.ListCellRenderer;
import javax.swing.tree.DefaultTreeCellRenderer;

import com.useit.app.framework.gui.dialogs.AbstractSimpleDataObjectTreeDialog;
import com.useit.app.framework.gui.guiHelper.AbstractSimpleTreePanel;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.app.framework.gui.guiHelper.SimpleMapDataPanel;
import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.zapataconf.Analog_Handset_Features;
import com.useit.jact.model.zapataconf.Analog_Trunk_Features;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_Options;
import com.useit.jact.model.zapataconf.Call_Logging_Options;
import com.useit.jact.model.zapataconf.Caller_ID_Options;
import com.useit.jact.model.zapataconf.ISDN_PRI_Switch;
import com.useit.jact.model.zapataconf.Multilink_PPP;
import com.useit.jact.model.zapataconf.Other;
import com.useit.jact.model.zapataconf.Timing_Parameters;
import com.useit.jact.model.zapataconf.Zapataconf;
import com.useit.jact.model.zapataconf.Zaptelchannel;

// import com.useit.jact.model.impl.ZapataconfImpl;
// import com.useit.jact.model.impl.Analog_Handset_FeaturesImpl;
// import com.useit.jact.model.impl.Timing_ParametersImpl;
// import com.useit.jact.model.impl.ZaptelchannelImpl;
// import com.useit.jact.model.impl.Analog_Trunk_FeaturesImpl;
// import com.useit.jact.model.impl.ISDN_PRI_SwitchImpl;
// import com.useit.jact.model.impl.Audio_Quality_Tuning_OptionsImpl;
// import com.useit.jact.model.impl.Caller_ID_OptionsImpl;
// import com.useit.jact.model.impl.OtherImpl;
// import com.useit.jact.model.impl.Multilink_PPPImpl;
// import com.useit.jact.model.impl.Call_Logging_OptionsImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.11 2006/01/09
 *          10:17:36 urs Exp $
 */
public class GuiClassFactory {
    /**
     * erzeugt ein treepanel
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleTreePanel createTreePanel(Object obj) {
        if (obj instanceof Zapataconf) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Analog_Handset_Features) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Timing_Parameters) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Zaptelchannel) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Analog_Trunk_Features) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof ISDN_PRI_Switch) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Audio_Quality_Tuning_Options) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Caller_ID_Options) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Other) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Multilink_PPP) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Call_Logging_Options) {
            AbstractSimpleTreePanel p = new SimplezapataconfTreePanel();
            p.initTree(obj);
            return p;
        }
        return null;
    }

    /**
     * erzeugt ein dialog und initalisiert ihn
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleDataObjectTreeDialog createTreeDialog(Object obj) {
        if (obj instanceof Zapataconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Analog_Handset_Features) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Timing_Parameters) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Zaptelchannel) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Analog_Trunk_Features) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof ISDN_PRI_Switch) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Audio_Quality_Tuning_Options) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Caller_ID_Options) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Other) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Multilink_PPP) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Call_Logging_Options) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    obj);
            return p;
        }
        return null;
    }

    /**
     * erzeugt ein dialog und initalisiert ihn
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleDataObjectTreeDialog createTreeDialog(
            Frame aFrame, Object obj) {
        if (obj instanceof Zapataconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Analog_Handset_Features) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Timing_Parameters) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Zaptelchannel) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Analog_Trunk_Features) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof ISDN_PRI_Switch) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Audio_Quality_Tuning_Options) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Caller_ID_Options) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Other) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Multilink_PPP) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Call_Logging_Options) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        return null;
    }

    /**
     * erzeugt ein dialog und initalisiert ihn
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleDataObjectTreeDialog createTreeDialog(
            Dialog aDialog, Object obj) {
        if (obj instanceof Zapataconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Analog_Handset_Features) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Timing_Parameters) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Zaptelchannel) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Analog_Trunk_Features) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof ISDN_PRI_Switch) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Audio_Quality_Tuning_Options) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Caller_ID_Options) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Other) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Multilink_PPP) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Call_Logging_Options) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzapataconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        return null;
    }

    public static final ListCellRenderer simpleListRendere() {
        return new DefaultListCellRenderer() {
            /*
             * (non-Javadoc)
             * 
             * @see javax.swing.DefaultListCellRenderer#getListCellRendererComponent(javax.swing.JList,
             *      java.lang.Object, int, boolean, boolean)
             */
            public Component getListCellRendererComponent(JList list,
                    Object value, int index, boolean isSelected,
                    boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index,
                        isSelected, cellHasFocus);
                this.setText(DataClassRendereImpl.displayString(value));
                return this;
            }
        };
    }

    /**
     * ein tree renener auf abruf
     * 
     * @return DefaultTreeCellRenderer
     */
    public static final DefaultTreeCellRenderer simpleTreeRendere() {
        return new DefaultTreeCellRenderer() {

            public Component getTreeCellRendererComponent(JTree tree,
                    Object value, boolean selected, boolean expanded,
                    boolean leaf, int row, boolean hasFocus) {
                super.getTreeCellRendererComponent(tree, value, selected,
                        expanded, leaf, row, hasFocus);
                // this.hasFocus = hasFocus;

                setText(DataClassRendereImpl.displayString(value));
                return this;
            }

        };
    }

    /**
     * erzeugt eine neue Objektinstanz von Zapataconf mit den default Werten
     * 
     * @return Zapataconf
     */
    public static final ZapataconfDataPanelImpl newZapataconfDataPanel() {
        return new ZapataconfDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Analog_Handset_Features mit den
     * default Werten
     * 
     * @return Analog_Handset_Features
     */
    public static final Analog_Handset_FeaturesDataPanelImpl newAnalog_Handset_FeaturesDataPanel() {
        return new Analog_Handset_FeaturesDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Timing_Parameters mit den default
     * Werten
     * 
     * @return Timing_Parameters
     */
    public static final Timing_ParametersDataPanelImpl newTiming_ParametersDataPanel() {
        return new Timing_ParametersDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Zaptelchannel mit den default Werten
     * 
     * @return Zaptelchannel
     */
    public static final ZaptelchannelDataPanelImpl newZaptelchannelDataPanel() {
        return new ZaptelchannelDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Analog_Trunk_Features mit den default
     * Werten
     * 
     * @return Analog_Trunk_Features
     */
    public static final Analog_Trunk_FeaturesDataPanelImpl newAnalog_Trunk_FeaturesDataPanel() {
        return new Analog_Trunk_FeaturesDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von ISDN_PRI_Switch mit den default
     * Werten
     * 
     * @return ISDN_PRI_Switch
     */
    public static final ISDN_PRI_SwitchDataPanelImpl newISDN_PRI_SwitchDataPanel() {
        return new ISDN_PRI_SwitchDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Audio_Quality_Tuning_Options mit den
     * default Werten
     * 
     * @return Audio_Quality_Tuning_Options
     */
    public static final Audio_Quality_Tuning_OptionsDataPanelImpl newAudio_Quality_Tuning_OptionsDataPanel() {
        return new Audio_Quality_Tuning_OptionsDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Caller_ID_Options mit den default
     * Werten
     * 
     * @return Caller_ID_Options
     */
    public static final Caller_ID_OptionsDataPanelImpl newCaller_ID_OptionsDataPanel() {
        return new Caller_ID_OptionsDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Other mit den default Werten
     * 
     * @return Other
     */
    public static final OtherDataPanelImpl newOtherDataPanel() {
        return new OtherDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Multilink_PPP mit den default Werten
     * 
     * @return Multilink_PPP
     */
    public static final Multilink_PPPDataPanelImpl newMultilink_PPPDataPanel() {
        return new Multilink_PPPDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Call_Logging_Options mit den default
     * Werten
     * 
     * @return Call_Logging_Options
     */
    public static final Call_Logging_OptionsDataPanelImpl newCall_Logging_OptionsDataPanel() {
        return new Call_Logging_OptionsDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("ZAPATACONF")) {
            ZapataconfTableModel model = new ZapataconfTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("ANALOG_HANDSET_FEATURES")) {
            Analog_Handset_FeaturesTableModel model = new Analog_Handset_FeaturesTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("TIMING_PARAMETERS")) {
            Timing_ParametersTableModel model = new Timing_ParametersTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("ZAPTELCHANNEL")) {
            ZaptelchannelTableModel model = new ZaptelchannelTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("ANALOG_TRUNK_FEATURES")) {
            Analog_Trunk_FeaturesTableModel model = new Analog_Trunk_FeaturesTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("ISDN_PRI_SWITCH")) {
            ISDN_PRI_SwitchTableModel model = new ISDN_PRI_SwitchTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("AUDIO_QUALITY_TUNING_OPTIONS")) {
            Audio_Quality_Tuning_OptionsTableModel model = new Audio_Quality_Tuning_OptionsTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("CALLER_ID_OPTIONS")) {
            Caller_ID_OptionsTableModel model = new Caller_ID_OptionsTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("OTHER")) {
            OtherTableModel model = new OtherTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("MULTILINK_PPP")) {
            Multilink_PPPTableModel model = new Multilink_PPPTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("CALL_LOGGING_OPTIONS")) {
            Call_Logging_OptionsTableModel model = new Call_Logging_OptionsTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof Zapataconf) {
            ZapataconfDataPanelImpl p = newZapataconfDataPanel();// getInstance().displayString((ZapataconfMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Analog_Handset_Features) {
            Analog_Handset_FeaturesDataPanelImpl p = newAnalog_Handset_FeaturesDataPanel();// getInstance().displayString((Analog_Handset_FeaturesMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Timing_Parameters) {
            Timing_ParametersDataPanelImpl p = newTiming_ParametersDataPanel();// getInstance().displayString((Timing_ParametersMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Zaptelchannel) {
            ZaptelchannelDataPanelImpl p = newZaptelchannelDataPanel();// getInstance().displayString((ZaptelchannelMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Analog_Trunk_Features) {
            Analog_Trunk_FeaturesDataPanelImpl p = newAnalog_Trunk_FeaturesDataPanel();// getInstance().displayString((Analog_Trunk_FeaturesMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof ISDN_PRI_Switch) {
            ISDN_PRI_SwitchDataPanelImpl p = newISDN_PRI_SwitchDataPanel();// getInstance().displayString((ISDN_PRI_SwitchMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Audio_Quality_Tuning_Options) {
            Audio_Quality_Tuning_OptionsDataPanelImpl p = newAudio_Quality_Tuning_OptionsDataPanel();// getInstance().displayString((Audio_Quality_Tuning_OptionsMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Caller_ID_Options) {
            Caller_ID_OptionsDataPanelImpl p = newCaller_ID_OptionsDataPanel();// getInstance().displayString((Caller_ID_OptionsMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Other) {
            OtherDataPanelImpl p = newOtherDataPanel();// getInstance().displayString((OtherMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Multilink_PPP) {
            Multilink_PPPDataPanelImpl p = newMultilink_PPPDataPanel();// getInstance().displayString((Multilink_PPPMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Call_Logging_Options) {
            Call_Logging_OptionsDataPanelImpl p = newCall_Logging_OptionsDataPanel();// getInstance().displayString((Call_Logging_OptionsMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof MapTyper) {
            MapTyper mt = (MapTyper) obj;
            SimpleMapDataPanel p = new SimpleMapDataPanel();
            AbstractSimpleTableModel tableModel = createTableModel(mt);
            p.setModel(tableModel);
            p.setDataObject(mt);
            return p;
        }

        return com.useit.app.framework.gui.guiHelper.GuiClassFactory
                .createSimpleDataObjectPanel(obj);

    }

}
