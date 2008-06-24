package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.DISA;

/**
 * <p>
 * DISADataPanel
 * </p>
 * Created : Mon Jul 10 18:06:12 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DISADataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class DISADataPanel extends SimpleDataObjectPanel{
	protected DISA dataObject;
	//protected DISAChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DISADataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDISAResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDISAResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DISAResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new DISACheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFielddirect,		
			fStringTextFieldinward,		
			fStringTextFieldsystem,		
			fStringTextFieldaccess,		
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
		this.setSize(400,(4)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneldirect(), null); // Generated
        this.add(getJPanelinward(), null); // Generated
        this.add(getJPanelsystem(), null); // Generated
        this.add(getJPanelaccess(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFielddirect.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldinward.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldsystem.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldaccess.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFielddirect.setValue(dataObject.getDirect());
        fStringTextFieldinward.setValue(dataObject.getInward());
        fStringTextFieldsystem.setValue(dataObject.getSystem());
        fStringTextFieldaccess.setValue(dataObject.getAccess());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setDirect(fStringTextFielddirect.getValue());
        dataObject.setInward(fStringTextFieldinward.getValue());
        dataObject.setSystem(fStringTextFieldsystem.getValue());
        dataObject.setAccess(fStringTextFieldaccess.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param DISA
	 */
	public void setDataObject(Object aDISA) {
	    //abstractdataObject = (AbstractConfigObject) aDISA;
		setDataObject((DISA) aDISA);
		//dataObject = aDISA;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param DISA
	 */
	public void setDataObject(DISA aDISA) {
	    //abstractdataObject = (AbstractConfigObject) aDISA;
		dataObject = aDISA;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFielddirect;
    protected javax.swing.JLabel fJLabeldirect;
	protected javax.swing.JPanel fJPaneldirect;
    protected StringTextField fStringTextFieldinward;
    protected javax.swing.JLabel fJLabelinward;
	protected javax.swing.JPanel fJPanelinward;
    protected StringTextField fStringTextFieldsystem;
    protected javax.swing.JLabel fJLabelsystem;
	protected javax.swing.JPanel fJPanelsystem;
    protected StringTextField fStringTextFieldaccess;
    protected javax.swing.JLabel fJLabelaccess;
	protected javax.swing.JPanel fJPanelaccess;
    

//start DB field direct
    /**
     * This method initializes fStringTextFielddirect
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielddirect() {
        if (fStringTextFielddirect == null) {
            try {
                fStringTextFielddirect = new StringTextField(); // Generated
                fStringTextFielddirect.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddirect;
    }
        
    /**
     * This method initializes  fJLabeldirect
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldirect() {
        if (fJLabeldirect == null) {
            try {
                 fJLabeldirect = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldirect.setText(resBundel.getString("res_strdirectDisplayName")); // Generated
                 fJLabeldirect.setToolTipText(resBundel.getString("res_strdirectDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldirect;
    }


    /**
     * This method initializes  fJPaneldirect
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldirect() {
        if (fJPaneldirect == null) {
            try {
                fJPaneldirect = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldirect.setLayout(layFlowLayout); // Generated
                fJPaneldirect.add(getJLabeldirect(), null); // Generated
                fJPaneldirect.add(getStringTextFielddirect(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldirect;
    }
//end DB field direct
//start DB field inward
    /**
     * This method initializes fStringTextFieldinward
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldinward() {
        if (fStringTextFieldinward == null) {
            try {
                fStringTextFieldinward = new StringTextField(); // Generated
                fStringTextFieldinward.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldinward;
    }
        
    /**
     * This method initializes  fJLabelinward
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelinward() {
        if (fJLabelinward == null) {
            try {
                 fJLabelinward = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelinward.setText(resBundel.getString("res_strinwardDisplayName")); // Generated
                 fJLabelinward.setToolTipText(resBundel.getString("res_strinwardDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelinward;
    }


    /**
     * This method initializes  fJPanelinward
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelinward() {
        if (fJPanelinward == null) {
            try {
                fJPanelinward = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelinward.setLayout(layFlowLayout); // Generated
                fJPanelinward.add(getJLabelinward(), null); // Generated
                fJPanelinward.add(getStringTextFieldinward(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelinward;
    }
//end DB field inward
//start DB field system
    /**
     * This method initializes fStringTextFieldsystem
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsystem() {
        if (fStringTextFieldsystem == null) {
            try {
                fStringTextFieldsystem = new StringTextField(); // Generated
                fStringTextFieldsystem.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsystem;
    }
        
    /**
     * This method initializes  fJLabelsystem
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsystem() {
        if (fJLabelsystem == null) {
            try {
                 fJLabelsystem = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelsystem.setText(resBundel.getString("res_strsystemDisplayName")); // Generated
                 fJLabelsystem.setToolTipText(resBundel.getString("res_strsystemDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelsystem;
    }


    /**
     * This method initializes  fJPanelsystem
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsystem() {
        if (fJPanelsystem == null) {
            try {
                fJPanelsystem = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsystem.setLayout(layFlowLayout); // Generated
                fJPanelsystem.add(getJLabelsystem(), null); // Generated
                fJPanelsystem.add(getStringTextFieldsystem(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsystem;
    }
//end DB field system
//start DB field access
    /**
     * This method initializes fStringTextFieldaccess
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldaccess() {
        if (fStringTextFieldaccess == null) {
            try {
                fStringTextFieldaccess = new StringTextField(); // Generated
                fStringTextFieldaccess.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldaccess;
    }
        
    /**
     * This method initializes  fJLabelaccess
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelaccess() {
        if (fJLabelaccess == null) {
            try {
                 fJLabelaccess = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelaccess.setText(resBundel.getString("res_straccessDisplayName")); // Generated
                 fJLabelaccess.setToolTipText(resBundel.getString("res_straccessDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelaccess;
    }


    /**
     * This method initializes  fJPanelaccess
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelaccess() {
        if (fJPanelaccess == null) {
            try {
                fJPanelaccess = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelaccess.setLayout(layFlowLayout); // Generated
                fJPanelaccess.add(getJLabelaccess(), null); // Generated
                fJPanelaccess.add(getStringTextFieldaccess(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelaccess;
    }
//end DB field access

}

	