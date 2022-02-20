package mypackage;

public class Calc {
	
		public static int Sum(int[] intArray) {
			int sum=0;
			for(int i=0; i<intArray.length;i++) {
				sum+=intArray[0];
			}
			return sum;
		}
		
		public static int Avg(int[] intArray) {
		int total=	Sum(intArray);
		return total / intArray.length;
		}
		
}
