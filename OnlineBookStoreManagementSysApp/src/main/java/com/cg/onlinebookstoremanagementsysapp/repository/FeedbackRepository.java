package com.cg.onlinebookstoremanagementsysapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinebookstoremanagementsysapp.entity.Feedback;


@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long>{
	
	 
	
	    //select * from feedback where feedbackreader_id = ?
		public List<Feedback> findByFeedBackReaderId(Long fedReaderId);
	
	    //select * from feedback where feedbackorder_id = ?
		public List<Feedback> findByFeedBackOrderId(Long fedOrderId);
		
		//select * from feedback where String feedback_description = ?
		public Feedback findByFeedBackBookId(Long fedBookId);
		
		//select * from feedback where String feedbackrating_details = ?
		public List<Feedback> findByFeedBackRatingDetails(String fedRatingDetails);
		
		//select * from feedback where String feedback_description = ?
		public List<Feedback> findByFeedBackDescription(String fedDescription);
		
}
