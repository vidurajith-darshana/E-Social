package com.esocial.repository;

import com.esocial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(nativeQuery = true,value = "SELECT u FROM USER u WHERE u.USERNAME=?1")
    public User getByUserName(String username);
}
