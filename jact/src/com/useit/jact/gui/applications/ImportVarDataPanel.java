package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ImportVar;

/**
 * <p>
 * ImportVarDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:16 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ImportVarDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class ImportVarDataPanel extends SimpleDataObjectPanel{
	protected ImportVar dataObject;
	//protected ImportVarChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ImportVarDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getImportVarResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getImportVarResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ImportVarResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ImportVarCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldn,		
			fStringTextFieldchannel,		
			fStringTextFieldvariable,		
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
        this.add(getJPaneln(), null); // Generated
        this.add(getJPanelchannel(), null); // Generated
        this.add(getJPanelvariable(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldn.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldchannel.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldvariable.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldn.setValue(dataObject.getN());
        fStringTextFieldchannel.setValue(dataObject.getChannel());
        fStringTextFieldvariable.setValue(dataObject.getVariable());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setN(fStringTextFieldn.getValue());
        dataObject.setChannel(fStringTextFieldchannel.getValue());
        dataObject.setVariable(fStringTextFieldvariable.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ImportVar
	 */
	public void setDataObject(Object aImportVar) {
	    //abstractdataObject = (AbstractConfigObject) aImportVar;
		setDataObject((ImportVar) aImportVar);
		//dataObject = aImportVar;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ImportVar
	 */
	public void setDataObject(ImportVar aImportVar) {
	    //abstractdataObject = (AbstractConfigObject) aImportVar;
		dataObject = aImportVar;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldn;
    protected javax.swing.JLabel fJLabeln;
	protected javax.swing.JPanel fJPaneln;
    protected StringTextField fStringTextFieldchannel;
    protected javax.swing.JLabel fJLabelchannel;
	protected javax.swing.JPanel fJPanelchannel;
    protected StringTextField fStringTextFieldvariable;
    protected javax.swing.JLabel fJLabelvariable;
	protected javax.swing.JPanel fJPanelvariable;
    

//start DB field n
    /**
     * This method initializes fStringTextFieldn
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldn() {
        if (fStringTextFieldn == null) {
            try {
                fStringTextFieldn = new StringTextField(); // Generated
                fStringTextFieldn.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldn;
    }
        
    /**
     * This method initializes  fJLabeln
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeln() {
        if (fJLabeln == null) {
            try {
                 fJLabeln = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeln.setText(resBundel.getString("res_strnDisplayName")); // Generated
                 fJLabeln.setToolTipText(resBundel.getString("res_strnDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeln;
    }


    /**
     * This method initializes  fJPaneln
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneln() {
        if (fJPaneln == null) {
            try {
                fJPaneln = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneln.setLayout(layFlowLayout); // Generated
                fJPaneln.add(getJLabeln(), null); // Generated
                fJPaneln.add(getStringTextFieldn(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneln;
    }
//end DB field n
//start DB field channel
    /**
     * This method initializes fStringTextFieldchannel
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldchannel() {
        if (fStringTextFieldchannel == null) {
            try {
                fStringTextFieldchannel = new StringTextField(); // Generated
                fStringTextFieldchannel.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldchannel;
    }
        
    /**
     * This method initializes  fJLabelchannel
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelchannel() {
        if (fJLabelchannel == null) {
            try {
                 fJLabelchannel = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelchannel.setText(resBundel.getString("res_strchannelDisplayName")); // Generated
                 fJLabelchannel.setToolTipText(resBundel.getString("res_strchannelDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelchannel;
    }


    /**
     * This method initializes  fJPanelchannel
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelchannel() {
        if (fJPanelchannel == null) {
            try {
                fJPanelchannel = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelchannel.setLayout(layFlowLayout); // Generated
                fJPanelchannel.add(getJLabelchannel(), null); // Generated
                fJPanelchannel.add(getStringTextFieldchannel(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelchannel;
    }
//end DB field channel
//start DB field variable
    /**
     * This method initializes fStringTextFieldvariable
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvariable() {
        if (fStringTextFieldvariable == null) {
            try {
                fStringTextFieldvariable = new StringTextField(); // Generated
                fStringTextFieldvariable.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvariable;
    }
        
    /**
     * This method initializes  fJLabelvariable
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvariable() {
        if (fJLabelvariable == null) {
            try {
                 fJLabelvariable = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvariable.setText(resBundel.getString("res_strvariableDisplayName")); // Generated
                 fJLabelvariable.setToolTipText(resBundel.getString("res_strvariableDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvariable;
    }


    /**
     * This method initializes  fJPanelvariable
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvariable() {
        if (fJPanelvariable == null) {
            try {
                fJPanelvariable = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvariable.setLayout(layFlowLayout); // Generated
                fJPanelvariable.add(getJLabelvariable(), null); // Generated
                fJPanelvariable.add(getStringTextFieldvariable(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvariable;
    }
//end DB field variable

}

	