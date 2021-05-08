import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DocumentBuilderDemo {

   public static void main(String[] args) {

      // create a new DocumentBuilderFactory
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

      try {
         // use the factory to create a documentbuilder
         DocumentBuilder builder = factory.newDocumentBuilder();

         // create a new document from file
         File file = new File("Student.xml");
         Document doc = builder.parse(file);

         // get the first element
         Element element = doc.getDocumentElement();

         // get all child nodes
         NodeList nodes = element.getChildNodes();

         // print the text content of each child
         for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println("" + nodes.item(i).getTextContent());
         }
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}
