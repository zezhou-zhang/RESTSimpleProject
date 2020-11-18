package com.REST.app.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.REST.app.model.client_management;
import com.REST.app.repository.client_repository;

@RestController
public class client_resounce_controller {
	@Autowired
	client_repository c_r;
	
	//Get all clients information
	@GetMapping(value="/clients")
	public List<client_management> getAll(){
		return c_r.findAll();
	}
	
	//Get client information by client id
	@GetMapping(value="/clients/clientId={id}")
	public Optional<client_management> getClientById(@PathVariable(value = "id") int client_id){
		return c_r.findById(client_id);
	}
	
	//Get information by client name
	@GetMapping(value="/clients/clientName={name}")
	public List<client_management> getClientsByName(@PathVariable(value = "name") String name){
		 return c_r.findByName(name);

	}
}
