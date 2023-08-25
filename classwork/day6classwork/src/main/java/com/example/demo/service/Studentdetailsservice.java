package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentdetailsEntity;
import com.example.demo.repository.StudentdetailsRepo;

@Service
public class Studentdetailsservice {
	@Autowired
	StudentdetailsRepo sr;
	public StudentdetailsEntity add1(StudentdetailsEntity se)
	{
		return sr.save(se);
	}
	public List<StudentdetailsEntity>addn(List<StudentdetailsEntity> se)
	{
		return(List<StudentdetailsEntity>)sr.saveAll(se);
	}
	public List<StudentdetailsEntity>showinfo()
	{
		return sr.findAll();
	}
	public List <StudentdetailsEntity> sortinfo(String s)
	{
		return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<StudentdetailsEntity>getbypage(int pgno,int pgsize)
	{
		Page<StudentdetailsEntity>p=sr.findAll(PageRequest.of(pgno,pgsize));
		return p.getContent();
	}
	public void deleteid(int babyid)
	
	{    
		if(sr.existsById(babyid))
		{
		sr.deleteById(babyid);
		}
	}

}
