package com.infinite.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Agent")
public class Agent {
	
	@Id
	@Column(name="agentId")
	private int agentId;
	

	@Column(name="name")
	private String name;
	
	@Column(name="city")
	private String city;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender")
	private Gender gender;
	
	@Column(name="maritalStatus")
	private int maritalStaus;
	
	@Column(name="premium")
	private double premium;
	
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getMaritalStaus() {
		return maritalStaus;
	}
	public void setMaritalStaus(int maritalStaus) {
		this.maritalStaus = maritalStaus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ ", maritalStaus=" + maritalStaus + ", premium=" + premium + "]";
	}
	
	
	

}
