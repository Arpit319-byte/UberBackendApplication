package com.example.UberApplication.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Date;

// This is the Review entity class
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ReviewTable") // This specifies the table name in the database
@EntityListeners(AuditingEntityListener.class) // This enables JPA auditing
public class Review extends BaseReview {

    @Column(nullable = false) // This specifies that the content column cannot be null
    private String content;

    @Column // This specifies that the rating column can be null
    private String rating;

    // This method returns a string representation of the Review object
    @Override
    public String toString(){
        return "Review: "+this.rating+" "+this.content;
    }
}