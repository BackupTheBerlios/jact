package com.useit.jact.gui.iaxconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.EnumSetTextFieldCodecs;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.JEnumComboboxAmaflags;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.iaxconf.Iaxgeneral;

/**
 * <p>
 * IaxgeneralDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:40 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxgeneralDataPanel.java,v 1.4 2005/12/29
 *          19:14:16 urs Exp $
 */
public class IaxgeneralDataPanel extends SimpleDataObjectPanel {
    protected Iaxgeneral dataObject;

    // protected IaxgeneralChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IaxgeneralDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIaxgeneralResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIaxgeneralResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IaxgeneralResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * IaxgeneralCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fIntegerTextFieldbindport, fStringTextFieldbindaddr,
     * fStringTextFieldiaxcompat, fCustomCheckBoxnochecksums,
     * fCustomCheckBoxdelayreject, fJEnumComboboxAmaflagsamaflags,
     * fStringTextFieldaccountcode, fStringTextFieldlanguage,
     * fStringTextFieldbandwidth, fIntegerTextFieldtrunktimestamps,
     * fStringTextFieldauthdebug, fStringTextFieldtos,
     * fCustomCheckBoxmailboxdetail, fStringTextFieldregcontext,
     * fCustomCheckBoxautokill, fStringTextFieldcodecpriority,
     * fIntegerTextFieldrtcachefriends, fCustomCheckBoxrtupdate,
     * fCustomCheckBoxrtautoclear, fCustomCheckBoxrtignoreexpire,
     * fIntegerTextFieldtrunkfreq, fEnumSetTextFieldCodecsdisallow,
     * fEnumSetTextFieldCodecsallow, fIntegerTextFieldminregexpire,
     * fIntegerTextFieldmaxregexpire, fCustomCheckBoxnotransfer, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (27) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(27); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelbindport(), null); // Generated
        this.add(getJPanelbindaddr(), null); // Generated
        this.add(getJPaneliaxcompat(), null); // Generated
        this.add(getJPanelnochecksums(), null); // Generated
        this.add(getJPaneldelayreject(), null); // Generated
        this.add(getJPanelamaflags(), null); // Generated
        this.add(getJPanelaccountcode(), null); // Generated
        this.add(getJPanellanguage(), null); // Generated
        this.add(getJPanelbandwidth(), null); // Generated
        this.add(getJPaneltrunktimestamps(), null); // Generated
        this.add(getJPanelauthdebug(), null); // Generated
        this.add(getJPaneltos(), null); // Generated
        this.add(getJPanelmailboxdetail(), null); // Generated
        this.add(getJPanelregcontext(), null); // Generated
        this.add(getJPanelautokill(), null); // Generated
        this.add(getJPanelcodecpriority(), null); // Generated
        this.add(getJPanelrtcachefriends(), null); // Generated
        this.add(getJPanelrtupdate(), null); // Generated
        this.add(getJPanelrtautoclear(), null); // Generated
        this.add(getJPanelrtignoreexpire(), null); // Generated
        this.add(getJPaneltrunkfreq(), null); // Generated
        this.add(getJPaneldisallow(), null); // Generated
        this.add(getJPanelallow(), null); // Generated
        this.add(getJPanelminregexpire(), null); // Generated
        this.add(getJPanelmaxregexpire(), null); // Generated
        this.add(getJPanelnotransfer(), null); // Generated
        // this.add(getJPaneliaxjitter(),null);
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fIntegerTextFieldbindport.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldbindaddr.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldiaxcompat.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxnochecksums.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxdelayreject.getDocument().addDocumentListener(
                textChangeAct);
        fJEnumComboboxAmaflagsamaflags.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldaccountcode.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldlanguage.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldbandwidth.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldtrunktimestamps.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldauthdebug.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldtos.getDocument().addDocumentListener(textChangeAct);
        fCustomCheckBoxmailboxdetail.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldregcontext.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxautokill.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldcodecpriority.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldrtcachefriends.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxrtupdate.getDocument()
                .addDocumentListener(textChangeAct);
        fCustomCheckBoxrtautoclear.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxrtignoreexpire.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldtrunkfreq.getDocument().addDocumentListener(
                textChangeAct);
        fEnumSetTextFieldCodecsdisallow.getDocument().addDocumentListener(
                textChangeAct);
        fEnumSetTextFieldCodecsallow.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldminregexpire.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldmaxregexpire.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxnotransfer.getDocument().addDocumentListener(
                textChangeAct);

        // fJComboBoxiaxjitter.addActionListener(textChangeAct);
    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fIntegerTextFieldbindport.setValue(dataObject.getBindport());
        fStringTextFieldbindaddr.setValue(dataObject.getBindaddr());
        fStringTextFieldiaxcompat.setValue(dataObject.getIaxcompat());
        fCustomCheckBoxnochecksums.setValue(dataObject.getNochecksums());
        fCustomCheckBoxdelayreject.setValue(dataObject.getDelayreject());
        fJEnumComboboxAmaflagsamaflags.setValue(dataObject.getAmaflags());
        fStringTextFieldaccountcode.setValue(dataObject.getAccountcode());
        fStringTextFieldlanguage.setValue(dataObject.getLanguage());
        fStringTextFieldbandwidth.setValue(dataObject.getBandwidth());
        fIntegerTextFieldtrunktimestamps.setValue(dataObject
                .getTrunktimestamps());
        fStringTextFieldauthdebug.setValue(dataObject.getAuthdebug());
        fStringTextFieldtos.setValue(dataObject.getTos());
        fCustomCheckBoxmailboxdetail.setValue(dataObject.getMailboxdetail());
        fStringTextFieldregcontext.setValue(dataObject.getRegcontext());
        fCustomCheckBoxautokill.setValue(dataObject.getAutokill());
        fStringTextFieldcodecpriority.setValue(dataObject.getCodecpriority());
        fIntegerTextFieldrtcachefriends
                .setValue(dataObject.getRtcachefriends());
        fCustomCheckBoxrtupdate.setValue(dataObject.getRtupdate());
        fCustomCheckBoxrtautoclear.setValue(dataObject.getRtautoclear());
        fCustomCheckBoxrtignoreexpire.setValue(dataObject.getRtignoreexpire());
        fIntegerTextFieldtrunkfreq.setValue(dataObject.getTrunkfreq());
        fEnumSetTextFieldCodecsdisallow.setValue(dataObject.getDisallow());
        fEnumSetTextFieldCodecsallow.setValue(dataObject.getAllow());
        fIntegerTextFieldminregexpire.setValue(dataObject.getMinregexpire());
        fIntegerTextFieldmaxregexpire.setValue(dataObject.getMaxregexpire());
        fCustomCheckBoxnotransfer.setValue(dataObject.getNotransfer());

        // fJComboBoxiaxjitter.setSelectedItem(dataObject.getIaxjitter());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setBindport(fIntegerTextFieldbindport.getValue());
        dataObject.setBindaddr(fStringTextFieldbindaddr.getValue());
        dataObject.setIaxcompat(fStringTextFieldiaxcompat.getValue());
        dataObject.setNochecksums(fCustomCheckBoxnochecksums.getValue());
        dataObject.setDelayreject(fCustomCheckBoxdelayreject.getValue());
        dataObject.setAmaflags(fJEnumComboboxAmaflagsamaflags.getValue());
        dataObject.setAccountcode(fStringTextFieldaccountcode.getValue());
        dataObject.setLanguage(fStringTextFieldlanguage.getValue());
        dataObject.setBandwidth(fStringTextFieldbandwidth.getValue());
        dataObject.setTrunktimestamps(fIntegerTextFieldtrunktimestamps
                .getValue());
        dataObject.setAuthdebug(fStringTextFieldauthdebug.getValue());
        dataObject.setTos(fStringTextFieldtos.getValue());
        dataObject.setMailboxdetail(fCustomCheckBoxmailboxdetail.getValue());
        dataObject.setRegcontext(fStringTextFieldregcontext.getValue());
        dataObject.setAutokill(fCustomCheckBoxautokill.getValue());
        dataObject.setCodecpriority(fStringTextFieldcodecpriority.getValue());
        dataObject
                .setRtcachefriends(fIntegerTextFieldrtcachefriends.getValue());
        dataObject.setRtupdate(fCustomCheckBoxrtupdate.getValue());
        dataObject.setRtautoclear(fCustomCheckBoxrtautoclear.getValue());
        dataObject.setRtignoreexpire(fCustomCheckBoxrtignoreexpire.getValue());
        dataObject.setTrunkfreq(fIntegerTextFieldtrunkfreq.getValue());
        dataObject.setDisallow(fEnumSetTextFieldCodecsdisallow.getValue());
        dataObject.setAllow(fEnumSetTextFieldCodecsallow.getValue());
        dataObject.setMinregexpire(fIntegerTextFieldminregexpire.getValue());
        dataObject.setMaxregexpire(fIntegerTextFieldmaxregexpire.getValue());
        dataObject.setNotransfer(fCustomCheckBoxnotransfer.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Iaxgeneral
     */
    public void setDataObject(Object aIaxgeneral) {
        // abstractdataObject = (AbstractConfigObject) aIaxgeneral;
        setDataObject((Iaxgeneral) aIaxgeneral);
        // dataObject = aIaxgeneral;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Iaxgeneral
     */
    public void setDataObject(Iaxgeneral aIaxgeneral) {
        // abstractdataObject = (AbstractConfigObject) aIaxgeneral;
        dataObject = aIaxgeneral;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected IntegerTextField fIntegerTextFieldbindport;

    protected javax.swing.JLabel fJLabelbindport;

    protected javax.swing.JPanel fJPanelbindport;

    protected StringTextField fStringTextFieldbindaddr;

    protected javax.swing.JLabel fJLabelbindaddr;

    protected javax.swing.JPanel fJPanelbindaddr;

    protected StringTextField fStringTextFieldiaxcompat;

    protected javax.swing.JLabel fJLabeliaxcompat;

    protected javax.swing.JPanel fJPaneliaxcompat;

    protected CustomCheckBox fCustomCheckBoxnochecksums;

    protected javax.swing.JLabel fJLabelnochecksums;

    protected javax.swing.JPanel fJPanelnochecksums;

    protected CustomCheckBox fCustomCheckBoxdelayreject;

    protected javax.swing.JLabel fJLabeldelayreject;

    protected javax.swing.JPanel fJPaneldelayreject;

    protected JEnumComboboxAmaflags fJEnumComboboxAmaflagsamaflags;

    protected javax.swing.JLabel fJLabelamaflags;

    protected javax.swing.JPanel fJPanelamaflags;

    protected StringTextField fStringTextFieldaccountcode;

    protected javax.swing.JLabel fJLabelaccountcode;

    protected javax.swing.JPanel fJPanelaccountcode;

    protected StringTextField fStringTextFieldlanguage;

    protected javax.swing.JLabel fJLabellanguage;

    protected javax.swing.JPanel fJPanellanguage;

    protected StringTextField fStringTextFieldbandwidth;

    protected javax.swing.JLabel fJLabelbandwidth;

    protected javax.swing.JPanel fJPanelbandwidth;

    protected IntegerTextField fIntegerTextFieldtrunktimestamps;

    protected javax.swing.JLabel fJLabeltrunktimestamps;

    protected javax.swing.JPanel fJPaneltrunktimestamps;

    protected StringTextField fStringTextFieldauthdebug;

    protected javax.swing.JLabel fJLabelauthdebug;

    protected javax.swing.JPanel fJPanelauthdebug;

    protected StringTextField fStringTextFieldtos;

    protected javax.swing.JLabel fJLabeltos;

    protected javax.swing.JPanel fJPaneltos;

    protected CustomCheckBox fCustomCheckBoxmailboxdetail;

    protected javax.swing.JLabel fJLabelmailboxdetail;

    protected javax.swing.JPanel fJPanelmailboxdetail;

    protected StringTextField fStringTextFieldregcontext;

    protected javax.swing.JLabel fJLabelregcontext;

    protected javax.swing.JPanel fJPanelregcontext;

    protected CustomCheckBox fCustomCheckBoxautokill;

    protected javax.swing.JLabel fJLabelautokill;

    protected javax.swing.JPanel fJPanelautokill;

    protected StringTextField fStringTextFieldcodecpriority;

    protected javax.swing.JLabel fJLabelcodecpriority;

    protected javax.swing.JPanel fJPanelcodecpriority;

    protected IntegerTextField fIntegerTextFieldrtcachefriends;

    protected javax.swing.JLabel fJLabelrtcachefriends;

    protected javax.swing.JPanel fJPanelrtcachefriends;

    protected CustomCheckBox fCustomCheckBoxrtupdate;

    protected javax.swing.JLabel fJLabelrtupdate;

    protected javax.swing.JPanel fJPanelrtupdate;

    protected CustomCheckBox fCustomCheckBoxrtautoclear;

    protected javax.swing.JLabel fJLabelrtautoclear;

    protected javax.swing.JPanel fJPanelrtautoclear;

    protected CustomCheckBox fCustomCheckBoxrtignoreexpire;

    protected javax.swing.JLabel fJLabelrtignoreexpire;

    protected javax.swing.JPanel fJPanelrtignoreexpire;

    protected IntegerTextField fIntegerTextFieldtrunkfreq;

    protected javax.swing.JLabel fJLabeltrunkfreq;

    protected javax.swing.JPanel fJPaneltrunkfreq;

    protected EnumSetTextFieldCodecs fEnumSetTextFieldCodecsdisallow;

    protected javax.swing.JLabel fJLabeldisallow;

    protected javax.swing.JPanel fJPaneldisallow;

    protected EnumSetTextFieldCodecs fEnumSetTextFieldCodecsallow;

    protected javax.swing.JLabel fJLabelallow;

    protected javax.swing.JPanel fJPanelallow;

    protected IntegerTextField fIntegerTextFieldminregexpire;

    protected javax.swing.JLabel fJLabelminregexpire;

    protected javax.swing.JPanel fJPanelminregexpire;

    protected IntegerTextField fIntegerTextFieldmaxregexpire;

    protected javax.swing.JLabel fJLabelmaxregexpire;

    protected javax.swing.JPanel fJPanelmaxregexpire;

    protected CustomCheckBox fCustomCheckBoxnotransfer;

    protected javax.swing.JLabel fJLabelnotransfer;

    protected javax.swing.JPanel fJPanelnotransfer;

    // start DB field bindport
    /**
     * This method initializes fIntegerTextFieldbindport
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldbindport() {
        if (fIntegerTextFieldbindport == null) {
            try {
                fIntegerTextFieldbindport = new IntegerTextField(); // Generated
                fIntegerTextFieldbindport
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldbindport;
    }

    /**
     * This method initializes fJLabelbindport
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelbindport() {
        if (fJLabelbindport == null) {
            try {
                fJLabelbindport = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelbindport.setText(resBundel
                        .getString("res_strbindportDisplayName")); // Generated
                fJLabelbindport.setToolTipText(resBundel
                        .getString("res_strbindportDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelbindport;
    }

    /**
     * This method initializes fJPanelbindport
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelbindport() {
        if (fJPanelbindport == null) {
            try {
                fJPanelbindport = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelbindport.setLayout(layFlowLayout); // Generated
                fJPanelbindport.add(getJLabelbindport(), null); // Generated
                fJPanelbindport.add(getIntegerTextFieldbindport(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelbindport;
    }

    // end DB field bindport
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
    // start DB field iaxcompat
    /**
     * This method initializes fStringTextFieldiaxcompat
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldiaxcompat() {
        if (fStringTextFieldiaxcompat == null) {
            try {
                fStringTextFieldiaxcompat = new StringTextField(); // Generated
                fStringTextFieldiaxcompat
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldiaxcompat;
    }

    /**
     * This method initializes fJLabeliaxcompat
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeliaxcompat() {
        if (fJLabeliaxcompat == null) {
            try {
                fJLabeliaxcompat = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeliaxcompat.setText(resBundel
                        .getString("res_striaxcompatDisplayName")); // Generated
                fJLabeliaxcompat.setToolTipText(resBundel
                        .getString("res_striaxcompatDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeliaxcompat;
    }

    /**
     * This method initializes fJPaneliaxcompat
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneliaxcompat() {
        if (fJPaneliaxcompat == null) {
            try {
                fJPaneliaxcompat = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneliaxcompat.setLayout(layFlowLayout); // Generated
                fJPaneliaxcompat.add(getJLabeliaxcompat(), null); // Generated
                fJPaneliaxcompat.add(getStringTextFieldiaxcompat(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneliaxcompat;
    }

    // end DB field iaxcompat
    // start DB field nochecksums
    /**
     * This method initializes fCustomCheckBoxnochecksums
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxnochecksums() {
        if (fCustomCheckBoxnochecksums == null) {
            try {
                fCustomCheckBoxnochecksums = new CustomCheckBox(); // Generated
                fCustomCheckBoxnochecksums
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxnochecksums;
    }

    /**
     * This method initializes fJLabelnochecksums
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnochecksums() {
        if (fJLabelnochecksums == null) {
            try {
                fJLabelnochecksums = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelnochecksums.setText(resBundel
                        .getString("res_strnochecksumsDisplayName")); // Generated
                fJLabelnochecksums.setToolTipText(resBundel
                        .getString("res_strnochecksumsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelnochecksums;
    }

    /**
     * This method initializes fJPanelnochecksums
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnochecksums() {
        if (fJPanelnochecksums == null) {
            try {
                fJPanelnochecksums = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnochecksums.setLayout(layFlowLayout); // Generated
                fJPanelnochecksums.add(getJLabelnochecksums(), null); // Generated
                fJPanelnochecksums.add(getCustomCheckBoxnochecksums(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnochecksums;
    }

    // end DB field nochecksums
    // start DB field delayreject
    /**
     * This method initializes fCustomCheckBoxdelayreject
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxdelayreject() {
        if (fCustomCheckBoxdelayreject == null) {
            try {
                fCustomCheckBoxdelayreject = new CustomCheckBox(); // Generated
                fCustomCheckBoxdelayreject
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxdelayreject;
    }

    /**
     * This method initializes fJLabeldelayreject
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldelayreject() {
        if (fJLabeldelayreject == null) {
            try {
                fJLabeldelayreject = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldelayreject.setText(resBundel
                        .getString("res_strdelayrejectDisplayName")); // Generated
                fJLabeldelayreject.setToolTipText(resBundel
                        .getString("res_strdelayrejectDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldelayreject;
    }

    /**
     * This method initializes fJPaneldelayreject
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldelayreject() {
        if (fJPaneldelayreject == null) {
            try {
                fJPaneldelayreject = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldelayreject.setLayout(layFlowLayout); // Generated
                fJPaneldelayreject.add(getJLabeldelayreject(), null); // Generated
                fJPaneldelayreject.add(getCustomCheckBoxdelayreject(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldelayreject;
    }

    // end DB field delayreject
    // start DB field amaflags
    /**
     * This method initializes fJEnumComboboxAmaflagsamaflags
     * 
     * @return JEnumComboboxAmaflags
     */
    public JEnumComboboxAmaflags getJEnumComboboxAmaflagsamaflags() {
        if (fJEnumComboboxAmaflagsamaflags == null) {
            try {
                fJEnumComboboxAmaflagsamaflags = new JEnumComboboxAmaflags(); // Generated
                fJEnumComboboxAmaflagsamaflags
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxAmaflagsamaflags;
    }

    /**
     * This method initializes fJLabelamaflags
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelamaflags() {
        if (fJLabelamaflags == null) {
            try {
                fJLabelamaflags = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelamaflags.setText(resBundel
                        .getString("res_stramaflagsDisplayName")); // Generated
                fJLabelamaflags.setToolTipText(resBundel
                        .getString("res_stramaflagsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelamaflags;
    }

    /**
     * This method initializes fJPanelamaflags
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelamaflags() {
        if (fJPanelamaflags == null) {
            try {
                fJPanelamaflags = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelamaflags.setLayout(layFlowLayout); // Generated
                fJPanelamaflags.add(getJLabelamaflags(), null); // Generated
                fJPanelamaflags.add(getJEnumComboboxAmaflagsamaflags(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelamaflags;
    }

    // end DB field amaflags
    // start DB field accountcode
    /**
     * This method initializes fStringTextFieldaccountcode
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldaccountcode() {
        if (fStringTextFieldaccountcode == null) {
            try {
                fStringTextFieldaccountcode = new StringTextField(); // Generated
                fStringTextFieldaccountcode
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldaccountcode;
    }

    /**
     * This method initializes fJLabelaccountcode
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelaccountcode() {
        if (fJLabelaccountcode == null) {
            try {
                fJLabelaccountcode = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelaccountcode.setText(resBundel
                        .getString("res_straccountcodeDisplayName")); // Generated
                fJLabelaccountcode.setToolTipText(resBundel
                        .getString("res_straccountcodeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelaccountcode;
    }

    /**
     * This method initializes fJPanelaccountcode
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelaccountcode() {
        if (fJPanelaccountcode == null) {
            try {
                fJPanelaccountcode = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelaccountcode.setLayout(layFlowLayout); // Generated
                fJPanelaccountcode.add(getJLabelaccountcode(), null); // Generated
                fJPanelaccountcode.add(getStringTextFieldaccountcode(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelaccountcode;
    }

    // end DB field accountcode
    // start DB field language
    /**
     * This method initializes fStringTextFieldlanguage
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlanguage() {
        if (fStringTextFieldlanguage == null) {
            try {
                fStringTextFieldlanguage = new StringTextField(); // Generated
                fStringTextFieldlanguage
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlanguage;
    }

    /**
     * This method initializes fJLabellanguage
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellanguage() {
        if (fJLabellanguage == null) {
            try {
                fJLabellanguage = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabellanguage.setText(resBundel
                        .getString("res_strlanguageDisplayName")); // Generated
                fJLabellanguage.setToolTipText(resBundel
                        .getString("res_strlanguageDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabellanguage;
    }

    /**
     * This method initializes fJPanellanguage
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellanguage() {
        if (fJPanellanguage == null) {
            try {
                fJPanellanguage = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellanguage.setLayout(layFlowLayout); // Generated
                fJPanellanguage.add(getJLabellanguage(), null); // Generated
                fJPanellanguage.add(getStringTextFieldlanguage(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellanguage;
    }

    // end DB field language
    // start DB field bandwidth
    /**
     * This method initializes fStringTextFieldbandwidth
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldbandwidth() {
        if (fStringTextFieldbandwidth == null) {
            try {
                fStringTextFieldbandwidth = new StringTextField(); // Generated
                fStringTextFieldbandwidth
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldbandwidth;
    }

    /**
     * This method initializes fJLabelbandwidth
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelbandwidth() {
        if (fJLabelbandwidth == null) {
            try {
                fJLabelbandwidth = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelbandwidth.setText(resBundel
                        .getString("res_strbandwidthDisplayName")); // Generated
                fJLabelbandwidth.setToolTipText(resBundel
                        .getString("res_strbandwidthDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelbandwidth;
    }

    /**
     * This method initializes fJPanelbandwidth
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelbandwidth() {
        if (fJPanelbandwidth == null) {
            try {
                fJPanelbandwidth = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelbandwidth.setLayout(layFlowLayout); // Generated
                fJPanelbandwidth.add(getJLabelbandwidth(), null); // Generated
                fJPanelbandwidth.add(getStringTextFieldbandwidth(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelbandwidth;
    }

    // end DB field bandwidth
    // start DB field trunktimestamps
    /**
     * This method initializes fIntegerTextFieldtrunktimestamps
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldtrunktimestamps() {
        if (fIntegerTextFieldtrunktimestamps == null) {
            try {
                fIntegerTextFieldtrunktimestamps = new IntegerTextField(); // Generated
                fIntegerTextFieldtrunktimestamps
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldtrunktimestamps;
    }

    /**
     * This method initializes fJLabeltrunktimestamps
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltrunktimestamps() {
        if (fJLabeltrunktimestamps == null) {
            try {
                fJLabeltrunktimestamps = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltrunktimestamps.setText(resBundel
                        .getString("res_strtrunktimestampsDisplayName")); // Generated
                fJLabeltrunktimestamps.setToolTipText(resBundel
                        .getString("res_strtrunktimestampsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltrunktimestamps;
    }

    /**
     * This method initializes fJPaneltrunktimestamps
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltrunktimestamps() {
        if (fJPaneltrunktimestamps == null) {
            try {
                fJPaneltrunktimestamps = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltrunktimestamps.setLayout(layFlowLayout); // Generated
                fJPaneltrunktimestamps.add(getJLabeltrunktimestamps(), null); // Generated
                fJPaneltrunktimestamps.add(
                        getIntegerTextFieldtrunktimestamps(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltrunktimestamps;
    }

    // end DB field trunktimestamps
    // start DB field authdebug
    /**
     * This method initializes fStringTextFieldauthdebug
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldauthdebug() {
        if (fStringTextFieldauthdebug == null) {
            try {
                fStringTextFieldauthdebug = new StringTextField(); // Generated
                fStringTextFieldauthdebug
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldauthdebug;
    }

    /**
     * This method initializes fJLabelauthdebug
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelauthdebug() {
        if (fJLabelauthdebug == null) {
            try {
                fJLabelauthdebug = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelauthdebug.setText(resBundel
                        .getString("res_strauthdebugDisplayName")); // Generated
                fJLabelauthdebug.setToolTipText(resBundel
                        .getString("res_strauthdebugDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelauthdebug;
    }

    /**
     * This method initializes fJPanelauthdebug
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelauthdebug() {
        if (fJPanelauthdebug == null) {
            try {
                fJPanelauthdebug = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelauthdebug.setLayout(layFlowLayout); // Generated
                fJPanelauthdebug.add(getJLabelauthdebug(), null); // Generated
                fJPanelauthdebug.add(getStringTextFieldauthdebug(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelauthdebug;
    }

    // end DB field authdebug
    // start DB field tos
    /**
     * This method initializes fStringTextFieldtos
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtos() {
        if (fStringTextFieldtos == null) {
            try {
                fStringTextFieldtos = new StringTextField(); // Generated
                fStringTextFieldtos.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtos;
    }

    /**
     * This method initializes fJLabeltos
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltos() {
        if (fJLabeltos == null) {
            try {
                fJLabeltos = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltos
                        .setText(resBundel.getString("res_strtosDisplayName")); // Generated
                fJLabeltos.setToolTipText(resBundel
                        .getString("res_strtosDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltos;
    }

    /**
     * This method initializes fJPaneltos
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltos() {
        if (fJPaneltos == null) {
            try {
                fJPaneltos = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltos.setLayout(layFlowLayout); // Generated
                fJPaneltos.add(getJLabeltos(), null); // Generated
                fJPaneltos.add(getStringTextFieldtos(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltos;
    }

    // end DB field tos
    // start DB field mailboxdetail
    /**
     * This method initializes fCustomCheckBoxmailboxdetail
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxmailboxdetail() {
        if (fCustomCheckBoxmailboxdetail == null) {
            try {
                fCustomCheckBoxmailboxdetail = new CustomCheckBox(); // Generated
                fCustomCheckBoxmailboxdetail
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxmailboxdetail;
    }

    /**
     * This method initializes fJLabelmailboxdetail
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmailboxdetail() {
        if (fJLabelmailboxdetail == null) {
            try {
                fJLabelmailboxdetail = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmailboxdetail.setText(resBundel
                        .getString("res_strmailboxdetailDisplayName")); // Generated
                fJLabelmailboxdetail.setToolTipText(resBundel
                        .getString("res_strmailboxdetailDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmailboxdetail;
    }

    /**
     * This method initializes fJPanelmailboxdetail
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmailboxdetail() {
        if (fJPanelmailboxdetail == null) {
            try {
                fJPanelmailboxdetail = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmailboxdetail.setLayout(layFlowLayout); // Generated
                fJPanelmailboxdetail.add(getJLabelmailboxdetail(), null); // Generated
                fJPanelmailboxdetail
                        .add(getCustomCheckBoxmailboxdetail(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmailboxdetail;
    }

    // end DB field mailboxdetail
    // start DB field regcontext
    /**
     * This method initializes fStringTextFieldregcontext
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldregcontext() {
        if (fStringTextFieldregcontext == null) {
            try {
                fStringTextFieldregcontext = new StringTextField(); // Generated
                fStringTextFieldregcontext
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldregcontext;
    }

    /**
     * This method initializes fJLabelregcontext
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelregcontext() {
        if (fJLabelregcontext == null) {
            try {
                fJLabelregcontext = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelregcontext.setText(resBundel
                        .getString("res_strregcontextDisplayName")); // Generated
                fJLabelregcontext.setToolTipText(resBundel
                        .getString("res_strregcontextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelregcontext;
    }

    /**
     * This method initializes fJPanelregcontext
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelregcontext() {
        if (fJPanelregcontext == null) {
            try {
                fJPanelregcontext = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelregcontext.setLayout(layFlowLayout); // Generated
                fJPanelregcontext.add(getJLabelregcontext(), null); // Generated
                fJPanelregcontext.add(getStringTextFieldregcontext(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelregcontext;
    }

    // end DB field regcontext
    // start DB field autokill
    /**
     * This method initializes fCustomCheckBoxautokill
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxautokill() {
        if (fCustomCheckBoxautokill == null) {
            try {
                fCustomCheckBoxautokill = new CustomCheckBox(); // Generated
                fCustomCheckBoxautokill
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxautokill;
    }

    /**
     * This method initializes fJLabelautokill
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelautokill() {
        if (fJLabelautokill == null) {
            try {
                fJLabelautokill = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelautokill.setText(resBundel
                        .getString("res_strautokillDisplayName")); // Generated
                fJLabelautokill.setToolTipText(resBundel
                        .getString("res_strautokillDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelautokill;
    }

    /**
     * This method initializes fJPanelautokill
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelautokill() {
        if (fJPanelautokill == null) {
            try {
                fJPanelautokill = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelautokill.setLayout(layFlowLayout); // Generated
                fJPanelautokill.add(getJLabelautokill(), null); // Generated
                fJPanelautokill.add(getCustomCheckBoxautokill(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelautokill;
    }

    // end DB field autokill
    // start DB field codecpriority
    /**
     * This method initializes fStringTextFieldcodecpriority
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcodecpriority() {
        if (fStringTextFieldcodecpriority == null) {
            try {
                fStringTextFieldcodecpriority = new StringTextField(); // Generated
                fStringTextFieldcodecpriority
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcodecpriority;
    }

    /**
     * This method initializes fJLabelcodecpriority
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcodecpriority() {
        if (fJLabelcodecpriority == null) {
            try {
                fJLabelcodecpriority = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcodecpriority.setText(resBundel
                        .getString("res_strcodecpriorityDisplayName")); // Generated
                fJLabelcodecpriority.setToolTipText(resBundel
                        .getString("res_strcodecpriorityDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcodecpriority;
    }

    /**
     * This method initializes fJPanelcodecpriority
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcodecpriority() {
        if (fJPanelcodecpriority == null) {
            try {
                fJPanelcodecpriority = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcodecpriority.setLayout(layFlowLayout); // Generated
                fJPanelcodecpriority.add(getJLabelcodecpriority(), null); // Generated
                fJPanelcodecpriority.add(getStringTextFieldcodecpriority(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcodecpriority;
    }

    // end DB field codecpriority
    // start DB field rtcachefriends
    /**
     * This method initializes fIntegerTextFieldrtcachefriends
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldrtcachefriends() {
        if (fIntegerTextFieldrtcachefriends == null) {
            try {
                fIntegerTextFieldrtcachefriends = new IntegerTextField(); // Generated
                fIntegerTextFieldrtcachefriends
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldrtcachefriends;
    }

    /**
     * This method initializes fJLabelrtcachefriends
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrtcachefriends() {
        if (fJLabelrtcachefriends == null) {
            try {
                fJLabelrtcachefriends = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrtcachefriends.setText(resBundel
                        .getString("res_strrtcachefriendsDisplayName")); // Generated
                fJLabelrtcachefriends.setToolTipText(resBundel
                        .getString("res_strrtcachefriendsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrtcachefriends;
    }

    /**
     * This method initializes fJPanelrtcachefriends
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrtcachefriends() {
        if (fJPanelrtcachefriends == null) {
            try {
                fJPanelrtcachefriends = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrtcachefriends.setLayout(layFlowLayout); // Generated
                fJPanelrtcachefriends.add(getJLabelrtcachefriends(), null); // Generated
                fJPanelrtcachefriends.add(getIntegerTextFieldrtcachefriends(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrtcachefriends;
    }

    // end DB field rtcachefriends
    // start DB field rtupdate
    /**
     * This method initializes fCustomCheckBoxrtupdate
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxrtupdate() {
        if (fCustomCheckBoxrtupdate == null) {
            try {
                fCustomCheckBoxrtupdate = new CustomCheckBox(); // Generated
                fCustomCheckBoxrtupdate
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxrtupdate;
    }

    /**
     * This method initializes fJLabelrtupdate
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrtupdate() {
        if (fJLabelrtupdate == null) {
            try {
                fJLabelrtupdate = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrtupdate.setText(resBundel
                        .getString("res_strrtupdateDisplayName")); // Generated
                fJLabelrtupdate.setToolTipText(resBundel
                        .getString("res_strrtupdateDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrtupdate;
    }

    /**
     * This method initializes fJPanelrtupdate
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrtupdate() {
        if (fJPanelrtupdate == null) {
            try {
                fJPanelrtupdate = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrtupdate.setLayout(layFlowLayout); // Generated
                fJPanelrtupdate.add(getJLabelrtupdate(), null); // Generated
                fJPanelrtupdate.add(getCustomCheckBoxrtupdate(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrtupdate;
    }

    // end DB field rtupdate
    // start DB field rtautoclear
    /**
     * This method initializes fCustomCheckBoxrtautoclear
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxrtautoclear() {
        if (fCustomCheckBoxrtautoclear == null) {
            try {
                fCustomCheckBoxrtautoclear = new CustomCheckBox(); // Generated
                fCustomCheckBoxrtautoclear
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxrtautoclear;
    }

    /**
     * This method initializes fJLabelrtautoclear
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrtautoclear() {
        if (fJLabelrtautoclear == null) {
            try {
                fJLabelrtautoclear = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrtautoclear.setText(resBundel
                        .getString("res_strrtautoclearDisplayName")); // Generated
                fJLabelrtautoclear.setToolTipText(resBundel
                        .getString("res_strrtautoclearDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrtautoclear;
    }

    /**
     * This method initializes fJPanelrtautoclear
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrtautoclear() {
        if (fJPanelrtautoclear == null) {
            try {
                fJPanelrtautoclear = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrtautoclear.setLayout(layFlowLayout); // Generated
                fJPanelrtautoclear.add(getJLabelrtautoclear(), null); // Generated
                fJPanelrtautoclear.add(getCustomCheckBoxrtautoclear(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrtautoclear;
    }

    // end DB field rtautoclear
    // start DB field rtignoreexpire
    /**
     * This method initializes fCustomCheckBoxrtignoreexpire
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxrtignoreexpire() {
        if (fCustomCheckBoxrtignoreexpire == null) {
            try {
                fCustomCheckBoxrtignoreexpire = new CustomCheckBox(); // Generated
                fCustomCheckBoxrtignoreexpire
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxrtignoreexpire;
    }

    /**
     * This method initializes fJLabelrtignoreexpire
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrtignoreexpire() {
        if (fJLabelrtignoreexpire == null) {
            try {
                fJLabelrtignoreexpire = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrtignoreexpire.setText(resBundel
                        .getString("res_strrtignoreexpireDisplayName")); // Generated
                fJLabelrtignoreexpire.setToolTipText(resBundel
                        .getString("res_strrtignoreexpireDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrtignoreexpire;
    }

    /**
     * This method initializes fJPanelrtignoreexpire
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrtignoreexpire() {
        if (fJPanelrtignoreexpire == null) {
            try {
                fJPanelrtignoreexpire = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrtignoreexpire.setLayout(layFlowLayout); // Generated
                fJPanelrtignoreexpire.add(getJLabelrtignoreexpire(), null); // Generated
                fJPanelrtignoreexpire.add(getCustomCheckBoxrtignoreexpire(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrtignoreexpire;
    }

    // end DB field rtignoreexpire
    // start DB field trunkfreq
    /**
     * This method initializes fIntegerTextFieldtrunkfreq
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldtrunkfreq() {
        if (fIntegerTextFieldtrunkfreq == null) {
            try {
                fIntegerTextFieldtrunkfreq = new IntegerTextField(); // Generated
                fIntegerTextFieldtrunkfreq
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldtrunkfreq;
    }

    /**
     * This method initializes fJLabeltrunkfreq
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltrunkfreq() {
        if (fJLabeltrunkfreq == null) {
            try {
                fJLabeltrunkfreq = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltrunkfreq.setText(resBundel
                        .getString("res_strtrunkfreqDisplayName")); // Generated
                fJLabeltrunkfreq.setToolTipText(resBundel
                        .getString("res_strtrunkfreqDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltrunkfreq;
    }

    /**
     * This method initializes fJPaneltrunkfreq
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltrunkfreq() {
        if (fJPaneltrunkfreq == null) {
            try {
                fJPaneltrunkfreq = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltrunkfreq.setLayout(layFlowLayout); // Generated
                fJPaneltrunkfreq.add(getJLabeltrunkfreq(), null); // Generated
                fJPaneltrunkfreq.add(getIntegerTextFieldtrunkfreq(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltrunkfreq;
    }

    // end DB field trunkfreq
    // start DB field disallow
    /**
     * This method initializes fEnumSetTextFieldCodecsdisallow
     * 
     * @return EnumSetTextFieldCodecs
     */
    public EnumSetTextFieldCodecs getEnumSetTextFieldCodecsdisallow() {
        if (fEnumSetTextFieldCodecsdisallow == null) {
            try {
                fEnumSetTextFieldCodecsdisallow = new EnumSetTextFieldCodecs(); // Generated
                fEnumSetTextFieldCodecsdisallow
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fEnumSetTextFieldCodecsdisallow;
    }

    /**
     * This method initializes fJLabeldisallow
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldisallow() {
        if (fJLabeldisallow == null) {
            try {
                fJLabeldisallow = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldisallow.setText(resBundel
                        .getString("res_strdisallowDisplayName")); // Generated
                fJLabeldisallow.setToolTipText(resBundel
                        .getString("res_strdisallowDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldisallow;
    }

    /**
     * This method initializes fJPaneldisallow
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldisallow() {
        if (fJPaneldisallow == null) {
            try {
                fJPaneldisallow = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldisallow.setLayout(layFlowLayout); // Generated
                fJPaneldisallow.add(getJLabeldisallow(), null); // Generated
                fJPaneldisallow.add(getEnumSetTextFieldCodecsdisallow(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldisallow;
    }

    // end DB field disallow
    // start DB field allow
    /**
     * This method initializes fEnumSetTextFieldCodecsallow
     * 
     * @return EnumSetTextFieldCodecs
     */
    public EnumSetTextFieldCodecs getEnumSetTextFieldCodecsallow() {
        if (fEnumSetTextFieldCodecsallow == null) {
            try {
                fEnumSetTextFieldCodecsallow = new EnumSetTextFieldCodecs(); // Generated
                fEnumSetTextFieldCodecsallow
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fEnumSetTextFieldCodecsallow;
    }

    /**
     * This method initializes fJLabelallow
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelallow() {
        if (fJLabelallow == null) {
            try {
                fJLabelallow = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelallow.setText(resBundel
                        .getString("res_strallowDisplayName")); // Generated
                fJLabelallow.setToolTipText(resBundel
                        .getString("res_strallowDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelallow;
    }

    /**
     * This method initializes fJPanelallow
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelallow() {
        if (fJPanelallow == null) {
            try {
                fJPanelallow = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelallow.setLayout(layFlowLayout); // Generated
                fJPanelallow.add(getJLabelallow(), null); // Generated
                fJPanelallow.add(getEnumSetTextFieldCodecsallow(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelallow;
    }

    // end DB field allow
    // start DB field minregexpire
    /**
     * This method initializes fIntegerTextFieldminregexpire
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldminregexpire() {
        if (fIntegerTextFieldminregexpire == null) {
            try {
                fIntegerTextFieldminregexpire = new IntegerTextField(); // Generated
                fIntegerTextFieldminregexpire
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldminregexpire;
    }

    /**
     * This method initializes fJLabelminregexpire
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelminregexpire() {
        if (fJLabelminregexpire == null) {
            try {
                fJLabelminregexpire = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelminregexpire.setText(resBundel
                        .getString("res_strminregexpireDisplayName")); // Generated
                fJLabelminregexpire.setToolTipText(resBundel
                        .getString("res_strminregexpireDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelminregexpire;
    }

    /**
     * This method initializes fJPanelminregexpire
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelminregexpire() {
        if (fJPanelminregexpire == null) {
            try {
                fJPanelminregexpire = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelminregexpire.setLayout(layFlowLayout); // Generated
                fJPanelminregexpire.add(getJLabelminregexpire(), null); // Generated
                fJPanelminregexpire
                        .add(getIntegerTextFieldminregexpire(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelminregexpire;
    }

    // end DB field minregexpire
    // start DB field maxregexpire
    /**
     * This method initializes fIntegerTextFieldmaxregexpire
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldmaxregexpire() {
        if (fIntegerTextFieldmaxregexpire == null) {
            try {
                fIntegerTextFieldmaxregexpire = new IntegerTextField(); // Generated
                fIntegerTextFieldmaxregexpire
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldmaxregexpire;
    }

    /**
     * This method initializes fJLabelmaxregexpire
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxregexpire() {
        if (fJLabelmaxregexpire == null) {
            try {
                fJLabelmaxregexpire = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmaxregexpire.setText(resBundel
                        .getString("res_strmaxregexpireDisplayName")); // Generated
                fJLabelmaxregexpire.setToolTipText(resBundel
                        .getString("res_strmaxregexpireDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmaxregexpire;
    }

    /**
     * This method initializes fJPanelmaxregexpire
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxregexpire() {
        if (fJPanelmaxregexpire == null) {
            try {
                fJPanelmaxregexpire = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxregexpire.setLayout(layFlowLayout); // Generated
                fJPanelmaxregexpire.add(getJLabelmaxregexpire(), null); // Generated
                fJPanelmaxregexpire
                        .add(getIntegerTextFieldmaxregexpire(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxregexpire;
    }

    // end DB field maxregexpire
    // start DB field notransfer
    /**
     * This method initializes fCustomCheckBoxnotransfer
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxnotransfer() {
        if (fCustomCheckBoxnotransfer == null) {
            try {
                fCustomCheckBoxnotransfer = new CustomCheckBox(); // Generated
                fCustomCheckBoxnotransfer
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxnotransfer;
    }

    /**
     * This method initializes fJLabelnotransfer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnotransfer() {
        if (fJLabelnotransfer == null) {
            try {
                fJLabelnotransfer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelnotransfer.setText(resBundel
                        .getString("res_strnotransferDisplayName")); // Generated
                fJLabelnotransfer.setToolTipText(resBundel
                        .getString("res_strnotransferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelnotransfer;
    }

    /**
     * This method initializes fJPanelnotransfer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnotransfer() {
        if (fJPanelnotransfer == null) {
            try {
                fJPanelnotransfer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnotransfer.setLayout(layFlowLayout); // Generated
                fJPanelnotransfer.add(getJLabelnotransfer(), null); // Generated
                fJPanelnotransfer.add(getCustomCheckBoxnotransfer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnotransfer;
    }
    // end DB field notransfer

}
