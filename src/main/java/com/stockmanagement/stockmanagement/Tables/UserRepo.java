package com.stockmanagement.stockmanagement.Tables;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {
    List<User> findByUsernameContaining(String username);

    boolean existsByUsernameOrEmail(String username, String email);
}
