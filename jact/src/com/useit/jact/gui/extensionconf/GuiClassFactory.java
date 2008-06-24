/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.extensionconf;

import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.ListCellRenderer;
import javax.swing.tree.DefaultTreeCellRenderer;

import com.useit.app.framework.gui.dialogs.AbstractSimpleDataObjectTreeDialog;
import com.useit.app.framework.gui.guiHelper.AbstractSimpleTreePanel;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.app.framework.gui.guiHelper.SimpleMapDataPanel;
import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.app.framework.model.dataModel.MapTyper;
import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.Switch;


//import com.useit.jact.model.impl.ContextImpl;
//import com.useit.jact.model.impl.ExtensionImpl;
//import com.useit.jact.model.impl.SwitchImpl;
//import com.useit.jact.model.impl.IncludecontextImpl;
//import com.useit.jact.model.impl.ExtensionconfImpl;
//import com.useit.jact.model.impl.IncludeconfigsImpl;
//import com.useit.jact.model.impl.GlobalvarsImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $
 */
public class GuiClassFactory {
/**
 * erzeugt ein treepanel 
 * @param obj
 * @return
 */
public static AbstractSimpleTreePanel createTreePanel(Object obj) {
    if(obj instanceof Context){
        AbstractSimpleTreePanel p = new SimpleextensionconfTreePanel();
        p.initTree(obj);
        return p;
    }
    if(obj instanceof Extension){
        AbstractSimpleTreePanel p = new SimpleextensionconfTreePanel();
        p.initTree(obj);
        return p;
    }
    if(obj instanceof Switch){
        AbstractSimpleTreePanel p = new SimpleextensionconfTreePanel();
        p.initTree(obj);
        return p;
    }
    if(obj instanceof Includecontext){
        AbstractSimpleTreePanel p = new SimpleextensionconfTreePanel();
        p.initTree(obj);
        return p;
    }
    if(obj instanceof Extensionconf){
        AbstractSimpleTreePanel p = new SimpleextensionconfTreePanel();
        p.initTree(obj);
        return p;
    }
    if(obj instanceof Includeconfigs){
        AbstractSimpleTreePanel p = new SimpleextensionconfTreePanel();
        p.initTree(obj);
        return p;
    }
    if(obj instanceof Globalvars){
        AbstractSimpleTreePanel p = new SimpleextensionconfTreePanel();
        p.initTree(obj);
        return p;
    }
    return null;
}
/**
 * erzeugt ein dialog und initalisiert ihn
 * @param obj
 * @return
 */
public static AbstractSimpleDataObjectTreeDialog createTreeDialog(Object obj) {
    if(obj instanceof Context){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(obj);
        return p;
    }
    if(obj instanceof Extension){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(obj);
        return p;
    }
    if(obj instanceof Switch){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(obj);
        return p;
    }
    if(obj instanceof Includecontext){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(obj);
        return p;
    }
    if(obj instanceof Extensionconf){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(obj);
        return p;
    }
    if(obj instanceof Includeconfigs){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(obj);
        return p;
    }
    if(obj instanceof Globalvars){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(obj);
        return p;
    }
    return null;
}
/**
 * erzeugt ein dialog und initalisiert ihn
 * @param obj
 * @return
 */
public static AbstractSimpleDataObjectTreeDialog createTreeDialog(Frame aFrame,Object obj) {
    if(obj instanceof Context){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aFrame,obj);
        return p;
    }
    if(obj instanceof Extension){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aFrame,obj);
        return p;
    }
    if(obj instanceof Switch){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aFrame,obj);
        return p;
    }
    if(obj instanceof Includecontext){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aFrame,obj);
        return p;
    }
    if(obj instanceof Extensionconf){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aFrame,obj);
        return p;
    }
    if(obj instanceof Includeconfigs){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aFrame,obj);
        return p;
    }
    if(obj instanceof Globalvars){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aFrame,obj);
        return p;
    }
    return null;
}
/**
 * erzeugt ein dialog und initalisiert ihn
 * @param obj
 * @return
 */
