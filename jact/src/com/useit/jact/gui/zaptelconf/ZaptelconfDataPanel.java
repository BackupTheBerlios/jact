package com.useit.jact.gui.zaptelconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zaptelconf.Zaptelconf;

/**
 * <p>
 * ZaptelconfDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:02 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelconfDataPanel.java,v 1.5 2005/12/29
 *          19:14:24 urs Exp $
 */
public class ZaptelconfDataPanel extends SimpleDataObjectPanel {
    protected Zaptelconf dataObject;

    // protected ZaptelconfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZaptelconfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZaptelconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZaptelconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZaptelconfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ZaptelconfCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFielddefaultzone, };
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
        this.add(getJPaneldefaultzone(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFielddefaultzone.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFielddefaultzone.setValue(dataObject.getDefaultzone());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setDefaultzone(fStringTextFielddefaultzone.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zaptelconf
     */
    public void setDataObject(Object aZaptelconf) {
        // abstractdataObject = (AbstractConfigObject) aZaptelconf;
        setDataObject((Zaptelconf) aZaptelconf);
        // dataObject = aZaptelconf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zaptelconf
     */
    public void setDataObject(Zaptelconf aZaptelconf) {
        // abstractdataObject = (AbstractConfigObject) aZaptelconf;
        dataObject = aZaptelconf;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFielddefaultzone;

    protected javax.swing.JLabel fJLabeldefaultzone;

    protected javax.swing.JPanel fJPaneldefaultzone;

    // start DB field defaultzone
    /**
     * This method initializes fStringTextFielddefaultzone
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddefaultzone() {
        if (fStringTextFielddefaultzone == null) {
            try {
                fStringTextFielddefaultzone = new StringTextField(); // Generated
                fStringTextFielddefaultzone
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddefaultzone;
    }

    /**
     * This method initializes fJLabeldefaultzone
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldefaultzone() {
        if (fJLabeldefaultzone == null) {
            try {
                fJLabeldefaultzone = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldefaultzone.setText(resBundel
                        .getString("res_strdefaultzoneDisplayName")); // Generated
                fJLabeldefaultzone.setToolTipText(resBundel
                        .getString("res_strdefaultzoneDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldefaultzone;
    }

    /**
     * This method initializes fJPaneldefaultzone
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldefaultzone() {
        if (fJPaneldefaultzone == null) {
            try {
                fJPaneldefaultzone = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldefaultzone.setLayout(layFlowLayout); // Generated
                fJPaneldefaultzone.add(getJLabeldefaultzone(), null); // Generated
                fJPaneldefaultzone.add(getStringTextFielddefaultzone(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldefaultzone;
    }
    // end DB field defaultzone

}
