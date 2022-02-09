package lesson26;

import lombok.SneakyThrows;
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

public class Runner {
    @SneakyThrows

    public static void main(String[] args) {
        String uriAddress = "https://www.cbr-xml-daily.ru/daily_utf8.xml";
        String valuteCode = "BYN";
        URLConnection urlConnection = getUrlConnection(uriAddress);
        System.out.println(extracted(urlConnection, valuteCode));
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

    private static URLConnection getUrlConnection(String str) throws URISyntaxException, IOException {
        URI uri = new URI(str);
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection;
    }

    private static Document getXML(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        return builder.parse(inputStream);
    }


    }