/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.agentconf;

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
import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.Agentsrecording;

// import com.useit.jact.model.impl.AgentsconfImpl;
// import com.useit.jact.model.impl.AgentsImpl;
// import com.useit.jact.model.impl.AgentsrecordingImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.10 2006/01/09
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
        if (obj instanceof Agentsconf) {
            AbstractSimpleTreePanel p = new SimpleagentconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Agents) {
            AbstractSimpleTreePanel p = new SimpleagentconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Agentsrecording) {
            AbstractSimpleTreePanel p = new SimpleagentconfTreePanel();
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
        if (obj instanceof Agentsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Agents) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Agentsrecording) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
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
        if (obj instanceof Agentsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Agents) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Agentsrecording) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
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
        if (obj instanceof Agentsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Agents) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Agentsrecording) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultagentconfTreeDialog(
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
     * erzeugt eine neue Objektinstanz von Agentsconf mit den default Werten
     * 
     * @return Agentsconf
     */
    public static final AgentsconfDataPanelImpl newAgentsconfDataPanel() {
        return new AgentsconfDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Agents mit den default Werten
     * 
     * @return Agents
     */
    public static final AgentsDataPanelImpl newAgentsDataPanel() {
        return new AgentsDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Agentsrecording mit den default
     * Werten
     * 
     * @return Agentsrecording
     */
    public static final AgentsrecordingDataPanelImpl newAgentsrecordingDataPanel() {
        return new AgentsrecordingDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("AGENTSCONF")) {
            AgentsconfTableModel model = new AgentsconfTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("AGENTS")) {
            AgentsTableModel model = new AgentsTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("AGENTSRECORDING")) {
            AgentsrecordingTableModel model = new AgentsrecordingTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof Agentsconf) {
            AgentsconfDataPanelImpl p = newAgentsconfDataPanel();// getInstance().displayString((AgentsconfMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Agents) {
            AgentsDataPanelImpl p = newAgentsDataPanel();// getInstance().displayString((AgentsMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Agentsrecording) {
            AgentsrecordingDataPanelImpl p = newAgentsrecordingDataPanel();// getInstance().displayString((AgentsrecordingMap)obj);
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
