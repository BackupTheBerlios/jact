package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * ReadFileDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:14 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ReadFileDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ReadFileDataPanelImpl extends ReadFileDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ReadFileDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getReadFileResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getReadFileResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ReadFileResFile");
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
        this.add(getJPanelvarname(), null); // Generated
        this.add(getJPanelfile(), null); // Generated
        this.add(getJPanellength(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
