package pl.sgorski.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class WebFetcher {
    private String website = "gordion.margonem.pl";

    private Document getDoc(){
        Document doc;
        try{
            doc = Jsoup.connect(website).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return doc;
    }
}
