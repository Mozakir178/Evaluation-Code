package com.evaluation.problem4;

import java.util.ArrayList;
import java.util.List;

public class Ecoommerce {

	List<Product> productList = new ArrayList<>() ;
	
	public void addProductToList(Product product) {
		boolean present = false ;
		
		for( Product p : productList) {
			if(p.equals(product)) {
				present = true ;
				p.count = p.count+product.count ;
				System.out.println("Count updated Product already exists");
			}
		}
		if(!present) {
			productList.add(product) ;
			System.out.println("Product Added Successfully");
		}
	}
	
	public List<Product> showAllProduct() {
		return productList ;
	}
	
	
}
