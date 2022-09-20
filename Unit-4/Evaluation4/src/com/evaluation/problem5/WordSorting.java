package com.evaluation.problem5;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class WordSorting {
	public  void uniqueWords(String str){
		
		String[] elements = str.split(" ") ;
		for(int i=0;i<elements.length ;i++) {
			byte value = (byte)elements[i].charAt(elements[i].length()-1) ;
			if( !(value>64 && value<91) && !( value>96 && value<123)) {
				elements[i] = elements[i].substring(0,elements[i].length()-1) ;
			}
		}
		
		Set<String> unique = new TreeSet<String>() ;
		for(int i=0;i<elements.length;i++) {
			boolean present = false ;
			for(int j=i+1 ;j<elements.length;j++) {
				if(elements[i].equalsIgnoreCase(elements[j])) {
					present = true ;
				}
			}
			if(!present) {
				unique.add(elements[i].toLowerCase()) ;
			}
		}
		System.out.println("Number of total words present: "+elements.length);
		System.out.println("Number of unique words present: "+unique.size());
		System.out.println("The words are:");
		int count = 1 ;
		for(String s : unique) {
			System.out.print(count++ +". "+s+"  ");
		}
		System.out.println("\n");
		
		
	}
	public static void main(String[] args) {
		WordSorting result = new WordSorting() ;
		System.out.println("First test case: \n=============================================================");
		String str1 = "Hello Everybody, welcome to collection in JAVA. Collection, is like a container and powerful concept in Java" ;
		result.uniqueWords(str1);
		System.out.println("Second test case: \n=============================================================");
		String str2 = "hello Hello HEllo hi hi: hi! Welcome, welcome" ;
		result.uniqueWords(str2);
		
	
	}
}
