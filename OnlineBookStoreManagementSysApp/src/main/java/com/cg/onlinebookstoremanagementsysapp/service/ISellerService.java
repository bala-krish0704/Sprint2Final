package com.cg.onlinebookstoremanagementsysapp.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlinebookstoremanagementsysapp.entity.Seller;

public interface ISellerService {

	//Get Methods
		public List<Seller> getAllSellers();
		public Optional<Seller> getSellerById(long sellerId);
		
		//Post Methods
		public Optional<Seller> addSeller(Seller seller);

		//Put Methods
		public String updateSellerById(Seller sellerId);

		//Delete Methods
		public String deleteSellerById(long sellerId);
		
		
}
