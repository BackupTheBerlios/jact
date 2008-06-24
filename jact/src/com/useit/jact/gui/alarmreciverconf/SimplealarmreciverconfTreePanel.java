/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.alarmreciverconf;

import java.awt.HeadlessException;

import javax.swing.event.TreeModelEvent;

import com.useit.app.framework.gui.baseForms.BaseAppDialogInterface;
import com.useit.app.framework.gui.dialogs.SimpleObjectDialogScrollPane;
import com.useit.app.framework.gui.guiHelper.AbstractSimpleTreePanel;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.app.framework.gui.guiHelper.SimpleMapDataPanel;
import com.useit.app.framework.model.dataModel.MapTyper;

/**
 * <p>
 * SimplealarmreciverconfTreePanel , ein tree panel das eine Objekt grupppe des
 * Models mit den datenpanels zusammen anzeigt.
 * </p>
 * Created : 07.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SimplealarmreciverconfTreePanel.java,v 1.3
 *          2006/01/06 19:04:10 urs Exp $
 */
public class SimplealarmreciverconfTreePanel extends AbstractSimpleTreePanel {

    /**
     * @throws HeadlessException
     */
    public SimplealarmreciverconfTreePanel() throws HeadlessException {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.guiHelper.AbstractSimpleTreePanel#createPanel(java.lang.Object)
     */
    protected SimpleDataObjectPanel createPanel(Object object) {
        SimpleDataObjectPanel p = GuiClassFactory.createPanel(object);
        if (p instanceof SimpleMapDataPanel) {
            SimpleMapDataPanel mp = (SimpleMapDataPanel) p;
            mp.setObjectHandler(this);
        }
        return p;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.guiHelper.AbstractSimpleTreePanel#addObject(com.useit.app.framework.model.modelHelper.AbstractObjectMap)
     */
    public void addObject(MapTyper dataMap) {
        Object object = dataMap.newObject();
        SimpleDataObjectPanel p = GuiClassFactory.createPanel(object);
        SimpleObjectDialogScrollPane dlg = new SimpleObjectDialogScrollPane(
                null, true, p);
        dlg.setVisible(true);
        if (dlg.returnCode == BaseAppDialogInterface.RETURNOK) {
            dataMap.addObject(object);
            if (getJTree().getAnchorSelectionPath() != null)
                if (getJTree().getAnchorSelectionPath().getParentPath() != null)
                    treeModel.fireTreeStructureChanged(new TreeModelEvent(
                            getJTree(), getJTree().getAnchorSelectionPath()
                                    .getParentPath()));
        }
        lastPanel.updateData();
    }

    /**
     * @param data
     */
    public void initTree(Object data) {
        SimpleTreeModelImpl m = new SimpleTreeModelImpl();
        m.setRoot(data);
        setTreeModel(m);
        setTreeCellRenderer(GuiClassFactory.simpleTreeRendere());

        selectRoot();
    }

}
