/*
 * (c) urs zeidler
 */
package com.useit.jact.model.extensionconf;

import junit.framework.TestCase;

public class ModelFactoryextensionconfTest extends TestCase {

    /*
     * Methode für 'com.useit.jact.model.extensionconf.ModelFactoryextensionconf.createModelElement(String)' testen
     */
    public void testCreateModelElementString() {
        ModelFactoryextensionconfImpl f = new ModelFactoryextensionconfImpl();
        Object object = f.createModelElement(IExtension.class);
        assertNotNull(object);
        object = f.createModelElement(Extension.class);
        assertNotNull(object);
        
    }

    /*
     * Methode für 'com.useit.jact.model.extensionconf.ModelFactoryextensionconf.createModelElement(Class)' testen
     */
    public void testCreateModelElementClass() {

    }

    /*
     * Methode für 'com.useit.jact.model.extensionconf.ModelFactoryextensionconf.isAdapterFor(Class, Object)' testen
     */
    public void testIsAdapterFor() {

    }

    /*
     * Methode für 'com.useit.jact.model.extensionconf.ModelFactoryextensionconf.getAdapter(Class)' testen
     */
    public void testGetAdapter() {

    }

}
