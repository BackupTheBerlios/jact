package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Playback;

/**
 * <p>
 * PlaybackDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:43 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: PlaybackDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class PlaybackDataPanel extends SimpleDataObjectPanel{
	protected Playback dataObject;
	//protected PlaybackChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public PlaybackDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getPlaybackResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getPlaybackResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/PlaybackResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new PlaybackCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfilename,		
			fStringTextFieldoption,		
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
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelfilename(), null); // Generated
        this.add(getJPaneloption(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfilename.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoption.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfilename.setValue(dataObject.getFilename());
        fStringTextFieldoption.setValue(dataObject.getOption());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFilename(fStringTextFieldfilename.getValue());
        dataObject.setOption(fStringTextFieldoption.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Playback
	 */
	public void setDataObject(Object aPlayback) {
	    //abstractdataObject = (AbstractConfigObject) aPlayback;
		setDataObject((Playback) aPlayback);
		//dataObject = aPlayback;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Playback
	 */
	public void setDataObject(Playback aPlayback) {
	    //abstractdataObject = (AbstractConfigObject) aPlayback;
		dataObject = aPlayback;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfilename;
    protected javax.swing.JLabel fJLabelfilename;
	protected javax.swing.JPanel fJPanelfilename;
    protected StringTextField fStringTextFieldoption;
    protected javax.swing.JLabel fJLabeloption;
	protected javax.swing.JPanel fJPaneloption;
    

//start DB field filename
    /**
     * This method initializes fStringTextFieldfilename
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfilename() {
        if (fStringTextFieldfilename == null) {
            try {
                fStringTextFieldfilename = new StringTextField(); // Generated
                fStringTextFieldfilename.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfilename;
    }
        
    /**
     * This method initializes  fJLabelfilename
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfilename() {
        if (fJLabelfilename == null) {
            try {
                 fJLabelfilename = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfilename.setText(resBundel.getString("res_strfilenameDisplayName")); // Generated
                 fJLabelfilename.setToolTipText(resBundel.getString("res_strfilenameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfilename;
    }


    /**
     * This method initializes  fJPanelfilename
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfilename() {
        if (fJPanelfilename == null) {
            try {
                fJPanelfilename = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfilename.setLayout(layFlowLayout); // Generated
                fJPanelfilename.add(getJLabelfilename(), null); // Generated
                fJPanelfilename.add(getStringTextFieldfilename(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfilename;
    }
//end DB field filename
//start DB field option
    /**
     * This method initializes fStringTextFieldoption
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldoption() {
        if (fStringTextFieldoption == null) {
            try {
                fStringTextFieldoption = new StringTextField(); // Generated
                fStringTextFieldoption.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldoption;
    }
        
    /**
     * This method initializes  fJLabeloption
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloption() {
        if (fJLabeloption == null) {
            try {
                 fJLabeloption = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeloption.setText(resBundel.getString("res_stroptionDisplayName")); // Generated
                 fJLabeloption.setToolTipText(resBundel.getString("res_stroptionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeloption;
    }


    /**
     * This method initializes  fJPaneloption
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloption() {
        if (fJPaneloption == null) {
            try {
                fJPaneloption = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloption.setLayout(layFlowLayout); // Generated
                fJPaneloption.add(getJLabeloption(), null); // Generated
                fJPaneloption.add(getStringTextFieldoption(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloption;
    }
//end DB field option

}

	