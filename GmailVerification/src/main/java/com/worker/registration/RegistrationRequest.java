package com.worker.registration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor

public class RegistrationRequest {
private final String firstname;
private final String lastname;
private final String email;
private final String password;
}
