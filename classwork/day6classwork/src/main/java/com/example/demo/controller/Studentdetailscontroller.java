package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentdetailsEntity;
import com.example.demo.service.Studentdetailsservice;

@RestController
public class Studentdetailscontroller {
	@Autowired
	Studentdetailsservice sser;
	@PostMapping("add1")
	public StudentdetailsEntity saveinfo(@RequestBody StudentdetailsEntity se)
	{
		return sser.add1(se);
	}
	@PostMapping("addn")
	public List<StudentdetailsEntity> savelist(@RequestBody List<StudentdetailsEntity> se)
	{
		return sser.addn(se);
	}
	@GetMapping("show")
	public List<StudentdetailsEntity>shows()
	{
		return sser.showinfo();
	}
	 @GetMapping("sortshow/{firstname}")
     public List<StudentdetailsEntity>getsortinfo(@PathVariable String firstname)
     {
    	 return sser.sortinfo(firstname);
     }
     @GetMapping("paging/{pgno}/{pgsize}")
     public List<StudentdetailsEntity>showpageinfo(@PathVariable int pgno,@PathVariable int pgsize)
     {
    	 return sser.getbypage(pgno, pgsize);
     }
     @DeleteMapping("dele/{babyid}")
     public String  delid(@PathVariable("babyid") int babyid)
     
     {    
    	  sser.deleteid(babyid);
    	  return "deleted";
     }

}
