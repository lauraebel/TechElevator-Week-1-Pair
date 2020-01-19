package com.techelevator;
import java.util.Scanner;


/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */

// paid - bill = change

public class MakeChange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your total bill amount: ");
		String userInput = in.nextLine();
		
		double totalBill = Double.parseDouble(userInput);
		
		System.out.print("Enter how much you paid: ");
		String userDollars = in.nextLine();
		
		double totalPaid = Double.parseDouble(userDollars);
		
		double changeRequired = totalPaid - totalBill;
		System.out.print("Your change is: " + changeRequired);
	}

}
