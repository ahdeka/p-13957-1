package com.back.domain.global.jpa.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@MappedSuperclass // 엔티이의 부모 클래스가 되려면 이 어노테이션이 필요
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {

    @Id // Primary Key 를 의미한다.
    @GeneratedValue(strategy = IDENTITY) // Auto Increment 를 의미한다.
    private int id; // INT
    @CreatedDate
    private LocalDateTime createDate; // Insert 시 자동으로 현재 시간으로 설정됨
    @LastModifiedDate
    private LocalDateTime modifyDate; // Insert . Update 시 자동으로 현재 시간으로 설정됨
}
