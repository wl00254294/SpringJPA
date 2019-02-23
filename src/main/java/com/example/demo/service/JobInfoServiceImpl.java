package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.entity.Jobinfo;
import com.example.demo.repository.JobInfoRepos;

@Service
@Transactional
public class JobInfoServiceImpl implements JobInfoService{

	 @Autowired
     private JobInfoRepos jobinforepos;
	
	 public List<Jobinfo> findAllData()
	 {
		 return jobinforepos.findAllData();
	 }
	 
	 public List<Jobinfo> findByUser(String user)
	 {
		 return jobinforepos.findByUser(user);
	 }
	 
	 public void saveData(Jobinfo jobinfo)
	 {
		 jobinforepos.save(jobinfo);
	 }
	 
	 public void delete(String user)
	 {
		 jobinforepos.deleteByUser(user);
		 
		
	 }
}
