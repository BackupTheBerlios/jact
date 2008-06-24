/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.zaptelconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.zaptelconf.MMFzaptelconf;
import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.Zapteltonezone;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.8 2006/01/09
 *          10:17:34 urs Exp $
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
    protected Object Zaptelchannels_getChild(Object parent, int index) {
        Zaptelchannels obj = (Zaptelchannels) parent;
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
    protected Object Zapteltonezone_getChild(Object parent, int index) {
        Zapteltonezone obj = (Zapteltonezone) parent;
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
    protected Object Zaptelspan_getChild(Object parent, int index) {
        Zaptelspan obj = (Zaptelspan) parent;
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
    protected Object Zapteldynamicspan_getChild(Object parent, int index) {
        Zapteldynamicspan obj = (Zapteldynamicspan) parent;
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
    protected Object Zaptelconf_getChild(Object parent, int index) {
        Zaptelconf obj = (Zaptelconf) parent;
        switch (index) {
        case 0:
            return // obj.getZaptelchannelsMapTyper();//getZaptelchannelsMap();
            new MapTyper(MMFzaptelconf.ZAPTELCHANNELS, obj
                    .getZaptelchannelsMap(), MMFzaptelconf.getInstance());
        case 1:
            return // obj.getZapteldynamicspanMapTyper();//getZapteldynamicspanMap();
            new MapTyper(MMFzaptelconf.ZAPTELDYNAMICSPAN, obj
                    .getZapteldynamicspanMap(), MMFzaptelconf.getInstance());
        case 2:
            return // obj.getZaptelspanMapTyper();//getZaptelspanMap();
            new MapTyper(MMFzaptelconf.ZAPTELSPAN, obj.getZaptelspanMap(),
                    MMFzaptelconf.getInstance());
        case 3:
            return // obj.getZapteltonezoneMapTyper();//getZapteltonezoneMap();
            new MapTyper(MMFzaptelconf.ZAPTELTONEZONE, obj
                    .getZapteltonezoneMap(), MMFzaptelconf.getInstance());
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
        if (parent instanceof Zaptelchannels)
            return Zaptelchannels_getChild(parent, index);

        if (parent instanceof Zapteltonezone)
            return Zapteltonezone_getChild(parent, index);

        if (parent instanceof Zaptelspan)
            return Zaptelspan_getChild(parent, index);

        if (parent instanceof Zapteldynamicspan)
            return Zapteldynamicspan_getChild(parent, index);

        if (parent instanceof Zaptelconf)
            return Zaptelconf_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int Zaptelchannels_getChildCount(Object parent) {
        return 0;
    }

    protected int Zapteltonezone_getChildCount(Object parent) {
        return 0;
    }

    protected int Zaptelspan_getChildCount(Object parent) {
        return 0;
    }

    protected int Zapteldynamicspan_getChildCount(Object parent) {
        return 0;
    }

    protected int Zaptelconf_getChildCount(Object parent) {
        return 4;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof Zaptelchannels)
            return Zaptelchannels_getChildCount(parent);

        if (parent instanceof Zapteltonezone)
            return Zapteltonezone_getChildCount(parent);

        if (parent instanceof Zaptelspan)
            return Zaptelspan_getChildCount(parent);

        if (parent instanceof Zapteldynamicspan)
            return Zapteldynamicspan_getChildCount(parent);

        if (parent instanceof Zaptelconf)
            return Zaptelconf_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean Zaptelchannels_isLeaf() {
        return true;
    }

    protected boolean Zapteltonezone_isLeaf() {
        return true;
    }

    protected boolean Zaptelspan_isLeaf() {
        return true;
    }

    protected boolean Zapteldynamicspan_isLeaf() {
        return true;
    }

    protected boolean Zaptelconf_isLeaf() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof Zaptelchannels)
            return Zaptelchannels_isLeaf();

        if (node instanceof Zapteltonezone)
            return Zapteltonezone_isLeaf();

        if (node instanceof Zaptelspan)
            return Zaptelspan_isLeaf();

        if (node instanceof Zapteldynamicspan)
            return Zapteldynamicspan_isLeaf();

        if (node instanceof Zaptelconf)
            return Zaptelconf_isLeaf();

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

    protected int Zaptelchannels_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Zapteltonezone_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Zaptelspan_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Zapteldynamicspan_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Zaptelconf_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Zaptelchannels)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFzaptelconf.ZAPTELCHANNELS))
                return 0;
        }// end of if (child instanceof MapTyper)

        if (child instanceof Zapteldynamicspan)
            return 1;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFzaptelconf.ZAPTELDYNAMICSPAN))
                return 1;
        }// end of if (child instanceof MapTyper)

        if (child instanceof Zaptelspan)
            return 2;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFzaptelconf.ZAPTELSPAN))
                return 2;
        }// end of if (child instanceof MapTyper)

        if (child instanceof Zapteltonezone)
            return 3;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFzaptelconf.ZAPTELTONEZONE))
                return 3;
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
        if (parent instanceof Zaptelchannels)
            return Zaptelchannels_getIndexOfChild(parent, child);

        if (parent instanceof Zapteltonezone)
            return Zapteltonezone_getIndexOfChild(parent, child);

        if (parent instanceof Zaptelspan)
            return Zaptelspan_getIndexOfChild(parent, child);

        if (parent instanceof Zapteldynamicspan)
            return Zapteldynamicspan_getIndexOfChild(parent, child);

        if (parent instanceof Zaptelconf)
            return Zaptelconf_getIndexOfChild(parent, child);

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
