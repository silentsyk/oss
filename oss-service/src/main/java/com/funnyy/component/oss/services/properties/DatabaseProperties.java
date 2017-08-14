package com.funnyy.component.oss.services.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by sky on 17-6-13.
 */
@Component
public class DatabaseProperties {
    @Value("${database.driverClassName}")
    private String dbDriver;

    @Value("${database.username}")
    private String dbUser;

    @Value("${database.password}")
    private String dbPassword;

    @Value("${database.url}")
    private String dbUrl;


    public String getDbDriver() {
        return dbDriver;
    }

    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
