package com.useit.jact.gui.voicemailconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.voicemailconf.Voicemailcontext;

/**
 * <p>
 * VoicemailcontextDataPanel
 * </p>
 * Created : Fri Jan 13 20:29:29 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailcontextDataPanel.java,v 1.6
 *          2006/01/14 15:00:12 urs Exp $
 */
public class VoicemailcontextDataPanel extends SimpleDataObjectPanel {
    protected Voicemailcontext dataObject;

    // protected VoicemailcontextChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public VoicemailcontextDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getVoicemailcontextResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getVoicemailcontextResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/VoicemailcontextResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * VoicemailcontextCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldcontextname, };
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
        this.add(getJPanelcontextname(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldcontextname.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldcontextname.setValue(dataObject.getContextname());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setContextname(fStringTextFieldcontextname.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Voicemailcontext
     */
    public void setDataObject(Object aVoicemailcontext) {
        // abstractdataObject = (AbstractConfigObject) aVoicemailcontext;
        setDataObject((Voicemailcontext) aVoicemailcontext);
        // dataObject = aVoicemailcontext;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Voicemailcontext
     */
    public void setDataObject(Voicemailcontext aVoicemailcontext) {
        // abstractdataObject = (AbstractConfigObject) aVoicemailcontext;
        dataObject = aVoicemailcontext;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcontextname;

    protected javax.swing.JLabel fJLabelcontextname;

    protected javax.swing.JPanel fJPanelcontextname;

    // start DB field contextname
    /**
     * This method initializes fStringTextFieldcontextname
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcontextname() {
        if (fStringTextFieldcontextname == null) {
            try {
                fStringTextFieldcontextname = new StringTextField(); // Generated
                fStringTextFieldcontextname
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcontextname;
    }

    /**
     * This method initializes fJLabelcontextname
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcontextname() {
        if (fJLabelcontextname == null) {
            try {
                fJLabelcontextname = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcontextname.setText(resBundel
                        .getString("res_strcontextnameDisplayName")); // Generated
                fJLabelcontextname.setToolTipText(resBundel
                        .getString("res_strcontextnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcontextname;
    }

    /**
     * This method initializes fJPanelcontextname
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcontextname() {
        if (fJPanelcontextname == null) {
            try {
                fJPanelcontextname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcontextname.setLayout(layFlowLayout); // Generated
                fJPanelcontextname.add(getJLabelcontextname(), null); // Generated
                fJPanelcontextname.add(getStringTextFieldcontextname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcontextname;
    }
    // end DB field contextname

}
