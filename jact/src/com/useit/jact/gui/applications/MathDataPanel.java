package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.Math;

/**
 * <p>
 * MathDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:57 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MathDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MathDataPanel extends SimpleDataObjectPanel{
	protected Math dataObject;
	//protected MathChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MathDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMathResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMathResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MathResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MathCheckerImpl(resBundel);
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
	 * @param Math
	 */
	public void setDataObject(Object aMath) {
	    //abstractdataObject = (AbstractConfigObject) aMath;
		setDataObject((Math) aMath);
		//dataObject = aMath;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Math
	 */
	public void setDataObject(Math aMath) {
	    //abstractdataObject = (AbstractConfigObject) aMath;
		dataObject = aMath;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	