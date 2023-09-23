package com.worker.entity;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCT_TBL")
public class product {

	@Id
	@GeneratedValue
	private int id;

	@NotBlank(message = "product name must needed")
	private String name;

	private int quantity;

	private long price;

	@CreationTimestamp
	@Column(nullable = false, updatable = false, name = "created_at")
	private Date CreatedAt;
	@UpdateTimestamp
	private Date UpdatedAt;
	
	@OneToOne
	private entity entity;

}
