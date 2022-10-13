package basics;
//write a java program to print the area(width *height) and perimeter(2* (width+height)) 
// of a rectangle(create functions areaOfRectangle(param list)
// and perimeterOfRectangle(param list) )

public class Question19 {
	static int areaOfRectangle(int length,int width) {
	    return length * width;
	}
	static int perimeterOfRectangle(int length,int width) {
	    return 2*(length+width);
	}
	    
	public static void main(String[] args) {
		int length=10;
		int width=20;
		int A=0;
		int P=0;
		A=areaOfRectangle(length,width);
		P=perimeterOfRectangle(length,width);
		System.out.println("Area of Rectangle is "  + A);
		System.out.println("Perimeter of Rectangle is "  + P);

	}	
}
