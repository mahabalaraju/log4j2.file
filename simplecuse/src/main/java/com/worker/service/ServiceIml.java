package com.worker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worker.Exception.workernotfoundexception;
import com.worker.Repo.workerRepo;
import com.worker.entity.worker;
@Service
public class ServiceIml implements workerService {

	@Autowired
	private workerRepo workrepo;

	@Override
	public String delete(int id) {
		if (workrepo.findById(id).isEmpty())
			throw new workernotfoundexception("worker not found with given id" + id);
		workrepo.deleteById(id);
		return "delete success";
	
//		return Optional.ofNullable(workrepo.findById(id))
//				.orElseThrow(() -> new workernotfoundexception("worker not found with given id" + id));

	}

	@Override
	public String update(worker worker) {
		worker existingworker = workrepo.findById(worker.getId()).orElse(null);
		if (existingworker == null)
			throw new workernotfoundexception("worker not found with given id" + worker.getId());
		else {
			worker newworker = new worker();
			newworker.setAddress(existingworker.getAddress());
			newworker.setEmailId(existingworker.getEmailId());
			newworker.setName(existingworker.getName());
			newworker.setPassword(existingworker.getPassword());

			workrepo.save(newworker);
		}
return "update successful";
	}

	@Override
	public List<worker> getall() {
		return workrepo.findAll();
	}

	@Override
	public String add(worker worker) {
		workrepo.save(worker);
		return "success";
	}

	
	@Override
	public Optional<worker> getbyid(int id) {
		return Optional.ofNullable(Optional.ofNullable(workrepo.findById(id).get())
		.orElseThrow(() -> new workernotfoundexception("worker not found with given id" + id)));

	}

//	public String update(worker employee) {
//		worker existingemployee =workrepo.findById(employee.getId()).orElse(null);
//		if(existingemployee==null) {
//			throw new nosuchemployee
//		}
//		else {
//			existingemployee.setEmailId(asdfa);
//			existingemployee.ser
//		}

}
