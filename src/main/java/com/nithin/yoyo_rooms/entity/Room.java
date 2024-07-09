package com.nithin.yoyo_rooms.entity;

import java.time.LocalDate;

import com.nithin.yoyo_rooms.entity.enums.Gender;
import com.nithin.yoyo_rooms.entity.enums.PersonType;
import com.nithin.yoyo_rooms.entity.enums.RoomStatus;
import com.nithin.yoyo_rooms.entity.enums.RoomType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private Long hotelId;
	private RoomType roomType;
	private RoomStatus roomStatus;

}
