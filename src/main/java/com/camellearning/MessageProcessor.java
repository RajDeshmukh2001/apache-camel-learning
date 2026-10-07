package com.camellearning;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MessageProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getMessage().setBody("Learning route body + headers");

        exchange.getMessage().setHeader("name", "Raj");
        exchange.getMessage().setHeader("source", "MessageProcessor");
    }
}
