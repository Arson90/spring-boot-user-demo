package com.example.app.user.repsitory;

import com.example.app.user.data.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    boolean findByFirstName(String firstName);

    boolean existsByLastName(String lastName);

    boolean findAllByFirstName(String firstName);

    long countAllByLastName(String lastName);
}
