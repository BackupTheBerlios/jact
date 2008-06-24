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
package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.JEnumComboboxCodecs;
import com.useit.jact.model.sipconf.Sipdisallow;

/**
 * <p>
 * SipdisallowDataPanel
 * </p>
 * Created : Thu Sep 08 19:35:44 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipdisallowDataPanel.java,v 1.4 2005/09/20
 *          14:01:52 urs Exp $
 */
public class SipdisallowDataPanel extends SimpleDataObjectPanel {
    protected Sipdisallow dataObject;

    // protected SipdisallowChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public SipdisallowDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getSipdisallowResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getSipdisallowResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/SipdisallowResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * SipdisallowCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fJEnumComboboxCodecsValue, };
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
        fJEnumComboboxCodecsValue.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fJEnumComboboxCodecsValue.setValue(dataObject.getValue());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setValue(fJEnumComboboxCodecsValue.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Sipdisallow
     */
    public void setDataObject(Object aSipdisallow) {
        // abstractdataObject = (AbstractConfigObject) aSipdisallow;
        setDataObject((Sipdisallow) aSipdisallow);
        // dataObject = aSipdisallow;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Sipdisallow
     */
    public void setDataObject(Sipdisallow aSipdisallow) {
        // abstractdataObject = (AbstractConfigObject) aSipdisallow;
        dataObject = aSipdisallow;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected JEnumComboboxCodecs fJEnumComboboxCodecsValue;

    protected javax.swing.JLabel fJLabelValue;

    protected javax.swing.JPanel fJPanelValue;

    // start DB field Value
    /**
     * This method initializes fJEnumComboboxCodecsValue
     * 
     * @return JEnumComboboxCodecs
     */
    public JEnumComboboxCodecs getJEnumComboboxCodecsValue() {
        if (fJEnumComboboxCodecsValue == null) {
            try {
                fJEnumComboboxCodecsValue = new JEnumComboboxCodecs(); // Generated
                fJEnumComboboxCodecsValue
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxCodecsValue;
    }

    /**
     * This method initializes fJLabelValue
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelValue() {
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
                fJPanelValue.add(getJEnumComboboxCodecsValue(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelValue;
    }
    // end DB field Value

}
