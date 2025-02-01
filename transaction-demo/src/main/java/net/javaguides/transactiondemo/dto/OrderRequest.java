package net.javaguides.transactiondemo.dto;

import lombok.Getter;
import lombok.Setter;
import net.javaguides.transactiondemo.entity.Order;
import net.javaguides.transactiondemo.entity.Payment;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}

