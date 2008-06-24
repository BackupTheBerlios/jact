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
 * MisdnPortOptionsSet, Port betriebsarten
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnPortOptionsSet.java,v 1.6 2006/01/09
 *          10:17:34 urs Exp $
 */
public class MisdnPortOptionsSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = MisdnPortOptions.ENAMES;

    /**  */
    public static final MisdnPortOptions E_TE_PTP = new MisdnPortOptions(
            "te_ptp");

    /**  */
    public static final MisdnPortOptions E_NT_PTP = new MisdnPortOptions(
            "nt_ptp");

    /**  */
    public static final MisdnPortOptions E_TE_PTMP = new MisdnPortOptions(
            "te_ptmp");

    /**  */
    public static final MisdnPortOptions E_NT_PTMP = new MisdnPortOptions(
            "nt_ptmp");

    /** alle statischen enums instancen in einem array * */
    public static final MisdnPortOptions[] EINSTANCE = { E_TE_PTP, E_NT_PTP,
            E_TE_PTMP, E_NT_PTMP };

    /**
     * @param type
     */
    public MisdnPortOptionsSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public MisdnPortOptionsSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public MisdnPortOptionsSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(MisdnPortOptions en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new MisdnPortOptions(ename));
    }

    public boolean remove(MisdnPortOptions en) {
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
            add(new MisdnPortOptions(ename));

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
        return new MisdnPortOptionsSet(name);
    }

}
