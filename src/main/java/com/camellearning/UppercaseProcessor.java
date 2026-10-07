package com.camellearning;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class UppercaseProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String body = exchange.getMessage().getBody(String.class);

        exchange.getMessage().setBody(body.toUpperCase());
    }
}
