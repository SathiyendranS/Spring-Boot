package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bookentity;
import com.example.demo.service.Bookservice;

@RestController
public class BookController {
	@Autowired
	Bookservice bser ;
	@PostMapping("addn")
	public List<Bookentity> add (@RequestBody List<Bookentity>be)
	{
		return bser.saveinfo(be);
	}
	@PostMapping("add1")
	public Bookentity addone(@RequestBody Bookentity be)
	{
		return bser.savedata(be);
	}
	@GetMapping("show")
	public List<Bookentity> show()
	{
		return bser.showinfo();
	}
	@PutMapping("update")
    public Bookentity modify(@RequestBody Bookentity be)
    {
   	 return bser.changeinfo(be);
    }
    @DeleteMapping("delete")
    public String del(@RequestBody Bookentity be)
    {
   	 bser.deleteinfo(be);
   	 return "deleted sucessfully";
    }
    @DeleteMapping("delid/{id}")
    public void deletemyid(@PathVariable("id")  int id)
    {
   	bser.deleteid(id);
    }

}
