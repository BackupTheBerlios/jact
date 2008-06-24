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
 * AmaflagsSet, Sets the AMA flags, affecting the categorization of entries in
 * the call detail records.
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AmaflagsSet.java,v 1.3 2006/01/09 10:17:33
 *          urs Exp $
 */
public class AmaflagsSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = Amaflags.ENAMES;

    /**  */
    public static final Amaflags E_DOCUMENTATION = new Amaflags("documentation");

    /**  */
    public static final Amaflags E_OMIT = new Amaflags("omit");

    /**  */
    public static final Amaflags E_BILLING = new Amaflags("billing");

    /**  */
    public static final Amaflags E_DEFAULT = new Amaflags("default");

    /** alle statischen enums instancen in einem array * */
    public static final Amaflags[] EINSTANCE = { E_DOCUMENTATION, E_OMIT,
            E_BILLING, E_DEFAULT };

    /**
     * @param type
     */
    public AmaflagsSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public AmaflagsSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public AmaflagsSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(Amaflags en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new Amaflags(ename));
    }

    public boolean remove(Amaflags en) {
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
            add(new Amaflags(ename));

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
        return new AmaflagsSet(name);
    }

 
}
