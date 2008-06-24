/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.misdndriverconf;

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
import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;

// import com.useit.jact.model.impl.MisdnCardsImpl;
// import com.useit.jact.model.impl.MisdnDriverConfImpl;
// import com.useit.jact.model.impl.MisdncardPortsImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.8 2006/01/09
 *          10:17:36 urs Exp $
 */
public class GuiClassFactory {
    /**
     * erzeugt ein treepanel
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleTreePanel createTreePanel(Object obj) {
        if (obj instanceof MisdnCards) {
            AbstractSimpleTreePanel p = new SimplemisdndriverconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof MisdnDriverConf) {
            AbstractSimpleTreePanel p = new SimplemisdndriverconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof MisdncardPorts) {
            AbstractSimpleTreePanel p = new SimplemisdndriverconfTreePanel();
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
        if (obj instanceof MisdnCards) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof MisdnDriverConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof MisdncardPorts) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
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
        if (obj instanceof MisdnCards) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof MisdnDriverConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof MisdncardPorts) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
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
        if (obj instanceof MisdnCards) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof MisdnDriverConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof MisdncardPorts) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmisdndriverconfTreeDialog(
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
     * erzeugt eine neue Objektinstanz von MisdnCards mit den default Werten
     * 
     * @return MisdnCards
     */
    public static final MisdnCardsDataPanelImpl newMisdnCardsDataPanel() {
        return new MisdnCardsDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von MisdnDriverConf mit den default
     * Werten
     * 
     * @return MisdnDriverConf
     */
    public static final MisdnDriverConfDataPanelImpl newMisdnDriverConfDataPanel() {
        return new MisdnDriverConfDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von MisdncardPorts mit den default Werten
     * 
     * @return MisdncardPorts
     */
    public static final MisdncardPortsDataPanelImpl newMisdncardPortsDataPanel() {
        return new MisdncardPortsDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("MISDNCARDS")) {
            MisdnCardsTableModel model = new MisdnCardsTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("MISDNDRIVERCONF")) {
            MisdnDriverConfTableModel model = new MisdnDriverConfTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("MISDNCARDPORTS")) {
            MisdncardPortsTableModel model = new MisdncardPortsTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof MisdnCards) {
            MisdnCardsDataPanelImpl p = newMisdnCardsDataPanel();// getInstance().displayString((MisdnCardsMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof MisdnDriverConf) {
            MisdnDriverConfDataPanelImpl p = newMisdnDriverConfDataPanel();// getInstance().displayString((MisdnDriverConfMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof MisdncardPorts) {
            MisdncardPortsDataPanelImpl p = newMisdncardPortsDataPanel();// getInstance().displayString((MisdncardPortsMap)obj);
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
