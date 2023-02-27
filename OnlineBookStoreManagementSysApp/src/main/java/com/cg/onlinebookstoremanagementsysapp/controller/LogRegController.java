package com.cg.onlinebookstoremanagementsysapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinebookstoremanagementsysapp.entity.Reader;
import com.cg.onlinebookstoremanagementsysapp.service.IAdminService;
import com.cg.onlinebookstoremanagementsysapp.service.IReaderService;
import com.cg.onlinebookstoremanagementsysapp.service.ISellerService;

@CrossOrigin("*")
@RestController 
@RequestMapping("/api/v1")
public class LogRegController {
	@Autowired
	private IReaderService readerService;
	
	@Autowired
	private IAdminService adminService;
	
	@Autowired
	private ISellerService serllerService;
	
	@PostMapping("/register")
	public Optional<Reader> createReader(@RequestBody Reader reader)
	{
		return readerService.addReader(reader);
	}
	
//	@PostMapping("/login")
//	public Object fetchReader(@RequestBody Object obj)
//	{
//		List<Reader> readers = readerService.getAllReader();
//		
//		for(int i=0;i<readers)
//		
//		return new Object(); 
//	}

//	@PostMapping("/login")
//	public ResponseEntity<Reader> login(@RequestBody Reader reader)
//	{	
//		Reader rd = new Reader();
//		try {
//			Optional<Reader> user = readerService.getReaderByEmail(reader.getReaderEmail());
//			if(user.isPresent()) {
//				return ResponseEntity.ok(user.get());
//			} else {
//				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(rd);
//			}
//				
//		} catch(Exception error) {
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(rd);
//		}
//	}
}
	
