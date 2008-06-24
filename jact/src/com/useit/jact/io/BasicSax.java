/*
 * (c) urs zeidler
 */
package com.useit.jact.io;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * <p>
 * BasicSax
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: BasicSax.java,v 1.3 2005/09/15 13:12:44 urs
 *          Exp $
 */
public class BasicSax {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(BasicSax.class);

    public static Document createDomDocument() {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder();
            Document doc = builder.newDocument();
            return doc;
        } catch (ParserConfigurationException e) {
            LOGGER.error("createDomDocument()", e);
        }
        return null;
    }

    // This method writes a DOM document to a file
    public static void writeXmlFile(Document doc, String filename) {
        try {
            // Prepare the DOM document for writing
            Source source = new DOMSource(doc);

            // Prepare the output file
            File file = new File(filename);
            Result result = new StreamResult(file);

            // Write the DOM document to the file
            Transformer xformer = TransformerFactory.newInstance()
                    .newTransformer();
            xformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            LOGGER.error("writeXmlFile(Document doc = " + doc
                    + ", String filename = " + filename + ")", e);
        } catch (TransformerException e) {
            LOGGER.error("writeXmlFile(Document doc = " + doc
                    + ", String filename = " + filename + ")", e);
        }
    }

    // Parses an XML file using a SAX parser.
    // If validating is true, the contents is validated against the DTD
    // specified in the file.
    public static void parseXmlFile(String filename, DefaultHandler handler,
            boolean validating) {
        try {

            // Create a builder factory
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setValidating(validating);
            File file = new File(filename);
            // Create the builder and parse the file
            factory.newSAXParser().parse(file, handler);
        } catch (SAXException e) {
            LOGGER.error("parseXmlFile(filename = " + filename + ")", e);

            // A parsing error occurred; the xml input is not valid
        } catch (ParserConfigurationException e) {
            LOGGER.error("parseXmlFile(String filename = " + filename
                    + ", DefaultHandler handler = " + handler
                    + ", boolean validating = " + validating + ")", e);

        } catch (IOException e) {
            LOGGER.error("parseXmlFile(String filename = " + filename
                    + ", DefaultHandler handler = " + handler
                    + ", boolean validating = " + validating + ")", e);
        }
    }
}