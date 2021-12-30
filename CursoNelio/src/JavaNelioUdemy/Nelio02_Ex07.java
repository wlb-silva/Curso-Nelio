package JavaNelioUdemy;

import java.util.Scanner;

public class Nelio02_Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double isento=2000;
		double faixa1=3000;
		double faixa2=4500;
	
		if (x>=0 && x<=2000) {
			System.out.println("Isento");
		}else if (x>=2000 && x<=3000) {
			x=(x-isento)*0.08;
			System.out.println("O valor é R$ "+x);
		}else if (x>3000 && x<=4500) {
			x=(1000*0.08)+(x-faixa1)*0.18;
			System.out.println("O valor é R$ "+x);
		}else if (x>4500) {
			x=(1000*0.08)+(1500*0.18)+(x-faixa2)*0.28;
			System.out.println("O valor é R$ "+x);
		}	
		
		sc.close();
	}

}
