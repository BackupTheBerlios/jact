package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Cut;

/**
 * <p>
 * CutDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:30 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: CutDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class CutDataPanel extends SimpleDataObjectPanel{
	protected Cut dataObject;
	//protected CutChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public CutDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getCutResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getCutResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/CutResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new CutCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldnewvar,		
			fStringTextFieldvarname,		
			fStringTextFielddelimiter,		
			fStringTextFieldfield,		
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
		this.setSize(400,(4)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelnewvar(), null); // Generated
        this.add(getJPanelvarname(), null); // Generated
        this.add(getJPaneldelimiter(), null); // Generated
        this.add(getJPanelfield(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldnewvar.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldvarname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielddelimiter.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldfield.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldnewvar.setValue(dataObject.getNewvar());
        fStringTextFieldvarname.setValue(dataObject.getVarname());
        fStringTextFielddelimiter.setValue(dataObject.getDelimiter());
        fStringTextFieldfield.setValue(dataObject.getField());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setNewvar(fStringTextFieldnewvar.getValue());
        dataObject.setVarname(fStringTextFieldvarname.getValue());
        dataObject.setDelimiter(fStringTextFielddelimiter.getValue());
        dataObject.setField(fStringTextFieldfield.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Cut
	 */
	public void setDataObject(Object aCut) {
	    //abstractdataObject = (AbstractConfigObject) aCut;
		setDataObject((Cut) aCut);
		//dataObject = aCut;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Cut
	 */
	public void setDataObject(Cut aCut) {
	    //abstractdataObject = (AbstractConfigObject) aCut;
		dataObject = aCut;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldnewvar;
    protected javax.swing.JLabel fJLabelnewvar;
	protected javax.swing.JPanel fJPanelnewvar;
    protected StringTextField fStringTextFieldvarname;
    protected javax.swing.JLabel fJLabelvarname;
	protected javax.swing.JPanel fJPanelvarname;
    protected StringTextField fStringTextFielddelimiter;
    protected javax.swing.JLabel fJLabeldelimiter;
	protected javax.swing.JPanel fJPaneldelimiter;
    protected StringTextField fStringTextFieldfield;
    protected javax.swing.JLabel fJLabelfield;
	protected javax.swing.JPanel fJPanelfield;
    

//start DB field newvar
    /**
     * This method initializes fStringTextFieldnewvar
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldnewvar() {
        if (fStringTextFieldnewvar == null) {
            try {
                fStringTextFieldnewvar = new StringTextField(); // Generated
                fStringTextFieldnewvar.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldnewvar;
    }
        
    /**
     * This method initializes  fJLabelnewvar
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnewvar() {
        if (fJLabelnewvar == null) {
            try {
                 fJLabelnewvar = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelnewvar.setText(resBundel.getString("res_strnewvarDisplayName")); // Generated
                 fJLabelnewvar.setToolTipText(resBundel.getString("res_strnewvarDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelnewvar;
    }


    /**
     * This method initializes  fJPanelnewvar
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnewvar() {
        if (fJPanelnewvar == null) {
            try {
                fJPanelnewvar = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnewvar.setLayout(layFlowLayout); // Generated
                fJPanelnewvar.add(getJLabelnewvar(), null); // Generated
                fJPanelnewvar.add(getStringTextFieldnewvar(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnewvar;
    }
//end DB field newvar
//start DB field varname
    /**
     * This method initializes fStringTextFieldvarname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvarname() {
        if (fStringTextFieldvarname == null) {
            try {
                fStringTextFieldvarname = new StringTextField(); // Generated
                fStringTextFieldvarname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvarname;
    }
        
    /**
     * This method initializes  fJLabelvarname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvarname() {
        if (fJLabelvarname == null) {
            try {
                 fJLabelvarname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvarname.setText(resBundel.getString("res_strvarnameDisplayName")); // Generated
                 fJLabelvarname.setToolTipText(resBundel.getString("res_strvarnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvarname;
    }


    /**
     * This method initializes  fJPanelvarname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvarname() {
        if (fJPanelvarname == null) {
            try {
                fJPanelvarname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvarname.setLayout(layFlowLayout); // Generated
                fJPanelvarname.add(getJLabelvarname(), null); // Generated
                fJPanelvarname.add(getStringTextFieldvarname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvarname;
    }
//end DB field varname
//start DB field delimiter
    /**
     * This method initializes fStringTextFielddelimiter
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielddelimiter() {
        if (fStringTextFielddelimiter == null) {
            try {
                fStringTextFielddelimiter = new StringTextField(); // Generated
                fStringTextFielddelimiter.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddelimiter;
    }
        
    /**
     * This method initializes  fJLabeldelimiter
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldelimiter() {
        if (fJLabeldelimiter == null) {
            try {
                 fJLabeldelimiter = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldelimiter.setText(resBundel.getString("res_strdelimiterDisplayName")); // Generated
                 fJLabeldelimiter.setToolTipText(resBundel.getString("res_strdelimiterDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldelimiter;
    }


    /**
     * This method initializes  fJPaneldelimiter
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldelimiter() {
        if (fJPaneldelimiter == null) {
            try {
                fJPaneldelimiter = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldelimiter.setLayout(layFlowLayout); // Generated
                fJPaneldelimiter.add(getJLabeldelimiter(), null); // Generated
                fJPaneldelimiter.add(getStringTextFielddelimiter(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldelimiter;
    }
//end DB field delimiter
//start DB field field
    /**
     * This method initializes fStringTextFieldfield
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfield() {
        if (fStringTextFieldfield == null) {
            try {
                fStringTextFieldfield = new StringTextField(); // Generated
                fStringTextFieldfield.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfield;
    }
        
    /**
     * This method initializes  fJLabelfield
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfield() {
        if (fJLabelfield == null) {
            try {
                 fJLabelfield = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfield.setText(resBundel.getString("res_strfieldDisplayName")); // Generated
                 fJLabelfield.setToolTipText(resBundel.getString("res_strfieldDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfield;
    }


    /**
     * This method initializes  fJPanelfield
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfield() {
        if (fJPanelfield == null) {
            try {
                fJPanelfield = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfield.setLayout(layFlowLayout); // Generated
                fJPanelfield.add(getJLabelfield(), null); // Generated
                fJPanelfield.add(getStringTextFieldfield(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfield;
    }
//end DB field field

}

	