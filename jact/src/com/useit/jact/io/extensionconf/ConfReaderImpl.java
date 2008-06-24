/*
 * (c) urs zeidler
 */
package com.useit.jact.io.extensionconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.applications.ModelFactoryapplicationsImpl;
import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.ExtensionImpl;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.GlobalvarsImpl;
import com.useit.jact.model.extensionconf.IncludeconfigsImpl;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.IncludecontextImpl;
import com.useit.jact.model.extensionconf.SwitchImpl;
import com.useit.jact.model.types.PbxApplication;
import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.6 2006/03/17 15:47:22
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {

    public static final String GENERAL = "general";

    public static final String GLOBALVARS = "globals";

    private static final String SWITCH = "switch";

    private static final String INCLUDECONTEXT = "include";

    private static final String EXTENT = "exten";

    public static final Pattern extensionPattern = Pattern
            .compile("[ ]*exten[ ]*=>[ ]*([^,]+)[ ]*,[ ]*([0-9]+)[ ]*,[ ]*(.[^;]+)[ ]*");

    public static final Pattern applicationPattern = Pattern
            .compile("[ ]*([\\w]+)[ ]*([,(])[ ]*(.[^)]*)[ ]*");

    public static final Pattern includePattern = Pattern
            .compile("[ ]*include[ ]*=>[ ]*(\\w+)[ ]*([\\|].[^;]+)|[ ]*include[ ]*=>[ ]*(\\w[^;|]+)");

    public static final Pattern switchPattern = Pattern.compile("[ ]*" + SWITCH
            + "[ ]*=>[ ]*(.[^;]+)");

    public static final Pattern ignorePattern = Pattern
            .compile("[ ]*ignorepat[ ]*=>[ ]*(.[^;]+)");

    public static final Pattern includeConfigsPattern = Pattern
            .compile("[ ]*#[ ]*include[ ]*\"(\\w[^;]+)\"");

    
    private static final ModelFactoryapplicationsImpl appFactory = (ModelFactoryapplicationsImpl) ModelFactoryapplicationsImpl.defaultModelFactory;
    /**
     * 
     */
    public ConfReaderImpl() {
        super();
        COMMENTTOK = ";";
        SECHEADERTOK = "[";
        entryStops = new String[] { "\n", "\r" };
    }

    /**
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        String content = UseFileHelper.readStringFromFile(selectedFile, 400);

        buildEntryList(content);

        Extensionconf driverConf = buildExtensionconfModelElement(getWorkingExtensionconfEntryList());

        // if(list!=null)
        buildIncludeConfigs(driverConf);
        buildGlobalVars(driverConf);
        buildContextList(driverConf);

        return driverConf;
    }

    private void buildIncludeConfigs(Extensionconf driverConf) {
        List list = getWorkingExtensionconfEntryList();
        for (int i = 0; i < list.size(); i++) {
            Confentry ce = (Confentry) list.get(i);
            String str = ce.content;
            Matcher matcher = includeConfigsPattern.matcher(str);
            if (matcher.find())
                driverConf.addIncludeconfigs(new IncludeconfigsImpl(matcher
                        .group(1)));
        }// end of for i to list
    }

    @Override
    protected void buildExtensionconfModelVaues(List entryList,
            Extensionconf impl) {
        super.buildExtensionconfModelVaues(entryList, impl);
        String val = null;
        val = findConfValue("static", entryList);
        if (val != null)
            impl.setStatic_(com.useit.app.framework.helper.UseStringHelper.parseBoolCommon(val));

    }

    private void buildGlobalVars(Extensionconf driverConf) {
        ConfSecHeader ch = findConfHeader(GLOBALVARS);
        if (ch == null)
            return;
        for (int i = 0; i < ch.val.size(); i++) {
            Confvalue cv = (Confvalue) ch.val.get(i);
            GlobalvarsImpl gv = new GlobalvarsImpl(cv.key, cv.value);
            driverConf.addGlobalvars(gv);
        }// end of for i to ch.val

    }

    private void buildContextList(Extensionconf driverConf) {
        List list = getWorkingContextEntryList();
        for (int i = 0; i < list.size(); i++) {
            ConfSecHeader csh = (ConfSecHeader) list.get(i);
            Context context = buildContextModelElement(csh.val);
            context.setContextname(csh.content);
            driverConf.addContext(context);
        }// end of for i to list
    }

    @Override
    protected Context buildContextModelElement(List aEntryList) {
        return super.buildContextModelElement(aEntryList);
    }

    @Override
    protected void buildContextModelVaues(List entryList, Context impl) {
        super.buildContextModelVaues(entryList, impl);
        impl
                .setIgnorepat(buildIgnorePatt(findConfEntry("ignorepat",
                        entryList)));

    }

    private String buildIgnorePatt(Confvalue confvalue) {
        if (confvalue == null)
            return null;
        Matcher matcher = ignorePattern.matcher(confvalue.content);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildContextModelAgg(List entryList, Context impl) {

        for (int i = 0; i < entryList.size(); i++) {
            Confvalue cv = (Confvalue) entryList.get(i);
            if (cv.key == null)
                continue;

            if (cv.key.equals(SWITCH)) {
                impl.addSwitch(buildSwitch(cv));
                continue;
            }
            if (cv.key.equals(INCLUDECONTEXT)) {
                impl.addIncludecontext(buildincludeContext(cv));
                continue;
            }
            if (cv.key.equals(EXTENT)) {
                impl.addExtension(buildextension(cv));
                continue;
            }

        }// end of for i to entryList

        // //aggregate schreiben
        // //maps schreiben
        // // ExtensionMap
        // for (Iterator iter = impl.getExtensionMap().iterator();
        // iter.hasNext();) {
        // Extension aExtensionM = buildExtensionModelElement(entryList);
        // impl.addExtension( aExtensionM);
        // //Extension mobj = (Extension) iter.next();
        // //writeExtension(strB,mobj);
        // }
        // // IncludecontextMap
        // for (Iterator iter = impl.getIncludecontextMap().iterator();
        // iter.hasNext();) {
        // Includecontext aIncludecontextM =
        // buildIncludecontextModelElement(entryList);
        // impl.addIncludecontext( aIncludecontextM);
        // //Includecontext mobj = (Includecontext) iter.next();
        // //writeIncludecontext(strB,mobj);
        // }
        // // SwitchMap
        // for (Iterator iter = impl.getSwitchMap().iterator(); iter.hasNext();)
        // {
        // Switch aSwitchM = buildSwitchModelElement(entryList);
        // impl.addSwitch( aSwitchM);
        // //Switch mobj = (Switch) iter.next();
        // //writeSwitch(strB,mobj);
        // }
    }

    private Extension buildextension(Confvalue cv) {
        ExtensionImpl impl = new ExtensionImpl();
        Matcher matcher = extensionPattern.matcher(cv.content);
        if (matcher.find()) {
            String extension = matcher.group(1);
            String prio = matcher.group(2);
            String app = matcher.group(3);

            impl.setExten(extension);
            impl.setPriority(new Integer(prio));
            buildAppdata(impl, app);
        }
        // impl.setExten(cv.key);
        return impl;
    }

    private void buildAppdata(ExtensionImpl impl, String app) {
//        Parser p = new Parser(new Lexer(new PushbackReader(
//                new StringReader(app), 1024)));
//
//        // Parse the input.
//        Start tree;
//        try {
//            tree = p.parse();
//            // Apply the translation.
//            tree.apply(new Translation());
//            
//        } catch (ParserException e) {
//            // TODO Automatisch erstellter Catch-Block
//            e.printStackTrace();
//        } catch (LexerException e) {
//            // TODO Automatisch erstellter Catch-Block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Automatisch erstellter Catch-Block
//            e.printStackTrace();
//        }
        PbxApplication oapp = null;
        
       oapp = appFactory.createAppFromString(app.trim());
       impl.setApplication(oapp);
//       
//        Matcher matcher = applicationPattern.matcher(app);
//        if (matcher.find()) {
//            String appname = matcher.group(1);
//            String sep = matcher.group(2);
//            String para = matcher.group(3);
//            
//            //TODO : Application Factory einbinden
//            impl.setApplication(new PbxApplication(appname));
//            if (sep.equals("("))
//                para = "(" + para + ")";
//            else
//                para = "," + para;
//
//           // impl.setApplication_para(para);
//
//        } else // wir nehemen an der ganze string ist die applicatoion weill
//                // sie keine parameter erwartet
//        {
//            impl.setApplication(new PbxApplication(app));
//
//        }
    }

    private Includecontext buildincludeContext(Confvalue cv) {
        IncludecontextImpl ic = new IncludecontextImpl();
        Matcher matcher = includePattern.matcher(cv.content);
        if (matcher.find()) {
            String context = matcher.group(1);
            if (context == null)
                context = matcher.group(3);

            ic.setContexname(new PbxContext(context));
            if (matcher.group(2) != null)
                ic.setTimeing(matcher.group(2));
        }

        return ic;
    }

    private SwitchImpl buildSwitch(Confvalue cv) {
        SwitchImpl sw = new SwitchImpl();
        Matcher matcher = switchPattern.matcher(cv.content);
        if (matcher.find()) {
            String swname = matcher.group(1);
            sw.setSwitchdialstr(swname);
        }
        return sw;

    }

    @Override
    protected List getWorkingContextEntryList() {
        ArrayList list = new ArrayList();
        for (Iterator iter = headerList.iterator(); iter.hasNext();) {
            ConfSecHeader h = (ConfSecHeader) iter.next();
            if (!h.content.equals(GENERAL) && !h.content.equals(GLOBALVARS))
                list.add(h);
        }

        return list;

    }

    @Override
    protected List getWorkingExtensionconfEntryList() {
        ConfSecHeader sec = findConfHeader(GENERAL);
        if (sec == null)
            return null;
        return sec.val;
    }

    // @Override
    // protected List getWorkingGlobalvarsEntryList() {
    // ConfSecHeader sec = findConfHeader(GLOBALVARS);
    // if (sec == null)
    // return null;
    // return sec.val;
    // }
}
