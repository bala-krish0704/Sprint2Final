package com.cg.onlinebookstoremanagementsysapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinebookstoremanagementsysapp.entity.*;



@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {
	
				
	}



