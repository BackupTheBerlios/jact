package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.While;

/**
 * <p>
 * WhileDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:35 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WhileDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class WhileDataPanel extends SimpleDataObjectPanel{
	protected While dataObject;
	//protected WhileChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public WhileDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getWhileResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getWhileResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/WhileResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new WhileCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldexpr,		
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
        this.add(getJPanelexpr(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldexpr.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldexpr.setValue(dataObject.getExpr());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setExpr(fStringTextFieldexpr.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param While
	 */
	public void setDataObject(Object aWhile) {
	    //abstractdataObject = (AbstractConfigObject) aWhile;
		setDataObject((While) aWhile);
		//dataObject = aWhile;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param While
	 */
	public void setDataObject(While aWhile) {
	    //abstractdataObject = (AbstractConfigObject) aWhile;
		dataObject = aWhile;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldexpr;
    protected javax.swing.JLabel fJLabelexpr;
	protected javax.swing.JPanel fJPanelexpr;
    

//start DB field expr
    /**
     * This method initializes fStringTextFieldexpr
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldexpr() {
        if (fStringTextFieldexpr == null) {
            try {
                fStringTextFieldexpr = new StringTextField(); // Generated
                fStringTextFieldexpr.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldexpr;
    }
        
    /**
     * This method initializes  fJLabelexpr
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelexpr() {
        if (fJLabelexpr == null) {
            try {
                 fJLabelexpr = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelexpr.setText(resBundel.getString("res_strexprDisplayName")); // Generated
                 fJLabelexpr.setToolTipText(resBundel.getString("res_strexprDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelexpr;
    }


    /**
     * This method initializes  fJPanelexpr
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelexpr() {
        if (fJPanelexpr == null) {
            try {
                fJPanelexpr = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelexpr.setLayout(layFlowLayout); // Generated
                fJPanelexpr.add(getJLabelexpr(), null); // Generated
                fJPanelexpr.add(getStringTextFieldexpr(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelexpr;
    }
//end DB field expr

}

	