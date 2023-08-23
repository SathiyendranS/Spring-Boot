package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="messagedetails")

public class MessageEntity {
	@Id
	private int msg_id;
	private int sender_id;
	private int receiver_id;
	private String message_text;
	private Timestamp time;
	public MessageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(int msg_id) {
		this.msg_id = msg_id;
	}
	public int getSender_id() {
		return sender_id;
	}
	public void setSender_id(int sender_id) {
		this.sender_id = sender_id;
	}
	public int getReceiver_id() {
		return receiver_id;
	}
	public void setReceiver_id(int receiver_id) {
		this.receiver_id = receiver_id;
	}
	public String getMessage_text() {
		return message_text;
	}
	public void setMessage_text(String message_text) {
		this.message_text = message_text;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public MessageEntity(int msg_id, int sender_id, int receiver_id, String message_text, Timestamp time) {
		super();
		this.msg_id = msg_id;
		this.sender_id = sender_id;
		this.receiver_id = receiver_id;
		this.message_text = message_text;
		this.time = time;
	}
}