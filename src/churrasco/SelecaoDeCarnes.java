package churrasco;

import java.util.ArrayList;

public class SelecaoDeCarnes {
	static int C1;
	static int C2;
	static int C3;
	static int C4;
	static int C5;

	static boolean B1;
	static boolean B2;
	static boolean B3;
	static boolean B4;
	static boolean B5;

	static ArrayList<String> produtosSelecionados;

	public static void chamarSelecao() {
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		  SELEÇÃO DE CARNES");
		System.out.println("\\--------------------------------------------------/");

		System.out.println("As carnes disponíveis são: ");

		// Declara a ArrayList "Lista de Produtos".
		ArrayList<String> ListaDeProdutos = new ArrayList<String>();
		ListaDeProdutos.add("Picanha");
		ListaDeProdutos.add("Costela");
		ListaDeProdutos.add("Asinha de Frango");
		ListaDeProdutos.add("Linguiça");
		ListaDeProdutos.add("Fraldinha");
		// Declara a ArrayList "Produtos Selecionados".
		produtosSelecionados = new ArrayList<String>();
		for (int j = 0; j < ListaDeProdutos.size(); j++) {

			System.out.println(j + 1 + ". " + ListaDeProdutos.get(j));
		}

		System.out.println("\n/--------------------------------------------------\\");
		System.out.println("Escolha as carnes desejadas");
		System.out.println("Para escolher as carnes desejadas digite:");
		System.out.println("1. SIM  0. NÃO");
		System.out.println("Qualquer outro valor digitado será tratado como não.");
		System.out.println("\\--------------------------------------------------/");

		// Sequência de perguntas a respeito das carnes.
		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar Picanha?");
			System.out.println("\\-------------------------------------/");
			SelecaoDeCarnes.C1 = MenuOpcao.sc.nextInt();

			if (C1 == 1) {
				B1 = true;
			} else
				B1 = false;
		} while (C1 != 1 && C1 != 0);

		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar Costela?");
			System.out.println("\\-------------------------------------/");

			SelecaoDeCarnes.C2 = MenuOpcao.sc.nextInt();

			if (C2 == 1) {
				B2 = true;
			} else
				B2 = false;
		} while (C2 != 0 && C2 != 1);

		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar Asinha de Frango?");
			System.out.println("\\-------------------------------------/");

			SelecaoDeCarnes.C3 = MenuOpcao.sc.nextInt();
			if (C3 == 1) {
				B3 = true;
			} else
				B3 = false;
		} while (C3 != 0 && C3 != 1);
		System.out.println("\n/-------------------------------------\\");
		System.out.println("Você gostaria de comprar Linguiça");
		System.out.println("\\-------------------------------------/");

		do {
			SelecaoDeCarnes.C4 = MenuOpcao.sc.nextInt();
			if (C4 == 1) {
				B4 = true;
			} else
				B4 = false;
		} while (C4 != 0 && C4 != 1);

		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar Fraldinha?");
			System.out.println("\\-------------------------------------/");

			SelecaoDeCarnes.C5 = MenuOpcao.sc.nextInt();
			if (C5 == 1) {
				B5 = true;
			} else
				B5 = false;
		} while (C5 != 0 && C5 != 1);
		if (B1 == true) {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você selecionou Picanha");
			produtosSelecionados.add("Picanha");
		} else
			System.out.println("\n/-------------------------------------\\\n" + "Você não selecionou  Picanha");

		if (B2 == true) {
			System.out.println("Você selecionou Costela");
			produtosSelecionados.add("Costela");
		} else
			System.out.println("Você não selecionou Costela");
		if (B3 == true) {
			System.out.println("Você selecionou Asinha de Frango");
			produtosSelecionados.add("Asinha de Frango");
		} else
			System.out.println("Você não selecionou Asinha de Frango");
		if (B4 == true) {
			System.out.println("Você selecionou Linguiça");
			produtosSelecionados.add("Linguiça");
		} else
			System.out.println("Você não selecionou Linguiça");
		if (B5 == true) {
			System.out.println("Você selecionou Fraldinha" + "\n\\\\-------------------------------------/");
			produtosSelecionados.add("Fraldinha");

		} else
			System.out.println("Você não selecionou Faraldinha" + "\n\\\\-------------------------------------/");

		Bebidas.selecao();
		Calculokg.kgGrama();
	}
}