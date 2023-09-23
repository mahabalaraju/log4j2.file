package com.worker.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.batch.core.ItemProcessListener;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.PlatformTransactionManager;

import com.worker.entity.customer;
import com.worker.repository.customerRepository;

@Configuration
public class springbatchconfig {
	private customerRepository customerRepository;

	@Bean
	public FlatFileItemReader<customer> reader(){
		FlatFileItemReader<customer> itemreader=new FlatFileItemReader<>();
		itemreader.setName("csv file");
		itemreader.setResource(new FileSystemResource("c:/mahabal"));
        itemreader.setLinesToSkip(1);
		itemreader.setLineMapper(linemapper());
		return itemreader;
	
	}
	@Bean	
	private LineMapper<customer> linemapper(){
			DefaultLineMapper<customer> linemapper=new DefaultLineMapper<>();
			DelimitedLineTokenizer linetokenizer=new DelimitedLineTokenizer();
			linetokenizer.setDelimiter(",");
			linetokenizer.setStrict(false);
			linetokenizer.setNames("id","name");
			BeanWrapperFieldSetMapper<customer> fieldsetmapper=new BeanWrapperFieldSetMapper<>();
		    fieldsetmapper.setTargetType(customer.class);
			linemapper.setFieldSetMapper(fieldsetmapper);
		    linemapper.setLineTokenizer(linetokenizer);
		
			return linemapper;
		}
		
	@Bean
	public Customerprocessor processor() {
		return new Customerprocessor();
	}
		
	@Bean
	public RepositoryItemWriter<customer> writer(){
		RepositoryItemWriter<customer> writer=new RepositoryItemWriter<customer>();
		writer.setRepository(customerRepository);
		writer.setMethodName("save");

		return writer;
	}
		
	@Bean
	public Step step1(JobRepository jobrepository,PlatformTransactionManager transactionmanager) {
		return new StepBuilder("csv-builder", jobrepository).
				<customer,customer>chunk(10,transactionmanager)
				.reader(reader())
				.processor(processor())
				.writer(writer())
				.taskExecutor(taskexecutor())
				.build();
	}
	
	@Bean
	private Job runjob(JobRepository jobRepository,PlatformTransactionManager transactionmanager) {
		return new JobBuilder("import customers",jobRepository).
				flow(step1(jobRepository,transactionmanager)).
				end().build();
	}
	@Bean
	private TaskExecutor taskexecutor() {
		SimpleAsyncTaskExecutor asynchtaskexecutor=new SimpleAsyncTaskExecutor();
		asynchtaskexecutor.setConcurrencyLimit(10);
		return asynchtaskexecutor;
	}
		
		
		
		
		
		
		
	}

