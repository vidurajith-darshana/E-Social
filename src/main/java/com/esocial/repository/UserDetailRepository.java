package com.esocial.repository;

import com.esocial.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDetailRepository extends JpaRepository<UserDetail,Integer> {

    @Query(nativeQuery = true,value = "SELECT * FROM USERDETAIL WHERE EMAIL=?1")
    UserDetail getByEmail(String email);
}
