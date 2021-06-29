package com.test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="STUDENT")
public class Student{
	
	@Id @GeneratedValue
	
	private int student_id;
	private String student_name;
	private int student_total_points;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_total_points() {
		return student_total_points;
	}
	public void setStudent_total_points(int student_total_points) {
		this.student_total_points = student_total_points;
	}
	
	
	
	
	

	
	}
	
