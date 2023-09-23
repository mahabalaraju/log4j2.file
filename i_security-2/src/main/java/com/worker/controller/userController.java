package com.worker.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.worker.entity.user;
import com.worker.repository.repository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@RestController

public class userController {
	@Autowired
	private repository repo;

	//public void adduserdetails(@RequestBody user user) {}
}		