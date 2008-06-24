package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.PbxApplicationTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.extensionconf.Extension;

/**
 * <p>
 * ExtensionDataPanel
 * </p>
 * Created : Fri May 26 17:18:23 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExtensionDataPanel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class ExtensionDataPanel extends SimpleDataObjectPanel{
	protected Extension dataObject;
	//protected ExtensionChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ExtensionDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getExtensionResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getExtensionResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ExtensionResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ExtensionCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldexten,		
			fIntegerTextFieldpriority,		
			fPbxApplicationTextFieldapplication,		
		};
		dataChecker.initChecker(array);
	}

*/

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(400,(3)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelexten(), null); // Generated
        this.add(getJPanelpriority(), null); // Generated
        this.add(getJPanelapplication(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldexten.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldpriority.getDocument().addDocumentListener(textChangeAct);
		fPbxApplicationTextFieldapplication.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldexten.setValue(dataObject.getExten());
        fIntegerTextFieldpriority.setValue(dataObject.getPriority());
        fPbxApplicationTextFieldapplication.setValue(dataObject.getApplication());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setExten(fStringTextFieldexten.getValue());
        dataObject.setPriority(fIntegerTextFieldpriority.getValue());
        dataObject.setApplication(fPbxApplicationTextFieldapplication.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Extension
	 */
	public void setDataObject(Object aExtension) {
	    //abstractdataObject = (AbstractConfigObject) aExtension;
		setDataObject((Extension) aExtension);
		//dataObject = aExtension;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Extension
	 */
	public void setDataObject(Extension aExtension) {
	    //abstractdataObject = (AbstractConfigObject) aExtension;
		dataObject = aExtension;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldexten;
    protected javax.swing.JLabel fJLabelexten;
	protected javax.swing.JPanel fJPanelexten;
    protected IntegerTextField fIntegerTextFieldpriority;
    protected javax.swing.JLabel fJLabelpriority;
	protected javax.swing.JPanel fJPanelpriority;
    protected PbxApplicationTextField fPbxApplicationTextFieldapplication;
    protected javax.swing.JLabel fJLabelapplication;
	protected javax.swing.JPanel fJPanelapplication;
    

//start DB field exten
    /**
     * This method initializes fStringTextFieldexten
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldexten() {
        if (fStringTextFieldexten == null) {
            try {
                fStringTextFieldexten = new StringTextField(); // Generated
                fStringTextFieldexten.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldexten;
    }
        
    /**
     * This method initializes  fJLabelexten
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelexten() {
        if (fJLabelexten == null) {
            try {
                 fJLabelexten = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelexten.setText(resBundel.getString("res_strextenDisplayName")); // Generated
                 fJLabelexten.setToolTipText(resBundel.getString("res_strextenDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelexten;
    }


    /**
     * This method initializes  fJPanelexten
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelexten() {
        if (fJPanelexten == null) {
            try {
                fJPanelexten = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelexten.setLayout(layFlowLayout); // Generated
                fJPanelexten.add(getJLabelexten(), null); // Generated
                fJPanelexten.add(getStringTextFieldexten(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelexten;
    }
//end DB field exten
//start DB field priority
    /**
     * This method initializes fIntegerTextFieldpriority
     *
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldpriority() {
        if (fIntegerTextFieldpriority == null) {
            try {
                fIntegerTextFieldpriority = new IntegerTextField(); // Generated
                fIntegerTextFieldpriority.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldpriority;
    }
        
    /**
     * This method initializes  fJLabelpriority
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpriority() {
        if (fJLabelpriority == null) {
            try {
                 fJLabelpriority = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelpriority.setText(resBundel.getString("res_strpriorityDisplayName")); // Generated
                 fJLabelpriority.setToolTipText(resBundel.getString("res_strpriorityDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelpriority;
    }


    /**
     * This method initializes  fJPanelpriority
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpriority() {
        if (fJPanelpriority == null) {
            try {
                fJPanelpriority = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpriority.setLayout(layFlowLayout); // Generated
                fJPanelpriority.add(getJLabelpriority(), null); // Generated
                fJPanelpriority.add(getIntegerTextFieldpriority(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpriority;
    }
//end DB field priority
//start DB field application
    /**
     * This method initializes fPbxApplicationTextFieldapplication
     *
     * @return PbxApplicationTextField
     */
    public PbxApplicationTextField getPbxApplicationTextFieldapplication() {
        if (fPbxApplicationTextFieldapplication == null) {
            try {
                fPbxApplicationTextFieldapplication = new PbxApplicationTextField(); // Generated
                fPbxApplicationTextFieldapplication.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fPbxApplicationTextFieldapplication;
    }
        
    /**
     * This method initializes  fJLabelapplication
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelapplication() {
        if (fJLabelapplication == null) {
            try {
                 fJLabelapplication = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelapplication.setText(resBundel.getString("res_strapplicationDisplayName")); // Generated
                 fJLabelapplication.setToolTipText(resBundel.getString("res_strapplicationDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelapplication;
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

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelapplication.setLayout(layFlowLayout); // Generated
                fJPanelapplication.add(getJLabelapplication(), null); // Generated
                fJPanelapplication.add(getPbxApplicationTextFieldapplication(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelapplication;
    }
//end DB field application

}

	