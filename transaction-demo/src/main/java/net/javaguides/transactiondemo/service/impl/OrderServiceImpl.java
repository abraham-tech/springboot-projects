package net.javaguides.transactiondemo.service.impl;

import jakarta.transaction.Transactional;
import net.javaguides.transactiondemo.dto.OrderRequest;
import net.javaguides.transactiondemo.dto.OrderResponse;
import net.javaguides.transactiondemo.entity.Order;
import net.javaguides.transactiondemo.entity.Payment;
import net.javaguides.transactiondemo.exception.PaymentException;
import net.javaguides.transactiondemo.repository.OrderRepository;
import net.javaguides.transactiondemo.repository.PaymentRepository;
import net.javaguides.transactiondemo.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;

    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    @Transactional
    public OrderResponse placeOrder(OrderRequest orderRequest) {

        Order order = orderRequest.getOrder();
        order.setStatus("INPROGRESS");
        order.setOrderTackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if(!payment.getType().equals("DEBIT")){
            throw new PaymentException("Payment card type do not support");
        }

        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTackingNumber(order.getOrderTackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse;
    }
}

