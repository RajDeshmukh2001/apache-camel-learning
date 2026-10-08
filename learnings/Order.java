import org.apache.camel.builder.RouteBuilder;

public class Order extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:order?repeatCount=1")
                .setBody()
                .simple("Laptop - Quantity: 1, Price: 50000")
                .setHeader("orderId")
                .constant("ORD-12345")
                .log("Processing order: ${header.orderId}")
                .log("Order details: ${body}");
    }
}
