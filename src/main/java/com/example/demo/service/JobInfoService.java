package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Jobinfo;

public interface JobInfoService {
	 public List<Jobinfo> findAllData();
	 public List<Jobinfo> findByUser(String user);
	 public void saveData(Jobinfo jobinfo);
	 public void delete(String user);
}
