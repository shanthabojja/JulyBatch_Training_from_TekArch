package basics; 
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Question08 {
	    	public static void main(String[] args) { 
	    	      LocalDate date = LocalDate.now();
	    	      LocalTime time = LocalTime.now();
	    	      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");    	
	    	      System.out.println("Date is:" +formatter.format(date));
	    	      System.out.println("Time is:" +time);

	    	}
}


//Write a Java program to print today’s date and current time

