package com.sharedpro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharedpro.SharedproRepository;
import com.sharedpro.Model.Model;

@Service
public class SharedproService {
	
	@Autowired
	SharedproRepository sharedproRepository;

	public Model save(Model model) {
		// TODO Auto-generated method stub
		return sharedproRepository.save(model);
	}

	public List<Model> getdetails() {
		// TODO Auto-generated method stub
		return (List<Model>) sharedproRepository.findAll();
		}
	
	public Model getdetailsbyDepartmentId(int Department_id) {
		// TODO Auto-generated method stub
		return sharedproRepository.findById(Department_id);
	}

	public Model update(Model model) {
		// TODO Auto-generated method stub
		return sharedproRepository.save(model);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		 sharedproRepository.deleteById(id);
	}

	


}
