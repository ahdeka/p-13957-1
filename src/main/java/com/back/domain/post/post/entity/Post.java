package com.back.domain.post.post.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // 아래 구조대로 DB 테이블을 만들어야 한다.
@Getter
@Setter
@NoArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
public class Post {

    @Id // Primary Key 를 의미한다.
    @GeneratedValue(strategy = IDENTITY) // Auto Increment 를 의미한다.
    private int id; // INT
    @CreatedDate
    private LocalDateTime createDate; // Insert 시 자동으로 현재 시간으로 설정됨
    @LastModifiedDate
    private LocalDateTime modifyDate; // Insert . Update 시 자동으로 현재 시간으로 설정됨
    private String title; // VARCHAR(255)
    @Column(columnDefinition = "TEXT") // TEXT 타입으로 지정
    private String content;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
