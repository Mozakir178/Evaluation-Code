package com.evaluation.problem3;

import java.util.Comparator;

public class Sorting implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		int total1 =o1.getEngMarks() + o1.getMathsMarks() + o1.getScienceMarks() ;
		int total2 =o2.getEngMarks() + o2.getMathsMarks() + o2.getScienceMarks() ;
		
		if(total1==total2) {
			int result = o1.getName().compareTo(o2.getName()) ;
			if(result == 0) {
				return o1.getRollNo() - o2.getRollNo() ;
			}
			else
				return -result ;
		}
		else return   total2 - total1 ;
		
	}

}
