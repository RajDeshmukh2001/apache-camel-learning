import org.apache.camel.builder.RouteBuilder;

public class DeliveryCharge extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:order?repeatCount=1")
            .setBody()
                .constant(1500)
            .setVariable("deliveryCharge")
                .constant(100)
            .log("Order Amount: ${body}")
            .log("Delivery charge: ${variable.deliveryCharge}")
            .log("Total Amount: ${sum(${body},${variable.deliveryCharge})}");
    }
}
