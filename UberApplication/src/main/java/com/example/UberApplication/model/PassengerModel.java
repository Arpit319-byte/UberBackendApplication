package com.example.UberApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// This is the PassengerReview entity class
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PassengerModel extends Model {

    // This is the passenger review
    @Column(nullable = false) // This specifies that the passenger review column cannot be null
    private String passengerReview;

    // This is the passenger rating
    @Column(nullable = false) // This specifies that the passenger rating column cannot be null
    private int passengerRating;
}