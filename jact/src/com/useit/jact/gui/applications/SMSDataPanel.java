package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SMS;

/**
 * <p>
 * SMSDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:51 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SMSDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class SMSDataPanel extends SimpleDataObjectPanel{
	protected SMS dataObject;
	//protected SMSChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SMSDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSMSResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSMSResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SMSResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SMSCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldname,		
			fStringTextFielda,		
			fStringTextFields,		
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
        this.add(getJPanelname(), null); // Generated
        this.add(getJPanela(), null); // Generated
        this.add(getJPanels(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielda.getDocument().addDocumentListener(textChangeAct);
		fStringTextFields.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldname.setValue(dataObject.getName());
        fStringTextFielda.setValue(dataObject.getA());
        fStringTextFields.setValue(dataObject.getS());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setName(fStringTextFieldname.getValue());
        dataObject.setA(fStringTextFielda.getValue());
        dataObject.setS(fStringTextFields.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SMS
	 */
	public void setDataObject(Object aSMS) {
	    //abstractdataObject = (AbstractConfigObject) aSMS;
		setDataObject((SMS) aSMS);
		//dataObject = aSMS;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SMS
	 */
	public void setDataObject(SMS aSMS) {
	    //abstractdataObject = (AbstractConfigObject) aSMS;
		dataObject = aSMS;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldname;
    protected javax.swing.JLabel fJLabelname;
	protected javax.swing.JPanel fJPanelname;
    protected StringTextField fStringTextFielda;
    protected javax.swing.JLabel fJLabela;
	protected javax.swing.JPanel fJPanela;
    protected StringTextField fStringTextFields;
    protected javax.swing.JLabel fJLabels;
	protected javax.swing.JPanel fJPanels;
    

//start DB field name
    /**
     * This method initializes fStringTextFieldname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldname() {
        if (fStringTextFieldname == null) {
            try {
                fStringTextFieldname = new StringTextField(); // Generated
                fStringTextFieldname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldname;
    }
        
    /**
     * This method initializes  fJLabelname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelname() {
        if (fJLabelname == null) {
            try {
                 fJLabelname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelname.setText(resBundel.getString("res_strnameDisplayName")); // Generated
                 fJLabelname.setToolTipText(resBundel.getString("res_strnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelname;
    }


    /**
     * This method initializes  fJPanelname
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
//end DB field name
//start DB field a
    /**
     * This method initializes fStringTextFielda
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielda() {
        if (fStringTextFielda == null) {
            try {
                fStringTextFielda = new StringTextField(); // Generated
                fStringTextFielda.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielda;
    }
        
    /**
     * This method initializes  fJLabela
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabela() {
        if (fJLabela == null) {
            try {
                 fJLabela = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabela.setText(resBundel.getString("res_straDisplayName")); // Generated
                 fJLabela.setToolTipText(resBundel.getString("res_straDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabela;
    }


    /**
     * This method initializes  fJPanela
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanela() {
        if (fJPanela == null) {
            try {
                fJPanela = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanela.setLayout(layFlowLayout); // Generated
                fJPanela.add(getJLabela(), null); // Generated
                fJPanela.add(getStringTextFielda(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanela;
    }
//end DB field a
//start DB field s
    /**
     * This method initializes fStringTextFields
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFields() {
        if (fStringTextFields == null) {
            try {
                fStringTextFields = new StringTextField(); // Generated
                fStringTextFields.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFields;
    }
        
    /**
     * This method initializes  fJLabels
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabels() {
        if (fJLabels == null) {
            try {
                 fJLabels = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabels.setText(resBundel.getString("res_strsDisplayName")); // Generated
                 fJLabels.setToolTipText(resBundel.getString("res_strsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabels;
    }


    /**
     * This method initializes  fJPanels
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanels() {
        if (fJPanels == null) {
            try {
                fJPanels = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanels.setLayout(layFlowLayout); // Generated
                fJPanels.add(getJLabels(), null); // Generated
                fJPanels.add(getStringTextFields(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanels;
    }
//end DB field s

}

	