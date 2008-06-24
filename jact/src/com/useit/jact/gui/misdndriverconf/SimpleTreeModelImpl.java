/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.misdndriverconf;

/**
 * <p>
 * SimpleTreeModelImpl
 * </p>
 * Created : 09.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimpleTreeModelImpl.java,v 1.2 2006/01/05
 *          12:57:41 urs Exp $
 */
public class SimpleTreeModelImpl extends SimpleTreeModel {
    private Object root;

    /**
     * 
     */
    public SimpleTreeModelImpl() {
        super();
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

}
