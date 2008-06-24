/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
/*
 * (c) urs zeidler
 */
package com.useit.jact.model.types;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.HibernateException;
import org.hibernate.usertype.UserType;

/**
 * <p>
 * PbxContext
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: PbxContext.java,v 1.6 2006/01/06 19:04:05 urs
 *          Exp $
 */
public class PbxContext implements Serializable, UserType {
    protected String context;

    private static List<PbxContext> definedContexte = new ArrayList<PbxContext>();

    /**
     * 
     */
    public PbxContext() {
        super();
        // this.context = context;
        // add(this);
    }

    /**
     * 
     */
    public PbxContext(String context) {
        super();
        this.context = context;
        add(this);
    }

    /* (Kein Javadoc)
     * @see com.useit.jact.model.types.Ipbxcontext#getContext()
     */
    public String getContext() {
        return this.context;
    }

    /* (Kein Javadoc)
     * @see com.useit.jact.model.types.Ipbxcontext#setContext(java.lang.String)
     */
    public void setContext(String context) {
        this.context = context;
        add(this);
    }

    public String toString() {

        return context;
    }

    /**
     * Returns <code>true</code> if this <code>PbxContext</code> is the same
     * as the o argument.
     * 
     * @return <code>true</code> if this <code>PbxContext</code> is the same
     *         as the o argument.
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != getClass()) {
            return false;
        }
        PbxContext castedObj = (PbxContext) o;
        return ((this.context == null ? castedObj.context == null
                : this.context.equals(castedObj.context)));
    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.util.List#add(E)
     */
    public boolean add(PbxContext o) {
        if (definedContexte.contains(o))
            return false;
        return PbxContext.definedContexte.add(o);
    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.util.List#clear()
     */
    public void clear() {
        PbxContext.definedContexte.clear();
    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.util.List#get(int)
     */
    public PbxContext get(int index) {
        return PbxContext.definedContexte.get(index);
    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.util.List#iterator()
     */
    public Iterator<PbxContext> iterator() {
        return PbxContext.definedContexte.iterator();
    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.util.List#listIterator()
     */
    public ListIterator<PbxContext> listIterator() {
        return PbxContext.definedContexte.listIterator();
    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.util.List#remove(int)
     */
    public PbxContext remove(int index) {
        return PbxContext.definedContexte.remove(index);
    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.util.List#remove(java.lang.Object)
     */
    public boolean remove(Object o) {
        return PbxContext.definedContexte.remove(o);
    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.util.List#size()
     */
    public int size() {
        return PbxContext.definedContexte.size();
    }

    private static final int[] SQL_TYPES = { Types.VARCHAR };

    public int[] sqlTypes() {
        return SQL_TYPES;
    }

    public Object nullSafeGet(ResultSet resultSet, String[] names, Object owner)
            throws HibernateException, SQLException {
        String name = resultSet.getString(names[0]);
        return new PbxContext(name);
    }

    public void nullSafeSet(PreparedStatement preparedStatement, Object value,
            int index) throws HibernateException, SQLException {
        if (null == value) {
            preparedStatement.setNull(index, Types.VARCHAR);
        } else {
            preparedStatement.setString(index, ((PbxContext) value).context);
        }
    }

    public Object deepCopy(Object value) throws HibernateException {
        return value;
    }

    public boolean isMutable() {
        return false;
    }

    public Object assemble(Serializable cached, Object owner)
            throws HibernateException {
        return cached;
    }

    public Serializable disassemble(Object value) throws HibernateException {
        return (Serializable) value;
    }

    public Object replace(Object original, Object target, Object owner)
            throws HibernateException {
        return original;
    }

    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    public boolean equals(Object x, Object y) throws HibernateException {
        if (x == y)
            return true;
        if (null == x || null == y)
            return false;
        return x.equals(y);
    }

    public Class returnedClass() {
        return getClass();
    }
}
