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
 * SwitchtypeSet, Sets the type of PRI switch being used. Default: national.
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SwitchtypeSet.java,v 1.3 2006/01/09 10:17:33
 *          urs Exp $
 */
public class SwitchtypeSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = Switchtype.ENAMES;

    /**  */
    public static final Switchtype E_NATIONAL = new Switchtype("national");

    /**  */
    public static final Switchtype E_EUROISDN = new Switchtype("euroisdn");

    /**  */
    public static final Switchtype E_NI1 = new Switchtype("ni1");

    /**  */
    public static final Switchtype E_5ESS = new Switchtype("5ess");

    /**  */
    public static final Switchtype E_DMS100 = new Switchtype("dms100");

    /**  */
    public static final Switchtype E_4ESS = new Switchtype("4ess");

    /**  */
    public static final Switchtype E_QSIG = new Switchtype("qsig");

    /** alle statischen enums instancen in einem array * */
    public static final Switchtype[] EINSTANCE = { E_NATIONAL, E_EUROISDN,
            E_NI1, E_5ESS, E_DMS100, E_4ESS, E_QSIG };

    /**
     * @param type
     */
    public SwitchtypeSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public SwitchtypeSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public SwitchtypeSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(Switchtype en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new Switchtype(ename));
    }

    public boolean remove(Switchtype en) {
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
            add(new Switchtype(ename));

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
        return new SwitchtypeSet(name);
    }

}
