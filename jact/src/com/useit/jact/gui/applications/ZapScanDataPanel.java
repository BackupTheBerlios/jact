package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ZapScan;

/**
 * <p>
 * ZapScanDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapScanDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class ZapScanDataPanel extends SimpleDataObjectPanel{
	protected ZapScan dataObject;
	//protected ZapScanChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ZapScanDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getZapScanResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getZapScanResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ZapScanResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ZapScanCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldgroup,		
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
        this.add(getJPanelgroup(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldgroup.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldgroup.setValue(dataObject.getGroup());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setGroup(fStringTextFieldgroup.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ZapScan
	 */
	public void setDataObject(Object aZapScan) {
	    //abstractdataObject = (AbstractConfigObject) aZapScan;
		setDataObject((ZapScan) aZapScan);
		//dataObject = aZapScan;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ZapScan
	 */
	public void setDataObject(ZapScan aZapScan) {
	    //abstractdataObject = (AbstractConfigObject) aZapScan;
		dataObject = aZapScan;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldgroup;
    protected javax.swing.JLabel fJLabelgroup;
	protected javax.swing.JPanel fJPanelgroup;
    

//start DB field group
    /**
     * This method initializes fStringTextFieldgroup
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldgroup() {
        if (fStringTextFieldgroup == null) {
            try {
                fStringTextFieldgroup = new StringTextField(); // Generated
                fStringTextFieldgroup.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldgroup;
    }
        
    /**
     * This method initializes  fJLabelgroup
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelgroup() {
        if (fJLabelgroup == null) {
            try {
                 fJLabelgroup = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelgroup.setText(resBundel.getString("res_strgroupDisplayName")); // Generated
                 fJLabelgroup.setToolTipText(resBundel.getString("res_strgroupDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelgroup;
    }


    /**
     * This method initializes  fJPanelgroup
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelgroup() {
        if (fJPanelgroup == null) {
            try {
                fJPanelgroup = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelgroup.setLayout(layFlowLayout); // Generated
                fJPanelgroup.add(getJLabelgroup(), null); // Generated
                fJPanelgroup.add(getStringTextFieldgroup(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelgroup;
    }
//end DB field group

}

	