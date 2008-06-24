package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SoftHangup;

/**
 * <p>
 * SoftHangupDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:09 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SoftHangupDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class SoftHangupDataPanel extends SimpleDataObjectPanel{
	protected SoftHangup dataObject;
	//protected SoftHangupChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SoftHangupDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSoftHangupResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSoftHangupResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SoftHangupResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SoftHangupCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldtechnology,		
			fStringTextFieldresource,		
			fStringTextFieldoptions,		
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
        this.add(getJPaneltechnology(), null); // Generated
        this.add(getJPanelresource(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldtechnology.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldresource.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldtechnology.setValue(dataObject.getTechnology());
        fStringTextFieldresource.setValue(dataObject.getResource());
        fStringTextFieldoptions.setValue(dataObject.getOptions());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setTechnology(fStringTextFieldtechnology.getValue());
        dataObject.setResource(fStringTextFieldresource.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SoftHangup
	 */
	public void setDataObject(Object aSoftHangup) {
	    //abstractdataObject = (AbstractConfigObject) aSoftHangup;
		setDataObject((SoftHangup) aSoftHangup);
		//dataObject = aSoftHangup;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SoftHangup
	 */
	public void setDataObject(SoftHangup aSoftHangup) {
	    //abstractdataObject = (AbstractConfigObject) aSoftHangup;
		dataObject = aSoftHangup;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtechnology;
    protected javax.swing.JLabel fJLabeltechnology;
	protected javax.swing.JPanel fJPaneltechnology;
    protected StringTextField fStringTextFieldresource;
    protected javax.swing.JLabel fJLabelresource;
	protected javax.swing.JPanel fJPanelresource;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    

//start DB field technology
    /**
     * This method initializes fStringTextFieldtechnology
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtechnology() {
        if (fStringTextFieldtechnology == null) {
            try {
                fStringTextFieldtechnology = new StringTextField(); // Generated
                fStringTextFieldtechnology.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtechnology;
    }
        
    /**
     * This method initializes  fJLabeltechnology
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltechnology() {
        if (fJLabeltechnology == null) {
            try {
                 fJLabeltechnology = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltechnology.setText(resBundel.getString("res_strtechnologyDisplayName")); // Generated
                 fJLabeltechnology.setToolTipText(resBundel.getString("res_strtechnologyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltechnology;
    }


    /**
     * This method initializes  fJPaneltechnology
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltechnology() {
        if (fJPaneltechnology == null) {
            try {
                fJPaneltechnology = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltechnology.setLayout(layFlowLayout); // Generated
                fJPaneltechnology.add(getJLabeltechnology(), null); // Generated
                fJPaneltechnology.add(getStringTextFieldtechnology(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltechnology;
    }
//end DB field technology
//start DB field resource
    /**
     * This method initializes fStringTextFieldresource
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldresource() {
        if (fStringTextFieldresource == null) {
            try {
                fStringTextFieldresource = new StringTextField(); // Generated
                fStringTextFieldresource.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldresource;
    }
        
    /**
     * This method initializes  fJLabelresource
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelresource() {
        if (fJLabelresource == null) {
            try {
                 fJLabelresource = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelresource.setText(resBundel.getString("res_strresourceDisplayName")); // Generated
                 fJLabelresource.setToolTipText(resBundel.getString("res_strresourceDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelresource;
    }


    /**
     * This method initializes  fJPanelresource
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelresource() {
        if (fJPanelresource == null) {
            try {
                fJPanelresource = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelresource.setLayout(layFlowLayout); // Generated
                fJPanelresource.add(getJLabelresource(), null); // Generated
                fJPanelresource.add(getStringTextFieldresource(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelresource;
    }
//end DB field resource
//start DB field options
    /**
     * This method initializes fStringTextFieldoptions
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldoptions() {
        if (fStringTextFieldoptions == null) {
            try {
                fStringTextFieldoptions = new StringTextField(); // Generated
                fStringTextFieldoptions.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldoptions;
    }
        
    /**
     * This method initializes  fJLabeloptions
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloptions() {
        if (fJLabeloptions == null) {
            try {
                 fJLabeloptions = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeloptions.setText(resBundel.getString("res_stroptionsDisplayName")); // Generated
                 fJLabeloptions.setToolTipText(resBundel.getString("res_stroptionsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeloptions;
    }


    /**
     * This method initializes  fJPaneloptions
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloptions() {
        if (fJPaneloptions == null) {
            try {
                fJPaneloptions = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloptions.setLayout(layFlowLayout); // Generated
                fJPaneloptions.add(getJLabeloptions(), null); // Generated
                fJPaneloptions.add(getStringTextFieldoptions(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloptions;
    }
//end DB field options

}

	