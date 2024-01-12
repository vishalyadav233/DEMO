package p1;

//Write a program to find oy=ut the sum of the Give range in the java

import java.util.Scanner;

public class  C {
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in);
		System.out.println(" Enter the number of the limits :");
		int sum = 0;
		int i = s.nextInt();
		
		for ( int x = 1;x<=i; x++ ) {
			if ( x%2==0) {
				System.out.println(x);
			}
			
			
			sum = sum+x;
			
		}
		System.out.println(" The output  Sum "+sum);
	}
}