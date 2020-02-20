package com.howtodoinjava.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.EmpPunchLog;

@Repository
public interface EmployeePunchRepository 
			extends CrudRepository<EmpPunchLog, Long> {

}
