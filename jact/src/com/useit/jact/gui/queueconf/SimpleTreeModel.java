/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.queueconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.queueconf.MMFqueueconf;
import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.Queuemember;
import com.useit.jact.model.queueconf.Queuesection;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.8 2006/01/14
 *          15:44:46 urs Exp $
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
    protected Object Queuegeneral_getChild(Object parent, int index) {
        Queuegeneral obj = (Queuegeneral) parent;
        switch (index) {
        case 0:
            return // obj.getQueuesectionMapTyper();//getQueuesectionMap();
            new MapTyper(MMFqueueconf.QUEUESECTION, obj.getQueuesectionMap(),
                    MMFqueueconf.getInstance());
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
    protected Object Queuesection_getChild(Object parent, int index) {
        Queuesection obj = (Queuesection) parent;
        switch (index) {
        case 0:
            return // obj.getQueuememberMapTyper();//getQueuememberMap();
            new MapTyper(MMFqueueconf.QUEUEMEMBER, obj.getQueuememberMap(),
                    MMFqueueconf.getInstance());
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
    protected Object Queuemember_getChild(Object parent, int index) {
        Queuemember obj = (Queuemember) parent;
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
        if (parent instanceof Queuegeneral)
            return Queuegeneral_getChild(parent, index);

        if (parent instanceof Queuesection)
            return Queuesection_getChild(parent, index);

        if (parent instanceof Queuemember)
            return Queuemember_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int Queuegeneral_getChildCount(Object parent) {
        return 1;
    }

    protected int Queuesection_getChildCount(Object parent) {
        return 1;
    }

    protected int Queuemember_getChildCount(Object parent) {
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof Queuegeneral)
            return Queuegeneral_getChildCount(parent);

        if (parent instanceof Queuesection)
            return Queuesection_getChildCount(parent);

        if (parent instanceof Queuemember)
            return Queuemember_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean Queuegeneral_isLeaf() {
        return false;
    }

    protected boolean Queuesection_isLeaf() {
        return false;
    }

    protected boolean Queuemember_isLeaf() {
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof Queuegeneral)
            return Queuegeneral_isLeaf();

        if (node instanceof Queuesection)
            return Queuesection_isLeaf();

        if (node instanceof Queuemember)
            return Queuemember_isLeaf();

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

    protected int Queuegeneral_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Queuesection)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFqueueconf.QUEUESECTION))
                return 0;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int Queuesection_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Queuemember)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFqueueconf.QUEUEMEMBER))
                return 0;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int Queuemember_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getIndexOfChild(java.lang.Object,
     *      java.lang.Object)
     */
    public int getIndexOfChild(Object parent, Object child) {
        if (parent instanceof Queuegeneral)
            return Queuegeneral_getIndexOfChild(parent, child);

        if (parent instanceof Queuesection)
            return Queuesection_getIndexOfChild(parent, child);

        if (parent instanceof Queuemember)
            return Queuemember_getIndexOfChild(parent, child);

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
