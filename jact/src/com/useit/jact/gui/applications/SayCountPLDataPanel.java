package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.SayCountPL;

/**
 * <p>
 * SayCountPLDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:35 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayCountPLDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SayCountPLDataPanel extends SimpleDataObjectPanel{
	protected SayCountPL dataObject;
	//protected SayCountPLChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SayCountPLDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSayCountPLResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSayCountPLResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SayCountPLResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SayCountPLCheckerImpl(resBundel);
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
	 * @param SayCountPL
	 */
	public void setDataObject(Object aSayCountPL) {
	    //abstractdataObject = (AbstractConfigObject) aSayCountPL;
		setDataObject((SayCountPL) aSayCountPL);
		//dataObject = aSayCountPL;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SayCountPL
	 */
	public void setDataObject(SayCountPL aSayCountPL) {
	    //abstractdataObject = (AbstractConfigObject) aSayCountPL;
		dataObject = aSayCountPL;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	