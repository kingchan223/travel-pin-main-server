package com.TravelPinMainServer.domain.entity;

import javax.persistence.*;

@Entity
public class PostCategory {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="post_category_id")
    private Long id;
    @Column(name="post_category_name")
    private String postCategoryName;
}
