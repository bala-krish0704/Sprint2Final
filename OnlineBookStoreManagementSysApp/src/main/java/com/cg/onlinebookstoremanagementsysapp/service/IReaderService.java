package com.cg.onlinebookstoremanagementsysapp.service;


import java.util.List;
import java.util.Optional;

import com.cg.onlinebookstoremanagementsysapp.entity.*;





public interface IReaderService {
		
	//Get Methods
			public List<Reader> getAllReader();
			public Optional<Reader> getReaderById(long readerId);
			
			//Post Methods
			public Optional<Reader> addReader(Reader reader);
			//public List<Reader> addReader(Reader reader);//Bulk Inserting for Reader
			
			//Put Methods
			public String updateReaderById(Reader readerId);

			
			//Delete Methods
			public String deleteReaderById(long readerId);
			
			//Get User by Email
			Optional<Reader> getReaderByEmail(String email);
			
	}
