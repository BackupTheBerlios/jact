package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * ExecIFDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:44 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExecIFDataPanelImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class ExecIFDataPanelImpl extends ExecIFDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ExecIFDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getExecIFResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getExecIFResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ExecIFResFile");
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
        this.add(getJPanelexpr(), null); // Generated
        this.add(getJPanelapp(), null); // Generated
        this.add(getJPaneldata(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
