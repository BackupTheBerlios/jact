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
package com.useit.jact.model.managerconf;

// import com.beronet.App.CSS.db.ConnectionManager;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.useit.app.framework.model.modelHelper.AbstractObjectMap;

/**
 * <p>
 * PermitMap
 * </p>
 * Created : Wed Aug 17 01:27:26 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: PermitMap.java,v 1.5 2005/09/20 14:01:44 urs
 *          Exp $
 */
public class PermitMap extends AbstractObjectMap {
    // private Connection con;
    /** This is the Map of object. */
    protected Map itsMap;

    // --------------- Konstruktor ---------------------

    /**
     * einfacher Konstruktor für PermitMap
     */
    public PermitMap() {
        super();
        this.itsMap = new java.util.LinkedHashMap();
        // this.con = con;
    }

    /**
     * 
     * 
     * /** erzeugt ein neuen ${compositeDataType} und setzt die FKey id auf den
     * eigenen Primary Key, fügt das object nicht der Liste zu. weil der
     * Primaärschlüssel nicht gesetzt ist.
     * 
     * @return ${compositeDataType}
     */
    public Permit newPermit() {
        Permit nPermit = new PermitImpl();
        return nPermit;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.model.modelHelper.AbstractObjectMap#newObject()
     */
    public Object newObject() {
        Permit nPermit = new PermitImpl();
        return nPermit;
    }

    /**
     * gibt die Map zurück
     * 
     * @return Map
     */
    public Map getItsMap() {
        return itsMap;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.model.modelHelper.AbstractObjectMap#addObject(java.lang.Object)
     */
    public void addObject(Object object) {
        putPermit((Permit) object);

    }

    // --------------------- Map funktionalität

    /**
     * Removes all mappings from this map
     * 
     * @throws UnsupportedOperationException
     *             clear is not supported by this map.
     */
    public void clear() {
        this.itsMap.clear();
    }

    /**
     * Returns <tt>true</tt> if this map contains a mapping for the specified
     * key.
     * 
     * @param aKey
     *            key whose presence in this map is to be tested.
     * @return <tt>true</tt> if this map contains a mapping for the specified
     *         key.
     * 
     * @throws ClassCastException
     *             if the key is of an inappropriate type for this map.
     * @throws NullPointerException
     *             if the key is <tt>null</tt> and this map does not not
     *             permit <tt>null</tt> keys.
     */
    public boolean containsKey(String aKey) {
        return this.itsMap.containsKey(aKey);
    }

    /**
     * Returns <tt>true</tt> if this map maps one or more keys to the
     * specified value. More formally, returns <tt>true</tt> if and only if
     * this map contains at least one mapping to a value <tt>v</tt> such that
     * <tt>(value==null ? v==null : value.equals(v))</tt>. This operation
     * will probably require time linear in the map size for most
     * implementations of the <tt>Map</tt> interface.
     * 
     * @param aValue
     *            value whose presence in this map is to be tested.
     * @return <tt>true</tt> if this map maps one or more keys to the
     *         specified value.
     */
    public boolean containsValue(Integer aValue) {
        return this.itsMap.containsValue(aValue);
    }

    /**
     * Deletes the object
     * 
     * The object will become unuseable.
     */
    public void deleteMap() {
        this.itsMap.clear();
        this.itsMap = null;
    }

    /**
     * Returns a set view of the mappings contained in this map. Each element in
     * the returned set is a <tt>Map.Entry</tt>. The set is backed by the
     * map, so changes to the map are reflected in the set, and vice-versa. If
     * the map is modified while an iteration over the set is in progress, the
     * results of the iteration are undefined. The set supports element removal,
     * which removes the corresponding mapping from the map, via the
     * <tt>Iterator.remove</tt>, <tt>Set.remove</tt>, <tt>removeAll</tt>,
     * <tt>retainAll</tt> and <tt>clear</tt> operations. It does not support
     * the <tt>add</tt> or <tt>addAll</tt> operations.
     * 
     * @return a set view of the mappings contained in this map. This set is not
     *         typed
     */
    public Set entrySet() {
        return this.itsMap.entrySet();
    }

    /**
     * Compares the specified object with this map for equality. Returns
     * <tt>true</tt> if the given object is also a map and the two Maps
     * represent the same mappings. More formally, two maps <tt>t1</tt> and
     * <tt>t2</tt> represent the same mappings if
     * <tt>t1.entrySet().equals(t2.entrySet())</tt>. This ensures that the
     * <tt>equals</tt> method works properly across different implementations
     * of the <tt>Map</tt> interface.
     * 
     * @param anObject
     *            object to be compared for equality with this map.
     * @return <tt>true</tt> if the specified object is equal to this map.
     */
    public boolean equals(Object anObject) {
        if (anObject == null)
            return false;
        if (anObject == this)
            return true;
        if (anObject instanceof Map) {
            return this.itsMap.equals(anObject);
        }
        return false;
    }

    /**
     * Returns the value to which this map maps the specified key. Returns
     * <tt>null</tt> if the map contains no mapping for this key. A return
     * value of <tt>null</tt> does not <i>necessarily</i> indicate that the
     * map contains no mapping for the key; it's also possible that the map
     * explicitly maps the key to <tt>null</tt>. The <tt>containsKey</tt>
     * operation may be used to distinguish these two cases.
     * 
     * @param aKey
     *            key whose associated value is to be returned.
     * @return the value to which this map maps the specified key, or
     *         <tt>null</tt> if the map contains no mapping for this key. If
     *         there are basic types in the map, then the result will be <i>Type</i>.MAX_VALUE
     *         or <i>Type</i>.NaN or false.
     * 
     * @throws ClassCastException
     *             if the key is of an inappropriate type for this map.
     * @throws NullPointerException
     *             key is <tt>null</tt> and this map does not not permit
     *             <tt>null</tt> keys.
     */
    public Permit get(String aKey) {
        return (Permit) this.itsMap.get(aKey);
    }

    /**
     * Returns <tt>true</tt> if this map contains no key-value mappings
     * 
     * @return <tt>true</tt> if this map contains no key-value mappings.
     */
    public boolean isEmpty() {
        return this.itsMap.isEmpty();
    }

    /**
     * Returns a set view of the keys contained in this map. The set is backed
     * by the map, so changes to the map are reflected in the set, and
     * vice-versa. If the map is modified while an iteration over the set is in
     * progress, the results of the iteration are undefined. The set supports
     * element removal, which removes the corresponding mapping from the map,
     * via the <tt>Iterator.remove</tt>, <tt>Set.remove</tt>,
     * <tt>removeAll</tt> <tt>retainAll</tt>, and <tt>clear</tt>
     * operations. It does not support the add or <tt>addAll</tt> operations.
     * 
     * @return a set view of the keys contained in this map. This set is not
     *         typed
     */
    public Set keySet() {
        return this.itsMap.keySet();
    }

    /**
     * Associates the specified value with the specified key in this map
     * (optional operation). If the map previously contained a mapping for this
     * key, the old value is replaced.
     * 
     * @param aKey
     *            key with which the specified value is to be associated.
     * @param aValue
     *            value to be associated with the specified key.
     * @return previous value associated with specified key, or <tt>null</tt>
     *         if there was no mapping for key. A <tt>null</tt> return can
     *         also indicate that the map previously associated <tt>null</tt>
     *         with the specified key, if the implementation supports
     *         <tt>null</tt> values. If there are basic types in the map, then
     *         the result will be <i>Type</i>.MAX_VALUE or <i>Type</i>.NaN or
     *         false.
     * 
     * @throws UnsupportedOperationException
     *             if the <tt>put</tt> operation is not supported by this map.
     * @throws ClassCastException
     *             if the class of the specified key or value prevents it from
     *             being stored in this map.
     * @throws IllegalArgumentException
     *             if some aspect of this key or value prevents it from being
     *             stored in this map.
     * @throws NullPointerException
     *             this map does not permit <tt>null</tt> keys or values, and
     *             the specified key or value is <tt>null</tt>.
     */
    public Permit put(String aKey, Permit aValue) {
        return (Permit) this.itsMap.put(aKey, aValue);
    }

    /**
     * das selbe put ohne Key (wird automatisch gesetz)
     */
    public Permit putPermit(Permit aValue) {
        return (Permit) this.itsMap.put(aValue.getValue(), aValue);
    }

    /**
     * remove ohne Key (wird automatisch gesetz)
     */
    public Permit removePermit(Permit aValue) {
        return (Permit) this.itsMap.remove(aValue.getValue());
    }

    /**
     * Copies all of the mappings from the specified map to this map (optional
     * operation). These mappings will replace any mappings that this map had
     * for any of the keys currently in the specified map.
     * 
     * @param aMap
     *            Mappings to be stored in this map.
     * 
     * @throws UnsupportedOperationException
     *             if the <tt>putAll</tt> method is not supported by this map.
     * @throws ClassCastException
     *             if the class of a key or value in the specified map prevents
     *             it from being stored in this map.
     * @throws IllegalArgumentException
     *             some aspect of a key or value in the specified map prevents
     *             it from being stored in this map.
     * @throws NullPointerException
     *             this map does not permit <tt>null</tt> keys or values, and
     *             the specified key or value is <tt>null</tt>.
     */
    public void putAllPermit(Map aMap) {
        this.itsMap.putAll(aMap);
    }

    /**
     * Removes the mapping for this key from this map if present
     * 
     * @param aKey
     *            key whose mapping is to be removed from the map.
     * @return previous value associated with specified key, or <tt>null</tt>
     *         if there was no mapping for key. A <tt>null</tt> return can
     *         also indicate that the map previously associated <tt>null</tt>
     *         with the specified key, if the implementation supports
     *         <tt>null</tt> values. If there are basic types in the map, then
     *         the result will be <i>Type</i>.MAX_VALUE or <i>Type</i>.NaN or
     *         false.
     * @throws UnsupportedOperationException
     *             if the <tt>remove</tt> method is not supported by this map.
     */
    public Permit remove(String aKey) {
        return (Permit) this.itsMap.remove(aKey);
    }

    /**
     * Returns the number of key-value mappings in this map. If the map contains
     * more than <tt>String.MAX_VALUE</tt> elements, returns
     * <tt>String.MAX_VALUE</tt>.
     * 
     * @return the number of key-value mappings in this map.
     */
    public int size() {
        return this.itsMap.size();
    }

    /**
     * Returns a collection view of the values contained in this map. The
     * collection is backed by the map, so changes to the map are reflected in
     * the collection, and vice-versa. If the map is modified while an iteration
     * over the collection is in progress, the results of the iteration are
     * undefined. The collection supports element removal, which removes the
     * corresponding mapping from the map, via the <tt>Iterator.remove</tt>,
     * <tt>Collection.remove</tt>, <tt>removeAll</tt>, <tt>retainAll</tt>
     * and <tt>clear</tt> operations. It does not support the add or
     * <tt>addAll</tt> operations.
     * 
     * @return a collection view of the values contained in this map. This
     *         Collection is not typed
     */
    public Collection values() {
        return this.itsMap.values();
    }

}
