package com.infinte.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class EmployDAO implements Serializable{
	public List<Employ> showEmploy(){
	List<Employ> employList = new ArrayList<Employ>();
	
	employList.add(new Employ(1,"Pavani","Java","Developer",67099.88));
	employList.add(new Employ(2,"Ravi","Mysql","Developer",6897.32));
	employList.add(new Employ(3,"Harshi","Angular","Developer",70878.53));
	employList.add(new Employ(4,"Madhu","React","Developer",4354.64));
	employList.add(new Employ(5,"Harshit","JavaScript","Developer",3453.43));
	employList.add(new Employ(6,"Sampath","Phthon","Developer",75474.64));
	
	return employList;
	

}
	
}
