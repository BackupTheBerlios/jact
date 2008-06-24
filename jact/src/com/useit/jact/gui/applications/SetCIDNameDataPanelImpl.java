package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * SetCIDNameDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:41 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCIDNameDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class SetCIDNameDataPanelImpl extends SetCIDNameDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetCIDNameDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetCIDNameResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetCIDNameResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetCIDNameResFile");
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
        this.add(getJPanelcname(), null); // Generated
        this.add(getJPanela(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
