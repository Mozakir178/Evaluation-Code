package com.evaluation.problem3;

public abstract class Evaluation {

		private final int numberOfQuestion ;
		
		public Evaluation(int number) {
		this.numberOfQuestion = number ;
		}
		
		void printNoOfQuestions() {
			System.out.println("No. of Question is: "+ numberOfQuestion);
		}
		
		abstract void evaluationTiming() ;
		
}
