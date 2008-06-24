package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SendURL;

/**
 * <p>
 * SendURLDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:13 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendURLDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SendURLDataPanel extends SimpleDataObjectPanel{
	protected SendURL dataObject;
	//protected SendURLChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SendURLDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSendURLResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSendURLResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SendURLResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SendURLCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFielduRL,		
			fStringTextFieldoption,		
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
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneluRL(), null); // Generated
        this.add(getJPaneloption(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFielduRL.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoption.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFielduRL.setValue(dataObject.getURL());
        fStringTextFieldoption.setValue(dataObject.getOption());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setURL(fStringTextFielduRL.getValue());
        dataObject.setOption(fStringTextFieldoption.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SendURL
	 */
	public void setDataObject(Object aSendURL) {
	    //abstractdataObject = (AbstractConfigObject) aSendURL;
		setDataObject((SendURL) aSendURL);
		//dataObject = aSendURL;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SendURL
	 */
	public void setDataObject(SendURL aSendURL) {
	    //abstractdataObject = (AbstractConfigObject) aSendURL;
		dataObject = aSendURL;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFielduRL;
    protected javax.swing.JLabel fJLabeluRL;
	protected javax.swing.JPanel fJPaneluRL;
    protected StringTextField fStringTextFieldoption;
    protected javax.swing.JLabel fJLabeloption;
	protected javax.swing.JPanel fJPaneloption;
    

//start DB field uRL
    /**
     * This method initializes fStringTextFielduRL
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielduRL() {
        if (fStringTextFielduRL == null) {
            try {
                fStringTextFielduRL = new StringTextField(); // Generated
                fStringTextFielduRL.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielduRL;
    }
        
    /**
     * This method initializes  fJLabeluRL
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeluRL() {
        if (fJLabeluRL == null) {
            try {
                 fJLabeluRL = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeluRL.setText(resBundel.getString("res_struRLDisplayName")); // Generated
                 fJLabeluRL.setToolTipText(resBundel.getString("res_struRLDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeluRL;
    }


    /**
     * This method initializes  fJPaneluRL
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneluRL() {
        if (fJPaneluRL == null) {
            try {
                fJPaneluRL = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneluRL.setLayout(layFlowLayout); // Generated
                fJPaneluRL.add(getJLabeluRL(), null); // Generated
                fJPaneluRL.add(getStringTextFielduRL(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneluRL;
    }
//end DB field uRL
//start DB field option
    /**
     * This method initializes fStringTextFieldoption
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldoption() {
        if (fStringTextFieldoption == null) {
            try {
                fStringTextFieldoption = new StringTextField(); // Generated
                fStringTextFieldoption.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldoption;
    }
        
    /**
     * This method initializes  fJLabeloption
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloption() {
        if (fJLabeloption == null) {
            try {
                 fJLabeloption = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeloption.setText(resBundel.getString("res_stroptionDisplayName")); // Generated
                 fJLabeloption.setToolTipText(resBundel.getString("res_stroptionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeloption;
    }


    /**
     * This method initializes  fJPaneloption
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloption() {
        if (fJPaneloption == null) {
            try {
                fJPaneloption = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloption.setLayout(layFlowLayout); // Generated
                fJPaneloption.add(getJLabeloption(), null); // Generated
                fJPaneloption.add(getStringTextFieldoption(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloption;
    }
//end DB field option

}

	