public static AbstractSimpleDataObjectTreeDialog createTreeDialog(Dialog aDialog,Object obj) {
    if(obj instanceof Context){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aDialog,obj);
        return p;
    }
    if(obj instanceof Extension){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aDialog,obj);
        return p;
    }
    if(obj instanceof Switch){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aDialog,obj);
        return p;
    }
    if(obj instanceof Includecontext){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aDialog,obj);
        return p;
    }
    if(obj instanceof Extensionconf){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aDialog,obj);
        return p;
    }
    if(obj instanceof Includeconfigs){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aDialog,obj);
        return p;
    }
    if(obj instanceof Globalvars){
        AbstractSimpleDataObjectTreeDialog p = new DefaultextensionconfTreeDialog(aDialog,obj);
        return p;
    }
    return null;
}



    public static final ListCellRenderer simpleListRendere(){
        return new DefaultListCellRenderer(){
           /* (non-Javadoc)
         * @see javax.swing.DefaultListCellRenderer#getListCellRendererComponent(javax.swing.JList, java.lang.Object, int, boolean, boolean)
         */
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index,
                    isSelected, cellHasFocus);
           this.setText(DataClassRendereImpl.displayString(value));
           return this;
        } 
        };
    }


   /**
     * ein tree renener auf abruf
     * @return DefaultTreeCellRenderer
     */
	public static final DefaultTreeCellRenderer simpleTreeRendere(){
	    return new DefaultTreeCellRenderer(){

            public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
                super.getTreeCellRendererComponent(tree,value,selected,expanded,leaf,row,hasFocus);
                //this.hasFocus = hasFocus;
                
                setText( DataClassRendereImpl.displayString(value));
                return this;
            }
            
        };
	}

	/**
	 * erzeugt eine neue Objektinstanz von Context mit den default Werten
	 * @return Context
	 */
	public static final ContextDataPanelImpl newContextDataPanel() {
		return new ContextDataPanelImpl();
	}
	/**
	 * erzeugt eine neue Objektinstanz von Extension mit den default Werten
	 * @return Extension
	 */
	public static final ExtensionDataPanelImpl newExtensionDataPanel() {
		return new ExtensionDataPanelImpl();
	}
	/**
	 * erzeugt eine neue Objektinstanz von Switch mit den default Werten
	 * @return Switch
	 */
	public static final SwitchDataPanelImpl newSwitchDataPanel() {
		return new SwitchDataPanelImpl();
	}
	/**
	 * erzeugt eine neue Objektinstanz von Includecontext mit den default Werten
	 * @return Includecontext
	 */
	public static final IncludecontextDataPanelImpl newIncludecontextDataPanel() {
		return new IncludecontextDataPanelImpl();
	}
	/**
	 * erzeugt eine neue Objektinstanz von Extensionconf mit den default Werten
	 * @return Extensionconf
	 */
	public static final ExtensionconfDataPanelImpl newExtensionconfDataPanel() {
		return new ExtensionconfDataPanelImpl();
	}
	/**
	 * erzeugt eine neue Objektinstanz von Includeconfigs mit den default Werten
	 * @return Includeconfigs
	 */
	public static final IncludeconfigsDataPanelImpl newIncludeconfigsDataPanel() {
		return new IncludeconfigsDataPanelImpl();
	}
	/**
	 * erzeugt eine neue Objektinstanz von Globalvars mit den default Werten
	 * @return Globalvars
	 */
	public static final GlobalvarsDataPanelImpl newGlobalvarsDataPanel() {
		return new GlobalvarsDataPanelImpl();
	}
/**
 * erzeugt ein TableModel für eine übergebene Map
 * wenn die Map bekannt ist.
 * sonmst null
 * @param obj
 * @return
 */
	public static final AbstractSimpleTableModel createTableModel(MapTyper mt){
          if(mt.getMapkey().equals("CONTEXT")){
                  ContextTableModel model = new ContextTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
          if(mt.getMapkey().equals("EXTENSION")){
                  ExtensionTableModel model = new ExtensionTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
          if(mt.getMapkey().equals("SWITCH")){
                  SwitchTableModel model = new SwitchTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
          if(mt.getMapkey().equals("INCLUDECONTEXT")){
                  IncludecontextTableModel model = new IncludecontextTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
          if(mt.getMapkey().equals("EXTENSIONCONF")){
                  ExtensionconfTableModel model = new ExtensionconfTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
          if(mt.getMapkey().equals("INCLUDECONFIGS")){
                  IncludeconfigsTableModel model = new IncludeconfigsTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
          if(mt.getMapkey().equals("GLOBALVARS")){
                  GlobalvarsTableModel model = new GlobalvarsTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
 	    return null;
	}
	

public static final SimpleDataObjectPanel createPanel(Object obj){
        if(obj instanceof Context){
          ContextDataPanelImpl  p= newContextDataPanel();// getInstance().displayString((ContextMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof Extension){
          ExtensionDataPanelImpl  p= newExtensionDataPanel();// getInstance().displayString((ExtensionMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof Switch){
          SwitchDataPanelImpl  p= newSwitchDataPanel();// getInstance().displayString((SwitchMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof Includecontext){
          IncludecontextDataPanelImpl  p= newIncludecontextDataPanel();// getInstance().displayString((IncludecontextMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof Extensionconf){
          ExtensionconfDataPanelImpl  p= newExtensionconfDataPanel();// getInstance().displayString((ExtensionconfMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof Includeconfigs){
          IncludeconfigsDataPanelImpl  p= newIncludeconfigsDataPanel();// getInstance().displayString((IncludeconfigsMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof Globalvars){
          GlobalvarsDataPanelImpl  p= newGlobalvarsDataPanel();// getInstance().displayString((GlobalvarsMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof MapTyper){
            MapTyper mt = (MapTyper)obj;
            SimpleMapDataPanel p = new SimpleMapDataPanel();
            AbstractSimpleTableModel tableModel = createTableModel(mt);
            p.setModel(tableModel);
             p.setDataObject(mt);
             return p;
        }

		return com.useit.app.framework.gui.guiHelper.GuiClassFactory.createSimpleDataObjectPanel(obj);

}

}
