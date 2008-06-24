package com.useit.jact.gui.agentconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.agentconf.Agents;

/**
 * <p>
 * AgentsDataPanel
 * </p>
 * Created : Tue Dec 27 16:21:46 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsDataPanel.java,v 1.4 2005/12/29
 *          19:14:24 urs Exp $
 */
public class AgentsDataPanel extends SimpleDataObjectPanel {
    protected Agents dataObject;

    // protected AgentsChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public AgentsDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAgentsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAgentsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/AgentsResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * AgentsCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldagentid,
     * fStringTextFieldagentpassword, fStringTextFieldname, };
     * dataChecker.initChecker(array); }
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
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelagentid(), null); // Generated
        this.add(getJPanelagentpassword(), null); // Generated
        this.add(getJPanelname(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldagentid.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldagentpassword.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldname.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldagentid.setValue(dataObject.getAgentid());
        fStringTextFieldagentpassword.setValue(dataObject.getAgentpassword());
        fStringTextFieldname.setValue(dataObject.getName());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setAgentid(fStringTextFieldagentid.getValue());
        dataObject.setAgentpassword(fStringTextFieldagentpassword.getValue());
        dataObject.setName(fStringTextFieldname.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Agents
     */
    public void setDataObject(Object aAgents) {
        // abstractdataObject = (AbstractConfigObject) aAgents;
        setDataObject((Agents) aAgents);
        // dataObject = aAgents;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Agents
     */
    public void setDataObject(Agents aAgents) {
        // abstractdataObject = (AbstractConfigObject) aAgents;
        dataObject = aAgents;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldagentid;

    protected javax.swing.JLabel fJLabelagentid;

    protected javax.swing.JPanel fJPanelagentid;

    protected StringTextField fStringTextFieldagentpassword;

    protected javax.swing.JLabel fJLabelagentpassword;

    protected javax.swing.JPanel fJPanelagentpassword;

    protected StringTextField fStringTextFieldname;

    protected javax.swing.JLabel fJLabelname;

    protected javax.swing.JPanel fJPanelname;

    // start DB field agentid
    /**
     * This method initializes fStringTextFieldagentid
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldagentid() {
        if (fStringTextFieldagentid == null) {
            try {
                fStringTextFieldagentid = new StringTextField(); // Generated
                fStringTextFieldagentid
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldagentid;
    }

    /**
     * This method initializes fJLabelagentid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelagentid() {
        if (fJLabelagentid == null) {
            try {
                fJLabelagentid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelagentid.setText(resBundel
                        .getString("res_stragentidDisplayName")); // Generated
                fJLabelagentid.setToolTipText(resBundel
                        .getString("res_stragentidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelagentid;
    }

    /**
     * This method initializes fJPanelagentid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelagentid() {
        if (fJPanelagentid == null) {
            try {
                fJPanelagentid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelagentid.setLayout(layFlowLayout); // Generated
                fJPanelagentid.add(getJLabelagentid(), null); // Generated
                fJPanelagentid.add(getStringTextFieldagentid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelagentid;
    }

    // end DB field agentid
    // start DB field agentpassword
    /**
     * This method initializes fStringTextFieldagentpassword
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldagentpassword() {
        if (fStringTextFieldagentpassword == null) {
            try {
                fStringTextFieldagentpassword = new StringTextField(); // Generated
                fStringTextFieldagentpassword
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldagentpassword;
    }

    /**
     * This method initializes fJLabelagentpassword
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelagentpassword() {
        if (fJLabelagentpassword == null) {
            try {
                fJLabelagentpassword = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelagentpassword.setText(resBundel
                        .getString("res_stragentpasswordDisplayName")); // Generated
                fJLabelagentpassword.setToolTipText(resBundel
                        .getString("res_stragentpasswordDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelagentpassword;
    }

    /**
     * This method initializes fJPanelagentpassword
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelagentpassword() {
        if (fJPanelagentpassword == null) {
            try {
                fJPanelagentpassword = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelagentpassword.setLayout(layFlowLayout); // Generated
                fJPanelagentpassword.add(getJLabelagentpassword(), null); // Generated
                fJPanelagentpassword.add(getStringTextFieldagentpassword(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelagentpassword;
    }

    // end DB field agentpassword
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

}
