package com.evaluation.problem6;

public class CommerceStudent implements Student {

	
	private int accountMarks ;
	private int economicsMarks ;
	private int businessStudiesMarks ;
	
	public CommerceStudent() {
		// TODO Auto-generated constructor stub
	}
	
	public CommerceStudent(int account , int economics , int business) {
		this.accountMarks  = account ;
		this.economicsMarks = economics  ;
		this.businessStudiesMarks = business  ;
	}
	
	
	public int getAccountMarks() {
		return accountMarks;
	}




	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}




	public int getEconomicsMarks() {
		return economicsMarks;
	}




	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}




	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}




	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}




	@Override
	public double findPercentage() {
		
		double result = (this.accountMarks + this.businessStudiesMarks + this.economicsMarks)/3.0 ;
		return result;
	}

}
