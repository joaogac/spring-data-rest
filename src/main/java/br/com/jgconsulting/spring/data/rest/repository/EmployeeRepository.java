package br.com.jgconsulting.spring.data.rest.repository;

import br.com.jgconsulting.spring.data.rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT e FROM Employee e WHERE e.firstName = :firstName")
    public List<Employee> findByFirstName(@PathVariable("firstName") String firstName );

}
