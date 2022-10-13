package basics; 
import java.util.Scanner; 


public class Question07 {
	    	public static void main(String[] args) { 
	    		int n, digit, sum = 0;
	    		
	    		Scanner sc = new Scanner(System.in);  
	    		System.out.print("Enter the number: ");  
	    		n = sc.nextInt();
	    		sc.close();
	    		while(n > 0)  
	    			{  
	    			//finds the last digit of the given number    
	    			digit = n % 10;   //you get reminder 
	    			//adds last digit to the variable sum  
	    			sum = sum + digit;  
	    			//removes the last digit from the number  
	    			n = n / 10;  //you get quotient
	    			}  
	    		System.out.println("Sum of Digits: "+sum);  
	    	}
}

//https://www.javatpoint.com/sum-of-digits-of-a-number-in-java
//Write a Java program and compute the sum of the digits of an integer.
//i/p: 234   
//note: 2+3+4=9 
//so o/p:9
