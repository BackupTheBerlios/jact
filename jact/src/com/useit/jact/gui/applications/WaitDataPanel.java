package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Wait;

/**
 * <p>
 * WaitDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:38 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class WaitDataPanel extends SimpleDataObjectPanel{
	protected Wait dataObject;
	//protected WaitChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public WaitDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getWaitResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getWaitResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/WaitResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new WaitCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldseconds,		
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
        this.add(getJPanelseconds(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldseconds.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldseconds.setValue(dataObject.getSeconds());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setSeconds(fStringTextFieldseconds.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Wait
	 */
	public void setDataObject(Object aWait) {
	    //abstractdataObject = (AbstractConfigObject) aWait;
		setDataObject((Wait) aWait);
		//dataObject = aWait;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Wait
	 */
	public void setDataObject(Wait aWait) {
	    //abstractdataObject = (AbstractConfigObject) aWait;
		dataObject = aWait;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldseconds;
    protected javax.swing.JLabel fJLabelseconds;
	protected javax.swing.JPanel fJPanelseconds;
    

//start DB field seconds
    /**
     * This method initializes fStringTextFieldseconds
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldseconds() {
        if (fStringTextFieldseconds == null) {
            try {
                fStringTextFieldseconds = new StringTextField(); // Generated
                fStringTextFieldseconds.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldseconds;
    }
        
    /**
     * This method initializes  fJLabelseconds
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelseconds() {
        if (fJLabelseconds == null) {
            try {
                 fJLabelseconds = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelseconds.setText(resBundel.getString("res_strsecondsDisplayName")); // Generated
                 fJLabelseconds.setToolTipText(resBundel.getString("res_strsecondsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelseconds;
    }


    /**
     * This method initializes  fJPanelseconds
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelseconds() {
        if (fJPanelseconds == null) {
            try {
                fJPanelseconds = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelseconds.setLayout(layFlowLayout); // Generated
                fJPanelseconds.add(getJLabelseconds(), null); // Generated
                fJPanelseconds.add(getStringTextFieldseconds(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelseconds;
    }
//end DB field seconds

}

	