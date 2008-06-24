package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SetAMAFlags;

/**
 * <p>
 * SetAMAFlagsDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:15 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetAMAFlagsDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class SetAMAFlagsDataPanel extends SimpleDataObjectPanel{
	protected SetAMAFlags dataObject;
	//protected SetAMAFlagsChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetAMAFlagsDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetAMAFlagsResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetAMAFlagsResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetAMAFlagsResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SetAMAFlagsCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldflag,		
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
        this.add(getJPanelflag(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldflag.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldflag.setValue(dataObject.getFlag());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFlag(fStringTextFieldflag.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SetAMAFlags
	 */
	public void setDataObject(Object aSetAMAFlags) {
	    //abstractdataObject = (AbstractConfigObject) aSetAMAFlags;
		setDataObject((SetAMAFlags) aSetAMAFlags);
		//dataObject = aSetAMAFlags;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SetAMAFlags
	 */
	public void setDataObject(SetAMAFlags aSetAMAFlags) {
	    //abstractdataObject = (AbstractConfigObject) aSetAMAFlags;
		dataObject = aSetAMAFlags;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldflag;
    protected javax.swing.JLabel fJLabelflag;
	protected javax.swing.JPanel fJPanelflag;
    

//start DB field flag
    /**
     * This method initializes fStringTextFieldflag
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldflag() {
        if (fStringTextFieldflag == null) {
            try {
                fStringTextFieldflag = new StringTextField(); // Generated
                fStringTextFieldflag.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldflag;
    }
        
    /**
     * This method initializes  fJLabelflag
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelflag() {
        if (fJLabelflag == null) {
            try {
                 fJLabelflag = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelflag.setText(resBundel.getString("res_strflagDisplayName")); // Generated
                 fJLabelflag.setToolTipText(resBundel.getString("res_strflagDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelflag;
    }


    /**
     * This method initializes  fJPanelflag
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelflag() {
        if (fJPanelflag == null) {
            try {
                fJPanelflag = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelflag.setLayout(layFlowLayout); // Generated
                fJPanelflag.add(getJLabelflag(), null); // Generated
                fJPanelflag.add(getStringTextFieldflag(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelflag;
    }
//end DB field flag

}

	