package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * BusyDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:10 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: BusyDataPanelImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class BusyDataPanelImpl extends BusyDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public BusyDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getBusyResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getBusyResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/BusyResFile");
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
        this.add(getJPaneltimeout(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
