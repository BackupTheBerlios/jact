package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.DumpChan;

/**
 * <p>
 * DumpChanDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:46 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DumpChanDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class DumpChanDataPanel extends SimpleDataObjectPanel{
	protected DumpChan dataObject;
	//protected DumpChanChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DumpChanDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDumpChanResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDumpChanResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DumpChanResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new DumpChanCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldmin_verbose_level,		
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
        this.add(getJPanelmin_verbose_level(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldmin_verbose_level.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldmin_verbose_level.setValue(dataObject.getMin_verbose_level());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setMin_verbose_level(fStringTextFieldmin_verbose_level.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param DumpChan
	 */
	public void setDataObject(Object aDumpChan) {
	    //abstractdataObject = (AbstractConfigObject) aDumpChan;
		setDataObject((DumpChan) aDumpChan);
		//dataObject = aDumpChan;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param DumpChan
	 */
	public void setDataObject(DumpChan aDumpChan) {
	    //abstractdataObject = (AbstractConfigObject) aDumpChan;
		dataObject = aDumpChan;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldmin_verbose_level;
    protected javax.swing.JLabel fJLabelmin_verbose_level;
	protected javax.swing.JPanel fJPanelmin_verbose_level;
    

//start DB field min_verbose_level
    /**
     * This method initializes fStringTextFieldmin_verbose_level
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmin_verbose_level() {
        if (fStringTextFieldmin_verbose_level == null) {
            try {
                fStringTextFieldmin_verbose_level = new StringTextField(); // Generated
                fStringTextFieldmin_verbose_level.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmin_verbose_level;
    }
        
    /**
     * This method initializes  fJLabelmin_verbose_level
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmin_verbose_level() {
        if (fJLabelmin_verbose_level == null) {
            try {
                 fJLabelmin_verbose_level = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmin_verbose_level.setText(resBundel.getString("res_strmin_verbose_levelDisplayName")); // Generated
                 fJLabelmin_verbose_level.setToolTipText(resBundel.getString("res_strmin_verbose_levelDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmin_verbose_level;
    }


    /**
     * This method initializes  fJPanelmin_verbose_level
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmin_verbose_level() {
        if (fJPanelmin_verbose_level == null) {
            try {
                fJPanelmin_verbose_level = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmin_verbose_level.setLayout(layFlowLayout); // Generated
                fJPanelmin_verbose_level.add(getJLabelmin_verbose_level(), null); // Generated
                fJPanelmin_verbose_level.add(getStringTextFieldmin_verbose_level(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmin_verbose_level;
    }
//end DB field min_verbose_level

}

	