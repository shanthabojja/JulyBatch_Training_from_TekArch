package basics; 
import java.util.Scanner; 


public class Question06 {
	    	public static void main(String[] args) { 
	    		int n;
	    		
	    		Scanner sc = new Scanner(System.in);  
	    		System.out.print("Enter the number: ");  
	    		n = sc.nextInt();
	    		sc.close();
	    		System.out.println("Decimal is : " +n);  
	    		System.out.println("Binary is: " +Integer.toBinaryString(n));  

	    	}
}

//Write a Java program to convert a decimal number to binary number
//example
//i/p : 5 
//o/p:101