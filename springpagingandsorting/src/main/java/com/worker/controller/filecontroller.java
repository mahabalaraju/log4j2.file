package com.worker.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.worker.service.fileService;

public class filecontroller {

	@Autowired
	private fileService ser;

	@PostMapping("/upload")
	public ResponseEntity<String> uploadimage(@RequestParam MultipartFile file) throws IOException {
		String uploadimage = ser.upload(file);
		return new ResponseEntity<String>(uploadimage, HttpStatus.OK);
	}
	
	@GetMapping("/download/{filename}")
	public ResponseEntity<?> downloadImage(@PathVariable String filename){
		byte[] imagedata=ser.download(filename);
		
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.valueOf(filename))
				.body(imagedata
						);
}
}
