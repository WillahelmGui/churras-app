package churrasco;

import java.util.ArrayList;

public class SelecaoDeCarne {
	// Variáveis para as perguntas
	static int C1;
	static int C2;
	static int C3;
	static int C4;
	static int C5;
	// Varíáveis para cada boolean
	static boolean B1;
	static boolean B2;
	static boolean B3;
	static boolean B4;
	static boolean B5;
	// Variáveis para os preços;
	static ArrayList<Double> precos;
	static ArrayList<String> produtosSelecionados;

	public static void chamarSelecao() {
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		  SELEÇÃO DE CARNES");
		System.out.println("\\--------------------------------------------------/");

		System.out.println("As carnes disponíveis são: ");

		// Declara a ArrayList "Lista de Produtos".
		ArrayList<String> ListaDeProdutos = new ArrayList<String>();
		ListaDeProdutos.add("Picanha 		66.79Kg");
		ListaDeProdutos.add("Costela 		27.34Kg");
		ListaDeProdutos.add("Asinha de Frango 	17.99Kg");
		ListaDeProdutos.add("Linguiça 		20.99Kg");
		ListaDeProdutos.add("Fraldinha		32.99Kg");

		for (int j = 0; j < ListaDeProdutos.size(); j++) {

			System.out.println(j + 1 + ". " + ListaDeProdutos.get(j));
		}
		// Declara a ArrayList "Produtos Selecionados".
		produtosSelecionados = new ArrayList<String>();
		// Declara a List "precos".
		precos = new ArrayList<>();
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println("Escolha as carnes desejadas");
		System.out.println("Para escolher as carnes desejadas digite:");
		System.out.println("1. SIM  0. NÃO");
		System.out.println("Qualquer outro valor digitado será tratado como não.");
		System.out.println("\\--------------------------------------------------/");

		// Sequência de perguntas a respeito das carnes.
		do {
			System.out.println("Você gostaria de comprar Picanha?");
			SelecaoDeCarne.C1 = Application.sc.nextInt();

			if (C1 == 1) {
				B1 = true;
			} else
				B1 = false;
		} while (C1 != 1 && C1 != 0);

		do {
			System.out.println("Você gostaria de comprar Costela?");

			SelecaoDeCarne.C2 = Application.sc.nextInt();

			if (C2 == 1) {
				B2 = true;
			} else
				B2 = false;
		} while (C2 != 0 && C2 != 1);

		do {
			System.out.println("Você gostaria de comprar Asinha de Frango?");

			SelecaoDeCarne.C3 = Application.sc.nextInt();
			if (C3 == 1) {
				B3 = true;
			} else
				B3 = false;
		} while (C3 != 0 && C3 != 1);
		System.out.println("Você gostaria de comprar Linguiça");

		do {
			SelecaoDeCarne.C4 = Application.sc.nextInt();
			if (C4 == 1) {
				B4 = true;
			} else
				B4 = false;
		} while (C4 != 0 && C4 != 1);

		do {
			System.out.println("Você gostaria de comprar Fraldinha?");
	

			SelecaoDeCarne.C5 = Application.sc.nextInt();
			if (C5 == 1) {
				B5 = true;
			} else
				B5 = false;
		} while (C5 != 0 && C5 != 1);

		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 	LISTA DE CARNES SELECIONADAS");
		System.out.println("\\--------------------------------------------------/");
		if (B1 == true) {
			produtosSelecionados.add("Picanha");
			precos.add(66.79);
		}


		if (B2 == true) {
			produtosSelecionados.add("Costela");
			precos.add(27.34);
		} 
		if (B3 == true) {
			produtosSelecionados.add("Asinha de Frango");
			precos.add(17.99);
		}
		if (B4 == true) {
			produtosSelecionados.add("Linguiça");
			precos.add(20.99);
		}
		if (B5 == true) {
			
			produtosSelecionados.add("Fraldinha");
			precos.add(32.99);
		} 
		for (int k = 0; k < produtosSelecionados.size(); k++) {
			System.out.println(k + 1 + ". " + produtosSelecionados.get(k));
		}
		Bebida.selecao();
		Calculokg.kgGrama();

	}
}
