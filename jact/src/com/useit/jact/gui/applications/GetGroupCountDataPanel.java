package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.GetGroupCount;

/**
 * <p>
 * GetGroupCountDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:33 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GetGroupCountDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class GetGroupCountDataPanel extends SimpleDataObjectPanel{
	protected GetGroupCount dataObject;
	//protected GetGroupCountChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public GetGroupCountDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getGetGroupCountResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getGetGroupCountResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/GetGroupCountResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new GetGroupCountCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldgroup,		
			fStringTextFieldcategory,		
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
        this.add(getJPanelgroup(), null); // Generated
        this.add(getJPanelcategory(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldgroup.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcategory.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldgroup.setValue(dataObject.getGroup());
        fStringTextFieldcategory.setValue(dataObject.getCategory());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setGroup(fStringTextFieldgroup.getValue());
        dataObject.setCategory(fStringTextFieldcategory.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param GetGroupCount
	 */
	public void setDataObject(Object aGetGroupCount) {
	    //abstractdataObject = (AbstractConfigObject) aGetGroupCount;
		setDataObject((GetGroupCount) aGetGroupCount);
		//dataObject = aGetGroupCount;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param GetGroupCount
	 */
	public void setDataObject(GetGroupCount aGetGroupCount) {
	    //abstractdataObject = (AbstractConfigObject) aGetGroupCount;
		dataObject = aGetGroupCount;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldgroup;
    protected javax.swing.JLabel fJLabelgroup;
	protected javax.swing.JPanel fJPanelgroup;
    protected StringTextField fStringTextFieldcategory;
    protected javax.swing.JLabel fJLabelcategory;
	protected javax.swing.JPanel fJPanelcategory;
    

//start DB field group
    /**
     * This method initializes fStringTextFieldgroup
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldgroup() {
        if (fStringTextFieldgroup == null) {
            try {
                fStringTextFieldgroup = new StringTextField(); // Generated
                fStringTextFieldgroup.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldgroup;
    }
        
    /**
     * This method initializes  fJLabelgroup
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelgroup() {
        if (fJLabelgroup == null) {
            try {
                 fJLabelgroup = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelgroup.setText(resBundel.getString("res_strgroupDisplayName")); // Generated
                 fJLabelgroup.setToolTipText(resBundel.getString("res_strgroupDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelgroup;
    }


    /**
     * This method initializes  fJPanelgroup
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelgroup() {
        if (fJPanelgroup == null) {
            try {
                fJPanelgroup = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelgroup.setLayout(layFlowLayout); // Generated
                fJPanelgroup.add(getJLabelgroup(), null); // Generated
                fJPanelgroup.add(getStringTextFieldgroup(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelgroup;
    }
//end DB field group
//start DB field category
    /**
     * This method initializes fStringTextFieldcategory
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcategory() {
        if (fStringTextFieldcategory == null) {
            try {
                fStringTextFieldcategory = new StringTextField(); // Generated
                fStringTextFieldcategory.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcategory;
    }
        
    /**
     * This method initializes  fJLabelcategory
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcategory() {
        if (fJLabelcategory == null) {
            try {
                 fJLabelcategory = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcategory.setText(resBundel.getString("res_strcategoryDisplayName")); // Generated
                 fJLabelcategory.setToolTipText(resBundel.getString("res_strcategoryDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcategory;
    }


    /**
     * This method initializes  fJPanelcategory
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcategory() {
        if (fJPanelcategory == null) {
            try {
                fJPanelcategory = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcategory.setLayout(layFlowLayout); // Generated
                fJPanelcategory.add(getJLabelcategory(), null); // Generated
                fJPanelcategory.add(getStringTextFieldcategory(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcategory;
    }
//end DB field category

}

	