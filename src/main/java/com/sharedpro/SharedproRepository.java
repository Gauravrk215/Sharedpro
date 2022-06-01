package com.sharedpro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sharedpro.Model.Model;

@Repository
public interface SharedproRepository extends CrudRepository<Model,Integer> {
	 
	Model findById(int Department_id);

}
