package com.SpringJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJdbc.entity.Student;

public class StudentDaoImple implements StudentDao{
	private JdbcTemplate jdbcTemplate;
     public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(Student student) {
		String query="insert into springjdbc.student(id,name,email) value(?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getEmail());
		
		
		return r;
	}
	public int Update(Student student) {
		String query="update springjdbc.student  set name=?,email=? where id=? ";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getEmail(),student.getId());
		
		
		return r;
		
	}

}
