/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.globalmodel;

import com.useit.app.framework.gui.dialogs.AbstractSimpleDataObjectTreeDialog;
import com.useit.app.framework.gui.guiHelper.AbstractSimpleTreePanel;
import com.useit.jact.model.globalmodel.ModelFactory;

/**
 * 
 * <p>
 * GuiModelResolver, löst model object zu guis auf
 * </p>
 * Created : 28.12.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiModelResolver.java,v 1.2 2005/12/29
 *          19:14:27 urs Exp $
 */
public class GuiModelResolver {

    public static AbstractSimpleDataObjectTreeDialog resolveDialog(Object obj) {
        AbstractSimpleDataObjectTreeDialog dialog = null;

        if (ModelFactory.getInstance().isfeatureconfModel(obj)) {
            dialog = DialogFactory.createfeatureconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().isqueueconfModel(obj)) {
            dialog = DialogFactory.createqueueconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().ismanagerconfModel(obj)) {
            dialog = DialogFactory.createmanagerconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().isextensionconfModel(obj)) {
            dialog = DialogFactory.createextensionconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().ismisdnconfModel(obj)) {
            dialog = DialogFactory.createmisdnconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().issipconfModel(obj)) {
            dialog = DialogFactory.createsipconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().isindicationsconfModel(obj)) {
            dialog = DialogFactory.createindicationsconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().isagentconfModel(obj)) {
            dialog = DialogFactory.createagentconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().isvoicemailconfModel(obj)) {
            dialog = DialogFactory.createvoicemailconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().iszapataconfModel(obj)) {
            dialog = DialogFactory.createzapataconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().isalarmreciverconfModel(obj)) {
            dialog = DialogFactory.createalarmreciverconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().ismisdndriverconfModel(obj)) {
            dialog = DialogFactory.createmisdndriverconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().ismeetmeconfModel(obj)) {
            dialog = DialogFactory.createmeetmeconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().ismusiconholdconfModel(obj)) {
            dialog = DialogFactory.createmusiconholdconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().iszaptelconfModel(obj)) {
            dialog = DialogFactory.createzaptelconfTreeDialog(obj);
            return dialog;
        }

        if (ModelFactory.getInstance().isiaxconfModel(obj)) {
            dialog = DialogFactory.createiaxconfTreeDialog(obj);
            return dialog;
        }
        return null;
    }

    public static AbstractSimpleTreePanel resolvePanel(Object obj) {
        AbstractSimpleTreePanel panel = null;

        if (ModelFactory.getInstance().isfeatureconfModel(obj)) {
            panel = DialogFactory.createfeatureconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().isqueueconfModel(obj)) {
            panel = DialogFactory.createqueueconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().ismanagerconfModel(obj)) {
            panel = DialogFactory.createmanagerconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().isextensionconfModel(obj)) {
            panel = DialogFactory.createextensionconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().ismisdnconfModel(obj)) {
            panel = DialogFactory.createmisdnconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().issipconfModel(obj)) {
            panel = DialogFactory.createsipconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().isindicationsconfModel(obj)) {
            panel = DialogFactory.createindicationsconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().isagentconfModel(obj)) {
            panel = DialogFactory.createagentconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().isvoicemailconfModel(obj)) {
            panel = DialogFactory.createvoicemailconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().iszapataconfModel(obj)) {
            panel = DialogFactory.createzapataconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().isalarmreciverconfModel(obj)) {
            panel = DialogFactory.createalarmreciverconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().ismisdndriverconfModel(obj)) {
            panel = DialogFactory.createmisdndriverconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().ismeetmeconfModel(obj)) {
            panel = DialogFactory.createmeetmeconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().ismusiconholdconfModel(obj)) {
            panel = DialogFactory.createmusiconholdconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().iszaptelconfModel(obj)) {
            panel = DialogFactory.createzaptelconfTreePanel();
            panel.initTree(obj);
            return panel;
        }

        if (ModelFactory.getInstance().isiaxconfModel(obj)) {
            panel = DialogFactory.createiaxconfTreePanel();
            panel.initTree(obj);
            return panel;
        }
        return null;
    }

}
