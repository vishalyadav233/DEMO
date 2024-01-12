// to find the even number between the given range 
// to find the given range odd number in the java give range
package p1;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" enter the number of the limits :");
		int i = input.nextInt();
		for ( int x =1; x<i; x++) {
			if ( x%2==1) {
				System.out.println(x);
			}
			
			
		}
		
	}
}