package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.sipconf.SipConf;

/**
 * <p>
 * SipConfDataPanel
 * </p>
 * Created : Fri May 26 14:16:14 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipConfDataPanel.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
public class SipConfDataPanel extends SimpleDataObjectPanel{
	protected SipConf dataObject;
	//protected SipConfChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SipConfDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSipConfResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSipConfResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SipConfResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SipConfCheckerImpl(resBundel);
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
		//this.add(getJPanelsipgeneral(),null);
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();

		//fJComboBoxsipgeneral.addActionListener(textChangeAct);
}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);

		//fJComboBoxsipgeneral.setSelectedItem(dataObject.getSipgeneral());

   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
	}

	/**
	 * setzt das DatenObject
	 * @param SipConf
	 */
	public void setDataObject(Object aSipConf) {
	    //abstractdataObject = (AbstractConfigObject) aSipConf;
		setDataObject((SipConf) aSipConf);
		//dataObject = aSipConf;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SipConf
	 */
	public void setDataObject(SipConf aSipConf) {
	    //abstractdataObject = (AbstractConfigObject) aSipConf;
		dataObject = aSipConf;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	