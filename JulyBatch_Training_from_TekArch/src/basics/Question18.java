package basics;
//write a java program to print the area and perimeter of a circle. 
//(create functions area(param list) and perimeter(param list)


public class Question18 {
		static float areaOfCircle(float Radius) {
		    return 3.14f*Radius*Radius;
		}
		static float perimeterOfCircle(float Radius) {
		    return 2*3.14f*Radius;
		}
		    
		public static void main(String[] args) {
			float Radius=10;
			float A=0;
			float P=0;
			A=areaOfCircle(Radius);
			P=perimeterOfCircle(Radius);
			System.out.println("Area of Circle is "  + A);
			System.out.println("Perimeter of Circle is "  + P);

		}	
	}

