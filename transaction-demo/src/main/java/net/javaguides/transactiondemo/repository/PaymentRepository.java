package net.javaguides.transactiondemo.repository;

import net.javaguides.transactiondemo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
