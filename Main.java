import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            FarmerSaxHandler handler = new FarmerSaxHandler();
            parser.parse("https://sc.opendata.az/file/482",handler);

            writer = new BufferedWriter(new FileWriter("farmer.txt"));
            writer.write(handler.getFarmerList() + System.lineSeparator());
            List<Farmer> farmers = handler.getFarmerList();
            for (Farmer farmer: farmers){
                writer.write(farmer + System.lineSeparator());
            }



        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
