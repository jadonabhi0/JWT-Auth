package com.abhi.auth.repositary;/*
    @author jadon
*/

import com.abhi.auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositary extends JpaRepository<User, String> {

    public Optional<User> findByEmail(String email);

}
