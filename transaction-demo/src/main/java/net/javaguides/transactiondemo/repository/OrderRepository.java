package net.javaguides.transactiondemo.repository;

import net.javaguides.transactiondemo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
