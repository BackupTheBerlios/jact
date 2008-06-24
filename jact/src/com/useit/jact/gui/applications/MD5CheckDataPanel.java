package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.MD5Check;

/**
 * <p>
 * MD5CheckDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:44 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MD5CheckDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MD5CheckDataPanel extends SimpleDataObjectPanel{
	protected MD5Check dataObject;
	//protected MD5CheckChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MD5CheckDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMD5CheckResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMD5CheckResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MD5CheckResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MD5CheckCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldmd5hash,		
			fStringTextFieldstring,		
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
        this.add(getJPanelmd5hash(), null); // Generated
        this.add(getJPanelstring(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldmd5hash.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldstring.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldmd5hash.setValue(dataObject.getMd5hash());
        fStringTextFieldstring.setValue(dataObject.getString());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setMd5hash(fStringTextFieldmd5hash.getValue());
        dataObject.setString(fStringTextFieldstring.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param MD5Check
	 */
	public void setDataObject(Object aMD5Check) {
	    //abstractdataObject = (AbstractConfigObject) aMD5Check;
		setDataObject((MD5Check) aMD5Check);
		//dataObject = aMD5Check;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param MD5Check
	 */
	public void setDataObject(MD5Check aMD5Check) {
	    //abstractdataObject = (AbstractConfigObject) aMD5Check;
		dataObject = aMD5Check;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldmd5hash;
    protected javax.swing.JLabel fJLabelmd5hash;
	protected javax.swing.JPanel fJPanelmd5hash;
    protected StringTextField fStringTextFieldstring;
    protected javax.swing.JLabel fJLabelstring;
	protected javax.swing.JPanel fJPanelstring;
    

//start DB field md5hash
    /**
     * This method initializes fStringTextFieldmd5hash
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmd5hash() {
        if (fStringTextFieldmd5hash == null) {
            try {
                fStringTextFieldmd5hash = new StringTextField(); // Generated
                fStringTextFieldmd5hash.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmd5hash;
    }
        
    /**
     * This method initializes  fJLabelmd5hash
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmd5hash() {
        if (fJLabelmd5hash == null) {
            try {
                 fJLabelmd5hash = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmd5hash.setText(resBundel.getString("res_strmd5hashDisplayName")); // Generated
                 fJLabelmd5hash.setToolTipText(resBundel.getString("res_strmd5hashDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmd5hash;
    }


    /**
     * This method initializes  fJPanelmd5hash
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmd5hash() {
        if (fJPanelmd5hash == null) {
            try {
                fJPanelmd5hash = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmd5hash.setLayout(layFlowLayout); // Generated
                fJPanelmd5hash.add(getJLabelmd5hash(), null); // Generated
                fJPanelmd5hash.add(getStringTextFieldmd5hash(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmd5hash;
    }
//end DB field md5hash
//start DB field string
    /**
     * This method initializes fStringTextFieldstring
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldstring() {
        if (fStringTextFieldstring == null) {
            try {
                fStringTextFieldstring = new StringTextField(); // Generated
                fStringTextFieldstring.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldstring;
    }
        
    /**
     * This method initializes  fJLabelstring
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelstring() {
        if (fJLabelstring == null) {
            try {
                 fJLabelstring = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelstring.setText(resBundel.getString("res_strstringDisplayName")); // Generated
                 fJLabelstring.setToolTipText(resBundel.getString("res_strstringDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelstring;
    }


    /**
     * This method initializes  fJPanelstring
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelstring() {
        if (fJPanelstring == null) {
            try {
                fJPanelstring = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelstring.setLayout(layFlowLayout); // Generated
                fJPanelstring.add(getJLabelstring(), null); // Generated
                fJPanelstring.add(getStringTextFieldstring(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelstring;
    }
//end DB field string

}

	