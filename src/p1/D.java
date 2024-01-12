package p1;


import java.util.Scanner;

public class D{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int x, count=0;
		for (x=2;x<i; x++) {
			if(i%x==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(" the number is the prime number ");
		}else {
			System.out.println(" the number is not the Prime Number ");
		}
		
	}
}

