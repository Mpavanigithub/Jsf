package com.infinite.JunitTest;

import org.junit.Test;

import junit.framework.TestCase;

public class EmployTest{

	@Test
	public void testEmploy(){
		  Employ obj = new Employ();
		  
		
		
	}
	@Test
	public void testEmpno(){
		 Employ obj = new Employ();
		 
		 assertEquals(2,obj.getEmpno())
	}
	

}
