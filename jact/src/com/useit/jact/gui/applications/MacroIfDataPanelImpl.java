package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * MacroIfDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:38 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MacroIfDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class MacroIfDataPanelImpl extends MacroIfDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MacroIfDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMacroIfResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMacroIfResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MacroIfResFile");
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
		this.setSize(400,(4)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelexpr(), null); // Generated
        this.add(getJPanelmacroname_a(), null); // Generated
        this.add(getJPanelmacroname_b(), null); // Generated
        this.add(getJPanelarg1(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
