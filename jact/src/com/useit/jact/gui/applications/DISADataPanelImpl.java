package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * DISADataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:29 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DISADataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class DISADataPanelImpl extends DISADataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DISADataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDISAResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDISAResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DISAResFile");
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
        this.add(getJPaneldirect(), null); // Generated
        this.add(getJPanelinward(), null); // Generated
        this.add(getJPanelsystem(), null); // Generated
        this.add(getJPanelaccess(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
