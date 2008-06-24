package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * NoCDRDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:44 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: NoCDRDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class NoCDRDataPanelImpl extends NoCDRDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public NoCDRDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getNoCDRResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getNoCDRResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/NoCDRResFile");
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
