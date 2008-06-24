package com.useit.jact.gui.featureconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.featureconf.Featuremap;

/**
 * <p>
 * FeaturemapDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:55 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: FeaturemapDataPanel.java,v 1.4 2005/12/29
 *          19:14:24 urs Exp $
 */
public class FeaturemapDataPanel extends SimpleDataObjectPanel {
    protected Featuremap dataObject;

    // protected FeaturemapChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public FeaturemapDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getFeaturemapResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getFeaturemapResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/FeaturemapResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * FeaturemapCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldblindxfer, fStringTextFielddisconnect,
     * fStringTextFieldautomon, fStringTextFieldatxfer, };
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
        this.add(getJPanelblindxfer(), null); // Generated
        this.add(getJPaneldisconnect(), null); // Generated
        this.add(getJPanelautomon(), null); // Generated
        this.add(getJPanelatxfer(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldblindxfer.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielddisconnect.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldautomon.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldatxfer.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldblindxfer.setValue(dataObject.getBlindxfer());
        fStringTextFielddisconnect.setValue(dataObject.getDisconnect());
        fStringTextFieldautomon.setValue(dataObject.getAutomon());
        fStringTextFieldatxfer.setValue(dataObject.getAtxfer());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setBlindxfer(fStringTextFieldblindxfer.getValue());
        dataObject.setDisconnect(fStringTextFielddisconnect.getValue());
        dataObject.setAutomon(fStringTextFieldautomon.getValue());
        dataObject.setAtxfer(fStringTextFieldatxfer.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Featuremap
     */
    public void setDataObject(Object aFeaturemap) {
        // abstractdataObject = (AbstractConfigObject) aFeaturemap;
        setDataObject((Featuremap) aFeaturemap);
        // dataObject = aFeaturemap;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Featuremap
     */
    public void setDataObject(Featuremap aFeaturemap) {
        // abstractdataObject = (AbstractConfigObject) aFeaturemap;
        dataObject = aFeaturemap;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldblindxfer;

    protected javax.swing.JLabel fJLabelblindxfer;

    protected javax.swing.JPanel fJPanelblindxfer;

    protected StringTextField fStringTextFielddisconnect;

    protected javax.swing.JLabel fJLabeldisconnect;

    protected javax.swing.JPanel fJPaneldisconnect;

    protected StringTextField fStringTextFieldautomon;

    protected javax.swing.JLabel fJLabelautomon;

    protected javax.swing.JPanel fJPanelautomon;

    protected StringTextField fStringTextFieldatxfer;

    protected javax.swing.JLabel fJLabelatxfer;

    protected javax.swing.JPanel fJPanelatxfer;

    // start DB field blindxfer
    /**
     * This method initializes fStringTextFieldblindxfer
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldblindxfer() {
        if (fStringTextFieldblindxfer == null) {
            try {
                fStringTextFieldblindxfer = new StringTextField(); // Generated
                fStringTextFieldblindxfer
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldblindxfer;
    }

    /**
     * This method initializes fJLabelblindxfer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelblindxfer() {
        if (fJLabelblindxfer == null) {
            try {
                fJLabelblindxfer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelblindxfer.setText(resBundel
                        .getString("res_strblindxferDisplayName")); // Generated
                fJLabelblindxfer.setToolTipText(resBundel
                        .getString("res_strblindxferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelblindxfer;
    }

    /**
     * This method initializes fJPanelblindxfer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelblindxfer() {
        if (fJPanelblindxfer == null) {
            try {
                fJPanelblindxfer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelblindxfer.setLayout(layFlowLayout); // Generated
                fJPanelblindxfer.add(getJLabelblindxfer(), null); // Generated
                fJPanelblindxfer.add(getStringTextFieldblindxfer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelblindxfer;
    }

    // end DB field blindxfer
    // start DB field disconnect
    /**
     * This method initializes fStringTextFielddisconnect
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddisconnect() {
        if (fStringTextFielddisconnect == null) {
            try {
                fStringTextFielddisconnect = new StringTextField(); // Generated
                fStringTextFielddisconnect
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddisconnect;
    }

    /**
     * This method initializes fJLabeldisconnect
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldisconnect() {
        if (fJLabeldisconnect == null) {
            try {
                fJLabeldisconnect = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldisconnect.setText(resBundel
                        .getString("res_strdisconnectDisplayName")); // Generated
                fJLabeldisconnect.setToolTipText(resBundel
                        .getString("res_strdisconnectDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldisconnect;
    }

    /**
     * This method initializes fJPaneldisconnect
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldisconnect() {
        if (fJPaneldisconnect == null) {
            try {
                fJPaneldisconnect = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldisconnect.setLayout(layFlowLayout); // Generated
                fJPaneldisconnect.add(getJLabeldisconnect(), null); // Generated
                fJPaneldisconnect.add(getStringTextFielddisconnect(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldisconnect;
    }

    // end DB field disconnect
    // start DB field automon
    /**
     * This method initializes fStringTextFieldautomon
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldautomon() {
        if (fStringTextFieldautomon == null) {
            try {
                fStringTextFieldautomon = new StringTextField(); // Generated
                fStringTextFieldautomon
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldautomon;
    }

    /**
     * This method initializes fJLabelautomon
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelautomon() {
        if (fJLabelautomon == null) {
            try {
                fJLabelautomon = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelautomon.setText(resBundel
                        .getString("res_strautomonDisplayName")); // Generated
                fJLabelautomon.setToolTipText(resBundel
                        .getString("res_strautomonDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelautomon;
    }

    /**
     * This method initializes fJPanelautomon
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelautomon() {
        if (fJPanelautomon == null) {
            try {
                fJPanelautomon = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelautomon.setLayout(layFlowLayout); // Generated
                fJPanelautomon.add(getJLabelautomon(), null); // Generated
                fJPanelautomon.add(getStringTextFieldautomon(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelautomon;
    }

    // end DB field automon
    // start DB field atxfer
    /**
     * This method initializes fStringTextFieldatxfer
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldatxfer() {
        if (fStringTextFieldatxfer == null) {
            try {
                fStringTextFieldatxfer = new StringTextField(); // Generated
                fStringTextFieldatxfer.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldatxfer;
    }

    /**
     * This method initializes fJLabelatxfer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelatxfer() {
        if (fJLabelatxfer == null) {
            try {
                fJLabelatxfer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelatxfer.setText(resBundel
                        .getString("res_stratxferDisplayName")); // Generated
                fJLabelatxfer.setToolTipText(resBundel
                        .getString("res_stratxferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelatxfer;
    }

    /**
     * This method initializes fJPanelatxfer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelatxfer() {
        if (fJPanelatxfer == null) {
            try {
                fJPanelatxfer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelatxfer.setLayout(layFlowLayout); // Generated
                fJPanelatxfer.add(getJLabelatxfer(), null); // Generated
                fJPanelatxfer.add(getStringTextFieldatxfer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelatxfer;
    }
    // end DB field atxfer

}
