package com.useit.jact.gui.queueconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.model.queueconf.Queuegeneral;

/**
 * <p>
 * QueuegeneralDataPanel
 * </p>
 * Created : Sat Jan 14 16:05:59 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuegeneralDataPanel.java,v 1.5 2006/01/14
 *          15:44:47 urs Exp $
 */
public class QueuegeneralDataPanel extends SimpleDataObjectPanel {
    protected Queuegeneral dataObject;

    // protected QueuegeneralChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public QueuegeneralDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getQueuegeneralResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getQueuegeneralResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/QueuegeneralResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * QueuegeneralCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fCustomCheckBoxpersistentmembers, };
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
        this.add(getJPanelpersistentmembers(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fCustomCheckBoxpersistentmembers.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fCustomCheckBoxpersistentmembers.setValue(dataObject
                .getPersistentmembers());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setPersistentmembers(fCustomCheckBoxpersistentmembers
                .getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Queuegeneral
     */
    public void setDataObject(Object aQueuegeneral) {
        // abstractdataObject = (AbstractConfigObject) aQueuegeneral;
        setDataObject((Queuegeneral) aQueuegeneral);
        // dataObject = aQueuegeneral;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Queuegeneral
     */
    public void setDataObject(Queuegeneral aQueuegeneral) {
        // abstractdataObject = (AbstractConfigObject) aQueuegeneral;
        dataObject = aQueuegeneral;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected CustomCheckBox fCustomCheckBoxpersistentmembers;

    protected javax.swing.JLabel fJLabelpersistentmembers;

    protected javax.swing.JPanel fJPanelpersistentmembers;

    // start DB field persistentmembers
    /**
     * This method initializes fCustomCheckBoxpersistentmembers
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxpersistentmembers() {
        if (fCustomCheckBoxpersistentmembers == null) {
            try {
                fCustomCheckBoxpersistentmembers = new CustomCheckBox(); // Generated
                fCustomCheckBoxpersistentmembers
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxpersistentmembers;
    }

    /**
     * This method initializes fJLabelpersistentmembers
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpersistentmembers() {
        if (fJLabelpersistentmembers == null) {
            try {
                fJLabelpersistentmembers = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpersistentmembers.setText(resBundel
                        .getString("res_strpersistentmembersDisplayName")); // Generated
                fJLabelpersistentmembers.setToolTipText(resBundel
                        .getString("res_strpersistentmembersDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpersistentmembers;
    }

    /**
     * This method initializes fJPanelpersistentmembers
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpersistentmembers() {
        if (fJPanelpersistentmembers == null) {
            try {
                fJPanelpersistentmembers = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpersistentmembers.setLayout(layFlowLayout); // Generated
                fJPanelpersistentmembers
                        .add(getJLabelpersistentmembers(), null); // Generated
                fJPanelpersistentmembers.add(
                        getCustomCheckBoxpersistentmembers(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpersistentmembers;
    }
    // end DB field persistentmembers

}
