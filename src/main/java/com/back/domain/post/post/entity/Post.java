package com.back.domain.post.post.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // 아래 구조대로 DB 테이블을 만들어야 한다.
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Post {

    @Id // Primary Key 를 의미한다.
    @GeneratedValue(strategy = IDENTITY) // Auto Increment 를 의미한다.
    private int id; // INT
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private String title; // VARCHAR(255)
    @Column(columnDefinition = "TEXT") // TEXT 타입으로 지정
    private String content;

    public Post(String title, String content) {
        this.createDate = LocalDateTime.now();
        this.modifyDate = this.createDate;
        this.title = title;
        this.content = content;
    }

}
