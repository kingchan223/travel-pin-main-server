package com.TravelPinMainServer.domain.entity;

import javax.persistence.*;

@Table(name ="User_Crew")
@Entity
public class UserCrew {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="user_crew_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="crew_id")
    private Crew crew;

    private int score;

}
