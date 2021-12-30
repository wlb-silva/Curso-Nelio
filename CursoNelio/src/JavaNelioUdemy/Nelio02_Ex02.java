package JavaNelioUdemy;

import java.util.Scanner;

public class Nelio02_Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		if(x%2==0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		sc.close();
		
		
	}

}
