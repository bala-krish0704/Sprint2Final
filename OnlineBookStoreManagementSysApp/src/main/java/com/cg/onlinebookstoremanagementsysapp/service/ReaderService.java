package com.cg.onlinebookstoremanagementsysapp.service;
import com.cg.onlinebookstoremanagementsysapp.repository.*;
import com.cg.onlinebookstoremanagementsysapp.entity.Reader;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderService  implements IReaderService {

	@Autowired
	private ReaderRepository readerRepo;

	@Override
	public List<Reader> getAllReader() {
		// TODO Auto-generated method stub
		return readerRepo.findAll();
	}

	@Override
	public Optional<Reader> getReaderById(long readerId) {
		// TODO Auto-generated method stub
		return readerRepo.findById(readerId);
	}

	@Override
	public Optional<Reader> addReader(
			Reader reader) {
		// TODO Auto-generated method stub
		if (readerRepo.existsById(reader.getReaderId())){
            return Optional.empty();
        }else{
            return Optional.of(readerRepo.save(reader));
        }
	}

	@Override
	public String updateReaderById(Reader readerId) {
		if (readerRepo.existsById(readerId.getReaderId())){
			Reader adUp =readerRepo.save(readerId);
				if(adUp!=null)
					return "Reader Updated Successfully";
	    }else{
	        return "Can't Update Reader caused by Wrong information ";
	    }
		return "The Given Reader was already Exits!";
	}

	@Override
	public String deleteReaderById(long readerId) {
		if (readerRepo.existsById(readerId) && readerId!=0){
	        readerRepo.deleteById(readerId);
	        	return readerId + " deleted successfully!";
	    }else{
	        return "The data does not exist in records!";
	    }
	    
	}

	@Override
	public Optional<Reader> getReaderByEmail(String email) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}






