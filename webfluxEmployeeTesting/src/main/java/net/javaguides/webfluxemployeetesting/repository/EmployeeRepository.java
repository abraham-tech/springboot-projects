package net.javaguides.webfluxemployeetesting.repository;

import net.javaguides.webfluxemployeetesting.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
