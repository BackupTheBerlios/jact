/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.misdnconf;

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
import com.useit.jact.model.misdnconf.MisdnCryptkey;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.Misdnconf;

// import com.useit.jact.model.impl.MisdnCryptkeyImpl;
// import com.useit.jact.model.impl.MisdnPortsImpl;
// import com.useit.jact.model.impl.MisdnSectionsImpl;
// import com.useit.jact.model.impl.MisdnconfImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.13 2006/01/09
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
        if (obj instanceof MisdnCryptkey) {
            AbstractSimpleTreePanel p = new SimplemisdnconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof MisdnPorts) {
            AbstractSimpleTreePanel p = new SimplemisdnconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof MisdnSections) {
            AbstractSimpleTreePanel p = new SimplemisdnconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Misdnconf) {
            AbstractSimpleTreePanel p = new SimplemisdnconfTreePanel();
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
        if (obj instanceof MisdnCryptkey) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof MisdnPorts) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof MisdnSections) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Misdnconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
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
        if (obj instanceof MisdnCryptkey) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof MisdnPorts) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof MisdnSections) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Misdnconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
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
        if (obj instanceof MisdnCryptkey) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof MisdnPorts) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof MisdnSections) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Misdnconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdnconfTreeDialog(
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
     * erzeugt eine neue Objektinstanz von MisdnCryptkey mit den default Werten
     * 
     * @return MisdnCryptkey
     */
    public static final MisdnCryptkeyDataPanelImpl newMisdnCryptkeyDataPanel() {
        return new MisdnCryptkeyDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von MisdnPorts mit den default Werten
     * 
     * @return MisdnPorts
     */
    public static final MisdnPortsDataPanelImpl newMisdnPortsDataPanel() {
        return new MisdnPortsDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von MisdnSections mit den default Werten
     * 
     * @return MisdnSections
     */
    public static final MisdnSectionsDataPanelImpl newMisdnSectionsDataPanel() {
        return new MisdnSectionsDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Misdnconf mit den default Werten
     * 
     * @return Misdnconf
     */
    public static final MisdnconfDataPanelImpl newMisdnconfDataPanel() {
        return new MisdnconfDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("MISDNCRYPTKEY")) {
            MisdnCryptkeyTableModel model = new MisdnCryptkeyTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("MISDNPORTS")) {
            MisdnPortsTableModel model = new MisdnPortsTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("MISDNSECTIONS")) {
            MisdnSectionsTableModel model = new MisdnSectionsTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("MISDNCONF")) {
            MisdnconfTableModel model = new MisdnconfTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof MisdnCryptkey) {
            MisdnCryptkeyDataPanelImpl p = newMisdnCryptkeyDataPanel();// getInstance().displayString((MisdnCryptkeyMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof MisdnPorts) {
            MisdnPortsDataPanelImpl p = newMisdnPortsDataPanel();// getInstance().displayString((MisdnPortsMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof MisdnSections) {
            MisdnSectionsDataPanelImpl p = newMisdnSectionsDataPanel();// getInstance().displayString((MisdnSectionsMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Misdnconf) {
            MisdnconfDataPanelImpl p = newMisdnconfDataPanel();// getInstance().displayString((MisdnconfMap)obj);
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
