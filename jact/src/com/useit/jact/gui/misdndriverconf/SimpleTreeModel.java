/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.misdndriverconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.misdndriverconf.MMFmisdndriverconf;
import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.6 2006/01/09
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
    protected Object MisdncardPorts_getChild(Object parent, int index) {
        MisdncardPorts obj = (MisdncardPorts) parent;
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
    protected Object MisdnCards_getChild(Object parent, int index) {
        MisdnCards obj = (MisdnCards) parent;
        switch (index) {
        case 0:
            return // obj.getMisdncardPortsMapTyper();//getMisdncardPortsMap();
            new MapTyper(MMFmisdndriverconf.MISDNCARDPORTS, obj
                    .getMisdncardPortsMap(), MMFmisdndriverconf.getInstance());
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
    protected Object MisdnDriverConf_getChild(Object parent, int index) {
        MisdnDriverConf obj = (MisdnDriverConf) parent;
        switch (index) {
        case 0:
            return // obj.getMisdnCardsMapTyper();//getMisdnCardsMap();
            new MapTyper(MMFmisdndriverconf.MISDNCARDS, obj.getMisdnCardsMap(),
                    MMFmisdndriverconf.getInstance());
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
        if (parent instanceof MisdncardPorts)
            return MisdncardPorts_getChild(parent, index);

        if (parent instanceof MisdnCards)
            return MisdnCards_getChild(parent, index);

        if (parent instanceof MisdnDriverConf)
            return MisdnDriverConf_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int MisdncardPorts_getChildCount(Object parent) {
        return 0;
    }

    protected int MisdnCards_getChildCount(Object parent) {
        return 1;
    }

    protected int MisdnDriverConf_getChildCount(Object parent) {
        return 1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof MisdncardPorts)
            return MisdncardPorts_getChildCount(parent);

        if (parent instanceof MisdnCards)
            return MisdnCards_getChildCount(parent);

        if (parent instanceof MisdnDriverConf)
            return MisdnDriverConf_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean MisdncardPorts_isLeaf() {
        return true;
    }

    protected boolean MisdnCards_isLeaf() {
        return false;
    }

    protected boolean MisdnDriverConf_isLeaf() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof MisdncardPorts)
            return MisdncardPorts_isLeaf();

        if (node instanceof MisdnCards)
            return MisdnCards_isLeaf();

        if (node instanceof MisdnDriverConf)
            return MisdnDriverConf_isLeaf();

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

    protected int MisdncardPorts_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int MisdnCards_getIndexOfChild(Object parent, Object child) {
        if (child instanceof MisdncardPorts)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFmisdndriverconf.MISDNCARDPORTS))
                return 0;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int MisdnDriverConf_getIndexOfChild(Object parent, Object child) {
        if (child instanceof MisdnCards)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFmisdndriverconf.MISDNCARDS))
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
        if (parent instanceof MisdncardPorts)
            return MisdncardPorts_getIndexOfChild(parent, child);

        if (parent instanceof MisdnCards)
            return MisdnCards_getIndexOfChild(parent, child);

        if (parent instanceof MisdnDriverConf)
            return MisdnDriverConf_getIndexOfChild(parent, child);

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
