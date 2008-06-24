package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.DBget;

/**
 * <p>
 * DBgetDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:38 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DBgetDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class DBgetDataPanel extends SimpleDataObjectPanel{
	protected DBget dataObject;
	//protected DBgetChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DBgetDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDBgetResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDBgetResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DBgetResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new DBgetCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldvarname,		
			fStringTextFieldfamily,		
			fStringTextFieldkey,		
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
		this.setSize(400,(3)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelvarname(), null); // Generated
        this.add(getJPanelfamily(), null); // Generated
        this.add(getJPanelkey(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldvarname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldfamily.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldkey.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldvarname.setValue(dataObject.getVarname());
        fStringTextFieldfamily.setValue(dataObject.getFamily());
        fStringTextFieldkey.setValue(dataObject.getKey());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setVarname(fStringTextFieldvarname.getValue());
        dataObject.setFamily(fStringTextFieldfamily.getValue());
        dataObject.setKey(fStringTextFieldkey.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param DBget
	 */
	public void setDataObject(Object aDBget) {
	    //abstractdataObject = (AbstractConfigObject) aDBget;
		setDataObject((DBget) aDBget);
		//dataObject = aDBget;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param DBget
	 */
	public void setDataObject(DBget aDBget) {
	    //abstractdataObject = (AbstractConfigObject) aDBget;
		dataObject = aDBget;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldvarname;
    protected javax.swing.JLabel fJLabelvarname;
	protected javax.swing.JPanel fJPanelvarname;
    protected StringTextField fStringTextFieldfamily;
    protected javax.swing.JLabel fJLabelfamily;
	protected javax.swing.JPanel fJPanelfamily;
    protected StringTextField fStringTextFieldkey;
    protected javax.swing.JLabel fJLabelkey;
	protected javax.swing.JPanel fJPanelkey;
    

//start DB field varname
    /**
     * This method initializes fStringTextFieldvarname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvarname() {
        if (fStringTextFieldvarname == null) {
            try {
                fStringTextFieldvarname = new StringTextField(); // Generated
                fStringTextFieldvarname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvarname;
    }
        
    /**
     * This method initializes  fJLabelvarname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvarname() {
        if (fJLabelvarname == null) {
            try {
                 fJLabelvarname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvarname.setText(resBundel.getString("res_strvarnameDisplayName")); // Generated
                 fJLabelvarname.setToolTipText(resBundel.getString("res_strvarnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvarname;
    }


    /**
     * This method initializes  fJPanelvarname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvarname() {
        if (fJPanelvarname == null) {
            try {
                fJPanelvarname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvarname.setLayout(layFlowLayout); // Generated
                fJPanelvarname.add(getJLabelvarname(), null); // Generated
                fJPanelvarname.add(getStringTextFieldvarname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvarname;
    }
//end DB field varname
//start DB field family
    /**
     * This method initializes fStringTextFieldfamily
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfamily() {
        if (fStringTextFieldfamily == null) {
            try {
                fStringTextFieldfamily = new StringTextField(); // Generated
                fStringTextFieldfamily.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfamily;
    }
        
    /**
     * This method initializes  fJLabelfamily
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfamily() {
        if (fJLabelfamily == null) {
            try {
                 fJLabelfamily = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfamily.setText(resBundel.getString("res_strfamilyDisplayName")); // Generated
                 fJLabelfamily.setToolTipText(resBundel.getString("res_strfamilyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfamily;
    }


    /**
     * This method initializes  fJPanelfamily
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfamily() {
        if (fJPanelfamily == null) {
            try {
                fJPanelfamily = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfamily.setLayout(layFlowLayout); // Generated
                fJPanelfamily.add(getJLabelfamily(), null); // Generated
                fJPanelfamily.add(getStringTextFieldfamily(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfamily;
    }
//end DB field family
//start DB field key
    /**
     * This method initializes fStringTextFieldkey
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldkey() {
        if (fStringTextFieldkey == null) {
            try {
                fStringTextFieldkey = new StringTextField(); // Generated
                fStringTextFieldkey.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldkey;
    }
        
    /**
     * This method initializes  fJLabelkey
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelkey() {
        if (fJLabelkey == null) {
            try {
                 fJLabelkey = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelkey.setText(resBundel.getString("res_strkeyDisplayName")); // Generated
                 fJLabelkey.setToolTipText(resBundel.getString("res_strkeyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelkey;
    }


    /**
     * This method initializes  fJPanelkey
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelkey() {
        if (fJPanelkey == null) {
            try {
                fJPanelkey = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelkey.setLayout(layFlowLayout); // Generated
                fJPanelkey.add(getJLabelkey(), null); // Generated
                fJPanelkey.add(getStringTextFieldkey(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelkey;
    }
//end DB field key

}

	