package com.example.UberApplication.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

// Entity class for Booking
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
// This annotation is used to apply certain JPA-related events (like auto-generating timestamps) to this entity
//@EntityListeners(AuditingEntityListener.class)
// This annotation is used to specify the details of the table that will be used to persist the entity in the database
@Table(name = "BookingTable")
public class Booking extends BaseModel {

    // OneToOne annotation is used to specify the relationship between two entities
    @OneToOne(cascade = CascadeType.ALL)
    private Review review;

    // Enumerated annotation is used with Enum field, it determines how Hibernate persists the Enum to the database
    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    // Temporal annotation is used with java.util.Date and java.util.Calendar classes, it converts the date and time values from Java Object to compatible database type and vice versa
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    // Total distance of the trip
    private Long totalDistance;

    @ManyToOne
    private Driver driver;

    @Override
    public String toString(){
        return "Booking: "+this.bookingStatus+" "+this.startTime+" "+this.endTime+" "+this.totalDistance;
    }
}
