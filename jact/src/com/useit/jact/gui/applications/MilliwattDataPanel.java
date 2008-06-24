package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.Milliwatt;

/**
 * <p>
 * MilliwattDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:50 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MilliwattDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MilliwattDataPanel extends SimpleDataObjectPanel{
	protected Milliwatt dataObject;
	//protected MilliwattChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MilliwattDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMilliwattResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMilliwattResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MilliwattResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MilliwattCheckerImpl(resBundel);
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
	 * @param Milliwatt
	 */
	public void setDataObject(Object aMilliwatt) {
	    //abstractdataObject = (AbstractConfigObject) aMilliwatt;
		setDataObject((Milliwatt) aMilliwatt);
		//dataObject = aMilliwatt;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Milliwatt
	 */
	public void setDataObject(Milliwatt aMilliwatt) {
	    //abstractdataObject = (AbstractConfigObject) aMilliwatt;
		dataObject = aMilliwatt;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	