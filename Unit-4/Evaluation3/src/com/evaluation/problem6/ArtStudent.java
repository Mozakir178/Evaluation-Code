package com.evaluation.problem6;

public class ArtStudent implements Student {
	
	private int hindiMarks ;
	private int englishMarks ;
	private int historyMarks ;
	
	public ArtStudent() {
		// TODO Auto-generated constructor stub
	}
	
	public ArtStudent(int hindi , int english , int history) {
		this.hindiMarks = hindi ;
		this.englishMarks = english ;
		this.historyMarks = history ;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	@Override
	public double findPercentage() {
		
		double result  = (this.englishMarks + this.hindiMarks + this.historyMarks)/3.0 ;
		return result ;
	}

}
