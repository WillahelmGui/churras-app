package churrasco;

import java.util.Scanner;

public class Calculokg {

	static Scanner sc = new Scanner(System.in);

	public static void kgGrama() {
		System.out.println("imforme o numero de pessoas ");
		int pessoas = sc.nextInt();
		double Gp;
		Gp = 550;

		double kilos = Gp / 1000;

		double total = pessoas * kilos;
		System.out.println("kilos sao" + total + "kg");
	}
}
