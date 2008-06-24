/*
 * (c) urs zeidler
 */
package com.useit.jact.model.globalmodel;

/**
 * <p>
 * ModelFactory, eine Fabrik für die Model instansen, die reale Fabrik muß
 * initalisiert werden (per getInstance() )befor das erste mal zugeriffen wird.
 * </p>
 * Created : Wed Dec 28 15:49:17 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ModelFactory.java,v 1.4 2005/12/30 20:27:53
 *          urs Exp $
 */

public class ModelFactory {

    protected static ModelFactory instance;

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public interface ModelSwitch {

    }

    public Object createfeatureconfModel() {
        return null;
    }

    public Object createqueueconfModel() {
        return null;
    }

    public Object createmanagerconfModel() {
        return null;
    }

    public Object createextensionconfModel() {
        return null;
    }

    public Object createmisdnconfModel() {
        return null;
    }

    public Object createsipconfModel() {
        return null;
    }

    public Object createindicationsconfModel() {
        return null;
    }

    public Object createagentconfModel() {
        return null;
    }

    public Object createvoicemailconfModel() {
        return null;
    }

    public Object createzapataconfModel() {
        return null;
    }

    public Object createalarmreciverconfModel() {
        return null;
    }

    public Object createmisdndriverconfModel() {
        return null;
    }

    public Object createmeetmeconfModel() {
        return null;
    }

    public Object createmusiconholdconfModel() {
        return null;
    }

    public Object createzaptelconfModel() {
        return null;
    }

    public Object createiaxconfModel() {
        return null;
    }

    public boolean isfeatureconfModel(Object obj) {
        return false;
    }

    public boolean isqueueconfModel(Object obj) {
        return false;
    }

    public boolean ismanagerconfModel(Object obj) {
        return false;
    }

    public boolean isextensionconfModel(Object obj) {
        return false;
    }

    public boolean ismisdnconfModel(Object obj) {
        return false;
    }

    public boolean issipconfModel(Object obj) {
        return false;
    }

    public boolean isindicationsconfModel(Object obj) {
        return false;
    }

    public boolean isagentconfModel(Object obj) {
        return false;
    }

    public boolean isvoicemailconfModel(Object obj) {
        return false;
    }

    public boolean iszapataconfModel(Object obj) {
        return false;
    }

    public boolean isalarmreciverconfModel(Object obj) {
        return false;
    }

    public boolean ismisdndriverconfModel(Object obj) {
        return false;
    }

    public boolean ismeetmeconfModel(Object obj) {
        return false;
    }

    public boolean ismusiconholdconfModel(Object obj) {
        return false;
    }

    public boolean iszaptelconfModel(Object obj) {
        return false;
    }

    public boolean isiaxconfModel(Object obj) {
        return false;
    }

}
