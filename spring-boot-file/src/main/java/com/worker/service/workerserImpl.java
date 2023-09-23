package com.worker.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.worker.entity.worker;
import com.worker.repository.workerRepo;

@Service
public class workerserImpl implements workservice{
workerRepo workrepo;
	@Override
	public worker getAttachment(String fileId) {


		return null;
	}

	@Override
	public String save(MultipartFile file) throws IOException {
		worker w=new worker();
		w.setData(file.getBytes());
		workrepo.save(w);
		return null;
	}

}
