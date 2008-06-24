package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SayAlpha;

/**
 * <p>
 * SayAlphaDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:41 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayAlphaDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SayAlphaDataPanel extends SimpleDataObjectPanel{
	protected SayAlpha dataObject;
	//protected SayAlphaChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SayAlphaDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSayAlphaResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSayAlphaResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SayAlphaResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SayAlphaCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldstring,		
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
        this.add(getJPanelstring(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldstring.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldstring.setValue(dataObject.getString());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setString(fStringTextFieldstring.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SayAlpha
	 */
	public void setDataObject(Object aSayAlpha) {
	    //abstractdataObject = (AbstractConfigObject) aSayAlpha;
		setDataObject((SayAlpha) aSayAlpha);
		//dataObject = aSayAlpha;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SayAlpha
	 */
	public void setDataObject(SayAlpha aSayAlpha) {
	    //abstractdataObject = (AbstractConfigObject) aSayAlpha;
		dataObject = aSayAlpha;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldstring;
    protected javax.swing.JLabel fJLabelstring;
	protected javax.swing.JPanel fJPanelstring;
    

//start DB field string
    /**
     * This method initializes fStringTextFieldstring
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldstring() {
        if (fStringTextFieldstring == null) {
            try {
                fStringTextFieldstring = new StringTextField(); // Generated
                fStringTextFieldstring.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldstring;
    }
        
    /**
     * This method initializes  fJLabelstring
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelstring() {
        if (fJLabelstring == null) {
            try {
                 fJLabelstring = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelstring.setText(resBundel.getString("res_strstringDisplayName")); // Generated
                 fJLabelstring.setToolTipText(resBundel.getString("res_strstringDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelstring;
    }


    /**
     * This method initializes  fJPanelstring
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelstring() {
        if (fJPanelstring == null) {
            try {
                fJPanelstring = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelstring.setLayout(layFlowLayout); // Generated
                fJPanelstring.add(getJLabelstring(), null); // Generated
                fJPanelstring.add(getStringTextFieldstring(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelstring;
    }
//end DB field string

}

	