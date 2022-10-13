package basics; 
import java.util.Scanner; 


public class Question04 {
	    	public static void main(String[] args) { 
	    		int numOne=2;
	    		int numTwo=3;
	    		
	    		Scanner sc = new Scanner(System.in);  
	    		System.out.print("Enter the number one: ");  
	    		numOne = sc.nextInt();
	    		System.out.print("Enter the number two: ");  
	    		numTwo = sc.nextInt();

	    		System.out.println("Sum is : " +(numOne+numTwo));  
	    		System.out.println("Difference is : " +(numOne-numTwo)); 
	    		System.out.println("Multiplication is : " +(numOne*numTwo)); 
	    		System.out.println("Division is : " +(numOne/numTwo)); 
	    		System.out.println("Modulo is : " +(numOne%numTwo)); 
	    	}
}

//Write a Java program to get avg. of 3 numbers