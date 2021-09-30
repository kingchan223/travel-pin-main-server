package com.TravelPinMainServer.domain.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="post_id")
    private Long id;
    private String title;
    private String content;
    @Column(name="created_date")
    private LocalDateTime createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;


}
