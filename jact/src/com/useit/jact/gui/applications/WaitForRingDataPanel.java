package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.WaitForRing;

/**
 * <p>
 * WaitForRingDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:33 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitForRingDataPanel.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class WaitForRingDataPanel extends SimpleDataObjectPanel{
	protected WaitForRing dataObject;
	//protected WaitForRingChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public WaitForRingDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getWaitForRingResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getWaitForRingResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/WaitForRingResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new WaitForRingCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldtimeout,		
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
        this.add(getJPaneltimeout(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldtimeout.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldtimeout.setValue(dataObject.getTimeout());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setTimeout(fStringTextFieldtimeout.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param WaitForRing
	 */
	public void setDataObject(Object aWaitForRing) {
	    //abstractdataObject = (AbstractConfigObject) aWaitForRing;
		setDataObject((WaitForRing) aWaitForRing);
		//dataObject = aWaitForRing;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param WaitForRing
	 */
	public void setDataObject(WaitForRing aWaitForRing) {
	    //abstractdataObject = (AbstractConfigObject) aWaitForRing;
		dataObject = aWaitForRing;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtimeout;
    protected javax.swing.JLabel fJLabeltimeout;
	protected javax.swing.JPanel fJPaneltimeout;
    

//start DB field timeout
    /**
     * This method initializes fStringTextFieldtimeout
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtimeout() {
        if (fStringTextFieldtimeout == null) {
            try {
                fStringTextFieldtimeout = new StringTextField(); // Generated
                fStringTextFieldtimeout.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtimeout;
    }
        
    /**
     * This method initializes  fJLabeltimeout
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimeout() {
        if (fJLabeltimeout == null) {
            try {
                 fJLabeltimeout = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltimeout.setText(resBundel.getString("res_strtimeoutDisplayName")); // Generated
                 fJLabeltimeout.setToolTipText(resBundel.getString("res_strtimeoutDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltimeout;
    }


    /**
     * This method initializes  fJPaneltimeout
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimeout() {
        if (fJPaneltimeout == null) {
            try {
                fJPaneltimeout = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimeout.setLayout(layFlowLayout); // Generated
                fJPaneltimeout.add(getJLabeltimeout(), null); // Generated
                fJPaneltimeout.add(getStringTextFieldtimeout(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimeout;
    }
//end DB field timeout

}

	