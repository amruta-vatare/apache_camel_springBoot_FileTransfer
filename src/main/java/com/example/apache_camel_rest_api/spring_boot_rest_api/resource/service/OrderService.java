package com.example.apache_camel_rest_api.spring_boot_rest_api.resource.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.apache_camel_rest_api.spring_boot_rest_api.dtos.Order;

@Service
public class OrderService {
    private List<Order> list = new ArrayList<>();

    @PostConstruct
    public void initDB(){
        list.add(new Order(67, "Mobile", 5000));
		list.add(new Order(89, "Book", 400));
		list.add(new Order(45, "AC", 15000));
		list.add(new Order(67, "Shoes", 4000));
    }

    public Order addOrder(Order order) {
		list.add(order);
		return order;
	}

	public List<Order> getOrders() {
		return list;
	}
}
