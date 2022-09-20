package com.example.dhamal.repository;

import com.example.dhamal.model.User;
import com.example.dhamal.pojo.UserDataProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "select * from users where name = ?1", nativeQuery = true)
    List<User> findUserByUsername(String username);

    @Query(value = "select * from users order by id desc", nativeQuery = true)
    List<User> getList();

    @Query(value = "select address, email as \"emailAddress\" from users where id = ?1", nativeQuery = true)
    UserDataProjection getSelectedData(Integer id);
}
