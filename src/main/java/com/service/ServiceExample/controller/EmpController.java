package com.service.ServiceExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.ServiceExample.model.EmpModel;
import com.service.ServiceExample.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	EmpService empService;
	
	@RequestMapping(value = "/list")
	public ResponseEntity<Object> getEmployee() {
		return new ResponseEntity<>(empService.getProducts(), HttpStatus.OK);
	}
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody EmpModel product) {

		empService.updateProduct(id, product);
		return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable("id") String id) {
		empService.deleteProduct(id);
		return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Object> createProduct(@RequestBody EmpModel product) {
		empService.createProduct(product);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}
}
