package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Answer;

/**
 * <p>
 * AnswerDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:31 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AnswerDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class AnswerDataPanel extends SimpleDataObjectPanel{
	protected Answer dataObject;
	//protected AnswerChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public AnswerDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getAnswerResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getAnswerResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/AnswerResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new AnswerCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFielddelay,		
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
        this.add(getJPaneldelay(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFielddelay.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFielddelay.setValue(dataObject.getDelay());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setDelay(fStringTextFielddelay.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Answer
	 */
	public void setDataObject(Object aAnswer) {
	    //abstractdataObject = (AbstractConfigObject) aAnswer;
		setDataObject((Answer) aAnswer);
		//dataObject = aAnswer;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Answer
	 */
	public void setDataObject(Answer aAnswer) {
	    //abstractdataObject = (AbstractConfigObject) aAnswer;
		dataObject = aAnswer;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFielddelay;
    protected javax.swing.JLabel fJLabeldelay;
	protected javax.swing.JPanel fJPaneldelay;
    

//start DB field delay
    /**
     * This method initializes fStringTextFielddelay
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielddelay() {
        if (fStringTextFielddelay == null) {
            try {
                fStringTextFielddelay = new StringTextField(); // Generated
                fStringTextFielddelay.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddelay;
    }
        
    /**
     * This method initializes  fJLabeldelay
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldelay() {
        if (fJLabeldelay == null) {
            try {
                 fJLabeldelay = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldelay.setText(resBundel.getString("res_strdelayDisplayName")); // Generated
                 fJLabeldelay.setToolTipText(resBundel.getString("res_strdelayDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldelay;
    }


    /**
     * This method initializes  fJPaneldelay
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldelay() {
        if (fJPaneldelay == null) {
            try {
                fJPaneldelay = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldelay.setLayout(layFlowLayout); // Generated
                fJPaneldelay.add(getJLabeldelay(), null); // Generated
                fJPaneldelay.add(getStringTextFielddelay(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldelay;
    }
//end DB field delay

}

	