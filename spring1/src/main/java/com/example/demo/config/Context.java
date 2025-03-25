package com.example.demo.config;

public class Context {
    private static int port;
    private String dbUrl;
    private String dbUserName;
    private String dbPassword;

    private static String name;

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        Context.port = port;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Context.name = name;
    }
}
