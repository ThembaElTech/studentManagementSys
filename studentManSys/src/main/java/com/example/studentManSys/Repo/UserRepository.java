package com.example.studentManSys.Repo;

import com.example.studentManSys.Model.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {


    public UserDtls findByEmail(String username);
    public boolean existsByEmail(String email);
}
