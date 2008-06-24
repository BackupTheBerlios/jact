package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Exec;

/**
 * <p>
 * ExecDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:40 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExecDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class ExecDataPanel extends SimpleDataObjectPanel{
	protected Exec dataObject;
	//protected ExecChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ExecDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getExecResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getExecResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ExecResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ExecCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldappname,		
			fStringTextFieldarguments,		
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
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelappname(), null); // Generated
        this.add(getJPanelarguments(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldappname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldarguments.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldappname.setValue(dataObject.getAppname());
        fStringTextFieldarguments.setValue(dataObject.getArguments());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setAppname(fStringTextFieldappname.getValue());
        dataObject.setArguments(fStringTextFieldarguments.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Exec
	 */
	public void setDataObject(Object aExec) {
	    //abstractdataObject = (AbstractConfigObject) aExec;
		setDataObject((Exec) aExec);
		//dataObject = aExec;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Exec
	 */
	public void setDataObject(Exec aExec) {
	    //abstractdataObject = (AbstractConfigObject) aExec;
		dataObject = aExec;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldappname;
    protected javax.swing.JLabel fJLabelappname;
	protected javax.swing.JPanel fJPanelappname;
    protected StringTextField fStringTextFieldarguments;
    protected javax.swing.JLabel fJLabelarguments;
	protected javax.swing.JPanel fJPanelarguments;
    

//start DB field appname
    /**
     * This method initializes fStringTextFieldappname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldappname() {
        if (fStringTextFieldappname == null) {
            try {
                fStringTextFieldappname = new StringTextField(); // Generated
                fStringTextFieldappname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldappname;
    }
        
    /**
     * This method initializes  fJLabelappname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelappname() {
        if (fJLabelappname == null) {
            try {
                 fJLabelappname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelappname.setText(resBundel.getString("res_strappnameDisplayName")); // Generated
                 fJLabelappname.setToolTipText(resBundel.getString("res_strappnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelappname;
    }


    /**
     * This method initializes  fJPanelappname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelappname() {
        if (fJPanelappname == null) {
            try {
                fJPanelappname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelappname.setLayout(layFlowLayout); // Generated
                fJPanelappname.add(getJLabelappname(), null); // Generated
                fJPanelappname.add(getStringTextFieldappname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelappname;
    }
//end DB field appname
//start DB field arguments
    /**
     * This method initializes fStringTextFieldarguments
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldarguments() {
        if (fStringTextFieldarguments == null) {
            try {
                fStringTextFieldarguments = new StringTextField(); // Generated
                fStringTextFieldarguments.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldarguments;
    }
        
    /**
     * This method initializes  fJLabelarguments
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelarguments() {
        if (fJLabelarguments == null) {
            try {
                 fJLabelarguments = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelarguments.setText(resBundel.getString("res_strargumentsDisplayName")); // Generated
                 fJLabelarguments.setToolTipText(resBundel.getString("res_strargumentsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelarguments;
    }


    /**
     * This method initializes  fJPanelarguments
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelarguments() {
        if (fJPanelarguments == null) {
            try {
                fJPanelarguments = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelarguments.setLayout(layFlowLayout); // Generated
                fJPanelarguments.add(getJLabelarguments(), null); // Generated
                fJPanelarguments.add(getStringTextFieldarguments(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelarguments;
    }
//end DB field arguments

}

	