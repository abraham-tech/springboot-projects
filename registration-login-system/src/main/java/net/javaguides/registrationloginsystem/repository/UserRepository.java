package net.javaguides.registrationloginsystem.repository;

import net.javaguides.registrationloginsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
