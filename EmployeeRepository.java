package net.javaguides.springboot.cruderestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.cruderestfulwebservices.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}