package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SendText;

/**
 * <p>
 * SendTextDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:41 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendTextDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SendTextDataPanel extends SimpleDataObjectPanel{
	protected SendText dataObject;
	//protected SendTextChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SendTextDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSendTextResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSendTextResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SendTextResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SendTextCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldtext,		
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
		this.setSize(400,(1)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneltext(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldtext.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldtext.setValue(dataObject.getText());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setText(fStringTextFieldtext.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SendText
	 */
	public void setDataObject(Object aSendText) {
	    //abstractdataObject = (AbstractConfigObject) aSendText;
		setDataObject((SendText) aSendText);
		//dataObject = aSendText;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SendText
	 */
	public void setDataObject(SendText aSendText) {
	    //abstractdataObject = (AbstractConfigObject) aSendText;
		dataObject = aSendText;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtext;
    protected javax.swing.JLabel fJLabeltext;
	protected javax.swing.JPanel fJPaneltext;
    

//start DB field text
    /**
     * This method initializes fStringTextFieldtext
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtext() {
        if (fStringTextFieldtext == null) {
            try {
                fStringTextFieldtext = new StringTextField(); // Generated
                fStringTextFieldtext.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtext;
    }
        
    /**
     * This method initializes  fJLabeltext
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltext() {
        if (fJLabeltext == null) {
            try {
                 fJLabeltext = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltext.setText(resBundel.getString("res_strtextDisplayName")); // Generated
                 fJLabeltext.setToolTipText(resBundel.getString("res_strtextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltext;
    }


    /**
     * This method initializes  fJPaneltext
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltext() {
        if (fJPaneltext == null) {
            try {
                fJPaneltext = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltext.setLayout(layFlowLayout); // Generated
                fJPaneltext.add(getJLabeltext(), null); // Generated
                fJPaneltext.add(getStringTextFieldtext(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltext;
    }
//end DB field text

}

	