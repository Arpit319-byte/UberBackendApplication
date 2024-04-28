package com.example.UberApplication.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
public abstract class  BaseReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // It is used for setting the time/date/date.time
    @CreatedDate // This tells the spring to only handle it at the creation of object
    protected Date createdOn;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // This tells the spring to only handle it at the update of object
    protected Date updatedOn;

}
