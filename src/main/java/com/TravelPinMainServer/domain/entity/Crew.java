package com.TravelPinMainServer.domain.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Crew {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="crew_id")
    private Long id;
    @Column(name="crew_name")
    private String crewName;
    @Column(name="crew_image_id")
    private String crewImageId;
    @Column(name="captain_user_id")
    private String CaptainUserId;
    @Column(name="num_of_users")
    private String numOfusers;
    @Column(name="created_date")
    private LocalDateTime createdDate;

    @OneToMany(mappedBy="crew")
    private List<UserCrew> users = new ArrayList<>();
}
