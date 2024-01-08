package zerobase.dividends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zerobase.dividends.model.Company;
import zerobase.dividends.scraper.YahooFinanceScraper;

//@SpringBootApplication
public class DividendsApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DividendsApplication.class, args);

        YahooFinanceScraper scraper = new YahooFinanceScraper();
        var result = scraper.scrap(Company.builder().ticker("O").build());
        System.out.println(result);

    }
}
