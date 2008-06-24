/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.iaxconf;

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
import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.Iaxregister;

// import com.useit.jact.model.impl.IaxregisterImpl;
// import com.useit.jact.model.impl.IaxdenyImpl;
// import com.useit.jact.model.impl.IaxpermitImpl;
// import com.useit.jact.model.impl.IaxgeneralImpl;
// import com.useit.jact.model.impl.IaxpeerImpl;
// import com.useit.jact.model.impl.IaxjitterImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.9 2006/01/09
 *          10:17:35 urs Exp $
 */
public class GuiClassFactory {
    /**
     * erzeugt ein treepanel
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleTreePanel createTreePanel(Object obj) {
        if (obj instanceof Iaxregister) {
            AbstractSimpleTreePanel p = new SimpleiaxconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Iaxdeny) {
            AbstractSimpleTreePanel p = new SimpleiaxconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Iaxpermit) {
            AbstractSimpleTreePanel p = new SimpleiaxconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Iaxgeneral) {
            AbstractSimpleTreePanel p = new SimpleiaxconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Iaxpeer) {
            AbstractSimpleTreePanel p = new SimpleiaxconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Iaxjitter) {
            AbstractSimpleTreePanel p = new SimpleiaxconfTreePanel();
            p.initTree(obj);
            return p;
        }
        return null;
    }

    /**
     * erzeugt ein dialog und initalisiert ihn
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleDataObjectTreeDialog createTreeDialog(Object obj) {
        if (obj instanceof Iaxregister) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Iaxdeny) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Iaxpermit) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Iaxgeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Iaxpeer) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Iaxjitter) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    obj);
            return p;
        }
        return null;
    }

    /**
     * erzeugt ein dialog und initalisiert ihn
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleDataObjectTreeDialog createTreeDialog(
            Frame aFrame, Object obj) {
        if (obj instanceof Iaxregister) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Iaxdeny) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Iaxpermit) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Iaxgeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Iaxpeer) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Iaxjitter) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        return null;
    }

    /**
     * erzeugt ein dialog und initalisiert ihn
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleDataObjectTreeDialog createTreeDialog(
            Dialog aDialog, Object obj) {
        if (obj instanceof Iaxregister) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Iaxdeny) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Iaxpermit) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Iaxgeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Iaxpeer) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Iaxjitter) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultiaxconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        return null;
    }

    public static final ListCellRenderer simpleListRendere() {
        return new DefaultListCellRenderer() {
            /*
             * (non-Javadoc)
             * 
             * @see javax.swing.DefaultListCellRenderer#getListCellRendererComponent(javax.swing.JList,
             *      java.lang.Object, int, boolean, boolean)
             */
            public Component getListCellRendererComponent(JList list,
                    Object value, int index, boolean isSelected,
                    boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index,
                        isSelected, cellHasFocus);
                this.setText(DataClassRendereImpl.displayString(value));
                return this;
            }
        };
    }

    /**
     * ein tree renener auf abruf
     * 
     * @return DefaultTreeCellRenderer
     */
    public static final DefaultTreeCellRenderer simpleTreeRendere() {
        return new DefaultTreeCellRenderer() {

            public Component getTreeCellRendererComponent(JTree tree,
                    Object value, boolean selected, boolean expanded,
                    boolean leaf, int row, boolean hasFocus) {
                super.getTreeCellRendererComponent(tree, value, selected,
                        expanded, leaf, row, hasFocus);
                // this.hasFocus = hasFocus;

                setText(DataClassRendereImpl.displayString(value));
                return this;
            }

        };
    }

    /**
     * erzeugt eine neue Objektinstanz von Iaxregister mit den default Werten
     * 
     * @return Iaxregister
     */
    public static final IaxregisterDataPanelImpl newIaxregisterDataPanel() {
        return new IaxregisterDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Iaxdeny mit den default Werten
     * 
     * @return Iaxdeny
     */
    public static final IaxdenyDataPanelImpl newIaxdenyDataPanel() {
        return new IaxdenyDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Iaxpermit mit den default Werten
     * 
     * @return Iaxpermit
     */
    public static final IaxpermitDataPanelImpl newIaxpermitDataPanel() {
        return new IaxpermitDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Iaxgeneral mit den default Werten
     * 
     * @return Iaxgeneral
     */
    public static final IaxgeneralDataPanelImpl newIaxgeneralDataPanel() {
        return new IaxgeneralDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Iaxpeer mit den default Werten
     * 
     * @return Iaxpeer
     */
    public static final IaxpeerDataPanelImpl newIaxpeerDataPanel() {
        return new IaxpeerDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Iaxjitter mit den default Werten
     * 
     * @return Iaxjitter
     */
    public static final IaxjitterDataPanelImpl newIaxjitterDataPanel() {
        return new IaxjitterDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("IAXREGISTER")) {
            IaxregisterTableModel model = new IaxregisterTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("IAXDENY")) {
            IaxdenyTableModel model = new IaxdenyTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("IAXPERMIT")) {
            IaxpermitTableModel model = new IaxpermitTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("IAXGENERAL")) {
            IaxgeneralTableModel model = new IaxgeneralTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("IAXPEER")) {
            IaxpeerTableModel model = new IaxpeerTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("IAXJITTER")) {
            IaxjitterTableModel model = new IaxjitterTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof Iaxregister) {
            IaxregisterDataPanelImpl p = newIaxregisterDataPanel();// getInstance().displayString((IaxregisterMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Iaxdeny) {
            IaxdenyDataPanelImpl p = newIaxdenyDataPanel();// getInstance().displayString((IaxdenyMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Iaxpermit) {
            IaxpermitDataPanelImpl p = newIaxpermitDataPanel();// getInstance().displayString((IaxpermitMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Iaxgeneral) {
            IaxgeneralDataPanelImpl p = newIaxgeneralDataPanel();// getInstance().displayString((IaxgeneralMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Iaxpeer) {
            IaxpeerDataPanelImpl p = newIaxpeerDataPanel();// getInstance().displayString((IaxpeerMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Iaxjitter) {
            IaxjitterDataPanelImpl p = newIaxjitterDataPanel();// getInstance().displayString((IaxjitterMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof MapTyper) {
            MapTyper mt = (MapTyper) obj;
            SimpleMapDataPanel p = new SimpleMapDataPanel();
            AbstractSimpleTableModel tableModel = createTableModel(mt);
            p.setModel(tableModel);
            p.setDataObject(mt);
            return p;
        }

        return com.useit.app.framework.gui.guiHelper.GuiClassFactory
                .createSimpleDataObjectPanel(obj);

    }

}
