package com.cg.onlinebookstoremanagementsysapp.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlinebookstoremanagementsysapp.entity.*;
public interface IAdminService {

	
	//Get Methods
	public List<Admin> getAdminAll();
	public Optional<Admin> getAdminById(long adminId);
	public Admin exitstByEmail(String email, String pass);
	
	//Post Methods
	public Optional<Admin> addAdmin(Admin admin);
	
	//Put Methods
	public String updateAdminById(Admin adminId);
	
	//Delete Methods
	public String deleteAdminById(long adminId);
//	public String loginAdmin(String email,String pass);
	
	
}
