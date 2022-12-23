package com.example.apache_camel_rest_api.spring_boot_rest_api.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.apache_camel_rest_api.spring_boot_rest_api.dtos.Order;
import com.example.apache_camel_rest_api.spring_boot_rest_api.resource.service.OrderService;

@Component
public class OrderProcessor implements Processor {

    @Autowired
	private OrderService service;

    @Override
    public void process(Exchange exchange) throws Exception {
        service.addOrder(exchange.getIn().getBody(Order.class));
    }
    
}
