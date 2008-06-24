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
 * DtmfmodeSet,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DtmfmodeSet.java,v 1.6 2006/01/09 10:17:34
 *          urs Exp $
 */
public class DtmfmodeSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = Dtmfmode.ENAMES;

    /**  */
    public static final Dtmfmode E_RFC2833 = new Dtmfmode("rfc2833");

    /**  */
    public static final Dtmfmode E_INBAND = new Dtmfmode("inband");

    /**  */
    public static final Dtmfmode E_INFO = new Dtmfmode("info");

    /** alle statischen enums instancen in einem array * */
    public static final Dtmfmode[] EINSTANCE = { E_RFC2833, E_INBAND, E_INFO };

    /**
     * @param type
     */
    public DtmfmodeSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public DtmfmodeSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public DtmfmodeSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(Dtmfmode en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new Dtmfmode(ename));
    }

    public boolean remove(Dtmfmode en) {
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
            add(new Dtmfmode(ename));

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
        return new DtmfmodeSet(name);
    }

}
