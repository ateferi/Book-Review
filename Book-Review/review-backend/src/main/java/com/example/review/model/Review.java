package com.example.review.model;

import javax.persistence.*;

//+--------+---------------+------+-----+---------+----------------+
//| Field  | Type          | Null | Key | Default | Extra          |
//+--------+---------------+------+-----+---------+----------------+
//| id     | int           | NO   | PRI | NULL    | auto_increment |
//| isbn   | bigint        | YES  |     | NULL    |                |
//| name   | varchar(30)   | YES  |     | NULL    |                |
//| review | varchar(2000) | YES  |     | NULL    |                |
//| date   | bigint        | YES  |     | NULL    |                |
//| rate   | int           | YES  |     | NULL    |                |
//+--------+---------------+------+-----+---------+----------------+

@Entity
@Table(name="reviews")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="isbn")
	private long isbn;
	
	@Column(name="name")
	private String name;
	
	@Column(name="review")
	private String review;
	
	@Column(name="date")
	private long date;
	
	@Column(name="rate")
	private int rate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public void updateFields(Review r) {
		this.id = r.getId();
		this.isbn = r.getIsbn();
		this.name = r.getName();
		this.review = r.getReview();
		this.date = r.getDate();
		this.rate = r.getRate();
	}
}
