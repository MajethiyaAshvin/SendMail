package com.service.ServiceExample.service;

import java.util.Collection;

import com.service.ServiceExample.model.EmpModel;

public interface EmpService {
	
	public abstract void createProduct(EmpModel product);
	   public abstract void updateProduct(String id, EmpModel product);
	   public abstract void deleteProduct(String id);
	   public abstract Collection<EmpModel> getProducts();
}
