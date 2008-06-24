/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.featureconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.Featuresconf;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.7 2006/01/09
 *          10:17:46 urs Exp $
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
    protected Object Featuremap_getChild(Object parent, int index) {
        Featuremap obj = (Featuremap) parent;
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
    protected Object Featuresconf_getChild(Object parent, int index) {
        Featuresconf obj = (Featuresconf) parent;
        switch (index) {
        case 0:
            return obj.getFeaturemap();
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
        if (parent instanceof Featuremap)
            return Featuremap_getChild(parent, index);

        if (parent instanceof Featuresconf)
            return Featuresconf_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int Featuremap_getChildCount(Object parent) {
        return 0;
    }

    protected int Featuresconf_getChildCount(Object parent) {
        return 1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof Featuremap)
            return Featuremap_getChildCount(parent);

        if (parent instanceof Featuresconf)
            return Featuresconf_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean Featuremap_isLeaf() {
        return true;
    }

    protected boolean Featuresconf_isLeaf() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof Featuremap)
            return Featuremap_isLeaf();

        if (node instanceof Featuresconf)
            return Featuresconf_isLeaf();

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

    protected int Featuremap_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Featuresconf_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Featuremap)
            return 0;
        return -1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getIndexOfChild(java.lang.Object,
     *      java.lang.Object)
     */
    public int getIndexOfChild(Object parent, Object child) {
        if (parent instanceof Featuremap)
            return Featuremap_getIndexOfChild(parent, child);

        if (parent instanceof Featuresconf)
            return Featuresconf_getIndexOfChild(parent, child);

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
