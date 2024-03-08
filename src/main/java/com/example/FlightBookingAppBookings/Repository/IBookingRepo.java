package com.example.FlightBookingAppBookings.Repository;

import com.example.FlightBookingAppBookings.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookingRepo extends JpaRepository<Booking, Integer> {
}
