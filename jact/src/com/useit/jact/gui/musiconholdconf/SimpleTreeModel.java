/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.musiconholdconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.musiconholdconf.MMFmusiconholdconf;
import com.useit.jact.model.musiconholdconf.MohClasses;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.7 2006/01/09
 *          10:17:42 urs Exp $
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
    protected Object MohClasses_getChild(Object parent, int index) {
        MohClasses obj = (MohClasses) parent;
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
    protected Object Music_on_HoldConf_getChild(Object parent, int index) {
        Music_on_HoldConf obj = (Music_on_HoldConf) parent;
        switch (index) {
        case 0:
            return // obj.getMohClassesMapTyper();//getMohClassesMap();
            new MapTyper(MMFmusiconholdconf.MOHCLASSES, obj.getMohClassesMap(),
                    MMFmusiconholdconf.getInstance());
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
        if (parent instanceof MohClasses)
            return MohClasses_getChild(parent, index);

        if (parent instanceof Music_on_HoldConf)
            return Music_on_HoldConf_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int MohClasses_getChildCount(Object parent) {
        return 0;
    }

    protected int Music_on_HoldConf_getChildCount(Object parent) {
        return 1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof MohClasses)
            return MohClasses_getChildCount(parent);

        if (parent instanceof Music_on_HoldConf)
            return Music_on_HoldConf_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean MohClasses_isLeaf() {
        return true;
    }

    protected boolean Music_on_HoldConf_isLeaf() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof MohClasses)
            return MohClasses_isLeaf();

        if (node instanceof Music_on_HoldConf)
            return Music_on_HoldConf_isLeaf();

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

    protected int MohClasses_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Music_on_HoldConf_getIndexOfChild(Object parent, Object child) {
        if (child instanceof MohClasses)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFmusiconholdconf.MOHCLASSES))
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
        if (parent instanceof MohClasses)
            return MohClasses_getIndexOfChild(parent, child);

        if (parent instanceof Music_on_HoldConf)
            return Music_on_HoldConf_getIndexOfChild(parent, child);

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
