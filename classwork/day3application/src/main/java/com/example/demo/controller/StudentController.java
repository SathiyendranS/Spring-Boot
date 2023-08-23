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

import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
     @Autowired
	StudentService sser;
     @PostMapping("addnstudent")
     public  List<StudentEntity>add(@RequestBody  List<StudentEntity>ss)
     {
    	 return sser.saveinfo(ss);
     }
     @PostMapping("addnstudent1")
     public  StudentEntity add(@RequestBody  StudentEntity ss)
     {
    	 return sser.save(ss);
     }
     @GetMapping("show")
     public List<StudentEntity> show ()
     {
    	 return sser.showinfo();
     }
     @PutMapping("update")
     public StudentEntity modify(@RequestBody StudentEntity ss)
     {
    	 return sser.changeinfo(ss);
     }
     @DeleteMapping("delete")
     public String del(@RequestBody StudentEntity ss)
     {
    	 sser.deleteinfo(ss);
    	 return "deleted sucessfully";
     }
     @DeleteMapping("delid/{id}")
     public void deletemyid(@PathVariable("id")  int id)
     {
    	sser.deleteid(id);
     }
    	
     
  

	
}
