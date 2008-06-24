package com.useit.jact.gui.misdnconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.misdnconf.MisdnCryptkey;

/**
 * <p>
 * MisdnCryptkeyDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:05 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCryptkeyDataPanel.java,v 1.7 2005/12/29
 *          19:14:19 urs Exp $
 */
public class MisdnCryptkeyDataPanel extends SimpleDataObjectPanel {
    protected MisdnCryptkey dataObject;

    // protected MisdnCryptkeyChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnCryptkeyDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnCryptkeyResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnCryptkeyResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnCryptkeyResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * MisdnCryptkeyCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldkeyname, fStringTextFieldkeyvalue, };
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
        this.add(getJPanelkeyname(), null); // Generated
        this.add(getJPanelkeyvalue(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldkeyname.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldkeyvalue.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldkeyname.setValue(dataObject.getKeyname());
        fStringTextFieldkeyvalue.setValue(dataObject.getKeyvalue());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setKeyname(fStringTextFieldkeyname.getValue());
        dataObject.setKeyvalue(fStringTextFieldkeyvalue.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param MisdnCryptkey
     */
    public void setDataObject(Object aMisdnCryptkey) {
        // abstractdataObject = (AbstractConfigObject) aMisdnCryptkey;
        setDataObject((MisdnCryptkey) aMisdnCryptkey);
        // dataObject = aMisdnCryptkey;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param MisdnCryptkey
     */
    public void setDataObject(MisdnCryptkey aMisdnCryptkey) {
        // abstractdataObject = (AbstractConfigObject) aMisdnCryptkey;
        dataObject = aMisdnCryptkey;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldkeyname;

    protected javax.swing.JLabel fJLabelkeyname;

    protected javax.swing.JPanel fJPanelkeyname;

    protected StringTextField fStringTextFieldkeyvalue;

    protected javax.swing.JLabel fJLabelkeyvalue;

    protected javax.swing.JPanel fJPanelkeyvalue;

    // start DB field keyname
    /**
     * This method initializes fStringTextFieldkeyname
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldkeyname() {
        if (fStringTextFieldkeyname == null) {
            try {
                fStringTextFieldkeyname = new StringTextField(); // Generated
                fStringTextFieldkeyname
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldkeyname;
    }

    /**
     * This method initializes fJLabelkeyname
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelkeyname() {
        if (fJLabelkeyname == null) {
            try {
                fJLabelkeyname = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelkeyname.setText(resBundel
                        .getString("res_strkeynameDisplayName")); // Generated
                fJLabelkeyname.setToolTipText(resBundel
                        .getString("res_strkeynameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelkeyname;
    }

    /**
     * This method initializes fJPanelkeyname
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelkeyname() {
        if (fJPanelkeyname == null) {
            try {
                fJPanelkeyname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelkeyname.setLayout(layFlowLayout); // Generated
                fJPanelkeyname.add(getJLabelkeyname(), null); // Generated
                fJPanelkeyname.add(getStringTextFieldkeyname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelkeyname;
    }

    // end DB field keyname
    // start DB field keyvalue
    /**
     * This method initializes fStringTextFieldkeyvalue
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldkeyvalue() {
        if (fStringTextFieldkeyvalue == null) {
            try {
                fStringTextFieldkeyvalue = new StringTextField(); // Generated
                fStringTextFieldkeyvalue
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldkeyvalue;
    }

    /**
     * This method initializes fJLabelkeyvalue
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelkeyvalue() {
        if (fJLabelkeyvalue == null) {
            try {
                fJLabelkeyvalue = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelkeyvalue.setText(resBundel
                        .getString("res_strkeyvalueDisplayName")); // Generated
                fJLabelkeyvalue.setToolTipText(resBundel
                        .getString("res_strkeyvalueDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelkeyvalue;
    }

    /**
     * This method initializes fJPanelkeyvalue
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelkeyvalue() {
        if (fJPanelkeyvalue == null) {
            try {
                fJPanelkeyvalue = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelkeyvalue.setLayout(layFlowLayout); // Generated
                fJPanelkeyvalue.add(getJLabelkeyvalue(), null); // Generated
                fJPanelkeyvalue.add(getStringTextFieldkeyvalue(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelkeyvalue;
    }
    // end DB field keyvalue

}
