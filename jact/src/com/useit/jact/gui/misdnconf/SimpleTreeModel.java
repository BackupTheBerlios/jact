/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.misdnconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.misdnconf.MMFmisdnconf;
import com.useit.jact.model.misdnconf.MisdnCryptkey;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.Misdnconf;

/**
 * <p>
 * SimpleTreeModel
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.10 2006/01/09
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
    protected Object Misdnconf_getChild(Object parent, int index) {
        Misdnconf obj = (Misdnconf) parent;
        switch (index) {
        case 0:
            return obj.getMisdnSections();
        case 1:
            return // obj.getMisdnCryptkeyMapTyper();//getMisdnCryptkeyMap();
            new MapTyper(MMFmisdnconf.MISDNCRYPTKEY, obj.getMisdnCryptkeyMap(),
                    MMFmisdnconf.getInstance());
        case 2:
            return // obj.getMisdnSectionsMapTyper();//getMisdnSectionsMap();
            new MapTyper(MMFmisdnconf.MISDNSECTIONS, obj.getMisdnSectionsMap(),
                    MMFmisdnconf.getInstance());
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
    protected Object MisdnCryptkey_getChild(Object parent, int index) {
        MisdnCryptkey obj = (MisdnCryptkey) parent;
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
    protected Object MisdnSections_getChild(Object parent, int index) {
        MisdnSections obj = (MisdnSections) parent;
        switch (index) {
        case 0:
            return // obj.getMisdnPortsMapTyper();//getMisdnPortsMap();
            new MapTyper(MMFmisdnconf.MISDNPORTS, obj.getMisdnPortsMap(),
                    MMFmisdnconf.getInstance());
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
    protected Object MisdnPorts_getChild(Object parent, int index) {
        MisdnPorts obj = (MisdnPorts) parent;
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
        if (parent instanceof Misdnconf)
            return Misdnconf_getChild(parent, index);

        if (parent instanceof MisdnCryptkey)
            return MisdnCryptkey_getChild(parent, index);

        if (parent instanceof MisdnSections)
            return MisdnSections_getChild(parent, index);

        if (parent instanceof MisdnPorts)
            return MisdnPorts_getChild(parent, index);

        return super.getChild(parent, index);
    }

    protected int Misdnconf_getChildCount(Object parent) {
        return 3;
    }

    protected int MisdnCryptkey_getChildCount(Object parent) {
        return 0;
    }

    protected int MisdnSections_getChildCount(Object parent) {
        return 1;
    }

    protected int MisdnPorts_getChildCount(Object parent) {
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
        if (parent instanceof Misdnconf)
            return Misdnconf_getChildCount(parent);

        if (parent instanceof MisdnCryptkey)
            return MisdnCryptkey_getChildCount(parent);

        if (parent instanceof MisdnSections)
            return MisdnSections_getChildCount(parent);

        if (parent instanceof MisdnPorts)
            return MisdnPorts_getChildCount(parent);

        return super.getChildCount(parent);
    }

    protected boolean Misdnconf_isLeaf() {
        return false;
    }

    protected boolean MisdnCryptkey_isLeaf() {
        return true;
    }

    protected boolean MisdnSections_isLeaf() {
        return false;
    }

    protected boolean MisdnPorts_isLeaf() {
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if (node instanceof Misdnconf)
            return Misdnconf_isLeaf();

        if (node instanceof MisdnCryptkey)
            return MisdnCryptkey_isLeaf();

        if (node instanceof MisdnSections)
            return MisdnSections_isLeaf();

        if (node instanceof MisdnPorts)
            return MisdnPorts_isLeaf();

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

    protected int Misdnconf_getIndexOfChild(Object parent, Object child) {
        if (child instanceof MisdnSections)
            return 0;
        if (child instanceof MisdnCryptkey)
            return 1;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFmisdnconf.MISDNCRYPTKEY))
                return 1;
        }// end of if (child instanceof MapTyper)

        if (child instanceof MisdnSections)
            return 2;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFmisdnconf.MISDNSECTIONS))
                return 2;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int MisdnCryptkey_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    protected int MisdnSections_getIndexOfChild(Object parent, Object child) {
        if (child instanceof MisdnPorts)
            return 0;
        if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if (mt.getMapkey().equals(MMFmisdnconf.MISDNPORTS))
                return 0;
        }// end of if (child instanceof MapTyper)

        return -1;
    }

    protected int MisdnPorts_getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.tree.TreeModel#getIndexOfChild(java.lang.Object,
     *      java.lang.Object)
     */
    public int getIndexOfChild(Object parent, Object child) {
        if (parent instanceof Misdnconf)
            return Misdnconf_getIndexOfChild(parent, child);

        if (parent instanceof MisdnCryptkey)
            return MisdnCryptkey_getIndexOfChild(parent, child);

        if (parent instanceof MisdnSections)
            return MisdnSections_getIndexOfChild(parent, child);

        if (parent instanceof MisdnPorts)
            return MisdnPorts_getIndexOfChild(parent, child);

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
