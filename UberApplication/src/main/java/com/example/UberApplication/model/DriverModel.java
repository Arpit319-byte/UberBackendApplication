package com.example.UberApplication.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

// This is the DriverReview entity class
@Entity
@Setter
@Getter
public class DriverModel extends Model {

    // This is the driver review
    private String driverReview;

    // This is the driver rating
    private int driverRating;
}
