package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MessageEntity;
import com.example.demo.service.MessageService;

@RestController
public class MessageController {
	@Autowired
	MessageService mser;
	@PostMapping("add1msg")
	public MessageEntity addone(@RequestBody MessageEntity me)
	{
		return mser.savedata(me);
	}
	@PostMapping("addnmsg")
	public List<MessageEntity> add (@RequestBody List<MessageEntity>me)
	{
		return mser.saveinfo(me);
	}
	@GetMapping("showmsg")
	public List<MessageEntity> show()
	{
		return mser.showinfo();
	}
	@PutMapping("updatemsg")
    public MessageEntity modify(@RequestBody MessageEntity me)
    {
   	 return mser.changeinfo(me);
    }
    @DeleteMapping("deletemsg")
    public String del(@RequestBody MessageEntity me)
    {
   	 mser.deleteinfo(me);
   	 return "deleted sucessfully";
    }
}