package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SendDTMF;

/**
 * <p>
 * SendDTMFDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:46 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendDTMFDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class SendDTMFDataPanel extends SimpleDataObjectPanel{
	protected SendDTMF dataObject;
	//protected SendDTMFChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SendDTMFDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSendDTMFResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSendDTMFResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SendDTMFResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SendDTMFCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFielddigits,		
			fStringTextFieldtimeout_ms,		
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
        this.add(getJPaneldigits(), null); // Generated
        this.add(getJPaneltimeout_ms(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFielddigits.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtimeout_ms.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFielddigits.setValue(dataObject.getDigits());
        fStringTextFieldtimeout_ms.setValue(dataObject.getTimeout_ms());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setDigits(fStringTextFielddigits.getValue());
        dataObject.setTimeout_ms(fStringTextFieldtimeout_ms.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SendDTMF
	 */
	public void setDataObject(Object aSendDTMF) {
	    //abstractdataObject = (AbstractConfigObject) aSendDTMF;
		setDataObject((SendDTMF) aSendDTMF);
		//dataObject = aSendDTMF;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SendDTMF
	 */
	public void setDataObject(SendDTMF aSendDTMF) {
	    //abstractdataObject = (AbstractConfigObject) aSendDTMF;
		dataObject = aSendDTMF;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFielddigits;
    protected javax.swing.JLabel fJLabeldigits;
	protected javax.swing.JPanel fJPaneldigits;
    protected StringTextField fStringTextFieldtimeout_ms;
    protected javax.swing.JLabel fJLabeltimeout_ms;
	protected javax.swing.JPanel fJPaneltimeout_ms;
    

//start DB field digits
    /**
     * This method initializes fStringTextFielddigits
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielddigits() {
        if (fStringTextFielddigits == null) {
            try {
                fStringTextFielddigits = new StringTextField(); // Generated
                fStringTextFielddigits.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddigits;
    }
        
    /**
     * This method initializes  fJLabeldigits
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldigits() {
        if (fJLabeldigits == null) {
            try {
                 fJLabeldigits = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldigits.setText(resBundel.getString("res_strdigitsDisplayName")); // Generated
                 fJLabeldigits.setToolTipText(resBundel.getString("res_strdigitsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldigits;
    }


    /**
     * This method initializes  fJPaneldigits
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldigits() {
        if (fJPaneldigits == null) {
            try {
                fJPaneldigits = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldigits.setLayout(layFlowLayout); // Generated
                fJPaneldigits.add(getJLabeldigits(), null); // Generated
                fJPaneldigits.add(getStringTextFielddigits(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldigits;
    }
//end DB field digits
//start DB field timeout_ms
    /**
     * This method initializes fStringTextFieldtimeout_ms
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtimeout_ms() {
        if (fStringTextFieldtimeout_ms == null) {
            try {
                fStringTextFieldtimeout_ms = new StringTextField(); // Generated
                fStringTextFieldtimeout_ms.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtimeout_ms;
    }
        
    /**
     * This method initializes  fJLabeltimeout_ms
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimeout_ms() {
        if (fJLabeltimeout_ms == null) {
            try {
                 fJLabeltimeout_ms = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltimeout_ms.setText(resBundel.getString("res_strtimeout_msDisplayName")); // Generated
                 fJLabeltimeout_ms.setToolTipText(resBundel.getString("res_strtimeout_msDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltimeout_ms;
    }


    /**
     * This method initializes  fJPaneltimeout_ms
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimeout_ms() {
        if (fJPaneltimeout_ms == null) {
            try {
                fJPaneltimeout_ms = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimeout_ms.setLayout(layFlowLayout); // Generated
                fJPaneltimeout_ms.add(getJLabeltimeout_ms(), null); // Generated
                fJPaneltimeout_ms.add(getStringTextFieldtimeout_ms(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimeout_ms;
    }
//end DB field timeout_ms

}

	