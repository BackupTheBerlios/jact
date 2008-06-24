package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ICES;

/**
 * <p>
 * ICESDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:05 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ICESDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class ICESDataPanel extends SimpleDataObjectPanel{
	protected ICES dataObject;
	//protected ICESChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ICESDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getICESResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getICESResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ICESResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ICESCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldconfig,		
			fStringTextFieldxml,		
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
        this.add(getJPanelconfig(), null); // Generated
        this.add(getJPanelxml(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldconfig.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldxml.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldconfig.setValue(dataObject.getConfig());
        fStringTextFieldxml.setValue(dataObject.getXml());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setConfig(fStringTextFieldconfig.getValue());
        dataObject.setXml(fStringTextFieldxml.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ICES
	 */
	public void setDataObject(Object aICES) {
	    //abstractdataObject = (AbstractConfigObject) aICES;
		setDataObject((ICES) aICES);
		//dataObject = aICES;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ICES
	 */
	public void setDataObject(ICES aICES) {
	    //abstractdataObject = (AbstractConfigObject) aICES;
		dataObject = aICES;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldconfig;
    protected javax.swing.JLabel fJLabelconfig;
	protected javax.swing.JPanel fJPanelconfig;
    protected StringTextField fStringTextFieldxml;
    protected javax.swing.JLabel fJLabelxml;
	protected javax.swing.JPanel fJPanelxml;
    

//start DB field config
    /**
     * This method initializes fStringTextFieldconfig
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldconfig() {
        if (fStringTextFieldconfig == null) {
            try {
                fStringTextFieldconfig = new StringTextField(); // Generated
                fStringTextFieldconfig.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldconfig;
    }
        
    /**
     * This method initializes  fJLabelconfig
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelconfig() {
        if (fJLabelconfig == null) {
            try {
                 fJLabelconfig = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelconfig.setText(resBundel.getString("res_strconfigDisplayName")); // Generated
                 fJLabelconfig.setToolTipText(resBundel.getString("res_strconfigDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelconfig;
    }


    /**
     * This method initializes  fJPanelconfig
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelconfig() {
        if (fJPanelconfig == null) {
            try {
                fJPanelconfig = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelconfig.setLayout(layFlowLayout); // Generated
                fJPanelconfig.add(getJLabelconfig(), null); // Generated
                fJPanelconfig.add(getStringTextFieldconfig(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelconfig;
    }
//end DB field config
//start DB field xml
    /**
     * This method initializes fStringTextFieldxml
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldxml() {
        if (fStringTextFieldxml == null) {
            try {
                fStringTextFieldxml = new StringTextField(); // Generated
                fStringTextFieldxml.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldxml;
    }
        
    /**
     * This method initializes  fJLabelxml
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelxml() {
        if (fJLabelxml == null) {
            try {
                 fJLabelxml = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelxml.setText(resBundel.getString("res_strxmlDisplayName")); // Generated
                 fJLabelxml.setToolTipText(resBundel.getString("res_strxmlDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelxml;
    }


    /**
     * This method initializes  fJPanelxml
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelxml() {
        if (fJPanelxml == null) {
            try {
                fJPanelxml = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelxml.setLayout(layFlowLayout); // Generated
                fJPanelxml.add(getJLabelxml(), null); // Generated
                fJPanelxml.add(getStringTextFieldxml(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelxml;
    }
//end DB field xml

}

	