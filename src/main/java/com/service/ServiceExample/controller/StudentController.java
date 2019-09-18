package com.service.ServiceExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.ServiceExample.model.Student;
import com.service.ServiceExample.service.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/studentlist")
	public ResponseEntity<Object> getStudent(){
		
		return new ResponseEntity<>(studentService.getStudent(),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/studentadd",method=RequestMethod.POST)
	public ResponseEntity<Object> addStudent(@RequestBody Student student){
		studentService.createStudent(student);
		return new ResponseEntity<>("add Successe",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/updatestudent/{id}",method=RequestMethod.POST)
	public ResponseEntity<Object> addStudent(@RequestBody Student student,@PathVariable("id")String name){
		
		studentService.update(name, student);
		return new ResponseEntity<>("update SUCCSESSSe",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deletestudent/{id}",method=RequestMethod.POST)
	public ResponseEntity<Object> delelete(@PathVariable("id")String name){
		studentService.deleteStudent(name);
		return new ResponseEntity<>("delete success",HttpStatus.OK);
	}
}
