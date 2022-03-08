package com.ssa.app.controllers;

public class PuckData {

	private String puckName;
	private String environmentName;
	private String ownerName;
	public String getPuckName() {
		return puckName;
	}
	public void setPuckName(String puckName) {
		this.puckName = puckName;
	}
	public String getEnvironmentName() {
		return environmentName;
	}
	public void setEnvironmentName(String environmentName) {
		this.environmentName = environmentName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public PuckData(String puckName, String environmentName, String ownerName) {
		super();
		this.puckName = puckName;
		this.environmentName = environmentName;
		this.ownerName = ownerName;
	}
	
	
	
	

}
