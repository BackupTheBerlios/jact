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
 * MisdnCardTypesSet, Kartentypen
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCardTypesSet.java,v 1.6 2006/01/09
 *          10:17:34 urs Exp $
 */
public class MisdnCardTypesSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = MisdnCardTypes.ENAMES;

    /**  */
    public static final MisdnCardTypes E_HFPCI = new MisdnCardTypes("hfpci");

    /**  */
    public static final MisdnCardTypes E_AVMFRITZ = new MisdnCardTypes(
            "avmfritz");

    /**  */
    public static final MisdnCardTypes E_HFCMULTI4S0 = new MisdnCardTypes(
            "hfcmulti4s0");

    /**  */
    public static final MisdnCardTypes E_HFCMULTI = new MisdnCardTypes(
            "hfcmulti");

    /**  */
    public static final MisdnCardTypes E_HFCMULTI8S0 = new MisdnCardTypes(
            "hfcmulti8s0");

    /** alle statischen enums instancen in einem array * */
    public static final MisdnCardTypes[] EINSTANCE = { E_HFPCI, E_AVMFRITZ,
            E_HFCMULTI4S0, E_HFCMULTI, E_HFCMULTI8S0 };

    /**
     * @param type
     */
    public MisdnCardTypesSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public MisdnCardTypesSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public MisdnCardTypesSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(MisdnCardTypes en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new MisdnCardTypes(ename));
    }

    public boolean remove(MisdnCardTypes en) {
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
            add(new MisdnCardTypes(ename));

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
        return new MisdnCardTypesSet(name);
    }

}
