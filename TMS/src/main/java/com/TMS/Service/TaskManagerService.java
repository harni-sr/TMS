package com.TMS.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TMS.Model.Tasks;
import com.TMS.Repository.TaskManagerRepo;

@Service
public class TaskManagerService {
	
	@Autowired
	TaskManagerRepo taskrepo;

	public List<Tasks> getAllTasks(){
		return taskrepo.findAll();
	}
	
	public Optional<Tasks> getTasksById(Long id){
		return taskrepo.findById(id);
	}
	
	public Tasks saveTask(Tasks task){
		return taskrepo.save(task);
	}
	
	public void deleteTask(Long id) {
		taskrepo.deleteById(id);
	}
	
	public Tasks updateById(Long id,Tasks updatedTask) {
		Optional<Tasks> Task = taskrepo.findById(id);
		
		if(Task.isPresent()) {
			Tasks existingTask = Task.get();
			existingTask.setTitle(updatedTask.getTitle());
			existingTask.setStatus(updatedTask.getStatus());
			existingTask.setDueDate(updatedTask.getDueDate());
			return taskrepo.save(existingTask);
		}else {
			return null;
			
		}

	}
}
