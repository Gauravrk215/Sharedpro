package com.sharedpro.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sharedpro.Model.Model;
import com.sharedpro.Service.SharedproService;

@RestController
public class SharedproController {
	
	@Autowired
	SharedproService sharedproService;
	
	@PostMapping("/save")
	public Model save(@Valid @RequestBody Model model) {
		 Model mod = sharedproService.save(model);
		 return mod;
	}

	@GetMapping("/getdetails")
	public List<Model> getdetails() {
		 List<Model> mod = sharedproService.getdetails();
		 return mod;
	}
	
	@GetMapping("/getdetailsbyDepartment_id/{Department_id}")
	public Model getdetailsbyDepartmentId(@PathVariable int Department_id ) {
		 Model mod = sharedproService.getdetailsbyDepartmentId(Department_id);
		 return mod;
	}
	
	@PutMapping("/update")
	public Model update(@Valid @RequestBody Model model) {
		 Model mod = sharedproService.update(model);
		 return mod;
	}
	
	@DeleteMapping("/deletebyId/{id}")
	public void delete(@PathVariable int id) {
		sharedproService.delete(id);
		 
	}
}

