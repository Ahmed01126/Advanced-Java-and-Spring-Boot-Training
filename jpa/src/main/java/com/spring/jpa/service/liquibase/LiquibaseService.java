package com.spring.jpa.service.liquibase;

import liquibase.Contexts;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.SQLException;

@Service
public class LiquibaseService {

    private final DataSource dataSource;

    @Autowired
    public LiquibaseService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void rollback(int changesToRollback) throws SQLException, LiquibaseException {
        Database database =
                DatabaseFactory.getInstance()
                        .findCorrectDatabaseImplementation(new JdbcConnection(dataSource.getConnection()));

        Liquibase liquibase =
                new Liquibase("db/changelog/db.changelog-master.xml",
                        new ClassLoaderResourceAccessor(), database);

        liquibase.rollback(changesToRollback, new Contexts().toString());

    }
}
