package com.worker.entity;

import org.hibernate.annotations.CollectionIdJdbcType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class student {

	@Id
	private int id;
	private String name;
	private String about;
	
	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
	private laptop laptop;

	@OneToMany
	private address address;
	
}
