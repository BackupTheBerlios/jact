package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zapataconf.Caller_ID_Options;

/**
 * <p>
 * Caller_ID_OptionsDataPanel
 * </p>
 * Created : Thu Dec 29 12:23:14 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Caller_ID_OptionsDataPanel.java,v 1.5
 *          2005/12/29 19:14:06 urs Exp $
 */
public class Caller_ID_OptionsDataPanel extends SimpleDataObjectPanel {
    protected Caller_ID_Options dataObject;

    // protected Caller_ID_OptionsChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Caller_ID_OptionsDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getCaller_ID_OptionsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getCaller_ID_OptionsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Caller_ID_OptionsResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * Caller_ID_OptionsCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldcallerid, fCustomCheckBoxusecallerid,
     * fCustomCheckBoxhidecallerid, fCustomCheckBoxrestrictcid,
     * fCustomCheckBoxusecallingpres, }; dataChecker.initChecker(array); }
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
        this.add(getJPanelcallerid(), null); // Generated
        this.add(getJPanelusecallerid(), null); // Generated
        this.add(getJPanelhidecallerid(), null); // Generated
        this.add(getJPanelrestrictcid(), null); // Generated
        this.add(getJPanelusecallingpres(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldcallerid.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxusecallerid.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxhidecallerid.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxrestrictcid.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxusecallingpres.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldcallerid.setValue(dataObject.getCallerid());
        fCustomCheckBoxusecallerid.setValue(dataObject.getUsecallerid());
        fCustomCheckBoxhidecallerid.setValue(dataObject.getHidecallerid());
        fCustomCheckBoxrestrictcid.setValue(dataObject.getRestrictcid());
        fCustomCheckBoxusecallingpres.setValue(dataObject.getUsecallingpres());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setCallerid(fStringTextFieldcallerid.getValue());
        dataObject.setUsecallerid(fCustomCheckBoxusecallerid.getValue());
        dataObject.setHidecallerid(fCustomCheckBoxhidecallerid.getValue());
        dataObject.setRestrictcid(fCustomCheckBoxrestrictcid.getValue());
        dataObject.setUsecallingpres(fCustomCheckBoxusecallingpres.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Caller_ID_Options
     */
    public void setDataObject(Object aCaller_ID_Options) {
        // abstractdataObject = (AbstractConfigObject) aCaller_ID_Options;
        setDataObject((Caller_ID_Options) aCaller_ID_Options);
        // dataObject = aCaller_ID_Options;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Caller_ID_Options
     */
    public void setDataObject(Caller_ID_Options aCaller_ID_Options) {
        // abstractdataObject = (AbstractConfigObject) aCaller_ID_Options;
        dataObject = aCaller_ID_Options;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcallerid;

    protected javax.swing.JLabel fJLabelcallerid;

    protected javax.swing.JPanel fJPanelcallerid;

    protected CustomCheckBox fCustomCheckBoxusecallerid;

    protected javax.swing.JLabel fJLabelusecallerid;

    protected javax.swing.JPanel fJPanelusecallerid;

    protected CustomCheckBox fCustomCheckBoxhidecallerid;

    protected javax.swing.JLabel fJLabelhidecallerid;

    protected javax.swing.JPanel fJPanelhidecallerid;

    protected CustomCheckBox fCustomCheckBoxrestrictcid;

    protected javax.swing.JLabel fJLabelrestrictcid;

    protected javax.swing.JPanel fJPanelrestrictcid;

    protected CustomCheckBox fCustomCheckBoxusecallingpres;

    protected javax.swing.JLabel fJLabelusecallingpres;

    protected javax.swing.JPanel fJPanelusecallingpres;

    // start DB field callerid
    /**
     * This method initializes fStringTextFieldcallerid
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcallerid() {
        if (fStringTextFieldcallerid == null) {
            try {
                fStringTextFieldcallerid = new StringTextField(); // Generated
                fStringTextFieldcallerid
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcallerid;
    }

    /**
     * This method initializes fJLabelcallerid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcallerid() {
        if (fJLabelcallerid == null) {
            try {
                fJLabelcallerid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcallerid.setText(resBundel
                        .getString("res_strcalleridDisplayName")); // Generated
                fJLabelcallerid.setToolTipText(resBundel
                        .getString("res_strcalleridDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcallerid;
    }

    /**
     * This method initializes fJPanelcallerid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcallerid() {
        if (fJPanelcallerid == null) {
            try {
                fJPanelcallerid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcallerid.setLayout(layFlowLayout); // Generated
                fJPanelcallerid.add(getJLabelcallerid(), null); // Generated
                fJPanelcallerid.add(getStringTextFieldcallerid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcallerid;
    }

    // end DB field callerid
    // start DB field usecallerid
    /**
     * This method initializes fCustomCheckBoxusecallerid
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxusecallerid() {
        if (fCustomCheckBoxusecallerid == null) {
            try {
                fCustomCheckBoxusecallerid = new CustomCheckBox(); // Generated
                fCustomCheckBoxusecallerid
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxusecallerid;
    }

    /**
     * This method initializes fJLabelusecallerid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelusecallerid() {
        if (fJLabelusecallerid == null) {
            try {
                fJLabelusecallerid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelusecallerid.setText(resBundel
                        .getString("res_strusecalleridDisplayName")); // Generated
                fJLabelusecallerid.setToolTipText(resBundel
                        .getString("res_strusecalleridDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelusecallerid;
    }

    /**
     * This method initializes fJPanelusecallerid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelusecallerid() {
        if (fJPanelusecallerid == null) {
            try {
                fJPanelusecallerid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelusecallerid.setLayout(layFlowLayout); // Generated
                fJPanelusecallerid.add(getJLabelusecallerid(), null); // Generated
                fJPanelusecallerid.add(getCustomCheckBoxusecallerid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelusecallerid;
    }

    // end DB field usecallerid
    // start DB field hidecallerid
    /**
     * This method initializes fCustomCheckBoxhidecallerid
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxhidecallerid() {
        if (fCustomCheckBoxhidecallerid == null) {
            try {
                fCustomCheckBoxhidecallerid = new CustomCheckBox(); // Generated
                fCustomCheckBoxhidecallerid
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxhidecallerid;
    }

    /**
     * This method initializes fJLabelhidecallerid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelhidecallerid() {
        if (fJLabelhidecallerid == null) {
            try {
                fJLabelhidecallerid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelhidecallerid.setText(resBundel
                        .getString("res_strhidecalleridDisplayName")); // Generated
                fJLabelhidecallerid.setToolTipText(resBundel
                        .getString("res_strhidecalleridDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelhidecallerid;
    }

    /**
     * This method initializes fJPanelhidecallerid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelhidecallerid() {
        if (fJPanelhidecallerid == null) {
            try {
                fJPanelhidecallerid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelhidecallerid.setLayout(layFlowLayout); // Generated
                fJPanelhidecallerid.add(getJLabelhidecallerid(), null); // Generated
                fJPanelhidecallerid.add(getCustomCheckBoxhidecallerid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelhidecallerid;
    }

    // end DB field hidecallerid
    // start DB field restrictcid
    /**
     * This method initializes fCustomCheckBoxrestrictcid
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxrestrictcid() {
        if (fCustomCheckBoxrestrictcid == null) {
            try {
                fCustomCheckBoxrestrictcid = new CustomCheckBox(); // Generated
                fCustomCheckBoxrestrictcid
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxrestrictcid;
    }

    /**
     * This method initializes fJLabelrestrictcid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrestrictcid() {
        if (fJLabelrestrictcid == null) {
            try {
                fJLabelrestrictcid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrestrictcid.setText(resBundel
                        .getString("res_strrestrictcidDisplayName")); // Generated
                fJLabelrestrictcid.setToolTipText(resBundel
                        .getString("res_strrestrictcidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrestrictcid;
    }

    /**
     * This method initializes fJPanelrestrictcid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrestrictcid() {
        if (fJPanelrestrictcid == null) {
            try {
                fJPanelrestrictcid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrestrictcid.setLayout(layFlowLayout); // Generated
                fJPanelrestrictcid.add(getJLabelrestrictcid(), null); // Generated
                fJPanelrestrictcid.add(getCustomCheckBoxrestrictcid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrestrictcid;
    }

    // end DB field restrictcid
    // start DB field usecallingpres
    /**
     * This method initializes fCustomCheckBoxusecallingpres
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxusecallingpres() {
        if (fCustomCheckBoxusecallingpres == null) {
            try {
                fCustomCheckBoxusecallingpres = new CustomCheckBox(); // Generated
                fCustomCheckBoxusecallingpres
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxusecallingpres;
    }

    /**
     * This method initializes fJLabelusecallingpres
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelusecallingpres() {
        if (fJLabelusecallingpres == null) {
            try {
                fJLabelusecallingpres = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelusecallingpres.setText(resBundel
                        .getString("res_strusecallingpresDisplayName")); // Generated
                fJLabelusecallingpres.setToolTipText(resBundel
                        .getString("res_strusecallingpresDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelusecallingpres;
    }

    /**
     * This method initializes fJPanelusecallingpres
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelusecallingpres() {
        if (fJPanelusecallingpres == null) {
            try {
                fJPanelusecallingpres = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelusecallingpres.setLayout(layFlowLayout); // Generated
                fJPanelusecallingpres.add(getJLabelusecallingpres(), null); // Generated
                fJPanelusecallingpres.add(getCustomCheckBoxusecallingpres(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelusecallingpres;
    }
    // end DB field usecallingpres

}
