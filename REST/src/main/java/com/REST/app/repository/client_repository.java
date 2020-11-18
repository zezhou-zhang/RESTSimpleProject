package com.REST.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.REST.app.model.client_management;


public interface client_repository extends JpaRepository<client_management, Integer> {
	List<client_management> findByName(String Name);
}


