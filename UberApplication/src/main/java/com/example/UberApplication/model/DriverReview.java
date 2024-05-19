package com.example.UberApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class DriverReview extends Review{

    private String  driverReview;
}
