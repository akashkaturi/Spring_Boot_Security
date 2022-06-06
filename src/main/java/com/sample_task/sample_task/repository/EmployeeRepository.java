package com.sample_task.sample_task.repository;

import com.sample_task.sample_task.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @Query(value = "Select e from Employee e where e.city =: city")
    List<Employee> findAllByCity(String city);


}
