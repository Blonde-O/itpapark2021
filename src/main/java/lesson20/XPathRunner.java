package lesson20;

import lombok.SneakyThrows;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XPathRunner {
    public static void main(String[] args) throws Exception {

        try (InputStream inputStream = XPathRunner.class.getResourceAsStream("/employee.xml")) {
            Document xmlDocument = getXML(inputStream);
            XPath xPath = XPathFactory.newInstance().newXPath();
            double avg = (Double) xPath.compile("sum(//employee/postAndSalary/salary) div count(//employee/postAndSalary/salary)")
                    .evaluate(xmlDocument, XPathConstants.NUMBER);
            System.out.println("Среднее значение заработной платы: " + avg);
            List<String> names = getDevelopersWithSalary(xmlDocument, xPath, avg);
            System.out.println("ФИО работников с зп выше средней" + names);
        }
    }

    private static Document getXML(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        return builder.parse(inputStream);
    }

    //https://javadevblog.com/primer-raboty-s-xpath-v-java-poisk-v-xml-i-vy-borka-danny-h.html
    @SneakyThrows
    private static List<String> getDevelopersWithSalary(Document doc, XPath xpath, double avgSalary) {
        List<String> list = new ArrayList<>();
        // получаем список всех узлов, которые отвечают условию
        //https://howtodoinjava.com/java/xml/java-xpath-expression-examples/
        XPathExpression xPathExpression = xpath.compile(
                "//employee[postAndSalary/salary>" + avgSalary + "]/fio/text()"
        );
        NodeList nodeList = (NodeList) xPathExpression.evaluate(doc, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            list.add(nodeList.item(i).getNodeValue());
        }
        return list;
    }
}
