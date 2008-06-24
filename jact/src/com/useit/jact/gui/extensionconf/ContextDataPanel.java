package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.extensionconf.Context;

/**
 * <p>
 * ContextDataPanel
 * </p>
 * Created : Fri May 26 17:18:23 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ContextDataPanel.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $
 */
public class ContextDataPanel extends SimpleDataObjectPanel{
	protected Context dataObject;
	//protected ContextChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ContextDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getContextResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getContextResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ContextResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ContextCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldignorepat,		
			fStringTextFieldcontextname,		
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
        this.add(getJPanelignorepat(), null); // Generated
        this.add(getJPanelcontextname(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldignorepat.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcontextname.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldignorepat.setValue(dataObject.getIgnorepat());
        fStringTextFieldcontextname.setValue(dataObject.getContextname());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setIgnorepat(fStringTextFieldignorepat.getValue());
        dataObject.setContextname(fStringTextFieldcontextname.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Context
	 */
	public void setDataObject(Object aContext) {
	    //abstractdataObject = (AbstractConfigObject) aContext;
		setDataObject((Context) aContext);
		//dataObject = aContext;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Context
	 */
	public void setDataObject(Context aContext) {
	    //abstractdataObject = (AbstractConfigObject) aContext;
		dataObject = aContext;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldignorepat;
    protected javax.swing.JLabel fJLabelignorepat;
	protected javax.swing.JPanel fJPanelignorepat;
    protected StringTextField fStringTextFieldcontextname;
    protected javax.swing.JLabel fJLabelcontextname;
	protected javax.swing.JPanel fJPanelcontextname;
    

//start DB field ignorepat
    /**
     * This method initializes fStringTextFieldignorepat
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldignorepat() {
        if (fStringTextFieldignorepat == null) {
            try {
                fStringTextFieldignorepat = new StringTextField(); // Generated
                fStringTextFieldignorepat.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldignorepat;
    }
        
    /**
     * This method initializes  fJLabelignorepat
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelignorepat() {
        if (fJLabelignorepat == null) {
            try {
                 fJLabelignorepat = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelignorepat.setText(resBundel.getString("res_strignorepatDisplayName")); // Generated
                 fJLabelignorepat.setToolTipText(resBundel.getString("res_strignorepatDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelignorepat;
    }


    /**
     * This method initializes  fJPanelignorepat
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelignorepat() {
        if (fJPanelignorepat == null) {
            try {
                fJPanelignorepat = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelignorepat.setLayout(layFlowLayout); // Generated
                fJPanelignorepat.add(getJLabelignorepat(), null); // Generated
                fJPanelignorepat.add(getStringTextFieldignorepat(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelignorepat;
    }
//end DB field ignorepat
//start DB field contextname
    /**
     * This method initializes fStringTextFieldcontextname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcontextname() {
        if (fStringTextFieldcontextname == null) {
            try {
                fStringTextFieldcontextname = new StringTextField(); // Generated
                fStringTextFieldcontextname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcontextname;
    }
        
    /**
     * This method initializes  fJLabelcontextname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcontextname() {
        if (fJLabelcontextname == null) {
            try {
                 fJLabelcontextname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcontextname.setText(resBundel.getString("res_strcontextnameDisplayName")); // Generated
                 fJLabelcontextname.setToolTipText(resBundel.getString("res_strcontextnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcontextname;
    }


    /**
     * This method initializes  fJPanelcontextname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcontextname() {
        if (fJPanelcontextname == null) {
            try {
                fJPanelcontextname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcontextname.setLayout(layFlowLayout); // Generated
                fJPanelcontextname.add(getJLabelcontextname(), null); // Generated
                fJPanelcontextname.add(getStringTextFieldcontextname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcontextname;
    }
//end DB field contextname

}

	