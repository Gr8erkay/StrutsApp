package com.gr8erkay.strutsapp;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport implements Action{

    String firstName;
    String lastName;
    String gender;
    String age;
    String email;
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String execute() {
        // Simulate registration process
        System.out.println("execute() method called");

        if (isValidRegistration()) {
            return SUCCESS; // Registration successful, navigate to welcome.jsp
        } else {
            addActionError("Registration failed. Please check your inputs.");
            return INPUT; // Registration failed, navigate back to register.jsp
        }
    }

    private boolean isValidRegistration() {
        // Basic checks for empty or null fields
        if (firstName == null || firstName.trim().isEmpty() ||
                lastName == null || lastName.trim().isEmpty() ||
                gender == null || gender.trim().isEmpty() ||
                age == null || age.trim().isEmpty() ||
                email == null || email.trim().isEmpty()) {
            addActionError("All fields are required");
            return false;
        }

        // Additional validation checks
        if (!isValidAge(age)) {
            addActionError("Invalid age");
            return false;
        }

        if (!isValidEmail(email)) {
            addActionError("Invalid email");
            return false;
        }

        // All checks passed, registration is valid
        return true;
    }

    private boolean isValidAge(String age) {
        try {
            int ageValue = Integer.parseInt(age);
            return ageValue > 18 && ageValue < 60; // Assuming a reasonable age range
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isValidEmail(String email) {
        // Basic email validation regex (you can use a more robust library for this)
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
        return email.matches(emailPattern);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
