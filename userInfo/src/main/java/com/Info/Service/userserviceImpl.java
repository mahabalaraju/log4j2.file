package com.Info.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Info.Repository.userRepository;
import com.Info.entity.user;


@Service
public class userserviceImpl implements userService {

	@Autowired
	private userRepository userrepo;
	@Override
	public List<user> getallusers() {
	List<user> getall=	userrepo.findAll();
		return getall;
	}

	@Override
	public String delete(int id) {
		if(userrepo.existsById(id)) {
			userrepo.deleteById(id);
			return "success";
		}
		return "record not found";
	}

	@Override
	public user getbyid(int id) {
	Optional<user> getbyid=userrepo.findById(id);
	if(getbyid.isPresent()) {
	return	getbyid.get();
	}
		return null;
	}

	@Override
	public String upsert(user user) {
	 userrepo.save(user);
		return "success";
	}

}
