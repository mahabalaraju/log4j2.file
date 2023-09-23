package com.worker.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.worker.Exception.productnotfoundExpception;
import com.worker.entity.product;
import com.worker.repo.repository;
@Service
public class serviceImpl implements service {
@Autowired
private repository repo;

	@Override
	public String add(product product) {
		repo.save(product);
		return "success";
	}

	@Override
	public String delete(int id) {
		if(repo.findById(id).isEmpty()) 
			throw new productnotfoundExpception("no product found with given id"+id);
		else 
			repo.deleteById(id);
		return "success";
		
//Optional<product> product =repo.findById(id);
//if(product.isPresent()) {
//	repo.deleteById(id);
//	return "success";
//}
//throw new productnotfoundExpception("no product found with given id"+id);
//	}
//this.repo.deleteById(id);
//return "success";
	}
	@Override
	public product getbyid(int id) {
		if(repo.findById(id).isEmpty()) 
			throw new productnotfoundExpception("no product found with given id"+id);
		return repo.findById(id).get();
		
	}
//	public List<product> findproductwithsorting(String field)
//	{
//		
//		return repo.findAll(Sort.by(Sort.Direction.ASC,field));
//	}

//	public Page<product> listall(){
//		Pageable pageable=PageRequest.of(0, 10);
//	return	repo.findAll(pageable);
//	}
	@Override
	public String update(product product) {
		product existingproduct= repo.findById(product.getId()).orElse(null);
				if(existingproduct==null) {
					throw  new productnotfoundExpception("no product found with given id"+product.getId());
				}
				else {
					existingproduct.setQuantity(product.getQuantity());
                    existingproduct.setName(product.getName());
                    existingproduct.setPrice(product.getPrice());
				repo.save(existingproduct);
				return "product successully saved";
				}
	}

	@Override
	public List<product> getall() {
		return repo.findAll();
	}

	

}
