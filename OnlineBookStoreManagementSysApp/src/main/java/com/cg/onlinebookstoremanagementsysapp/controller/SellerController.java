package com.cg.onlinebookstoremanagementsysapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cg.onlinebookstoremanagementsysapp.service.SellerService;
import com.cg.onlinebookstoremanagementsysapp.entity.Seller;

@RestController
@RequestMapping("/api/v1/seller")
public class SellerController {
	@Autowired
	private SellerService sellerService;
	
	
	@PostMapping
	public String saveSeller(@RequestBody Seller seller) {
		try {
			Optional<Seller> Vbook = sellerService.addSeller(seller);
			if(Vbook.isPresent()) {
				return "The new Seller Added Successfully";
			}else {
				return "Something went wrong during seller Insertion";
			}
		} catch(Exception e) {
			return "Something Went Wrong during seller Insertion";
		}
	}
	
	@GetMapping
	public List<Seller> getAllSeller(){
		return sellerService.getAllSellers();
	}
	
	@GetMapping("/{seller_id}")
	public Optional<Seller> getSellerById(@PathVariable("seller_id") long sellerId){
		return sellerService.getSellersById(sellerId);
	}
	
	@PutMapping
	public String updateSeller(@RequestBody Seller seller) {
		String Vbook = sellerService.updateSellerById(seller);
		if(Vbook.isEmpty()) {
			return "The Given Information was wrong";
		}
			else {
				return "Seller Updated Successfully";
			}

	}	
	@DeleteMapping("/{seller_id}")
	public String deleteEmployeeById(@PathVariable("seller_id") long seller_id) {
		String result = sellerService.deleteSellerById(seller_id);
		return result;
	}
}
