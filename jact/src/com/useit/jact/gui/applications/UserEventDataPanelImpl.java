package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * UserEventDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:38:43 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: UserEventDataPanelImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class UserEventDataPanelImpl extends UserEventDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public UserEventDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getUserEventResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getUserEventResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/UserEventResFile");
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
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneleventname(), null); // Generated
        this.add(getJPanelbody(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
