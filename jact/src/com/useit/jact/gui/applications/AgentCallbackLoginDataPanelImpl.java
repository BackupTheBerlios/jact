package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * AgentCallbackLoginDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:38:40 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentCallbackLoginDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class AgentCallbackLoginDataPanelImpl extends AgentCallbackLoginDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public AgentCallbackLoginDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getAgentCallbackLoginResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getAgentCallbackLoginResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/AgentCallbackLoginResFile");
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
        this.add(getJPanelagentNo(), null); // Generated
        this.add(getJPanelextension(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
        this.add(getJPanelexten(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
