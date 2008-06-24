package com.useit.jact.gui.zaptelconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;

/**
 * <p>
 * ZapteldynamicspanDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:01 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapteldynamicspanDataPanel.java,v 1.5
 *          2005/12/29 19:14:24 urs Exp $
 */
public class ZapteldynamicspanDataPanel extends SimpleDataObjectPanel {
    protected Zapteldynamicspan dataObject;

    // protected ZapteldynamicspanChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZapteldynamicspanDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZapteldynamicspanResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZapteldynamicspanResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZapteldynamicspanResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ZapteldynamicspanCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFielddriver, fStringTextFieldaddress,
     * fIntegerTextFieldnumchans, fIntegerTextFieldtiming, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (4) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneldriver(), null); // Generated
        this.add(getJPaneladdress(), null); // Generated
        this.add(getJPanelnumchans(), null); // Generated
        this.add(getJPaneltiming(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFielddriver.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldaddress.getDocument()
                .addDocumentListener(textChangeAct);
        fIntegerTextFieldnumchans.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldtiming.getDocument()
                .addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFielddriver.setValue(dataObject.getDriver());
        fStringTextFieldaddress.setValue(dataObject.getAddress());
        fIntegerTextFieldnumchans.setValue(dataObject.getNumchans());
        fIntegerTextFieldtiming.setValue(dataObject.getTiming());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setDriver(fStringTextFielddriver.getValue());
        dataObject.setAddress(fStringTextFieldaddress.getValue());
        dataObject.setNumchans(fIntegerTextFieldnumchans.getValue());
        dataObject.setTiming(fIntegerTextFieldtiming.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zapteldynamicspan
     */
    public void setDataObject(Object aZapteldynamicspan) {
        // abstractdataObject = (AbstractConfigObject) aZapteldynamicspan;
        setDataObject((Zapteldynamicspan) aZapteldynamicspan);
        // dataObject = aZapteldynamicspan;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zapteldynamicspan
     */
    public void setDataObject(Zapteldynamicspan aZapteldynamicspan) {
        // abstractdataObject = (AbstractConfigObject) aZapteldynamicspan;
        dataObject = aZapteldynamicspan;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFielddriver;

    protected javax.swing.JLabel fJLabeldriver;

    protected javax.swing.JPanel fJPaneldriver;

    protected StringTextField fStringTextFieldaddress;

    protected javax.swing.JLabel fJLabeladdress;

    protected javax.swing.JPanel fJPaneladdress;

    protected IntegerTextField fIntegerTextFieldnumchans;

    protected javax.swing.JLabel fJLabelnumchans;

    protected javax.swing.JPanel fJPanelnumchans;

    protected IntegerTextField fIntegerTextFieldtiming;

    protected javax.swing.JLabel fJLabeltiming;

    protected javax.swing.JPanel fJPaneltiming;

    // start DB field driver
    /**
     * This method initializes fStringTextFielddriver
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddriver() {
        if (fStringTextFielddriver == null) {
            try {
                fStringTextFielddriver = new StringTextField(); // Generated
                fStringTextFielddriver.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddriver;
    }

    /**
     * This method initializes fJLabeldriver
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldriver() {
        if (fJLabeldriver == null) {
            try {
                fJLabeldriver = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldriver.setText(resBundel
                        .getString("res_strdriverDisplayName")); // Generated
                fJLabeldriver.setToolTipText(resBundel
                        .getString("res_strdriverDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldriver;
    }

    /**
     * This method initializes fJPaneldriver
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldriver() {
        if (fJPaneldriver == null) {
            try {
                fJPaneldriver = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldriver.setLayout(layFlowLayout); // Generated
                fJPaneldriver.add(getJLabeldriver(), null); // Generated
                fJPaneldriver.add(getStringTextFielddriver(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldriver;
    }

    // end DB field driver
    // start DB field address
    /**
     * This method initializes fStringTextFieldaddress
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldaddress() {
        if (fStringTextFieldaddress == null) {
            try {
                fStringTextFieldaddress = new StringTextField(); // Generated
                fStringTextFieldaddress
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldaddress;
    }

    /**
     * This method initializes fJLabeladdress
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeladdress() {
        if (fJLabeladdress == null) {
            try {
                fJLabeladdress = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeladdress.setText(resBundel
                        .getString("res_straddressDisplayName")); // Generated
                fJLabeladdress.setToolTipText(resBundel
                        .getString("res_straddressDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeladdress;
    }

    /**
     * This method initializes fJPaneladdress
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneladdress() {
        if (fJPaneladdress == null) {
            try {
                fJPaneladdress = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneladdress.setLayout(layFlowLayout); // Generated
                fJPaneladdress.add(getJLabeladdress(), null); // Generated
                fJPaneladdress.add(getStringTextFieldaddress(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneladdress;
    }

    // end DB field address
    // start DB field numchans
    /**
     * This method initializes fIntegerTextFieldnumchans
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldnumchans() {
        if (fIntegerTextFieldnumchans == null) {
            try {
                fIntegerTextFieldnumchans = new IntegerTextField(); // Generated
                fIntegerTextFieldnumchans
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldnumchans;
    }

    /**
     * This method initializes fJLabelnumchans
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnumchans() {
        if (fJLabelnumchans == null) {
            try {
                fJLabelnumchans = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelnumchans.setText(resBundel
                        .getString("res_strnumchansDisplayName")); // Generated
                fJLabelnumchans.setToolTipText(resBundel
                        .getString("res_strnumchansDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelnumchans;
    }

    /**
     * This method initializes fJPanelnumchans
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnumchans() {
        if (fJPanelnumchans == null) {
            try {
                fJPanelnumchans = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnumchans.setLayout(layFlowLayout); // Generated
                fJPanelnumchans.add(getJLabelnumchans(), null); // Generated
                fJPanelnumchans.add(getIntegerTextFieldnumchans(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnumchans;
    }

    // end DB field numchans
    // start DB field timing
    /**
     * This method initializes fIntegerTextFieldtiming
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldtiming() {
        if (fIntegerTextFieldtiming == null) {
            try {
                fIntegerTextFieldtiming = new IntegerTextField(); // Generated
                fIntegerTextFieldtiming
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldtiming;
    }

    /**
     * This method initializes fJLabeltiming
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltiming() {
        if (fJLabeltiming == null) {
            try {
                fJLabeltiming = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltiming.setText(resBundel
                        .getString("res_strtimingDisplayName")); // Generated
                fJLabeltiming.setToolTipText(resBundel
                        .getString("res_strtimingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltiming;
    }

    /**
     * This method initializes fJPaneltiming
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltiming() {
        if (fJPaneltiming == null) {
            try {
                fJPaneltiming = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltiming.setLayout(layFlowLayout); // Generated
                fJPaneltiming.add(getJLabeltiming(), null); // Generated
                fJPaneltiming.add(getIntegerTextFieldtiming(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltiming;
    }
    // end DB field timing

}
