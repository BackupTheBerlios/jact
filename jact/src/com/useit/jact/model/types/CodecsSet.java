/*
 * (c) urs zeidler
 */
package com.useit.jact.model.types;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;

import com.useit.app.framework.model.types.AbstractSimpleEnum;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;

/**
 * <p>
 * CodecsSet,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: CodecsSet.java,v 1.6 2006/01/09 10:17:34 urs
 *          Exp $
 */
public class CodecsSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = Codecs.ENAMES;

    /**  */
    public static final Codecs E_ILBC = new Codecs("ilbc");

    /**  */
    public static final Codecs E_G723_1 = new Codecs("g723_1");

    /**  */
    public static final Codecs E_G729 = new Codecs("g729");

    /**  */
    public static final Codecs E_GSM = new Codecs("gsm");

    /**  */
    public static final Codecs E_SPEEX = new Codecs("speex");

    /**  */
    public static final Codecs E_ALAW = new Codecs("alaw");

    /**  */
    public static final Codecs E_ADPCM = new Codecs("adpcm");

    /**  */
    public static final Codecs E_ALL = new Codecs("all");

    /**  */
    public static final Codecs E_ULAW = new Codecs("ulaw");

    /**  */
    public static final Codecs E_LPC10 = new Codecs("lpc10");

    /**  */
    public static final Codecs E_SLIN = new Codecs("slin");

    /**  */
    public static final Codecs E_G726 = new Codecs("g726");

    /** alle statischen enums instancen in einem array * */
    public static final Codecs[] EINSTANCE = { E_ILBC, E_G723_1, E_G729, E_GSM,
            E_SPEEX, E_ALAW, E_ADPCM, E_ALL, E_ULAW, E_LPC10, E_SLIN, E_G726 };

    /**
     * @param type
     */
    public CodecsSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public CodecsSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public CodecsSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(Codecs en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new Codecs(ename));
    }

    public boolean remove(Codecs en) {
        return enumSet.remove(en);
    }

    /**
     * erzeugt das enum aus einer Array liste von enumnames
     * 
     * @param list
     */
    public void makeEnumSet(String[] list) {
        for (int i = 0; i < list.length; i++) {
            String ename = list[i];
            add(new Codecs(ename));

        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.model.types.AbstractSimpleEnum#getEnumList()
     */
    public String[] getEnumList() {

        return ENAMES;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.model.types.AbstractSimpleEnumSet#getEnumInstanceList()
     */
    public AbstractSimpleEnum[] getEnumInstanceList() {
        return EINSTANCE;
    }

    public Object nullSafeGet(ResultSet resultSet, String[] names, Object owner)
            throws HibernateException, SQLException {
        String name = resultSet.getString(names[0]);
        return new CodecsSet(name);
    }

}
