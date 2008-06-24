package com.useit.jact.gui.musiconholdconf;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;

/**
 * <p>
 * Music_on_HoldConfDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:57 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Music_on_HoldConfDataPanel.java,v 1.4
 *          2005/12/29 19:14:27 urs Exp $
 */
public class Music_on_HoldConfDataPanel extends SimpleDataObjectPanel {
    protected Music_on_HoldConf dataObject;

    // protected Music_on_HoldConfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Music_on_HoldConfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMusic_on_HoldConfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMusic_on_HoldConfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Music_on_HoldConfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * Music_on_HoldConfCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
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
        this.setSize(400, (0) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(0); // Generated
        this.setLayout(layGridLayout); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
    }

    /**
     * setzt das DatenObject
     * 
     * @param Music_on_HoldConf
     */
    public void setDataObject(Object aMusic_on_HoldConf) {
        // abstractdataObject = (AbstractConfigObject) aMusic_on_HoldConf;
        setDataObject((Music_on_HoldConf) aMusic_on_HoldConf);
        // dataObject = aMusic_on_HoldConf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Music_on_HoldConf
     */
    public void setDataObject(Music_on_HoldConf aMusic_on_HoldConf) {
        // abstractdataObject = (AbstractConfigObject) aMusic_on_HoldConf;
        dataObject = aMusic_on_HoldConf;
        setConfigToWidget();
    }
    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
