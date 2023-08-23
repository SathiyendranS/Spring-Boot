package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.FreeEntity;
import com.example.demo.repository.FreeRepo;

@Service
public class FreeService {
     @Autowired
     FreeRepo fr;
	 public FreeEntity savedata(FreeEntity fe)
	 {
		 return fr.save(fe);
	 }
	 public List<FreeEntity> saveinfo(List<FreeEntity> fe)
	 {
		 return(List<FreeEntity>)fr.saveAll(fe);
	 }
	 public List<FreeEntity> showinfo()
	 {
		 return fr.findAll();
	 }
	 public FreeEntity changeinfo(FreeEntity fe)
	 {
		 return fr.saveAndFlush(fe);
	 }
	 public String deleteinfo(FreeEntity fe)
	 {
		 fr.delete(fe);
		 return "deleted Sucessfully";
	 }
	 public String delbyid(int id)
	 
	 { if(fr.existsById(id))
	 {
		 fr.deleteById(id);
		 return "deleted";
	 }
	 else
		 return "Not find";
	 
	 
	 }
	
	 
}
