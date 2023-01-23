package churrasco;

import java.util.Scanner;

class Calculo {

	public static void calcular() {
		
		double valor1, valor2, valor3, valor4, valor5,total;

		Scanner sc = new Scanner(System.in);
		double P;
		P = 67.90;
		System.out.println("quantos kg foram comprado de picanha ");
		double qtKg1 = sc.nextDouble();
		System.out.println(P * qtKg1);
		valor1 = P * qtKg1;

		double C;
		C = 27.34;
		System.out.println("quantos kg foram comprado de Costela ");
		double qtKg2 = sc.nextDouble();
		System.out.println(C * qtKg2);
		valor2 = C * qtKg2;

		double A;
		A = 17.99;
		System.out.println("quantos kg foram comprado de Assinha de frango");
		double qtKg3 = sc.nextDouble();
		System.out.println(A * qtKg3);
		valor3 = A * qtKg3;

		double L;
		L = 20.99;
		System.out.println("quantos kg foram comprado de Linguça  ");
		double qtKg4 = sc.nextDouble();
		System.out.println(L * qtKg4);
		valor4 = L * qtKg4;
		double F;
		F = 32.99;
		System.out.println("quantos kg foram comprado de Fraldinha ");
		double qtKg5 = sc.nextDouble();
		System.out.println(F*qtKg5);
		valor5 = F * qtKg5;

		total = ( + valor1 + valor2 + valor3 + valor4 + valor5);
		Math. round(total);
		System.out.println("o  valor total é " + total);
		sc.close();
	}
}
