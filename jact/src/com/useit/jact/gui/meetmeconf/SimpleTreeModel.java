/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.meetmeconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.meetmeconf.MMFmeetmeconf;
import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.Meetmerooms;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.7 2006/01/09
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
    protected Object Meetmeconf_getChild(Object parent, int index) {
        Meetmeconf obj = (Meetmeconf) parent;
        switch (index) {
        case 0:
            return // obj.getMeetmeroomsMapTyper();//getMeetmeroomsMap();
            new MapTyper(MMFmeetmeconf.MEETMEROOMS, obj.getMeetmeroomsMap(),
                    MMFmeetmeconf.getInstance());
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
    protected Object Meetmerooms_getChild(Object parent, int index) {
        Meetmerooms obj = (Meetmerooms) parent;
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
    public Object getChild(Object parent, int index) {
        if (parent instanceof Meetmeconf)
            return Meetmeconf_getChild(parent, index);

        if (parent instanceof Meetmerooms)
            return Meetmerooms_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int Meetmeconf_getChildCount(Object parent) {
        return 1;
    }

    protected int Meetmerooms_getChildCount(Object parent) {
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof Meetmeconf)
            return Meetmeconf_getChildCount(parent);

        if (parent instanceof Meetmerooms)
            return Meetmerooms_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean Meetmeconf_isLeaf() {
        return false;
    }

    protected boolean Meetmerooms_isLeaf() {
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof Meetmeconf)
            return Meetmeconf_isLeaf();

        if (node instanceof Meetmerooms)
            return Meetmerooms_isLeaf();

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

    protected int Meetmeconf_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Meetmerooms)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFmeetmeconf.MEETMEROOMS))
                return 0;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int Meetmerooms_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getIndexOfChild(java.lang.Object,
     *      java.lang.Object)
     */
    public int getIndexOfChild(Object parent, Object child) {
        if (parent instanceof Meetmeconf)
            return Meetmeconf_getIndexOfChild(parent, child);

        if (parent instanceof Meetmerooms)
            return Meetmerooms_getIndexOfChild(parent, child);

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
