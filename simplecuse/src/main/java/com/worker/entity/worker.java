package com.worker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class worker {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String address;
private String emailId;
private String password;
}
