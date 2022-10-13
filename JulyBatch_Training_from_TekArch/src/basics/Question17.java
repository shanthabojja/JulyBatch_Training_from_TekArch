package basics;
import java.util.Scanner;  

//Write java program to accept three numbers from the keyboard and 
//print the sum and average of them.(create functions sum(param list) 
//and average(param list))

public class Question17 {
	static int sum(int firstNum,int secondNum,int thirdNum) {
	    return firstNum+secondNum+thirdNum;
	}
	
	static int avg(int firstNum,int secondNum,int thirdNum) {
	    return (firstNum+secondNum+thirdNum)/3;
	}
	    
	public static void main(String[] args) {
		int firstNum=10;
		int secondNum=0;
		int thirdNum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: "); 
		firstNum=sc.nextInt(); 
		System.out.print("Enter second number: "); 
		secondNum=sc.nextInt();
		System.out.print("Enter third number: "); 
		thirdNum=sc.nextInt();
		sc.close();
		int sum;
		int avg;
		sum=sum(firstNum,secondNum,thirdNum);
		avg=avg(firstNum,secondNum,thirdNum);
		System.out.println("Sum of 3 numbers is: "  + sum);
		System.out.println("Avg of 3 numbers is: "  + avg);

	}
}



