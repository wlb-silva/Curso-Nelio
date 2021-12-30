package JavaNelioUdemy;

import java.util.Locale;

import java.util.Scanner;

public class Nelio02_Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		
		if(x>=0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		sc.close();
		
}
}