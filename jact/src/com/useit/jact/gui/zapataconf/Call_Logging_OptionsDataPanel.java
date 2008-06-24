package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zapataconf.Call_Logging_Options;

/**
 * <p>
 * Call_Logging_OptionsDataPanel
 * </p>
 * Created : Thu Dec 29 12:23:13 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Call_Logging_OptionsDataPanel.java,v 1.5
 *          2005/12/29 19:14:06 urs Exp $
 */
public class Call_Logging_OptionsDataPanel extends SimpleDataObjectPanel {
    protected Call_Logging_Options dataObject;

    // protected Call_Logging_OptionsChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Call_Logging_OptionsDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getCall_Logging_OptionsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getCall_Logging_OptionsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Call_Logging_OptionsResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * Call_Logging_OptionsCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldaccountcode, fStringTextFieldamaflags, };
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
        this.add(getJPanelaccountcode(), null); // Generated
        this.add(getJPanelamaflags(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldaccountcode.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldamaflags.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldaccountcode.setValue(dataObject.getAccountcode());
        fStringTextFieldamaflags.setValue(dataObject.getAmaflags());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setAccountcode(fStringTextFieldaccountcode.getValue());
        dataObject.setAmaflags(fStringTextFieldamaflags.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Call_Logging_Options
     */
    public void setDataObject(Object aCall_Logging_Options) {
        // abstractdataObject = (AbstractConfigObject) aCall_Logging_Options;
        setDataObject((Call_Logging_Options) aCall_Logging_Options);
        // dataObject = aCall_Logging_Options;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Call_Logging_Options
     */
    public void setDataObject(Call_Logging_Options aCall_Logging_Options) {
        // abstractdataObject = (AbstractConfigObject) aCall_Logging_Options;
        dataObject = aCall_Logging_Options;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldaccountcode;

    protected javax.swing.JLabel fJLabelaccountcode;

    protected javax.swing.JPanel fJPanelaccountcode;

    protected StringTextField fStringTextFieldamaflags;

    protected javax.swing.JLabel fJLabelamaflags;

    protected javax.swing.JPanel fJPanelamaflags;

    // start DB field accountcode
    /**
     * This method initializes fStringTextFieldaccountcode
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldaccountcode() {
        if (fStringTextFieldaccountcode == null) {
            try {
                fStringTextFieldaccountcode = new StringTextField(); // Generated
                fStringTextFieldaccountcode
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldaccountcode;
    }

    /**
     * This method initializes fJLabelaccountcode
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelaccountcode() {
        if (fJLabelaccountcode == null) {
            try {
                fJLabelaccountcode = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelaccountcode.setText(resBundel
                        .getString("res_straccountcodeDisplayName")); // Generated
                fJLabelaccountcode.setToolTipText(resBundel
                        .getString("res_straccountcodeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelaccountcode;
    }

    /**
     * This method initializes fJPanelaccountcode
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelaccountcode() {
        if (fJPanelaccountcode == null) {
            try {
                fJPanelaccountcode = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelaccountcode.setLayout(layFlowLayout); // Generated
                fJPanelaccountcode.add(getJLabelaccountcode(), null); // Generated
                fJPanelaccountcode.add(getStringTextFieldaccountcode(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelaccountcode;
    }

    // end DB field accountcode
    // start DB field amaflags
    /**
     * This method initializes fStringTextFieldamaflags
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldamaflags() {
        if (fStringTextFieldamaflags == null) {
            try {
                fStringTextFieldamaflags = new StringTextField(); // Generated
                fStringTextFieldamaflags
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldamaflags;
    }

    /**
     * This method initializes fJLabelamaflags
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelamaflags() {
        if (fJLabelamaflags == null) {
            try {
                fJLabelamaflags = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelamaflags.setText(resBundel
                        .getString("res_stramaflagsDisplayName")); // Generated
                fJLabelamaflags.setToolTipText(resBundel
                        .getString("res_stramaflagsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelamaflags;
    }

    /**
     * This method initializes fJPanelamaflags
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelamaflags() {
        if (fJPanelamaflags == null) {
            try {
                fJPanelamaflags = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelamaflags.setLayout(layFlowLayout); // Generated
                fJPanelamaflags.add(getJLabelamaflags(), null); // Generated
                fJPanelamaflags.add(getStringTextFieldamaflags(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelamaflags;
    }
    // end DB field amaflags

}
