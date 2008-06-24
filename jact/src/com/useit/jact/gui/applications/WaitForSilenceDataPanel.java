package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.WaitForSilence;

/**
 * <p>
 * WaitForSilenceDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:50 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitForSilenceDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class WaitForSilenceDataPanel extends SimpleDataObjectPanel{
	protected WaitForSilence dataObject;
	//protected WaitForSilenceChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public WaitForSilenceDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getWaitForSilenceResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getWaitForSilenceResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/WaitForSilenceResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new WaitForSilenceCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldx,		
			fStringTextFieldy,		
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
        this.add(getJPanelx(), null); // Generated
        this.add(getJPanely(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldx.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldy.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldx.setValue(dataObject.getX());
        fStringTextFieldy.setValue(dataObject.getY());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setX(fStringTextFieldx.getValue());
        dataObject.setY(fStringTextFieldy.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param WaitForSilence
	 */
	public void setDataObject(Object aWaitForSilence) {
	    //abstractdataObject = (AbstractConfigObject) aWaitForSilence;
		setDataObject((WaitForSilence) aWaitForSilence);
		//dataObject = aWaitForSilence;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param WaitForSilence
	 */
	public void setDataObject(WaitForSilence aWaitForSilence) {
	    //abstractdataObject = (AbstractConfigObject) aWaitForSilence;
		dataObject = aWaitForSilence;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldx;
    protected javax.swing.JLabel fJLabelx;
	protected javax.swing.JPanel fJPanelx;
    protected StringTextField fStringTextFieldy;
    protected javax.swing.JLabel fJLabely;
	protected javax.swing.JPanel fJPanely;
    

//start DB field x
    /**
     * This method initializes fStringTextFieldx
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldx() {
        if (fStringTextFieldx == null) {
            try {
                fStringTextFieldx = new StringTextField(); // Generated
                fStringTextFieldx.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldx;
    }
        
    /**
     * This method initializes  fJLabelx
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelx() {
        if (fJLabelx == null) {
            try {
                 fJLabelx = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelx.setText(resBundel.getString("res_strxDisplayName")); // Generated
                 fJLabelx.setToolTipText(resBundel.getString("res_strxDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelx;
    }


    /**
     * This method initializes  fJPanelx
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelx() {
        if (fJPanelx == null) {
            try {
                fJPanelx = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelx.setLayout(layFlowLayout); // Generated
                fJPanelx.add(getJLabelx(), null); // Generated
                fJPanelx.add(getStringTextFieldx(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelx;
    }
//end DB field x
//start DB field y
    /**
     * This method initializes fStringTextFieldy
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldy() {
        if (fStringTextFieldy == null) {
            try {
                fStringTextFieldy = new StringTextField(); // Generated
                fStringTextFieldy.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldy;
    }
        
    /**
     * This method initializes  fJLabely
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabely() {
        if (fJLabely == null) {
            try {
                 fJLabely = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabely.setText(resBundel.getString("res_stryDisplayName")); // Generated
                 fJLabely.setToolTipText(resBundel.getString("res_stryDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabely;
    }


    /**
     * This method initializes  fJPanely
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanely() {
        if (fJPanely == null) {
            try {
                fJPanely = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanely.setLayout(layFlowLayout); // Generated
                fJPanely.add(getJLabely(), null); // Generated
                fJPanely.add(getStringTextFieldy(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanely;
    }
//end DB field y

}

	