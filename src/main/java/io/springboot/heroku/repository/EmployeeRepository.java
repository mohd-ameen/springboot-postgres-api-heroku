package io.springboot.heroku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.springboot.heroku.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
