package com.useit.jact.gui.meetmeconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.meetmeconf.Meetmerooms;

/**
 * <p>
 * MeetmeroomsDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:24 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetmeroomsDataPanel.java,v 1.4 2005/12/29
 *          19:14:08 urs Exp $
 */
public class MeetmeroomsDataPanel extends SimpleDataObjectPanel {
    protected Meetmerooms dataObject;

    // protected MeetmeroomsChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MeetmeroomsDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMeetmeroomsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMeetmeroomsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MeetmeroomsResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * MeetmeroomsCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldconfno, fStringTextFieldpincode,
     * fStringTextFieldadminpin, }; dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (3) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelconfno(), null); // Generated
        this.add(getJPanelpincode(), null); // Generated
        this.add(getJPaneladminpin(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldconfno.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldpincode.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldadminpin.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldconfno.setValue(dataObject.getConfno());
        fStringTextFieldpincode.setValue(dataObject.getPincode());
        fStringTextFieldadminpin.setValue(dataObject.getAdminpin());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setConfno(fStringTextFieldconfno.getValue());
        dataObject.setPincode(fStringTextFieldpincode.getValue());
        dataObject.setAdminpin(fStringTextFieldadminpin.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Meetmerooms
     */
    public void setDataObject(Object aMeetmerooms) {
        // abstractdataObject = (AbstractConfigObject) aMeetmerooms;
        setDataObject((Meetmerooms) aMeetmerooms);
        // dataObject = aMeetmerooms;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Meetmerooms
     */
    public void setDataObject(Meetmerooms aMeetmerooms) {
        // abstractdataObject = (AbstractConfigObject) aMeetmerooms;
        dataObject = aMeetmerooms;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldconfno;

    protected javax.swing.JLabel fJLabelconfno;

    protected javax.swing.JPanel fJPanelconfno;

    protected StringTextField fStringTextFieldpincode;

    protected javax.swing.JLabel fJLabelpincode;

    protected javax.swing.JPanel fJPanelpincode;

    protected StringTextField fStringTextFieldadminpin;

    protected javax.swing.JLabel fJLabeladminpin;

    protected javax.swing.JPanel fJPaneladminpin;

    // start DB field confno
    /**
     * This method initializes fStringTextFieldconfno
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldconfno() {
        if (fStringTextFieldconfno == null) {
            try {
                fStringTextFieldconfno = new StringTextField(); // Generated
                fStringTextFieldconfno.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldconfno;
    }

    /**
     * This method initializes fJLabelconfno
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelconfno() {
        if (fJLabelconfno == null) {
            try {
                fJLabelconfno = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelconfno.setText(resBundel
                        .getString("res_strconfnoDisplayName")); // Generated
                fJLabelconfno.setToolTipText(resBundel
                        .getString("res_strconfnoDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelconfno;
    }

    /**
     * This method initializes fJPanelconfno
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelconfno() {
        if (fJPanelconfno == null) {
            try {
                fJPanelconfno = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelconfno.setLayout(layFlowLayout); // Generated
                fJPanelconfno.add(getJLabelconfno(), null); // Generated
                fJPanelconfno.add(getStringTextFieldconfno(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelconfno;
    }

    // end DB field confno
    // start DB field pincode
    /**
     * This method initializes fStringTextFieldpincode
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpincode() {
        if (fStringTextFieldpincode == null) {
            try {
                fStringTextFieldpincode = new StringTextField(); // Generated
                fStringTextFieldpincode
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpincode;
    }

    /**
     * This method initializes fJLabelpincode
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpincode() {
        if (fJLabelpincode == null) {
            try {
                fJLabelpincode = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpincode.setText(resBundel
                        .getString("res_strpincodeDisplayName")); // Generated
                fJLabelpincode.setToolTipText(resBundel
                        .getString("res_strpincodeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpincode;
    }

    /**
     * This method initializes fJPanelpincode
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpincode() {
        if (fJPanelpincode == null) {
            try {
                fJPanelpincode = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpincode.setLayout(layFlowLayout); // Generated
                fJPanelpincode.add(getJLabelpincode(), null); // Generated
                fJPanelpincode.add(getStringTextFieldpincode(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpincode;
    }

    // end DB field pincode
    // start DB field adminpin
    /**
     * This method initializes fStringTextFieldadminpin
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldadminpin() {
        if (fStringTextFieldadminpin == null) {
            try {
                fStringTextFieldadminpin = new StringTextField(); // Generated
                fStringTextFieldadminpin
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldadminpin;
    }

    /**
     * This method initializes fJLabeladminpin
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeladminpin() {
        if (fJLabeladminpin == null) {
            try {
                fJLabeladminpin = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeladminpin.setText(resBundel
                        .getString("res_stradminpinDisplayName")); // Generated
                fJLabeladminpin.setToolTipText(resBundel
                        .getString("res_stradminpinDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeladminpin;
    }

    /**
     * This method initializes fJPaneladminpin
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneladminpin() {
        if (fJPaneladminpin == null) {
            try {
                fJPaneladminpin = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneladminpin.setLayout(layFlowLayout); // Generated
                fJPaneladminpin.add(getJLabeladminpin(), null); // Generated
                fJPaneladminpin.add(getStringTextFieldadminpin(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneladminpin;
    }
    // end DB field adminpin

}
