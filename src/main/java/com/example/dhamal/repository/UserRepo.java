package com.example.dhamal.repository;

import com.example.dhamal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "select * from users where name = ?1", nativeQuery = true)
    List<User> findUserByUsername(String username);
}
