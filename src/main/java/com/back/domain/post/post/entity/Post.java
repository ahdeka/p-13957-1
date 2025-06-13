package com.back.domain.post.post.entity;


import com.back.domain.global.jpa.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity // 아래 구조대로 DB 테이블을 만들어야 한다.
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Post extends BaseEntity {

    private String title; // VARCHAR(255)
    @Column(columnDefinition = "TEXT") // TEXT 타입으로 지정
    private String content;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
