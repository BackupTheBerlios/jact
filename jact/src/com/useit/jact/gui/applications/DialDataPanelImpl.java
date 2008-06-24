package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * DialDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:01 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DialDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class DialDataPanelImpl extends DialDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DialDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDialResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDialResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DialResFile");
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
		this.setSize(400,(7)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(7); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneltechnology(), null); // Generated
        this.add(getJPanelresource(), null); // Generated
        this.add(getJPaneltechnology2(), null); // Generated
        this.add(getJPanelresource2(), null); // Generated
        this.add(getJPaneltimeout(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
        this.add(getJPaneluRL(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
