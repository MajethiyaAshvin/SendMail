package com.service.ServiceExample.ServiceImpl;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.service.ServiceExample.model.Student;
import com.service.ServiceExample.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	public static Map<String,Student>stuRepo=new HashMap<>();
	
	static {
		Student student3=new Student();
		student3.setId("3");
		student3.setName("abc");
		student3.setCity("xyz");
		student3.setSubject("java");
		stuRepo.put(student3.getId(), student3);
		
		Student s1=new Student();
		s1.setId("4");
		s1.setName("abc");
		s1.setCity("xyz");
		s1.setSubject("java");
		stuRepo.put(s1.getId(), s1);
		
		Student s2=new Student();
		s2.setId("5");
		s2.setName("abc");
		s2.setCity("xyz");
		s2.setSubject("java");
		stuRepo.put(s2.getId(), s2);
	}
	
	@Override
	public void createStudent(Student student) {
		stuRepo.put(student.getId(), student);
	}
	@Override
	public void deleteStudent(String id) {
		stuRepo.remove(id);
	}
	@Override
	public void update(String id, Student student) {
		stuRepo.remove(id);
		stuRepo.put(id, student);
	}
	@Override
	public Collection<Student> getStudent() {
		return stuRepo.values();
	}
}
