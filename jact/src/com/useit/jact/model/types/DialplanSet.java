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
 * DialplanSet,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DialplanSet.java,v 1.6 2006/01/09 10:17:34
 *          urs Exp $
 */
public class DialplanSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = Dialplan.ENAMES;

    /**  */
    public static final Dialplan E_NATIONAL = new Dialplan("national");

    /**  */
    public static final Dialplan E_UNKNOWN = new Dialplan("unknown");

    /**  */
    public static final Dialplan E_SUBSCRIBER = new Dialplan("subscriber");

    /**  */
    public static final Dialplan E_INTERNATIONAL = new Dialplan("international");

    /** alle statischen enums instancen in einem array * */
    public static final Dialplan[] EINSTANCE = { E_NATIONAL, E_UNKNOWN,
            E_SUBSCRIBER, E_INTERNATIONAL };

    /**
     * @param type
     */
    public DialplanSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public DialplanSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public DialplanSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(Dialplan en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new Dialplan(ename));
    }

    public boolean remove(Dialplan en) {
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
            add(new Dialplan(ename));

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
        return new DialplanSet(name);
    }

}
