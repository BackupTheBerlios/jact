/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.zapataconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.zapataconf.Analog_Handset_Features;
import com.useit.jact.model.zapataconf.Analog_Trunk_Features;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_Options;
import com.useit.jact.model.zapataconf.Call_Logging_Options;
import com.useit.jact.model.zapataconf.Caller_ID_Options;
import com.useit.jact.model.zapataconf.ISDN_PRI_Switch;
import com.useit.jact.model.zapataconf.MMFzapataconf;
import com.useit.jact.model.zapataconf.Multilink_PPP;
import com.useit.jact.model.zapataconf.Other;
import com.useit.jact.model.zapataconf.Timing_Parameters;
import com.useit.jact.model.zapataconf.Zapataconf;
import com.useit.jact.model.zapataconf.Zaptelchannel;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.8 2006/01/09
 *          10:17:36 urs Exp $
 */
public abstract class SimpleTreeModel extends AbstractSimpleTreeModel {
    protected Object root;

    /**
     * 
     */
    public SimpleTreeModel() {
        super();
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getRoot()
     */
    public void setRoot(Object root) {
        this.root = root;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getRoot()
     */
    public Object getRoot() {
        return root;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object Other_getChild(Object parent, int index) {
        Other obj = (Other) parent;
        switch (index) {
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object Analog_Handset_Features_getChild(Object parent, int index) {
        Analog_Handset_Features obj = (Analog_Handset_Features) parent;
        switch (index) {
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object Timing_Parameters_getChild(Object parent, int index) {
        Timing_Parameters obj = (Timing_Parameters) parent;
        switch (index) {
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object Analog_Trunk_Features_getChild(Object parent, int index) {
        Analog_Trunk_Features obj = (Analog_Trunk_Features) parent;
        switch (index) {
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object ISDN_PRI_Switch_getChild(Object parent, int index) {
        ISDN_PRI_Switch obj = (ISDN_PRI_Switch) parent;
        switch (index) {
        case 0:
            return obj.getMultilink_PPP();
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object Multilink_PPP_getChild(Object parent, int index) {
        Multilink_PPP obj = (Multilink_PPP) parent;
        switch (index) {
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object Audio_Quality_Tuning_Options_getChild(Object parent,
            int index) {
        Audio_Quality_Tuning_Options obj = (Audio_Quality_Tuning_Options) parent;
        switch (index) {
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object Zaptelchannel_getChild(Object parent, int index) {
        Zaptelchannel obj = (Zaptelchannel) parent;
        switch (index) {
        case 0:
            return obj.getAnalog_Handset_Features();
        case 1:
            return obj.getAnalog_Trunk_Features();
        case 2:
            return obj.getAudio_Quality_Tuning_Options();
        case 3:
            return obj.getCall_Logging_Options();
        case 4:
            return obj.getCaller_ID_Options();
        case 5:
            return obj.getISDN_PRI_Switch();
        case 6:
            return obj.getTiming_Parameters();
        case 7:
            return obj.getOther();
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object Call_Logging_Options_getChild(Object parent, int index) {
        Call_Logging_Options obj = (Call_Logging_Options) parent;
        switch (index) {
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object Caller_ID_Options_getChild(Object parent, int index) {
        Caller_ID_Options obj = (Caller_ID_Options) parent;
        switch (index) {
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object Zapataconf_getChild(Object parent, int index) {
        Zapataconf obj = (Zapataconf) parent;
        switch (index) {
        case 0:
            return // obj.getZaptelchannelMapTyper();//getZaptelchannelMap();
            new MapTyper(MMFzapataconf.ZAPTELCHANNEL,
                    obj.getZaptelchannelMap(), MMFzapataconf.getInstance());
        default:
            break;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    public Object getChild(Object parent, int index) {
        if (parent instanceof Other)
            return Other_getChild(parent, index);

        if (parent instanceof Analog_Handset_Features)
            return Analog_Handset_Features_getChild(parent, index);

        if (parent instanceof Timing_Parameters)
            return Timing_Parameters_getChild(parent, index);

        if (parent instanceof Analog_Trunk_Features)
            return Analog_Trunk_Features_getChild(parent, index);

        if (parent instanceof ISDN_PRI_Switch)
            return ISDN_PRI_Switch_getChild(parent, index);

        if (parent instanceof Multilink_PPP)
            return Multilink_PPP_getChild(parent, index);

        if (parent instanceof Audio_Quality_Tuning_Options)
            return Audio_Quality_Tuning_Options_getChild(parent, index);

        if (parent instanceof Zaptelchannel)
            return Zaptelchannel_getChild(parent, index);

        if (parent instanceof Call_Logging_Options)
            return Call_Logging_Options_getChild(parent, index);

        if (parent instanceof Caller_ID_Options)
            return Caller_ID_Options_getChild(parent, index);

        if (parent instanceof Zapataconf)
            return Zapataconf_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int Other_getChildCount(Object parent) {
        return 0;
    }

    protected int Analog_Handset_Features_getChildCount(Object parent) {
        return 0;
    }

    protected int Timing_Parameters_getChildCount(Object parent) {
        return 0;
    }

    protected int Analog_Trunk_Features_getChildCount(Object parent) {
        return 0;
    }

    protected int ISDN_PRI_Switch_getChildCount(Object parent) {
        return 1;
    }

    protected int Multilink_PPP_getChildCount(Object parent) {
        return 0;
    }

    protected int Audio_Quality_Tuning_Options_getChildCount(Object parent) {
        return 0;
    }

    protected int Zaptelchannel_getChildCount(Object parent) {
        return 8;
    }

    protected int Call_Logging_Options_getChildCount(Object parent) {
        return 0;
    }

    protected int Caller_ID_Options_getChildCount(Object parent) {
        return 0;
    }

    protected int Zapataconf_getChildCount(Object parent) {
        return 1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof Other)
            return Other_getChildCount(parent);

        if (parent instanceof Analog_Handset_Features)
            return Analog_Handset_Features_getChildCount(parent);

        if (parent instanceof Timing_Parameters)
            return Timing_Parameters_getChildCount(parent);

        if (parent instanceof Analog_Trunk_Features)
            return Analog_Trunk_Features_getChildCount(parent);

        if (parent instanceof ISDN_PRI_Switch)
            return ISDN_PRI_Switch_getChildCount(parent);

        if (parent instanceof Multilink_PPP)
            return Multilink_PPP_getChildCount(parent);

        if (parent instanceof Audio_Quality_Tuning_Options)
            return Audio_Quality_Tuning_Options_getChildCount(parent);

        if (parent instanceof Zaptelchannel)
            return Zaptelchannel_getChildCount(parent);

        if (parent instanceof Call_Logging_Options)
            return Call_Logging_Options_getChildCount(parent);

        if (parent instanceof Caller_ID_Options)
            return Caller_ID_Options_getChildCount(parent);

        if (parent instanceof Zapataconf)
            return Zapataconf_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean Other_isLeaf() {
        return true;
    }

    protected boolean Analog_Handset_Features_isLeaf() {
        return true;
    }

    protected boolean Timing_Parameters_isLeaf() {
        return true;
    }

    protected boolean Analog_Trunk_Features_isLeaf() {
        return true;
    }

    protected boolean ISDN_PRI_Switch_isLeaf() {
        return false;
    }

    protected boolean Multilink_PPP_isLeaf() {
        return true;
    }

    protected boolean Audio_Quality_Tuning_Options_isLeaf() {
        return true;
    }

    protected boolean Zaptelchannel_isLeaf() {
        return false;
    }

    protected boolean Call_Logging_Options_isLeaf() {
        return true;
    }

    protected boolean Caller_ID_Options_isLeaf() {
        return true;
    }

    protected boolean Zapataconf_isLeaf() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof Other)
            return Other_isLeaf();

        if (node instanceof Analog_Handset_Features)
            return Analog_Handset_Features_isLeaf();

        if (node instanceof Timing_Parameters)
            return Timing_Parameters_isLeaf();

        if (node instanceof Analog_Trunk_Features)
            return Analog_Trunk_Features_isLeaf();

        if (node instanceof ISDN_PRI_Switch)
            return ISDN_PRI_Switch_isLeaf();

        if (node instanceof Multilink_PPP)
            return Multilink_PPP_isLeaf();

        if (node instanceof Audio_Quality_Tuning_Options)
            return Audio_Quality_Tuning_Options_isLeaf();

        if (node instanceof Zaptelchannel)
            return Zaptelchannel_isLeaf();

        if (node instanceof Call_Logging_Options)
            return Call_Logging_Options_isLeaf();

        if (node instanceof Caller_ID_Options)
            return Caller_ID_Options_isLeaf();

        if (node instanceof Zapataconf)
            return Zapataconf_isLeaf();

        return super.isLeaf(node);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#valueForPathChanged(javax.swing.tree.TreePath,
     *      java.lang.Object)
     */
    public void valueForPathChanged(TreePath path, Object newValue) {
        // TODO Auto-generated method stub

    }

    protected int Other_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Analog_Handset_Features_getIndexOfChild(Object parent,
            Object child) {
        return -1;
    }

    protected int Timing_Parameters_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Analog_Trunk_Features_getIndexOfChild(Object parent,
            Object child) {
        return -1;
    }

    protected int ISDN_PRI_Switch_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Multilink_PPP)
            return 0;
        return -1;
    }

    protected int Multilink_PPP_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Audio_Quality_Tuning_Options_getIndexOfChild(Object parent,
            Object child) {
        return -1;
    }

    protected int Zaptelchannel_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Analog_Handset_Features)
            return 0;
        if (child instanceof Analog_Trunk_Features)
            return 1;
        if (child instanceof Audio_Quality_Tuning_Options)
            return 2;
        if (child instanceof Call_Logging_Options)
            return 3;
        if (child instanceof Caller_ID_Options)
            return 4;
        if (child instanceof ISDN_PRI_Switch)
            return 5;
        if (child instanceof Timing_Parameters)
            return 6;
        if (child instanceof Other)
            return 7;
        return -1;
    }

    protected int Call_Logging_Options_getIndexOfChild(Object parent,
            Object child) {
        return -1;
    }

    protected int Caller_ID_Options_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Zapataconf_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Zaptelchannel)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFzapataconf.ZAPTELCHANNEL))
                return 0;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getIndexOfChild(java.lang.Object,
     *      java.lang.Object)
     */
    public int getIndexOfChild(Object parent, Object child) {
        if (parent instanceof Other)
            return Other_getIndexOfChild(parent, child);

        if (parent instanceof Analog_Handset_Features)
            return Analog_Handset_Features_getIndexOfChild(parent, child);

        if (parent instanceof Timing_Parameters)
            return Timing_Parameters_getIndexOfChild(parent, child);

        if (parent instanceof Analog_Trunk_Features)
            return Analog_Trunk_Features_getIndexOfChild(parent, child);

        if (parent instanceof ISDN_PRI_Switch)
            return ISDN_PRI_Switch_getIndexOfChild(parent, child);

        if (parent instanceof Multilink_PPP)
            return Multilink_PPP_getIndexOfChild(parent, child);

        if (parent instanceof Audio_Quality_Tuning_Options)
            return Audio_Quality_Tuning_Options_getIndexOfChild(parent, child);

        if (parent instanceof Zaptelchannel)
            return Zaptelchannel_getIndexOfChild(parent, child);

        if (parent instanceof Call_Logging_Options)
            return Call_Logging_Options_getIndexOfChild(parent, child);

        if (parent instanceof Caller_ID_Options)
            return Caller_ID_Options_getIndexOfChild(parent, child);

        if (parent instanceof Zapataconf)
            return Zapataconf_getIndexOfChild(parent, child);

        return super.getIndexOfChild(parent, child);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#addTreeModelListener(javax.swing.event.TreeModelListener)
     */
    // public void addTreeModelListener(TreeModelListener l) {
    // TODO Auto-generated method stub
    // }
    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#removeTreeModelListener(javax.swing.event.TreeModelListener)
     */
    // public void removeTreeModelListener(TreeModelListener l) {
    // TODO Auto-generated method stub
    // }
}
