package com.eltayeb.bookingsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Enum<UserRole> role;
    private Timestamp createdAt;

    enum UserRole {
        ADMIN,
        USER
    }
}
