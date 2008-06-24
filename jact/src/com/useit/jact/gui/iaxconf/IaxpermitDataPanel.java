package com.useit.jact.gui.iaxconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.iaxconf.Iaxpermit;

/**
 * <p>
 * IaxpermitDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:36 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxpermitDataPanel.java,v 1.4 2005/12/29
 *          19:14:15 urs Exp $
 */
public class IaxpermitDataPanel extends SimpleDataObjectPanel {
    protected Iaxpermit dataObject;

    // protected IaxpermitChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IaxpermitDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIaxpermitResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIaxpermitResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IaxpermitResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * IaxpermitCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldvalue, };
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
        layGridLayout.setColumns(1);
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelvalue(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldvalue.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldvalue.setValue(dataObject.getValue());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setValue(fStringTextFieldvalue.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Iaxpermit
     */
    public void setDataObject(Object aIaxpermit) {
        // abstractdataObject = (AbstractConfigObject) aIaxpermit;
        setDataObject((Iaxpermit) aIaxpermit);
        // dataObject = aIaxpermit;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Iaxpermit
     */
    public void setDataObject(Iaxpermit aIaxpermit) {
        // abstractdataObject = (AbstractConfigObject) aIaxpermit;
        dataObject = aIaxpermit;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldvalue;

    protected javax.swing.JLabel fJLabelvalue;

    protected javax.swing.JPanel fJPanelvalue;

    // start DB field value
    /**
     * This method initializes fStringTextFieldvalue
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvalue() {
        if (fStringTextFieldvalue == null) {
            try {
                fStringTextFieldvalue = new StringTextField(); // Generated
                fStringTextFieldvalue.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvalue;
    }

    /**
     * This method initializes fJLabelvalue
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvalue() {
        if (fJLabelvalue == null) {
            try {
                fJLabelvalue = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelvalue.setText(resBundel
                        .getString("res_strvalueDisplayName")); // Generated
                fJLabelvalue.setToolTipText(resBundel
                        .getString("res_strvalueDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelvalue;
    }

    /**
     * This method initializes fJPanelvalue
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvalue() {
        if (fJPanelvalue == null) {
            try {
                fJPanelvalue = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvalue.setLayout(layFlowLayout); // Generated
                fJPanelvalue.add(getJLabelvalue(), null); // Generated
                fJPanelvalue.add(getStringTextFieldvalue(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvalue;
    }
    // end DB field value

}
