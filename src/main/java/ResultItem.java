import java.util.List;

public class ResultItem {
    private List<AliExpressItem> results;

    public ResultItem(List<AliExpressItem> results) {
        this.results = results;
    }

    public List<AliExpressItem> getResults() {
        return results;
    }

    public void setResults(List<AliExpressItem> results) {
        this.results = results;
    }
}
