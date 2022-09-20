package com.evaluation.problem3;

public class Main {
	
	public void messageToStudents(Evaluation evaluation) {
		
		if(evaluation instanceof DsaEvaluation) {
			DsaEvaluation dsa = (DsaEvaluation) evaluation ;
			System.out.println("Its a DSA Evaluation");
			dsa.printNoOfQuestions();
			dsa.evaluationTiming(); 
		}
		else if(evaluation instanceof CodingEvaluation) {
			
			CodingEvaluation coding = (CodingEvaluation) evaluation ;
			coding.printNoOfQuestions(); 
			coding.evaluationTiming();
			System.out.println("Its a Coding Evaluatin");
		}
	}
	
	public static void main(String[] args) {
		
		Main exam = new Main() ;
		exam.messageToStudents(new DsaEvaluation(5));
		
		System.out.println("======================================================\n");
		exam.messageToStudents(new CodingEvaluation(6));
		System.out.println("======================================================\n");
		
	}
}
