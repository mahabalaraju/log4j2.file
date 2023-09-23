package com.worker.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="worer")
public class worker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private String id;

	    private String fileName;
	    private String fileType;

	    @jakarta.persistence.Lob
	    private byte[] data;

}
