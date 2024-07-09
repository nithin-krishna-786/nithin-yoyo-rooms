package com.nithin.yoyo_rooms.entity;

import java.util.List;

import com.nithin.yoyo_rooms.entity.enums.Facility;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "hotels")
@Data
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String hotelName;
	private Address address;
	private List<Room> rooms;
	private Double rating;
	
	private Boolean isLiftAvailable;
	private Boolean isPowerBackupAvailable;
	private Boolean isHotWaterAvailable;
	private Boolean isBreakfastAvailable;
	private Boolean isSwimmingPoolAvailable;
}
