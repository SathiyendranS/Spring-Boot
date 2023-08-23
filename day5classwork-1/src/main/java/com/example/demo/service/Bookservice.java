package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bookentity;
import com.example.demo.repository.BookRepo;

@Service
public class Bookservice {
	@Autowired
	BookRepo br;
	
	 public Bookentity savedata( Bookentity be)
	 {
		 return br.save(be);
	 }
	 public List<Bookentity>saveinfo(List<Bookentity> be)
	 {
		 return(List<Bookentity>)br.saveAll(be);
	 }
	 public List<Bookentity>showinfo()
	 {
		 return br.findAll();
	 }
		public Bookentity changeinfo(Bookentity be)
		{
			return br.saveAndFlush(be);
		}
		public void deleteinfo(Bookentity be)
		{
			br.delete(be);
		}
		public void deleteid(int id)
		{
			br.deleteById(id);
		}
		

}
