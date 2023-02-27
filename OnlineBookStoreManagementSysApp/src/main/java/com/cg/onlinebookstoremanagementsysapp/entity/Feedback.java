package com.cg.onlinebookstoremanagementsysapp.entity;


import javax.persistence.*;


@Entity
@Table(name = "feedback")
public class Feedback {
	
	@Id
	@Column(name = "feedback_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long feedBackId;
	
	@Column(name = "feedback_readerid")
	private Long feedBackReaderId;
	
	@Column(name = "feedback_orderid")
	private Long feedBackOrderId;
	
	@Column(name = "feedback_ratingdetails")
	private String feedBackRatingDetails;
	
	@Column(name = "feedback_bookid")
	private Long feedBackBookId;
	
	@Column(name = "feedback_description")
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
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public Feedback(Long feedBackReaderId, Long feedBackOrderId, String feedBackRatingDetails, Long feedBackBookId,
			String feedBackDescription) {
		super();
		this.feedBackReaderId = feedBackReaderId;
		this.feedBackOrderId = feedBackOrderId;
		this.feedBackRatingDetails = feedBackRatingDetails;
		this.feedBackBookId = feedBackBookId;
		this.feedBackDescription = feedBackDescription;
	}

	public Long getFeedBackId() {
		return feedBackId;
	}

	public void setFeedBackId(Long feedBackId) {
		this.feedBackId = feedBackId;
	}

	public Long getFeedBackReaderId() {
		return feedBackReaderId;
	}

	public void setFeedBackReaderId(Long feedBackReaderId) {
		this.feedBackReaderId = feedBackReaderId;
	}

	public Long getFeedBackOrderId() {
		return feedBackOrderId;
	}

	public void setFeedBackOrderId(Long feedBackOrderId) {
		this.feedBackOrderId = feedBackOrderId;
	}

	public String getFeedBackRatingDetails() {
		return feedBackRatingDetails;
	}

	public void setFeedBackRatingDetails(String feedBackRatingDetails) {
		this.feedBackRatingDetails = feedBackRatingDetails;
	}

	public Long getFeedBackBookId() {
		return feedBackBookId;
	}

	public void setFeedBackBookId(Long feedBackBookId) {
		this.feedBackBookId = feedBackBookId;
	}

	public String getFeedBackDescription() {
		return feedBackDescription;
	}

	public void setFeedBackDescription(String feedBackDescription) {
		this.feedBackDescription = feedBackDescription;
	}

	
}
