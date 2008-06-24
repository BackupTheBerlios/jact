package com.useit.jact.gui.zaptelconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zaptelconf.Zapteltonezone;

/**
 * <p>
 * ZapteltonezoneDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:00 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapteltonezoneDataPanel.java,v 1.5 2005/12/29
 *          19:14:25 urs Exp $
 */
public class ZapteltonezoneDataPanel extends SimpleDataObjectPanel {
    protected Zapteltonezone dataObject;

    // protected ZapteltonezoneChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZapteltonezoneDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZapteltonezoneResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZapteltonezoneResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZapteltonezoneResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ZapteltonezoneCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldzonename, };
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
        this.add(getJPanelzonename(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldzonename.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldzonename.setValue(dataObject.getZonename());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setZonename(fStringTextFieldzonename.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zapteltonezone
     */
    public void setDataObject(Object aZapteltonezone) {
        // abstractdataObject = (AbstractConfigObject) aZapteltonezone;
        setDataObject((Zapteltonezone) aZapteltonezone);
        // dataObject = aZapteltonezone;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zapteltonezone
     */
    public void setDataObject(Zapteltonezone aZapteltonezone) {
        // abstractdataObject = (AbstractConfigObject) aZapteltonezone;
        dataObject = aZapteltonezone;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldzonename;

    protected javax.swing.JLabel fJLabelzonename;

    protected javax.swing.JPanel fJPanelzonename;

    // start DB field zonename
    /**
     * This method initializes fStringTextFieldzonename
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldzonename() {
        if (fStringTextFieldzonename == null) {
            try {
                fStringTextFieldzonename = new StringTextField(); // Generated
                fStringTextFieldzonename
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldzonename;
    }

    /**
     * This method initializes fJLabelzonename
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelzonename() {
        if (fJLabelzonename == null) {
            try {
                fJLabelzonename = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelzonename.setText(resBundel
                        .getString("res_strzonenameDisplayName")); // Generated
                fJLabelzonename.setToolTipText(resBundel
                        .getString("res_strzonenameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelzonename;
    }

    /**
     * This method initializes fJPanelzonename
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelzonename() {
        if (fJPanelzonename == null) {
            try {
                fJPanelzonename = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelzonename.setLayout(layFlowLayout); // Generated
                fJPanelzonename.add(getJLabelzonename(), null); // Generated
                fJPanelzonename.add(getStringTextFieldzonename(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelzonename;
    }
    // end DB field zonename

}
