package lesson26;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class AnotherRunner {
    @SneakyThrows
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext lesson26 = new AnnotationConfigApplicationContext("lesson26");
        final Valute valute= lesson26.getBean(Valute.class);

        valute.setUriAddress("https://www.cbr-xml-daily.ru/daily_utf8.xml");
        valute.setValuteName("BYN");
        valute.getCurrentCourse();
        System.out.println(valute.getValue());

        /*String uriAddress = "https://www.cbr-xml-daily.ru/daily_utf8.xml";
        final AnnotationConfigApplicationContext lesson26 = new AnnotationConfigApplicationContext("lesson26");
        final ConnectionMaker cm = lesson26.getBean(ConnectionMaker.class);
        cm.setUriAddress(uriAddress);
        URLConnection urlConnection = cm.getConnection();
        System.out.println(extracted(urlConnection, "UZS"));

    }
    private static double extracted(URLConnection urlConnection, String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        double avvg;
        try (InputStream inputStream = urlConnection.getInputStream()) {

            Document xmlDocument = getXML(inputStream);
            XPath xPath = XPathFactory.newInstance().newXPath();
            String avg = (String) xPath.compile("/ValCurs/Valute[CharCode='"+valute+"']/Value/text()")
                    .evaluate(xmlDocument, XPathConstants.STRING);
            avg = avg.replace(",", ".");
            double nominal = (Double) xPath.compile("/ValCurs/Valute[CharCode='"+valute+"']/Nominal")
                    .evaluate(xmlDocument, XPathConstants.NUMBER);
            avvg = Double.parseDouble(avg)/nominal;
        }
        return avvg;
    }

    private static Document getXML(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        return builder.parse(inputStream);
    }*/
    }
}
