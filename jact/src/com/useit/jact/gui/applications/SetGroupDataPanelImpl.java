package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * SetGroupDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:38:47 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetGroupDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SetGroupDataPanelImpl extends SetGroupDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetGroupDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetGroupResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetGroupResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetGroupResFile");
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
        this.add(getJPanelgroup(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
