package com.useit.jact.gui.misdndriverconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;

/**
 * <p>
 * MisdnDriverConfDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:47 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnDriverConfDataPanel.java,v 1.3
 *          2005/12/29 19:14:20 urs Exp $
 */
public class MisdnDriverConfDataPanel extends SimpleDataObjectPanel {
    protected MisdnDriverConf dataObject;

    // protected MisdnDriverConfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnDriverConfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnDriverConfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnDriverConfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnDriverConfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * MisdnDriverConfCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fIntegerTextFieldpoll, fCustomCheckBoxpcm,
     * fIntegerTextFielddebug, }; dataChecker.initChecker(array); }
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
        this.add(getJPanelpoll(), null); // Generated
        this.add(getJPanelpcm(), null); // Generated
        this.add(getJPaneldebug(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fIntegerTextFieldpoll.getDocument().addDocumentListener(textChangeAct);
        fCustomCheckBoxpcm.getDocument().addDocumentListener(textChangeAct);
        fIntegerTextFielddebug.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fIntegerTextFieldpoll.setValue(dataObject.getPoll());
        fCustomCheckBoxpcm.setValue(dataObject.getPcm());
        fIntegerTextFielddebug.setValue(dataObject.getDebug());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setPoll(fIntegerTextFieldpoll.getValue());
        dataObject.setPcm(fCustomCheckBoxpcm.getValue());
        dataObject.setDebug(fIntegerTextFielddebug.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param MisdnDriverConf
     */
    public void setDataObject(Object aMisdnDriverConf) {
        // abstractdataObject = (AbstractConfigObject) aMisdnDriverConf;
        setDataObject((MisdnDriverConf) aMisdnDriverConf);
        // dataObject = aMisdnDriverConf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param MisdnDriverConf
     */
    public void setDataObject(MisdnDriverConf aMisdnDriverConf) {
        // abstractdataObject = (AbstractConfigObject) aMisdnDriverConf;
        dataObject = aMisdnDriverConf;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected IntegerTextField fIntegerTextFieldpoll;

    protected javax.swing.JLabel fJLabelpoll;

    protected javax.swing.JPanel fJPanelpoll;

    protected CustomCheckBox fCustomCheckBoxpcm;

    protected javax.swing.JLabel fJLabelpcm;

    protected javax.swing.JPanel fJPanelpcm;

    protected IntegerTextField fIntegerTextFielddebug;

    protected javax.swing.JLabel fJLabeldebug;

    protected javax.swing.JPanel fJPaneldebug;

    // start DB field poll
    /**
     * This method initializes fIntegerTextFieldpoll
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldpoll() {
        if (fIntegerTextFieldpoll == null) {
            try {
                fIntegerTextFieldpoll = new IntegerTextField(); // Generated
                fIntegerTextFieldpoll.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldpoll;
    }

    /**
     * This method initializes fJLabelpoll
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpoll() {
        if (fJLabelpoll == null) {
            try {
                fJLabelpoll = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpoll.setText(resBundel
                        .getString("res_strpollDisplayName")); // Generated
                fJLabelpoll.setToolTipText(resBundel
                        .getString("res_strpollDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpoll;
    }

    /**
     * This method initializes fJPanelpoll
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpoll() {
        if (fJPanelpoll == null) {
            try {
                fJPanelpoll = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpoll.setLayout(layFlowLayout); // Generated
                fJPanelpoll.add(getJLabelpoll(), null); // Generated
                fJPanelpoll.add(getIntegerTextFieldpoll(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpoll;
    }

    // end DB field poll
    // start DB field pcm
    /**
     * This method initializes fCustomCheckBoxpcm
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxpcm() {
        if (fCustomCheckBoxpcm == null) {
            try {
                fCustomCheckBoxpcm = new CustomCheckBox(); // Generated
                fCustomCheckBoxpcm.setPreferredSize(new java.awt.Dimension(150,
                        20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxpcm;
    }

    /**
     * This method initializes fJLabelpcm
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpcm() {
        if (fJLabelpcm == null) {
            try {
                fJLabelpcm = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpcm
                        .setText(resBundel.getString("res_strpcmDisplayName")); // Generated
                fJLabelpcm.setToolTipText(resBundel
                        .getString("res_strpcmDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpcm;
    }

    /**
     * This method initializes fJPanelpcm
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpcm() {
        if (fJPanelpcm == null) {
            try {
                fJPanelpcm = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpcm.setLayout(layFlowLayout); // Generated
                fJPanelpcm.add(getJLabelpcm(), null); // Generated
                fJPanelpcm.add(getCustomCheckBoxpcm(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpcm;
    }

    // end DB field pcm
    // start DB field debug
    /**
     * This method initializes fIntegerTextFielddebug
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFielddebug() {
        if (fIntegerTextFielddebug == null) {
            try {
                fIntegerTextFielddebug = new IntegerTextField(); // Generated
                fIntegerTextFielddebug.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFielddebug;
    }

    /**
     * This method initializes fJLabeldebug
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldebug() {
        if (fJLabeldebug == null) {
            try {
                fJLabeldebug = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldebug.setText(resBundel
                        .getString("res_strdebugDisplayName")); // Generated
                fJLabeldebug.setToolTipText(resBundel
                        .getString("res_strdebugDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldebug;
    }

    /**
     * This method initializes fJPaneldebug
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldebug() {
        if (fJPaneldebug == null) {
            try {
                fJPaneldebug = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldebug.setLayout(layFlowLayout); // Generated
                fJPaneldebug.add(getJLabeldebug(), null); // Generated
                fJPaneldebug.add(getIntegerTextFielddebug(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldebug;
    }
    // end DB field debug

}
