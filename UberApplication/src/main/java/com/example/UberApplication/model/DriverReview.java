package com.example.UberApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// This is the DriverReview entity class
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DriverReview extends Review {

    // This is the driver review
    @Column(nullable = false) // This specifies that the driver review column cannot be null
    private String driverReview;

    // This is the driver rating
    @Column(nullable = false) // This specifies that the driver rating column cannot be null
    private int driverRating;
}
