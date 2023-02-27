package com.cg.onlinebookstoremanagementsysapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinebookstoremanagementsysapp.entity.Admin;
import com.cg.onlinebookstoremanagementsysapp.repository.AdminRepository;

@Service
public class AdminService implements IAdminService{
	@Autowired
	private AdminRepository adminRepo;

	@Override
	public Optional<Admin> getAdminById(long adminId) {
		return adminRepo.findById(adminId);
	}

	@Override
	public List<Admin> getAdminAll() {
		return adminRepo.findAll();
	}

	@Override
	public Optional<Admin> addAdmin(Admin admin) {
		if (adminRepo.existsById(admin.getAdminId())){
            return Optional.empty();
        }else{
            return Optional.of(adminRepo.save(admin));
        }
}

	@Override
	public String updateAdminById(Admin adminId) {
		if (adminRepo.existsById(adminId.getAdminId())){
			Admin adUp =adminRepo.save(adminId);
				if(adUp!=null)
					return "Admin Updated Successfully";
	    }else{
	        return "Can't Update Admin caused by Wrong information ";
	    }
		return null;
	}

	@Override
	public String deleteAdminById(long adminId) {
		if (adminRepo.existsById(adminId) && adminId!=0){
	        adminRepo.deleteById(adminId);
	        	return adminId + " deleted successfully!";
	    }else{
	        return "The data does not exist in records!";
	    }
	    
	}

	@Override
	public Admin exitstByEmail(String email, String pass) {
		// TODO Auto-generated method stub
		return null;
	}
	}

