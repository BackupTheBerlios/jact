package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SetCallerID;

/**
 * <p>
 * SetCallerIDDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:13 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCallerIDDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SetCallerIDDataPanel extends SimpleDataObjectPanel{
	protected SetCallerID dataObject;
	//protected SetCallerIDChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetCallerIDDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetCallerIDResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetCallerIDResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetCallerIDResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SetCallerIDCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldclid,		
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
        this.add(getJPanelclid(), null); // Generated
        this.add(getJPanela(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldclid.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielda.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldclid.setValue(dataObject.getClid());
        fStringTextFielda.setValue(dataObject.getA());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setClid(fStringTextFieldclid.getValue());
        dataObject.setA(fStringTextFielda.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SetCallerID
	 */
	public void setDataObject(Object aSetCallerID) {
	    //abstractdataObject = (AbstractConfigObject) aSetCallerID;
		setDataObject((SetCallerID) aSetCallerID);
		//dataObject = aSetCallerID;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SetCallerID
	 */
	public void setDataObject(SetCallerID aSetCallerID) {
	    //abstractdataObject = (AbstractConfigObject) aSetCallerID;
		dataObject = aSetCallerID;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldclid;
    protected javax.swing.JLabel fJLabelclid;
	protected javax.swing.JPanel fJPanelclid;
    protected StringTextField fStringTextFielda;
    protected javax.swing.JLabel fJLabela;
	protected javax.swing.JPanel fJPanela;
    

//start DB field clid
    /**
     * This method initializes fStringTextFieldclid
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldclid() {
        if (fStringTextFieldclid == null) {
            try {
                fStringTextFieldclid = new StringTextField(); // Generated
                fStringTextFieldclid.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldclid;
    }
        
    /**
     * This method initializes  fJLabelclid
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelclid() {
        if (fJLabelclid == null) {
            try {
                 fJLabelclid = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelclid.setText(resBundel.getString("res_strclidDisplayName")); // Generated
                 fJLabelclid.setToolTipText(resBundel.getString("res_strclidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelclid;
    }


    /**
     * This method initializes  fJPanelclid
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelclid() {
        if (fJPanelclid == null) {
            try {
                fJPanelclid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelclid.setLayout(layFlowLayout); // Generated
                fJPanelclid.add(getJLabelclid(), null); // Generated
                fJPanelclid.add(getStringTextFieldclid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelclid;
    }
//end DB field clid
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

	