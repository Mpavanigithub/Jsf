package com.java.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class BookMain {
	
	
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		Scanner sc  = new Scanner(System.in);
		Booking book = new Booking();
		System.out.println("Enter DriverId ");
		book.setDriverId(sc.nextInt());
		System.out.println("Enter UserId ");
		book.setUserId(sc.nextInt());
		System.out.println("enter Startinglocation  ");
		book.setStartingLocation(sc.next());
		System.out.println("Enter Endinglocation ");
		book.setEndingLocation(sc.next());
		System.out.println("Enter kilometers");
		book.setKilometers(sc.nextInt());
		System.out.println("Enter BookingStatus ");
		book.setBookingStatus(Status.valueOf(sc.next()));
		System.out.println("Enter Billing Amount");
		book.setBillAmount(sc.nextInt());
		
		CabBeanRemote service = null;
	    service = (CabBeanRemote)
	    		new InitialContext().lookup("CabBean/remote");
	    System.out.println(service.addBookingBean(book));
		
		
	}

}
