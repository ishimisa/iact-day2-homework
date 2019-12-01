package iact;

import java.util.Scanner;

public class Homework1Main {

	public static void main(String[] args) {
		/* q1. write a program that asks the user
		 *  to enter in the number of widget the wish to purchase.
		 *  the program then calculates the following: 

widget cost 3.80 each
if they buy more than 10
	discount is 5%
if they buy more than 20
	discount is 10%
if then by more than 30
	discount is 15%
	if the total is > 40 then the shipping is free 
	otherwise the shipping is 10 euro
    output the total cost before discount 
    discount total after dicount
    shipping
    total plus shipping

at the end of the program the user is asked if they wish to do another calculation
		 */
		Scanner input = new Scanner(System.in);
		//decalare variables
		int count;
		double discount;
		double shipping;
		double total;
		//initaliser
		int ans = 1;
		//total = 3.8*count;
		//guard, ask user to enter the number of widget
		while (ans == 1){
			System.out.println("Please enter the number of widget you wish to purchase:");
			count = input.nextInt();		
			if (count > 40){
	    	total = 3.8*count;
	    	discount = 0.85*total;
	    	shipping = discount;
	    	} else if (count >= 30 && count < 40){
	    		total = 3.8*count;
	    	    discount = 0.85*total;
	    	    shipping = discount+10;	    	
	        } else if (count >=20 && count < 30){
	    	    total = 3.8*count;
	    	    discount = 0.9*total;
	    	    shipping = discount+10;	    	
	        } else if (count >=10 && count < 20){
	    	    total = 3.8*count;
	    	    discount = 0.95*total;
	    	    shipping = discount+10;
	        } else {
	    	    total = 3.8*count;
	        	discount = total;
	    	    shipping = total+10;
	    	}
		System.out.println("Your total cost before discount: " + total);
		System.out.println("Your total cost after dicount: " + discount);
		System.out.println("Your total cost puls shipping: " + shipping);
		
		//advancer
		System.out.println("Would you like to calculate on another amount? ");
		System.out.println("1. Yes");
			System.out.println("2. No");
		ans = input.nextInt();
		}
	}
}		
