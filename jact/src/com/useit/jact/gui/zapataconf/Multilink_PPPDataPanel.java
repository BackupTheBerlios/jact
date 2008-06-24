package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zapataconf.Multilink_PPP;

/**
 * <p>
 * Multilink_PPPDataPanel
 * </p>
 * Created : Thu Dec 29 12:23:05 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Multilink_PPPDataPanel.java,v 1.5 2005/12/29
 *          19:14:06 urs Exp $
 */
public class Multilink_PPPDataPanel extends SimpleDataObjectPanel {
    protected Multilink_PPP dataObject;

    // protected Multilink_PPPChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Multilink_PPPDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMultilink_PPPResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMultilink_PPPResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Multilink_PPPResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * Multilink_PPPCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldminunused, fIntegerTextFieldminidle,
     * fIntegerTextFieldidledial, fStringTextFieldidleext, };
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
        this.add(getJPanelminunused(), null); // Generated
        this.add(getJPanelminidle(), null); // Generated
        this.add(getJPanelidledial(), null); // Generated
        this.add(getJPanelidleext(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldminunused.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldminidle.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldidledial.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldidleext.getDocument()
                .addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldminunused.setValue(dataObject.getMinunused());
        fIntegerTextFieldminidle.setValue(dataObject.getMinidle());
        fIntegerTextFieldidledial.setValue(dataObject.getIdledial());
        fStringTextFieldidleext.setValue(dataObject.getIdleext());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setMinunused(fStringTextFieldminunused.getValue());
        dataObject.setMinidle(fIntegerTextFieldminidle.getValue());
        dataObject.setIdledial(fIntegerTextFieldidledial.getValue());
        dataObject.setIdleext(fStringTextFieldidleext.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Multilink_PPP
     */
    public void setDataObject(Object aMultilink_PPP) {
        // abstractdataObject = (AbstractConfigObject) aMultilink_PPP;
        setDataObject((Multilink_PPP) aMultilink_PPP);
        // dataObject = aMultilink_PPP;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Multilink_PPP
     */
    public void setDataObject(Multilink_PPP aMultilink_PPP) {
        // abstractdataObject = (AbstractConfigObject) aMultilink_PPP;
        dataObject = aMultilink_PPP;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldminunused;

    protected javax.swing.JLabel fJLabelminunused;

    protected javax.swing.JPanel fJPanelminunused;

    protected IntegerTextField fIntegerTextFieldminidle;

    protected javax.swing.JLabel fJLabelminidle;

    protected javax.swing.JPanel fJPanelminidle;

    protected IntegerTextField fIntegerTextFieldidledial;

    protected javax.swing.JLabel fJLabelidledial;

    protected javax.swing.JPanel fJPanelidledial;

    protected StringTextField fStringTextFieldidleext;

    protected javax.swing.JLabel fJLabelidleext;

    protected javax.swing.JPanel fJPanelidleext;

    // start DB field minunused
    /**
     * This method initializes fStringTextFieldminunused
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldminunused() {
        if (fStringTextFieldminunused == null) {
            try {
                fStringTextFieldminunused = new StringTextField(); // Generated
                fStringTextFieldminunused
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldminunused;
    }

    /**
     * This method initializes fJLabelminunused
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelminunused() {
        if (fJLabelminunused == null) {
            try {
                fJLabelminunused = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelminunused.setText(resBundel
                        .getString("res_strminunusedDisplayName")); // Generated
                fJLabelminunused.setToolTipText(resBundel
                        .getString("res_strminunusedDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelminunused;
    }

    /**
     * This method initializes fJPanelminunused
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelminunused() {
        if (fJPanelminunused == null) {
            try {
                fJPanelminunused = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelminunused.setLayout(layFlowLayout); // Generated
                fJPanelminunused.add(getJLabelminunused(), null); // Generated
                fJPanelminunused.add(getStringTextFieldminunused(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelminunused;
    }

    // end DB field minunused
    // start DB field minidle
    /**
     * This method initializes fIntegerTextFieldminidle
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldminidle() {
        if (fIntegerTextFieldminidle == null) {
            try {
                fIntegerTextFieldminidle = new IntegerTextField(); // Generated
                fIntegerTextFieldminidle
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldminidle;
    }

    /**
     * This method initializes fJLabelminidle
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelminidle() {
        if (fJLabelminidle == null) {
            try {
                fJLabelminidle = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelminidle.setText(resBundel
                        .getString("res_strminidleDisplayName")); // Generated
                fJLabelminidle.setToolTipText(resBundel
                        .getString("res_strminidleDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelminidle;
    }

    /**
     * This method initializes fJPanelminidle
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelminidle() {
        if (fJPanelminidle == null) {
            try {
                fJPanelminidle = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelminidle.setLayout(layFlowLayout); // Generated
                fJPanelminidle.add(getJLabelminidle(), null); // Generated
                fJPanelminidle.add(getIntegerTextFieldminidle(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelminidle;
    }

    // end DB field minidle
    // start DB field idledial
    /**
     * This method initializes fIntegerTextFieldidledial
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldidledial() {
        if (fIntegerTextFieldidledial == null) {
            try {
                fIntegerTextFieldidledial = new IntegerTextField(); // Generated
                fIntegerTextFieldidledial
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldidledial;
    }

    /**
     * This method initializes fJLabelidledial
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelidledial() {
        if (fJLabelidledial == null) {
            try {
                fJLabelidledial = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelidledial.setText(resBundel
                        .getString("res_stridledialDisplayName")); // Generated
                fJLabelidledial.setToolTipText(resBundel
                        .getString("res_stridledialDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelidledial;
    }

    /**
     * This method initializes fJPanelidledial
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelidledial() {
        if (fJPanelidledial == null) {
            try {
                fJPanelidledial = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelidledial.setLayout(layFlowLayout); // Generated
                fJPanelidledial.add(getJLabelidledial(), null); // Generated
                fJPanelidledial.add(getIntegerTextFieldidledial(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelidledial;
    }

    // end DB field idledial
    // start DB field idleext
    /**
     * This method initializes fStringTextFieldidleext
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldidleext() {
        if (fStringTextFieldidleext == null) {
            try {
                fStringTextFieldidleext = new StringTextField(); // Generated
                fStringTextFieldidleext
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldidleext;
    }

    /**
     * This method initializes fJLabelidleext
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelidleext() {
        if (fJLabelidleext == null) {
            try {
                fJLabelidleext = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelidleext.setText(resBundel
                        .getString("res_stridleextDisplayName")); // Generated
                fJLabelidleext.setToolTipText(resBundel
                        .getString("res_stridleextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelidleext;
    }

    /**
     * This method initializes fJPanelidleext
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelidleext() {
        if (fJPanelidleext == null) {
            try {
                fJPanelidleext = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelidleext.setLayout(layFlowLayout); // Generated
                fJPanelidleext.add(getJLabelidleext(), null); // Generated
                fJPanelidleext.add(getStringTextFieldidleext(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelidleext;
    }
    // end DB field idleext

}
