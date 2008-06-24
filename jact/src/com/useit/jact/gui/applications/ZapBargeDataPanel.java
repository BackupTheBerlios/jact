package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ZapBarge;

/**
 * <p>
 * ZapBargeDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:42 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapBargeDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class ZapBargeDataPanel extends SimpleDataObjectPanel{
	protected ZapBarge dataObject;
	//protected ZapBargeChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ZapBargeDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getZapBargeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getZapBargeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ZapBargeResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ZapBargeCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldchannel,		
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
        this.add(getJPanelchannel(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldchannel.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldchannel.setValue(dataObject.getChannel());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setChannel(fStringTextFieldchannel.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ZapBarge
	 */
	public void setDataObject(Object aZapBarge) {
	    //abstractdataObject = (AbstractConfigObject) aZapBarge;
		setDataObject((ZapBarge) aZapBarge);
		//dataObject = aZapBarge;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ZapBarge
	 */
	public void setDataObject(ZapBarge aZapBarge) {
	    //abstractdataObject = (AbstractConfigObject) aZapBarge;
		dataObject = aZapBarge;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldchannel;
    protected javax.swing.JLabel fJLabelchannel;
	protected javax.swing.JPanel fJPanelchannel;
    

//start DB field channel
    /**
     * This method initializes fStringTextFieldchannel
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldchannel() {
        if (fStringTextFieldchannel == null) {
            try {
                fStringTextFieldchannel = new StringTextField(); // Generated
                fStringTextFieldchannel.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldchannel;
    }
        
    /**
     * This method initializes  fJLabelchannel
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelchannel() {
        if (fJLabelchannel == null) {
            try {
                 fJLabelchannel = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelchannel.setText(resBundel.getString("res_strchannelDisplayName")); // Generated
                 fJLabelchannel.setToolTipText(resBundel.getString("res_strchannelDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelchannel;
    }


    /**
     * This method initializes  fJPanelchannel
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelchannel() {
        if (fJPanelchannel == null) {
            try {
                fJPanelchannel = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelchannel.setLayout(layFlowLayout); // Generated
                fJPanelchannel.add(getJLabelchannel(), null); // Generated
                fJPanelchannel.add(getStringTextFieldchannel(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelchannel;
    }
//end DB field channel

}

	