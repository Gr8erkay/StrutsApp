package com.gr8erkay.strutsapp;

import com.opensymphony.xwork2.Action;

public class TestAction implements Action {

    String message;

    String firstName;


    public String execute() {
        System.out.println("execute() method called");
        message = "Success Message";
        System.out.println("Name " + firstName);
        return "success";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
