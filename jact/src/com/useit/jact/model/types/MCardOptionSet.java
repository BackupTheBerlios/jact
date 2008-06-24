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
 * MCardOptionSet,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MCardOptionSet.java,v 1.6 2006/01/09 10:17:34
 *          urs Exp $
 */
public class MCardOptionSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = MCardOption.ENAMES;

    /**  */
    public static final MCardOption E_ULAW = new MCardOption("ulaw");

    /**  */
    public static final MCardOption E_PCM_SLAVE = new MCardOption("pcm_slave");

    /**  */
    public static final MCardOption E_DTMF = new MCardOption("dtmf");

    /** alle statischen enums instancen in einem array * */
    public static final MCardOption[] EINSTANCE = { E_ULAW, E_PCM_SLAVE, E_DTMF };

    /**
     * @param type
     */
    public MCardOptionSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public MCardOptionSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public MCardOptionSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(MCardOption en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new MCardOption(ename));
    }

    public boolean remove(MCardOption en) {
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
            add(new MCardOption(ename));

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
        return new MCardOptionSet(name);
    }

}
