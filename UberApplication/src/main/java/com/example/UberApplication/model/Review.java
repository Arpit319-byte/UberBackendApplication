package com.example.UberApplication.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ReviewTable")
@EntityListeners(AuditingEntityListener.class)
public class Review extends BaseReview {

    @Column(nullable = false)
    private String content;

    @Column
    private String rating;


    @Override
    public String toString(){
        return "Review: "+this.rating+" "+this.content;
    }


}
