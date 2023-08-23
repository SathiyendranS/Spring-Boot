package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ServiceEntity;
import com.example.demo.repository.ServiceRepo;

@Service
public class ServiceService {

	@Autowired
	ServiceRepo sr;
	public ServiceEntity adds(ServiceEntity se)
	{
		return sr.save(se);
	}
	public List<ServiceEntity> addsl(List<ServiceEntity> se)
	{
		return (List<ServiceEntity>)sr.saveAll(se);
	}
	public List<ServiceEntity> showinfos()
	{
		return sr.findAll();
	}
	public Optional<ServiceEntity>getId(int freelancerid)
	{
		return sr.findById(freelancerid);
	}
	public ServiceEntity changeinfos(ServiceEntity se)
	{
		return sr.saveAndFlush(se);
	}
	public String updateinfoid(int freelancerid,ServiceEntity se)
	{
		if(sr.existsById(freelancerid))
		{
			sr.saveAndFlush(se);
			return "updated";
		}
		else
		{
			return "not exist";
		}
			
	}
	public String deleted(int id)
	{
		sr.deleteById(id);
		return "true";
	}
}
