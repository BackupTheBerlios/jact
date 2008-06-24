package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * SetGlobalVarDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:17 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetGlobalVarDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class SetGlobalVarDataPanelImpl extends SetGlobalVarDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetGlobalVarDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetGlobalVarResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetGlobalVarResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetGlobalVarResFile");
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
        this.add(getJPaneln(), null); // Generated
        this.add(getJPanelvalue(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
