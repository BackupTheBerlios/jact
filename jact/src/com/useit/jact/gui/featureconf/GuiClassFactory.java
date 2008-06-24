/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.featureconf;

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
import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.Featuresconf;

// import com.useit.jact.model.impl.FeaturesconfImpl;
// import com.useit.jact.model.impl.FeaturemapImpl;
/**
 * <p>
 * GuiClassFactory, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiClassFactory.java,v 1.10 2006/01/09
 *          10:17:46 urs Exp $
 */
public class GuiClassFactory {
    /**
     * erzeugt ein treepanel
     * 
     * @param obj
     * @return
     */
    public static AbstractSimpleTreePanel createTreePanel(Object obj) {
        if (obj instanceof Featuresconf) {
            AbstractSimpleTreePanel p = new SimplefeatureconfTreePanel();
            p.initTree(obj);
            return p;
        }
        if (obj instanceof Featuremap) {
            AbstractSimpleTreePanel p = new SimplefeatureconfTreePanel();
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
        if (obj instanceof Featuresconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultfeatureconfTreeDialog(
                    obj);
            return p;
        }
        if (obj instanceof Featuremap) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultfeatureconfTreeDialog(
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
        if (obj instanceof Featuresconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultfeatureconfTreeDialog(
                    aFrame, obj);
            return p;
        }
        if (obj instanceof Featuremap) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultfeatureconfTreeDialog(
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
        if (obj instanceof Featuresconf) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultfeatureconfTreeDialog(
                    aDialog, obj);
            return p;
        }
        if (obj instanceof Featuremap) {
            AbstractSimpleDataObjectTreeDialog p = new DefaultfeatureconfTreeDialog(
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
     * erzeugt eine neue Objektinstanz von Featuresconf mit den default Werten
     * 
     * @return Featuresconf
     */
    public static final FeaturesconfDataPanelImpl newFeaturesconfDataPanel() {
        return new FeaturesconfDataPanelImpl();
    }

    /**
     * erzeugt eine neue Objektinstanz von Featuremap mit den default Werten
     * 
     * @return Featuremap
     */
    public static final FeaturemapDataPanelImpl newFeaturemapDataPanel() {
        return new FeaturemapDataPanelImpl();
    }

    /**
     * erzeugt ein TableModel für eine übergebene Map wenn die Map bekannt ist.
     * sonmst null
     * 
     * @param obj
     * @return
     */
    public static final AbstractSimpleTableModel createTableModel(MapTyper mt) {
        if (mt.getMapkey().equals("FEATURESCONF")) {
            FeaturesconfTableModel model = new FeaturesconfTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        if (mt.getMapkey().equals("FEATUREMAP")) {
            FeaturemapTableModel model = new FeaturemapTableModel(null);
            model.setNewList(mt.getList());
            return model;

        }
        return null;
    }

    public static final SimpleDataObjectPanel createPanel(Object obj) {
        if (obj instanceof Featuresconf) {
            FeaturesconfDataPanelImpl p = newFeaturesconfDataPanel();// getInstance().displayString((FeaturesconfMap)obj);
            p.setDataObject(obj);
            return p;
        }
        if (obj instanceof Featuremap) {
            FeaturemapDataPanelImpl p = newFeaturemapDataPanel();// getInstance().displayString((FeaturemapMap)obj);
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
