 package com.worker;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.worker.Repo.studentRepo;
import com.worker.entity.laptop;
import com.worker.entity.student;

@SpringBootApplication
public class SpringDataJpaPracticeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPracticeApplication.class, args);
	}

	@Autowired
	private studentRepo studRepo;
	
	static Logger logger = LogManager.getLogger(SpringDataJpaPracticeApplication.class);
	
	@Override
	public void run(String... args) throws Exception {
		student s=new student();
		s.setAbout("I'm a Hacker");
		s.setName("mahabalaraju");
		s.setId(2);

		
	
		
		
		laptop lap=new laptop();
		lap.setBrand("asdfasda");
		lap.setLid(12322);
		lap.setModelnumber("a23sdf");
		lap.setStudent(s);
		s.setLaptop(lap);
		studRepo.save(s);
		
		
		student student=studRepo.findById(1).get();
		logger.info("name is {}",student.getName());
		
laptop lap1 = student.getLaptop();
		logger.info("laptop {},{}",lap.getBrand(),lap.getModelnumber());
	}

//	@Bean
//	public static void sta() {
//		student sut=new student();
//		sut.get
//	}
}
