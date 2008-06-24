package com.useit.jact.gui.musiconholdconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.musiconholdconf.MohClasses;

/**
 * <p>
 * MohClassesDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:57 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MohClassesDataPanel.java,v 1.4 2005/12/29
 *          19:14:27 urs Exp $
 */
public class MohClassesDataPanel extends SimpleDataObjectPanel {
    protected MohClasses dataObject;

    // protected MohClassesChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MohClassesDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMohClassesResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMohClassesResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MohClassesResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * MohClassesCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldname, fStringTextFieldplayer,
     * fStringTextFieldmohdir, fStringTextFieldmohpara, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (4) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelname(), null); // Generated
        this.add(getJPanelplayer(), null); // Generated
        this.add(getJPanelmohdir(), null); // Generated
        this.add(getJPanelmohpara(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldname.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldplayer.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldmohdir.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldmohpara.getDocument()
                .addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldname.setValue(dataObject.getName());
        fStringTextFieldplayer.setValue(dataObject.getPlayer());
        fStringTextFieldmohdir.setValue(dataObject.getMohdir());
        fStringTextFieldmohpara.setValue(dataObject.getMohpara());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setName(fStringTextFieldname.getValue());
        dataObject.setPlayer(fStringTextFieldplayer.getValue());
        dataObject.setMohdir(fStringTextFieldmohdir.getValue());
        dataObject.setMohpara(fStringTextFieldmohpara.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param MohClasses
     */
    public void setDataObject(Object aMohClasses) {
        // abstractdataObject = (AbstractConfigObject) aMohClasses;
        setDataObject((MohClasses) aMohClasses);
        // dataObject = aMohClasses;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param MohClasses
     */
    public void setDataObject(MohClasses aMohClasses) {
        // abstractdataObject = (AbstractConfigObject) aMohClasses;
        dataObject = aMohClasses;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldname;

    protected javax.swing.JLabel fJLabelname;

    protected javax.swing.JPanel fJPanelname;

    protected StringTextField fStringTextFieldplayer;

    protected javax.swing.JLabel fJLabelplayer;

    protected javax.swing.JPanel fJPanelplayer;

    protected StringTextField fStringTextFieldmohdir;

    protected javax.swing.JLabel fJLabelmohdir;

    protected javax.swing.JPanel fJPanelmohdir;

    protected StringTextField fStringTextFieldmohpara;

    protected javax.swing.JLabel fJLabelmohpara;

    protected javax.swing.JPanel fJPanelmohpara;

    // start DB field name
    /**
     * This method initializes fStringTextFieldname
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldname() {
        if (fStringTextFieldname == null) {
            try {
                fStringTextFieldname = new StringTextField(); // Generated
                fStringTextFieldname.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldname;
    }

    /**
     * This method initializes fJLabelname
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelname() {
        if (fJLabelname == null) {
            try {
                fJLabelname = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelname.setText(resBundel
                        .getString("res_strnameDisplayName")); // Generated
                fJLabelname.setToolTipText(resBundel
                        .getString("res_strnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelname;
    }

    /**
     * This method initializes fJPanelname
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelname() {
        if (fJPanelname == null) {
            try {
                fJPanelname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelname.setLayout(layFlowLayout); // Generated
                fJPanelname.add(getJLabelname(), null); // Generated
                fJPanelname.add(getStringTextFieldname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelname;
    }

    // end DB field name
    // start DB field player
    /**
     * This method initializes fStringTextFieldplayer
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldplayer() {
        if (fStringTextFieldplayer == null) {
            try {
                fStringTextFieldplayer = new StringTextField(); // Generated
                fStringTextFieldplayer.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldplayer;
    }

    /**
     * This method initializes fJLabelplayer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelplayer() {
        if (fJLabelplayer == null) {
            try {
                fJLabelplayer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelplayer.setText(resBundel
                        .getString("res_strplayerDisplayName")); // Generated
                fJLabelplayer.setToolTipText(resBundel
                        .getString("res_strplayerDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelplayer;
    }

    /**
     * This method initializes fJPanelplayer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelplayer() {
        if (fJPanelplayer == null) {
            try {
                fJPanelplayer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelplayer.setLayout(layFlowLayout); // Generated
                fJPanelplayer.add(getJLabelplayer(), null); // Generated
                fJPanelplayer.add(getStringTextFieldplayer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelplayer;
    }

    // end DB field player
    // start DB field mohdir
    /**
     * This method initializes fStringTextFieldmohdir
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmohdir() {
        if (fStringTextFieldmohdir == null) {
            try {
                fStringTextFieldmohdir = new StringTextField(); // Generated
                fStringTextFieldmohdir.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmohdir;
    }

    /**
     * This method initializes fJLabelmohdir
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmohdir() {
        if (fJLabelmohdir == null) {
            try {
                fJLabelmohdir = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmohdir.setText(resBundel
                        .getString("res_strmohdirDisplayName")); // Generated
                fJLabelmohdir.setToolTipText(resBundel
                        .getString("res_strmohdirDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmohdir;
    }

    /**
     * This method initializes fJPanelmohdir
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmohdir() {
        if (fJPanelmohdir == null) {
            try {
                fJPanelmohdir = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmohdir.setLayout(layFlowLayout); // Generated
                fJPanelmohdir.add(getJLabelmohdir(), null); // Generated
                fJPanelmohdir.add(getStringTextFieldmohdir(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmohdir;
    }

    // end DB field mohdir
    // start DB field mohpara
    /**
     * This method initializes fStringTextFieldmohpara
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmohpara() {
        if (fStringTextFieldmohpara == null) {
            try {
                fStringTextFieldmohpara = new StringTextField(); // Generated
                fStringTextFieldmohpara
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmohpara;
    }

    /**
     * This method initializes fJLabelmohpara
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmohpara() {
        if (fJLabelmohpara == null) {
            try {
                fJLabelmohpara = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmohpara.setText(resBundel
                        .getString("res_strmohparaDisplayName")); // Generated
                fJLabelmohpara.setToolTipText(resBundel
                        .getString("res_strmohparaDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmohpara;
    }

    /**
     * This method initializes fJPanelmohpara
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmohpara() {
        if (fJPanelmohpara == null) {
            try {
                fJPanelmohpara = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmohpara.setLayout(layFlowLayout); // Generated
                fJPanelmohpara.add(getJLabelmohpara(), null); // Generated
                fJPanelmohpara.add(getStringTextFieldmohpara(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmohpara;
    }
    // end DB field mohpara

}
