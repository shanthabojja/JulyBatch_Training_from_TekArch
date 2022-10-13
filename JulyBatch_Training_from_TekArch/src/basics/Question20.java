package basics;
import java.util.Scanner;

public class Question20 {
	public static void main(String[] args) {     
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter the number in x: ");  
    int x =sc.nextInt();  
    System.out.print("Enter the number in y: ");  
	int y =sc.nextInt(); 
	sc.close();
    /*Swapping*/  
    x = x + y;   
    y = x - y;   
    x = x - y;   


	System.out.println("Swaped X is " + x);
	System.out.println("Swaped Y is " + y);
	}
}
