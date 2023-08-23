package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.ServiceEntity;
import com.example.demo.service.ServiceService;

@RestController
public class ServiceController {
	
	@Autowired
	ServiceService sser;
	@PostMapping("addf1")
	public ServiceEntity addf(@RequestBody  ServiceEntity se)
	{
		return sser.adds(se);
	}
	@PostMapping("addfn")
	public List<ServiceEntity> addfn (@RequestBody List<ServiceEntity>se)
	{
		return sser.addsl(se);
	}
	@GetMapping("shows")
	public List<ServiceEntity> show()
	{
		return sser.showinfos();
	}
	@GetMapping("showbyid/{freelancerid}")
	public Optional <ServiceEntity>showbyid(@PathVariable int freelancerid)
	{
		return sser.getId(freelancerid);
	}
	@PutMapping("updates")
	public ServiceEntity change (@RequestBody ServiceEntity se)
	{
		return sser.changeinfos(se);
	}
	@PutMapping("updates1/{freelancerid}")
	public String updateid(@PathVariable int freelancerid,@RequestBody ServiceEntity se)
	{
		return sser.updateinfoid(freelancerid,se);
	}

}
