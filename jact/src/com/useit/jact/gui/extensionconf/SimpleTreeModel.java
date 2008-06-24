/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.extensionconf;

import javax.swing.tree.TreePath;

import com.useit.app.framework.gui.models.AbstractSimpleTreeModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.MMFextensionconf;
import com.useit.jact.model.extensionconf.Switch;

/** 
 * <p> 
 * SimpleTreeModel 
 * </p> 
 * Created : 09.08.2005 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: SimpleTreeModel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $ 
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
    protected Object  Extension_getChild(Object parent, int index) {
        Extension obj = (Extension) parent;
        switch (index) {
       default:
            break;
        }
		return null;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  Context_getChild(Object parent, int index) {
        Context obj = (Context) parent;
        switch (index) {
        case 0: return //obj.getExtensionMapTyper();//getExtensionMap();
        				new MapTyper(MMFextensionconf.EXTENSION,obj.getExtensionMap(),MMFextensionconf.getInstance());
        case 1: return //obj.getIncludecontextMapTyper();//getIncludecontextMap();
        				new MapTyper(MMFextensionconf.INCLUDECONTEXT,obj.getIncludecontextMap(),MMFextensionconf.getInstance());
        case 2: return //obj.getSwitchMapTyper();//getSwitchMap();
        				new MapTyper(MMFextensionconf.SWITCH,obj.getSwitchMap(),MMFextensionconf.getInstance());
       default:
            break;
        }
		return null;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  Includecontext_getChild(Object parent, int index) {
        Includecontext obj = (Includecontext) parent;
        switch (index) {
       default:
            break;
        }
		return null;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  Switch_getChild(Object parent, int index) {
        Switch obj = (Switch) parent;
        switch (index) {
       default:
            break;
        }
		return null;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  Extensionconf_getChild(Object parent, int index) {
        Extensionconf obj = (Extensionconf) parent;
        switch (index) {
        case 0: return //obj.getContextMapTyper();//getContextMap();
        				new MapTyper(MMFextensionconf.CONTEXT,obj.getContextMap(),MMFextensionconf.getInstance());
        case 1: return //obj.getGlobalvarsMapTyper();//getGlobalvarsMap();
        				new MapTyper(MMFextensionconf.GLOBALVARS,obj.getGlobalvarsMap(),MMFextensionconf.getInstance());
        case 2: return //obj.getIncludeconfigsMapTyper();//getIncludeconfigsMap();
        				new MapTyper(MMFextensionconf.INCLUDECONFIGS,obj.getIncludeconfigsMap(),MMFextensionconf.getInstance());
       default:
            break;
        }
		return null;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  Globalvars_getChild(Object parent, int index) {
        Globalvars obj = (Globalvars) parent;
        switch (index) {
       default:
            break;
        }
		return null;
    }
   /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    protected Object  Includeconfigs_getChild(Object parent, int index) {
        Includeconfigs obj = (Includeconfigs) parent;
        switch (index) {
       default:
            break;
        }
		return null;
    }
    
    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChild(java.lang.Object, int)
     */
    public Object getChild(Object parent, int index) {
        if(parent instanceof Extension)
            return Extension_getChild(parent,index);
        
        if(parent instanceof Context)
            return Context_getChild(parent,index);
        
        if(parent instanceof Includecontext)
            return Includecontext_getChild(parent,index);
        
        if(parent instanceof Switch)
            return Switch_getChild(parent,index);
        
        if(parent instanceof Extensionconf)
            return Extensionconf_getChild(parent,index);
        
        if(parent instanceof Globalvars)
            return Globalvars_getChild(parent,index);
        
        if(parent instanceof Includeconfigs)
            return Includeconfigs_getChild(parent,index);
        
        return super.getChild(parent, index);
    }

    protected int Extension_getChildCount(Object parent){
        return 0;
    }
    protected int Context_getChildCount(Object parent){
        return 3;
    }
    protected int Includecontext_getChildCount(Object parent){
        return 0;
    }
    protected int Switch_getChildCount(Object parent){
        return 0;
    }
    protected int Extensionconf_getChildCount(Object parent){
        return 3;
    }
    protected int Globalvars_getChildCount(Object parent){
        return 0;
    }
    protected int Includeconfigs_getChildCount(Object parent){
        return 0;
    }

    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getChildCount(java.lang.Object)
     */
    public int getChildCount(Object parent) {
            if(parent instanceof Extension)
            return Extension_getChildCount(parent);
        
 	        if(parent instanceof Context)
            return Context_getChildCount(parent);
        
 	        if(parent instanceof Includecontext)
            return Includecontext_getChildCount(parent);
        
 	        if(parent instanceof Switch)
            return Switch_getChildCount(parent);
        
 	        if(parent instanceof Extensionconf)
            return Extensionconf_getChildCount(parent);
        
 	        if(parent instanceof Globalvars)
            return Globalvars_getChildCount(parent);
        
 	        if(parent instanceof Includeconfigs)
            return Includeconfigs_getChildCount(parent);
        
 	        return super.getChildCount(parent);
    }
     protected boolean Extension_isLeaf(){
        return true;
    }
     protected boolean Context_isLeaf(){
	return false;
    }
     protected boolean Includecontext_isLeaf(){
        return true;
    }
     protected boolean Switch_isLeaf(){
        return true;
    }
     protected boolean Extensionconf_isLeaf(){
	return false;
    }
     protected boolean Globalvars_isLeaf(){
        return true;
    }
     protected boolean Includeconfigs_isLeaf(){
        return true;
    }
    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#isLeaf(java.lang.Object)
     */
    public boolean isLeaf(Object node) {
        if(node instanceof Extension)
            return Extension_isLeaf();
        
         if(node instanceof Context)
            return Context_isLeaf();
        
         if(node instanceof Includecontext)
            return Includecontext_isLeaf();
        
         if(node instanceof Switch)
            return Switch_isLeaf();
        
         if(node instanceof Extensionconf)
            return Extensionconf_isLeaf();
        
         if(node instanceof Globalvars)
            return Globalvars_isLeaf();
        
         if(node instanceof Includeconfigs)
            return Includeconfigs_isLeaf();
        
         return super.isLeaf(node);
    }

    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#valueForPathChanged(javax.swing.tree.TreePath, java.lang.Object)
     */
    public void valueForPathChanged(TreePath path, Object newValue) {
        // TODO Auto-generated method stub
        
    }

	protected int Extension_getIndexOfChild(Object parent, Object child) {
		return -1;
	}

	protected int Context_getIndexOfChild(Object parent, Object child) {
		if(child instanceof Extension)     
        	return 0; 
	if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if(mt.getMapkey().equals(MMFextensionconf.EXTENSION))
                return 0; 
        }//end of if (child instanceof MapTyper)

		if(child instanceof Includecontext)     
        	return 1; 
	if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if(mt.getMapkey().equals(MMFextensionconf.INCLUDECONTEXT))
                return 1; 
        }//end of if (child instanceof MapTyper)

		if(child instanceof Switch)     
        	return 2; 
	if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if(mt.getMapkey().equals(MMFextensionconf.SWITCH))
                return 2; 
        }//end of if (child instanceof MapTyper)

		return -1;
	}

	protected int Includecontext_getIndexOfChild(Object parent, Object child) {
		return -1;
	}

	protected int Switch_getIndexOfChild(Object parent, Object child) {
		return -1;
	}

	protected int Extensionconf_getIndexOfChild(Object parent, Object child) {
		if(child instanceof Context)     
        	return 0; 
	if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if(mt.getMapkey().equals(MMFextensionconf.CONTEXT))
                return 0; 
        }//end of if (child instanceof MapTyper)

		if(child instanceof Globalvars)     
        	return 1; 
	if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if(mt.getMapkey().equals(MMFextensionconf.GLOBALVARS))
                return 1; 
        }//end of if (child instanceof MapTyper)

		if(child instanceof Includeconfigs)     
        	return 2; 
	if (child instanceof MapTyper) {
            MapTyper mt = (MapTyper) child;
            if(mt.getMapkey().equals(MMFextensionconf.INCLUDECONFIGS))
                return 2; 
        }//end of if (child instanceof MapTyper)

		return -1;
	}

	protected int Globalvars_getIndexOfChild(Object parent, Object child) {
		return -1;
	}

	protected int Includeconfigs_getIndexOfChild(Object parent, Object child) {
		return -1;
	}
    /* (non-Javadoc)
     * @see javax.swing.tree.TreeModel#getIndexOfChild(java.lang.Object, java.lang.Object)
     */
    public int getIndexOfChild(Object parent, Object child) {
        if(parent instanceof Extension)
            return Extension_getIndexOfChild(parent,child);
        
         if(parent instanceof Context)
            return Context_getIndexOfChild(parent,child);
        
         if(parent instanceof Includecontext)
            return Includecontext_getIndexOfChild(parent,child);
        
         if(parent instanceof Switch)
            return Switch_getIndexOfChild(parent,child);
        
         if(parent instanceof Extensionconf)
            return Extensionconf_getIndexOfChild(parent,child);
        
         if(parent instanceof Globalvars)
            return Globalvars_getIndexOfChild(parent,child);
        
         if(parent instanceof Includeconfigs)
            return Includeconfigs_getIndexOfChild(parent,child);
        
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
