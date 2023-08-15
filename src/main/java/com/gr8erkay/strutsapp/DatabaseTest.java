package com.gr8erkay.strutsapp;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class DatabaseTest extends ActionSupport {

    public String execute() {
        DatabaseAction databaseAction = new DatabaseAction();
        Connection connection = databaseAction.connectToDatabase();

        if (connection != null) {
            try {
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery("SELECT * FROM students");

                while (result.next()) {
                    System.out.println("ID: " + result.getInt("ID") + ", Name: " + result.getString("first_name"));
                }

                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
                return ERROR;
            }
        }

        return SUCCESS;
    }
}