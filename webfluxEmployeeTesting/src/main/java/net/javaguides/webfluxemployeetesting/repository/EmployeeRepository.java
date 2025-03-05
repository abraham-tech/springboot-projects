package net.javaguides.webfluxemployeetesting.repository;

import net.javaguides.springboot.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
