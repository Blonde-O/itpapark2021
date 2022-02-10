package lesson26;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;


@Getter
@Setter
@NoArgsConstructor
public class ConnectionMaker {

    //private String uriAddress;
    private URLConnection urlConnection;


    public URLConnection getConnection(String str) throws URISyntaxException, IOException {
        URI uri = new URI(str);
        URL url = uri.toURL();
        urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection;
    }





}
