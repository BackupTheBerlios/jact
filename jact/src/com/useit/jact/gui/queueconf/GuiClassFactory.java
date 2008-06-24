/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.queueconf;

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
import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.Queuemember;
import com.useit.jact.model.queueconf.Queuesection;

// import com.useit.jact.model.impl.QueuegeneralImpl;
// import com.useit.jact.model.impl.QueuesectionImpl;
// import com.useit.jact.model.impl.QueuememberImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.11 2006/01/14
 *          15:44:47 urs Exp $
 */
public class GuiClassFactory {
    /**
     * erzeugt ein treepanel
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleTreePanel createTreePanel(Object obj) {
        if (obj instanceof Queuegeneral) {
            AbstractSimpleTreePanel p = new SimplequeueconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Queuesection) {
            AbstractSimpleTreePanel p = new SimplequeueconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Queuemember) {
            AbstractSimpleTreePanel p = new SimplequeueconfTreePanel();
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
        if (obj instanceof Queuegeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Queuesection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Queuemember) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
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
        if (obj instanceof Queuegeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Queuesection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Queuemember) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
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
        if (obj instanceof Queuegeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Queuesection) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Queuemember) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultqueueconfTreeDialog(
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
     * erzeugt eine neue Objektinstanz von Queuegeneral mit den default Werten
     * 
     * @return Queuegeneral
     */
    public static final QueuegeneralDataPanelImpl newQueuegeneralDataPanel() {
        return new QueuegeneralDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Queuesection mit den default Werten
     * 
     * @return Queuesection
     */
    public static final QueuesectionDataPanelImpl newQueuesectionDataPanel() {
        return new QueuesectionDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Queuemember mit den default Werten
     * 
     * @return Queuemember
     */
    public static final QueuememberDataPanelImpl newQueuememberDataPanel() {
        return new QueuememberDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("QUEUEGENERAL")) {
            QueuegeneralTableModel model = new QueuegeneralTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("QUEUESECTION")) {
            QueuesectionTableModel model = new QueuesectionTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("QUEUEMEMBER")) {
            QueuememberTableModel model = new QueuememberTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof Queuegeneral) {
            QueuegeneralDataPanelImpl p = newQueuegeneralDataPanel();// getInstance().displayString((QueuegeneralMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Queuesection) {
            QueuesectionDataPanelImpl p = newQueuesectionDataPanel();// getInstance().displayString((QueuesectionMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Queuemember) {
            QueuememberDataPanelImpl p = newQueuememberDataPanel();// getInstance().displayString((QueuememberMap)obj);
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
