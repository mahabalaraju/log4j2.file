package com.worker.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.worker.entity.entity;
import com.worker.repo.entityrepo;

public class fileService {

	@Autowired
	private entityrepo repo;
	
	public String upload(MultipartFile file) throws IOException {
		entity image = repo.save(entity.builder()
				.name(file.getName())
				.type(file.getContentType())
				.data(file.getBytes()).build());
		if(image!=null) {
			return "file uploaded successfully:"+image.getName();
		}
		else
			return null;
	}
	
	public byte[] download(String filename) {
		Optional<entity> dbimgdata=repo.findbyname(filename);
		byte[] images= dbimgdata.get().getData();
		return images;
	}
	
}












