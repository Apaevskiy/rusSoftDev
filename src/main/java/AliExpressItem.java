import com.opencsv.bean.CsvBindByName;
import lombok.*;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
public class AliExpressItem {
    @CsvBindByName(column = "productId")
    private String productId;
    @CsvBindByName(column = "sellerId")
    private String sellerId;
    @CsvBindByName(column = "oriMinPrice")
    private String oriMinPrice;
    @CsvBindByName(column = "oriMaxPrice")
    private String oriMaxPrice;
    @CsvBindByName(column = "promotionId")
    private String promotionId;
    @CsvBindByName(column = "startTime")
    private String startTime;
    @CsvBindByName(column = "endTime")
    private String endTime;
    @CsvBindByName(column = "phase")
    private String phase;
    @CsvBindByName(column = "productTitle")
    private String productTitle;
    @CsvBindByName(column = "minPrice")
    private String minPrice;
    @CsvBindByName(column = "maxPrice")
    private String maxPrice;
    @CsvBindByName(column = "discount")
    private String discount;
    @CsvBindByName(column = "orders")
    private String orders;
    @CsvBindByName(column = "productImage")
    private String productImage;
    @CsvBindByName(column = "productDetailUrl")
    private String productDetailUrl;
    @CsvBindByName(column = "shopUrl")
    private String shopUrl;
    @CsvBindByName(column = "totalTranpro3")
    private String totalTranpro3;
    @CsvBindByName(column = "productPositiveRate")
    private String productPositiveRate;
    @CsvBindByName(column = "productAverageStar")
    private String productAverageStar;
    @CsvBindByName(column = "itemEvalTotalNum")
    private String itemEvalTotalNum;
}
