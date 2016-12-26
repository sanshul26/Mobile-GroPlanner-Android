package com.example.user.mobile_groplanner_android.model;

/**
 * Project    : GroPlanner
 * Created by : Anshul
 * Date       : 25-12-2016.
 *
 * Description==================================
 * This class defines Model for user
 */

public class User implements GroPlannerModelInterface{

    private String userName;
    private String password;
    private String name;
    private String email;
    private String contact;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
