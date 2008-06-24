package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.zapataconf.Zapataconf;

/**
 * <p>
 * ZapataconfDataPanel
 * </p>
 * Created : Thu Dec 29 12:23:17 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapataconfDataPanel.java,v 1.5 2005/12/29
 *          19:14:07 urs Exp $
 */
public class ZapataconfDataPanel extends SimpleDataObjectPanel {
    protected Zapataconf dataObject;

    // protected ZapataconfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZapataconfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZapataconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZapataconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZapataconfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ZapataconfCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
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
     * @param Zapataconf
     */
    public void setDataObject(Object aZapataconf) {
        // abstractdataObject = (AbstractConfigObject) aZapataconf;
        setDataObject((Zapataconf) aZapataconf);
        // dataObject = aZapataconf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zapataconf
     */
    public void setDataObject(Zapataconf aZapataconf) {
        // abstractdataObject = (AbstractConfigObject) aZapataconf;
        dataObject = aZapataconf;
        setConfigToWidget();
    }
    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
