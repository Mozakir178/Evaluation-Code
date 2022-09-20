package com.evaluation.problem4;
import java.util.*; 
public class CharacterAtIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a String =>");
		String str = sc.nextLine() ;
		System.out.println("Enter a position");
		int n = sc.nextInt() ;
		while( n>str.length()-1) {
			System.out.println("Invalid position, Please enter a valid position =>");
			n= sc.nextInt() ;
		}
		sc.close(); 
		
		System.out.println("Character at the position "+ n+ " => " + str.charAt(n));
	}
}
