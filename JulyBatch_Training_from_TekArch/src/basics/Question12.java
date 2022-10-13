package basics;
import java.util.Scanner;  

public class Question12 {
	    	public static void main(String[] args) { 
	    	int n = 5;  
	    
	    	Scanner sc=new Scanner(System.in);  
	    	System.out.print("Enter the number of elements: ");  
	    	n=sc.nextInt();  //overwrites n to user value
	    	sc.close();
	    	
	    	
	    	//creates an array in the memory of length n  
	    	for(int i=1; i<=n; i++)  
	    	{  
	    		System.out.println((2*i));  
	    	}  
	
	    	
	    	}
}

