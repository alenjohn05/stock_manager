package com.stockmanagement.stockmanagement.Tables;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
