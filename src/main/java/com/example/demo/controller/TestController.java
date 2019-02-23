package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Jobinfo;
import com.example.demo.service.JobInfoService;
import com.example.demo.service.JobInfoServiceImpl;

@RestController
public class TestController {
	@Autowired
    private JobInfoService myService;
	
	@RequestMapping("/findall")
	public List<Jobinfo> getBooks()
    {
        return myService.findAllData();
    }
	
	@RequestMapping("/finduser/{user}")
	public List<Jobinfo> getBooks2(@PathVariable("user") String  user)
    {
        return myService.findByUser(user);
    }	
	
	@RequestMapping(value = "/add/{tokenid}/{user}")
    public String addUser(@PathVariable("tokenid") String tokenid, 
    		@PathVariable("user") String user)
    {
        Jobinfo jobinfo = new Jobinfo();
      
        jobinfo.setTokenid(tokenid);
        jobinfo.setUser(user);
        myService.saveData(jobinfo);
        return "Success Add";
    }
	
	
	@RequestMapping("/deluser/{user}")
	public String getBooks3(@PathVariable("user") String  user)
    {
       
        myService.delete(user);
        return user+" has been deleted!";
    }	
}
