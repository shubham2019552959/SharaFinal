package com.microservice.orderservice.service;

import com.microservice.orderservice.domain.Order;

public interface OrderService {
    public Order saveOrder(Order order);
}
