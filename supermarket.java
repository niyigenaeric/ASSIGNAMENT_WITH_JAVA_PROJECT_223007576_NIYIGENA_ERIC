package com.supermarketbilling;
import java.util.Scanner;
public class supermarket {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Input your number of Items you purchased");
	int n = sc.nextInt();
	sc.nextLine();
	//store my every item
	
	String[]itemname=new String[n];
	double[] price =new double[n];
	int[] quantity =new int[n];
	double[] subtotal =new double[n];
	double grandtotal=0;
	
	for (int i =0; i<n;i++) {
		System.out.println("\n Enter the Details of Item to purchase"+(i+1)+":");
		
		System.out.print("Item name:");
		itemname[i]=sc.nextLine();
		
		System.out.print("Price per unit:");
		price[i]=sc.nextDouble();
		
		System.out.print("Quantity:");
		quantity[i]=sc.nextInt();
		
		// for subtatal
		subtotal[i]=price[i]*quantity[i];
		grandtotal+=subtotal[i];
		
		double discount=0;
		if(grandtotal>50000) {
			discount=grandtotal*0.05;
			double finalamount=grandtotal-discount;
			System.out.println("\n _____Supermarket Receipt");
			System.out.printf("%-15s %-10s %-10s %-10s\n", "Item","Quantity","price","SUbtotal");
			for(i=0; i<n;i++) {
				System.out.printf("%-15s %-10d %-10.22f %-10.2f",
						itemname[i],quantity[i],price[i],subtotal[i]);
				
			}
			System.out.println("________-");
			System.out.printf("Grand total: %.2f\n",grandtotal);
			System.out.printf("Discount: %.2f\n",discount);
		    System.out.printf("Final amount payable: %.2f\n",finalamount);
		    System.out.println("===========================");
		    
		    sc.close();
		}
		
		
		
	}
	
	
}
}
