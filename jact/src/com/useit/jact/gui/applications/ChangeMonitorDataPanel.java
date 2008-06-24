package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ChangeMonitor;

/**
 * <p>
 * ChangeMonitorDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:26 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ChangeMonitorDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ChangeMonitorDataPanel extends SimpleDataObjectPanel{
	protected ChangeMonitor dataObject;
	//protected ChangeMonitorChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ChangeMonitorDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getChangeMonitorResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getChangeMonitorResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ChangeMonitorResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ChangeMonitorCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfilename_base,		
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
        this.add(getJPanelfilename_base(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfilename_base.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfilename_base.setValue(dataObject.getFilename_base());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFilename_base(fStringTextFieldfilename_base.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ChangeMonitor
	 */
	public void setDataObject(Object aChangeMonitor) {
	    //abstractdataObject = (AbstractConfigObject) aChangeMonitor;
		setDataObject((ChangeMonitor) aChangeMonitor);
		//dataObject = aChangeMonitor;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ChangeMonitor
	 */
	public void setDataObject(ChangeMonitor aChangeMonitor) {
	    //abstractdataObject = (AbstractConfigObject) aChangeMonitor;
		dataObject = aChangeMonitor;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfilename_base;
    protected javax.swing.JLabel fJLabelfilename_base;
	protected javax.swing.JPanel fJPanelfilename_base;
    

//start DB field filename_base
    /**
     * This method initializes fStringTextFieldfilename_base
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfilename_base() {
        if (fStringTextFieldfilename_base == null) {
            try {
                fStringTextFieldfilename_base = new StringTextField(); // Generated
                fStringTextFieldfilename_base.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfilename_base;
    }
        
    /**
     * This method initializes  fJLabelfilename_base
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfilename_base() {
        if (fJLabelfilename_base == null) {
            try {
                 fJLabelfilename_base = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfilename_base.setText(resBundel.getString("res_strfilename_baseDisplayName")); // Generated
                 fJLabelfilename_base.setToolTipText(resBundel.getString("res_strfilename_baseDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfilename_base;
    }


    /**
     * This method initializes  fJPanelfilename_base
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfilename_base() {
        if (fJPanelfilename_base == null) {
            try {
                fJPanelfilename_base = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfilename_base.setLayout(layFlowLayout); // Generated
                fJPanelfilename_base.add(getJLabelfilename_base(), null); // Generated
                fJPanelfilename_base.add(getStringTextFieldfilename_base(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfilename_base;
    }
//end DB field filename_base

}

	