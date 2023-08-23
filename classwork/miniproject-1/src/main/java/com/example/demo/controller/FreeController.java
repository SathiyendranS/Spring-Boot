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
import com.example.demo.model.FreeEntity;
import com.example.demo.service.FreeService;

@RestController
public class FreeController {
	@Autowired
	FreeService fser;
	@PostMapping("add1")
	public FreeEntity addone(@RequestBody FreeEntity fe)
	{
		return fser.savedata(fe);
	}
	@PostMapping("addn")
	public List<FreeEntity> add (@RequestBody List<FreeEntity>fe)
	{
		return fser.saveinfo(fe);
	}
	@GetMapping("show")
	public List<FreeEntity> show()
	{
		return fser.showinfo();
	}
	@PutMapping("update")
    public FreeEntity modify(@RequestBody FreeEntity fe)
    {
   	 return fser.changeinfo(fe);
    }
    @DeleteMapping("delete")
    public String del(@RequestBody FreeEntity fe)
    {
   	 fser.deleteinfo(fe);
   	 return "deleted sucessfully";
    }
    @DeleteMapping("delid/{id}")
    public void deletemyid(@PathVariable("id")  int id)
    {
   	fser.delbyid(id);
    }


}
