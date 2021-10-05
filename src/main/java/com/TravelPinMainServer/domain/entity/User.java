package com.TravelPinMainServer.domain.entity;

import com.TravelPinMainServer.domain.dto.JoinUserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
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

    public static User createUserWithDTO(JoinUserDTO joinUserDTO, String encodedPw) {
        return User.builder()
                .username(joinUserDTO.getUsername())
                .email(joinUserDTO.getEmail())
                .password(encodedPw)
                .profileImageId(null)// TODO profile이미지 구현하기
                .birth(joinUserDTO.getBirth())
                .phone(joinUserDTO.getPhone())
                .sex(joinUserDTO.getSex())
                .joinedDate(LocalDateTime.now())
                .build();

    }
}
