package mypackage;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] userInputLn=new int[5];
		
		// Get input from user
		for(int i=0;i<userInputLn.length;i++) {
			System.out.println("Please enter the number :");
			userInputLn[i]=scanner.nextInt();
		}
		scanner.close();
		
		int total =Calc.Sum(userInputLn);
		System.out.println("Sum : "+ total);
		
		int avg= Calc.Avg(userInputLn);
		System.out.println("Avg : "+avg);
	}

}

