package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.CheckGroup;

/**
 * <p>
 * CheckGroupDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:49 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: CheckGroupDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class CheckGroupDataPanel extends SimpleDataObjectPanel{
	protected CheckGroup dataObject;
	//protected CheckGroupChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public CheckGroupDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getCheckGroupResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getCheckGroupResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/CheckGroupResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new CheckGroupCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldmax,		
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
        this.add(getJPanelmax(), null); // Generated
        this.add(getJPanelcategory(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldmax.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcategory.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldmax.setValue(dataObject.getMax());
        fStringTextFieldcategory.setValue(dataObject.getCategory());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setMax(fStringTextFieldmax.getValue());
        dataObject.setCategory(fStringTextFieldcategory.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param CheckGroup
	 */
	public void setDataObject(Object aCheckGroup) {
	    //abstractdataObject = (AbstractConfigObject) aCheckGroup;
		setDataObject((CheckGroup) aCheckGroup);
		//dataObject = aCheckGroup;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param CheckGroup
	 */
	public void setDataObject(CheckGroup aCheckGroup) {
	    //abstractdataObject = (AbstractConfigObject) aCheckGroup;
		dataObject = aCheckGroup;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldmax;
    protected javax.swing.JLabel fJLabelmax;
	protected javax.swing.JPanel fJPanelmax;
    protected StringTextField fStringTextFieldcategory;
    protected javax.swing.JLabel fJLabelcategory;
	protected javax.swing.JPanel fJPanelcategory;
    

//start DB field max
    /**
     * This method initializes fStringTextFieldmax
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmax() {
        if (fStringTextFieldmax == null) {
            try {
                fStringTextFieldmax = new StringTextField(); // Generated
                fStringTextFieldmax.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmax;
    }
        
    /**
     * This method initializes  fJLabelmax
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmax() {
        if (fJLabelmax == null) {
            try {
                 fJLabelmax = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmax.setText(resBundel.getString("res_strmaxDisplayName")); // Generated
                 fJLabelmax.setToolTipText(resBundel.getString("res_strmaxDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmax;
    }


    /**
     * This method initializes  fJPanelmax
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmax() {
        if (fJPanelmax == null) {
            try {
                fJPanelmax = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmax.setLayout(layFlowLayout); // Generated
                fJPanelmax.add(getJLabelmax(), null); // Generated
                fJPanelmax.add(getStringTextFieldmax(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmax;
    }
//end DB field max
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

	