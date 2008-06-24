/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.voicemailconf;

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
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.Zonemessages;

// import com.useit.jact.model.impl.VoicemailConfImpl;
// import com.useit.jact.model.impl.ZonemessagesImpl;
// import com.useit.jact.model.impl.VoicemailcontextImpl;
// import com.useit.jact.model.impl.VoicemailcontextentryImpl;
// import com.useit.jact.model.impl.VoicemailgeneralImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.12 2006/01/14
 *          15:00:13 urs Exp $
 */
public class GuiClassFactory {
    /**
     * erzeugt ein treepanel
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleTreePanel createTreePanel(Object obj) {
        if (obj instanceof VoicemailConf) {
            AbstractSimpleTreePanel p = new SimplevoicemailconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Zonemessages) {
            AbstractSimpleTreePanel p = new SimplevoicemailconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Voicemailcontext) {
            AbstractSimpleTreePanel p = new SimplevoicemailconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Voicemailcontextentry) {
            AbstractSimpleTreePanel p = new SimplevoicemailconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Voicemailgeneral) {
            AbstractSimpleTreePanel p = new SimplevoicemailconfTreePanel();
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
        if (obj instanceof VoicemailConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Zonemessages) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Voicemailcontext) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Voicemailcontextentry) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Voicemailgeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
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
        if (obj instanceof VoicemailConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Zonemessages) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Voicemailcontext) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Voicemailcontextentry) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Voicemailgeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
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
        if (obj instanceof VoicemailConf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Zonemessages) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Voicemailcontext) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Voicemailcontextentry) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Voicemailgeneral) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultvoicemailconfTreeDialog(
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
     * erzeugt eine neue Objektinstanz von VoicemailConf mit den default Werten
     * 
     * @return VoicemailConf
     */
    public static final VoicemailConfDataPanelImpl newVoicemailConfDataPanel() {
        return new VoicemailConfDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Zonemessages mit den default Werten
     * 
     * @return Zonemessages
     */
    public static final ZonemessagesDataPanelImpl newZonemessagesDataPanel() {
        return new ZonemessagesDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Voicemailcontext mit den default
     * Werten
     * 
     * @return Voicemailcontext
     */
    public static final VoicemailcontextDataPanelImpl newVoicemailcontextDataPanel() {
        return new VoicemailcontextDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Voicemailcontextentry mit den default
     * Werten
     * 
     * @return Voicemailcontextentry
     */
    public static final VoicemailcontextentryDataPanelImpl newVoicemailcontextentryDataPanel() {
        return new VoicemailcontextentryDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Voicemailgeneral mit den default
     * Werten
     * 
     * @return Voicemailgeneral
     */
    public static final VoicemailgeneralDataPanelImpl newVoicemailgeneralDataPanel() {
        return new VoicemailgeneralDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("VOICEMAILCONF")) {
            VoicemailConfTableModel model = new VoicemailConfTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("ZONEMESSAGES")) {
            ZonemessagesTableModel model = new ZonemessagesTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("VOICEMAILCONTEXT")) {
            VoicemailcontextTableModel model = new VoicemailcontextTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("VOICEMAILCONTEXTENTRY")) {
            VoicemailcontextentryTableModel model = new VoicemailcontextentryTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("VOICEMAILGENERAL")) {
            VoicemailgeneralTableModel model = new VoicemailgeneralTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof VoicemailConf) {
            VoicemailConfDataPanelImpl p = newVoicemailConfDataPanel();// getInstance().displayString((VoicemailConfMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Zonemessages) {
            ZonemessagesDataPanelImpl p = newZonemessagesDataPanel();// getInstance().displayString((ZonemessagesMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Voicemailcontext) {
            VoicemailcontextDataPanelImpl p = newVoicemailcontextDataPanel();// getInstance().displayString((VoicemailcontextMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Voicemailcontextentry) {
            VoicemailcontextentryDataPanelImpl p = newVoicemailcontextentryDataPanel();// getInstance().displayString((VoicemailcontextentryMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Voicemailgeneral) {
            VoicemailgeneralDataPanelImpl p = newVoicemailgeneralDataPanel();// getInstance().displayString((VoicemailgeneralMap)obj);
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
