package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SetRDNIS;

/**
 * <p>
 * SetRDNISDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetRDNISDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SetRDNISDataPanel extends SimpleDataObjectPanel{
	protected SetRDNIS dataObject;
	//protected SetRDNISChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetRDNISDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetRDNISResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetRDNISResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetRDNISResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SetRDNISCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldcnum,		
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
		this.setSize(400,(1)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelcnum(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldcnum.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldcnum.setValue(dataObject.getCnum());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setCnum(fStringTextFieldcnum.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SetRDNIS
	 */
	public void setDataObject(Object aSetRDNIS) {
	    //abstractdataObject = (AbstractConfigObject) aSetRDNIS;
		setDataObject((SetRDNIS) aSetRDNIS);
		//dataObject = aSetRDNIS;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SetRDNIS
	 */
	public void setDataObject(SetRDNIS aSetRDNIS) {
	    //abstractdataObject = (AbstractConfigObject) aSetRDNIS;
		dataObject = aSetRDNIS;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcnum;
    protected javax.swing.JLabel fJLabelcnum;
	protected javax.swing.JPanel fJPanelcnum;
    

//start DB field cnum
    /**
     * This method initializes fStringTextFieldcnum
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcnum() {
        if (fStringTextFieldcnum == null) {
            try {
                fStringTextFieldcnum = new StringTextField(); // Generated
                fStringTextFieldcnum.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcnum;
    }
        
    /**
     * This method initializes  fJLabelcnum
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcnum() {
        if (fJLabelcnum == null) {
            try {
                 fJLabelcnum = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcnum.setText(resBundel.getString("res_strcnumDisplayName")); // Generated
                 fJLabelcnum.setToolTipText(resBundel.getString("res_strcnumDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcnum;
    }


    /**
     * This method initializes  fJPanelcnum
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcnum() {
        if (fJPanelcnum == null) {
            try {
                fJPanelcnum = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcnum.setLayout(layFlowLayout); // Generated
                fJPanelcnum.add(getJLabelcnum(), null); // Generated
                fJPanelcnum.add(getStringTextFieldcnum(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcnum;
    }
//end DB field cnum

}

	