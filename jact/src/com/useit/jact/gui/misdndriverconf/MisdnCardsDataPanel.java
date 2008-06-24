package com.useit.jact.gui.misdndriverconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.EnumSetTextFieldMCardOption;
import com.useit.jact.gui.widgets.JEnumComboboxMisdnCardTypes;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.misdndriverconf.MisdnCards;

/**
 * <p>
 * MisdnCardsDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:46 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCardsDataPanel.java,v 1.3 2005/12/29
 *          19:14:20 urs Exp $
 */
public class MisdnCardsDataPanel extends SimpleDataObjectPanel {
    protected MisdnCards dataObject;

    // protected MisdnCardsChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnCardsDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnCardsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnCardsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnCardsResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * MisdnCardsCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fJEnumComboboxMisdnCardTypescardType,
     * fEnumSetTextFieldMCardOptioncardOptions, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (3) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelcardName(), null); // Generated
        this.add(getJPanelcardType(), null); // Generated
        this.add(getJPanelcardOptions(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldcardName.getDocument().addDocumentListener(
                textChangeAct);
        fJEnumComboboxMisdnCardTypescardType.getDocument().addDocumentListener(
                textChangeAct);
        fEnumSetTextFieldMCardOptioncardOptions.getDocument()
                .addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldcardName.setValue(dataObject.getCardName());
        fJEnumComboboxMisdnCardTypescardType.setValue(dataObject.getCardType());
        fEnumSetTextFieldMCardOptioncardOptions.setValue(dataObject
                .getCardOptions());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setCardName(fStringTextFieldcardName.getValue());
        dataObject.setCardType(fJEnumComboboxMisdnCardTypescardType.getValue());
        dataObject.setCardOptions(fEnumSetTextFieldMCardOptioncardOptions
                .getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param MisdnCards
     */
    public void setDataObject(Object aMisdnCards) {
        // abstractdataObject = (AbstractConfigObject) aMisdnCards;
        setDataObject((MisdnCards) aMisdnCards);
        // dataObject = aMisdnCards;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param MisdnCards
     */
    public void setDataObject(MisdnCards aMisdnCards) {
        // abstractdataObject = (AbstractConfigObject) aMisdnCards;
        dataObject = aMisdnCards;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcardName;

    protected javax.swing.JLabel fJLabelcardName;

    protected javax.swing.JPanel fJPanelcardName;

    protected JEnumComboboxMisdnCardTypes fJEnumComboboxMisdnCardTypescardType;

    protected javax.swing.JLabel fJLabelcardType;

    protected javax.swing.JPanel fJPanelcardType;

    protected EnumSetTextFieldMCardOption fEnumSetTextFieldMCardOptioncardOptions;

    protected javax.swing.JLabel fJLabelcardOptions;

    protected javax.swing.JPanel fJPanelcardOptions;

    // start DB field cardName
    /**
     * This method initializes fStringTextFieldcardName
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcardName() {
        if (fStringTextFieldcardName == null) {
            try {
                fStringTextFieldcardName = new StringTextField(); // Generated
                fStringTextFieldcardName
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcardName;
    }

    /**
     * This method initializes fJLabelcardName
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcardName() {
        if (fJLabelcardName == null) {
            try {
                fJLabelcardName = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcardName.setText(resBundel
                        .getString("res_strcardNameDisplayName")); // Generated
                fJLabelcardName.setToolTipText(resBundel
                        .getString("res_strcardNameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcardName;
    }

    /**
     * This method initializes fJPanelcardName
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcardName() {
        if (fJPanelcardName == null) {
            try {
                fJPanelcardName = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcardName.setLayout(layFlowLayout); // Generated
                fJPanelcardName.add(getJLabelcardName(), null); // Generated
                fJPanelcardName.add(getStringTextFieldcardName(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcardName;
    }

    // end DB field cardName
    // start DB field cardType
    /**
     * This method initializes fJEnumComboboxMisdnCardTypescardType
     * 
     * @return JEnumComboboxMisdnCardTypes
     */
    public JEnumComboboxMisdnCardTypes getJEnumComboboxMisdnCardTypescardType() {
        if (fJEnumComboboxMisdnCardTypescardType == null) {
            try {
                fJEnumComboboxMisdnCardTypescardType = new JEnumComboboxMisdnCardTypes(); // Generated
                fJEnumComboboxMisdnCardTypescardType
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxMisdnCardTypescardType;
    }

    /**
     * This method initializes fJLabelcardType
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcardType() {
        if (fJLabelcardType == null) {
            try {
                fJLabelcardType = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcardType.setText(resBundel
                        .getString("res_strcardTypeDisplayName")); // Generated
                fJLabelcardType.setToolTipText(resBundel
                        .getString("res_strcardTypeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcardType;
    }

    /**
     * This method initializes fJPanelcardType
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcardType() {
        if (fJPanelcardType == null) {
            try {
                fJPanelcardType = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcardType.setLayout(layFlowLayout); // Generated
                fJPanelcardType.add(getJLabelcardType(), null); // Generated
                fJPanelcardType.add(getJEnumComboboxMisdnCardTypescardType(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcardType;
    }

    // end DB field cardType
    // start DB field cardOptions
    /**
     * This method initializes fEnumSetTextFieldMCardOptioncardOptions
     * 
     * @return EnumSetTextFieldMCardOption
     */
    public EnumSetTextFieldMCardOption getEnumSetTextFieldMCardOptioncardOptions() {
        if (fEnumSetTextFieldMCardOptioncardOptions == null) {
            try {
                fEnumSetTextFieldMCardOptioncardOptions = new EnumSetTextFieldMCardOption(); // Generated
                fEnumSetTextFieldMCardOptioncardOptions
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fEnumSetTextFieldMCardOptioncardOptions;
    }

    /**
     * This method initializes fJLabelcardOptions
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcardOptions() {
        if (fJLabelcardOptions == null) {
            try {
                fJLabelcardOptions = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcardOptions.setText(resBundel
                        .getString("res_strcardOptionsDisplayName")); // Generated
                fJLabelcardOptions.setToolTipText(resBundel
                        .getString("res_strcardOptionsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcardOptions;
    }

    /**
     * This method initializes fJPanelcardOptions
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcardOptions() {
        if (fJPanelcardOptions == null) {
            try {
                fJPanelcardOptions = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcardOptions.setLayout(layFlowLayout); // Generated
                fJPanelcardOptions.add(getJLabelcardOptions(), null); // Generated
                fJPanelcardOptions.add(
                        getEnumSetTextFieldMCardOptioncardOptions(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcardOptions;
    }
    // end DB field cardOptions

}
