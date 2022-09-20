package com.evaluation.problem4;

public class Main {

	public static void main(String[] args) {
		
		Ecoommerce ecoommerce = new Ecoommerce() ;
		ecoommerce.addProductToList(new Product("Shoes", 2000, "Adidas", 12));
		ecoommerce.addProductToList(new Product("Ipad", 100000, "Apple", 2));
		ecoommerce.addProductToList(new Product("Ipad", 100000, "Apple", 4));
		ecoommerce.addProductToList(new Product("Shoes", 4000, "Nike", 4));
		ecoommerce.addProductToList(new Product("Shoes", 2000, "Adidas", 8));
		
		System.out.println(ecoommerce.showAllProduct());
	}
}
