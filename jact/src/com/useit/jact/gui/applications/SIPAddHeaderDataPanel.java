package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SIPAddHeader;

/**
 * <p>
 * SIPAddHeaderDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:23 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SIPAddHeaderDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class SIPAddHeaderDataPanel extends SimpleDataObjectPanel{
	protected SIPAddHeader dataObject;
	//protected SIPAddHeaderChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SIPAddHeaderDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSIPAddHeaderResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSIPAddHeaderResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SIPAddHeaderResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SIPAddHeaderCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldheader,		
			fStringTextFieldcontent,		
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
        this.add(getJPanelheader(), null); // Generated
        this.add(getJPanelcontent(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldheader.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcontent.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldheader.setValue(dataObject.getHeader());
        fStringTextFieldcontent.setValue(dataObject.getContent());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setHeader(fStringTextFieldheader.getValue());
        dataObject.setContent(fStringTextFieldcontent.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SIPAddHeader
	 */
	public void setDataObject(Object aSIPAddHeader) {
	    //abstractdataObject = (AbstractConfigObject) aSIPAddHeader;
		setDataObject((SIPAddHeader) aSIPAddHeader);
		//dataObject = aSIPAddHeader;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SIPAddHeader
	 */
	public void setDataObject(SIPAddHeader aSIPAddHeader) {
	    //abstractdataObject = (AbstractConfigObject) aSIPAddHeader;
		dataObject = aSIPAddHeader;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldheader;
    protected javax.swing.JLabel fJLabelheader;
	protected javax.swing.JPanel fJPanelheader;
    protected StringTextField fStringTextFieldcontent;
    protected javax.swing.JLabel fJLabelcontent;
	protected javax.swing.JPanel fJPanelcontent;
    

//start DB field header
    /**
     * This method initializes fStringTextFieldheader
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldheader() {
        if (fStringTextFieldheader == null) {
            try {
                fStringTextFieldheader = new StringTextField(); // Generated
                fStringTextFieldheader.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldheader;
    }
        
    /**
     * This method initializes  fJLabelheader
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelheader() {
        if (fJLabelheader == null) {
            try {
                 fJLabelheader = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelheader.setText(resBundel.getString("res_strheaderDisplayName")); // Generated
                 fJLabelheader.setToolTipText(resBundel.getString("res_strheaderDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelheader;
    }


    /**
     * This method initializes  fJPanelheader
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelheader() {
        if (fJPanelheader == null) {
            try {
                fJPanelheader = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelheader.setLayout(layFlowLayout); // Generated
                fJPanelheader.add(getJLabelheader(), null); // Generated
                fJPanelheader.add(getStringTextFieldheader(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelheader;
    }
//end DB field header
//start DB field content
    /**
     * This method initializes fStringTextFieldcontent
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcontent() {
        if (fStringTextFieldcontent == null) {
            try {
                fStringTextFieldcontent = new StringTextField(); // Generated
                fStringTextFieldcontent.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcontent;
    }
        
    /**
     * This method initializes  fJLabelcontent
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcontent() {
        if (fJLabelcontent == null) {
            try {
                 fJLabelcontent = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcontent.setText(resBundel.getString("res_strcontentDisplayName")); // Generated
                 fJLabelcontent.setToolTipText(resBundel.getString("res_strcontentDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcontent;
    }


    /**
     * This method initializes  fJPanelcontent
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcontent() {
        if (fJPanelcontent == null) {
            try {
                fJPanelcontent = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcontent.setLayout(layFlowLayout); // Generated
                fJPanelcontent.add(getJLabelcontent(), null); // Generated
                fJPanelcontent.add(getStringTextFieldcontent(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcontent;
    }
//end DB field content

}

	