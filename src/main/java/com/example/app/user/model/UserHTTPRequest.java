package com.example.app.user.model;

public class UserHTTPRequest {
    public String userName;
    public String password;

    public UserHTTPRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

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

    public static UserHTTPRequestBuilder builder() {
        return new UserHTTPRequestBuilder();
    }

    public static final class UserHTTPRequestBuilder {
        public String userName;
        public String password;

        private UserHTTPRequestBuilder() {
        }

        public UserHTTPRequestBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserHTTPRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserHTTPRequest build() {
            return new UserHTTPRequest(userName, password);
        }
    }
}
