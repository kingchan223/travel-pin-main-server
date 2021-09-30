package com.TravelPinMainServer.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private Long id;
    private String username;
    private String email;
    private String password;
    private String phone;
    private String birth;
    private char sex;
    private String profileImageId;
    private LocalDateTime joinedDate;

    private String provider;
    private String providerId;

    @OneToMany(mappedBy="user")
    private List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy="user")
    private List<UserCrew> crews = new ArrayList<>();
}
