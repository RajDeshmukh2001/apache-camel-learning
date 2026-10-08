import org.apache.camel.builder.RouteBuilder;

public class ProductSearch extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        rest("/products")
                .get()
                .to("direct:searchProducts");

        from("direct:searchProducts")
                .routeId("product-search")
                .setBody()
                .simple("""
                        [
                            {"id": 101, "name": "ThinkPad Laptop", "category": "laptop"},
                            {"id": 102, "name": "Dell Laptop", "category": "laptop"}
                        ]
                        """);
    }
}
