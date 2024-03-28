package com.TMS.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Tasks {
	
	@Id
	@GeneratedValue
	Long id;
	String title;
	LocalDate DueDate;
	String Status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDueDate() {
		return DueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		DueDate = dueDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Tasks(Long id, String title, LocalDate dueDate, String status) {
		super();
		this.id = id;
		this.title = title;
		DueDate = dueDate;
		Status = status;
	}
	public Tasks() {
		super();
	}
	@Override
	public String toString() {
		return "Tasks [id=" + id + ", title=" + title + ", DueDate=" + DueDate + ", Status=" + Status + "]";
	}
	
	
}
