package com.cg.onlinebookstoremanagementsysapp.entity;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
	//Entity Attributes and Column Names
			@Id
			@Column(name="book_id")
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private long bookId;
			
			@Column(name="isbn")
			private long bookIsbn;
			
			@Column(name="name")
			private String bookName;
			
			@Column(name="description")
			private String bookDesc;
			
			@Column(name="category")
			private String bookCategory;
			
			@Column(name="price")
			private long bookPrice;
			
			@Column(name="quantity")
			private int bookQuantity;
			
			@Column(name="author")
			private String bookAuthorName;
			
			@Column(name="pub_year")
			private String bookPubYear;
			
			@Column(name="pub_name")
			private String bookPubName;
			
			@Column(name ="img_src")
			private String imgsrc;

			public Book() {
				super();
				// TODO Auto-generated constructor stub
			}

			public long getBookId() {
				return bookId;
			}

			public void setBookId(long bookId) {
				this.bookId = bookId;
			}

			public long getBookIsbn() {
				return bookIsbn;
			}

			public void setBookIsbn(long bookIsbn) {
				this.bookIsbn = bookIsbn;
			}

			public String getBookName() {
				return bookName;
			}

			public void setBookName(String bookName) {
				this.bookName = bookName;
			}

			public String getBookDesc() {
				return bookDesc;
			}

			public void setBookDesc(String bookDesc) {
				this.bookDesc = bookDesc;
			}

			public String getBookCategory() {
				return bookCategory;
			}

			public void setBookCategory(String bookCategory) {
				this.bookCategory = bookCategory;
			}

			public long getBookPrice() {
				return bookPrice;
			}

			public void setBookPrice(long bookPrice) {
				this.bookPrice = bookPrice;
			}

			public int getBookQuantity() {
				return bookQuantity;
			}

			public void setBookQuantity(int bookQuantity) {
				this.bookQuantity = bookQuantity;
			}

			public String getBookAuthorName() {
				return bookAuthorName;
			}

			public void setBookAuthorName(String bookAuthorName) {
				this.bookAuthorName = bookAuthorName;
			}

			public String getBookPubYear() {
				return bookPubYear;
			}

			public void setBookPubYear(String bookPubYear) {
				this.bookPubYear = bookPubYear;
			}

			public String getBookPubName() {
				return bookPubName;
			}

			public void setBookPubName(String bookPubName) {
				this.bookPubName = bookPubName;
			}

			public String getImgsrc() {
				return imgsrc;
			}

			public void setImgsrc(String imgsrc) {
				this.imgsrc = imgsrc;
			}

			public Book(long bookId, long bookIsbn, String bookName, String bookDesc, String bookCategory,
					long bookPrice, int bookQuantity, String bookAuthorName, String bookPubYear, String bookPubName,
					String imgsrc) {
				super();
				this.bookId = bookId;
				this.bookIsbn = bookIsbn;
				this.bookName = bookName;
				this.bookDesc = bookDesc;
				this.bookCategory = bookCategory;
				this.bookPrice = bookPrice;
				this.bookQuantity = bookQuantity;
				this.bookAuthorName = bookAuthorName;
				this.bookPubYear = bookPubYear;
				this.bookPubName = bookPubName;
				this.imgsrc = imgsrc;
			}
			
			
}
