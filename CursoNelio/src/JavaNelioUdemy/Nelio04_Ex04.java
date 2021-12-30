package JavaNelioUdemy;

import java.util.Scanner;

public class Nelio04_Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++) {
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double result=a/b;
			
			if (b==0) {
				System.out.println("divisão impossível");
			}else {
				System.out.println(result);
				
			}
			
		}sc.close();
	}

}
