package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SetCIDNum;

/**
 * <p>
 * SetCIDNumDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCIDNumDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class SetCIDNumDataPanel extends SimpleDataObjectPanel{
	protected SetCIDNum dataObject;
	//protected SetCIDNumChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetCIDNumDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetCIDNumResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetCIDNumResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetCIDNumResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SetCIDNumCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldcnum,		
			fStringTextFielda,		
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
        this.add(getJPanelcnum(), null); // Generated
        this.add(getJPanela(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldcnum.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielda.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldcnum.setValue(dataObject.getCnum());
        fStringTextFielda.setValue(dataObject.getA());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setCnum(fStringTextFieldcnum.getValue());
        dataObject.setA(fStringTextFielda.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SetCIDNum
	 */
	public void setDataObject(Object aSetCIDNum) {
	    //abstractdataObject = (AbstractConfigObject) aSetCIDNum;
		setDataObject((SetCIDNum) aSetCIDNum);
		//dataObject = aSetCIDNum;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SetCIDNum
	 */
	public void setDataObject(SetCIDNum aSetCIDNum) {
	    //abstractdataObject = (AbstractConfigObject) aSetCIDNum;
		dataObject = aSetCIDNum;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcnum;
    protected javax.swing.JLabel fJLabelcnum;
	protected javax.swing.JPanel fJPanelcnum;
    protected StringTextField fStringTextFielda;
    protected javax.swing.JLabel fJLabela;
	protected javax.swing.JPanel fJPanela;
    

//start DB field cnum
    /**
     * This method initializes fStringTextFieldcnum
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcnum() {
        if (fStringTextFieldcnum == null) {
            try {
                fStringTextFieldcnum = new StringTextField(); // Generated
                fStringTextFieldcnum.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcnum;
    }
        
    /**
     * This method initializes  fJLabelcnum
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcnum() {
        if (fJLabelcnum == null) {
            try {
                 fJLabelcnum = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcnum.setText(resBundel.getString("res_strcnumDisplayName")); // Generated
                 fJLabelcnum.setToolTipText(resBundel.getString("res_strcnumDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcnum;
    }


    /**
     * This method initializes  fJPanelcnum
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcnum() {
        if (fJPanelcnum == null) {
            try {
                fJPanelcnum = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcnum.setLayout(layFlowLayout); // Generated
                fJPanelcnum.add(getJLabelcnum(), null); // Generated
                fJPanelcnum.add(getStringTextFieldcnum(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcnum;
    }
//end DB field cnum
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

}

	