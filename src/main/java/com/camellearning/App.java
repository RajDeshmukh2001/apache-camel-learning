package com.camellearning;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;

public class App {
    public static void main(String[] args) throws Exception {
        Main main = new Main();

        main.configure().addRoutesBuilder(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("timer:add?repeatCount=1")
                        .process(exchange -> {
                            int num1 = 10;
                            int num2 = 20;

                            int result = num1 + num2;

                            exchange.getMessage().setBody(result);
                        })
                        .log("Result: ${body}");
            }
        });

        main.run(args);
    }
}
