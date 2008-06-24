package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.DBdel;

/**
 * <p>
 * DBdelDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:44 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DBdelDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class DBdelDataPanel extends SimpleDataObjectPanel{
	protected DBdel dataObject;
	//protected DBdelChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DBdelDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDBdelResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDBdelResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DBdelResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new DBdelCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
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
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelfamily(), null); // Generated
        this.add(getJPanelkey(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfamily.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldkey.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfamily.setValue(dataObject.getFamily());
        fStringTextFieldkey.setValue(dataObject.getKey());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFamily(fStringTextFieldfamily.getValue());
        dataObject.setKey(fStringTextFieldkey.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param DBdel
	 */
	public void setDataObject(Object aDBdel) {
	    //abstractdataObject = (AbstractConfigObject) aDBdel;
		setDataObject((DBdel) aDBdel);
		//dataObject = aDBdel;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param DBdel
	 */
	public void setDataObject(DBdel aDBdel) {
	    //abstractdataObject = (AbstractConfigObject) aDBdel;
		dataObject = aDBdel;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfamily;
    protected javax.swing.JLabel fJLabelfamily;
	protected javax.swing.JPanel fJPanelfamily;
    protected StringTextField fStringTextFieldkey;
    protected javax.swing.JLabel fJLabelkey;
	protected javax.swing.JPanel fJPanelkey;
    

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

	