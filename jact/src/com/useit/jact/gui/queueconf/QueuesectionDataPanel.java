package com.useit.jact.gui.queueconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.PbxContextTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.queueconf.Queuesection;

/**
 * <p>
 * QueuesectionDataPanel
 * </p>
 * Created : Sat Jan 14 16:06:01 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuesectionDataPanel.java,v 1.5 2006/01/14
 *          15:44:47 urs Exp $
 */
public class QueuesectionDataPanel extends SimpleDataObjectPanel {
    protected Queuesection dataObject;

    // protected QueuesectionChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public QueuesectionDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getQueuesectionResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getQueuesectionResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/QueuesectionResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * QueuesectionCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldsectionname, fStringTextFieldannounce,
     * fStringTextFieldstrategy, fIntegerTextFieldservicelevel,
     * fPbxContextTextFieldcontext, fIntegerTextFieldtimeout,
     * fIntegerTextFieldretry, fStringTextFieldweight,
     * fIntegerTextFieldwrapuptime, fIntegerTextFieldmaxlen,
     * fIntegerTextFieldannouncefrequency, fCustomCheckBoxannounceholdtime,
     * fStringTextFieldannounceroundseconds, fStringTextFieldmonitorformat,
     * fCustomCheckBoxmonitorjoin, fStringTextFieldjoinempty,
     * fStringTextFieldleavewhenempty, fCustomCheckBoxeventwhencalled,
     * fCustomCheckBoxeventmemberstatusoff, fCustomCheckBoxreportholdtime,
     * fIntegerTextFieldmemberdelay, fCustomCheckBoxtimeoutrestart, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (23) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(23); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelsectionname(), null); // Generated
        this.add(getJPanelmusiconhold(), null); // Generated
        this.add(getJPanelannounce(), null); // Generated
        this.add(getJPanelstrategy(), null); // Generated
        this.add(getJPanelservicelevel(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPaneltimeout(), null); // Generated
        this.add(getJPanelretry(), null); // Generated
        this.add(getJPanelweight(), null); // Generated
        this.add(getJPanelwrapuptime(), null); // Generated
        this.add(getJPanelmaxlen(), null); // Generated
        this.add(getJPanelannouncefrequency(), null); // Generated
        this.add(getJPanelannounceholdtime(), null); // Generated
        this.add(getJPanelannounceroundseconds(), null); // Generated
        this.add(getJPanelmonitorformat(), null); // Generated
        this.add(getJPanelmonitorjoin(), null); // Generated
        this.add(getJPaneljoinempty(), null); // Generated
        this.add(getJPanelleavewhenempty(), null); // Generated
        this.add(getJPaneleventwhencalled(), null); // Generated
        this.add(getJPaneleventmemberstatusoff(), null); // Generated
        this.add(getJPanelreportholdtime(), null); // Generated
        this.add(getJPanelmemberdelay(), null); // Generated
        this.add(getJPaneltimeoutrestart(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldsectionname.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldmusiconhold.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldannounce.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldstrategy.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldservicelevel.getDocument().addDocumentListener(
                textChangeAct);
        fPbxContextTextFieldcontext.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldtimeout.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldretry.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldweight.getDocument().addDocumentListener(textChangeAct);
        fIntegerTextFieldwrapuptime.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldmaxlen.getDocument()
                .addDocumentListener(textChangeAct);
        fIntegerTextFieldannouncefrequency.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxannounceholdtime.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldannounceroundseconds.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldmonitorformat.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxmonitorjoin.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldjoinempty.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldleavewhenempty.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxeventwhencalled.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxeventmemberstatusoff.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxreportholdtime.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldmemberdelay.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxtimeoutrestart.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldsectionname.setValue(dataObject.getSectionname());
        fStringTextFieldmusiconhold.setValue(dataObject.getMusiconhold());
        fStringTextFieldannounce.setValue(dataObject.getAnnounce());
        fStringTextFieldstrategy.setValue(dataObject.getStrategy());
        fIntegerTextFieldservicelevel.setValue(dataObject.getServicelevel());
        fPbxContextTextFieldcontext.setValue(dataObject.getContext());
        fIntegerTextFieldtimeout.setValue(dataObject.getTimeout());
        fIntegerTextFieldretry.setValue(dataObject.getRetry());
        fStringTextFieldweight.setValue(dataObject.getWeight());
        fIntegerTextFieldwrapuptime.setValue(dataObject.getWrapuptime());
        fIntegerTextFieldmaxlen.setValue(dataObject.getMaxlen());
        fIntegerTextFieldannouncefrequency.setValue(dataObject
                .getAnnouncefrequency());
        fCustomCheckBoxannounceholdtime.setValue(dataObject
                .getAnnounceholdtime());
        fStringTextFieldannounceroundseconds.setValue(dataObject
                .getAnnounceroundseconds());
        fStringTextFieldmonitorformat.setValue(dataObject.getMonitorformat());
        fCustomCheckBoxmonitorjoin.setValue(dataObject.getMonitorjoin());
        fStringTextFieldjoinempty.setValue(dataObject.getJoinempty());
        fStringTextFieldleavewhenempty.setValue(dataObject.getLeavewhenempty());
        fCustomCheckBoxeventwhencalled
                .setValue(dataObject.getEventwhencalled());
        fCustomCheckBoxeventmemberstatusoff.setValue(dataObject
                .getEventmemberstatusoff());
        fCustomCheckBoxreportholdtime.setValue(dataObject.getReportholdtime());
        fIntegerTextFieldmemberdelay.setValue(dataObject.getMemberdelay());
        fCustomCheckBoxtimeoutrestart.setValue(dataObject.getTimeoutrestart());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setSectionname(fStringTextFieldsectionname.getValue());
        dataObject.setMusiconhold(fStringTextFieldmusiconhold.getValue());
        dataObject.setAnnounce(fStringTextFieldannounce.getValue());
        dataObject.setStrategy(fStringTextFieldstrategy.getValue());
        dataObject.setServicelevel(fIntegerTextFieldservicelevel.getValue());
        dataObject.setContext(fPbxContextTextFieldcontext.getValue());
        dataObject.setTimeout(fIntegerTextFieldtimeout.getValue());
        dataObject.setRetry(fIntegerTextFieldretry.getValue());
        dataObject.setWeight(fStringTextFieldweight.getValue());
        dataObject.setWrapuptime(fIntegerTextFieldwrapuptime.getValue());
        dataObject.setMaxlen(fIntegerTextFieldmaxlen.getValue());
        dataObject.setAnnouncefrequency(fIntegerTextFieldannouncefrequency
                .getValue());
        dataObject.setAnnounceholdtime(fCustomCheckBoxannounceholdtime
                .getValue());
        dataObject.setAnnounceroundseconds(fStringTextFieldannounceroundseconds
                .getValue());
        dataObject.setMonitorformat(fStringTextFieldmonitorformat.getValue());
        dataObject.setMonitorjoin(fCustomCheckBoxmonitorjoin.getValue());
        dataObject.setJoinempty(fStringTextFieldjoinempty.getValue());
        dataObject.setLeavewhenempty(fStringTextFieldleavewhenempty.getValue());
        dataObject
                .setEventwhencalled(fCustomCheckBoxeventwhencalled.getValue());
        dataObject.setEventmemberstatusoff(fCustomCheckBoxeventmemberstatusoff
                .getValue());
        dataObject.setReportholdtime(fCustomCheckBoxreportholdtime.getValue());
        dataObject.setMemberdelay(fIntegerTextFieldmemberdelay.getValue());
        dataObject.setTimeoutrestart(fCustomCheckBoxtimeoutrestart.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Queuesection
     */
    public void setDataObject(Object aQueuesection) {
        // abstractdataObject = (AbstractConfigObject) aQueuesection;
        setDataObject((Queuesection) aQueuesection);
        // dataObject = aQueuesection;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Queuesection
     */
    public void setDataObject(Queuesection aQueuesection) {
        // abstractdataObject = (AbstractConfigObject) aQueuesection;
        dataObject = aQueuesection;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldsectionname;

    protected javax.swing.JLabel fJLabelsectionname;

    protected javax.swing.JPanel fJPanelsectionname;

    protected StringTextField fStringTextFieldmusiconhold;

    protected javax.swing.JLabel fJLabelmusiconhold;

    protected javax.swing.JPanel fJPanelmusiconhold;

    protected StringTextField fStringTextFieldannounce;

    protected javax.swing.JLabel fJLabelannounce;

    protected javax.swing.JPanel fJPanelannounce;

    protected StringTextField fStringTextFieldstrategy;

    protected javax.swing.JLabel fJLabelstrategy;

    protected javax.swing.JPanel fJPanelstrategy;

    protected IntegerTextField fIntegerTextFieldservicelevel;

    protected javax.swing.JLabel fJLabelservicelevel;

    protected javax.swing.JPanel fJPanelservicelevel;

    protected PbxContextTextField fPbxContextTextFieldcontext;

    protected javax.swing.JLabel fJLabelcontext;

    protected javax.swing.JPanel fJPanelcontext;

    protected IntegerTextField fIntegerTextFieldtimeout;

    protected javax.swing.JLabel fJLabeltimeout;

    protected javax.swing.JPanel fJPaneltimeout;

    protected IntegerTextField fIntegerTextFieldretry;

    protected javax.swing.JLabel fJLabelretry;

    protected javax.swing.JPanel fJPanelretry;

    protected StringTextField fStringTextFieldweight;

    protected javax.swing.JLabel fJLabelweight;

    protected javax.swing.JPanel fJPanelweight;

    protected IntegerTextField fIntegerTextFieldwrapuptime;

    protected javax.swing.JLabel fJLabelwrapuptime;

    protected javax.swing.JPanel fJPanelwrapuptime;

    protected IntegerTextField fIntegerTextFieldmaxlen;

    protected javax.swing.JLabel fJLabelmaxlen;

    protected javax.swing.JPanel fJPanelmaxlen;

    protected IntegerTextField fIntegerTextFieldannouncefrequency;

    protected javax.swing.JLabel fJLabelannouncefrequency;

    protected javax.swing.JPanel fJPanelannouncefrequency;

    protected CustomCheckBox fCustomCheckBoxannounceholdtime;

    protected javax.swing.JLabel fJLabelannounceholdtime;

    protected javax.swing.JPanel fJPanelannounceholdtime;

    protected StringTextField fStringTextFieldannounceroundseconds;

    protected javax.swing.JLabel fJLabelannounceroundseconds;

    protected javax.swing.JPanel fJPanelannounceroundseconds;

    protected StringTextField fStringTextFieldmonitorformat;

    protected javax.swing.JLabel fJLabelmonitorformat;

    protected javax.swing.JPanel fJPanelmonitorformat;

    protected CustomCheckBox fCustomCheckBoxmonitorjoin;

    protected javax.swing.JLabel fJLabelmonitorjoin;

    protected javax.swing.JPanel fJPanelmonitorjoin;

    protected StringTextField fStringTextFieldjoinempty;

    protected javax.swing.JLabel fJLabeljoinempty;

    protected javax.swing.JPanel fJPaneljoinempty;

    protected StringTextField fStringTextFieldleavewhenempty;

    protected javax.swing.JLabel fJLabelleavewhenempty;

    protected javax.swing.JPanel fJPanelleavewhenempty;

    protected CustomCheckBox fCustomCheckBoxeventwhencalled;

    protected javax.swing.JLabel fJLabeleventwhencalled;

    protected javax.swing.JPanel fJPaneleventwhencalled;

    protected CustomCheckBox fCustomCheckBoxeventmemberstatusoff;

    protected javax.swing.JLabel fJLabeleventmemberstatusoff;

    protected javax.swing.JPanel fJPaneleventmemberstatusoff;

    protected CustomCheckBox fCustomCheckBoxreportholdtime;

    protected javax.swing.JLabel fJLabelreportholdtime;

    protected javax.swing.JPanel fJPanelreportholdtime;

    protected IntegerTextField fIntegerTextFieldmemberdelay;

    protected javax.swing.JLabel fJLabelmemberdelay;

    protected javax.swing.JPanel fJPanelmemberdelay;

    protected CustomCheckBox fCustomCheckBoxtimeoutrestart;

    protected javax.swing.JLabel fJLabeltimeoutrestart;

    protected javax.swing.JPanel fJPaneltimeoutrestart;

    // start DB field sectionname
    /**
     * This method initializes fStringTextFieldsectionname
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsectionname() {
        if (fStringTextFieldsectionname == null) {
            try {
                fStringTextFieldsectionname = new StringTextField(); // Generated
                fStringTextFieldsectionname
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsectionname;
    }

    /**
     * This method initializes fJLabelsectionname
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsectionname() {
        if (fJLabelsectionname == null) {
            try {
                fJLabelsectionname = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelsectionname.setText(resBundel
                        .getString("res_strsectionnameDisplayName")); // Generated
                fJLabelsectionname.setToolTipText(resBundel
                        .getString("res_strsectionnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelsectionname;
    }

    /**
     * This method initializes fJPanelsectionname
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsectionname() {
        if (fJPanelsectionname == null) {
            try {
                fJPanelsectionname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsectionname.setLayout(layFlowLayout); // Generated
                fJPanelsectionname.add(getJLabelsectionname(), null); // Generated
                fJPanelsectionname.add(getStringTextFieldsectionname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsectionname;
    }

    // end DB field sectionname
    // start DB field musiconhold
    /**
     * This method initializes fStringTextFieldmusiconhold
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmusiconhold() {
        if (fStringTextFieldmusiconhold == null) {
            try {
                fStringTextFieldmusiconhold = new StringTextField(); // Generated
                fStringTextFieldmusiconhold
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmusiconhold;
    }

    /**
     * This method initializes fJLabelmusiconhold
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmusiconhold() {
        if (fJLabelmusiconhold == null) {
            try {
                fJLabelmusiconhold = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmusiconhold.setText(resBundel
                        .getString("res_strmusiconholdDisplayName")); // Generated
                fJLabelmusiconhold.setToolTipText(resBundel
                        .getString("res_strmusiconholdDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmusiconhold;
    }

    /**
     * This method initializes fJPanelmusiconhold
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmusiconhold() {
        if (fJPanelmusiconhold == null) {
            try {
                fJPanelmusiconhold = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmusiconhold.setLayout(layFlowLayout); // Generated
                fJPanelmusiconhold.add(getJLabelmusiconhold(), null); // Generated
                fJPanelmusiconhold.add(getStringTextFieldmusiconhold(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmusiconhold;
    }

    // end DB field musiconhold
    // start DB field announce
    /**
     * This method initializes fStringTextFieldannounce
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldannounce() {
        if (fStringTextFieldannounce == null) {
            try {
                fStringTextFieldannounce = new StringTextField(); // Generated
                fStringTextFieldannounce
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldannounce;
    }

    /**
     * This method initializes fJLabelannounce
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelannounce() {
        if (fJLabelannounce == null) {
            try {
                fJLabelannounce = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelannounce.setText(resBundel
                        .getString("res_strannounceDisplayName")); // Generated
                fJLabelannounce.setToolTipText(resBundel
                        .getString("res_strannounceDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelannounce;
    }

    /**
     * This method initializes fJPanelannounce
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelannounce() {
        if (fJPanelannounce == null) {
            try {
                fJPanelannounce = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelannounce.setLayout(layFlowLayout); // Generated
                fJPanelannounce.add(getJLabelannounce(), null); // Generated
                fJPanelannounce.add(getStringTextFieldannounce(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelannounce;
    }

    // end DB field announce
    // start DB field strategy
    /**
     * This method initializes fStringTextFieldstrategy
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldstrategy() {
        if (fStringTextFieldstrategy == null) {
            try {
                fStringTextFieldstrategy = new StringTextField(); // Generated
                fStringTextFieldstrategy
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldstrategy;
    }

    /**
     * This method initializes fJLabelstrategy
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelstrategy() {
        if (fJLabelstrategy == null) {
            try {
                fJLabelstrategy = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelstrategy.setText(resBundel
                        .getString("res_strstrategyDisplayName")); // Generated
                fJLabelstrategy.setToolTipText(resBundel
                        .getString("res_strstrategyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelstrategy;
    }

    /**
     * This method initializes fJPanelstrategy
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelstrategy() {
        if (fJPanelstrategy == null) {
            try {
                fJPanelstrategy = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelstrategy.setLayout(layFlowLayout); // Generated
                fJPanelstrategy.add(getJLabelstrategy(), null); // Generated
                fJPanelstrategy.add(getStringTextFieldstrategy(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelstrategy;
    }

    // end DB field strategy
    // start DB field servicelevel
    /**
     * This method initializes fIntegerTextFieldservicelevel
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldservicelevel() {
        if (fIntegerTextFieldservicelevel == null) {
            try {
                fIntegerTextFieldservicelevel = new IntegerTextField(); // Generated
                fIntegerTextFieldservicelevel
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldservicelevel;
    }

    /**
     * This method initializes fJLabelservicelevel
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelservicelevel() {
        if (fJLabelservicelevel == null) {
            try {
                fJLabelservicelevel = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelservicelevel.setText(resBundel
                        .getString("res_strservicelevelDisplayName")); // Generated
                fJLabelservicelevel.setToolTipText(resBundel
                        .getString("res_strservicelevelDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelservicelevel;
    }

    /**
     * This method initializes fJPanelservicelevel
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelservicelevel() {
        if (fJPanelservicelevel == null) {
            try {
                fJPanelservicelevel = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelservicelevel.setLayout(layFlowLayout); // Generated
                fJPanelservicelevel.add(getJLabelservicelevel(), null); // Generated
                fJPanelservicelevel
                        .add(getIntegerTextFieldservicelevel(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelservicelevel;
    }

    // end DB field servicelevel
    // start DB field context
    /**
     * This method initializes fPbxContextTextFieldcontext
     * 
     * @return PbxContextTextField
     */
    public PbxContextTextField getPbxContextTextFieldcontext() {
        if (fPbxContextTextFieldcontext == null) {
            try {
                fPbxContextTextFieldcontext = new PbxContextTextField(); // Generated
                fPbxContextTextFieldcontext
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fPbxContextTextFieldcontext;
    }

    /**
     * This method initializes fJLabelcontext
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcontext() {
        if (fJLabelcontext == null) {
            try {
                fJLabelcontext = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcontext.setText(resBundel
                        .getString("res_strcontextDisplayName")); // Generated
                fJLabelcontext.setToolTipText(resBundel
                        .getString("res_strcontextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcontext;
    }

    /**
     * This method initializes fJPanelcontext
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcontext() {
        if (fJPanelcontext == null) {
            try {
                fJPanelcontext = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcontext.setLayout(layFlowLayout); // Generated
                fJPanelcontext.add(getJLabelcontext(), null); // Generated
                fJPanelcontext.add(getPbxContextTextFieldcontext(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcontext;
    }

    // end DB field context
    // start DB field timeout
    /**
     * This method initializes fIntegerTextFieldtimeout
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldtimeout() {
        if (fIntegerTextFieldtimeout == null) {
            try {
                fIntegerTextFieldtimeout = new IntegerTextField(); // Generated
                fIntegerTextFieldtimeout
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldtimeout;
    }

    /**
     * This method initializes fJLabeltimeout
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimeout() {
        if (fJLabeltimeout == null) {
            try {
                fJLabeltimeout = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltimeout.setText(resBundel
                        .getString("res_strtimeoutDisplayName")); // Generated
                fJLabeltimeout.setToolTipText(resBundel
                        .getString("res_strtimeoutDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltimeout;
    }

    /**
     * This method initializes fJPaneltimeout
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimeout() {
        if (fJPaneltimeout == null) {
            try {
                fJPaneltimeout = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimeout.setLayout(layFlowLayout); // Generated
                fJPaneltimeout.add(getJLabeltimeout(), null); // Generated
                fJPaneltimeout.add(getIntegerTextFieldtimeout(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimeout;
    }

    // end DB field timeout
    // start DB field retry
    /**
     * This method initializes fIntegerTextFieldretry
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldretry() {
        if (fIntegerTextFieldretry == null) {
            try {
                fIntegerTextFieldretry = new IntegerTextField(); // Generated
                fIntegerTextFieldretry.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldretry;
    }

    /**
     * This method initializes fJLabelretry
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelretry() {
        if (fJLabelretry == null) {
            try {
                fJLabelretry = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelretry.setText(resBundel
                        .getString("res_strretryDisplayName")); // Generated
                fJLabelretry.setToolTipText(resBundel
                        .getString("res_strretryDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelretry;
    }

    /**
     * This method initializes fJPanelretry
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelretry() {
        if (fJPanelretry == null) {
            try {
                fJPanelretry = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelretry.setLayout(layFlowLayout); // Generated
                fJPanelretry.add(getJLabelretry(), null); // Generated
                fJPanelretry.add(getIntegerTextFieldretry(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelretry;
    }

    // end DB field retry
    // start DB field weight
    /**
     * This method initializes fStringTextFieldweight
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldweight() {
        if (fStringTextFieldweight == null) {
            try {
                fStringTextFieldweight = new StringTextField(); // Generated
                fStringTextFieldweight.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldweight;
    }

    /**
     * This method initializes fJLabelweight
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelweight() {
        if (fJLabelweight == null) {
            try {
                fJLabelweight = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelweight.setText(resBundel
                        .getString("res_strweightDisplayName")); // Generated
                fJLabelweight.setToolTipText(resBundel
                        .getString("res_strweightDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelweight;
    }

    /**
     * This method initializes fJPanelweight
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelweight() {
        if (fJPanelweight == null) {
            try {
                fJPanelweight = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelweight.setLayout(layFlowLayout); // Generated
                fJPanelweight.add(getJLabelweight(), null); // Generated
                fJPanelweight.add(getStringTextFieldweight(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelweight;
    }

    // end DB field weight
    // start DB field wrapuptime
    /**
     * This method initializes fIntegerTextFieldwrapuptime
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldwrapuptime() {
        if (fIntegerTextFieldwrapuptime == null) {
            try {
                fIntegerTextFieldwrapuptime = new IntegerTextField(); // Generated
                fIntegerTextFieldwrapuptime
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldwrapuptime;
    }

    /**
     * This method initializes fJLabelwrapuptime
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelwrapuptime() {
        if (fJLabelwrapuptime == null) {
            try {
                fJLabelwrapuptime = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelwrapuptime.setText(resBundel
                        .getString("res_strwrapuptimeDisplayName")); // Generated
                fJLabelwrapuptime.setToolTipText(resBundel
                        .getString("res_strwrapuptimeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelwrapuptime;
    }

    /**
     * This method initializes fJPanelwrapuptime
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelwrapuptime() {
        if (fJPanelwrapuptime == null) {
            try {
                fJPanelwrapuptime = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelwrapuptime.setLayout(layFlowLayout); // Generated
                fJPanelwrapuptime.add(getJLabelwrapuptime(), null); // Generated
                fJPanelwrapuptime.add(getIntegerTextFieldwrapuptime(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelwrapuptime;
    }

    // end DB field wrapuptime
    // start DB field maxlen
    /**
     * This method initializes fIntegerTextFieldmaxlen
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldmaxlen() {
        if (fIntegerTextFieldmaxlen == null) {
            try {
                fIntegerTextFieldmaxlen = new IntegerTextField(); // Generated
                fIntegerTextFieldmaxlen
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldmaxlen;
    }

    /**
     * This method initializes fJLabelmaxlen
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxlen() {
        if (fJLabelmaxlen == null) {
            try {
                fJLabelmaxlen = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmaxlen.setText(resBundel
                        .getString("res_strmaxlenDisplayName")); // Generated
                fJLabelmaxlen.setToolTipText(resBundel
                        .getString("res_strmaxlenDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmaxlen;
    }

    /**
     * This method initializes fJPanelmaxlen
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxlen() {
        if (fJPanelmaxlen == null) {
            try {
                fJPanelmaxlen = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxlen.setLayout(layFlowLayout); // Generated
                fJPanelmaxlen.add(getJLabelmaxlen(), null); // Generated
                fJPanelmaxlen.add(getIntegerTextFieldmaxlen(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxlen;
    }

    // end DB field maxlen
    // start DB field announcefrequency
    /**
     * This method initializes fIntegerTextFieldannouncefrequency
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldannouncefrequency() {
        if (fIntegerTextFieldannouncefrequency == null) {
            try {
                fIntegerTextFieldannouncefrequency = new IntegerTextField(); // Generated
                fIntegerTextFieldannouncefrequency
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldannouncefrequency;
    }

    /**
     * This method initializes fJLabelannouncefrequency
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelannouncefrequency() {
        if (fJLabelannouncefrequency == null) {
            try {
                fJLabelannouncefrequency = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelannouncefrequency.setText(resBundel
                        .getString("res_strannouncefrequencyDisplayName")); // Generated
                fJLabelannouncefrequency.setToolTipText(resBundel
                        .getString("res_strannouncefrequencyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelannouncefrequency;
    }

    /**
     * This method initializes fJPanelannouncefrequency
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelannouncefrequency() {
        if (fJPanelannouncefrequency == null) {
            try {
                fJPanelannouncefrequency = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelannouncefrequency.setLayout(layFlowLayout); // Generated
                fJPanelannouncefrequency
                        .add(getJLabelannouncefrequency(), null); // Generated
                fJPanelannouncefrequency.add(
                        getIntegerTextFieldannouncefrequency(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelannouncefrequency;
    }

    // end DB field announcefrequency
    // start DB field announceholdtime
    /**
     * This method initializes fCustomCheckBoxannounceholdtime
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxannounceholdtime() {
        if (fCustomCheckBoxannounceholdtime == null) {
            try {
                fCustomCheckBoxannounceholdtime = new CustomCheckBox(); // Generated
                fCustomCheckBoxannounceholdtime
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxannounceholdtime;
    }

    /**
     * This method initializes fJLabelannounceholdtime
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelannounceholdtime() {
        if (fJLabelannounceholdtime == null) {
            try {
                fJLabelannounceholdtime = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelannounceholdtime.setText(resBundel
                        .getString("res_strannounceholdtimeDisplayName")); // Generated
                fJLabelannounceholdtime.setToolTipText(resBundel
                        .getString("res_strannounceholdtimeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelannounceholdtime;
    }

    /**
     * This method initializes fJPanelannounceholdtime
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelannounceholdtime() {
        if (fJPanelannounceholdtime == null) {
            try {
                fJPanelannounceholdtime = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelannounceholdtime.setLayout(layFlowLayout); // Generated
                fJPanelannounceholdtime.add(getJLabelannounceholdtime(), null); // Generated
                fJPanelannounceholdtime.add(
                        getCustomCheckBoxannounceholdtime(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelannounceholdtime;
    }

    // end DB field announceholdtime
    // start DB field announceroundseconds
    /**
     * This method initializes fStringTextFieldannounceroundseconds
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldannounceroundseconds() {
        if (fStringTextFieldannounceroundseconds == null) {
            try {
                fStringTextFieldannounceroundseconds = new StringTextField(); // Generated
                fStringTextFieldannounceroundseconds
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldannounceroundseconds;
    }

    /**
     * This method initializes fJLabelannounceroundseconds
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelannounceroundseconds() {
        if (fJLabelannounceroundseconds == null) {
            try {
                fJLabelannounceroundseconds = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelannounceroundseconds.setText(resBundel
                        .getString("res_strannounceroundsecondsDisplayName")); // Generated
                fJLabelannounceroundseconds.setToolTipText(resBundel
                        .getString("res_strannounceroundsecondsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelannounceroundseconds;
    }

    /**
     * This method initializes fJPanelannounceroundseconds
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelannounceroundseconds() {
        if (fJPanelannounceroundseconds == null) {
            try {
                fJPanelannounceroundseconds = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelannounceroundseconds.setLayout(layFlowLayout); // Generated
                fJPanelannounceroundseconds.add(
                        getJLabelannounceroundseconds(), null); // Generated
                fJPanelannounceroundseconds.add(
                        getStringTextFieldannounceroundseconds(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelannounceroundseconds;
    }

    // end DB field announceroundseconds
    // start DB field monitorformat
    /**
     * This method initializes fStringTextFieldmonitorformat
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmonitorformat() {
        if (fStringTextFieldmonitorformat == null) {
            try {
                fStringTextFieldmonitorformat = new StringTextField(); // Generated
                fStringTextFieldmonitorformat
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmonitorformat;
    }

    /**
     * This method initializes fJLabelmonitorformat
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmonitorformat() {
        if (fJLabelmonitorformat == null) {
            try {
                fJLabelmonitorformat = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmonitorformat.setText(resBundel
                        .getString("res_strmonitorformatDisplayName")); // Generated
                fJLabelmonitorformat.setToolTipText(resBundel
                        .getString("res_strmonitorformatDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmonitorformat;
    }

    /**
     * This method initializes fJPanelmonitorformat
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmonitorformat() {
        if (fJPanelmonitorformat == null) {
            try {
                fJPanelmonitorformat = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmonitorformat.setLayout(layFlowLayout); // Generated
                fJPanelmonitorformat.add(getJLabelmonitorformat(), null); // Generated
                fJPanelmonitorformat.add(getStringTextFieldmonitorformat(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmonitorformat;
    }

    // end DB field monitorformat
    // start DB field monitorjoin
    /**
     * This method initializes fCustomCheckBoxmonitorjoin
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxmonitorjoin() {
        if (fCustomCheckBoxmonitorjoin == null) {
            try {
                fCustomCheckBoxmonitorjoin = new CustomCheckBox(); // Generated
                fCustomCheckBoxmonitorjoin
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxmonitorjoin;
    }

    /**
     * This method initializes fJLabelmonitorjoin
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmonitorjoin() {
        if (fJLabelmonitorjoin == null) {
            try {
                fJLabelmonitorjoin = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmonitorjoin.setText(resBundel
                        .getString("res_strmonitorjoinDisplayName")); // Generated
                fJLabelmonitorjoin.setToolTipText(resBundel
                        .getString("res_strmonitorjoinDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmonitorjoin;
    }

    /**
     * This method initializes fJPanelmonitorjoin
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmonitorjoin() {
        if (fJPanelmonitorjoin == null) {
            try {
                fJPanelmonitorjoin = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmonitorjoin.setLayout(layFlowLayout); // Generated
                fJPanelmonitorjoin.add(getJLabelmonitorjoin(), null); // Generated
                fJPanelmonitorjoin.add(getCustomCheckBoxmonitorjoin(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmonitorjoin;
    }

    // end DB field monitorjoin
    // start DB field joinempty
    /**
     * This method initializes fStringTextFieldjoinempty
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldjoinempty() {
        if (fStringTextFieldjoinempty == null) {
            try {
                fStringTextFieldjoinempty = new StringTextField(); // Generated
                fStringTextFieldjoinempty
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldjoinempty;
    }

    /**
     * This method initializes fJLabeljoinempty
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeljoinempty() {
        if (fJLabeljoinempty == null) {
            try {
                fJLabeljoinempty = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeljoinempty.setText(resBundel
                        .getString("res_strjoinemptyDisplayName")); // Generated
                fJLabeljoinempty.setToolTipText(resBundel
                        .getString("res_strjoinemptyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeljoinempty;
    }

    /**
     * This method initializes fJPaneljoinempty
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneljoinempty() {
        if (fJPaneljoinempty == null) {
            try {
                fJPaneljoinempty = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneljoinempty.setLayout(layFlowLayout); // Generated
                fJPaneljoinempty.add(getJLabeljoinempty(), null); // Generated
                fJPaneljoinempty.add(getStringTextFieldjoinempty(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneljoinempty;
    }

    // end DB field joinempty
    // start DB field leavewhenempty
    /**
     * This method initializes fStringTextFieldleavewhenempty
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldleavewhenempty() {
        if (fStringTextFieldleavewhenempty == null) {
            try {
                fStringTextFieldleavewhenempty = new StringTextField(); // Generated
                fStringTextFieldleavewhenempty
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldleavewhenempty;
    }

    /**
     * This method initializes fJLabelleavewhenempty
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelleavewhenempty() {
        if (fJLabelleavewhenempty == null) {
            try {
                fJLabelleavewhenempty = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelleavewhenempty.setText(resBundel
                        .getString("res_strleavewhenemptyDisplayName")); // Generated
                fJLabelleavewhenempty.setToolTipText(resBundel
                        .getString("res_strleavewhenemptyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelleavewhenempty;
    }

    /**
     * This method initializes fJPanelleavewhenempty
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelleavewhenempty() {
        if (fJPanelleavewhenempty == null) {
            try {
                fJPanelleavewhenempty = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelleavewhenempty.setLayout(layFlowLayout); // Generated
                fJPanelleavewhenempty.add(getJLabelleavewhenempty(), null); // Generated
                fJPanelleavewhenempty.add(getStringTextFieldleavewhenempty(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelleavewhenempty;
    }

    // end DB field leavewhenempty
    // start DB field eventwhencalled
    /**
     * This method initializes fCustomCheckBoxeventwhencalled
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxeventwhencalled() {
        if (fCustomCheckBoxeventwhencalled == null) {
            try {
                fCustomCheckBoxeventwhencalled = new CustomCheckBox(); // Generated
                fCustomCheckBoxeventwhencalled
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxeventwhencalled;
    }

    /**
     * This method initializes fJLabeleventwhencalled
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeleventwhencalled() {
        if (fJLabeleventwhencalled == null) {
            try {
                fJLabeleventwhencalled = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeleventwhencalled.setText(resBundel
                        .getString("res_streventwhencalledDisplayName")); // Generated
                fJLabeleventwhencalled.setToolTipText(resBundel
                        .getString("res_streventwhencalledDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeleventwhencalled;
    }

    /**
     * This method initializes fJPaneleventwhencalled
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneleventwhencalled() {
        if (fJPaneleventwhencalled == null) {
            try {
                fJPaneleventwhencalled = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneleventwhencalled.setLayout(layFlowLayout); // Generated
                fJPaneleventwhencalled.add(getJLabeleventwhencalled(), null); // Generated
                fJPaneleventwhencalled.add(getCustomCheckBoxeventwhencalled(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneleventwhencalled;
    }

    // end DB field eventwhencalled
    // start DB field eventmemberstatusoff
    /**
     * This method initializes fCustomCheckBoxeventmemberstatusoff
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxeventmemberstatusoff() {
        if (fCustomCheckBoxeventmemberstatusoff == null) {
            try {
                fCustomCheckBoxeventmemberstatusoff = new CustomCheckBox(); // Generated
                fCustomCheckBoxeventmemberstatusoff
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxeventmemberstatusoff;
    }

    /**
     * This method initializes fJLabeleventmemberstatusoff
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeleventmemberstatusoff() {
        if (fJLabeleventmemberstatusoff == null) {
            try {
                fJLabeleventmemberstatusoff = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeleventmemberstatusoff.setText(resBundel
                        .getString("res_streventmemberstatusoffDisplayName")); // Generated
                fJLabeleventmemberstatusoff.setToolTipText(resBundel
                        .getString("res_streventmemberstatusoffDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeleventmemberstatusoff;
    }

    /**
     * This method initializes fJPaneleventmemberstatusoff
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneleventmemberstatusoff() {
        if (fJPaneleventmemberstatusoff == null) {
            try {
                fJPaneleventmemberstatusoff = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneleventmemberstatusoff.setLayout(layFlowLayout); // Generated
                fJPaneleventmemberstatusoff.add(
                        getJLabeleventmemberstatusoff(), null); // Generated
                fJPaneleventmemberstatusoff.add(
                        getCustomCheckBoxeventmemberstatusoff(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneleventmemberstatusoff;
    }

    // end DB field eventmemberstatusoff
    // start DB field reportholdtime
    /**
     * This method initializes fCustomCheckBoxreportholdtime
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxreportholdtime() {
        if (fCustomCheckBoxreportholdtime == null) {
            try {
                fCustomCheckBoxreportholdtime = new CustomCheckBox(); // Generated
                fCustomCheckBoxreportholdtime
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxreportholdtime;
    }

    /**
     * This method initializes fJLabelreportholdtime
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelreportholdtime() {
        if (fJLabelreportholdtime == null) {
            try {
                fJLabelreportholdtime = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelreportholdtime.setText(resBundel
                        .getString("res_strreportholdtimeDisplayName")); // Generated
                fJLabelreportholdtime.setToolTipText(resBundel
                        .getString("res_strreportholdtimeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelreportholdtime;
    }

    /**
     * This method initializes fJPanelreportholdtime
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelreportholdtime() {
        if (fJPanelreportholdtime == null) {
            try {
                fJPanelreportholdtime = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelreportholdtime.setLayout(layFlowLayout); // Generated
                fJPanelreportholdtime.add(getJLabelreportholdtime(), null); // Generated
                fJPanelreportholdtime.add(getCustomCheckBoxreportholdtime(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelreportholdtime;
    }

    // end DB field reportholdtime
    // start DB field memberdelay
    /**
     * This method initializes fIntegerTextFieldmemberdelay
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldmemberdelay() {
        if (fIntegerTextFieldmemberdelay == null) {
            try {
                fIntegerTextFieldmemberdelay = new IntegerTextField(); // Generated
                fIntegerTextFieldmemberdelay
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldmemberdelay;
    }

    /**
     * This method initializes fJLabelmemberdelay
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmemberdelay() {
        if (fJLabelmemberdelay == null) {
            try {
                fJLabelmemberdelay = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmemberdelay.setText(resBundel
                        .getString("res_strmemberdelayDisplayName")); // Generated
                fJLabelmemberdelay.setToolTipText(resBundel
                        .getString("res_strmemberdelayDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmemberdelay;
    }

    /**
     * This method initializes fJPanelmemberdelay
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmemberdelay() {
        if (fJPanelmemberdelay == null) {
            try {
                fJPanelmemberdelay = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmemberdelay.setLayout(layFlowLayout); // Generated
                fJPanelmemberdelay.add(getJLabelmemberdelay(), null); // Generated
                fJPanelmemberdelay.add(getIntegerTextFieldmemberdelay(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmemberdelay;
    }

    // end DB field memberdelay
    // start DB field timeoutrestart
    /**
     * This method initializes fCustomCheckBoxtimeoutrestart
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxtimeoutrestart() {
        if (fCustomCheckBoxtimeoutrestart == null) {
            try {
                fCustomCheckBoxtimeoutrestart = new CustomCheckBox(); // Generated
                fCustomCheckBoxtimeoutrestart
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxtimeoutrestart;
    }

    /**
     * This method initializes fJLabeltimeoutrestart
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimeoutrestart() {
        if (fJLabeltimeoutrestart == null) {
            try {
                fJLabeltimeoutrestart = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltimeoutrestart.setText(resBundel
                        .getString("res_strtimeoutrestartDisplayName")); // Generated
                fJLabeltimeoutrestart.setToolTipText(resBundel
                        .getString("res_strtimeoutrestartDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltimeoutrestart;
    }

    /**
     * This method initializes fJPaneltimeoutrestart
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimeoutrestart() {
        if (fJPaneltimeoutrestart == null) {
            try {
                fJPaneltimeoutrestart = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimeoutrestart.setLayout(layFlowLayout); // Generated
                fJPaneltimeoutrestart.add(getJLabeltimeoutrestart(), null); // Generated
                fJPaneltimeoutrestart.add(getCustomCheckBoxtimeoutrestart(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimeoutrestart;
    }
    // end DB field timeoutrestart

}
