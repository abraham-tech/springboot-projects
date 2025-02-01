package net.javaguides.transactiondemo.service;

import net.javaguides.transactiondemo.dto.OrderRequest;
import net.javaguides.transactiondemo.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}

