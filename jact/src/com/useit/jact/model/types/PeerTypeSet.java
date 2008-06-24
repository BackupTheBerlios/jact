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
 * PeerTypeSet,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: PeerTypeSet.java,v 1.6 2006/01/09 10:17:33
 *          urs Exp $
 */
public class PeerTypeSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = PeerType.ENAMES;

    /**  */
    public static final PeerType E_PEER = new PeerType("peer");

    /**  */
    public static final PeerType E_FRIEND = new PeerType("friend");

    /**  */
    public static final PeerType E_USER = new PeerType("user");

    /** alle statischen enums instancen in einem array * */
    public static final PeerType[] EINSTANCE = { E_PEER, E_FRIEND, E_USER };

    /**
     * @param type
     */
    public PeerTypeSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public PeerTypeSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public PeerTypeSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(PeerType en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new PeerType(ename));
    }

    public boolean remove(PeerType en) {
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
            add(new PeerType(ename));

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
        return new PeerTypeSet(name);
    }

}
