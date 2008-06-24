package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.DBdeltree;

/**
 * <p>
 * DBdeltreeDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:48 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DBdeltreeDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class DBdeltreeDataPanel extends SimpleDataObjectPanel{
	protected DBdeltree dataObject;
	//protected DBdeltreeChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DBdeltreeDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDBdeltreeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDBdeltreeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DBdeltreeResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new DBdeltreeCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfamily,		
			fStringTextFieldkeytree,		
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
        this.add(getJPanelkeytree(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfamily.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldkeytree.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfamily.setValue(dataObject.getFamily());
        fStringTextFieldkeytree.setValue(dataObject.getKeytree());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFamily(fStringTextFieldfamily.getValue());
        dataObject.setKeytree(fStringTextFieldkeytree.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param DBdeltree
	 */
	public void setDataObject(Object aDBdeltree) {
	    //abstractdataObject = (AbstractConfigObject) aDBdeltree;
		setDataObject((DBdeltree) aDBdeltree);
		//dataObject = aDBdeltree;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param DBdeltree
	 */
	public void setDataObject(DBdeltree aDBdeltree) {
	    //abstractdataObject = (AbstractConfigObject) aDBdeltree;
		dataObject = aDBdeltree;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfamily;
    protected javax.swing.JLabel fJLabelfamily;
	protected javax.swing.JPanel fJPanelfamily;
    protected StringTextField fStringTextFieldkeytree;
    protected javax.swing.JLabel fJLabelkeytree;
	protected javax.swing.JPanel fJPanelkeytree;
    

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
//start DB field keytree
    /**
     * This method initializes fStringTextFieldkeytree
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldkeytree() {
        if (fStringTextFieldkeytree == null) {
            try {
                fStringTextFieldkeytree = new StringTextField(); // Generated
                fStringTextFieldkeytree.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldkeytree;
    }
        
    /**
     * This method initializes  fJLabelkeytree
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelkeytree() {
        if (fJLabelkeytree == null) {
            try {
                 fJLabelkeytree = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelkeytree.setText(resBundel.getString("res_strkeytreeDisplayName")); // Generated
                 fJLabelkeytree.setToolTipText(resBundel.getString("res_strkeytreeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelkeytree;
    }


    /**
     * This method initializes  fJPanelkeytree
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelkeytree() {
        if (fJPanelkeytree == null) {
            try {
                fJPanelkeytree = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelkeytree.setLayout(layFlowLayout); // Generated
                fJPanelkeytree.add(getJLabelkeytree(), null); // Generated
                fJPanelkeytree.add(getStringTextFieldkeytree(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelkeytree;
    }
//end DB field keytree

}

	