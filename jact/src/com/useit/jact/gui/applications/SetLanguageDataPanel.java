package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SetLanguage;

/**
 * <p>
 * SetLanguageDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:10 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetLanguageDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SetLanguageDataPanel extends SimpleDataObjectPanel{
	protected SetLanguage dataObject;
	//protected SetLanguageChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetLanguageDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetLanguageResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetLanguageResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetLanguageResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SetLanguageCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldlanguage,		
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
        this.add(getJPanellanguage(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldlanguage.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldlanguage.setValue(dataObject.getLanguage());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setLanguage(fStringTextFieldlanguage.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SetLanguage
	 */
	public void setDataObject(Object aSetLanguage) {
	    //abstractdataObject = (AbstractConfigObject) aSetLanguage;
		setDataObject((SetLanguage) aSetLanguage);
		//dataObject = aSetLanguage;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SetLanguage
	 */
	public void setDataObject(SetLanguage aSetLanguage) {
	    //abstractdataObject = (AbstractConfigObject) aSetLanguage;
		dataObject = aSetLanguage;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldlanguage;
    protected javax.swing.JLabel fJLabellanguage;
	protected javax.swing.JPanel fJPanellanguage;
    

//start DB field language
    /**
     * This method initializes fStringTextFieldlanguage
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlanguage() {
        if (fStringTextFieldlanguage == null) {
            try {
                fStringTextFieldlanguage = new StringTextField(); // Generated
                fStringTextFieldlanguage.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlanguage;
    }
        
    /**
     * This method initializes  fJLabellanguage
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellanguage() {
        if (fJLabellanguage == null) {
            try {
                 fJLabellanguage = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabellanguage.setText(resBundel.getString("res_strlanguageDisplayName")); // Generated
                 fJLabellanguage.setToolTipText(resBundel.getString("res_strlanguageDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabellanguage;
    }


    /**
     * This method initializes  fJPanellanguage
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellanguage() {
        if (fJPanellanguage == null) {
            try {
                fJPanellanguage = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellanguage.setLayout(layFlowLayout); // Generated
                fJPanellanguage.add(getJLabellanguage(), null); // Generated
                fJPanellanguage.add(getStringTextFieldlanguage(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellanguage;
    }
//end DB field language

}

	