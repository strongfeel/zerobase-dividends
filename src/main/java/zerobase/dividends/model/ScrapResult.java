package zerobase.dividends.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ScrapResult {

    private Company company;

    private List<Dividend> dividendEntities;

    public void ScrapedResult() {
        this.dividendEntities = new ArrayList<>();
    }
}
