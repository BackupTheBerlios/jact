package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.extensionconf.Globalvars;

/**
 * <p>
 * GlobalvarsDataPanel
 * </p>
 * Created : Fri May 26 17:18:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GlobalvarsDataPanel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class GlobalvarsDataPanel extends SimpleDataObjectPanel{
	protected Globalvars dataObject;
	//protected GlobalvarsChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public GlobalvarsDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getGlobalvarsResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getGlobalvarsResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/GlobalvarsResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new GlobalvarsCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldname,		
			fStringTextFieldvalue,		
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
        this.add(getJPanelname(), null); // Generated
        this.add(getJPanelvalue(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldvalue.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldname.setValue(dataObject.getName());
        fStringTextFieldvalue.setValue(dataObject.getValue());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setName(fStringTextFieldname.getValue());
        dataObject.setValue(fStringTextFieldvalue.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Globalvars
	 */
	public void setDataObject(Object aGlobalvars) {
	    //abstractdataObject = (AbstractConfigObject) aGlobalvars;
		setDataObject((Globalvars) aGlobalvars);
		//dataObject = aGlobalvars;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Globalvars
	 */
	public void setDataObject(Globalvars aGlobalvars) {
	    //abstractdataObject = (AbstractConfigObject) aGlobalvars;
		dataObject = aGlobalvars;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldname;
    protected javax.swing.JLabel fJLabelname;
	protected javax.swing.JPanel fJPanelname;
    protected StringTextField fStringTextFieldvalue;
    protected javax.swing.JLabel fJLabelvalue;
	protected javax.swing.JPanel fJPanelvalue;
    

//start DB field name
    /**
     * This method initializes fStringTextFieldname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldname() {
        if (fStringTextFieldname == null) {
            try {
                fStringTextFieldname = new StringTextField(); // Generated
                fStringTextFieldname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldname;
    }
        
    /**
     * This method initializes  fJLabelname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelname() {
        if (fJLabelname == null) {
            try {
                 fJLabelname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelname.setText(resBundel.getString("res_strnameDisplayName")); // Generated
                 fJLabelname.setToolTipText(resBundel.getString("res_strnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelname;
    }


    /**
     * This method initializes  fJPanelname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelname() {
        if (fJPanelname == null) {
            try {
                fJPanelname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelname.setLayout(layFlowLayout); // Generated
                fJPanelname.add(getJLabelname(), null); // Generated
                fJPanelname.add(getStringTextFieldname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelname;
    }
//end DB field name
//start DB field value
    /**
     * This method initializes fStringTextFieldvalue
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvalue() {
        if (fStringTextFieldvalue == null) {
            try {
                fStringTextFieldvalue = new StringTextField(); // Generated
                fStringTextFieldvalue.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvalue;
    }
        
    /**
     * This method initializes  fJLabelvalue
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvalue() {
        if (fJLabelvalue == null) {
            try {
                 fJLabelvalue = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvalue.setText(resBundel.getString("res_strvalueDisplayName")); // Generated
                 fJLabelvalue.setToolTipText(resBundel.getString("res_strvalueDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvalue;
    }


    /**
     * This method initializes  fJPanelvalue
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvalue() {
        if (fJPanelvalue == null) {
            try {
                fJPanelvalue = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvalue.setLayout(layFlowLayout); // Generated
                fJPanelvalue.add(getJLabelvalue(), null); // Generated
                fJPanelvalue.add(getStringTextFieldvalue(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvalue;
    }
//end DB field value

}

	