import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvEditor {
    private StatefulBeanToCsv<AliExpressItem> beanWriter;

    public CsvEditor(String PATH_TO_FILE) {
        try {
            StatefulBeanToCsvBuilder<AliExpressItem> builder = new StatefulBeanToCsvBuilder<>(new FileWriter(PATH_TO_FILE));
            this.beanWriter = builder.build();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeToFile(List<AliExpressItem> items){
        try {
            beanWriter.write(items);
        } catch (CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        }
    }
}
