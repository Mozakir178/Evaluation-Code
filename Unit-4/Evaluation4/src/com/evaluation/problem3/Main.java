package com.evaluation.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>() ;
		
		students.add(new Student(1, "Zakir", 98, 89, 87)) ;
		students.add(new Student(4, "Shakir", 83, 81, 70)) ;
		students.add(new Student(2, "Madhu", 76, 87, 65)) ;
		students.add(new Student(5, "Avanish", 76, 87, 65)) ;
		students.add(new Student(3, "Hurmit", 90, 89, 69)) ;
		students.add(new Student(6, "Nandlal", 76, 63, 50)) ;
		
		Sorting sorting = new Sorting() ;
		
		Collections.sort(students , sorting);
		
		for(Student student : students) {
			System.out.println(student);
		}
	}
}
