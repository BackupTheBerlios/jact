/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.managerconf;

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
import com.useit.jact.model.managerconf.ManagerSection;
import com.useit.jact.model.managerconf.Managerdeny;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.Managerpermit;

// import com.useit.jact.model.impl.ManagergeneralSectionImpl;
// import com.useit.jact.model.impl.ManagerdenyImpl;
// import com.useit.jact.model.impl.ManagerSectionImpl;
// import com.useit.jact.model.impl.ManagerpermitImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.12 2006/01/09
 *          10:17:33 urs Exp $
 */
public class GuiClassFactory {
    /**
     * erzeugt ein treepanel
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleTreePanel createTreePanel(Object obj) {
        if (obj instanceof ManagergeneralSection) {
            AbstractSimpleTreePanel p = new SimplemanagerconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Managerdeny) {
            AbstractSimpleTreePanel p = new SimplemanagerconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof ManagerSection) {
            AbstractSimpleTreePanel p = new SimplemanagerconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Managerpermit) {
            AbstractSimpleTreePanel p = new SimplemanagerconfTreePanel();
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
        if (obj instanceof ManagergeneralSection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Managerdeny) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof ManagerSection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Managerpermit) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
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
        if (obj instanceof ManagergeneralSection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Managerdeny) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof ManagerSection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Managerpermit) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
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
        if (obj instanceof ManagergeneralSection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Managerdeny) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof ManagerSection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Managerpermit) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmanagerconfTreeDialog(
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
     * erzeugt eine neue Objektinstanz von ManagergeneralSection mit den default
     * Werten
     * 
     * @return ManagergeneralSection
     */
    public static final ManagergeneralSectionDataPanelImpl newManagergeneralSectionDataPanel() {
        return new ManagergeneralSectionDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Managerdeny mit den default Werten
     * 
     * @return Managerdeny
     */
    public static final ManagerdenyDataPanelImpl newManagerdenyDataPanel() {
        return new ManagerdenyDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von ManagerSection mit den default Werten
     * 
     * @return ManagerSection
     */
    public static final ManagerSectionDataPanelImpl newManagerSectionDataPanel() {
        return new ManagerSectionDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Managerpermit mit den default Werten
     * 
     * @return Managerpermit
     */
    public static final ManagerpermitDataPanelImpl newManagerpermitDataPanel() {
        return new ManagerpermitDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("MANAGERGENERALSECTION")) {
            ManagergeneralSectionTableModel model = new ManagergeneralSectionTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("MANAGERDENY")) {
            ManagerdenyTableModel model = new ManagerdenyTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("MANAGERSECTION")) {
            ManagerSectionTableModel model = new ManagerSectionTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("MANAGERPERMIT")) {
            ManagerpermitTableModel model = new ManagerpermitTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof ManagergeneralSection) {
            ManagergeneralSectionDataPanelImpl p = newManagergeneralSectionDataPanel();// getInstance().displayString((ManagergeneralSectionMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Managerdeny) {
            ManagerdenyDataPanelImpl p = newManagerdenyDataPanel();// getInstance().displayString((ManagerdenyMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof ManagerSection) {
            ManagerSectionDataPanelImpl p = newManagerSectionDataPanel();// getInstance().displayString((ManagerSectionMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Managerpermit) {
            ManagerpermitDataPanelImpl p = newManagerpermitDataPanel();// getInstance().displayString((ManagerpermitMap)obj);
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
