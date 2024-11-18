package com.swengineer.sportsmatch.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private Integer teamId;

    @Column(nullable = false)
    private String passwd;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String nickname;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime registDate;

    private Boolean banYn;

    private String location;

    private Integer age;

    private String sex;

    private String position;

    private String profileImage;

    // Getters, Setters, Constructors
}
