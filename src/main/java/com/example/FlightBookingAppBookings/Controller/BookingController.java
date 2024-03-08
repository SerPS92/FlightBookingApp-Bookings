package com.example.FlightBookingAppBookings.Controller;

import com.example.FlightBookingAppBookings.Model.Booking;
import com.example.FlightBookingAppBookings.Service.IBookingService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    private final IBookingService bookingService;

    public BookingController(IBookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping(value = "booking/{people}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void makeBooking(@RequestBody Booking booking,
                            @PathVariable(name = "people") int people){
        bookingService.makeBooking(booking, people);
    }

    @GetMapping(value = "bookings", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Booking> getBookings(){
        return bookingService.getBookings();
    }
}
