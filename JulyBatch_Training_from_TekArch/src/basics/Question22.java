package basics;
import java.util.Scanner;  

public class Question22 {
	    	public static void main(String[] args) { 
	    	int n;  
	    	Scanner sc=new Scanner(System.in);  
	    	System.out.print("Enter the number of elements you want to store: ");  
	    	//reading the number of elements from the that we want to enter  
	    	n=sc.nextInt();  
	    	//creates an array in the memory of length n  
	    	int[] my_array = new int[n];  
	    	System.out.println("Enter the elements of the array: ");  
	    	for(int i=0; i<n; i++)  
	    	{  
	    	//reading array elements from the user   
	    	my_array[i]=sc.nextInt();  
	    	}  
	    	sc.close();
	    	//int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    	int sum = 0;
	    	for (int i : my_array)
	    	    sum += i;
	    	System.out.println("The sum is " + sum);
	    	}
	    	}
