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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}

