package net.javaguides.webfluxreactivecrud.repository;

import net.javaguides.webfluxreactivecrud.entity.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
