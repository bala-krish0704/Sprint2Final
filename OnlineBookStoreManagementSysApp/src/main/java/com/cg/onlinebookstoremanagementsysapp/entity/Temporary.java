package com.cg.onlinebookstoremanagementsysapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
public class Temporary {
	@Id
	@Column(name = "feedback_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long feedBackId;
	
	@Column(name = "freader_id")
	private long feedbackReaderId;
	
	@Column(name = "forder_id")
	private long feedbackOrderId;
	
	@Column(name = "frating_details")
	private String feedbackRatingDetails;
	
	@Column(name = "fbook_id")
	private long feedbackBookId;
	
	@Column(name = "fdescription")
	private String feedBackDescription;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "reader_id")
	private Reader reader;
	
	public Reader getReader() {
		return reader;
	}
	
	public void setReader(Reader reader) {
		this.reader = reader;
	}

	//Constructor
	
	public Temporary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Temporary(long feedBackId, long feedbackReaderId, long feedbackOrderId, String feedbackRatingDetails,
			long feedbackBookId, String feedBackDescription) {
		super();
		this.feedBackId = feedBackId;
		this.feedbackReaderId = feedbackReaderId;
		this.feedbackOrderId = feedbackOrderId;
		this.feedbackRatingDetails = feedbackRatingDetails;
		this.feedbackBookId = feedbackBookId;
		this.feedBackDescription = feedBackDescription;
	}

	//Getter and Setter
	public long getFeedBackId() {
		return feedBackId;
	}

	public void setFeedBackId(long feedBackId) {
		this.feedBackId = feedBackId;
	}

	public long getFeedbackReaderId() {
		return feedbackReaderId;
	}

	public void setFeedbackReaderId(long feedbackReaderId) {
		this.feedbackReaderId = feedbackReaderId;
	}

	public long getFeedbackOrderId() {
		return feedbackOrderId;
	}

	public void setFeedbackOrderId(long feedbackOrderId) {
		this.feedbackOrderId = feedbackOrderId;
	}

	public String getFeedbackRatingDetails() {
		return feedbackRatingDetails;
	}

	public void setFeedbackRatingDetails(String feedbackRatingDetails) {
		this.feedbackRatingDetails = feedbackRatingDetails;
	}

	public long getFeedbackBookId() {
		return feedbackBookId;
	}

	public void setFeedbackBookId(long feedbackBookId) {
		this.feedbackBookId = feedbackBookId;
	}

	public String getFeedBackDescription() {
		return feedBackDescription;
	}

	public void setFeedBackDescription(String feedBackDescription) {
		this.feedBackDescription = feedBackDescription;
	}
}
