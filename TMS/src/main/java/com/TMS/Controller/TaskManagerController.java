package com.TMS.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TMS.Model.Tasks;
import com.TMS.Service.TaskManagerService;

@RestController
@CrossOrigin("*")
public class TaskManagerController {
	
	@Autowired
	TaskManagerService service;
	
	@GetMapping("/tasks")
	public List<Tasks> getAllTasks(){
		return service.getAllTasks();
	}
	
	@GetMapping("/tasks/{id}")
	public Optional<Tasks> getTasksById(@PathVariable Long id){
		return service.getTasksById(id);
	}
	
	@PostMapping("/tasks")
	public Tasks saveTask(@RequestBody Tasks task){
		return service.saveTask(task);
	}
	
	@DeleteMapping("/tasks/{id}")
	public String deleteTask(@PathVariable Long id) {
		service.deleteTask(id);
		return "item deleted";
	}
	
	@PutMapping("/tasks/{id}")
	public Tasks updateById(@PathVariable Long id,@RequestBody Tasks task) {
		Tasks updated = service.updateById(id, task);
		if(updated != null) {
			return updated;
		}else {
			return null;
		}
	}

}
