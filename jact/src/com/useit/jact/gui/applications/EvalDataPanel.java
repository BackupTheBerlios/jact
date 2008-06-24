package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Eval;

/**
 * <p>
 * EvalDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:31 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: EvalDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class EvalDataPanel extends SimpleDataObjectPanel{
	protected Eval dataObject;
	//protected EvalChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public EvalDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getEvalResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getEvalResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/EvalResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new EvalCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldnewvar,		
			fStringTextFieldsomestring,		
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
        this.add(getJPanelnewvar(), null); // Generated
        this.add(getJPanelsomestring(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldnewvar.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldsomestring.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldnewvar.setValue(dataObject.getNewvar());
        fStringTextFieldsomestring.setValue(dataObject.getSomestring());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setNewvar(fStringTextFieldnewvar.getValue());
        dataObject.setSomestring(fStringTextFieldsomestring.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Eval
	 */
	public void setDataObject(Object aEval) {
	    //abstractdataObject = (AbstractConfigObject) aEval;
		setDataObject((Eval) aEval);
		//dataObject = aEval;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Eval
	 */
	public void setDataObject(Eval aEval) {
	    //abstractdataObject = (AbstractConfigObject) aEval;
		dataObject = aEval;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldnewvar;
    protected javax.swing.JLabel fJLabelnewvar;
	protected javax.swing.JPanel fJPanelnewvar;
    protected StringTextField fStringTextFieldsomestring;
    protected javax.swing.JLabel fJLabelsomestring;
	protected javax.swing.JPanel fJPanelsomestring;
    

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
//start DB field somestring
    /**
     * This method initializes fStringTextFieldsomestring
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsomestring() {
        if (fStringTextFieldsomestring == null) {
            try {
                fStringTextFieldsomestring = new StringTextField(); // Generated
                fStringTextFieldsomestring.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsomestring;
    }
        
    /**
     * This method initializes  fJLabelsomestring
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsomestring() {
        if (fJLabelsomestring == null) {
            try {
                 fJLabelsomestring = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelsomestring.setText(resBundel.getString("res_strsomestringDisplayName")); // Generated
                 fJLabelsomestring.setToolTipText(resBundel.getString("res_strsomestringDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelsomestring;
    }


    /**
     * This method initializes  fJPanelsomestring
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsomestring() {
        if (fJPanelsomestring == null) {
            try {
                fJPanelsomestring = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsomestring.setLayout(layFlowLayout); // Generated
                fJPanelsomestring.add(getJLabelsomestring(), null); // Generated
                fJPanelsomestring.add(getStringTextFieldsomestring(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsomestring;
    }
//end DB field somestring

}

	