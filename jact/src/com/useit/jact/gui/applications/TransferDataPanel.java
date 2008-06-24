package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Transfer;

/**
 * <p>
 * TransferDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:30 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TransferDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class TransferDataPanel extends SimpleDataObjectPanel{
	protected Transfer dataObject;
	//protected TransferChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public TransferDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getTransferResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getTransferResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/TransferResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new TransferCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldtech,		
			fStringTextFielddest,		
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
        this.add(getJPaneltech(), null); // Generated
        this.add(getJPaneldest(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldtech.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielddest.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldtech.setValue(dataObject.getTech());
        fStringTextFielddest.setValue(dataObject.getDest());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setTech(fStringTextFieldtech.getValue());
        dataObject.setDest(fStringTextFielddest.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Transfer
	 */
	public void setDataObject(Object aTransfer) {
	    //abstractdataObject = (AbstractConfigObject) aTransfer;
		setDataObject((Transfer) aTransfer);
		//dataObject = aTransfer;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Transfer
	 */
	public void setDataObject(Transfer aTransfer) {
	    //abstractdataObject = (AbstractConfigObject) aTransfer;
		dataObject = aTransfer;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtech;
    protected javax.swing.JLabel fJLabeltech;
	protected javax.swing.JPanel fJPaneltech;
    protected StringTextField fStringTextFielddest;
    protected javax.swing.JLabel fJLabeldest;
	protected javax.swing.JPanel fJPaneldest;
    

//start DB field tech
    /**
     * This method initializes fStringTextFieldtech
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtech() {
        if (fStringTextFieldtech == null) {
            try {
                fStringTextFieldtech = new StringTextField(); // Generated
                fStringTextFieldtech.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtech;
    }
        
    /**
     * This method initializes  fJLabeltech
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltech() {
        if (fJLabeltech == null) {
            try {
                 fJLabeltech = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltech.setText(resBundel.getString("res_strtechDisplayName")); // Generated
                 fJLabeltech.setToolTipText(resBundel.getString("res_strtechDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltech;
    }


    /**
     * This method initializes  fJPaneltech
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltech() {
        if (fJPaneltech == null) {
            try {
                fJPaneltech = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltech.setLayout(layFlowLayout); // Generated
                fJPaneltech.add(getJLabeltech(), null); // Generated
                fJPaneltech.add(getStringTextFieldtech(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltech;
    }
//end DB field tech
//start DB field dest
    /**
     * This method initializes fStringTextFielddest
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielddest() {
        if (fStringTextFielddest == null) {
            try {
                fStringTextFielddest = new StringTextField(); // Generated
                fStringTextFielddest.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddest;
    }
        
    /**
     * This method initializes  fJLabeldest
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldest() {
        if (fJLabeldest == null) {
            try {
                 fJLabeldest = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldest.setText(resBundel.getString("res_strdestDisplayName")); // Generated
                 fJLabeldest.setToolTipText(resBundel.getString("res_strdestDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldest;
    }


    /**
     * This method initializes  fJPaneldest
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldest() {
        if (fJPaneldest == null) {
            try {
                fJPaneldest = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldest.setLayout(layFlowLayout); // Generated
                fJPaneldest.add(getJLabeldest(), null); // Generated
                fJPaneldest.add(getStringTextFielddest(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldest;
    }
//end DB field dest

}

	