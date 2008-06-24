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
 * PresentationSet,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: PresentationSet.java,v 1.6 2006/01/09
 *          10:17:34 urs Exp $
 */
public class PresentationSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = Presentation.ENAMES;

    /**  */
    public static final Presentation E_ALLOWED = new Presentation("allowed");

    /**  */
    public static final Presentation E_NOT_SCREENED = new Presentation(
            "not_screened");

    /** alle statischen enums instancen in einem array * */
    public static final Presentation[] EINSTANCE = { E_ALLOWED, E_NOT_SCREENED };

    /**
     * @param type
     */
    public PresentationSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public PresentationSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public PresentationSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(Presentation en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new Presentation(ename));
    }

    public boolean remove(Presentation en) {
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
            add(new Presentation(ename));

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
        return new PresentationSet(name);
    }

}
