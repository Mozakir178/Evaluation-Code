package com.evaluation;

public class Main {
	
	public static void runScored(int one, int two, int three, int four ,int six) {
		// write your logic here
		int totalRun = ((one*1)+(two*2)+(three*3)+(four*4)+(six*6)) ;
		System.out.println(totalRun);
		}
		public static void main(String[] args){
		//call runScored with valid parameters
			int one = 30 ;
			int two = 15 ;
			int three = 5 ;
			int four = 4 ;
			int six = 3 ;
			
			runScored(one, two , three, four, six) ;
		}

}
