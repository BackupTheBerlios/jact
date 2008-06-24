/*
 * (c) urs zeidler
 */
package com.useit.jact.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.useit.app.framework.db.HibernateUtil;
import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.ContextImpl;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.ExtensionImpl;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.ExtensionconfImpl;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.GlobalvarsImpl;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.IncludeconfigsImpl;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.IncludecontextImpl;
import com.useit.jact.model.extensionconf.MMFextensionconf;
import com.useit.jact.model.extensionconf.Switch;
import com.useit.jact.model.extensionconf.SwitchImpl;
import com.useit.jact.model.types.PbxApplication;
import com.useit.jact.model.types.PbxContext;

/** 
 * <p> 
 * IOextensionconfTest
 * </p> 
 * Created : 06.09.2005 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: IOextensionconfTest.java,v 1.1 2008/06/24 20:45:01 urszeidler Exp $ 
 */
public class IOextensionconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(IOextensionconfTest.class);
	private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOextensionconfTest.class);
    }

    /*
     * @see 
     */
    protected void setUp() throws Exception {
        super.setUp();
		session = HibernateUtil.getSessionFactory().openSession();
        
    }
    /*
     * @see 
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
	public final void testExtensionLoadSaveXML() {
		Extension Obj = createExtension();
		MMFextensionconf.getInstance().writeConfXML("temp/Extension.xml", Obj);
        Object object = MMFextensionconf.getInstance().readConfXML("temp/Extension.xml");		
		assertEquals("load save XML Extension",true,checkExtension(Obj, object));
	}
	public final void testContextLoadSaveXML() {
		Context Obj = createContext();
		MMFextensionconf.getInstance().writeConfXML("temp/Context.xml", Obj);
        Object object = MMFextensionconf.getInstance().readConfXML("temp/Context.xml");		
		assertEquals("load save XML Context",true,checkContext(Obj, object));
	}
	public final void testIncludecontextLoadSaveXML() {
		Includecontext Obj = createIncludecontext();
		MMFextensionconf.getInstance().writeConfXML("temp/Includecontext.xml", Obj);
        Object object = MMFextensionconf.getInstance().readConfXML("temp/Includecontext.xml");		
		assertEquals("load save XML Includecontext",true,checkIncludecontext(Obj, object));
	}
	public final void testSwitchLoadSaveXML() {
		Switch Obj = createSwitch();
		MMFextensionconf.getInstance().writeConfXML("temp/Switch.xml", Obj);
        Object object = MMFextensionconf.getInstance().readConfXML("temp/Switch.xml");		
		assertEquals("load save XML Switch",true,checkSwitch(Obj, object));
	}
	public final void testExtensionconfLoadSaveXML() {
		Extensionconf Obj = createExtensionconf();
		MMFextensionconf.getInstance().writeConfXML("temp/Extensionconf.xml", Obj);
        Object object = MMFextensionconf.getInstance().readConfXML("temp/Extensionconf.xml");		
		assertEquals("load save XML Extensionconf",true,checkExtensionconf(Obj, object));
	}
	public final void testGlobalvarsLoadSaveXML() {
		Globalvars Obj = createGlobalvars();
		MMFextensionconf.getInstance().writeConfXML("temp/Globalvars.xml", Obj);
        Object object = MMFextensionconf.getInstance().readConfXML("temp/Globalvars.xml");		
		assertEquals("load save XML Globalvars",true,checkGlobalvars(Obj, object));
	}
	public final void testIncludeconfigsLoadSaveXML() {
		Includeconfigs Obj = createIncludeconfigs();
		MMFextensionconf.getInstance().writeConfXML("temp/Includeconfigs.xml", Obj);
        Object object = MMFextensionconf.getInstance().readConfXML("temp/Includeconfigs.xml");		
		assertEquals("load save XML Includeconfigs",true,checkIncludeconfigs(Obj, object));
	}
	
	public final void testExtensionloadSaveConf() {
		Extension Obj = createExtension();
	try{
		MMFextensionconf.getInstance().writetoFile(Obj,"temp/Extension.cfg");
        Object object = MMFextensionconf.getInstance().readConf(new File("temp/Extension.cfg"));
		assertEquals("load save conf Extension",true,checkExtension(Obj,object));
        } catch (FileNotFoundException e) {
             LOGGER.error("testExtensionloadSaveConf()", e);
        } catch (IOException e) {
             LOGGER.error("testExtensionloadSaveConf()", e);
        }
	}
	public final void testContextloadSaveConf() {
		Context Obj = createContext();
	try{
		MMFextensionconf.getInstance().writetoFile(Obj,"temp/Context.cfg");
        Object object = MMFextensionconf.getInstance().readConf(new File("temp/Context.cfg"));
		assertEquals("load save conf Context",true,checkContext(Obj,object));
        } catch (FileNotFoundException e) {
             LOGGER.error("testContextloadSaveConf()", e);
        } catch (IOException e) {
             LOGGER.error("testContextloadSaveConf()", e);
        }
	}
	public final void testIncludecontextloadSaveConf() {
		Includecontext Obj = createIncludecontext();
	try{
		MMFextensionconf.getInstance().writetoFile(Obj,"temp/Includecontext.cfg");
        Object object = MMFextensionconf.getInstance().readConf(new File("temp/Includecontext.cfg"));
		assertEquals("load save conf Includecontext",true,checkIncludecontext(Obj,object));
        } catch (FileNotFoundException e) {
             LOGGER.error("testIncludecontextloadSaveConf()", e);
        } catch (IOException e) {
             LOGGER.error("testIncludecontextloadSaveConf()", e);
        }
	}
	public final void testSwitchloadSaveConf() {
		Switch Obj = createSwitch();
	try{
		MMFextensionconf.getInstance().writetoFile(Obj,"temp/Switch.cfg");
        Object object = MMFextensionconf.getInstance().readConf(new File("temp/Switch.cfg"));
		assertEquals("load save conf Switch",true,checkSwitch(Obj,object));
        } catch (FileNotFoundException e) {
             LOGGER.error("testSwitchloadSaveConf()", e);
        } catch (IOException e) {
             LOGGER.error("testSwitchloadSaveConf()", e);
        }
	}
	public final void testExtensionconfloadSaveConf() {
		Extensionconf Obj = createExtensionconf();
	try{
		MMFextensionconf.getInstance().writetoFile(Obj,"temp/Extensionconf.cfg");
        Object object = MMFextensionconf.getInstance().readConf(new File("temp/Extensionconf.cfg"));
		assertEquals("load save conf Extensionconf",true,checkExtensionconf(Obj,object));
        } catch (FileNotFoundException e) {
             LOGGER.error("testExtensionconfloadSaveConf()", e);
        } catch (IOException e) {
             LOGGER.error("testExtensionconfloadSaveConf()", e);
        }
	}
	public final void testGlobalvarsloadSaveConf() {
		Globalvars Obj = createGlobalvars();
	try{
		MMFextensionconf.getInstance().writetoFile(Obj,"temp/Globalvars.cfg");
        Object object = MMFextensionconf.getInstance().readConf(new File("temp/Globalvars.cfg"));
		assertEquals("load save conf Globalvars",true,checkGlobalvars(Obj,object));
        } catch (FileNotFoundException e) {
             LOGGER.error("testGlobalvarsloadSaveConf()", e);
        } catch (IOException e) {
             LOGGER.error("testGlobalvarsloadSaveConf()", e);
        }
	}
	public final void testIncludeconfigsloadSaveConf() {
		Includeconfigs Obj = createIncludeconfigs();
	try{
		MMFextensionconf.getInstance().writetoFile(Obj,"temp/Includeconfigs.cfg");
        Object object = MMFextensionconf.getInstance().readConf(new File("temp/Includeconfigs.cfg"));
		assertEquals("load save conf Includeconfigs",true,checkIncludeconfigs(Obj,object));
        } catch (FileNotFoundException e) {
             LOGGER.error("testIncludeconfigsloadSaveConf()", e);
        } catch (IOException e) {
             LOGGER.error("testIncludeconfigsloadSaveConf()", e);
        }
	}
	
	public final void testExtensionLoadSaveHibernate() {
		Extension Obj = createExtension();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();
            
        } catch (Exception e) {
             LOGGER.error("testExtensionLoadSaveHibernate()", e);
            transaction.rollback();
        }
		
		Object object = session.load(ExtensionImpl.class, Obj.getId());
		assertEquals("load save Extension",Obj, object);
		
	}
	public final void testContextLoadSaveHibernate() {
		Context Obj = createContext();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();
            
        } catch (Exception e) {
             LOGGER.error("testContextLoadSaveHibernate()", e);
            transaction.rollback();
        }
		
		Object object = session.load(ContextImpl.class, Obj.getId());
		assertEquals("load save Context",Obj, object);
		
	}
	public final void testIncludecontextLoadSaveHibernate() {
		Includecontext Obj = createIncludecontext();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();
            
        } catch (Exception e) {
             LOGGER.error("testIncludecontextLoadSaveHibernate()", e);
            transaction.rollback();
        }
		
		Object object = session.load(IncludecontextImpl.class, Obj.getId());
		assertEquals("load save Includecontext",Obj, object);
		
	}
	public final void testSwitchLoadSaveHibernate() {
		Switch Obj = createSwitch();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();
            
        } catch (Exception e) {
             LOGGER.error("testSwitchLoadSaveHibernate()", e);
            transaction.rollback();
        }
		
		Object object = session.load(SwitchImpl.class, Obj.getId());
		assertEquals("load save Switch",Obj, object);
		
	}
	public final void testExtensionconfLoadSaveHibernate() {
		Extensionconf Obj = createExtensionconf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();
            
        } catch (Exception e) {
             LOGGER.error("testExtensionconfLoadSaveHibernate()", e);
            transaction.rollback();
        }
		
		Object object = session.load(ExtensionconfImpl.class, Obj.getId());
		assertEquals("load save Extensionconf",Obj, object);
		
	}
	public final void testGlobalvarsLoadSaveHibernate() {
		Globalvars Obj = createGlobalvars();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();
            
        } catch (Exception e) {
             LOGGER.error("testGlobalvarsLoadSaveHibernate()", e);
            transaction.rollback();
        }
		
		Object object = session.load(GlobalvarsImpl.class, Obj.getId());
		assertEquals("load save Globalvars",Obj, object);
		
	}
	public final void testIncludeconfigsLoadSaveHibernate() {
		Includeconfigs Obj = createIncludeconfigs();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();
            
        } catch (Exception e) {
             LOGGER.error("testIncludeconfigsLoadSaveHibernate()", e);
            transaction.rollback();
        }
		
		Object object = session.load(IncludeconfigsImpl.class, Obj.getId());
		assertEquals("load save Includeconfigs",Obj, object);
		
	}
    /*
     * überprüft Extension
     */
    protected static boolean checkExtension(Extension org, Object obj) {
        if(org==null && obj==null)
            return true;        
        if(org==null || obj==null)
            return false;
            
       Extension copy = null;
        if (obj instanceof  Extension) {
            copy = (Extension) obj;
            
        }else{
               LOGGER.warn("checkExtension failed : cast " 
                + org.getClass()
                + " : "
                + obj.getClass());
        
         return true;
        }    
         //fields
        boolean test = true;
	test = org.getByValue(Extension.VALUEID_EXTEN).equals(copy.getByValue(Extension.VALUEID_EXTEN));	
	if(!test) 
        LOGGER.warn("checkExtension failed : EXTEN " 
                + org.getByValue(Extension.VALUEID_EXTEN)
                + " : "
                +copy.getByValue(Extension.VALUEID_EXTEN));
	
	test = org.getByValue(Extension.VALUEID_PRIORITY).equals(copy.getByValue(Extension.VALUEID_PRIORITY));	
	if(!test) 
        LOGGER.warn("checkExtension failed : PRIORITY " 
                + org.getByValue(Extension.VALUEID_PRIORITY)
                + " : "
                +copy.getByValue(Extension.VALUEID_PRIORITY));
	
	test = org.getByValue(Extension.VALUEID_APPLICATION).equals(copy.getByValue(Extension.VALUEID_APPLICATION));	
	if(!test) 
        LOGGER.warn("checkExtension failed : APPLICATION " 
                + org.getByValue(Extension.VALUEID_APPLICATION)
                + " : "
                +copy.getByValue(Extension.VALUEID_APPLICATION));
	
//---------------agg
//-----------------map
        return test;
    }
    /*
     * überprüft Context
     */
    protected static boolean checkContext(Context org, Object obj) {
        if(org==null && obj==null)
            return true;        
        if(org==null || obj==null)
            return false;
            
       Context copy = null;
        if (obj instanceof  Context) {
            copy = (Context) obj;
            
        }else{
               LOGGER.warn("checkContext failed : cast " 
                + org.getClass()
                + " : "
                + obj.getClass());
        
         return true;
        }    
         //fields
        boolean test = true;
	test = org.getByValue(Context.VALUEID_CONTEXTNAME).equals(copy.getByValue(Context.VALUEID_CONTEXTNAME));	
	if(!test) 
        LOGGER.warn("checkContext failed : CONTEXTNAME " 
                + org.getByValue(Context.VALUEID_CONTEXTNAME)
                + " : "
                +copy.getByValue(Context.VALUEID_CONTEXTNAME));
	
	test = org.getByValue(Context.VALUEID_IGNOREPAT).equals(copy.getByValue(Context.VALUEID_IGNOREPAT));	
	if(!test) 
        LOGGER.warn("checkContext failed : IGNOREPAT " 
                + org.getByValue(Context.VALUEID_IGNOREPAT)
                + " : "
                +copy.getByValue(Context.VALUEID_IGNOREPAT));
	
//---------------agg
//-----------------map
		test = org.getExtensionMap().size() 
				== 
			   copy.getExtensionMap().size();
	
	if(!test) {
        LOGGER.warn("checkContext failed : extensionMap  size" 
                + org.toString()
                + " : "
                +copy.toString());
		return test;
	}
	for (int i = 0; i < org.getExtensionMap().size(); i++) {
        test = checkExtension(
         org.getExtensionMap().get(i)
        ,copy.getExtensionMap().get(i)
		);
		
		if(!test) {
        	LOGGER.warn("checkContext failed : extensionMap  equals "+i+" " 
                + org.getExtensionMap().get(i)
                + " : "
                +copy.getExtensionMap().get(i));
			return test;
		}
    }//end of for i to org.getExtensionMap()
	
//	newContext.addExtension(createExtension());
		test = org.getIncludecontextMap().size() 
				== 
			   copy.getIncludecontextMap().size();
	
	if(!test) {
        LOGGER.warn("checkContext failed : includecontextMap  size" 
                + org.toString()
                + " : "
                +copy.toString());
		return test;
	}
	for (int i = 0; i < org.getIncludecontextMap().size(); i++) {
        test = checkIncludecontext(
         org.getIncludecontextMap().get(i)
        ,copy.getIncludecontextMap().get(i)
		);
		
		if(!test) {
        	LOGGER.warn("checkContext failed : includecontextMap  equals "+i+" " 
                + org.getIncludecontextMap().get(i)
                + " : "
                +copy.getIncludecontextMap().get(i));
			return test;
		}
    }//end of for i to org.getIncludecontextMap()
	
//	newContext.addIncludecontext(createIncludecontext());
		test = org.getSwitchMap().size() 
				== 
			   copy.getSwitchMap().size();
	
	if(!test) {
        LOGGER.warn("checkContext failed : switchMap  size" 
                + org.toString()
                + " : "
                +copy.toString());
		return test;
	}
	for (int i = 0; i < org.getSwitchMap().size(); i++) {
        test = checkSwitch(
         org.getSwitchMap().get(i)
        ,copy.getSwitchMap().get(i)
		);
		
		if(!test) {
        	LOGGER.warn("checkContext failed : switchMap  equals "+i+" " 
                + org.getSwitchMap().get(i)
                + " : "
                +copy.getSwitchMap().get(i));
			return test;
		}
    }//end of for i to org.getSwitchMap()
	
//	newContext.addSwitch(createSwitch());
        return test;
    }
    /*
     * überprüft Includecontext
     */
    protected static boolean checkIncludecontext(Includecontext org, Object obj) {
        if(org==null && obj==null)
            return true;        
        if(org==null || obj==null)
            return false;
            
       Includecontext copy = null;
        if (obj instanceof  Includecontext) {
            copy = (Includecontext) obj;
            
        }else{
               LOGGER.warn("checkIncludecontext failed : cast " 
                + org.getClass()
                + " : "
                + obj.getClass());
        
         return true;
        }    
         //fields
        boolean test = true;
	test = org.getByValue(Includecontext.VALUEID_CONTEXNAME).equals(copy.getByValue(Includecontext.VALUEID_CONTEXNAME));	
	if(!test) 
        LOGGER.warn("checkIncludecontext failed : CONTEXNAME " 
                + org.getByValue(Includecontext.VALUEID_CONTEXNAME)
                + " : "
                +copy.getByValue(Includecontext.VALUEID_CONTEXNAME));
	
	test = org.getByValue(Includecontext.VALUEID_TIMEING).equals(copy.getByValue(Includecontext.VALUEID_TIMEING));	
	if(!test) 
        LOGGER.warn("checkIncludecontext failed : TIMEING " 
                + org.getByValue(Includecontext.VALUEID_TIMEING)
                + " : "
                +copy.getByValue(Includecontext.VALUEID_TIMEING));
	
//---------------agg
//-----------------map
        return test;
    }
    /*
     * überprüft Switch
     */
    protected static boolean checkSwitch(Switch org, Object obj) {
        if(org==null && obj==null)
            return true;        
        if(org==null || obj==null)
            return false;
            
       Switch copy = null;
        if (obj instanceof  Switch) {
            copy = (Switch) obj;
            
        }else{
               LOGGER.warn("checkSwitch failed : cast " 
                + org.getClass()
                + " : "
                + obj.getClass());
        
         return true;
        }    
         //fields
        boolean test = true;
	test = org.getByValue(Switch.VALUEID_SWITCHDIALSTR).equals(copy.getByValue(Switch.VALUEID_SWITCHDIALSTR));	
	if(!test) 
        LOGGER.warn("checkSwitch failed : SWITCHDIALSTR " 
                + org.getByValue(Switch.VALUEID_SWITCHDIALSTR)
                + " : "
                +copy.getByValue(Switch.VALUEID_SWITCHDIALSTR));
	
//---------------agg
//-----------------map
        return test;
    }
    /*
     * überprüft Extensionconf
     */
    protected static boolean checkExtensionconf(Extensionconf org, Object obj) {
        if(org==null && obj==null)
            return true;        
        if(org==null || obj==null)
            return false;
            
       Extensionconf copy = null;
        if (obj instanceof  Extensionconf) {
            copy = (Extensionconf) obj;
            
        }else{
               LOGGER.warn("checkExtensionconf failed : cast " 
                + org.getClass()
                + " : "
                + obj.getClass());
        
         return true;
        }    
         //fields
        boolean test = true;
	test = org.getByValue(Extensionconf.VALUEID_STATIC_).equals(copy.getByValue(Extensionconf.VALUEID_STATIC_));	
	if(!test) 
        LOGGER.warn("checkExtensionconf failed : STATIC_ " 
                + org.getByValue(Extensionconf.VALUEID_STATIC_)
                + " : "
                +copy.getByValue(Extensionconf.VALUEID_STATIC_));
	
	test = org.getByValue(Extensionconf.VALUEID_WRITEPROTECT).equals(copy.getByValue(Extensionconf.VALUEID_WRITEPROTECT));	
	if(!test) 
        LOGGER.warn("checkExtensionconf failed : WRITEPROTECT " 
                + org.getByValue(Extensionconf.VALUEID_WRITEPROTECT)
                + " : "
                +copy.getByValue(Extensionconf.VALUEID_WRITEPROTECT));
	
	test = org.getByValue(Extensionconf.VALUEID_AUTOFALLTHROUGH).equals(copy.getByValue(Extensionconf.VALUEID_AUTOFALLTHROUGH));	
	if(!test) 
        LOGGER.warn("checkExtensionconf failed : AUTOFALLTHROUGH " 
                + org.getByValue(Extensionconf.VALUEID_AUTOFALLTHROUGH)
                + " : "
                +copy.getByValue(Extensionconf.VALUEID_AUTOFALLTHROUGH));
	
	test = org.getByValue(Extensionconf.VALUEID_CLEARGLOBALVARS).equals(copy.getByValue(Extensionconf.VALUEID_CLEARGLOBALVARS));	
	if(!test) 
        LOGGER.warn("checkExtensionconf failed : CLEARGLOBALVARS " 
                + org.getByValue(Extensionconf.VALUEID_CLEARGLOBALVARS)
                + " : "
                +copy.getByValue(Extensionconf.VALUEID_CLEARGLOBALVARS));
	
//---------------agg
//-----------------map
		test = org.getContextMap().size() 
				== 
			   copy.getContextMap().size();
	
	if(!test) {
        LOGGER.warn("checkExtensionconf failed : contextMap  size" 
                + org.toString()
                + " : "
                +copy.toString());
		return test;
	}
	for (int i = 0; i < org.getContextMap().size(); i++) {
        test = checkContext(
         org.getContextMap().get(i)
        ,copy.getContextMap().get(i)
		);
		
		if(!test) {
        	LOGGER.warn("checkExtensionconf failed : contextMap  equals "+i+" " 
                + org.getContextMap().get(i)
                + " : "
                +copy.getContextMap().get(i));
			return test;
		}
    }//end of for i to org.getContextMap()
	
//	newExtensionconf.addContext(createContext());
		test = org.getGlobalvarsMap().size() 
				== 
			   copy.getGlobalvarsMap().size();
	
	if(!test) {
        LOGGER.warn("checkExtensionconf failed : globalvarsMap  size" 
                + org.toString()
                + " : "
                +copy.toString());
		return test;
	}
	for (int i = 0; i < org.getGlobalvarsMap().size(); i++) {
        test = checkGlobalvars(
         org.getGlobalvarsMap().get(i)
        ,copy.getGlobalvarsMap().get(i)
		);
		
		if(!test) {
        	LOGGER.warn("checkExtensionconf failed : globalvarsMap  equals "+i+" " 
                + org.getGlobalvarsMap().get(i)
                + " : "
                +copy.getGlobalvarsMap().get(i));
			return test;
		}
    }//end of for i to org.getGlobalvarsMap()
	
//	newExtensionconf.addGlobalvars(createGlobalvars());
		test = org.getIncludeconfigsMap().size() 
				== 
			   copy.getIncludeconfigsMap().size();
	
	if(!test) {
        LOGGER.warn("checkExtensionconf failed : includeconfigsMap  size" 
                + org.toString()
                + " : "
                +copy.toString());
		return test;
	}
	for (int i = 0; i < org.getIncludeconfigsMap().size(); i++) {
        test = checkIncludeconfigs(
         org.getIncludeconfigsMap().get(i)
        ,copy.getIncludeconfigsMap().get(i)
		);
		
		if(!test) {
        	LOGGER.warn("checkExtensionconf failed : includeconfigsMap  equals "+i+" " 
                + org.getIncludeconfigsMap().get(i)
                + " : "
                +copy.getIncludeconfigsMap().get(i));
			return test;
		}
    }//end of for i to org.getIncludeconfigsMap()
	
//	newExtensionconf.addIncludeconfigs(createIncludeconfigs());
        return test;
    }
    /*
     * überprüft Globalvars
     */
    protected static boolean checkGlobalvars(Globalvars org, Object obj) {
        if(org==null && obj==null)
            return true;        
        if(org==null || obj==null)
            return false;
            
       Globalvars copy = null;
        if (obj instanceof  Globalvars) {
            copy = (Globalvars) obj;
            
        }else{
               LOGGER.warn("checkGlobalvars failed : cast " 
                + org.getClass()
                + " : "
                + obj.getClass());
        
         return true;
        }    
         //fields
        boolean test = true;
	test = org.getByValue(Globalvars.VALUEID_NAME).equals(copy.getByValue(Globalvars.VALUEID_NAME));	
	if(!test) 
        LOGGER.warn("checkGlobalvars failed : NAME " 
                + org.getByValue(Globalvars.VALUEID_NAME)
                + " : "
                +copy.getByValue(Globalvars.VALUEID_NAME));
	
	test = org.getByValue(Globalvars.VALUEID_VALUE).equals(copy.getByValue(Globalvars.VALUEID_VALUE));	
	if(!test) 
        LOGGER.warn("checkGlobalvars failed : VALUE " 
                + org.getByValue(Globalvars.VALUEID_VALUE)
                + " : "
                +copy.getByValue(Globalvars.VALUEID_VALUE));
	
//---------------agg
//-----------------map
        return test;
    }
    /*
     * überprüft Includeconfigs
     */
    protected static boolean checkIncludeconfigs(Includeconfigs org, Object obj) {
        if(org==null && obj==null)
            return true;        
        if(org==null || obj==null)
            return false;
            
       Includeconfigs copy = null;
        if (obj instanceof  Includeconfigs) {
            copy = (Includeconfigs) obj;
            
        }else{
               LOGGER.warn("checkIncludeconfigs failed : cast " 
                + org.getClass()
                + " : "
                + obj.getClass());
        
         return true;
        }    
         //fields
        boolean test = true;
	test = org.getByValue(Includeconfigs.VALUEID_CONFIGNAME).equals(copy.getByValue(Includeconfigs.VALUEID_CONFIGNAME));	
	if(!test) 
        LOGGER.warn("checkIncludeconfigs failed : CONFIGNAME " 
                + org.getByValue(Includeconfigs.VALUEID_CONFIGNAME)
                + " : "
                +copy.getByValue(Includeconfigs.VALUEID_CONFIGNAME));
	
//---------------agg
//-----------------map
        return test;
    }
    /*
     * erzeugt und initalisiert Extension
     */
    protected static Extension createExtension() {
        Extension newExtension = new ExtensionImpl();
        //fields
	newExtension.setByValue(Extension.VALUEID_EXTEN, "EXTEN");	
	newExtension.setByValue(Extension.VALUEID_PRIORITY, Integer.valueOf(0));	
	newExtension.setByValue(Extension.VALUEID_APPLICATION, new PbxApplication(""));	
//agg
//map
        return newExtension;
    }
    /*
     * erzeugt und initalisiert Context
     */
    protected static Context createContext() {
        Context newContext = new ContextImpl();
        //fields
	newContext.setByValue(Context.VALUEID_CONTEXTNAME, "CONTEXTNAME");	
	newContext.setByValue(Context.VALUEID_IGNOREPAT, "IGNOREPAT");	
//agg
//map
	newContext.addExtension(createExtension());
	newContext.addIncludecontext(createIncludecontext());
	newContext.addSwitch(createSwitch());
        return newContext;
    }
    /*
     * erzeugt und initalisiert Includecontext
     */
    protected static Includecontext createIncludecontext() {
        Includecontext newIncludecontext = new IncludecontextImpl();
        //fields
	newIncludecontext.setByValue(Includecontext.VALUEID_CONTEXNAME, new PbxContext(""));	
	newIncludecontext.setByValue(Includecontext.VALUEID_TIMEING, "TIMEING");	
//agg
//map
        return newIncludecontext;
    }
    /*
     * erzeugt und initalisiert Switch
     */
    protected static Switch createSwitch() {
        Switch newSwitch = new SwitchImpl();
        //fields
	newSwitch.setByValue(Switch.VALUEID_SWITCHDIALSTR, "SWITCHDIALSTR");	
//agg
//map
        return newSwitch;
    }
    /*
     * erzeugt und initalisiert Extensionconf
     */
    protected static Extensionconf createExtensionconf() {
        Extensionconf newExtensionconf = new ExtensionconfImpl();
        //fields
	newExtensionconf.setByValue(Extensionconf.VALUEID_STATIC_, Boolean.TRUE);	
	newExtensionconf.setByValue(Extensionconf.VALUEID_WRITEPROTECT, Boolean.TRUE);	
	newExtensionconf.setByValue(Extensionconf.VALUEID_AUTOFALLTHROUGH, Boolean.TRUE);	
	newExtensionconf.setByValue(Extensionconf.VALUEID_CLEARGLOBALVARS, Boolean.TRUE);	
//agg
//map
	newExtensionconf.addContext(createContext());
	newExtensionconf.addGlobalvars(createGlobalvars());
	newExtensionconf.addIncludeconfigs(createIncludeconfigs());
        return newExtensionconf;
    }
    /*
     * erzeugt und initalisiert Globalvars
     */
    protected static Globalvars createGlobalvars() {
        Globalvars newGlobalvars = new GlobalvarsImpl();
        //fields
	newGlobalvars.setByValue(Globalvars.VALUEID_NAME, "NAME");	
	newGlobalvars.setByValue(Globalvars.VALUEID_VALUE, "VALUE");	
//agg
//map
        return newGlobalvars;
    }
    /*
     * erzeugt und initalisiert Includeconfigs
     */
    protected static Includeconfigs createIncludeconfigs() {
        Includeconfigs newIncludeconfigs = new IncludeconfigsImpl();
        //fields
	newIncludeconfigs.setByValue(Includeconfigs.VALUEID_CONFIGNAME, "CONFIGNAME");	
//agg
//map
        return newIncludeconfigs;
    }

}
