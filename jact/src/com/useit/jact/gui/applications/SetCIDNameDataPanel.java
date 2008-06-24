package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SetCIDName;

/**
 * <p>
 * SetCIDNameDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:29 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCIDNameDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SetCIDNameDataPanel extends SimpleDataObjectPanel{
	protected SetCIDName dataObject;
	//protected SetCIDNameChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetCIDNameDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetCIDNameResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetCIDNameResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetCIDNameResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SetCIDNameCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldcname,		
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
        this.add(getJPanelcname(), null); // Generated
        this.add(getJPanela(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldcname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielda.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldcname.setValue(dataObject.getCname());
        fStringTextFielda.setValue(dataObject.getA());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setCname(fStringTextFieldcname.getValue());
        dataObject.setA(fStringTextFielda.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SetCIDName
	 */
	public void setDataObject(Object aSetCIDName) {
	    //abstractdataObject = (AbstractConfigObject) aSetCIDName;
		setDataObject((SetCIDName) aSetCIDName);
		//dataObject = aSetCIDName;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SetCIDName
	 */
	public void setDataObject(SetCIDName aSetCIDName) {
	    //abstractdataObject = (AbstractConfigObject) aSetCIDName;
		dataObject = aSetCIDName;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcname;
    protected javax.swing.JLabel fJLabelcname;
	protected javax.swing.JPanel fJPanelcname;
    protected StringTextField fStringTextFielda;
    protected javax.swing.JLabel fJLabela;
	protected javax.swing.JPanel fJPanela;
    

//start DB field cname
    /**
     * This method initializes fStringTextFieldcname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcname() {
        if (fStringTextFieldcname == null) {
            try {
                fStringTextFieldcname = new StringTextField(); // Generated
                fStringTextFieldcname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcname;
    }
        
    /**
     * This method initializes  fJLabelcname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcname() {
        if (fJLabelcname == null) {
            try {
                 fJLabelcname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcname.setText(resBundel.getString("res_strcnameDisplayName")); // Generated
                 fJLabelcname.setToolTipText(resBundel.getString("res_strcnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcname;
    }


    /**
     * This method initializes  fJPanelcname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcname() {
        if (fJPanelcname == null) {
            try {
                fJPanelcname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcname.setLayout(layFlowLayout); // Generated
                fJPanelcname.add(getJLabelcname(), null); // Generated
                fJPanelcname.add(getStringTextFieldcname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcname;
    }
//end DB field cname
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

	