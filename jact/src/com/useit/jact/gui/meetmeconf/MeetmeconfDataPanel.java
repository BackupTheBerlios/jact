package com.useit.jact.gui.meetmeconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.meetmeconf.Meetmeconf;

/**
 * <p>
 * MeetmeconfDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:23 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetmeconfDataPanel.java,v 1.4 2005/12/29
 *          19:14:07 urs Exp $
 */
public class MeetmeconfDataPanel extends SimpleDataObjectPanel {
    protected Meetmeconf dataObject;

    // protected MeetmeconfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MeetmeconfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMeetmeconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMeetmeconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MeetmeconfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * MeetmeconfCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { }; dataChecker.initChecker(array); }
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
        this.add(getJPanelfileid(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldfileid.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldfileid.setValue(dataObject.getFileid());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setFileid(fStringTextFieldfileid.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Meetmeconf
     */
    public void setDataObject(Object aMeetmeconf) {
        // abstractdataObject = (AbstractConfigObject) aMeetmeconf;
        setDataObject((Meetmeconf) aMeetmeconf);
        // dataObject = aMeetmeconf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Meetmeconf
     */
    public void setDataObject(Meetmeconf aMeetmeconf) {
        // abstractdataObject = (AbstractConfigObject) aMeetmeconf;
        dataObject = aMeetmeconf;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfileid;

    protected javax.swing.JLabel fJLabelfileid;

    protected javax.swing.JPanel fJPanelfileid;

    // start DB field fileid
    /**
     * This method initializes fStringTextFieldfileid
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfileid() {
        if (fStringTextFieldfileid == null) {
            try {
                fStringTextFieldfileid = new StringTextField(); // Generated
                fStringTextFieldfileid.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfileid;
    }

    /**
     * This method initializes fJLabelfileid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfileid() {
        if (fJLabelfileid == null) {
            try {
                fJLabelfileid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelfileid.setText(resBundel
                        .getString("res_strfileidDisplayName")); // Generated
                fJLabelfileid.setToolTipText(resBundel
                        .getString("res_strfileidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelfileid;
    }

    /**
     * This method initializes fJPanelfileid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfileid() {
        if (fJPanelfileid == null) {
            try {
                fJPanelfileid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfileid.setLayout(layFlowLayout); // Generated
                fJPanelfileid.add(getJLabelfileid(), null); // Generated
                fJPanelfileid.add(getStringTextFieldfileid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfileid;
    }
    // end DB field fileid

}
