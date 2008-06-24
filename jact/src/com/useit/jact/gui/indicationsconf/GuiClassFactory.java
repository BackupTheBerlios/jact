/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.indicationsconf;

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
import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.ToneDefinitions;

// import com.useit.jact.model.impl.ToneDefinitionsImpl;
// import com.useit.jact.model.impl.IndicationsconfImpl;
// import com.useit.jact.model.impl.CustomToneImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zur�ckgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.10 2006/01/09
 *          10:17:42 urs Exp $
 */
public class GuiClassFactory {
    /**
     * erzeugt ein treepanel
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleTreePanel createTreePanel(Object obj) {
        if (obj instanceof ToneDefinitions) {
            AbstractSimpleTreePanel p = new SimpleindicationsconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Indicationsconf) {
            AbstractSimpleTreePanel p = new SimpleindicationsconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof CustomTone) {
            AbstractSimpleTreePanel p = new SimpleindicationsconfTreePanel();
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
        if (obj instanceof ToneDefinitions) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Indicationsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof CustomTone) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
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
        if (obj instanceof ToneDefinitions) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Indicationsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof CustomTone) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
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
        if (obj instanceof ToneDefinitions) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Indicationsconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof CustomTone) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultindicationsconfTreeDialog(
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
     * erzeugt eine neue Objektinstanz von ToneDefinitions mit den default
     * Werten
     * 
     * @return ToneDefinitions
     */
    public static final ToneDefinitionsDataPanelImpl newToneDefinitionsDataPanel() {
        return new ToneDefinitionsDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Indicationsconf mit den default
     * Werten
     * 
     * @return Indicationsconf
     */
    public static final IndicationsconfDataPanelImpl newIndicationsconfDataPanel() {
        return new IndicationsconfDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von CustomTone mit den default Werten
     * 
     * @return CustomTone
     */
    public static final CustomToneDataPanelImpl newCustomToneDataPanel() {
        return new CustomToneDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel f�r eine �bergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("TONEDEFINITIONS")) {
            ToneDefinitionsTableModel model = new ToneDefinitionsTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("INDICATIONSCONF")) {
            IndicationsconfTableModel model = new IndicationsconfTableModel(
                    null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("CUSTOMTONE")) {
            CustomToneTableModel model = new CustomToneTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof ToneDefinitions) {
            ToneDefinitionsDataPanelImpl p = newToneDefinitionsDataPanel();// getInstance().displayString((ToneDefinitionsMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Indicationsconf) {
            IndicationsconfDataPanelImpl p = newIndicationsconfDataPanel();// getInstance().displayString((IndicationsconfMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof CustomTone) {
            CustomToneDataPanelImpl p = newCustomToneDataPanel();// getInstance().displayString((CustomToneMap)obj);
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
