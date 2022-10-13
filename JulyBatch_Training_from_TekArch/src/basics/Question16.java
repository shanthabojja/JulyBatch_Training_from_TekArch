package basics;
import java.util.Scanner;  

//Write a Java program to accept Name, Age, Gender of a person 
//from the user and print them in separate lines



public class Question16 {
	    
	public static void main(String[] args) {
		String Name;
		int Age=0;
		String Gender;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Name of a Person: "); 
		Name=sc.next();     
		System.out.print("Age of a Person: "); 
		Age=sc.nextInt();
		System.out.print("Gender of a Person: "); 
		Gender=sc.next();
	
		System.out.println("Person's Name is: "  + Name);
		System.out.println("Person's Age is: "  + Age);
		System.out.println("Person's Gender is: "  + Gender);
		sc.close();
	
		
	}
}



