package lesson26;

import lombok.SneakyThrows;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class Runner {
    @SneakyThrows
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        URI uri = new URI("https://www.cbr.ru/scripts/XML_daily.asp?date_req=01/01/2022");
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        int character;
        try (InputStreamReader sr = new InputStreamReader(urlConnection.getInputStream(), StandardCharsets.UTF_8)
        ) {
            while ((character = sr.read()) != -1) {
                sb.append((char) character);
            }

        System.out.println(sb.toString());
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document xmlDocument = builder.parse(urlConnection.getInputStream());
        XPath xPath = XPathFactory.newInstance().newXPath();
        double value = (double) xPath.compile("//VAlCurs/Valute[CharCode='USD']/Value/text()")
                .evaluate(xmlDocument, XPathConstants.NUMBER);
        System.out.println(value);
    }


    }

}
