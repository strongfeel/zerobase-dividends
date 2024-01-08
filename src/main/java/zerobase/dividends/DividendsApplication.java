package zerobase.dividends;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DividendsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DividendsApplication.class, args);

        try {
            Connection connection = Jsoup.connect("https://finance.yahoo.com/quote/COKE/history?period1=1673122044&period2=1704658044&interval=1mo&filter=history&frequency=1mo&includeAdjustedClose=true");
            Document document = connection.get();

            Elements eles = document.getElementsByAttributeValue("data-test", "historical-prices");
            Element ele = eles.get(0);

            Element tbody = ele.children().get(1);

            System.out.println(ele);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
