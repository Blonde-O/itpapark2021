package lesson26;

import lombok.SneakyThrows;
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
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class Runner {
    @SneakyThrows
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        URI uri = new URI("https://www.cbr-xml-daily.ru/daily_utf8.xml");
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
       /* int character;
        try (InputStreamReader sr = new InputStreamReader(urlConnection.getInputStream(), StandardCharsets.UTF_8)
        ) {
            while ((character = sr.read()) != -1) {
                sb.append((char) character);
            }

        System.out.println(sb.toString());
           /* InputStream is= urlConnection.getInputStream();
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document xmlDocument = builder.parse(is);
        XPath xPath = XPathFactory.newInstance().newXPath();
        double value = (double) xPath.compile("//VAlCurs/Valute[CharCode='USD']/Value/text()")
                .evaluate(xmlDocument, XPathConstants.NUMBER);
        System.out.println(value);
    }*/
        try (InputStream inputStream = urlConnection.getInputStream()) {

            Document xmlDocument = getXML(inputStream);
            XPath xPath = XPathFactory.newInstance().newXPath();
            String avg = (String) xPath.compile("/ValCurs/Valute[Name='Венгерских форинтов']/Value/text()")
                    .evaluate(xmlDocument, XPathConstants.STRING);
            avg = avg.replace(",", ".");
            double nominal = (Double) xPath.compile("/ValCurs/Valute[Name='Венгерских форинтов']/Nominal")
                    .evaluate(xmlDocument, XPathConstants.NUMBER);
            double avvg = Double.parseDouble(avg)/nominal;
            System.out.println(avvg);
        }
    }

    private static Document getXML(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        return builder.parse(inputStream);
    }


    }