import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class ScanDir {

    private String directory;
    private String extension;

    private ScanDir(String directory, String extension) {
        this.directory = directory;
        this.extension = extension;
    }

    public ScanDir() {}

    private static ScanDir create(String xmlConf) throws Exception{
        //String directory = element.getElementsByTagName("directory").item(0).getTextContent();
        //"/home/hillel/IdeaProjects/hi/src/main/java/conf.xml"

        File inputFile = new File(xmlConf);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        String extension = null;
        String directory = null;
        NodeList directory1 = doc.getElementsByTagName("configuration");
        Node configuration = directory1.item(0);
        for (int i = 0; i < configuration.getChildNodes().getLength(); i++) {
            Node node = configuration.getChildNodes().item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && "directory".equals(node.getNodeName())){
                directory = node.getTextContent();

            }
            if (node.getNodeType() == Node.ELEMENT_NODE && "extension".equals(node.getNodeName())){
                extension = node.getTextContent();
            }
        }
        return new ScanDir(directory, extension);
    }

    public static ScanDir create() {return null;}


    public static void main(String[] args) {

        try {
            ScanDir scanDir = ScanDir.create("/home/hillel/IdeaProjects/hi/src/main/java/conf.xml");
            System.out.println(scanDir.extension);
            System.out.println(scanDir.directory);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
