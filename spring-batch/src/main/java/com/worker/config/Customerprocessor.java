package com.worker.config;

import org.springframework.batch.item.ItemProcessor;

import com.worker.entity.customer;

public class Customerprocessor implements ItemProcessor<customer, customer> {

	@Override
	public customer process(customer item) throws Exception {
		return item;
	}

}
