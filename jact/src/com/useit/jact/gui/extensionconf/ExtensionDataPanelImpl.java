package com.useit.jact.gui.extensionconf;

import java.awt.BorderLayout;
import java.util.ResourceBundle;

import javax.swing.JPanel;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.GuiAdapterapplications;

/**
 * <p>
 * ExtensionDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Thu Dec 29 11:47:07 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExtensionDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:08 urs Exp $
 */
public class ExtensionDataPanelImpl extends ExtensionDataPanel {

    private JPanel fJCenter;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ExtensionDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getExtensionResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getExtensionResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ExtensionResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        initialize();
        initActions();
    }
    
    @Override
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldexten.setValue(dataObject.getExten());
        fIntegerTextFieldpriority.setValue(dataObject.getPriority());
        fPbxApplicationTextFieldapplication.setValue(dataObject.getApplication());


        textChangeAct.setEnabled(true);         

        getJPanelapplication().removeAll();
        Object panelFor = GuiAdapterapplications.getInstance().getPanelFor(dataObject.getApplication());
        if(panelFor!=null)
            if (panelFor instanceof SimpleDataObjectPanel) {
                SimpleDataObjectPanel dp = (SimpleDataObjectPanel) panelFor;
                dp.setDataObject(dataObject.getApplication());
                getJPanelapplication().add(dp,BorderLayout.CENTER);
                
            }//end of if (panelFor instanceof SimpleDataObjectPanel)
            
        
    }
//  get the Data
    protected void getConfigFromWidget() {
        dataObject.setExten(fStringTextFieldexten.getValue());
        dataObject.setPriority(fIntegerTextFieldpriority.getValue());
        //dataObject.setApplication(fPbxApplicationTextFieldapplication.getValue());
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (6) * 30);
        this.setLayout(new BorderLayout()); // Generated
        this.add(getJCenter(),BorderLayout.CENTER);
        this.add(getJPanelapplication(),BorderLayout.SOUTH);
//        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
//        layGridLayout.setRows(6); // Generated
//        this.setLayout(layGridLayout); // Generated
//        this.add(getJPanelexten(), null); // Generated
//        this.add(getJPanelpriority(), null); // Generated
//        this.add(getJPanelapplication(), null); // Generated
        getPbxApplicationTextFieldapplication();
    }
    
    public void initActions() {
        super.initActions();
            fStringTextFieldexten.getDocument().addDocumentListener(textChangeAct);
            fIntegerTextFieldpriority.getDocument().addDocumentListener(textChangeAct);
            fPbxApplicationTextFieldapplication.getDocument().addDocumentListener(textChangeAct);

    }

    /**
     * This method initializes  fJPanelapplication
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelapplication() {
        if (fJPanelapplication == null) {
            try {
                fJPanelapplication = new javax.swing.JPanel(); // Generated

                //java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                //layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelapplication.setLayout(new BorderLayout());//layFlowLayout); // Generated
                //fJPanelapplication.add(getJLabelapplication(), null); // Generated
                //fJPanelapplication.add(getPbxApplicationTextFieldapplication(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelapplication;
    }

    protected javax.swing.JPanel getJCenter() {
        if (fJCenter == null) {
            try {
                fJCenter = new javax.swing.JPanel(); // Generated
                java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
                layGridLayout.setRows(3); // Generated
                fJCenter.setLayout(layGridLayout); // Generated
                fJCenter.add(getJPanelexten(), null); // Generated
                fJCenter.add(getJPanelpriority(), null); // Generated
                //fJCenter.add(getJPanelapplication(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJCenter;
    }

    
    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
