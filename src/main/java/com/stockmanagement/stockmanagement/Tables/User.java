package com.stockmanagement.stockmanagement.Tables;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "USER_SAPP")
@Data
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer user_id;
    private String username;
    private String email;
    private String password;
    private Timestamp createdAt;
    @ManyToOne
    private Portfolio portfolio;
    @ManyToOne
    private Transaction transaction;
}
