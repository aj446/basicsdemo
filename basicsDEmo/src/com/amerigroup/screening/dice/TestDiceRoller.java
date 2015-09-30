package com.amerigroup.screening.dice;

import java.util.Scanner;

public class TestDiceRoller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		  int i=0; int j=0;
	
		System.out.println("Start playing");
		System.out.print("Enter positive integer for number of dices want to roll: ");
		
		 i = scanner.nextInt();
		 
		 System.out.print("The number of sides on each die. The dice can have 4, 6, 8, 10, 12, 20, or 100 sides.");
		 j = scanner.nextInt();
		 
		WorkingDiceRoller wDiceRoller = new WorkingDiceRoller();
		int totalDiceCount =wDiceRoller.roll(i, j);
		
		System.out.println("Dice Total Count"  +   totalDiceCount);
		System.out.println("Thanks for playing.");
	  
	}

}
