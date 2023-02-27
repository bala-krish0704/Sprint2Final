package com.cg.onlinebookstoremanagementsysapp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.onlinebookstoremanagementsysapp.repository.*;
import com.cg.onlinebookstoremanagementsysapp.entity.Feedback;
import com.cg.onlinebookstoremanagementsysapp.exception.*;


@Service //which makes this class as service class
public class FeedbackService implements IFeedbackService{
	@Autowired
	private FeedbackRepository feedbackRepo;

	//Add a FeedBack to the Good
	@Override
	public Feedback addFeedback(Feedback feed) {
		return feedbackRepo.save(feed);
		
	}
	
	//List all the Feedbacks
	@Override
	public List<Feedback> listAllFeedbacks() {
		return feedbackRepo.findAll();
	}

	//Get Feedback by FeedBackId
	@Override
	public Feedback getFeedBackById(Long fedId) throws ResourceNotFoundException{
		return feedbackRepo.findById(fedId) 
				.orElseThrow(() -> new ResourceNotFoundException("feedback Not found"));
	}
	
	//Update the exitsting Feedback using FeedBack ID
	@Override
	public Feedback updateFeedBack(Feedback feed, Long fedId) throws ResourceNotFoundException{
		Feedback existingFeedback = feedbackRepo.findById(fedId)
		         .orElseThrow(() -> new ResourceNotFoundException("Feedback Not found"));
	
		existingFeedback.setFeedBackReaderId(feed.getFeedBackReaderId());
		existingFeedback.setFeedBackOrderId(feed.getFeedBackOrderId());
		existingFeedback.setFeedBackRatingDetails(feed.getFeedBackRatingDetails());
		existingFeedback.setFeedBackDescription(feed.getFeedBackDescription());
		feedbackRepo.save(existingFeedback);
		return existingFeedback;
	}

	//Get a Feedbacks by ReaderId
	@Override
	public List<Feedback>findByFeedBackReaderId(Long fedReaderId) {
		return feedbackRepo.findByFeedBackReaderId(fedReaderId);
	}

	//Get a feedbacks by OrderId
	@Override
	public List<Feedback> findByFeedBackOrderId(Long fedOrderId) {
		return feedbackRepo.findByFeedBackOrderId(fedOrderId);
	}

	//Get feedback by using RatingDetails
	@Override
	public List<Feedback> findByFeedBackRatingDetails(String fedRatingDetails) {
		return feedbackRepo.findByFeedBackRatingDetails(fedRatingDetails);
	}

	//Find Feedback by book Description
	@Override
	public List<Feedback> findByFeedBackDescription(String fedDescription) {
		return feedbackRepo.findByFeedBackDescription(fedDescription);
	}

	//Get Feedback by using BookId
	@Override
	public Feedback getFeedBackByBookId(Long fedBookId) {
		// TODO Auto-generated method stub
		return null;
	}
	}
	
	


