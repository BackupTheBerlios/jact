package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * AbsoluteTimeoutDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:33 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AbsoluteTimeoutDataPanelImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class AbsoluteTimeoutDataPanelImpl extends AbsoluteTimeoutDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public AbsoluteTimeoutDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getAbsoluteTimeoutResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getAbsoluteTimeoutResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/AbsoluteTimeoutResFile");
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
        this.add(getJPanelseconds(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
