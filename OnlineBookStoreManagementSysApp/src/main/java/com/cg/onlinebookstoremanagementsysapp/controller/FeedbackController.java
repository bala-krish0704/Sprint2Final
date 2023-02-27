package com.cg.onlinebookstoremanagementsysapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinebookstoremanagementsysapp.entity.*;
import com.cg.onlinebookstoremanagementsysapp.exception.*;
import com.cg.onlinebookstoremanagementsysapp.service.*;


@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	private IFeedbackService feedbackService;
	
	@PostMapping("/addfeedback")
	public Feedback addFeedBack(@RequestBody Feedback feed) {
		return feedbackService.addFeedback(feed);
	}
	
	@GetMapping("/getfeedback")
	public List<Feedback> listAllFeedbacks(){
		return feedbackService.listAllFeedbacks();
	}
	
	@GetMapping("/getfeedback/{fedid}")
	public Feedback getFeedBackById(@PathVariable("fedid") Long fedId) throws ResourceNotFoundException {
		return feedbackService.getFeedBackById(fedId);
	}


	
	@PutMapping("/update/{fedid}")
	public Feedback updateFeedBack(@RequestBody Feedback feed,@PathVariable("fedid") Long fedId) throws ResourceNotFoundException{
		return feedbackService.updateFeedBack(feed, fedId);
	}
	
	@GetMapping("/getfeedback/{fedbookid}")
	public Feedback getFeedBackByBookId(@PathVariable("fedbookid") Long fedBookId) throws ResourceNotFoundException{
		return feedbackService.getFeedBackByBookId(fedBookId);
	}
	
	@GetMapping("/findfeedbackbyreaderid/{fedreadid}")
	public List<Feedback> findByFeedBackReaderId(@PathVariable("fedreadid") Long fedReaderId) {
		return feedbackService.findByFeedBackReaderId(fedReaderId);
	}
	
	@GetMapping("/findfeedbackbyorderid/{fedordid}")
	public List<Feedback> findByFeedBackOrderId(@PathVariable("fedordid") Long fedOrderId) {
		return feedbackService.findByFeedBackOrderId(fedOrderId);
	}
       
	
	@GetMapping("/findfeedbackbyratdetails/{fedratdet}")
	public List<Feedback> findByFeedBackRatingDetails(@PathVariable("fedratdet") String fedRatingDetails){
		return feedbackService.findByFeedBackRatingDetails(fedRatingDetails);
	}
	
	@GetMapping("/findfeedbackbydesc/{feddesc}")
	public List<Feedback> findByFeedBackDescription(@PathVariable("feddesc")  String fedDescription){
		return feedbackService.findByFeedBackDescription(fedDescription);
	}
	
	

}
