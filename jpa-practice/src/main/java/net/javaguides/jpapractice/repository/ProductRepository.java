package net.javaguides.jpapractice.repository;

import net.javaguides.jpapractice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

