/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.agentconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.Agentsrecording;
import com.useit.jact.model.agentconf.MMFagentconf;

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
    protected Object Agents_getChild(Object parent, int index) {
        Agents obj = (Agents) parent;
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
    protected Object Agentsconf_getChild(Object parent, int index) {
        Agentsconf obj = (Agentsconf) parent;
        switch (index) {
        case 0:
            return obj.getAgentsrecording();
        case 1:
            return // obj.getAgentsMapTyper();//getAgentsMap();
            new MapTyper(MMFagentconf.AGENTS, obj.getAgentsMap(), MMFagentconf
                    .getInstance());
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
    protected Object Agentsrecording_getChild(Object parent, int index) {
        Agentsrecording obj = (Agentsrecording) parent;
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
        if (parent instanceof Agents)
            return Agents_getChild(parent, index);

        if (parent instanceof Agentsconf)
            return Agentsconf_getChild(parent, index);

        if (parent instanceof Agentsrecording)
            return Agentsrecording_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int Agents_getChildCount(Object parent) {
        return 0;
    }

    protected int Agentsconf_getChildCount(Object parent) {
        return 2;
    }

    protected int Agentsrecording_getChildCount(Object parent) {
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof Agents)
            return Agents_getChildCount(parent);

        if (parent instanceof Agentsconf)
            return Agentsconf_getChildCount(parent);

        if (parent instanceof Agentsrecording)
            return Agentsrecording_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean Agents_isLeaf() {
        return true;
    }

    protected boolean Agentsconf_isLeaf() {
        return false;
    }

    protected boolean Agentsrecording_isLeaf() {
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof Agents)
            return Agents_isLeaf();

        if (node instanceof Agentsconf)
            return Agentsconf_isLeaf();

        if (node instanceof Agentsrecording)
            return Agentsrecording_isLeaf();

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

    protected int Agents_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Agentsconf_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Agentsrecording)
            return 0;
        if (child instanceof Agents)
            return 1;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFagentconf.AGENTS))
                return 1;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int Agentsrecording_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getIndexOfChild(java.lang.Object,
     *      java.lang.Object)
     */
    public int getIndexOfChild(Object parent, Object child) {
        if (parent instanceof Agents)
            return Agents_getIndexOfChild(parent, child);

        if (parent instanceof Agentsconf)
            return Agentsconf_getIndexOfChild(parent, child);

        if (parent instanceof Agentsrecording)
            return Agentsrecording_getIndexOfChild(parent, child);

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
