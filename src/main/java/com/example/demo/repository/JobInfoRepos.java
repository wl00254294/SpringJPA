package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Jobinfo;

public interface JobInfoRepos extends JpaRepository<Jobinfo,Long> {
	
	List<Jobinfo> findAllData();
	
	List<Jobinfo> findByUser(@Param("user") String user);
	
	@Query(value = "delete from Jobinfo where user=:user")
    @Modifying
	int deleteByUser(@Param("user") String user);
}
