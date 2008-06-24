package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Suffix;

/**
 * <p>
 * SuffixDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:42 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SuffixDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SuffixDataPanel extends SimpleDataObjectPanel{
	protected Suffix dataObject;
	//protected SuffixChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SuffixDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSuffixResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSuffixResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SuffixResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SuffixCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFielddigits,		
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
        this.add(getJPaneldigits(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFielddigits.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFielddigits.setValue(dataObject.getDigits());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setDigits(fStringTextFielddigits.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Suffix
	 */
	public void setDataObject(Object aSuffix) {
	    //abstractdataObject = (AbstractConfigObject) aSuffix;
		setDataObject((Suffix) aSuffix);
		//dataObject = aSuffix;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Suffix
	 */
	public void setDataObject(Suffix aSuffix) {
	    //abstractdataObject = (AbstractConfigObject) aSuffix;
		dataObject = aSuffix;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFielddigits;
    protected javax.swing.JLabel fJLabeldigits;
	protected javax.swing.JPanel fJPaneldigits;
    

//start DB field digits
    /**
     * This method initializes fStringTextFielddigits
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielddigits() {
        if (fStringTextFielddigits == null) {
            try {
                fStringTextFielddigits = new StringTextField(); // Generated
                fStringTextFielddigits.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddigits;
    }
        
    /**
     * This method initializes  fJLabeldigits
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldigits() {
        if (fJLabeldigits == null) {
            try {
                 fJLabeldigits = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldigits.setText(resBundel.getString("res_strdigitsDisplayName")); // Generated
                 fJLabeldigits.setToolTipText(resBundel.getString("res_strdigitsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldigits;
    }


    /**
     * This method initializes  fJPaneldigits
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldigits() {
        if (fJPaneldigits == null) {
            try {
                fJPaneldigits = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldigits.setLayout(layFlowLayout); // Generated
                fJPaneldigits.add(getJLabeldigits(), null); // Generated
                fJPaneldigits.add(getStringTextFielddigits(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldigits;
    }
//end DB field digits

}

	