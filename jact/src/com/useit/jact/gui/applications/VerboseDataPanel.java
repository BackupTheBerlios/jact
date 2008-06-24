package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Verbose;

/**
 * <p>
 * VerboseDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:48 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VerboseDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class VerboseDataPanel extends SimpleDataObjectPanel{
	protected Verbose dataObject;
	//protected VerboseChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public VerboseDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getVerboseResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getVerboseResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/VerboseResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new VerboseCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldlevel,		
			fStringTextFieldmessage,		
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
        this.add(getJPanellevel(), null); // Generated
        this.add(getJPanelmessage(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldlevel.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmessage.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldlevel.setValue(dataObject.getLevel());
        fStringTextFieldmessage.setValue(dataObject.getMessage());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setLevel(fStringTextFieldlevel.getValue());
        dataObject.setMessage(fStringTextFieldmessage.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Verbose
	 */
	public void setDataObject(Object aVerbose) {
	    //abstractdataObject = (AbstractConfigObject) aVerbose;
		setDataObject((Verbose) aVerbose);
		//dataObject = aVerbose;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Verbose
	 */
	public void setDataObject(Verbose aVerbose) {
	    //abstractdataObject = (AbstractConfigObject) aVerbose;
		dataObject = aVerbose;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldlevel;
    protected javax.swing.JLabel fJLabellevel;
	protected javax.swing.JPanel fJPanellevel;
    protected StringTextField fStringTextFieldmessage;
    protected javax.swing.JLabel fJLabelmessage;
	protected javax.swing.JPanel fJPanelmessage;
    

//start DB field level
    /**
     * This method initializes fStringTextFieldlevel
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlevel() {
        if (fStringTextFieldlevel == null) {
            try {
                fStringTextFieldlevel = new StringTextField(); // Generated
                fStringTextFieldlevel.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlevel;
    }
        
    /**
     * This method initializes  fJLabellevel
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellevel() {
        if (fJLabellevel == null) {
            try {
                 fJLabellevel = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabellevel.setText(resBundel.getString("res_strlevelDisplayName")); // Generated
                 fJLabellevel.setToolTipText(resBundel.getString("res_strlevelDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabellevel;
    }


    /**
     * This method initializes  fJPanellevel
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellevel() {
        if (fJPanellevel == null) {
            try {
                fJPanellevel = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellevel.setLayout(layFlowLayout); // Generated
                fJPanellevel.add(getJLabellevel(), null); // Generated
                fJPanellevel.add(getStringTextFieldlevel(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellevel;
    }
//end DB field level
//start DB field message
    /**
     * This method initializes fStringTextFieldmessage
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmessage() {
        if (fStringTextFieldmessage == null) {
            try {
                fStringTextFieldmessage = new StringTextField(); // Generated
                fStringTextFieldmessage.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmessage;
    }
        
    /**
     * This method initializes  fJLabelmessage
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmessage() {
        if (fJLabelmessage == null) {
            try {
                 fJLabelmessage = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmessage.setText(resBundel.getString("res_strmessageDisplayName")); // Generated
                 fJLabelmessage.setToolTipText(resBundel.getString("res_strmessageDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmessage;
    }


    /**
     * This method initializes  fJPanelmessage
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmessage() {
        if (fJPanelmessage == null) {
            try {
                fJPanelmessage = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmessage.setLayout(layFlowLayout); // Generated
                fJPanelmessage.add(getJLabelmessage(), null); // Generated
                fJPanelmessage.add(getStringTextFieldmessage(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmessage;
    }
//end DB field message

}

	