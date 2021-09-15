package indiciumtech.caiorocha.northwind.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class OrderItemProcessor implements ItemProcessor<Order, Order> {

    private static final Logger log = LoggerFactory.getLogger(OrderItemProcessor.class);

    @Override
    public Order process(final Order order) throws Exception {
        final String id = order.getOrder_id();
        final String productId = order.getProduct_id();
        final String unitPrice = order.getUnit_price();
        final String quantity = order.getQuantity();
        final String discount = order.getDiscount();

        final Order transformedOrder = new Order(id, productId, unitPrice, quantity, discount);
        log.info("Converting (" + order + ") into (" + transformedOrder + ")");

        return transformedOrder;
    }
}
