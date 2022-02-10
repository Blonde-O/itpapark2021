package lesson26.attempt;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
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
import java.net.URLConnection;

@NoArgsConstructor
@Getter
@Setter
@Component
public class Valute {

    private ConnectionMaker connection;
    private String valuteName;
    private double value;
    private String uriAddress;

    @SneakyThrows
    public void getCurrentCourse() {
        URLConnection urlConnection = connection.getConnection(uriAddress);
        try (InputStream inputStream = urlConnection.getInputStream()) {
            Document xmlDocument = getXML(inputStream);
            XPath xPath = XPathFactory.newInstance().newXPath();
            String avg = (String) xPath.compile("/ValCurs/Valute[CharCode='" + this.valuteName + "']/Value/text()")
                    .evaluate(xmlDocument, XPathConstants.STRING);
            avg = avg.replace(",", ".");
            double nominal = (Double) xPath.compile("/ValCurs/Valute[CharCode='" + this.valuteName + "']/Nominal")
                    .evaluate(xmlDocument, XPathConstants.NUMBER);
            this.value = Double.parseDouble(avg) / nominal;
        }

    }

    private Document getXML(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        return builder.parse(inputStream);
    }
}
