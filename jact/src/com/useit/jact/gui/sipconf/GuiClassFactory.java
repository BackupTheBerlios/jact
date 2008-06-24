/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.sipconf;

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
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.Sipregister;


//import com.useit.jact.model.impl.SipregisterImpl;
//import com.useit.jact.model.impl.SipauthImpl;
//import com.useit.jact.model.impl.SipConfImpl;
//import com.useit.jact.model.impl.SipgeneralImpl;
//import com.useit.jact.model.impl.SippeersImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
public class GuiClassFactory {
/**
 * erzeugt ein treepanel 
 * @param obj
 * @return
 */
public static AbstractSimpleTreePanel createTreePanel(Object obj) {
    if(obj instanceof Sipregister){
        AbstractSimpleTreePanel p = new SimplesipconfTreePanel();
        p.initTree(obj);
        return p;
    }
    if(obj instanceof Sipauth){
        AbstractSimpleTreePanel p = new SimplesipconfTreePanel();
        p.initTree(obj);
        return p;
    }
    if(obj instanceof SipConf){
        AbstractSimpleTreePanel p = new SimplesipconfTreePanel();
        p.initTree(obj);
        return p;
    }
    if(obj instanceof Sipgeneral){
        AbstractSimpleTreePanel p = new SimplesipconfTreePanel();
        p.initTree(obj);
        return p;
    }
    if(obj instanceof Sippeers){
        AbstractSimpleTreePanel p = new SimplesipconfTreePanel();
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
    if(obj instanceof Sipregister){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(obj);
        return p;
    }
    if(obj instanceof Sipauth){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(obj);
        return p;
    }
    if(obj instanceof SipConf){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(obj);
        return p;
    }
    if(obj instanceof Sipgeneral){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(obj);
        return p;
    }
    if(obj instanceof Sippeers){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(obj);
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
    if(obj instanceof Sipregister){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(aFrame,obj);
        return p;
    }
    if(obj instanceof Sipauth){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(aFrame,obj);
        return p;
    }
    if(obj instanceof SipConf){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(aFrame,obj);
        return p;
    }
    if(obj instanceof Sipgeneral){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(aFrame,obj);
        return p;
    }
    if(obj instanceof Sippeers){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(aFrame,obj);
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
    if(obj instanceof Sipregister){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(aDialog,obj);
        return p;
    }
    if(obj instanceof Sipauth){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(aDialog,obj);
        return p;
    }
    if(obj instanceof SipConf){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(aDialog,obj);
        return p;
    }
    if(obj instanceof Sipgeneral){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(aDialog,obj);
        return p;
    }
    if(obj instanceof Sippeers){
        AbstractSimpleDataObjectTreeDialog p = new DefaultsipconfTreeDialog(aDialog,obj);
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
                if (value instanceof SipConf) {
                   // SipConf new_name = (SipConf) value;
                   // setIcon();
                }//end of if (value instanceof SipConf)
                
                
                setText( DataClassRendereImpl.displayString(value));
                return this;
            }
            
        };
	}

	/**
	 * erzeugt eine neue Objektinstanz von Sipregister mit den default Werten
	 * @return Sipregister
	 */
	public static final SipregisterDataPanelImpl newSipregisterDataPanel() {
		return new SipregisterDataPanelImpl();
	}
	/**
	 * erzeugt eine neue Objektinstanz von Sipauth mit den default Werten
	 * @return Sipauth
	 */
	public static final SipauthDataPanelImpl newSipauthDataPanel() {
		return new SipauthDataPanelImpl();
	}
	/**
	 * erzeugt eine neue Objektinstanz von SipConf mit den default Werten
	 * @return SipConf
	 */
	public static final SipConfDataPanelImpl newSipConfDataPanel() {
		return new SipConfDataPanelImpl();
	}
	/**
	 * erzeugt eine neue Objektinstanz von Sipgeneral mit den default Werten
	 * @return Sipgeneral
	 */
	public static final SipgeneralDataPanelImpl newSipgeneralDataPanel() {
		return new SipgeneralDataPanelImpl();
	}
	/**
	 * erzeugt eine neue Objektinstanz von Sippeers mit den default Werten
	 * @return Sippeers
	 */
	public static final SippeersDataPanelImpl newSippeersDataPanel() {
		return new SippeersDataPanelImpl();
	}
/**
 * erzeugt ein TableModel für eine übergebene Map
 * wenn die Map bekannt ist.
 * sonmst null
 * @param obj
 * @return
 */
	public static final AbstractSimpleTableModel createTableModel(MapTyper mt){
          if(mt.getMapkey().equals("SIPREGISTER")){
                  SipregisterTableModel model = new SipregisterTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
          if(mt.getMapkey().equals("SIPAUTH")){
                  SipauthTableModel model = new SipauthTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
          if(mt.getMapkey().equals("SIPCONF")){
                  SipConfTableModel model = new SipConfTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
          if(mt.getMapkey().equals("SIPGENERAL")){
                  SipgeneralTableModel model = new SipgeneralTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
          if(mt.getMapkey().equals("SIPPEERS")){
                  SippeersTableModel model = new SippeersTableModel(null);
                  model.setNewList(mt.getList());
                  return model;
                    
                }
 	    return null;
	}
	

public static final SimpleDataObjectPanel createPanel(Object obj){
        if(obj instanceof Sipregister){
          SipregisterDataPanelImpl  p= newSipregisterDataPanel();// getInstance().displayString((SipregisterMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof Sipauth){
          SipauthDataPanelImpl  p= newSipauthDataPanel();// getInstance().displayString((SipauthMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof SipConf){
          SipConfDataPanelImpl  p= newSipConfDataPanel();// getInstance().displayString((SipConfMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof Sipgeneral){
          SipgeneralDataPanelImpl  p= newSipgeneralDataPanel();// getInstance().displayString((SipgeneralMap)obj);
			p.setDataObject(obj);
			return p;
			}
        if(obj instanceof Sippeers){
          SippeersDataPanelImpl  p= newSippeersDataPanel();// getInstance().displayString((SippeersMap)obj);
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
