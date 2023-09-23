package com.Info.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "userTable")
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int ticketPrice;
	private int noOfTickets;
	private int ticketDiscount;
	
	public int getTotalPrice() {
        return noOfTickets * ticketPrice - (ticketDiscount != 0 ? ticketDiscount: 0);
    }
}
