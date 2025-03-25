package com.spring.jpa.controller.liquibase;

import com.spring.jpa.service.liquibase.LiquibaseService;
import liquibase.exception.LiquibaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/liquibase")
public class LiquibaseController {

    private final LiquibaseService liquibaseService;

    @Autowired
    public LiquibaseController(LiquibaseService liquibaseService) {
        this.liquibaseService = liquibaseService;
    }

    @DeleteMapping("rollback/{changesToRollback}")
    public String rollbackApi(@PathVariable int changesToRollback) {
        try {
            liquibaseService.rollback(changesToRollback);
            return "Rollback successful";
        } catch (SQLException | LiquibaseException e) {
            return "Rollback failed: " + e.getMessage();
        }
    }
}
