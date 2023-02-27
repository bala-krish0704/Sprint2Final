package com.cg.onlinebookstoremanagementsysapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cg.onlinebookstoremanagementsysapp.entity.*;
import com.cg.onlinebookstoremanagementsysapp.service.*;
import com.cg.onlinebookstoremanagementsysapp.exception.*;
@CrossOrigin("*")
@RestController 
@RequestMapping("/api/v1/readers")
public class ReaderController 
{
	
			@Autowired
			private IReaderService readerService;
			
			
			@GetMapping("/allreader")
			public List<Reader> GetAllReaders()
			{
				return readerService.getAllReader();
			}
			
			@GetMapping("/{id}")
		    public Optional<Reader> getReaderById(@PathVariable(value = "id") Long readerId) throws ResourceNotFoundException {
				return readerService.getReaderById(readerId);
		    }
			
			
			@PostMapping("/addreader")
			public Optional<Reader> createReader(@RequestBody Reader reader)
			{
				return readerService.addReader(reader);
			}

			
			@PutMapping("/{id}")
		    public String updateReader( @RequestBody Reader reader) throws ResourceNotFoundException {
				return readerService.updateReaderById(reader);
		    }
			
			@DeleteMapping("/{id}")
			public String deleteByReaderId(@PathVariable("id") long reader_id) {
				String result = readerService.deleteReaderById(reader_id);
				return result;
			}
}