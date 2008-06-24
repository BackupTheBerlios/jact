package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * ExecIfTimeDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExecIfTimeDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ExecIfTimeDataPanelImpl extends ExecIfTimeDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ExecIfTimeDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getExecIfTimeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getExecIfTimeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ExecIfTimeResFile");
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
		this.setSize(400,(6)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(6); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneltimes(), null); // Generated
        this.add(getJPanelweekdays(), null); // Generated
        this.add(getJPanelmdays(), null); // Generated
        this.add(getJPanelmonths(), null); // Generated
        this.add(getJPanelappname(), null); // Generated
        this.add(getJPanelappdata(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
