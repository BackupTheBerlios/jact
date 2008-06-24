/*
 * (c) urs zeidler
 */
package com.useit.jact.model.types;

public class AbstractExtension  {

    private String extension;

    public AbstractExtension(String string) {
        extension = string;
    }

    public AbstractExtension() {
        // TODO Automatisch erstellter Konstruktoren-Stub
    }

    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String toString() {
            StringBuffer buffer = new StringBuffer();
            buffer.append(extension);
            return buffer.toString();
        }

}
