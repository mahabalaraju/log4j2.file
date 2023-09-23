package com.worker.controller;


import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.worker.response;
import com.worker.entity.worker;
import com.worker.repository.workerRepo;
import com.worker.service.workservice;

@Controller
public class controller {
private workservice workser;

@GetMapping("/")
public String uploadfile() {
	return "NewFile";
}

//@PostMapping("/upload")
//public String uploadfile(@RequestParam("file") MultipartFile file
//		) throws Exception{
//	return workser.save(file);
//}



	
}



