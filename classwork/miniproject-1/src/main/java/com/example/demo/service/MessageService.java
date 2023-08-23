package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.MessageEntity;
import com.example.demo.repository.MessageRepo;

@Service
public class MessageService {
	@Autowired
	MessageRepo mr;
	public MessageEntity savedata(MessageEntity me)
	{
		return mr.save(me);
	}
	public List<MessageEntity> saveinfo(List<MessageEntity> me)
	{
		return (List<MessageEntity>)mr.saveAll(me);
	}
	public List<MessageEntity> showinfo()
	{
		return mr.findAll();
	}
	 public MessageEntity changeinfo(MessageEntity me)
	 {
		 return mr.saveAndFlush(me);
	 }
	 public String deleteinfo(MessageEntity me)
	 {
		 mr.delete(me);
		 return "deleted Sucessfully";
	 }
	 public void delbyid(int id)
	 {
		 mr.deleteById(id);
	 }
}