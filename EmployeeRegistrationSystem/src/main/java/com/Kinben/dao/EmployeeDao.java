package com.Kinben.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kinben.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Long>{

}
