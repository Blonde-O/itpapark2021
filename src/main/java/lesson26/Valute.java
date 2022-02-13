package lesson26;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URLConnection;

@NoArgsConstructor
@Getter
@Setter
@Component
public class Valute {

    private final String URI_ADDRESS = "https://www.cbr-xml-daily.ru/daily_utf8.xml";
    @Autowired
    private ConnectionMaker connection;

    @SneakyThrows
    public BigDecimal getCurrentCourse(String str) {
        URLConnection urlConnection = connection.getConnection(URI_ADDRESS);
        BigDecimal value;
        try (InputStream inputStream = urlConnection.getInputStream()) {
            Document xmlDocument = getXML(inputStream);
            XPath xPath = XPathFactory.newInstance().newXPath();
            String val = (String) xPath.compile("/ValCurs/Valute[CharCode='" + str
                            + "']/Value/text()")
                    .evaluate(xmlDocument, XPathConstants.STRING);
            val = val.replace(",", ".");
            BigDecimal nominal = BigDecimal.valueOf((Double) xPath.compile("/ValCurs/Valute[CharCode='"
                            + str + "']/Nominal")
                    .evaluate(xmlDocument, XPathConstants.NUMBER));
            value = (new BigDecimal(val)).divide(nominal);
        }
        return value;
    }

    private Document getXML(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        return builder.parse(inputStream);
    }
}