package churrasco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class selecaoDeCarnes {
	int C1;
	int C2;
	int C3;
	int C4;
	int C5;

	static boolean B1;
	static boolean B2;
	static boolean B3;
	static boolean B4;
	static boolean B5;

	public static void selecao() {

		ArrayList<String> productList = new ArrayList<String>();
		productList.add("Picanha");
		productList.add("Costela");
		productList.add("Asinha de Frango");
		productList.add("Linguiça");
		productList.add("Fraldinha");
		System.out.print(productList);

		System.out.println("\n/--------------------------------------------------\\");
		System.out.println("Escolha as carnes desejadas");
		System.out.println("Para escolher as carnes desejadas digite:");
		System.out.println("1. SIM  0. NÃO");
		System.out.println("Qualquer outro valor digitado será tratado como não.");
		System.out.println("\\--------------------------------------------------/");

		System.out.println("\n/-------------------------------------\\");
		System.out.println("VocÊ gostaria de comprar Picanha?");
		System.out.println("\\-------------------------------------/");
		int C1 = MenuOpcao.sc.nextInt();
		if (C1 == 1) {
			B1 = true;
		} else
			B1 = false;

		System.out.println("\n/-------------------------------------\\");
		System.out.println("VocÊ gostaria de comprar Costela?");
		System.out.println("\\-------------------------------------/");

		int C2 = MenuOpcao.sc.nextInt();

		if (C2 == 1) {
			B2 = true;
		} else
			B2 = false;

		System.out.println("\n/-------------------------------------\\");
		System.out.println("VocÊ gostaria de comprar Asinha de Frango?");
		System.out.println("\\-------------------------------------/");

		int C3 = MenuOpcao.sc.nextInt();
		if (C3 == 1) {
			B3 = true;
		} else
			B3 = false;

		System.out.println("\n/-------------------------------------\\");
		System.out.println("VocÊ gostaria de comprar Linguiça");
		System.out.println("\\-------------------------------------/");

		int C4 = MenuOpcao.sc.nextInt();
		if (C4 == 1) {
			B4 = true;
		} else
			B4 = false;

		System.out.println("\n/-------------------------------------\\");
		System.out.println("VocÊ gostaria de comprar Fraldinha?");
		System.out.println("\\-------------------------------------/");

		int C5 = MenuOpcao.sc.nextInt();
		if (C5 == 1) {
			B5 = true;
		} else
			B5 = false;

		if (B1 == true) {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você selecionou Picanha");
		} else
			System.out.println("\n/-------------------------------------\\\n" + "Você não selecionou  Picanha");
			
		if (B2 == true) {
			System.out.println("Você selecionou Costela");
		} else
			System.out.println("Você não selecionou Costela");
		if (B3 == true) {
			System.out.println("Você selecionou Asinha de Frango");
		} else
			System.out.println("Você não selecionou Asinha de Frango");
		if (B4 == true) {
			System.out.println("Você selecionou Linguiça");
		} else
			System.out.println("Você não selecionou Linguiça");
		if (B5 == true) {
			System.out.println("Você selecionou Fraldinha" + "\n\\\\-------------------------------------/");

		} else
			System.out.println("Você não selecionou Faraldinha" + "\n\\\\-------------------------------------/");

	}
}
