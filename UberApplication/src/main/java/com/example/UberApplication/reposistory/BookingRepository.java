package com.example.UberApplication.reposistory;

import com.example.UberApplication.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
