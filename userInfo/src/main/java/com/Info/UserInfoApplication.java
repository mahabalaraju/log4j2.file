package com.Info;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class UserInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserInfoApplication.class, args);
	}
	@Configuration
	public class DatasourceConfig {
	    @Bean
	    public DataSource datasource() {
	    	 return DataSourceBuilder.create()
	                 .driverClassName("com.mysql.cj.jdbc.Driver")
	                 .url("jdbc:mysql://localhost:3306/mahabala")
	                 .username("root")
	                 .password("root-123")
	                 .build();
	     }
	 }

}
