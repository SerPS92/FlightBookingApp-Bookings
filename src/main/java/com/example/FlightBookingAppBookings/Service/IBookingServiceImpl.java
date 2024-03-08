package com.example.FlightBookingAppBookings.Service;

import com.example.FlightBookingAppBookings.Model.Booking;
import com.example.FlightBookingAppBookings.Repository.IBookingRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class IBookingServiceImpl implements IBookingService{

    private final IBookingRepo bookingRepo;
    private final RestTemplate restTemplate;
    String url = "http://flights-service";

    public IBookingServiceImpl(IBookingRepo bookingRepo,
                               RestTemplate restTemplate) {
        this.bookingRepo = bookingRepo;
        this.restTemplate = restTemplate;
    }

    @Override
    public void addBooking(Booking booking) {
        bookingRepo.save(booking);
    }

    @Override
    public List<Booking> getBookings() {
        return bookingRepo.findAll();
    }

    @Override
    public void makeBooking(Booking booking, int totalPerson) {
        addBooking(booking);
        restTemplate.put(url + "/flights/{p1}/{p2}", null, booking.getFlight(), totalPerson);
    }

}
