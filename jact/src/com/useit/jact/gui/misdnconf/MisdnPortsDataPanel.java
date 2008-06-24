package com.useit.jact.gui.misdnconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.JEnumComboboxMisdnPortOptions;
import com.useit.jact.model.misdnconf.MisdnPorts;

/**
 * <p>
 * MisdnPortsDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:07 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnPortsDataPanel.java,v 1.6 2005/12/29
 *          19:14:19 urs Exp $
 */
public class MisdnPortsDataPanel extends SimpleDataObjectPanel {
    protected MisdnPorts dataObject;

    // protected MisdnPortsChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnPortsDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnPortsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnPortsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnPortsResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * MisdnPortsCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fJEnumComboboxMisdnPortOptionsportOption, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (2) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelportN(), null); // Generated
        this.add(getJPanelportOption(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fIntegerTextFieldportN.getDocument().addDocumentListener(textChangeAct);
        fJEnumComboboxMisdnPortOptionsportOption.getDocument()
                .addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fIntegerTextFieldportN.setValue(dataObject.getPortN());
        fJEnumComboboxMisdnPortOptionsportOption.setValue(dataObject
                .getPortOption());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setPortN(fIntegerTextFieldportN.getValue());
        dataObject.setPortOption(fJEnumComboboxMisdnPortOptionsportOption
                .getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param MisdnPorts
     */
    public void setDataObject(Object aMisdnPorts) {
        // abstractdataObject = (AbstractConfigObject) aMisdnPorts;
        setDataObject((MisdnPorts) aMisdnPorts);
        // dataObject = aMisdnPorts;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param MisdnPorts
     */
    public void setDataObject(MisdnPorts aMisdnPorts) {
        // abstractdataObject = (AbstractConfigObject) aMisdnPorts;
        dataObject = aMisdnPorts;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected IntegerTextField fIntegerTextFieldportN;

    protected javax.swing.JLabel fJLabelportN;

    protected javax.swing.JPanel fJPanelportN;

    protected JEnumComboboxMisdnPortOptions fJEnumComboboxMisdnPortOptionsportOption;

    protected javax.swing.JLabel fJLabelportOption;

    protected javax.swing.JPanel fJPanelportOption;

    // start DB field portN
    /**
     * This method initializes fIntegerTextFieldportN
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldportN() {
        if (fIntegerTextFieldportN == null) {
            try {
                fIntegerTextFieldportN = new IntegerTextField(); // Generated
                fIntegerTextFieldportN.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldportN;
    }

    /**
     * This method initializes fJLabelportN
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelportN() {
        if (fJLabelportN == null) {
            try {
                fJLabelportN = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelportN.setText(resBundel
                        .getString("res_strportNDisplayName")); // Generated
                fJLabelportN.setToolTipText(resBundel
                        .getString("res_strportNDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelportN;
    }

    /**
     * This method initializes fJPanelportN
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelportN() {
        if (fJPanelportN == null) {
            try {
                fJPanelportN = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelportN.setLayout(layFlowLayout); // Generated
                fJPanelportN.add(getJLabelportN(), null); // Generated
                fJPanelportN.add(getIntegerTextFieldportN(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelportN;
    }

    // end DB field portN
    // start DB field portOption
    /**
     * This method initializes fJEnumComboboxMisdnPortOptionsportOption
     * 
     * @return JEnumComboboxMisdnPortOptions
     */
    public JEnumComboboxMisdnPortOptions getJEnumComboboxMisdnPortOptionsportOption() {
        if (fJEnumComboboxMisdnPortOptionsportOption == null) {
            try {
                fJEnumComboboxMisdnPortOptionsportOption = new JEnumComboboxMisdnPortOptions(); // Generated
                fJEnumComboboxMisdnPortOptionsportOption
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxMisdnPortOptionsportOption;
    }

    /**
     * This method initializes fJLabelportOption
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelportOption() {
        if (fJLabelportOption == null) {
            try {
                fJLabelportOption = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelportOption.setText(resBundel
                        .getString("res_strportOptionDisplayName")); // Generated
                fJLabelportOption.setToolTipText(resBundel
                        .getString("res_strportOptionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelportOption;
    }

    /**
     * This method initializes fJPanelportOption
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelportOption() {
        if (fJPanelportOption == null) {
            try {
                fJPanelportOption = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelportOption.setLayout(layFlowLayout); // Generated
                fJPanelportOption.add(getJLabelportOption(), null); // Generated
                fJPanelportOption.add(
                        getJEnumComboboxMisdnPortOptionsportOption(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelportOption;
    }
    // end DB field portOption

}
