package com.croom;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false)
    public Integer user_id;

    @Column(nullable = false)
    public String project_name;

    @Column(nullable = false)
    public String content;

    @Column(nullable = true)
    public Integer like_count;

    @Column(nullable = false)
    public String tag;

    @Column(nullable = false)
    public Integer recruitment_limit;

    @Column(nullable = true)
    public String kakao_open_chat_url;

    @Column(nullable = false)
    public Integer location_id;

    @Column(nullable = false)
    public Integer position_id;

    @Column(nullable = false)
    public Integer stack_id;

    }
