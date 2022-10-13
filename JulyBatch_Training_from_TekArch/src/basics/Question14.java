package basics;

//import java.util.Scanner;


public class Question14 {
	public static void main(String[] args) { 
		int age=51;
    	
//		System.out.print("Enter the Age: ");  
//		Scanner sc=new Scanner(System.in);
//		age=sc.nextInt();
//		sc.close();
		
		if (age <= 2) 
		System.out.println("age group is toddler");
   		else if (age > 2 && age <= 10)
        System.out.println("age group is kid");
   		else if (age > 10 && age <= 18)
        System.out.println("age group is children");
   		else if (age > 18 && age <= 30) 
   		System.out.println("age group is young adult");
   		else if (age > 30 && age <= 45) 
        System.out.println("age group is adult");
   		else if (age > 45 && age <= 50) 
   		System.out.println("age group is old adult");
   		else
   		System.out.println("age group is Senior citizen");

		
        
      }
	}

//		Write the java program to print age group depending on the age value entered
//		If age<=2 then age group is toddler
//		If age>2 and age<=10 then age group is kid
//		If age>10 and age<=18 then children
//		If age>18 and age<=30 then young adult
//		If age>30 and age<=45 then adult
//		If age>45 and age<=50 then old adult
//		If age>50 then Senior citizen