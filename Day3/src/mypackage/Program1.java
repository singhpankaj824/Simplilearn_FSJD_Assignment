package mypackage;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] userInputLn=new int[5];
		
		// Get input from User
		for(int i=0;i<userInputLn.length;i++) {
			System.out.println("Please enter the number:");
			userInputLn[i]=scanner.nextInt();
		}
		
		// close scanner
		scanner.close();

		// Print array using for loop
		System.out.println("Print array using for loop");
		for(int i=0;i<userInputLn.length;i++) {
			System.out.println(userInputLn[i]);
		}
		
		// Print array using foreach loop
		System.out.println("Print array using foreach loop");
		for(int d:userInputLn) {
			System.out.println(d);
		}
	}

}
