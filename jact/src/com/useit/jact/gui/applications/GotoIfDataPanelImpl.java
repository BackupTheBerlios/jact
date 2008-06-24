package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * GotoIfDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:43 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GotoIfDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class GotoIfDataPanelImpl extends GotoIfDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public GotoIfDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getGotoIfResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getGotoIfResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/GotoIfResFile");
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
		this.setSize(400,(5)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(5); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelcondition(), null); // Generated
        this.add(getJPanellabel1(), null); // Generated
        this.add(getJPanelextension2(), null); // Generated
        this.add(getJPanelextension1(), null); // Generated
        this.add(getJPanellabel2(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
