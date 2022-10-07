package com.infinite.JunitDemo;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class EmployTest {
//
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	
	@Test
	public void testConstructor() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		Employ employ =new Employ();
		Employ employNew = new Employ(1,"pavani","pavani.kavuri@gmail.com","9000403455",sdf.parse("2000-10-09"),"java",1030,32);
		assertNotNull(employ);
		assertEquals(1,employNew.getEmpId());
		assertEquals("pavani",employNew.getEmpName());
		assertEquals("pavani.kavuri@gmail.com",employNew.getEmpMail());
		assertEquals("9000403455",employNew.getEmpMobNo());
		assertEquals(sdf.parse("2000-10-09"),employNew.getEmpDtJoin());
		assertEquals(("java"),employNew.getEmpDept());
		assertEquals(1030,employNew.getEmpManagerId());
		assertEquals(32,employNew.getEmpAvailLeaveBal());
	}
	@Test
	public void testtoString() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		Employ employ2 =new Employ(1,"pavani","pavani.kavuri@gmail.com","9000403455",sdf.parse("2000-10-09"),"java",1030,32);
	
	
		 String result = "Employ [empId=" + 1 + ", empName=" + "pavani" + ", empMail=" + "pavani.kavuri@gmail.com" +  ", empMobNo=" + "9000403455"
				+ ", empDtJoin=" + sdf.parse("2000-10-09") + ", empDept=" + "java" + ", empManagerId=" + 1030
				+ ", empAvailLeaveBal=" + 32 + "]";
	
	assertEquals(result, employ2.toString());
	
	}
	
	@Test
	public void testGettersAndSetters() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		Employ employ3 = new Employ();
			
		employ3.setEmpId(1);
		employ3.setEmpName("pavani");
		employ3.setEmpMail("pavani.kavuri@gmail.com");
		employ3.setEmpMobNo("9000403455");
		employ3.setEmpDtJoin(sdf.parse("2000-10-09"));
		employ3.setEmpDept("java");
		employ3.setEmpManagerId(1030);
		employ3.setEmpAvailLeaveBal(32);
		assertEquals(1,employ3.getEmpId());
		assertEquals("pavani",employ3.getEmpName());
		assertEquals("pavani.kavuri@gmail.com",employ3.getEmpMail());
		assertEquals("9000403455",employ3.getEmpMobNo());
		assertEquals(sdf.parse("2000-10-09"),employ3.getEmpDtJoin());
		assertEquals(("java"),employ3.getEmpDept());
		assertEquals(1030,employ3.getEmpManagerId());
		assertEquals(32,employ3.getEmpAvailLeaveBal());
		
		
		
		
	}
	

	
	
	

}