package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Festival;

/**
 * <p>
 * FestivalDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:55 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: FestivalDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class FestivalDataPanel extends SimpleDataObjectPanel{
	protected Festival dataObject;
	//protected FestivalChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public FestivalDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getFestivalResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getFestivalResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/FestivalResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new FestivalCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldtext,		
			fStringTextFieldintkeys,		
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
        this.add(getJPaneltext(), null); // Generated
        this.add(getJPanelintkeys(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldtext.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldintkeys.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldtext.setValue(dataObject.getText());
        fStringTextFieldintkeys.setValue(dataObject.getIntkeys());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setText(fStringTextFieldtext.getValue());
        dataObject.setIntkeys(fStringTextFieldintkeys.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Festival
	 */
	public void setDataObject(Object aFestival) {
	    //abstractdataObject = (AbstractConfigObject) aFestival;
		setDataObject((Festival) aFestival);
		//dataObject = aFestival;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Festival
	 */
	public void setDataObject(Festival aFestival) {
	    //abstractdataObject = (AbstractConfigObject) aFestival;
		dataObject = aFestival;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtext;
    protected javax.swing.JLabel fJLabeltext;
	protected javax.swing.JPanel fJPaneltext;
    protected StringTextField fStringTextFieldintkeys;
    protected javax.swing.JLabel fJLabelintkeys;
	protected javax.swing.JPanel fJPanelintkeys;
    

//start DB field text
    /**
     * This method initializes fStringTextFieldtext
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtext() {
        if (fStringTextFieldtext == null) {
            try {
                fStringTextFieldtext = new StringTextField(); // Generated
                fStringTextFieldtext.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtext;
    }
        
    /**
     * This method initializes  fJLabeltext
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltext() {
        if (fJLabeltext == null) {
            try {
                 fJLabeltext = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltext.setText(resBundel.getString("res_strtextDisplayName")); // Generated
                 fJLabeltext.setToolTipText(resBundel.getString("res_strtextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltext;
    }


    /**
     * This method initializes  fJPaneltext
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltext() {
        if (fJPaneltext == null) {
            try {
                fJPaneltext = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltext.setLayout(layFlowLayout); // Generated
                fJPaneltext.add(getJLabeltext(), null); // Generated
                fJPaneltext.add(getStringTextFieldtext(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltext;
    }
//end DB field text
//start DB field intkeys
    /**
     * This method initializes fStringTextFieldintkeys
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldintkeys() {
        if (fStringTextFieldintkeys == null) {
            try {
                fStringTextFieldintkeys = new StringTextField(); // Generated
                fStringTextFieldintkeys.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldintkeys;
    }
        
    /**
     * This method initializes  fJLabelintkeys
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelintkeys() {
        if (fJLabelintkeys == null) {
            try {
                 fJLabelintkeys = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelintkeys.setText(resBundel.getString("res_strintkeysDisplayName")); // Generated
                 fJLabelintkeys.setToolTipText(resBundel.getString("res_strintkeysDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelintkeys;
    }


    /**
     * This method initializes  fJPanelintkeys
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelintkeys() {
        if (fJPanelintkeys == null) {
            try {
                fJPanelintkeys = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelintkeys.setLayout(layFlowLayout); // Generated
                fJPanelintkeys.add(getJLabelintkeys(), null); // Generated
                fJPanelintkeys.add(getStringTextFieldintkeys(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelintkeys;
    }
//end DB field intkeys

}

	