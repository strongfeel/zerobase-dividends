package zerobase.dividends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zerobase.dividends.model.Company;
import zerobase.dividends.scraper.Scraper;
import zerobase.dividends.scraper.YahooFinanceScraper;

@SpringBootApplication
public class DividendsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DividendsApplication.class, args);
    }
}
