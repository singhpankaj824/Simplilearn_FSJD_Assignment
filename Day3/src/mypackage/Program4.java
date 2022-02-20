package mypackage;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] userInputLn=new int[5];
		
		// Get input from user
		for(int i=0;i<userInputLn.length;i++) {
			System.out.println("Please enter the number:");
			userInputLn[i]=scanner.nextInt();
		}
		scanner.close();		
		// Bubble Sort
		bubbleSort(userInputLn);
		
		for(int d:userInputLn)
		{
			System.out.println(d);
		}
		

	}
	
	public static void bubbleSort(int[] userInput) {
		int n=userInput.length;
		
		for(int i=0;i<userInput.length;i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if(userInput[j]>userInput[j+1]) {
					
				int temp=userInput[j];
				userInput[j]=userInput[j+1];
				userInput[j+1]=temp;
			}
		}
	}	
	}
}
