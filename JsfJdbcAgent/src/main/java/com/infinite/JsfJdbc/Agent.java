package com.infinite.JsfJdbc;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped 
public class Agent {
	
	

	
	private int AgentId;
	private String Name;
	private String City;
	private String gender;
	private int MaritalStatus;
	private double Premium;
	public int getAgentId() {
		return AgentId;
	}
	public void setAgentId(int agentId) {
		AgentId = agentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public double getPremium() {
		return Premium;
	}
	public void setPremium(double premium) {
		Premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [AgentId=" + AgentId + ", Name=" + Name + ", City=" + City + ", gender=" + gender
				+ ", MaritalStatus=" + MaritalStatus + ", Premium=" + Premium + "]";
	}
	public Agent(int agentId, String name, String city, String gender, int maritalStatus, double premium) {
		
		AgentId = agentId;
		Name = name;
		City = city;
		this.gender = gender;
		MaritalStatus = maritalStatus;
		Premium = premium;
	}
	public Agent() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
