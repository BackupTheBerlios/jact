package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ReadFile;

/**
 * <p>
 * ReadFileDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:02 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ReadFileDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class ReadFileDataPanel extends SimpleDataObjectPanel{
	protected ReadFile dataObject;
	//protected ReadFileChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ReadFileDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getReadFileResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getReadFileResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ReadFileResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ReadFileCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldvarname,		
			fStringTextFieldfile,		
			fStringTextFieldlength,		
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
		this.setSize(400,(3)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelvarname(), null); // Generated
        this.add(getJPanelfile(), null); // Generated
        this.add(getJPanellength(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldvarname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldfile.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldlength.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldvarname.setValue(dataObject.getVarname());
        fStringTextFieldfile.setValue(dataObject.getFile());
        fStringTextFieldlength.setValue(dataObject.getLength());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setVarname(fStringTextFieldvarname.getValue());
        dataObject.setFile(fStringTextFieldfile.getValue());
        dataObject.setLength(fStringTextFieldlength.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ReadFile
	 */
	public void setDataObject(Object aReadFile) {
	    //abstractdataObject = (AbstractConfigObject) aReadFile;
		setDataObject((ReadFile) aReadFile);
		//dataObject = aReadFile;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ReadFile
	 */
	public void setDataObject(ReadFile aReadFile) {
	    //abstractdataObject = (AbstractConfigObject) aReadFile;
		dataObject = aReadFile;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldvarname;
    protected javax.swing.JLabel fJLabelvarname;
	protected javax.swing.JPanel fJPanelvarname;
    protected StringTextField fStringTextFieldfile;
    protected javax.swing.JLabel fJLabelfile;
	protected javax.swing.JPanel fJPanelfile;
    protected StringTextField fStringTextFieldlength;
    protected javax.swing.JLabel fJLabellength;
	protected javax.swing.JPanel fJPanellength;
    

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
//start DB field file
    /**
     * This method initializes fStringTextFieldfile
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfile() {
        if (fStringTextFieldfile == null) {
            try {
                fStringTextFieldfile = new StringTextField(); // Generated
                fStringTextFieldfile.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfile;
    }
        
    /**
     * This method initializes  fJLabelfile
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfile() {
        if (fJLabelfile == null) {
            try {
                 fJLabelfile = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfile.setText(resBundel.getString("res_strfileDisplayName")); // Generated
                 fJLabelfile.setToolTipText(resBundel.getString("res_strfileDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfile;
    }


    /**
     * This method initializes  fJPanelfile
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfile() {
        if (fJPanelfile == null) {
            try {
                fJPanelfile = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfile.setLayout(layFlowLayout); // Generated
                fJPanelfile.add(getJLabelfile(), null); // Generated
                fJPanelfile.add(getStringTextFieldfile(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfile;
    }
//end DB field file
//start DB field length
    /**
     * This method initializes fStringTextFieldlength
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlength() {
        if (fStringTextFieldlength == null) {
            try {
                fStringTextFieldlength = new StringTextField(); // Generated
                fStringTextFieldlength.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlength;
    }
        
    /**
     * This method initializes  fJLabellength
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellength() {
        if (fJLabellength == null) {
            try {
                 fJLabellength = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabellength.setText(resBundel.getString("res_strlengthDisplayName")); // Generated
                 fJLabellength.setToolTipText(resBundel.getString("res_strlengthDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabellength;
    }


    /**
     * This method initializes  fJPanellength
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellength() {
        if (fJPanellength == null) {
            try {
                fJPanellength = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellength.setLayout(layFlowLayout); // Generated
                fJPanellength.add(getJLabellength(), null); // Generated
                fJPanellength.add(getStringTextFieldlength(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellength;
    }
//end DB field length

}

	