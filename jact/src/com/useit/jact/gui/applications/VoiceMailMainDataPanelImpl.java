package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * VoiceMailMainDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:53 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoiceMailMainDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class VoiceMailMainDataPanelImpl extends VoiceMailMainDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public VoiceMailMainDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getVoiceMailMainResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getVoiceMailMainResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/VoiceMailMainResFile");
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
        this.add(getJPanels(), null); // Generated
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
