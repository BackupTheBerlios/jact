package com.useit.jact.gui.voicemailconf;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.voicemailconf.VoicemailConf;

/**
 * <p>
 * VoicemailConfDataPanel
 * </p>
 * Created : Fri Jan 13 20:29:28 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailConfDataPanel.java,v 1.6 2006/01/14
 *          15:00:12 urs Exp $
 */
public class VoicemailConfDataPanel extends SimpleDataObjectPanel {
    protected VoicemailConf dataObject;

    // protected VoicemailConfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public VoicemailConfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getVoicemailConfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getVoicemailConfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/VoicemailConfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * VoicemailConfCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
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
        // this.add(getJPanelvoicemailgeneral(),null);
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();

        // fJComboBoxvoicemailgeneral.addActionListener(textChangeAct);
    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);

        // fJComboBoxvoicemailgeneral.setSelectedItem(dataObject.getVoicemailgeneral());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
    }

    /**
     * setzt das DatenObject
     * 
     * @param VoicemailConf
     */
    public void setDataObject(Object aVoicemailConf) {
        // abstractdataObject = (AbstractConfigObject) aVoicemailConf;
        setDataObject((VoicemailConf) aVoicemailConf);
        // dataObject = aVoicemailConf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param VoicemailConf
     */
    public void setDataObject(VoicemailConf aVoicemailConf) {
        // abstractdataObject = (AbstractConfigObject) aVoicemailConf;
        dataObject = aVoicemailConf;
        setConfigToWidget();
    }
    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
