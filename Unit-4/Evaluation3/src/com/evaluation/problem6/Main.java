package com.evaluation.problem6;
import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in) ;
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Which Student percentage do you want to find");
		System.out.println("1. ArtStudent \n2.ScienceStudent \n3.CommerceStudent");
		int choice = sc.nextInt() ;
		
		double percentage = Main.getStudent(choice) ;
		System.out.println("Percentage is : "+percentage);
//		sc.close();
		
		
	}
	
	public static double getStudent(int choice) {
	
		if(choice == 1) {
			System.out.println("Enter the Marks for Hindi");
			int hindi = sc.nextInt() ;
			System.out.println("Enter the Marks for English");
			int english = sc.nextInt() ;
			System.out.println("Enter the Marks for History");
			int history = sc.nextInt() ;
			ArtStudent student = new ArtStudent(hindi , english, history) ;
			
			double res = student.findPercentage() ;
			return res ;
			
			
		}
		else if(choice == 2) {
			
			System.out.println("Enter the Marks for Maths");
			int maths = sc.nextInt() ;
			System.out.println("Enter the Marks for Chemistry");
			int chemestry = sc.nextInt() ;
			System.out.println("Enter the Marks for Physics");
			int physics = sc.nextInt() ;
			System.out.println("Enter the Marks for Biology");
			int biology = sc.nextInt() ;
			ScienceStudent student = new ScienceStudent(physics , chemestry ,maths ,biology ) ;
			double res = student.findPercentage() ;
			return res ;
			
		}
		else if(choice == 3) {
			
			System.out.println("Enter the Marks for Account");
			int account = sc.nextInt() ;
			System.out.println("Enter the Marks for Economics");
			int economic = sc.nextInt() ;
			System.out.println("Enter the Marks for Busines Studies");
			int business = sc.nextInt() ;
			CommerceStudent student = new CommerceStudent(account , economic , business ) ;
			double res = student.findPercentage() ;
			return res ;
			
		}
	
		
		return 0 ;
		
		  
	}
	
	
}
