package com.example.FlightBookingAppBookings.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String dni;
    private int hotel;
    private int flight;
}
