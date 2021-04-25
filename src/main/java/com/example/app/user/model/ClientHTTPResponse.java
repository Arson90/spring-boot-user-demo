package com.example.app.user.model;

public class ClientHTTPResponse {
    public String firstName;
    public String lastName;
    public UserHTTPResponse userHTTPResponse;

    public ClientHTTPResponse(String firstName, String lastName, UserHTTPResponse userHTTPResponse) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userHTTPResponse = userHTTPResponse;
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

    public UserHTTPResponse getUserHTTPResponse() {
        return userHTTPResponse;
    }

    public void setUserHTTPResponse(UserHTTPResponse userHTTPResponse) {
        this.userHTTPResponse = userHTTPResponse;
    }
}
