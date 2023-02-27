package com.cg.onlinebookstoremanagementsysapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinebookstoremanagementsysapp.entity.Admin;

@Repository
public interface AdminRepository  extends JpaRepository<Admin, Long> {

//	Admin exitstByEmail(String email, String pass);

}
