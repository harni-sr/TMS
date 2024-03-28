package com.TMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TMS.Model.Tasks;

public interface TaskManagerRepo extends JpaRepository<Tasks,Long>{	

}
