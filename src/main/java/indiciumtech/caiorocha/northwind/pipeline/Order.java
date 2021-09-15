package indiciumtech.caiorocha.northwind.pipeline;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private String order_id;
    private String product_id;
    private String unit_price;
    private String quantity;
    private String discount;
}
