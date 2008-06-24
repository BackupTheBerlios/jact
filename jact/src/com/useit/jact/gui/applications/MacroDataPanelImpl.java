package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * MacroDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:38:38 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MacroDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class MacroDataPanelImpl extends MacroDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MacroDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMacroResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMacroResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MacroResFile");
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
		this.setSize(400,(3)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelmacroname(), null); // Generated
        this.add(getJPanelarg1(), null); // Generated
        this.add(getJPanelarg2(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
