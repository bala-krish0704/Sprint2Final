package com.cg.onlinebookstoremanagementsysapp.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	@Column(name ="book_id")
	private Long bookId;
	
	@Column(name = "order_status")
	private String orderStatus;
	
	@Column(name ="quantity")
	private int quantity;
	
	@Column(name = "total_cost")
	private double totalCost;
	
	@Column(name = "reader_id")
	private Long readerId;
	
	@Column(name = "bookname")
	private String bookName;

	public Order() {
		super();
	}
	
	public Order(Long orderId, Long bookId, String orderStatus, int quantity, double totalCost, Long readerId,
			String bookName) {
		super();
		this.orderId = orderId;
		this.bookId = bookId;
		this.orderStatus = orderStatus;
		this.quantity = quantity;
		this.totalCost = totalCost;
		this.readerId = readerId;
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Long getReaderId() {
		return readerId;
	}

	public void setReaderId(Long readerId) {
		this.readerId = readerId;
	}
	
	

}