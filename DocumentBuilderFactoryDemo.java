
import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactoryDemo {

   public static void main(String[] args) {

      // create a new DocumentBuilderFactory
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

      // change this configuration
      factory.setXIncludeAware(true);

      // check if factory is XInclude processing
      System.out.println("" + factory.isXIncludeAware());
   }
}
