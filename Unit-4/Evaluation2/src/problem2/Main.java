package problem2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Qusetion number 2's Answer");
	System.out.println("===================================");
	System.out.println("Enter Number of Students you want to enter ");
	int n = sc.nextInt() ;
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter the Roll Number : ");
		int roll = sc.nextInt() ;
		sc.nextLine() ;
		System.out.println("Enter the Name : ");
		String name = sc.nextLine() ;
		System.out.println("Enter the marks : ");
		int marks = sc.nextInt() ;
		Student s = new Student(roll, name, marks) ;
		
		System.out.println("Student details "+(i+1));
		System.out.println("Student Roll Number : "+ s.getRollNumber());
		System.out.println("Student Name: "+s.getStudentName());
		System.out.println("Student Mark: "+s.getMarks());
		System.out.println("=================================");
	}
}
}
