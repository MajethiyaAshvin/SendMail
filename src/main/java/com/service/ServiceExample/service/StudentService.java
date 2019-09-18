package com.service.ServiceExample.service;

import java.util.Collection;

import com.service.ServiceExample.model.Student;

public interface StudentService {

	
	public abstract void createStudent(Student student);
	public abstract void deleteStudent(String id);
	public abstract void update(String is,Student student);
	public Collection<Student> getStudent();
}
