package com.example.app.user.model;

public class ClientHTTPRequest {
    public String firstName;
    public String lastName;
    public UserHTTPRequest userHTTPRequest;

    public ClientHTTPRequest(String firstName, String lastName, UserHTTPRequest userHTTPRequest) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userHTTPRequest = userHTTPRequest;
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

    public UserHTTPRequest getUserHTTPRequest() {
        return userHTTPRequest;
    }

    public void setUserHTTPRequest(UserHTTPRequest userHTTPRequest) {
        this.userHTTPRequest = userHTTPRequest;
    }

    public static ClientHTTPRequestBuilder builder() {
        return new ClientHTTPRequestBuilder();
    }

    public static final class ClientHTTPRequestBuilder {
        public String firstName;
        public String lastName;
        public UserHTTPRequest userHTTPRequest;

        private ClientHTTPRequestBuilder() {
        }

        public ClientHTTPRequestBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ClientHTTPRequestBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ClientHTTPRequestBuilder userHTTPRequest(UserHTTPRequest userHTTPRequest) {
            this.userHTTPRequest = userHTTPRequest;
            return this;
        }

        public ClientHTTPRequest build() {
            return new ClientHTTPRequest(firstName, lastName, userHTTPRequest);
        }
    }
}
