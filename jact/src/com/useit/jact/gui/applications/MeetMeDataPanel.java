package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.MeetMe;

/**
 * <p>
 * MeetMeDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:37 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetMeDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MeetMeDataPanel extends SimpleDataObjectPanel{
	protected MeetMe dataObject;
	//protected MeetMeChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MeetMeDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMeetMeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMeetMeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MeetMeResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MeetMeCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldconfno,		
			fStringTextFieldoptions,		
			fStringTextFieldpin,		
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
		this.setSize(400,(3)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelconfno(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
        this.add(getJPanelpin(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldconfno.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldpin.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldconfno.setValue(dataObject.getConfno());
        fStringTextFieldoptions.setValue(dataObject.getOptions());
        fStringTextFieldpin.setValue(dataObject.getPin());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setConfno(fStringTextFieldconfno.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
        dataObject.setPin(fStringTextFieldpin.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param MeetMe
	 */
	public void setDataObject(Object aMeetMe) {
	    //abstractdataObject = (AbstractConfigObject) aMeetMe;
		setDataObject((MeetMe) aMeetMe);
		//dataObject = aMeetMe;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param MeetMe
	 */
	public void setDataObject(MeetMe aMeetMe) {
	    //abstractdataObject = (AbstractConfigObject) aMeetMe;
		dataObject = aMeetMe;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldconfno;
    protected javax.swing.JLabel fJLabelconfno;
	protected javax.swing.JPanel fJPanelconfno;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    protected StringTextField fStringTextFieldpin;
    protected javax.swing.JLabel fJLabelpin;
	protected javax.swing.JPanel fJPanelpin;
    

//start DB field confno
    /**
     * This method initializes fStringTextFieldconfno
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldconfno() {
        if (fStringTextFieldconfno == null) {
            try {
                fStringTextFieldconfno = new StringTextField(); // Generated
                fStringTextFieldconfno.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldconfno;
    }
        
    /**
     * This method initializes  fJLabelconfno
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelconfno() {
        if (fJLabelconfno == null) {
            try {
                 fJLabelconfno = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelconfno.setText(resBundel.getString("res_strconfnoDisplayName")); // Generated
                 fJLabelconfno.setToolTipText(resBundel.getString("res_strconfnoDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelconfno;
    }


    /**
     * This method initializes  fJPanelconfno
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelconfno() {
        if (fJPanelconfno == null) {
            try {
                fJPanelconfno = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelconfno.setLayout(layFlowLayout); // Generated
                fJPanelconfno.add(getJLabelconfno(), null); // Generated
                fJPanelconfno.add(getStringTextFieldconfno(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelconfno;
    }
//end DB field confno
//start DB field options
    /**
     * This method initializes fStringTextFieldoptions
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldoptions() {
        if (fStringTextFieldoptions == null) {
            try {
                fStringTextFieldoptions = new StringTextField(); // Generated
                fStringTextFieldoptions.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldoptions;
    }
        
    /**
     * This method initializes  fJLabeloptions
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloptions() {
        if (fJLabeloptions == null) {
            try {
                 fJLabeloptions = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeloptions.setText(resBundel.getString("res_stroptionsDisplayName")); // Generated
                 fJLabeloptions.setToolTipText(resBundel.getString("res_stroptionsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeloptions;
    }


    /**
     * This method initializes  fJPaneloptions
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloptions() {
        if (fJPaneloptions == null) {
            try {
                fJPaneloptions = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloptions.setLayout(layFlowLayout); // Generated
                fJPaneloptions.add(getJLabeloptions(), null); // Generated
                fJPaneloptions.add(getStringTextFieldoptions(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloptions;
    }
//end DB field options
//start DB field pin
    /**
     * This method initializes fStringTextFieldpin
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpin() {
        if (fStringTextFieldpin == null) {
            try {
                fStringTextFieldpin = new StringTextField(); // Generated
                fStringTextFieldpin.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpin;
    }
        
    /**
     * This method initializes  fJLabelpin
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpin() {
        if (fJLabelpin == null) {
            try {
                 fJLabelpin = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelpin.setText(resBundel.getString("res_strpinDisplayName")); // Generated
                 fJLabelpin.setToolTipText(resBundel.getString("res_strpinDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelpin;
    }


    /**
     * This method initializes  fJPanelpin
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpin() {
        if (fJPanelpin == null) {
            try {
                fJPanelpin = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpin.setLayout(layFlowLayout); // Generated
                fJPanelpin.add(getJLabelpin(), null); // Generated
                fJPanelpin.add(getStringTextFieldpin(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpin;
    }
//end DB field pin

}

	