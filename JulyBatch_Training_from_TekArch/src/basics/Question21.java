package basics;

public class Question21 {
	public static void main(String[] args) {
		int NumberA=12345;
		int NumberB=1;
		int NumberC=0;
		for(int i=1;i<=5;i++) {
		System.out.println(NumberA);
		}
		System.out.println();
		for(int i=1;i<=5;i++) {	
		System.out.print(NumberB);
		System.out.print(NumberB);
		System.out.print(NumberB);
		System.out.print(NumberB);
		System.out.print(NumberB);
		System.out.println();
		NumberB++;
		}
		System.out.println();
		
		for(int i=1;i<=5;i++)  {
		   NumberC = NumberC * 10 + 1;
		   System.out.println(NumberC + " ");
		  } 
	}
}

/*
Write java programs to print the following patterns:

P1) 

12345
12345
12345
12345
12345


P2)
11111
22222
33333
44444
55555

P3)

1
11
111
1111
*/