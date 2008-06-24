/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.sipconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.sipconf.MMFsipconf;
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.Sipregister;

/** 
 * <p> 
 * SimpleTreeModel 
 * </p> 
 * Created : 09.08.2005 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $ 
 */
public abstract class SimpleTreeModel extends AbstractSimpleTreeModel{
	protected Object root;
    /**
     * 
     */
    public SimpleTreeModel() {
        super();
        // TODO Auto-generated constructor stub
    }

	    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getRoot()
     */
    public void setRoot(Object root) {
        this.root = root;
    }

    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getRoot()
     */
    public Object getRoot() {
         return root;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  Sipregister_getChild(Object parent, int index) {
        Sipregister obj = (Sipregister) parent;
        switch (index) {
       default:
            break;
        }
		return null;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  Sipauth_getChild(Object parent, int index) {
        Sipauth obj = (Sipauth) parent;
        switch (index) {
       default:
            break;
        }
		return null;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  SipConf_getChild(Object parent, int index) {
        SipConf obj = (SipConf) parent;
        switch (index) {
        case 0: return obj.getSipgeneral();
        case 1: return //obj.getSippeersMapTyper();//getSippeersMap();
        				new MapTyper(MMFsipconf.SIPPEERS,obj.getSippeersMap(),MMFsipconf.getInstance());
       default:
            break;
        }
		return null;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  Sippeers_getChild(Object parent, int index) {
        Sippeers obj = (Sippeers) parent;
        switch (index) {
        case 0: return //obj.getSipauthMapTyper();//getSipauthMap();
        				new MapTyper(MMFsipconf.SIPAUTH,obj.getSipauthMap(),MMFsipconf.getInstance());
       default:
            break;
        }
		return null;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  Sipgeneral_getChild(Object parent, int index) {
        Sipgeneral obj = (Sipgeneral) parent;
        switch (index) {
        case 0: return //obj.getSipauthMapTyper();//getSipauthMap();
        				new MapTyper(MMFsipconf.SIPAUTH,obj.getSipauthMap(),MMFsipconf.getInstance());
        case 1: return //obj.getSipregisterMapTyper();//getSipregisterMap();
        				new MapTyper(MMFsipconf.SIPREGISTER,obj.getSipregisterMap(),MMFsipconf.getInstance());
       default:
            break;
        }
		return null;
    }
    
    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    public Object getChild(Object parent, int index) {
        if(parent instanceof Sipregister)
            return Sipregister_getChild(parent,index);
        
        if(parent instanceof Sipauth)
            return Sipauth_getChild(parent,index);
        
        if(parent instanceof SipConf)
            return SipConf_getChild(parent,index);
        
        if(parent instanceof Sippeers)
            return Sippeers_getChild(parent,index);
        
        if(parent instanceof Sipgeneral)
            return Sipgeneral_getChild(parent,index);
        
        return super.getChild(parent, index);
    }

    protected int Sipregister_getChildCount(Object parent){
        return 0;
    }
    protected int Sipauth_getChildCount(Object parent){
        return 0;
    }
    protected int SipConf_getChildCount(Object parent){
        return 2;
    }
    protected int Sippeers_getChildCount(Object parent){
        return 1;
    }
    protected int Sipgeneral_getChildCount(Object parent){
        return 2;
    }

    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
            if(parent instanceof Sipregister)
            return Sipregister_getChildCount(parent);
        
 	        if(parent instanceof Sipauth)
            return Sipauth_getChildCount(parent);
        
 	        if(parent instanceof SipConf)
            return SipConf_getChildCount(parent);
        
 	        if(parent instanceof Sippeers)
            return Sippeers_getChildCount(parent);
        
 	        if(parent instanceof Sipgeneral)
            return Sipgeneral_getChildCount(parent);
        
 	        return super.getChildCount(parent);
    }
     protected boolean Sipregister_isLeaf(){
        return true;
    }
     protected boolean Sipauth_isLeaf(){
        return true;
    }
     protected boolean SipConf_isLeaf(){
	return false;
    }
     protected boolean Sippeers_isLeaf(){
	return false;
    }
     protected boolean Sipgeneral_isLeaf(){
	return false;
    }
    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if(node instanceof Sipregister)
            return Sipregister_isLeaf();
        
         if(node instanceof Sipauth)
            return Sipauth_isLeaf();
        
         if(node instanceof SipConf)
            return SipConf_isLeaf();
        
         if(node instanceof Sippeers)
            return Sippeers_isLeaf();
        
         if(node instanceof Sipgeneral)
            return Sipgeneral_isLeaf();
        
         return super.isLeaf(node);
    }

    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#valueForPathChanged(javax.swing.tree.TreePath, java.lang.Object)
     */
    public void valueForPathChanged(TreePath path, Object newValue) {
        // TODO Auto-generated method stub
        
    }

	protected int Sipregister_getIndexOfChild(Object parent, Object child) {
		return -1;
	}

	protected int Sipauth_getIndexOfChild(Object parent, Object child) {
		return -1;
	}

	protected int SipConf_getIndexOfChild(Object parent, Object child) {
		if(child instanceof Sipgeneral)     
        	return 0; 
		if(child instanceof Sippeers)     
        	return 1; 
	if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if(mt.getMapkey().equals(MMFsipconf.SIPPEERS))
                return 1; 
        }//end of if (child instanceof MapTyper)

		return -1;
	}

	protected int Sippeers_getIndexOfChild(Object parent, Object child) {
		if(child instanceof Sipauth)     
        	return 0; 
	if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if(mt.getMapkey().equals(MMFsipconf.SIPAUTH))
                return 0; 
        }//end of if (child instanceof MapTyper)

		return -1;
	}

	protected int Sipgeneral_getIndexOfChild(Object parent, Object child) {
		if(child instanceof Sipauth)     
        	return 0; 
	if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if(mt.getMapkey().equals(MMFsipconf.SIPAUTH))
                return 0; 
        }//end of if (child instanceof MapTyper)

		if(child instanceof Sipregister)     
        	return 1; 
	if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if(mt.getMapkey().equals(MMFsipconf.SIPREGISTER))
                return 1; 
        }//end of if (child instanceof MapTyper)

		return -1;
	}
    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getIndexOfChild(java.lang.Object, java.lang.Object)
     */
    public int getIndexOfChild(Object parent, Object child) {
        if(parent instanceof Sipregister)
            return Sipregister_getIndexOfChild(parent,child);
        
         if(parent instanceof Sipauth)
            return Sipauth_getIndexOfChild(parent,child);
        
         if(parent instanceof SipConf)
            return SipConf_getIndexOfChild(parent,child);
        
         if(parent instanceof Sippeers)
            return Sippeers_getIndexOfChild(parent,child);
        
         if(parent instanceof Sipgeneral)
            return Sipgeneral_getIndexOfChild(parent,child);
        
         return super.getIndexOfChild(parent, child);
    }

    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#addTreeModelListener(javax.swing.event.TreeModelListener)
     */
//    public void addTreeModelListener(TreeModelListener l) {
        // TODO Auto-generated method stub
        
//    }

    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#removeTreeModelListener(javax.swing.event.TreeModelListener)
     */
  //  public void removeTreeModelListener(TreeModelListener l) {
        // TODO Auto-generated method stub
        
    //}

}
