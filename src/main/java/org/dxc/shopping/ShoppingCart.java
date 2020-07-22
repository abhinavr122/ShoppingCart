package org.dxc.shopping;

import java.util.Scanner;
import org.dxc.shopping.service.*;
import org.dxc.shopping.exception.ProductException;
import org.dxc.shopping.model.Product;

public class ShoppingCart 
{
    public static void main( String[] args ) throws ProductException{
    	
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter number of products");
    	int no=Integer.parseInt(s.nextLine());
    	CartOperationService cartService=new CartOperationServiceImpl(10.2f); 
    	
    	for(int i=0;i<no;i++) {
    	System.out.println("Enter Product Name");  	
    	System.out.println("Enter Product Price");  	
    	System.out.println("Enter Product Quantity");
    	
    	Product p=new Product(s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()));
    	
    	cartService.addToCart(p);
    	
    	}
    	System.out.println(cartService.getInvoiceAmount());
    	
    	System.out.println("Remove Product? yes or no");
    	
    	
    	if(s.nextLine().equalsIgnoreCase("yes")) {
    		
    		System.out.println("Enter Product Name");  	
        	System.out.println("Enter Product Price");  	
        	System.out.println("Enter Product Quantity");
    		Product p=new Product(s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()));
    		cartService.removeFromCart(p);
    	}
    	System.out.println(cartService.getInvoiceAmount());
    	
    	System.out.println(cartService); 
		

        
    }

	
}
