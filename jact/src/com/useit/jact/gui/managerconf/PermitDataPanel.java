/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
package com.useit.jact.gui.managerconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.managerconf.Permit;

/**
 * <p>
 * PermitDataPanel
 * </p>
 * Created : Wed Aug 17 01:27:24 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: PermitDataPanel.java,v 1.5 2005/09/20
 *          14:02:04 urs Exp $
 */
public class PermitDataPanel extends SimpleDataObjectPanel {
    protected Permit dataObject;

    // protected PermitChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public PermitDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getPermitResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getPermitResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/PermitResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * PermitCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldValue, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (1) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelValue(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldValue.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldValue.setValue(dataObject.getValue());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setValue(fStringTextFieldValue.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Permit
     */
    public void setDataObject(Object aPermit) {
        // abstractdataObject = (AbstractConfigObject) aPermit;
        setDataObject((Permit) aPermit);
        // dataObject = aPermit;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Permit
     */
    public void setDataObject(Permit aPermit) {
        // abstractdataObject = (AbstractConfigObject) aPermit;
        dataObject = aPermit;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldValue;

    private javax.swing.JLabel fJLabelValue;

    protected javax.swing.JPanel fJPanelValue;

    // start DB field Value
    /**
     * This method initializes fStringTextFieldValue
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldValue() {
        if (fStringTextFieldValue == null) {
            try {
                fStringTextFieldValue = new StringTextField(); // Generated
                fStringTextFieldValue.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldValue;
    }

    /**
     * This method initializes fJLabelValue
     * 
     * @return javax.swing.JLabel
     */
    private javax.swing.JLabel getJLabelValue() {
        if (fJLabelValue == null) {
            try {
                fJLabelValue = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelValue.setText(resBundel
                        .getString("res_strValueDisplayName")); // Generated
                fJLabelValue.setToolTipText(resBundel
                        .getString("res_strValueDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelValue;
    }

    /**
     * This method initializes fJPanelValue
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelValue() {
        if (fJPanelValue == null) {
            try {
                fJPanelValue = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelValue.setLayout(layFlowLayout); // Generated
                fJPanelValue.add(getJLabelValue(), null); // Generated
                fJPanelValue.add(getStringTextFieldValue(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelValue;
    }
    // end DB field Value

}
