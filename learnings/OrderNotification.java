import org.apache.camel.builder.RouteBuilder;

public class OrderNotification extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:order?repeatCount=1")
                .setBody()
                .simple("Order ORD-1045 has been placed")
                .log("Order processed: ${body}")
                .to("seda:sendEmail");

        from("seda:sendEmail")
                .log("Sending confirmation email for: ${body}");
    }
}
