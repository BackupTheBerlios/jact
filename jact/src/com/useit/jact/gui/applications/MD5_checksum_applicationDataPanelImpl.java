package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * MD5_checksum_applicationDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:38:56 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MD5_checksum_applicationDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MD5_checksum_applicationDataPanelImpl extends MD5_checksum_applicationDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MD5_checksum_applicationDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMD5_checksum_applicationResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMD5_checksum_applicationResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MD5_checksum_applicationResFile");
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
		this.setSize(400,(0)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(0); // Generated
        this.setLayout(layGridLayout); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
