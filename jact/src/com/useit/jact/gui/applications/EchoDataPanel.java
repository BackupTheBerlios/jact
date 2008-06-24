package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.Echo;

/**
 * <p>
 * EchoDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:12 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: EchoDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class EchoDataPanel extends SimpleDataObjectPanel{
	protected Echo dataObject;
	//protected EchoChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public EchoDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getEchoResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getEchoResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/EchoResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new EchoCheckerImpl(resBundel);
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
	 * @param Echo
	 */
	public void setDataObject(Object aEcho) {
	    //abstractdataObject = (AbstractConfigObject) aEcho;
		setDataObject((Echo) aEcho);
		//dataObject = aEcho;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Echo
	 */
	public void setDataObject(Echo aEcho) {
	    //abstractdataObject = (AbstractConfigObject) aEcho;
		dataObject = aEcho;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	