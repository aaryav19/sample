/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domsample.jenkov;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author kumar saurabh
 */
public class DomExampleMain {

    public static void main(String[] args) {

        DocumentBuilderFactory domBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder domBuilder = null;

        try {

            domBuilder = domBuilderFactory.newDocumentBuilder();

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DomExampleMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            Document documnet = domBuilder.parse(new File("src/main/resources/dom/book.xml"));
            Element element = documnet.getDocumentElement();
            System.out.println("Root Element------->" + element.getNodeName());

            NodeList nodeList = element.getElementsByTagName("ee");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("---->" + node.getNodeName());
                Element elmnt = (Element) node;
                System.out.println("---->" + elmnt.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("---->" + elmnt.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("---->" + elmnt.getElementsByTagName("ISBN").item(0).getTextContent());

            }
        } catch (SAXException ex) {
            Logger.getLogger(DomExampleMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DomExampleMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
