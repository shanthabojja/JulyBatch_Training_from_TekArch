package basics; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Question09 {
	    	public static void main(String[] args) { 
	    	      LocalDate date = LocalDate.now();
	    	      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	    	      System.out.println(formatter.format(date));

	    	}
}


