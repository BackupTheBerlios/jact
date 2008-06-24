package com.useit.jact.gui.indicationsconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.indicationsconf.CustomTone;

/**
 * <p>
 * CustomToneDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:21 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: CustomToneDataPanel.java,v 1.4 2005/12/29
 *          19:14:12 urs Exp $
 */
public class CustomToneDataPanel extends SimpleDataObjectPanel {
    protected CustomTone dataObject;

    // protected CustomToneChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public CustomToneDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getCustomToneResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getCustomToneResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/CustomToneResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * CustomToneCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldtonecode, fStringTextFieldname, };
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
        this.add(getJPaneltonecode(), null); // Generated
        this.add(getJPanelname(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldtonecode.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldname.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldtonecode.setValue(dataObject.getTonecode());
        fStringTextFieldname.setValue(dataObject.getName());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setTonecode(fStringTextFieldtonecode.getValue());
        dataObject.setName(fStringTextFieldname.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param CustomTone
     */
    public void setDataObject(Object aCustomTone) {
        // abstractdataObject = (AbstractConfigObject) aCustomTone;
        setDataObject((CustomTone) aCustomTone);
        // dataObject = aCustomTone;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param CustomTone
     */
    public void setDataObject(CustomTone aCustomTone) {
        // abstractdataObject = (AbstractConfigObject) aCustomTone;
        dataObject = aCustomTone;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtonecode;

    protected javax.swing.JLabel fJLabeltonecode;

    protected javax.swing.JPanel fJPaneltonecode;

    protected StringTextField fStringTextFieldname;

    protected javax.swing.JLabel fJLabelname;

    protected javax.swing.JPanel fJPanelname;

    // start DB field tonecode
    /**
     * This method initializes fStringTextFieldtonecode
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtonecode() {
        if (fStringTextFieldtonecode == null) {
            try {
                fStringTextFieldtonecode = new StringTextField(); // Generated
                fStringTextFieldtonecode
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtonecode;
    }

    /**
     * This method initializes fJLabeltonecode
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltonecode() {
        if (fJLabeltonecode == null) {
            try {
                fJLabeltonecode = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltonecode.setText(resBundel
                        .getString("res_strtonecodeDisplayName")); // Generated
                fJLabeltonecode.setToolTipText(resBundel
                        .getString("res_strtonecodeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltonecode;
    }

    /**
     * This method initializes fJPaneltonecode
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltonecode() {
        if (fJPaneltonecode == null) {
            try {
                fJPaneltonecode = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltonecode.setLayout(layFlowLayout); // Generated
                fJPaneltonecode.add(getJLabeltonecode(), null); // Generated
                fJPaneltonecode.add(getStringTextFieldtonecode(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltonecode;
    }

    // end DB field tonecode
    // start DB field name
    /**
     * This method initializes fStringTextFieldname
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldname() {
        if (fStringTextFieldname == null) {
            try {
                fStringTextFieldname = new StringTextField(); // Generated
                fStringTextFieldname.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldname;
    }

    /**
     * This method initializes fJLabelname
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelname() {
        if (fJLabelname == null) {
            try {
                fJLabelname = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelname.setText(resBundel
                        .getString("res_strnameDisplayName")); // Generated
                fJLabelname.setToolTipText(resBundel
                        .getString("res_strnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelname;
    }

    /**
     * This method initializes fJPanelname
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelname() {
        if (fJPanelname == null) {
            try {
                fJPanelname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelname.setLayout(layFlowLayout); // Generated
                fJPanelname.add(getJLabelname(), null); // Generated
                fJPanelname.add(getStringTextFieldname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelname;
    }
    // end DB field name

}
