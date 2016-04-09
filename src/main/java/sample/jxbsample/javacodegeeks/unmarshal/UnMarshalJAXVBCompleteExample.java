package sample.jxbsample.javacodegeeks.unmarshal;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import sample.jxbsample.javacodegeeks.beans.Countries;

/**
 * This class shows how to unmarshall a simple XML structure into java classes
 *
 * @author dgutierrez-diez
 */
public class UnMarshalJAXVBCompleteExample {

    public static void main(String[] args) {

        try {

            File file = new File("src/main/resources/jaxb/javacodegeeks/countries.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Countries.class);

            /**
             * the only difference with the marshaling operation is here
             */
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Countries countres = (Countries) jaxbUnmarshaller.unmarshal(file);
            System.out.println(countres);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
