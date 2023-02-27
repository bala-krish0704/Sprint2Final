package com.cg.onlinebookstoremanagementsysapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinebookstoremanagementsysapp.entity.Admin;
import com.cg.onlinebookstoremanagementsysapp.service.AdminService;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	
	@PostMapping
	public String saveAdmin(@RequestBody Admin admin) {
		try {
			Optional<Admin> _admin = adminService.addAdmin(admin);
			if(_admin.isPresent()) {
				return "The new Admin Added Successfully";
			}else {
				return "Something went wrong during admin Insertion";
			}
		} catch(Exception e) {
			return "Something Went Wrong during admin Insertion";
		}
	}
	
	@GetMapping
	public List<Admin> getAllAdmin(){
		return adminService.getAdminAll();
	}
	
	@GetMapping("/{admin_id}")
	public Optional<Admin> getAdminById(@PathVariable("admin_id") long adminId){
		return adminService.getAdminById(adminId);
	}
	
	@PutMapping
	public String updateAdmin(@RequestBody Admin admin) {
		String _admin = adminService.updateAdminById(admin);
		if(_admin.isEmpty()) {
			return "The Given Information was wrong";
		}
			else {
				return "Admin Updated Successfully";
			}

	}	
	@DeleteMapping("/{admin_id}")
	public String deleteEmployeeById(@PathVariable("admin_id") long adminId) {
		String result = adminService.deleteAdminById(adminId);
		return result;
	}
	

}
