package mypackage;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] userInputLn=new int[5];
		
		// Get input from user
		for(int i=0;i<userInputLn.length;i++) {
			System.out.println("Please enter the number:");
			userInputLn[i]=scanner.nextInt();
		}
		scanner.close();
		
		// Find biggest number 
		int biggestNum =userInputLn[0];
		for(int i=0;i<userInputLn.length;i++) {
			if(userInputLn[i]>biggestNum)
				biggestNum=userInputLn[i];
		}
		
		System.out.println("Biggest Number : "+biggestNum);

	}

}
