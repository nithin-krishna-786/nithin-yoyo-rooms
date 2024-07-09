package com.nithin.yoyo_rooms.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.nithin.yoyo_rooms.entity.enums.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "bookings")
@Data
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 

	private Long userId; 
	private Long hotelId; 
	private List<Room> bookedRooms;  
	private Double amount; 
    private PaymentStatus status_of_payment; 
    private LocalDateTime bookingTime; 
    private Long numberOfDaysBooked; 
}
