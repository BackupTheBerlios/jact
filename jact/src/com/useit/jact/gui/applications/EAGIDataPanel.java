package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.EAGI;

/**
 * <p>
 * EAGIDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: EAGIDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class EAGIDataPanel extends SimpleDataObjectPanel{
	protected EAGI dataObject;
	//protected EAGIChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public EAGIDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getEAGIResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getEAGIResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/EAGIResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new EAGICheckerImpl(resBundel);
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
	 * @param EAGI
	 */
	public void setDataObject(Object aEAGI) {
	    //abstractdataObject = (AbstractConfigObject) aEAGI;
		setDataObject((EAGI) aEAGI);
		//dataObject = aEAGI;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param EAGI
	 */
	public void setDataObject(EAGI aEAGI) {
	    //abstractdataObject = (AbstractConfigObject) aEAGI;
		dataObject = aEAGI;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	