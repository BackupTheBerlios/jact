/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.voicemailconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.voicemailconf.MMFvoicemailconf;
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.Zonemessages;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.9 2006/01/14
 *          15:00:13 urs Exp $
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
    protected Object Voicemailgeneral_getChild(Object parent, int index) {
        Voicemailgeneral obj = (Voicemailgeneral) parent;
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
    protected Object VoicemailConf_getChild(Object parent, int index) {
        VoicemailConf obj = (VoicemailConf) parent;
        switch (index) {
        case 0:
            return obj.getVoicemailgeneral();
        case 1:
            return // obj.getVoicemailcontextMapTyper();//getVoicemailcontextMap();
            new MapTyper(MMFvoicemailconf.VOICEMAILCONTEXT, obj
                    .getVoicemailcontextMap(), MMFvoicemailconf.getInstance());
        case 2:
            return // obj.getZonemessagesMapTyper();//getZonemessagesMap();
            new MapTyper(MMFvoicemailconf.ZONEMESSAGES, obj
                    .getZonemessagesMap(), MMFvoicemailconf.getInstance());
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
    protected Object Voicemailcontext_getChild(Object parent, int index) {
        Voicemailcontext obj = (Voicemailcontext) parent;
        switch (index) {
        case 0:
            return // obj.getVoicemailcontextentryMapTyper();//getVoicemailcontextentryMap();
            new MapTyper(MMFvoicemailconf.VOICEMAILCONTEXTENTRY, obj
                    .getVoicemailcontextentryMap(), MMFvoicemailconf
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
    protected Object Zonemessages_getChild(Object parent, int index) {
        Zonemessages obj = (Zonemessages) parent;
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
    protected Object Voicemailcontextentry_getChild(Object parent, int index) {
        Voicemailcontextentry obj = (Voicemailcontextentry) parent;
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
        if (parent instanceof Voicemailgeneral)
            return Voicemailgeneral_getChild(parent, index);

        if (parent instanceof VoicemailConf)
            return VoicemailConf_getChild(parent, index);

        if (parent instanceof Voicemailcontext)
            return Voicemailcontext_getChild(parent, index);

        if (parent instanceof Zonemessages)
            return Zonemessages_getChild(parent, index);

        if (parent instanceof Voicemailcontextentry)
            return Voicemailcontextentry_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int Voicemailgeneral_getChildCount(Object parent) {
        return 0;
    }

    protected int VoicemailConf_getChildCount(Object parent) {
        return 3;
    }

    protected int Voicemailcontext_getChildCount(Object parent) {
        return 1;
    }

    protected int Zonemessages_getChildCount(Object parent) {
        return 0;
    }

    protected int Voicemailcontextentry_getChildCount(Object parent) {
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof Voicemailgeneral)
            return Voicemailgeneral_getChildCount(parent);

        if (parent instanceof VoicemailConf)
            return VoicemailConf_getChildCount(parent);

        if (parent instanceof Voicemailcontext)
            return Voicemailcontext_getChildCount(parent);

        if (parent instanceof Zonemessages)
            return Zonemessages_getChildCount(parent);

        if (parent instanceof Voicemailcontextentry)
            return Voicemailcontextentry_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean Voicemailgeneral_isLeaf() {
        return true;
    }

    protected boolean VoicemailConf_isLeaf() {
        return false;
    }

    protected boolean Voicemailcontext_isLeaf() {
        return false;
    }

    protected boolean Zonemessages_isLeaf() {
        return true;
    }

    protected boolean Voicemailcontextentry_isLeaf() {
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof Voicemailgeneral)
            return Voicemailgeneral_isLeaf();

        if (node instanceof VoicemailConf)
            return VoicemailConf_isLeaf();

        if (node instanceof Voicemailcontext)
            return Voicemailcontext_isLeaf();

        if (node instanceof Zonemessages)
            return Zonemessages_isLeaf();

        if (node instanceof Voicemailcontextentry)
            return Voicemailcontextentry_isLeaf();

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

    protected int Voicemailgeneral_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int VoicemailConf_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Voicemailgeneral)
            return 0;
        if (child instanceof Voicemailcontext)
            return 1;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFvoicemailconf.VOICEMAILCONTEXT))
                return 1;
        }// end of if (child instanceof MapTyper)

        if (child instanceof Zonemessages)
            return 2;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFvoicemailconf.ZONEMESSAGES))
                return 2;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int Voicemailcontext_getIndexOfChild(Object parent, Object child) {
        if (child instanceof Voicemailcontextentry)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFvoicemailconf.VOICEMAILCONTEXTENTRY))
                return 0;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int Zonemessages_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int Voicemailcontextentry_getIndexOfChild(Object parent,
            Object child) {
        return -1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getIndexOfChild(java.lang.Object,
     *      java.lang.Object)
     */
    public int getIndexOfChild(Object parent, Object child) {
        if (parent instanceof Voicemailgeneral)
            return Voicemailgeneral_getIndexOfChild(parent, child);

        if (parent instanceof VoicemailConf)
            return VoicemailConf_getIndexOfChild(parent, child);

        if (parent instanceof Voicemailcontext)
            return Voicemailcontext_getIndexOfChild(parent, child);

        if (parent instanceof Zonemessages)
            return Zonemessages_getIndexOfChild(parent, child);

        if (parent instanceof Voicemailcontextentry)
            return Voicemailcontextentry_getIndexOfChild(parent, child);

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
