package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * SetRDNISDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:44 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetRDNISDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SetRDNISDataPanelImpl extends SetRDNISDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetRDNISDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetRDNISResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetRDNISResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetRDNISResFile");
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
        this.add(getJPanelcnum(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
