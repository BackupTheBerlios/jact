package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.JEnumComboboxSwitchtype;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zapataconf.ISDN_PRI_Switch;

/**
 * <p>
 * ISDN_PRI_SwitchDataPanel
 * </p>
 * Created : Thu Dec 29 12:23:03 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISDN_PRI_SwitchDataPanel.java,v 1.5
 *          2005/12/29 19:14:06 urs Exp $
 */
public class ISDN_PRI_SwitchDataPanel extends SimpleDataObjectPanel {
    protected ISDN_PRI_Switch dataObject;

    // protected ISDN_PRI_SwitchChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ISDN_PRI_SwitchDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getISDN_PRI_SwitchResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getISDN_PRI_SwitchResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ISDN_PRI_SwitchResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ISDN_PRI_SwitchCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fJEnumComboboxSwitchtypeswitchtype,
     * fStringTextFieldoverlapdial, fStringTextFieldpridialplan,
     * fStringTextFieldpriindication, }; dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (5) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(5); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelswitchtype(), null); // Generated
        this.add(getJPaneloverlapdial(), null); // Generated
        this.add(getJPanelpridialplan(), null); // Generated
        this.add(getJPanelpriindication(), null); // Generated
        // this.add(getJPanelmultilink_PPP(),null);
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fJEnumComboboxSwitchtypeswitchtype.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldoverlapdial.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldpridialplan.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldpriindication.getDocument().addDocumentListener(
                textChangeAct);

        // fJComboBoxmultilink_PPP.addActionListener(textChangeAct);
    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fJEnumComboboxSwitchtypeswitchtype.setValue(dataObject.getSwitchtype());
        fStringTextFieldoverlapdial.setValue(dataObject.getOverlapdial());
        fStringTextFieldpridialplan.setValue(dataObject.getPridialplan());
        fStringTextFieldpriindication.setValue(dataObject.getPriindication());

        // fJComboBoxmultilink_PPP.setSelectedItem(dataObject.getMultilink_PPP());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setSwitchtype(fJEnumComboboxSwitchtypeswitchtype.getValue());
        dataObject.setOverlapdial(fStringTextFieldoverlapdial.getValue());
        dataObject.setPridialplan(fStringTextFieldpridialplan.getValue());
        dataObject.setPriindication(fStringTextFieldpriindication.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param ISDN_PRI_Switch
     */
    public void setDataObject(Object aISDN_PRI_Switch) {
        // abstractdataObject = (AbstractConfigObject) aISDN_PRI_Switch;
        setDataObject((ISDN_PRI_Switch) aISDN_PRI_Switch);
        // dataObject = aISDN_PRI_Switch;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param ISDN_PRI_Switch
     */
    public void setDataObject(ISDN_PRI_Switch aISDN_PRI_Switch) {
        // abstractdataObject = (AbstractConfigObject) aISDN_PRI_Switch;
        dataObject = aISDN_PRI_Switch;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected JEnumComboboxSwitchtype fJEnumComboboxSwitchtypeswitchtype;

    protected javax.swing.JLabel fJLabelswitchtype;

    protected javax.swing.JPanel fJPanelswitchtype;

    protected StringTextField fStringTextFieldoverlapdial;

    protected javax.swing.JLabel fJLabeloverlapdial;

    protected javax.swing.JPanel fJPaneloverlapdial;

    protected StringTextField fStringTextFieldpridialplan;

    protected javax.swing.JLabel fJLabelpridialplan;

    protected javax.swing.JPanel fJPanelpridialplan;

    protected StringTextField fStringTextFieldpriindication;

    protected javax.swing.JLabel fJLabelpriindication;

    protected javax.swing.JPanel fJPanelpriindication;

    // start DB field switchtype
    /**
     * This method initializes fJEnumComboboxSwitchtypeswitchtype
     * 
     * @return JEnumComboboxSwitchtype
     */
    public JEnumComboboxSwitchtype getJEnumComboboxSwitchtypeswitchtype() {
        if (fJEnumComboboxSwitchtypeswitchtype == null) {
            try {
                fJEnumComboboxSwitchtypeswitchtype = new JEnumComboboxSwitchtype(); // Generated
                fJEnumComboboxSwitchtypeswitchtype
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxSwitchtypeswitchtype;
    }

    /**
     * This method initializes fJLabelswitchtype
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelswitchtype() {
        if (fJLabelswitchtype == null) {
            try {
                fJLabelswitchtype = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelswitchtype.setText(resBundel
                        .getString("res_strswitchtypeDisplayName")); // Generated
                fJLabelswitchtype.setToolTipText(resBundel
                        .getString("res_strswitchtypeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelswitchtype;
    }

    /**
     * This method initializes fJPanelswitchtype
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelswitchtype() {
        if (fJPanelswitchtype == null) {
            try {
                fJPanelswitchtype = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelswitchtype.setLayout(layFlowLayout); // Generated
                fJPanelswitchtype.add(getJLabelswitchtype(), null); // Generated
                fJPanelswitchtype.add(getJEnumComboboxSwitchtypeswitchtype(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelswitchtype;
    }

    // end DB field switchtype
    // start DB field overlapdial
    /**
     * This method initializes fStringTextFieldoverlapdial
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldoverlapdial() {
        if (fStringTextFieldoverlapdial == null) {
            try {
                fStringTextFieldoverlapdial = new StringTextField(); // Generated
                fStringTextFieldoverlapdial
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldoverlapdial;
    }

    /**
     * This method initializes fJLabeloverlapdial
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloverlapdial() {
        if (fJLabeloverlapdial == null) {
            try {
                fJLabeloverlapdial = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeloverlapdial.setText(resBundel
                        .getString("res_stroverlapdialDisplayName")); // Generated
                fJLabeloverlapdial.setToolTipText(resBundel
                        .getString("res_stroverlapdialDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeloverlapdial;
    }

    /**
     * This method initializes fJPaneloverlapdial
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloverlapdial() {
        if (fJPaneloverlapdial == null) {
            try {
                fJPaneloverlapdial = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloverlapdial.setLayout(layFlowLayout); // Generated
                fJPaneloverlapdial.add(getJLabeloverlapdial(), null); // Generated
                fJPaneloverlapdial.add(getStringTextFieldoverlapdial(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloverlapdial;
    }

    // end DB field overlapdial
    // start DB field pridialplan
    /**
     * This method initializes fStringTextFieldpridialplan
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpridialplan() {
        if (fStringTextFieldpridialplan == null) {
            try {
                fStringTextFieldpridialplan = new StringTextField(); // Generated
                fStringTextFieldpridialplan
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpridialplan;
    }

    /**
     * This method initializes fJLabelpridialplan
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpridialplan() {
        if (fJLabelpridialplan == null) {
            try {
                fJLabelpridialplan = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpridialplan.setText(resBundel
                        .getString("res_strpridialplanDisplayName")); // Generated
                fJLabelpridialplan.setToolTipText(resBundel
                        .getString("res_strpridialplanDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpridialplan;
    }

    /**
     * This method initializes fJPanelpridialplan
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpridialplan() {
        if (fJPanelpridialplan == null) {
            try {
                fJPanelpridialplan = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpridialplan.setLayout(layFlowLayout); // Generated
                fJPanelpridialplan.add(getJLabelpridialplan(), null); // Generated
                fJPanelpridialplan.add(getStringTextFieldpridialplan(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpridialplan;
    }

    // end DB field pridialplan
    // start DB field priindication
    /**
     * This method initializes fStringTextFieldpriindication
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpriindication() {
        if (fStringTextFieldpriindication == null) {
            try {
                fStringTextFieldpriindication = new StringTextField(); // Generated
                fStringTextFieldpriindication
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpriindication;
    }

    /**
     * This method initializes fJLabelpriindication
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpriindication() {
        if (fJLabelpriindication == null) {
            try {
                fJLabelpriindication = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpriindication.setText(resBundel
                        .getString("res_strpriindicationDisplayName")); // Generated
                fJLabelpriindication.setToolTipText(resBundel
                        .getString("res_strpriindicationDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpriindication;
    }

    /**
     * This method initializes fJPanelpriindication
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpriindication() {
        if (fJPanelpriindication == null) {
            try {
                fJPanelpriindication = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpriindication.setLayout(layFlowLayout); // Generated
                fJPanelpriindication.add(getJLabelpriindication(), null); // Generated
                fJPanelpriindication.add(getStringTextFieldpriindication(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpriindication;
    }
    // end DB field priindication

}
