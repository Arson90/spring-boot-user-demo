package com.example.app.user.model;

public class UserHTTPResponse {
    public String userName;
    public String password;

    public UserHTTPResponse(String userName, String password) {
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

    public static UserHTTPResponseBuilder builder() {
        return new UserHTTPResponseBuilder();
    }

    public static final class UserHTTPResponseBuilder {
        private String userName;
        private String password;

        private UserHTTPResponseBuilder() {
        }

        public UserHTTPResponseBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserHTTPResponseBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserHTTPResponse build() {
            return new UserHTTPResponse(userName, password);
        }
    }
}
