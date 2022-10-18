package com.infinite.hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class AgentInsertMain {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Agent agent = new Agent();
		System.out.println("Enter Agent Name");
		agent.setName(sc.next());
		System.out.println("Enter City ");
		agent.setCity(sc.next());
		System.out.println("Enter Gender ");
		agent.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter maritalStatus ");
		agent.setMaritalStaus(sc.nextInt());
		System.out.println("Enter Premium ");
		agent.setPremium(sc.nextDouble());
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(agent);
		trans.commit();
		System.out.println("****Record Inserted******");
		
		
		
	}

}
