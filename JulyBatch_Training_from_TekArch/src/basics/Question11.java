package basics;
import java.util.Scanner;  

public class Question11 {
	    	public static void main(String[] args) { 
	    	int n=5;  
	    	
	    	Scanner sc=new Scanner(System.in);  
	    	System.out.print("Enter the number of elements: ");  
	    	n=sc.nextInt();  
	    	sc.close();
	    	
	    	
	    	//creates an array in the memory of length n  
	    	for(int i=1; i<=n*2; i=i+2)  
	    	{  
	    		System.out.print(i + " ");  
	    	}  
	
	    	
	    	}
}

//Write a java program to read size n from user and to 
//print the following pattern up-to given size n. 
//Pattern= 1 3 5 7 9 ……….
//Example if size=6
//o/p = 1 3 5 7 9 11