package br.com.jgconsulting.spring.data.rest.runner;

import br.com.jgconsulting.spring.data.rest.entity.Employee;
import br.com.jgconsulting.spring.data.rest.repository.EmployeeRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Log
public class DBOperationRunner implements CommandLineRunner {

    @Autowired
    EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.saveAll(
                List.of(
                        new Employee(1L, "Gregory", "Hughes", "GregoryHughes@armyspy.com"),
                        new Employee(2L, "Frank", "Clarke", "FrankClarke@armyspy.com"),
                        new Employee(3L, "Susan", "Moore", "SusanMoore@armyspy.com")
                ));
        log.info("--------- H2 Database Initialized! Initial records inserted ! ---------");
    }
}
