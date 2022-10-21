package com.infinite.hib;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TransReturn")
public class TransReturn {
	
	
	@Id
	@Column(name="tid")
	private int tid;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="bookId")
	private int bookId;
	
	@Column(name="fromdate")
	private Date fromdate;

	
	@Column(name="todate")
	private Date todate;


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public Date getFromdate() {
		return fromdate;
	}


	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}


	public Date getTodate() {
		return todate;
	}


	public void setTodate(Date todate) {
		this.todate = todate;
	}

	
}
