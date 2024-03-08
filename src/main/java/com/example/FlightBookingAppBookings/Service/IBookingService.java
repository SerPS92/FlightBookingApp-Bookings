package com.example.FlightBookingAppBookings.Service;

import com.example.FlightBookingAppBookings.Model.Booking;

import java.util.List;

public interface IBookingService {

    public void addBooking(Booking booking);
    List<Booking> getBookings();
    void makeBooking(Booking booking, int totalPerson);
}
