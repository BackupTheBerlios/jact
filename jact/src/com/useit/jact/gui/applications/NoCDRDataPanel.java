package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.NoCDR;

/**
 * <p>
 * NoCDRDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:33 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: NoCDRDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class NoCDRDataPanel extends SimpleDataObjectPanel{
	protected NoCDR dataObject;
	//protected NoCDRChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public NoCDRDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getNoCDRResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getNoCDRResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/NoCDRResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new NoCDRCheckerImpl(resBundel);
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
		this.setSize(400,(0)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(0); // Generated
        this.setLayout(layGridLayout); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
	}

	/**
	 * setzt das DatenObject
	 * @param NoCDR
	 */
	public void setDataObject(Object aNoCDR) {
	    //abstractdataObject = (AbstractConfigObject) aNoCDR;
		setDataObject((NoCDR) aNoCDR);
		//dataObject = aNoCDR;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param NoCDR
	 */
	public void setDataObject(NoCDR aNoCDR) {
	    //abstractdataObject = (AbstractConfigObject) aNoCDR;
		dataObject = aNoCDR;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	