package com.worker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.worker.entity.worker;
import com.worker.repository.repository;
import com.worker.service.service;

@RestController

public class controller {

	@Autowired
	private service ser;

	@Autowired
	private repository repo;

	@GetMapping("/user/{id}")
	public ResponseEntity<worker> getbyid(@PathVariable int id) {
		worker work = ser.getbyid(id);
		return new ResponseEntity<worker>(work, HttpStatus.OK);
	}

	@GetMapping("/user")
	public ResponseEntity<List<worker>> getall() {
		List<worker> getall = ser.getall();
		return new ResponseEntity<List<worker>>(getall, HttpStatus.OK);
	}

	@PutMapping("/user")
	public ResponseEntity<String> update(@RequestBody worker work) {
		String insert = ser.upsert(work);
		return new ResponseEntity<String>(insert, HttpStatus.ACCEPTED);
	}

//	@PutMapping("/user/{id}")
//    public ResponseEntity<worker> updaet(@RequestBody worker work,@PathVariable int id){
//		Optional<worker> work1 = repo.findById(id);
//			//	()->new ResourceNotFoundExcpetion("worker not exists with id :"+id);
//		
//		if(work1.isPresent()) {
//			
//			work1.setName(work.getName());
//		work1.setEmailId(work.getEmailId());
//		work1.setPassword(work.getPassword());
//		repo.save(work);
//		
//	}
//		else
//		return new ResourceNotFoundExcpetion("worker not exists with id :"+id);
//			
//			

	@PostMapping("/user")
	public ResponseEntity<String> save(@RequestBody worker work) {
		String superworker = ser.upsert(work);
		return new ResponseEntity<String>(superworker, HttpStatus.OK);
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deletemapping(@PathVariable int id) {
		String delete = ser.delete(id);
		return new ResponseEntity<String>(delete, HttpStatus.OK);

	}
}
