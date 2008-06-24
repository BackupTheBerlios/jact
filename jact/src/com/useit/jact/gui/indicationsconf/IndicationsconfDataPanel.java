package com.useit.jact.gui.indicationsconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.indicationsconf.Indicationsconf;

/**
 * <p>
 * IndicationsconfDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:22 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IndicationsconfDataPanel.java,v 1.4
 *          2005/12/29 19:14:12 urs Exp $
 */
public class IndicationsconfDataPanel extends SimpleDataObjectPanel {
    protected Indicationsconf dataObject;

    // protected IndicationsconfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IndicationsconfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIndicationsconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIndicationsconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IndicationsconfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * IndicationsconfCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldcountry, };
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
        this.add(getJPanelcountry(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldcountry.getDocument()
                .addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldcountry.setValue(dataObject.getCountry());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setCountry(fStringTextFieldcountry.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Indicationsconf
     */
    public void setDataObject(Object aIndicationsconf) {
        // abstractdataObject = (AbstractConfigObject) aIndicationsconf;
        setDataObject((Indicationsconf) aIndicationsconf);
        // dataObject = aIndicationsconf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Indicationsconf
     */
    public void setDataObject(Indicationsconf aIndicationsconf) {
        // abstractdataObject = (AbstractConfigObject) aIndicationsconf;
        dataObject = aIndicationsconf;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcountry;

    protected javax.swing.JLabel fJLabelcountry;

    protected javax.swing.JPanel fJPanelcountry;

    // start DB field country
    /**
     * This method initializes fStringTextFieldcountry
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcountry() {
        if (fStringTextFieldcountry == null) {
            try {
                fStringTextFieldcountry = new StringTextField(); // Generated
                fStringTextFieldcountry
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcountry;
    }

    /**
     * This method initializes fJLabelcountry
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcountry() {
        if (fJLabelcountry == null) {
            try {
                fJLabelcountry = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcountry.setText(resBundel
                        .getString("res_strcountryDisplayName")); // Generated
                fJLabelcountry.setToolTipText(resBundel
                        .getString("res_strcountryDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcountry;
    }

    /**
     * This method initializes fJPanelcountry
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcountry() {
        if (fJPanelcountry == null) {
            try {
                fJPanelcountry = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcountry.setLayout(layFlowLayout); // Generated
                fJPanelcountry.add(getJLabelcountry(), null); // Generated
                fJPanelcountry.add(getStringTextFieldcountry(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcountry;
    }
    // end DB field country

}
