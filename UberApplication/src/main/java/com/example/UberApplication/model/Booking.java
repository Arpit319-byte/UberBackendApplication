package com.example.UberApplication.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

public class Booking extends BaseModel{

    @Enumerated(value=EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    private Date startTime;

    private Date endTime;

    private Long totalDistance;
}
