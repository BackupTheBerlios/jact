package com.useit.jact.gui.zaptelconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zaptelconf.Zaptelchannels;

/**
 * <p>
 * ZaptelchannelsDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:59 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelchannelsDataPanel.java,v 1.5 2005/12/29
 *          19:14:25 urs Exp $
 */
public class ZaptelchannelsDataPanel extends SimpleDataObjectPanel {
    protected Zaptelchannels dataObject;

    // protected ZaptelchannelsChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZaptelchannelsDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZaptelchannelsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZaptelchannelsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZaptelchannelsResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ZaptelchannelsCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFielddevice, fStringTextFieldchannellist, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (2) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneldevice(), null); // Generated
        this.add(getJPanelchannellist(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFielddevice.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldchannellist.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFielddevice.setValue(dataObject.getDevice());
        fStringTextFieldchannellist.setValue(dataObject.getChannellist());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setDevice(fStringTextFielddevice.getValue());
        dataObject.setChannellist(fStringTextFieldchannellist.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zaptelchannels
     */
    public void setDataObject(Object aZaptelchannels) {
        // abstractdataObject = (AbstractConfigObject) aZaptelchannels;
        setDataObject((Zaptelchannels) aZaptelchannels);
        // dataObject = aZaptelchannels;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zaptelchannels
     */
    public void setDataObject(Zaptelchannels aZaptelchannels) {
        // abstractdataObject = (AbstractConfigObject) aZaptelchannels;
        dataObject = aZaptelchannels;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFielddevice;

    protected javax.swing.JLabel fJLabeldevice;

    protected javax.swing.JPanel fJPaneldevice;

    protected StringTextField fStringTextFieldchannellist;

    protected javax.swing.JLabel fJLabelchannellist;

    protected javax.swing.JPanel fJPanelchannellist;

    // start DB field device
    /**
     * This method initializes fStringTextFielddevice
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddevice() {
        if (fStringTextFielddevice == null) {
            try {
                fStringTextFielddevice = new StringTextField(); // Generated
                fStringTextFielddevice.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddevice;
    }

    /**
     * This method initializes fJLabeldevice
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldevice() {
        if (fJLabeldevice == null) {
            try {
                fJLabeldevice = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldevice.setText(resBundel
                        .getString("res_strdeviceDisplayName")); // Generated
                fJLabeldevice.setToolTipText(resBundel
                        .getString("res_strdeviceDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldevice;
    }

    /**
     * This method initializes fJPaneldevice
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldevice() {
        if (fJPaneldevice == null) {
            try {
                fJPaneldevice = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldevice.setLayout(layFlowLayout); // Generated
                fJPaneldevice.add(getJLabeldevice(), null); // Generated
                fJPaneldevice.add(getStringTextFielddevice(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldevice;
    }

    // end DB field device
    // start DB field channellist
    /**
     * This method initializes fStringTextFieldchannellist
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldchannellist() {
        if (fStringTextFieldchannellist == null) {
            try {
                fStringTextFieldchannellist = new StringTextField(); // Generated
                fStringTextFieldchannellist
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldchannellist;
    }

    /**
     * This method initializes fJLabelchannellist
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelchannellist() {
        if (fJLabelchannellist == null) {
            try {
                fJLabelchannellist = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelchannellist.setText(resBundel
                        .getString("res_strchannellistDisplayName")); // Generated
                fJLabelchannellist.setToolTipText(resBundel
                        .getString("res_strchannellistDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelchannellist;
    }

    /**
     * This method initializes fJPanelchannellist
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelchannellist() {
        if (fJPanelchannellist == null) {
            try {
                fJPanelchannellist = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelchannellist.setLayout(layFlowLayout); // Generated
                fJPanelchannellist.add(getJLabelchannellist(), null); // Generated
                fJPanelchannellist.add(getStringTextFieldchannellist(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelchannellist;
    }
    // end DB field channellist

}
