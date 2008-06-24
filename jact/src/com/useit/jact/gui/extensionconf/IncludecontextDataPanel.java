package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.PbxContextTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.extensionconf.Includecontext;

/**
 * <p>
 * IncludecontextDataPanel
 * </p>
 * Created : Fri May 26 17:18:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: IncludecontextDataPanel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class IncludecontextDataPanel extends SimpleDataObjectPanel{
	protected Includecontext dataObject;
	//protected IncludecontextChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public IncludecontextDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getIncludecontextResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getIncludecontextResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/IncludecontextResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new IncludecontextCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fPbxContextTextFieldcontexname,		
			fStringTextFieldtimeing,		
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
        this.add(getJPanelcontexname(), null); // Generated
        this.add(getJPaneltimeing(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fPbxContextTextFieldcontexname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtimeing.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fPbxContextTextFieldcontexname.setValue(dataObject.getContexname());
        fStringTextFieldtimeing.setValue(dataObject.getTimeing());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setContexname(fPbxContextTextFieldcontexname.getValue());
        dataObject.setTimeing(fStringTextFieldtimeing.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Includecontext
	 */
	public void setDataObject(Object aIncludecontext) {
	    //abstractdataObject = (AbstractConfigObject) aIncludecontext;
		setDataObject((Includecontext) aIncludecontext);
		//dataObject = aIncludecontext;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Includecontext
	 */
	public void setDataObject(Includecontext aIncludecontext) {
	    //abstractdataObject = (AbstractConfigObject) aIncludecontext;
		dataObject = aIncludecontext;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected PbxContextTextField fPbxContextTextFieldcontexname;
    protected javax.swing.JLabel fJLabelcontexname;
	protected javax.swing.JPanel fJPanelcontexname;
    protected StringTextField fStringTextFieldtimeing;
    protected javax.swing.JLabel fJLabeltimeing;
	protected javax.swing.JPanel fJPaneltimeing;
    

//start DB field contexname
    /**
     * This method initializes fPbxContextTextFieldcontexname
     *
     * @return PbxContextTextField
     */
    public PbxContextTextField getPbxContextTextFieldcontexname() {
        if (fPbxContextTextFieldcontexname == null) {
            try {
                fPbxContextTextFieldcontexname = new PbxContextTextField(); // Generated
                fPbxContextTextFieldcontexname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fPbxContextTextFieldcontexname;
    }
        
    /**
     * This method initializes  fJLabelcontexname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcontexname() {
        if (fJLabelcontexname == null) {
            try {
                 fJLabelcontexname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcontexname.setText(resBundel.getString("res_strcontexnameDisplayName")); // Generated
                 fJLabelcontexname.setToolTipText(resBundel.getString("res_strcontexnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcontexname;
    }


    /**
     * This method initializes  fJPanelcontexname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcontexname() {
        if (fJPanelcontexname == null) {
            try {
                fJPanelcontexname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcontexname.setLayout(layFlowLayout); // Generated
                fJPanelcontexname.add(getJLabelcontexname(), null); // Generated
                fJPanelcontexname.add(getPbxContextTextFieldcontexname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcontexname;
    }
//end DB field contexname
//start DB field timeing
    /**
     * This method initializes fStringTextFieldtimeing
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtimeing() {
        if (fStringTextFieldtimeing == null) {
            try {
                fStringTextFieldtimeing = new StringTextField(); // Generated
                fStringTextFieldtimeing.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtimeing;
    }
        
    /**
     * This method initializes  fJLabeltimeing
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimeing() {
        if (fJLabeltimeing == null) {
            try {
                 fJLabeltimeing = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltimeing.setText(resBundel.getString("res_strtimeingDisplayName")); // Generated
                 fJLabeltimeing.setToolTipText(resBundel.getString("res_strtimeingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltimeing;
    }


    /**
     * This method initializes  fJPaneltimeing
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimeing() {
        if (fJPaneltimeing == null) {
            try {
                fJPaneltimeing = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimeing.setLayout(layFlowLayout); // Generated
                fJPaneltimeing.add(getJLabeltimeing(), null); // Generated
                fJPaneltimeing.add(getStringTextFieldtimeing(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimeing;
    }
//end DB field timeing

}

	