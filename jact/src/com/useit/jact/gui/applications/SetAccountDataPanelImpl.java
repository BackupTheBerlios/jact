package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * SetAccountDataPanelImpl,
 * das wirkliche panel, kann �berarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetAccountDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SetAccountDataPanelImpl extends SetAccountDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetAccountDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetAccountResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetAccountResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetAccountResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		initialize();
		initActions();
	}

	

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(400,(1)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelaccount(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
