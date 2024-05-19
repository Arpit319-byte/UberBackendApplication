package com.example.UberApplication.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

// This is the PassengerReview entity class
@Entity
@Getter
@Setter
public class PassengerModel extends Model {

    // This is the passenger review
    private String passengerReview;

    // This is the passenger rating
    private int passengerRating;
}