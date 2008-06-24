package com.useit.jact.gui.managerconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.managerconf.ManagergeneralSection;

/**
 * <p>
 * ManagergeneralSectionDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:19 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagergeneralSectionDataPanel.java,v 1.2
 *          2005/12/29 19:14:20 urs Exp $
 */
public class ManagergeneralSectionDataPanel extends SimpleDataObjectPanel {
    protected ManagergeneralSection dataObject;

    // protected ManagergeneralSectionChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ManagergeneralSectionDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getManagergeneralSectionResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getManagergeneralSectionResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ManagergeneralSectionResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ManagergeneralSectionCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldgeneralid, fCustomCheckBoxenabled,
     * fIntegerTextFieldportno, fStringTextFieldbindaddr, fIntegerTextFieldport, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (6) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(6); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelgeneralid(), null); // Generated
        this.add(getJPanelenabled(), null); // Generated
        this.add(getJPanelportno(), null); // Generated
        this.add(getJPanelbindaddr(), null); // Generated
        this.add(getJPanelport(), null); // Generated
        this.add(getJPanelfileid(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldgeneralid.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxenabled.getDocument().addDocumentListener(textChangeAct);
        fIntegerTextFieldportno.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldbindaddr.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldport.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldfileid.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldgeneralid.setValue(dataObject.getGeneralid());
        fCustomCheckBoxenabled.setValue(dataObject.getEnabled());
        fIntegerTextFieldportno.setValue(dataObject.getPortno());
        fStringTextFieldbindaddr.setValue(dataObject.getBindaddr());
        fIntegerTextFieldport.setValue(dataObject.getPort());
        fStringTextFieldfileid.setValue(dataObject.getFileid());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setGeneralid(fStringTextFieldgeneralid.getValue());
        dataObject.setEnabled(fCustomCheckBoxenabled.getValue());
        dataObject.setPortno(fIntegerTextFieldportno.getValue());
        dataObject.setBindaddr(fStringTextFieldbindaddr.getValue());
        dataObject.setPort(fIntegerTextFieldport.getValue());
        dataObject.setFileid(fStringTextFieldfileid.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param ManagergeneralSection
     */
    public void setDataObject(Object aManagergeneralSection) {
        // abstractdataObject = (AbstractConfigObject) aManagergeneralSection;
        setDataObject((ManagergeneralSection) aManagergeneralSection);
        // dataObject = aManagergeneralSection;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param ManagergeneralSection
     */
    public void setDataObject(ManagergeneralSection aManagergeneralSection) {
        // abstractdataObject = (AbstractConfigObject) aManagergeneralSection;
        dataObject = aManagergeneralSection;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldgeneralid;

    protected javax.swing.JLabel fJLabelgeneralid;

    protected javax.swing.JPanel fJPanelgeneralid;

    protected CustomCheckBox fCustomCheckBoxenabled;

    protected javax.swing.JLabel fJLabelenabled;

    protected javax.swing.JPanel fJPanelenabled;

    protected IntegerTextField fIntegerTextFieldportno;

    protected javax.swing.JLabel fJLabelportno;

    protected javax.swing.JPanel fJPanelportno;

    protected StringTextField fStringTextFieldbindaddr;

    protected javax.swing.JLabel fJLabelbindaddr;

    protected javax.swing.JPanel fJPanelbindaddr;

    protected IntegerTextField fIntegerTextFieldport;

    protected javax.swing.JLabel fJLabelport;

    protected javax.swing.JPanel fJPanelport;

    protected StringTextField fStringTextFieldfileid;

    protected javax.swing.JLabel fJLabelfileid;

    protected javax.swing.JPanel fJPanelfileid;

    // start DB field generalid
    /**
     * This method initializes fStringTextFieldgeneralid
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldgeneralid() {
        if (fStringTextFieldgeneralid == null) {
            try {
                fStringTextFieldgeneralid = new StringTextField(); // Generated
                fStringTextFieldgeneralid
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldgeneralid;
    }

    /**
     * This method initializes fJLabelgeneralid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelgeneralid() {
        if (fJLabelgeneralid == null) {
            try {
                fJLabelgeneralid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelgeneralid.setText(resBundel
                        .getString("res_strgeneralidDisplayName")); // Generated
                fJLabelgeneralid.setToolTipText(resBundel
                        .getString("res_strgeneralidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelgeneralid;
    }

    /**
     * This method initializes fJPanelgeneralid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelgeneralid() {
        if (fJPanelgeneralid == null) {
            try {
                fJPanelgeneralid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelgeneralid.setLayout(layFlowLayout); // Generated
                fJPanelgeneralid.add(getJLabelgeneralid(), null); // Generated
                fJPanelgeneralid.add(getStringTextFieldgeneralid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelgeneralid;
    }

    // end DB field generalid
    // start DB field enabled
    /**
     * This method initializes fCustomCheckBoxenabled
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxenabled() {
        if (fCustomCheckBoxenabled == null) {
            try {
                fCustomCheckBoxenabled = new CustomCheckBox(); // Generated
                fCustomCheckBoxenabled.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxenabled;
    }

    /**
     * This method initializes fJLabelenabled
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelenabled() {
        if (fJLabelenabled == null) {
            try {
                fJLabelenabled = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelenabled.setText(resBundel
                        .getString("res_strenabledDisplayName")); // Generated
                fJLabelenabled.setToolTipText(resBundel
                        .getString("res_strenabledDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelenabled;
    }

    /**
     * This method initializes fJPanelenabled
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelenabled() {
        if (fJPanelenabled == null) {
            try {
                fJPanelenabled = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelenabled.setLayout(layFlowLayout); // Generated
                fJPanelenabled.add(getJLabelenabled(), null); // Generated
                fJPanelenabled.add(getCustomCheckBoxenabled(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelenabled;
    }

    // end DB field enabled
    // start DB field portno
    /**
     * This method initializes fIntegerTextFieldportno
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldportno() {
        if (fIntegerTextFieldportno == null) {
            try {
                fIntegerTextFieldportno = new IntegerTextField(); // Generated
                fIntegerTextFieldportno
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldportno;
    }

    /**
     * This method initializes fJLabelportno
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelportno() {
        if (fJLabelportno == null) {
            try {
                fJLabelportno = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelportno.setText(resBundel
                        .getString("res_strportnoDisplayName")); // Generated
                fJLabelportno.setToolTipText(resBundel
                        .getString("res_strportnoDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelportno;
    }

    /**
     * This method initializes fJPanelportno
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelportno() {
        if (fJPanelportno == null) {
            try {
                fJPanelportno = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelportno.setLayout(layFlowLayout); // Generated
                fJPanelportno.add(getJLabelportno(), null); // Generated
                fJPanelportno.add(getIntegerTextFieldportno(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelportno;
    }

    // end DB field portno
    // start DB field bindaddr
    /**
     * This method initializes fStringTextFieldbindaddr
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldbindaddr() {
        if (fStringTextFieldbindaddr == null) {
            try {
                fStringTextFieldbindaddr = new StringTextField(); // Generated
                fStringTextFieldbindaddr
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldbindaddr;
    }

    /**
     * This method initializes fJLabelbindaddr
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelbindaddr() {
        if (fJLabelbindaddr == null) {
            try {
                fJLabelbindaddr = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelbindaddr.setText(resBundel
                        .getString("res_strbindaddrDisplayName")); // Generated
                fJLabelbindaddr.setToolTipText(resBundel
                        .getString("res_strbindaddrDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelbindaddr;
    }

    /**
     * This method initializes fJPanelbindaddr
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelbindaddr() {
        if (fJPanelbindaddr == null) {
            try {
                fJPanelbindaddr = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelbindaddr.setLayout(layFlowLayout); // Generated
                fJPanelbindaddr.add(getJLabelbindaddr(), null); // Generated
                fJPanelbindaddr.add(getStringTextFieldbindaddr(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelbindaddr;
    }

    // end DB field bindaddr
    // start DB field port
    /**
     * This method initializes fIntegerTextFieldport
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldport() {
        if (fIntegerTextFieldport == null) {
            try {
                fIntegerTextFieldport = new IntegerTextField(); // Generated
                fIntegerTextFieldport.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldport;
    }

    /**
     * This method initializes fJLabelport
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelport() {
        if (fJLabelport == null) {
            try {
                fJLabelport = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelport.setText(resBundel
                        .getString("res_strportDisplayName")); // Generated
                fJLabelport.setToolTipText(resBundel
                        .getString("res_strportDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelport;
    }

    /**
     * This method initializes fJPanelport
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelport() {
        if (fJPanelport == null) {
            try {
                fJPanelport = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelport.setLayout(layFlowLayout); // Generated
                fJPanelport.add(getJLabelport(), null); // Generated
                fJPanelport.add(getIntegerTextFieldport(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelport;
    }

    // end DB field port
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
