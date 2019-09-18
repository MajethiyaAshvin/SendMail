package com.service.ServiceExample.ServiceImpl;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import com.service.ServiceExample.model.EmpModel;
import com.service.ServiceExample.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	private static Map<String,EmpModel>empRepo=new TreeMap<>();
	
	static {
		EmpModel empdtail=new EmpModel();
		empdtail.setId("1");
		empdtail.setName("Dipak");
		empdtail.setCity("Talala");
		empRepo.put(empdtail.getId(), empdtail);

		EmpModel empdtail1=new EmpModel();
		empdtail1.setId("2");
		empdtail1.setName("Ajay");
		empdtail1.setCity("Sutrapada");
		empRepo.put(empdtail1.getId(), empdtail1);
	}
	@Override
	public void createProduct(EmpModel emp) {
		empRepo.put(emp.getId(), emp);
	}
	
	@Override
	public void updateProduct(String id, EmpModel product) {
		empRepo.remove(id);
		product.setId(id);
		empRepo.put(id,product);
	}
	@Override
	public void deleteProduct(String id) {
		empRepo.remove(id);	
	}

	@Override
	public Collection<EmpModel> getProducts() {
		return empRepo.values();
	}
}
