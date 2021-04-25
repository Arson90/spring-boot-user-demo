package com.example.app.user.model;

import com.example.app.user.data.Client;
import com.example.app.user.data.User;

public class ClientMapper {
    public static ClientHTTPResponse map(Client client) {
        return ClientHTTPResponseBuilder.builder()
                .firstName(client.getFirstName())
                .lastName(client.getLastName())
                .user(UserHTTPResponse.builder()
                    .userName(client.getUser().getUserName())
                    .password(client.getUser().getPassword())
                    .build())
                .build();
    }

    public static Client map(ClientHTTPRequest clientHTTPRequest) {
        return Client.builder()
                .firstName(clientHTTPRequest.getFirstName())
                .lastName(clientHTTPRequest.getLastName())
                .user(new User(clientHTTPRequest.userHTTPRequest.userName, clientHTTPRequest.userHTTPRequest.password))
                .build();
    }
}
