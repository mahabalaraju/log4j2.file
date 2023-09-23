package com.worker.registration;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/vi/registration")
public class registration {

	public String register(@RequestBody RegistrationRequest request) {
		return registrationService.register(request);
	}
}
