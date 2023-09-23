package com.worker.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.worker.Repo.workerRepo;
import com.worker.worker.worker;

import jakarta.annotation.PostConstruct;

@Service
public class workerService {

	@Autowired
	private workerRepo workrepo;
	@Autowired
	private PasswordEncoder passwordencoder;
	List<worker> list=null;
	
	public worker getworker(int id) {
		return list.stream()
				.filter(product->product.getId()==id)
				.findAny()
				.orElseThrow(()->new  RuntimeException("product"+id+" not found") );
	}
	
	public String addworker(worker worker) {
		worker.setPassword(passwordencoder.encode(worker.getPassword()));
		workrepo.save(worker);
		return "user added to system";
}
	 
//	@PostConstruct
//	public void loadproductsfromDB() {
//		list= IntStream.rangeClosed(1, 100)
//		.maptoobj(i->product.builder()
//				.workerid(i)
//				.name("product"+i)
//				.qty(new Random().nextInt(bound:10))
//				.price(new Random().nextInt(boung:500))
//				.build()
//				).Collect(Collectors.toList());
//		public List<worker> getworkers() {return list;}
//	}
}
