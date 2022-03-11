package lesson33.pojo;


import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

@Component
public class ConnectionMaker {

    public URLConnection getConnection(String str) throws URISyntaxException, IOException {
        URI uri = new URI(str);
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection;
    }
}
