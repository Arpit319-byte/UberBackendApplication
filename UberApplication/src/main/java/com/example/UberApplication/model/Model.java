package com.example.UberApplication.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

// This is the Review entity class
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ReviewTable") // This specifies the table name in the database
@EntityListeners(AuditingEntityListener.class) // This enables JPA auditing
public class Model extends BaseModel {

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