package basics;

//import java.util.Scanner;
import java.util.Arrays;


//Write a java program to find find a given element in a array of 
//elements(consider integer nnumbers)


public class Question15 {
	public static void main(String[] args) { 
		 int checkValue = 11;
		 Integer my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 boolean test = Arrays.asList(my_array).contains(checkValue);
		 System.out.println(test);

}
}

//boolean test = false;
//for (int element : my_array) {
//    if (element == checkValue) {
//        test = true;
//        break;
//    }
//}