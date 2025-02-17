package net.javaguides.registrationloginsystem.repository;

import net.javaguides.registrationloginsystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
