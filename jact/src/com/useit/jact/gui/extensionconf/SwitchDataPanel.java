package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.extensionconf.Switch;

/**
 * <p>
 * SwitchDataPanel
 * </p>
 * Created : Fri May 26 17:18:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SwitchDataPanel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class SwitchDataPanel extends SimpleDataObjectPanel{
	protected Switch dataObject;
	//protected SwitchChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SwitchDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSwitchResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSwitchResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SwitchResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SwitchCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
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
        this.add(getJPanelswitchdialstr(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldswitchdialstr.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldswitchdialstr.setValue(dataObject.getSwitchdialstr());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setSwitchdialstr(fStringTextFieldswitchdialstr.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Switch
	 */
	public void setDataObject(Object aSwitch) {
	    //abstractdataObject = (AbstractConfigObject) aSwitch;
		setDataObject((Switch) aSwitch);
		//dataObject = aSwitch;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Switch
	 */
	public void setDataObject(Switch aSwitch) {
	    //abstractdataObject = (AbstractConfigObject) aSwitch;
		dataObject = aSwitch;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldswitchdialstr;
    protected javax.swing.JLabel fJLabelswitchdialstr;
	protected javax.swing.JPanel fJPanelswitchdialstr;
    

//start DB field switchdialstr
    /**
     * This method initializes fStringTextFieldswitchdialstr
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldswitchdialstr() {
        if (fStringTextFieldswitchdialstr == null) {
            try {
                fStringTextFieldswitchdialstr = new StringTextField(); // Generated
                fStringTextFieldswitchdialstr.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldswitchdialstr;
    }
        
    /**
     * This method initializes  fJLabelswitchdialstr
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelswitchdialstr() {
        if (fJLabelswitchdialstr == null) {
            try {
                 fJLabelswitchdialstr = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelswitchdialstr.setText(resBundel.getString("res_strswitchdialstrDisplayName")); // Generated
                 fJLabelswitchdialstr.setToolTipText(resBundel.getString("res_strswitchdialstrDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelswitchdialstr;
    }


    /**
     * This method initializes  fJPanelswitchdialstr
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelswitchdialstr() {
        if (fJPanelswitchdialstr == null) {
            try {
                fJPanelswitchdialstr = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelswitchdialstr.setLayout(layFlowLayout); // Generated
                fJPanelswitchdialstr.add(getJLabelswitchdialstr(), null); // Generated
                fJPanelswitchdialstr.add(getStringTextFieldswitchdialstr(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelswitchdialstr;
    }
//end DB field switchdialstr

}

	