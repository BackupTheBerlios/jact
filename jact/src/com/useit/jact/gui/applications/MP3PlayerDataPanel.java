package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.MP3Player;

/**
 * <p>
 * MP3PlayerDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:29 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MP3PlayerDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MP3PlayerDataPanel extends SimpleDataObjectPanel{
	protected MP3Player dataObject;
	//protected MP3PlayerChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MP3PlayerDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMP3PlayerResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMP3PlayerResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MP3PlayerResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MP3PlayerCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldlocation,		
		};
		dataChecker.initChecker(array);
	}

*/

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(400,(1)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanellocation(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldlocation.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldlocation.setValue(dataObject.getLocation());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setLocation(fStringTextFieldlocation.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param MP3Player
	 */
	public void setDataObject(Object aMP3Player) {
	    //abstractdataObject = (AbstractConfigObject) aMP3Player;
		setDataObject((MP3Player) aMP3Player);
		//dataObject = aMP3Player;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param MP3Player
	 */
	public void setDataObject(MP3Player aMP3Player) {
	    //abstractdataObject = (AbstractConfigObject) aMP3Player;
		dataObject = aMP3Player;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldlocation;
    protected javax.swing.JLabel fJLabellocation;
	protected javax.swing.JPanel fJPanellocation;
    

//start DB field location
    /**
     * This method initializes fStringTextFieldlocation
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlocation() {
        if (fStringTextFieldlocation == null) {
            try {
                fStringTextFieldlocation = new StringTextField(); // Generated
                fStringTextFieldlocation.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlocation;
    }
        
    /**
     * This method initializes  fJLabellocation
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellocation() {
        if (fJLabellocation == null) {
            try {
                 fJLabellocation = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabellocation.setText(resBundel.getString("res_strlocationDisplayName")); // Generated
                 fJLabellocation.setToolTipText(resBundel.getString("res_strlocationDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabellocation;
    }


    /**
     * This method initializes  fJPanellocation
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellocation() {
        if (fJPanellocation == null) {
            try {
                fJPanellocation = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellocation.setLayout(layFlowLayout); // Generated
                fJPanellocation.add(getJLabellocation(), null); // Generated
                fJPanellocation.add(getStringTextFieldlocation(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellocation;
    }
//end DB field location

}

	