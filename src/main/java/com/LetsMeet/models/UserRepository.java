package com.LetsMeet.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long>  {
    //Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email_address);
    Optional<User> findByEmailAndPassword(String email_address, String password);
}
