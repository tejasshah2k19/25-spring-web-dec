package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.EmployeeBean;

@Repository
public class EmployeeDao {

	// query
	@Autowired
	JdbcTemplate stmt;

	public void addEmployee(EmployeeBean employeeBean) {
		stmt.update("insert into employees (firstName,lastName,email,password,birthYear,position) values (?,?,?,?,?,?)",
				employeeBean.getFirstName(), employeeBean.getLastName(), employeeBean.getEmail(),
				employeeBean.getPassword(), employeeBean.getBirthYear(), employeeBean.getPosition());
	}

	public List<EmployeeBean> getAllEmployees() {
		List<EmployeeBean> employees = stmt.query("select * from employees",
				new BeanPropertyRowMapper(EmployeeBean.class));
		return employees;
	}
	// firstname -> firstName

	public void deleteEmployee(Integer employeeId) {
		stmt.update("delete from employees where employeeId = ?", employeeId);
	}

	public List<EmployeeBean> searchByFirstName(String firstName) {

		List<EmployeeBean> employees = stmt.query("select * from employees where firstName like ? ",
				new BeanPropertyRowMapper(EmployeeBean.class),"%"+firstName+"%");
		return employees;
	}
}
