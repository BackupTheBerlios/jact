package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.MusicOnHold;

/**
 * <p>
 * MusicOnHoldDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:52 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MusicOnHoldDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class MusicOnHoldDataPanel extends SimpleDataObjectPanel{
	protected MusicOnHold dataObject;
	//protected MusicOnHoldChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MusicOnHoldDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMusicOnHoldResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMusicOnHoldResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MusicOnHoldResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MusicOnHoldCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldclass_,		
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
        this.add(getJPanelclass_(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldclass_.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldclass_.setValue(dataObject.getClass_());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setClass_(fStringTextFieldclass_.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param MusicOnHold
	 */
	public void setDataObject(Object aMusicOnHold) {
	    //abstractdataObject = (AbstractConfigObject) aMusicOnHold;
		setDataObject((MusicOnHold) aMusicOnHold);
		//dataObject = aMusicOnHold;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param MusicOnHold
	 */
	public void setDataObject(MusicOnHold aMusicOnHold) {
	    //abstractdataObject = (AbstractConfigObject) aMusicOnHold;
		dataObject = aMusicOnHold;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldclass_;
    protected javax.swing.JLabel fJLabelclass_;
	protected javax.swing.JPanel fJPanelclass_;
    

//start DB field class_
    /**
     * This method initializes fStringTextFieldclass_
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldclass_() {
        if (fStringTextFieldclass_ == null) {
            try {
                fStringTextFieldclass_ = new StringTextField(); // Generated
                fStringTextFieldclass_.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldclass_;
    }
        
    /**
     * This method initializes  fJLabelclass_
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelclass_() {
        if (fJLabelclass_ == null) {
            try {
                 fJLabelclass_ = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelclass_.setText(resBundel.getString("res_strclass_DisplayName")); // Generated
                 fJLabelclass_.setToolTipText(resBundel.getString("res_strclass_Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelclass_;
    }


    /**
     * This method initializes  fJPanelclass_
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelclass_() {
        if (fJPanelclass_ == null) {
            try {
                fJPanelclass_ = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelclass_.setLayout(layFlowLayout); // Generated
                fJPanelclass_.add(getJLabelclass_(), null); // Generated
                fJPanelclass_.add(getStringTextFieldclass_(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelclass_;
    }
//end DB field class_

}

	