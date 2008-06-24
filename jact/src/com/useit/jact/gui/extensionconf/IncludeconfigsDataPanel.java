package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.extensionconf.Includeconfigs;

/**
 * <p>
 * IncludeconfigsDataPanel
 * </p>
 * Created : Fri May 26 17:18:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: IncludeconfigsDataPanel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class IncludeconfigsDataPanel extends SimpleDataObjectPanel{
	protected Includeconfigs dataObject;
	//protected IncludeconfigsChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public IncludeconfigsDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getIncludeconfigsResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getIncludeconfigsResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/IncludeconfigsResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new IncludeconfigsCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldconfigname,		
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
        this.add(getJPanelconfigname(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldconfigname.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldconfigname.setValue(dataObject.getConfigname());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setConfigname(fStringTextFieldconfigname.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Includeconfigs
	 */
	public void setDataObject(Object aIncludeconfigs) {
	    //abstractdataObject = (AbstractConfigObject) aIncludeconfigs;
		setDataObject((Includeconfigs) aIncludeconfigs);
		//dataObject = aIncludeconfigs;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Includeconfigs
	 */
	public void setDataObject(Includeconfigs aIncludeconfigs) {
	    //abstractdataObject = (AbstractConfigObject) aIncludeconfigs;
		dataObject = aIncludeconfigs;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldconfigname;
    protected javax.swing.JLabel fJLabelconfigname;
	protected javax.swing.JPanel fJPanelconfigname;
    

//start DB field configname
    /**
     * This method initializes fStringTextFieldconfigname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldconfigname() {
        if (fStringTextFieldconfigname == null) {
            try {
                fStringTextFieldconfigname = new StringTextField(); // Generated
                fStringTextFieldconfigname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldconfigname;
    }
        
    /**
     * This method initializes  fJLabelconfigname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelconfigname() {
        if (fJLabelconfigname == null) {
            try {
                 fJLabelconfigname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelconfigname.setText(resBundel.getString("res_strconfignameDisplayName")); // Generated
                 fJLabelconfigname.setToolTipText(resBundel.getString("res_strconfignameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelconfigname;
    }


    /**
     * This method initializes  fJPanelconfigname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelconfigname() {
        if (fJPanelconfigname == null) {
            try {
                fJPanelconfigname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelconfigname.setLayout(layFlowLayout); // Generated
                fJPanelconfigname.add(getJLabelconfigname(), null); // Generated
                fJPanelconfigname.add(getStringTextFieldconfigname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelconfigname;
    }
//end DB field configname

}

	