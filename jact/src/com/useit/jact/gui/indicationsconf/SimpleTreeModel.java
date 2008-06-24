/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.indicationsconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.MMFindicationsconf;
import com.useit.jact.model.indicationsconf.ToneDefinitions;

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
    protected Object ToneDefinitions_getChild(Object parent, int index) {
        ToneDefinitions obj = (ToneDefinitions) parent;
        switch (index) {
        case 0:
            return // obj.getCustomToneMapTyper();//getCustomToneMap();
            new MapTyper(MMFindicationsconf.CUSTOMTONE, obj.getCustomToneMap(),
                    MMFindicationsconf.getInstance());
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
    protected Object CustomTone_getChild(Object parent, int index) {
        CustomTone obj = (CustomTone) parent;
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
    protected Object Indicationsconf_getChild(Object parent, int index) {
        Indicationsconf obj = (Indicationsconf) parent;
        switch (index) {
        case 0:
            return // obj.getToneDefinitionsMapTyper();//getToneDefinitionsMap();
            new MapTyper(MMFindicationsconf.TONEDEFINITIONS, obj
                    .getToneDefinitionsMap(), MMFindicationsconf.getInstance());
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
        if (parent instanceof ToneDefinitions)
            return ToneDefinitions_getChild(parent, index);

        if (parent instanceof CustomTone)
            return CustomTone_getChild(parent, index);

        if (parent instanceof Indicationsconf)
            return Indicationsconf_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int ToneDefinitions_getChildCount(Object parent) {
        return 1;
    }

    protected int CustomTone_getChildCount(Object parent) {
        return 0;
    }

    protected int Indicationsconf_getChildCount(Object parent) {
        return 1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof ToneDefinitions)
            return ToneDefinitions_getChildCount(parent);

        if (parent instanceof CustomTone)
            return CustomTone_getChildCount(parent);

        if (parent instanceof Indicationsconf)
            return Indicationsconf_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean ToneDefinitions_isLeaf() {
        return false;
    }

    protected boolean CustomTone_isLeaf() {
        return true;
    }

    protected boolean Indicationsconf_isLeaf() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof ToneDefinitions)
            return ToneDefinitions_isLeaf();

        if (node instanceof CustomTone)
            return CustomTone_isLeaf();

        if (node instanceof Indicationsconf)
            return Indicationsconf_isLeaf();

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

    protected int ToneDefinitions_getIndexOfChild(Object parent, Object child) {
        if (child instanceof CustomTone)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFindicationsconf.CUSTOMTONE))
                return 0;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int CustomTone_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Indicationsconf_getIndexOfChild(Object parent, Object child) {
        if (child instanceof ToneDefinitions)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFindicationsconf.TONEDEFINITIONS))
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
        if (parent instanceof ToneDefinitions)
            return ToneDefinitions_getIndexOfChild(parent, child);

        if (parent instanceof CustomTone)
            return CustomTone_getIndexOfChild(parent, child);

        if (parent instanceof Indicationsconf)
            return Indicationsconf_getIndexOfChild(parent, child);

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
