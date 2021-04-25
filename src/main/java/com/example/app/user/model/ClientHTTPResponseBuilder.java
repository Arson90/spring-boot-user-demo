package com.example.app.user.model;

import com.example.app.user.data.User;

public final class ClientHTTPResponseBuilder {
    public String firstName;
    public String lastName;
    public UserHTTPResponse userHTTPResponse;

    private ClientHTTPResponseBuilder() {
    }

    public static ClientHTTPResponseBuilder builder() {
        return new ClientHTTPResponseBuilder();
    }

    public ClientHTTPResponseBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public ClientHTTPResponseBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public ClientHTTPResponseBuilder user(UserHTTPResponse userHTTPResponse){
        this.userHTTPResponse = userHTTPResponse;
        return this;
    }

    public ClientHTTPResponse build() {
        return new ClientHTTPResponse(firstName, lastName, userHTTPResponse);
    }
}
