package com.infinite.jsf;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class AgentDAO {
	SessionFactory sessionFactory;
	Session session;
	public List<Agent> showAgent(){
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Agent where Agent " );
		List<Agent> agentList = query.list();
		return agentList;
		
		
	}
	
	
	    
		

}
