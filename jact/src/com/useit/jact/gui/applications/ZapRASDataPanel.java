package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ZapRAS;

/**
 * <p>
 * ZapRASDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:05 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapRASDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ZapRASDataPanel extends SimpleDataObjectPanel{
	protected ZapRAS dataObject;
	//protected ZapRASChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ZapRASDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getZapRASResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getZapRASResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ZapRASResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ZapRASCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldargs,		
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
        this.add(getJPanelargs(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldargs.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldargs.setValue(dataObject.getArgs());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setArgs(fStringTextFieldargs.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ZapRAS
	 */
	public void setDataObject(Object aZapRAS) {
	    //abstractdataObject = (AbstractConfigObject) aZapRAS;
		setDataObject((ZapRAS) aZapRAS);
		//dataObject = aZapRAS;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ZapRAS
	 */
	public void setDataObject(ZapRAS aZapRAS) {
	    //abstractdataObject = (AbstractConfigObject) aZapRAS;
		dataObject = aZapRAS;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldargs;
    protected javax.swing.JLabel fJLabelargs;
	protected javax.swing.JPanel fJPanelargs;
    

//start DB field args
    /**
     * This method initializes fStringTextFieldargs
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldargs() {
        if (fStringTextFieldargs == null) {
            try {
                fStringTextFieldargs = new StringTextField(); // Generated
                fStringTextFieldargs.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldargs;
    }
        
    /**
     * This method initializes  fJLabelargs
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelargs() {
        if (fJLabelargs == null) {
            try {
                 fJLabelargs = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelargs.setText(resBundel.getString("res_strargsDisplayName")); // Generated
                 fJLabelargs.setToolTipText(resBundel.getString("res_strargsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelargs;
    }


    /**
     * This method initializes  fJPanelargs
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelargs() {
        if (fJPanelargs == null) {
            try {
                fJPanelargs = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelargs.setLayout(layFlowLayout); // Generated
                fJPanelargs.add(getJLabelargs(), null); // Generated
                fJPanelargs.add(getStringTextFieldargs(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelargs;
    }
//end DB field args

}

	