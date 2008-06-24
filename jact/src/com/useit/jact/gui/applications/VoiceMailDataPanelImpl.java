package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * VoiceMailDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:47 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoiceMailDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class VoiceMailDataPanelImpl extends VoiceMailDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public VoiceMailDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getVoiceMailResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getVoiceMailResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/VoiceMailResFile");
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
        this.add(getJPanels(), null); // Generated
        this.add(getJPanelu(), null); // Generated
        this.add(getJPanelb(), null); // Generated
        this.add(getJPanelextension(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
