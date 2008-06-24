package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.TrySystem;

/**
 * <p>
 * TrySystemDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:02 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TrySystemDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class TrySystemDataPanel extends SimpleDataObjectPanel{
	protected TrySystem dataObject;
	//protected TrySystemChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public TrySystemDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getTrySystemResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getTrySystemResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/TrySystemResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new TrySystemCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldcommand,		
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
        this.add(getJPanelcommand(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldcommand.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldcommand.setValue(dataObject.getCommand());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setCommand(fStringTextFieldcommand.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param TrySystem
	 */
	public void setDataObject(Object aTrySystem) {
	    //abstractdataObject = (AbstractConfigObject) aTrySystem;
		setDataObject((TrySystem) aTrySystem);
		//dataObject = aTrySystem;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param TrySystem
	 */
	public void setDataObject(TrySystem aTrySystem) {
	    //abstractdataObject = (AbstractConfigObject) aTrySystem;
		dataObject = aTrySystem;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcommand;
    protected javax.swing.JLabel fJLabelcommand;
	protected javax.swing.JPanel fJPanelcommand;
    

//start DB field command
    /**
     * This method initializes fStringTextFieldcommand
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcommand() {
        if (fStringTextFieldcommand == null) {
            try {
                fStringTextFieldcommand = new StringTextField(); // Generated
                fStringTextFieldcommand.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcommand;
    }
        
    /**
     * This method initializes  fJLabelcommand
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcommand() {
        if (fJLabelcommand == null) {
            try {
                 fJLabelcommand = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcommand.setText(resBundel.getString("res_strcommandDisplayName")); // Generated
                 fJLabelcommand.setToolTipText(resBundel.getString("res_strcommandDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcommand;
    }


    /**
     * This method initializes  fJPanelcommand
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcommand() {
        if (fJPanelcommand == null) {
            try {
                fJPanelcommand = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcommand.setLayout(layFlowLayout); // Generated
                fJPanelcommand.add(getJLabelcommand(), null); // Generated
                fJPanelcommand.add(getStringTextFieldcommand(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcommand;
    }
//end DB field command

}

	