package com.worker.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.worker.entity.worker;

public interface workservice {

	//worker saveAttachment(MultipartFile file);

	worker getAttachment(String fileId);

	String save(MultipartFile file) throws IOException;

}
