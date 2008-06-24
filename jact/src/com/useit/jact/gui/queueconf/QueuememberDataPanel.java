package com.useit.jact.gui.queueconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.queueconf.Queuemember;

/**
 * <p>
 * QueuememberDataPanel
 * </p>
 * Created : Sat Jan 14 16:06:03 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuememberDataPanel.java,v 1.5 2006/01/14
 *          15:44:46 urs Exp $
 */
public class QueuememberDataPanel extends SimpleDataObjectPanel {
    protected Queuemember dataObject;

    // protected QueuememberChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public QueuememberDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getQueuememberResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getQueuememberResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/QueuememberResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * QueuememberCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFielddialstring, };
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
        this.add(getJPaneltech(), null); // Generated
        this.add(getJPaneldialstring(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldtech.getDocument().addDocumentListener(textChangeAct);
        fStringTextFielddialstring.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldtech.setValue(dataObject.getTech());
        fStringTextFielddialstring.setValue(dataObject.getDialstring());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setTech(fStringTextFieldtech.getValue());
        dataObject.setDialstring(fStringTextFielddialstring.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Queuemember
     */
    public void setDataObject(Object aQueuemember) {
        // abstractdataObject = (AbstractConfigObject) aQueuemember;
        setDataObject((Queuemember) aQueuemember);
        // dataObject = aQueuemember;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Queuemember
     */
    public void setDataObject(Queuemember aQueuemember) {
        // abstractdataObject = (AbstractConfigObject) aQueuemember;
        dataObject = aQueuemember;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtech;

    protected javax.swing.JLabel fJLabeltech;

    protected javax.swing.JPanel fJPaneltech;

    protected StringTextField fStringTextFielddialstring;

    protected javax.swing.JLabel fJLabeldialstring;

    protected javax.swing.JPanel fJPaneldialstring;

    // start DB field tech
    /**
     * This method initializes fStringTextFieldtech
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtech() {
        if (fStringTextFieldtech == null) {
            try {
                fStringTextFieldtech = new StringTextField(); // Generated
                fStringTextFieldtech.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtech;
    }

    /**
     * This method initializes fJLabeltech
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltech() {
        if (fJLabeltech == null) {
            try {
                fJLabeltech = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltech.setText(resBundel
                        .getString("res_strtechDisplayName")); // Generated
                fJLabeltech.setToolTipText(resBundel
                        .getString("res_strtechDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltech;
    }

    /**
     * This method initializes fJPaneltech
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltech() {
        if (fJPaneltech == null) {
            try {
                fJPaneltech = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltech.setLayout(layFlowLayout); // Generated
                fJPaneltech.add(getJLabeltech(), null); // Generated
                fJPaneltech.add(getStringTextFieldtech(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltech;
    }

    // end DB field tech
    // start DB field dialstring
    /**
     * This method initializes fStringTextFielddialstring
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddialstring() {
        if (fStringTextFielddialstring == null) {
            try {
                fStringTextFielddialstring = new StringTextField(); // Generated
                fStringTextFielddialstring
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddialstring;
    }

    /**
     * This method initializes fJLabeldialstring
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldialstring() {
        if (fJLabeldialstring == null) {
            try {
                fJLabeldialstring = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldialstring.setText(resBundel
                        .getString("res_strdialstringDisplayName")); // Generated
                fJLabeldialstring.setToolTipText(resBundel
                        .getString("res_strdialstringDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldialstring;
    }

    /**
     * This method initializes fJPaneldialstring
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldialstring() {
        if (fJPaneldialstring == null) {
            try {
                fJPaneldialstring = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldialstring.setLayout(layFlowLayout); // Generated
                fJPaneldialstring.add(getJLabeldialstring(), null); // Generated
                fJPaneldialstring.add(getStringTextFielddialstring(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldialstring;
    }
    // end DB field dialstring

}
