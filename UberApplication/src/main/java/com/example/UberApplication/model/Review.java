package com.example.UberApplication.model;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "ReviewTable")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    private String rating;

    @Temporal(TemporalType.TIMESTAMP) // It is used for setting the time/date/date.time
    @CreatedDate // This tells the spring to only handle it at the creation of object
    private Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // This tells the spring to only handle it at the update of object
    private Date updatedOn;


}
