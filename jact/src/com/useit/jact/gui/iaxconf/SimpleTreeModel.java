/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.iaxconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.Iaxregister;
import com.useit.jact.model.iaxconf.MMFiaxconf;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.7 2006/01/09
 *          10:17:35 urs Exp $
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
    protected Object Iaxjitter_getChild(Object parent, int index) {
        Iaxjitter obj = (Iaxjitter) parent;
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
    protected Object Iaxregister_getChild(Object parent, int index) {
        Iaxregister obj = (Iaxregister) parent;
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
    protected Object Iaxdeny_getChild(Object parent, int index) {
        Iaxdeny obj = (Iaxdeny) parent;
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
    protected Object Iaxpermit_getChild(Object parent, int index) {
        Iaxpermit obj = (Iaxpermit) parent;
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
    protected Object Iaxpeer_getChild(Object parent, int index) {
        Iaxpeer obj = (Iaxpeer) parent;
        switch (index) {
        case 0:
            return // obj.getIaxdenyMapTyper();//getIaxdenyMap();
            new MapTyper(MMFiaxconf.IAXDENY, obj.getIaxdenyMap(), MMFiaxconf
                    .getInstance());
        case 1:
            return // obj.getIaxpermitMapTyper();//getIaxpermitMap();
            new MapTyper(MMFiaxconf.IAXPERMIT, obj.getIaxpermitMap(),
                    MMFiaxconf.getInstance());
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
    protected Object Iaxgeneral_getChild(Object parent, int index) {
        Iaxgeneral obj = (Iaxgeneral) parent;
        switch (index) {
        case 0:
            return obj.getIaxjitter();
        case 1:
            return // obj.getIaxpeerMapTyper();//getIaxpeerMap();
            new MapTyper(MMFiaxconf.IAXPEER, obj.getIaxpeerMap(), MMFiaxconf
                    .getInstance());
        case 2:
            return // obj.getIaxregisterMapTyper();//getIaxregisterMap();
            new MapTyper(MMFiaxconf.IAXREGISTER, obj.getIaxregisterMap(),
                    MMFiaxconf.getInstance());
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
        if (parent instanceof Iaxjitter)
            return Iaxjitter_getChild(parent, index);

        if (parent instanceof Iaxregister)
            return Iaxregister_getChild(parent, index);

        if (parent instanceof Iaxdeny)
            return Iaxdeny_getChild(parent, index);

        if (parent instanceof Iaxpermit)
            return Iaxpermit_getChild(parent, index);

        if (parent instanceof Iaxpeer)
            return Iaxpeer_getChild(parent, index);

        if (parent instanceof Iaxgeneral)
            return Iaxgeneral_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int Iaxjitter_getChildCount(Object parent) {
        return 0;
    }

    protected int Iaxregister_getChildCount(Object parent) {
        return 0;
    }

    protected int Iaxdeny_getChildCount(Object parent) {
        return 0;
    }

    protected int Iaxpermit_getChildCount(Object parent) {
        return 0;
    }

    protected int Iaxpeer_getChildCount(Object parent) {
        return 2;
    }

    protected int Iaxgeneral_getChildCount(Object parent) {
        return 3;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof Iaxjitter)
            return Iaxjitter_getChildCount(parent);

        if (parent instanceof Iaxregister)
            return Iaxregister_getChildCount(parent);

        if (parent instanceof Iaxdeny)
            return Iaxdeny_getChildCount(parent);

        if (parent instanceof Iaxpermit)
            return Iaxpermit_getChildCount(parent);

        if (parent instanceof Iaxpeer)
            return Iaxpeer_getChildCount(parent);

        if (parent instanceof Iaxgeneral)
            return Iaxgeneral_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean Iaxjitter_isLeaf() {
        return true;
    }

    protected boolean Iaxregister_isLeaf() {
        return true;
    }

    protected boolean Iaxdeny_isLeaf() {
        return true;
    }

    protected boolean Iaxpermit_isLeaf() {
        return true;
    }

    protected boolean Iaxpeer_isLeaf() {
        return false;
    }

    protected boolean Iaxgeneral_isLeaf() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof Iaxjitter)
            return Iaxjitter_isLeaf();

        if (node instanceof Iaxregister)
            return Iaxregister_isLeaf();

        if (node instanceof Iaxdeny)
            return Iaxdeny_isLeaf();

        if (node instanceof Iaxpermit)
            return Iaxpermit_isLeaf();

        if (node instanceof Iaxpeer)
            return Iaxpeer_isLeaf();

        if (node instanceof Iaxgeneral)
            return Iaxgeneral_isLeaf();

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

    protected int Iaxjitter_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Iaxregister_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Iaxdeny_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Iaxpermit_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Iaxpeer_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Iaxdeny)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFiaxconf.IAXDENY))
                return 0;
        }// end of if (child instanceof MapTyper)

        if (child instanceof Iaxpermit)
            return 1;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFiaxconf.IAXPERMIT))
                return 1;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int Iaxgeneral_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Iaxjitter)
            return 0;
        if (child instanceof Iaxpeer)
            return 1;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFiaxconf.IAXPEER))
                return 1;
        }// end of if (child instanceof MapTyper)

        if (child instanceof Iaxregister)
            return 2;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFiaxconf.IAXREGISTER))
                return 2;
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
        if (parent instanceof Iaxjitter)
            return Iaxjitter_getIndexOfChild(parent, child);

        if (parent instanceof Iaxregister)
            return Iaxregister_getIndexOfChild(parent, child);

        if (parent instanceof Iaxdeny)
            return Iaxdeny_getIndexOfChild(parent, child);

        if (parent instanceof Iaxpermit)
            return Iaxpermit_getIndexOfChild(parent, child);

        if (parent instanceof Iaxpeer)
            return Iaxpeer_getIndexOfChild(parent, child);

        if (parent instanceof Iaxgeneral)
            return Iaxgeneral_getIndexOfChild(parent, child);

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
