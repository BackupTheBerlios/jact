/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.zaptelconf;

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
import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.Zapteltonezone;

// import com.useit.jact.model.impl.ZapteltonezoneImpl;
// import com.useit.jact.model.impl.ZaptelchannelsImpl;
// import com.useit.jact.model.impl.ZaptelconfImpl;
// import com.useit.jact.model.impl.ZapteldynamicspanImpl;
// import com.useit.jact.model.impl.ZaptelspanImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.11 2006/01/09
 *          10:17:34 urs Exp $
 */
public class GuiClassFactory {
    /**
     * erzeugt ein treepanel
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleTreePanel createTreePanel(Object obj) {
        if (obj instanceof Zapteltonezone) {
            AbstractSimpleTreePanel p = new SimplezaptelconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Zaptelchannels) {
            AbstractSimpleTreePanel p = new SimplezaptelconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Zaptelconf) {
            AbstractSimpleTreePanel p = new SimplezaptelconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Zapteldynamicspan) {
            AbstractSimpleTreePanel p = new SimplezaptelconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Zaptelspan) {
            AbstractSimpleTreePanel p = new SimplezaptelconfTreePanel();
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
        if (obj instanceof Zapteltonezone) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Zaptelchannels) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Zaptelconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Zapteldynamicspan) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Zaptelspan) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
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
        if (obj instanceof Zapteltonezone) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Zaptelchannels) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Zaptelconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Zapteldynamicspan) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Zaptelspan) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
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
        if (obj instanceof Zapteltonezone) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Zaptelchannels) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Zaptelconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Zapteldynamicspan) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Zaptelspan) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultzaptelconfTreeDialog(
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
     * erzeugt eine neue Objektinstanz von Zapteltonezone mit den default Werten
     * 
     * @return Zapteltonezone
     */
    public static final ZapteltonezoneDataPanelImpl newZapteltonezoneDataPanel() {
        return new ZapteltonezoneDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Zaptelchannels mit den default Werten
     * 
     * @return Zaptelchannels
     */
    public static final ZaptelchannelsDataPanelImpl newZaptelchannelsDataPanel() {
        return new ZaptelchannelsDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Zaptelconf mit den default Werten
     * 
     * @return Zaptelconf
     */
    public static final ZaptelconfDataPanelImpl newZaptelconfDataPanel() {
        return new ZaptelconfDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Zapteldynamicspan mit den default
     * Werten
     * 
     * @return Zapteldynamicspan
     */
    public static final ZapteldynamicspanDataPanelImpl newZapteldynamicspanDataPanel() {
        return new ZapteldynamicspanDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Zaptelspan mit den default Werten
     * 
     * @return Zaptelspan
     */
    public static final ZaptelspanDataPanelImpl newZaptelspanDataPanel() {
        return new ZaptelspanDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("ZAPTELTONEZONE")) {
            ZapteltonezoneTableModel model = new ZapteltonezoneTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("ZAPTELCHANNELS")) {
            ZaptelchannelsTableModel model = new ZaptelchannelsTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("ZAPTELCONF")) {
            ZaptelconfTableModel model = new ZaptelconfTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("ZAPTELDYNAMICSPAN")) {
            ZapteldynamicspanTableModel model = new ZapteldynamicspanTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("ZAPTELSPAN")) {
            ZaptelspanTableModel model = new ZaptelspanTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof Zapteltonezone) {
            ZapteltonezoneDataPanelImpl p = newZapteltonezoneDataPanel();// getInstance().displayString((ZapteltonezoneMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Zaptelchannels) {
            ZaptelchannelsDataPanelImpl p = newZaptelchannelsDataPanel();// getInstance().displayString((ZaptelchannelsMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Zaptelconf) {
            ZaptelconfDataPanelImpl p = newZaptelconfDataPanel();// getInstance().displayString((ZaptelconfMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Zapteldynamicspan) {
            ZapteldynamicspanDataPanelImpl p = newZapteldynamicspanDataPanel();// getInstance().displayString((ZapteldynamicspanMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Zaptelspan) {
            ZaptelspanDataPanelImpl p = newZaptelspanDataPanel();// getInstance().displayString((ZaptelspanMap)obj);
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
