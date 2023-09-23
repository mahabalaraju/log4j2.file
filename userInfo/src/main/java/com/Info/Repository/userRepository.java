package com.Info.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Info.entity.user;
@Repository
public interface userRepository extends JpaRepository<user, Integer> {

}
