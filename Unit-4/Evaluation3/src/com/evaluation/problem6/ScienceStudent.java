package com.evaluation.problem6;

public class ScienceStudent implements Student{

	private int physicsMarks ;
	private int chemistryMarks ;
	private int mathsMarks ;
	private int biolgyMarks ;
	
	
	
	public ScienceStudent() {
		// TODO Auto-generated constructor stub
	}
	
	public ScienceStudent(int physics , int chemistry , int maths ,int biology) {
		this.physicsMarks = physics ;
		this.chemistryMarks = chemistry ;
		this.mathsMarks = maths ;
		this.biolgyMarks = biology ;
	}
	
	
	public int getPhysicsMarks() {
		return physicsMarks;
	}





	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}





	public int getChemistryMarks() {
		return chemistryMarks;
	}





	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}





	public int getMathsMarks() {
		return mathsMarks;
	}





	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}





	public int getBiolgyMarks() {
		return biolgyMarks;
	}





	public void setBiolgyMarks(int biolgyMarks) {
		this.biolgyMarks = biolgyMarks;
	}





	@Override
	public double findPercentage() {
			double result = (this.physicsMarks+ this.chemistryMarks + this.biolgyMarks + this.mathsMarks) / 4.0 ;
		return result;
	}

}
