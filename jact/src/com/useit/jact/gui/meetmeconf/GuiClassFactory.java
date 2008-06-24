/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.meetmeconf;

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
import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.Meetmerooms;

// import com.useit.jact.model.impl.MeetmeroomsImpl;
// import com.useit.jact.model.impl.MeetmeconfImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.10 2006/01/09
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
        if (obj instanceof Meetmerooms) {
            AbstractSimpleTreePanel p = new SimplemeetmeconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Meetmeconf) {
            AbstractSimpleTreePanel p = new SimplemeetmeconfTreePanel();
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
        if (obj instanceof Meetmerooms) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmeetmeconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Meetmeconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmeetmeconfTreeDialog(
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
        if (obj instanceof Meetmerooms) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmeetmeconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Meetmeconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmeetmeconfTreeDialog(
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
        if (obj instanceof Meetmerooms) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmeetmeconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Meetmeconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultmeetmeconfTreeDialog(
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
     * erzeugt eine neue Objektinstanz von Meetmerooms mit den default Werten
     * 
     * @return Meetmerooms
     */
    public static final MeetmeroomsDataPanelImpl newMeetmeroomsDataPanel() {
        return new MeetmeroomsDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Meetmeconf mit den default Werten
     * 
     * @return Meetmeconf
     */
    public static final MeetmeconfDataPanelImpl newMeetmeconfDataPanel() {
        return new MeetmeconfDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("MEETMEROOMS")) {
            MeetmeroomsTableModel model = new MeetmeroomsTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("MEETMECONF")) {
            MeetmeconfTableModel model = new MeetmeconfTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof Meetmerooms) {
            MeetmeroomsDataPanelImpl p = newMeetmeroomsDataPanel();// getInstance().displayString((MeetmeroomsMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Meetmeconf) {
            MeetmeconfDataPanelImpl p = newMeetmeconfDataPanel();// getInstance().displayString((MeetmeconfMap)obj);
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
