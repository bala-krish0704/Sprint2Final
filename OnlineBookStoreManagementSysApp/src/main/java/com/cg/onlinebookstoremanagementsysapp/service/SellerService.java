package com.cg.onlinebookstoremanagementsysapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.cg.onlinebookstoremanagementsysapp.entity.Seller;
import com.cg.onlinebookstoremanagementsysapp.repository.SellerRepository;

@Service
public class SellerService implements ISellerService{
	@Autowired
	private SellerRepository sellerRepo;

	
	@Override
	public List<Seller> getAllSellers() {
		// TODO Auto-generated method stub
		return sellerRepo.findAll();
	}

	@Override
	public Optional<Seller> getSellerById(long sellerId) {
		// TODO Auto-generated method stub
		return sellerRepo.findById(sellerId);
	}

	@Override
	public Optional<Seller> addSeller(Seller seller) {
		if (sellerRepo.existsById(seller.getSellerId())){
            return Optional.empty();
        }else{
            return Optional.of(sellerRepo.save(seller));
        }
	}

	@Override
	public String updateSellerById(Seller sellerId) {
		if (sellerRepo.existsById(sellerId.getSellerId())){
			Seller adUp =sellerRepo.save(sellerId);
				if(adUp!=null)
					return "Seller Updated Successfully";
	    }else{
	        return "Can't Update Seller caused by Wrong information ";
	    }
		return null;
	}

	@Override
	public String deleteSellerById(long sellerId) {
		if (sellerRepo.existsById(sellerId) && sellerId!=0){
	        sellerRepo.deleteById(sellerId);
	        	return sellerId + " deleted successfully!";
	    }else{
	        return "The data does not exist in records!";
	    }
	    
	}

	public Optional<Seller> getSellersById(long sellerId) {
		// TODO Auto-generated method stub
		return sellerRepo.findById(sellerId);
	}
}
