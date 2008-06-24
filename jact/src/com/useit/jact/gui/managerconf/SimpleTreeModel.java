/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.managerconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.managerconf.MMFmanagerconf;
import com.useit.jact.model.managerconf.ManagerSection;
import com.useit.jact.model.managerconf.Managerdeny;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.Managerpermit;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.9 2006/01/09
 *          10:17:33 urs Exp $
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
    protected Object ManagerSection_getChild(Object parent, int index) {
        ManagerSection obj = (ManagerSection) parent;
        switch (index) {
        case 0:
            return // obj.getManagerdenyMapTyper();//getManagerdenyMap();
            new MapTyper(MMFmanagerconf.MANAGERDENY, obj.getManagerdenyMap(),
                    MMFmanagerconf.getInstance());
        case 1:
            return // obj.getManagerpermitMapTyper();//getManagerpermitMap();
            new MapTyper(MMFmanagerconf.MANAGERPERMIT, obj
                    .getManagerpermitMap(), MMFmanagerconf.getInstance());
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
    protected Object Managerdeny_getChild(Object parent, int index) {
        Managerdeny obj = (Managerdeny) parent;
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
    protected Object Managerpermit_getChild(Object parent, int index) {
        Managerpermit obj = (Managerpermit) parent;
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
    protected Object ManagergeneralSection_getChild(Object parent, int index) {
        ManagergeneralSection obj = (ManagergeneralSection) parent;
        switch (index) {
        case 0:
            return // obj.getManagerSectionMapTyper();//getManagerSectionMap();
            new MapTyper(MMFmanagerconf.MANAGERSECTION, obj
                    .getManagerSectionMap(), MMFmanagerconf.getInstance());
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
        if (parent instanceof ManagerSection)
            return ManagerSection_getChild(parent, index);

        if (parent instanceof Managerdeny)
            return Managerdeny_getChild(parent, index);

        if (parent instanceof Managerpermit)
            return Managerpermit_getChild(parent, index);

        if (parent instanceof ManagergeneralSection)
            return ManagergeneralSection_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int ManagerSection_getChildCount(Object parent) {
        return 2;
    }

    protected int Managerdeny_getChildCount(Object parent) {
        return 0;
    }

    protected int Managerpermit_getChildCount(Object parent) {
        return 0;
    }

    protected int ManagergeneralSection_getChildCount(Object parent) {
        return 1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof ManagerSection)
            return ManagerSection_getChildCount(parent);

        if (parent instanceof Managerdeny)
            return Managerdeny_getChildCount(parent);

        if (parent instanceof Managerpermit)
            return Managerpermit_getChildCount(parent);

        if (parent instanceof ManagergeneralSection)
            return ManagergeneralSection_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean ManagerSection_isLeaf() {
        return false;
    }

    protected boolean Managerdeny_isLeaf() {
        return true;
    }

    protected boolean Managerpermit_isLeaf() {
        return true;
    }

    protected boolean ManagergeneralSection_isLeaf() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof ManagerSection)
            return ManagerSection_isLeaf();

        if (node instanceof Managerdeny)
            return Managerdeny_isLeaf();

        if (node instanceof Managerpermit)
            return Managerpermit_isLeaf();

        if (node instanceof ManagergeneralSection)
            return ManagergeneralSection_isLeaf();

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

    protected int ManagerSection_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Managerdeny)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFmanagerconf.MANAGERDENY))
                return 0;
        }// end of if (child instanceof MapTyper)

        if (child instanceof Managerpermit)
            return 1;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFmanagerconf.MANAGERPERMIT))
                return 1;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int Managerdeny_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Managerpermit_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int ManagergeneralSection_getIndexOfChild(Object parent,
            Object child) {
        if (child instanceof ManagerSection)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFmanagerconf.MANAGERSECTION))
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
        if (parent instanceof ManagerSection)
            return ManagerSection_getIndexOfChild(parent, child);

        if (parent instanceof Managerdeny)
            return Managerdeny_getIndexOfChild(parent, child);

        if (parent instanceof Managerpermit)
            return Managerpermit_getIndexOfChild(parent, child);

        if (parent instanceof ManagergeneralSection)
            return ManagergeneralSection_getIndexOfChild(parent, child);

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
