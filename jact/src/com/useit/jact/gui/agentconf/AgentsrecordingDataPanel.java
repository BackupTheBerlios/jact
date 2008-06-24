package com.useit.jact.gui.agentconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.agentconf.Agentsrecording;

/**
 * <p>
 * AgentsrecordingDataPanel
 * </p>
 * Created : Tue Dec 27 16:21:50 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsrecordingDataPanel.java,v 1.4
 *          2005/12/29 19:14:24 urs Exp $
 */
public class AgentsrecordingDataPanel extends SimpleDataObjectPanel {
    protected Agentsrecording dataObject;

    // protected AgentsrecordingChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public AgentsrecordingDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAgentsrecordingResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAgentsrecordingResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/AgentsrecordingResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * AgentsrecordingCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fCustomCheckBoxrecordagentcalls,
     * fStringTextFieldrecordformat, fStringTextFieldcreatelink,
     * fStringTextFieldurlprefix, fStringTextFieldsavecallsin, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (5) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(5); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelrecordagentcalls(), null); // Generated
        this.add(getJPanelrecordformat(), null); // Generated
        this.add(getJPanelcreatelink(), null); // Generated
        this.add(getJPanelurlprefix(), null); // Generated
        this.add(getJPanelsavecallsin(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fCustomCheckBoxrecordagentcalls.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldrecordformat.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldcreatelink.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldurlprefix.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldsavecallsin.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fCustomCheckBoxrecordagentcalls.setValue(dataObject
                .getRecordagentcalls());
        fStringTextFieldrecordformat.setValue(dataObject.getRecordformat());
        fStringTextFieldcreatelink.setValue(dataObject.getCreatelink());
        fStringTextFieldurlprefix.setValue(dataObject.getUrlprefix());
        fStringTextFieldsavecallsin.setValue(dataObject.getSavecallsin());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setRecordagentcalls(fCustomCheckBoxrecordagentcalls
                .getValue());
        dataObject.setRecordformat(fStringTextFieldrecordformat.getValue());
        dataObject.setCreatelink(fStringTextFieldcreatelink.getValue());
        dataObject.setUrlprefix(fStringTextFieldurlprefix.getValue());
        dataObject.setSavecallsin(fStringTextFieldsavecallsin.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Agentsrecording
     */
    public void setDataObject(Object aAgentsrecording) {
        // abstractdataObject = (AbstractConfigObject) aAgentsrecording;
        setDataObject((Agentsrecording) aAgentsrecording);
        // dataObject = aAgentsrecording;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Agentsrecording
     */
    public void setDataObject(Agentsrecording aAgentsrecording) {
        // abstractdataObject = (AbstractConfigObject) aAgentsrecording;
        dataObject = aAgentsrecording;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected CustomCheckBox fCustomCheckBoxrecordagentcalls;

    protected javax.swing.JLabel fJLabelrecordagentcalls;

    protected javax.swing.JPanel fJPanelrecordagentcalls;

    protected StringTextField fStringTextFieldrecordformat;

    protected javax.swing.JLabel fJLabelrecordformat;

    protected javax.swing.JPanel fJPanelrecordformat;

    protected StringTextField fStringTextFieldcreatelink;

    protected javax.swing.JLabel fJLabelcreatelink;

    protected javax.swing.JPanel fJPanelcreatelink;

    protected StringTextField fStringTextFieldurlprefix;

    protected javax.swing.JLabel fJLabelurlprefix;

    protected javax.swing.JPanel fJPanelurlprefix;

    protected StringTextField fStringTextFieldsavecallsin;

    protected javax.swing.JLabel fJLabelsavecallsin;

    protected javax.swing.JPanel fJPanelsavecallsin;

    // start DB field recordagentcalls
    /**
     * This method initializes fCustomCheckBoxrecordagentcalls
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxrecordagentcalls() {
        if (fCustomCheckBoxrecordagentcalls == null) {
            try {
                fCustomCheckBoxrecordagentcalls = new CustomCheckBox(); // Generated
                fCustomCheckBoxrecordagentcalls
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxrecordagentcalls;
    }

    /**
     * This method initializes fJLabelrecordagentcalls
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrecordagentcalls() {
        if (fJLabelrecordagentcalls == null) {
            try {
                fJLabelrecordagentcalls = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrecordagentcalls.setText(resBundel
                        .getString("res_strrecordagentcallsDisplayName")); // Generated
                fJLabelrecordagentcalls.setToolTipText(resBundel
                        .getString("res_strrecordagentcallsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrecordagentcalls;
    }

    /**
     * This method initializes fJPanelrecordagentcalls
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrecordagentcalls() {
        if (fJPanelrecordagentcalls == null) {
            try {
                fJPanelrecordagentcalls = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrecordagentcalls.setLayout(layFlowLayout); // Generated
                fJPanelrecordagentcalls.add(getJLabelrecordagentcalls(), null); // Generated
                fJPanelrecordagentcalls.add(
                        getCustomCheckBoxrecordagentcalls(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrecordagentcalls;
    }

    // end DB field recordagentcalls
    // start DB field recordformat
    /**
     * This method initializes fStringTextFieldrecordformat
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldrecordformat() {
        if (fStringTextFieldrecordformat == null) {
            try {
                fStringTextFieldrecordformat = new StringTextField(); // Generated
                fStringTextFieldrecordformat
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldrecordformat;
    }

    /**
     * This method initializes fJLabelrecordformat
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrecordformat() {
        if (fJLabelrecordformat == null) {
            try {
                fJLabelrecordformat = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrecordformat.setText(resBundel
                        .getString("res_strrecordformatDisplayName")); // Generated
                fJLabelrecordformat.setToolTipText(resBundel
                        .getString("res_strrecordformatDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrecordformat;
    }

    /**
     * This method initializes fJPanelrecordformat
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrecordformat() {
        if (fJPanelrecordformat == null) {
            try {
                fJPanelrecordformat = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrecordformat.setLayout(layFlowLayout); // Generated
                fJPanelrecordformat.add(getJLabelrecordformat(), null); // Generated
                fJPanelrecordformat.add(getStringTextFieldrecordformat(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrecordformat;
    }

    // end DB field recordformat
    // start DB field createlink
    /**
     * This method initializes fStringTextFieldcreatelink
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcreatelink() {
        if (fStringTextFieldcreatelink == null) {
            try {
                fStringTextFieldcreatelink = new StringTextField(); // Generated
                fStringTextFieldcreatelink
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcreatelink;
    }

    /**
     * This method initializes fJLabelcreatelink
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcreatelink() {
        if (fJLabelcreatelink == null) {
            try {
                fJLabelcreatelink = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcreatelink.setText(resBundel
                        .getString("res_strcreatelinkDisplayName")); // Generated
                fJLabelcreatelink.setToolTipText(resBundel
                        .getString("res_strcreatelinkDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcreatelink;
    }

    /**
     * This method initializes fJPanelcreatelink
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcreatelink() {
        if (fJPanelcreatelink == null) {
            try {
                fJPanelcreatelink = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcreatelink.setLayout(layFlowLayout); // Generated
                fJPanelcreatelink.add(getJLabelcreatelink(), null); // Generated
                fJPanelcreatelink.add(getStringTextFieldcreatelink(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcreatelink;
    }

    // end DB field createlink
    // start DB field urlprefix
    /**
     * This method initializes fStringTextFieldurlprefix
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldurlprefix() {
        if (fStringTextFieldurlprefix == null) {
            try {
                fStringTextFieldurlprefix = new StringTextField(); // Generated
                fStringTextFieldurlprefix
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldurlprefix;
    }

    /**
     * This method initializes fJLabelurlprefix
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelurlprefix() {
        if (fJLabelurlprefix == null) {
            try {
                fJLabelurlprefix = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelurlprefix.setText(resBundel
                        .getString("res_strurlprefixDisplayName")); // Generated
                fJLabelurlprefix.setToolTipText(resBundel
                        .getString("res_strurlprefixDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelurlprefix;
    }

    /**
     * This method initializes fJPanelurlprefix
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelurlprefix() {
        if (fJPanelurlprefix == null) {
            try {
                fJPanelurlprefix = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelurlprefix.setLayout(layFlowLayout); // Generated
                fJPanelurlprefix.add(getJLabelurlprefix(), null); // Generated
                fJPanelurlprefix.add(getStringTextFieldurlprefix(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelurlprefix;
    }

    // end DB field urlprefix
    // start DB field savecallsin
    /**
     * This method initializes fStringTextFieldsavecallsin
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsavecallsin() {
        if (fStringTextFieldsavecallsin == null) {
            try {
                fStringTextFieldsavecallsin = new StringTextField(); // Generated
                fStringTextFieldsavecallsin
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsavecallsin;
    }

    /**
     * This method initializes fJLabelsavecallsin
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsavecallsin() {
        if (fJLabelsavecallsin == null) {
            try {
                fJLabelsavecallsin = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelsavecallsin.setText(resBundel
                        .getString("res_strsavecallsinDisplayName")); // Generated
                fJLabelsavecallsin.setToolTipText(resBundel
                        .getString("res_strsavecallsinDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelsavecallsin;
    }

    /**
     * This method initializes fJPanelsavecallsin
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsavecallsin() {
        if (fJPanelsavecallsin == null) {
            try {
                fJPanelsavecallsin = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsavecallsin.setLayout(layFlowLayout); // Generated
                fJPanelsavecallsin.add(getJLabelsavecallsin(), null); // Generated
                fJPanelsavecallsin.add(getStringTextFieldsavecallsin(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsavecallsin;
    }
    // end DB field savecallsin

}
