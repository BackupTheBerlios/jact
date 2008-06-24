package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SayNumber;

/**
 * <p>
 * SayNumberDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:22 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayNumberDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class SayNumberDataPanel extends SimpleDataObjectPanel{
	protected SayNumber dataObject;
	//protected SayNumberChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SayNumberDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSayNumberResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSayNumberResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SayNumberResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SayNumberCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFielddigits,		
			fStringTextFieldgender,		
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
        this.add(getJPanelgender(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFielddigits.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldgender.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFielddigits.setValue(dataObject.getDigits());
        fStringTextFieldgender.setValue(dataObject.getGender());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setDigits(fStringTextFielddigits.getValue());
        dataObject.setGender(fStringTextFieldgender.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SayNumber
	 */
	public void setDataObject(Object aSayNumber) {
	    //abstractdataObject = (AbstractConfigObject) aSayNumber;
		setDataObject((SayNumber) aSayNumber);
		//dataObject = aSayNumber;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SayNumber
	 */
	public void setDataObject(SayNumber aSayNumber) {
	    //abstractdataObject = (AbstractConfigObject) aSayNumber;
		dataObject = aSayNumber;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFielddigits;
    protected javax.swing.JLabel fJLabeldigits;
	protected javax.swing.JPanel fJPaneldigits;
    protected StringTextField fStringTextFieldgender;
    protected javax.swing.JLabel fJLabelgender;
	protected javax.swing.JPanel fJPanelgender;
    

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
//start DB field gender
    /**
     * This method initializes fStringTextFieldgender
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldgender() {
        if (fStringTextFieldgender == null) {
            try {
                fStringTextFieldgender = new StringTextField(); // Generated
                fStringTextFieldgender.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldgender;
    }
        
    /**
     * This method initializes  fJLabelgender
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelgender() {
        if (fJLabelgender == null) {
            try {
                 fJLabelgender = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelgender.setText(resBundel.getString("res_strgenderDisplayName")); // Generated
                 fJLabelgender.setToolTipText(resBundel.getString("res_strgenderDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelgender;
    }


    /**
     * This method initializes  fJPanelgender
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelgender() {
        if (fJPanelgender == null) {
            try {
                fJPanelgender = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelgender.setLayout(layFlowLayout); // Generated
                fJPanelgender.add(getJLabelgender(), null); // Generated
                fJPanelgender.add(getStringTextFieldgender(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelgender;
    }
//end DB field gender

}

	