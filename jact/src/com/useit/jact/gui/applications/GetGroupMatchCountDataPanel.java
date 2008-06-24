package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.GetGroupMatchCount;

/**
 * <p>
 * GetGroupMatchCountDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:37 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GetGroupMatchCountDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class GetGroupMatchCountDataPanel extends SimpleDataObjectPanel{
	protected GetGroupMatchCount dataObject;
	//protected GetGroupMatchCountChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public GetGroupMatchCountDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getGetGroupMatchCountResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getGetGroupMatchCountResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/GetGroupMatchCountResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new GetGroupMatchCountCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldgroupmatch,		
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
        this.add(getJPanelgroupmatch(), null); // Generated
        this.add(getJPanelcategory(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldgroupmatch.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcategory.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldgroupmatch.setValue(dataObject.getGroupmatch());
        fStringTextFieldcategory.setValue(dataObject.getCategory());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setGroupmatch(fStringTextFieldgroupmatch.getValue());
        dataObject.setCategory(fStringTextFieldcategory.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param GetGroupMatchCount
	 */
	public void setDataObject(Object aGetGroupMatchCount) {
	    //abstractdataObject = (AbstractConfigObject) aGetGroupMatchCount;
		setDataObject((GetGroupMatchCount) aGetGroupMatchCount);
		//dataObject = aGetGroupMatchCount;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param GetGroupMatchCount
	 */
	public void setDataObject(GetGroupMatchCount aGetGroupMatchCount) {
	    //abstractdataObject = (AbstractConfigObject) aGetGroupMatchCount;
		dataObject = aGetGroupMatchCount;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldgroupmatch;
    protected javax.swing.JLabel fJLabelgroupmatch;
	protected javax.swing.JPanel fJPanelgroupmatch;
    protected StringTextField fStringTextFieldcategory;
    protected javax.swing.JLabel fJLabelcategory;
	protected javax.swing.JPanel fJPanelcategory;
    

//start DB field groupmatch
    /**
     * This method initializes fStringTextFieldgroupmatch
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldgroupmatch() {
        if (fStringTextFieldgroupmatch == null) {
            try {
                fStringTextFieldgroupmatch = new StringTextField(); // Generated
                fStringTextFieldgroupmatch.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldgroupmatch;
    }
        
    /**
     * This method initializes  fJLabelgroupmatch
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelgroupmatch() {
        if (fJLabelgroupmatch == null) {
            try {
                 fJLabelgroupmatch = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelgroupmatch.setText(resBundel.getString("res_strgroupmatchDisplayName")); // Generated
                 fJLabelgroupmatch.setToolTipText(resBundel.getString("res_strgroupmatchDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelgroupmatch;
    }


    /**
     * This method initializes  fJPanelgroupmatch
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelgroupmatch() {
        if (fJPanelgroupmatch == null) {
            try {
                fJPanelgroupmatch = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelgroupmatch.setLayout(layFlowLayout); // Generated
                fJPanelgroupmatch.add(getJLabelgroupmatch(), null); // Generated
                fJPanelgroupmatch.add(getStringTextFieldgroupmatch(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelgroupmatch;
    }
//end DB field groupmatch
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

	