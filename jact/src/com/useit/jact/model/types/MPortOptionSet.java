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
 * MPortOptionSet,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MPortOptionSet.java,v 1.6 2006/01/09 10:17:34
 *          urs Exp $
 */
public class MPortOptionSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = MPortOption.ENAMES;

    /**  */
    public static final MPortOption E_LOS = new MPortOption("los");

    /**  */
    public static final MPortOption E_AIS = new MPortOption("ais");

    /**  */
    public static final MPortOption E_MASTER_CLOCK = new MPortOption(
            "master_clock");

    /**  */
    public static final MPortOption E_SLIP = new MPortOption("slip");

    /**  */
    public static final MPortOption E_OPTICAL = new MPortOption("optical");

    /** alle statischen enums instancen in einem array * */
    public static final MPortOption[] EINSTANCE = { E_LOS, E_AIS,
            E_MASTER_CLOCK, E_SLIP, E_OPTICAL };

    /**
     * @param type
     */
    public MPortOptionSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public MPortOptionSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public MPortOptionSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(MPortOption en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new MPortOption(ename));
    }

    public boolean remove(MPortOption en) {
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
            add(new MPortOption(ename));

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
        return new MPortOptionSet(name);
    }

}
