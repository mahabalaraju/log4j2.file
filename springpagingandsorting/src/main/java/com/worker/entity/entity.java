package com.worker.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class entity {

	@Id
	private int id;
	private String name;
	private String type;

	@Lob
	private byte[] data;

	@OneToOne(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	
	private product product;
}
