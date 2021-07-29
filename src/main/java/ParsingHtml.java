import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ParsingHtml {

    private final String widgetId;
    private String postBack = "";

    public ParsingHtml(String URL) {
        String widgetId;
        try {
            Document doc = Jsoup.connect(URL).userAgent("Chrome/4.0.249.0 Safari/532.5").get();
            widgetId = doc.select("span:contains(Picked For You)").first().parent().parent().attr("data-widgetid");
        } catch (IOException e) {
            e.printStackTrace();
            widgetId = null;
        }
        this.widgetId = widgetId;
    }

    public List<AliExpressItem> getList(int numberPage) {
        try {
            String data = Jsoup.connect("https://gpsfront.aliexpress.com/getRecommendingResults.do?widget_id=" + widgetId + "&limit=12&offset=" + numberPage * 12 + "&postback=" + postBack)
                    .ignoreContentType(true).execute().body();
            Gson g = new Gson();
            if (postBack.equals("")) {
                Map jsonMap = g.fromJson(data, Map.class);
                postBack = jsonMap.get("postback").toString();
            }
            ResultItem person = g.fromJson(data, ResultItem.class);
            return person.getResults();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
