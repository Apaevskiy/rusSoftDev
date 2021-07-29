import java.util.Date;
import java.util.List;

public class Main {
    private static final String PATH_TO_FILE = "data.csv";
    private static int NUMBER = 100;

    public static void main(String[] args) {
        long m = System.currentTimeMillis();
        ParsingHtml parsingHtml = new ParsingHtml("https://flashdeals.aliexpress.com/en.htm?");
        CsvEditor editor = new CsvEditor(PATH_TO_FILE);

        int i = 0;
        while (NUMBER > 0) {
            List<AliExpressItem> list = parsingHtml.getList(i++);
            editor.writeToFile(list);
            NUMBER -= list.size();
        }
        System.out.println((double) (System.currentTimeMillis() - m));
    }
}
