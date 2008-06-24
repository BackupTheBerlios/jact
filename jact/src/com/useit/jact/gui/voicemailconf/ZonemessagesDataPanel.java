package com.useit.jact.gui.voicemailconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.voicemailconf.Zonemessages;

/**
 * <p>
 * ZonemessagesDataPanel
 * </p>
 * Created : Fri Jan 13 20:29:29 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZonemessagesDataPanel.java,v 1.6 2006/01/14
 *          15:00:13 urs Exp $
 */
public class ZonemessagesDataPanel extends SimpleDataObjectPanel {
    protected Zonemessages dataObject;

    // protected ZonemessagesChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZonemessagesDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZonemessagesResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZonemessagesResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZonemessagesResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ZonemessagesCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldcountry, fStringTextFieldcity,
     * fStringTextFieldoptions, }; dataChecker.initChecker(array); }
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
        this.add(getJPaneltimezonename(), null); // Generated
        this.add(getJPanelcountry(), null); // Generated
        this.add(getJPanelcity(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldtimezonename.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldcountry.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldcity.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldoptions.getDocument()
                .addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldtimezonename.setValue(dataObject.getTimezonename());
        fStringTextFieldcountry.setValue(dataObject.getCountry());
        fStringTextFieldcity.setValue(dataObject.getCity());
        fStringTextFieldoptions.setValue(dataObject.getOptions());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setTimezonename(fStringTextFieldtimezonename.getValue());
        dataObject.setCountry(fStringTextFieldcountry.getValue());
        dataObject.setCity(fStringTextFieldcity.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zonemessages
     */
    public void setDataObject(Object aZonemessages) {
        // abstractdataObject = (AbstractConfigObject) aZonemessages;
        setDataObject((Zonemessages) aZonemessages);
        // dataObject = aZonemessages;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zonemessages
     */
    public void setDataObject(Zonemessages aZonemessages) {
        // abstractdataObject = (AbstractConfigObject) aZonemessages;
        dataObject = aZonemessages;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtimezonename;

    protected javax.swing.JLabel fJLabeltimezonename;

    protected javax.swing.JPanel fJPaneltimezonename;

    protected StringTextField fStringTextFieldcountry;

    protected javax.swing.JLabel fJLabelcountry;

    protected javax.swing.JPanel fJPanelcountry;

    protected StringTextField fStringTextFieldcity;

    protected javax.swing.JLabel fJLabelcity;

    protected javax.swing.JPanel fJPanelcity;

    protected StringTextField fStringTextFieldoptions;

    protected javax.swing.JLabel fJLabeloptions;

    protected javax.swing.JPanel fJPaneloptions;

    // start DB field timezonename
    /**
     * This method initializes fStringTextFieldtimezonename
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtimezonename() {
        if (fStringTextFieldtimezonename == null) {
            try {
                fStringTextFieldtimezonename = new StringTextField(); // Generated
                fStringTextFieldtimezonename
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtimezonename;
    }

    /**
     * This method initializes fJLabeltimezonename
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimezonename() {
        if (fJLabeltimezonename == null) {
            try {
                fJLabeltimezonename = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltimezonename.setText(resBundel
                        .getString("res_strtimezonenameDisplayName")); // Generated
                fJLabeltimezonename.setToolTipText(resBundel
                        .getString("res_strtimezonenameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltimezonename;
    }

    /**
     * This method initializes fJPaneltimezonename
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimezonename() {
        if (fJPaneltimezonename == null) {
            try {
                fJPaneltimezonename = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimezonename.setLayout(layFlowLayout); // Generated
                fJPaneltimezonename.add(getJLabeltimezonename(), null); // Generated
                fJPaneltimezonename.add(getStringTextFieldtimezonename(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimezonename;
    }

    // end DB field timezonename
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
    // start DB field city
    /**
     * This method initializes fStringTextFieldcity
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcity() {
        if (fStringTextFieldcity == null) {
            try {
                fStringTextFieldcity = new StringTextField(); // Generated
                fStringTextFieldcity.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcity;
    }

    /**
     * This method initializes fJLabelcity
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcity() {
        if (fJLabelcity == null) {
            try {
                fJLabelcity = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcity.setText(resBundel
                        .getString("res_strcityDisplayName")); // Generated
                fJLabelcity.setToolTipText(resBundel
                        .getString("res_strcityDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcity;
    }

    /**
     * This method initializes fJPanelcity
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcity() {
        if (fJPanelcity == null) {
            try {
                fJPanelcity = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcity.setLayout(layFlowLayout); // Generated
                fJPanelcity.add(getJLabelcity(), null); // Generated
                fJPanelcity.add(getStringTextFieldcity(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcity;
    }

    // end DB field city
    // start DB field options
    /**
     * This method initializes fStringTextFieldoptions
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldoptions() {
        if (fStringTextFieldoptions == null) {
            try {
                fStringTextFieldoptions = new StringTextField(); // Generated
                fStringTextFieldoptions
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldoptions;
    }

    /**
     * This method initializes fJLabeloptions
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloptions() {
        if (fJLabeloptions == null) {
            try {
                fJLabeloptions = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeloptions.setText(resBundel
                        .getString("res_stroptionsDisplayName")); // Generated
                fJLabeloptions.setToolTipText(resBundel
                        .getString("res_stroptionsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeloptions;
    }

    /**
     * This method initializes fJPaneloptions
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloptions() {
        if (fJPaneloptions == null) {
            try {
                fJPaneloptions = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloptions.setLayout(layFlowLayout); // Generated
                fJPaneloptions.add(getJLabeloptions(), null); // Generated
                fJPaneloptions.add(getStringTextFieldoptions(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloptions;
    }
    // end DB field options

}
