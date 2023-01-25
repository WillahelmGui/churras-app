package churrasco;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Bebidas {
	static int Beb1;
	static int Beb2;
	static int Beb3;
	static int Beb4;
	static int Beb5;

	static boolean T1;
	static boolean T2;
	static boolean T3;
	static boolean T4;
	static boolean T5;

	static double BebidasMLTotal;
	static double BebidaPessoa = 1400;
	static DecimalFormat df = new DecimalFormat("0.00");
	
	static ArrayList<String> BebidasSelecionadas;
	
	public static void selecao() {

		int kp;

		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar bebidas?");
			System.out.println("1. Sim 0. Não");
			System.out.println("\\-------------------------------------/");
			switch (kp = MenuOpcao.sc.nextByte()) {
			// Código quando o usuário aceitar.
			case 1:
				Bebidas.mostrarBebidas();
				break;
			// Código quando o usuário negar.
			case 0:
				break;
			}
		} while (kp != 0 && kp != 1);
	}

	public static void mostrarBebidas() {
		// Declara a ArrayList "listaDeBebidas".
		ArrayList<String> listaDeBebidas = new ArrayList<String>();
		listaDeBebidas.add("Cerveja");
		listaDeBebidas.add("Refrigerante");
		listaDeBebidas.add("Suco");
		listaDeBebidas.add("Água");
		listaDeBebidas.add("Caipirinha");
		
		BebidasSelecionadas = new ArrayList<String>();
		
		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar Cerveja?");
			System.out.println("\\-------------------------------------/");

			Beb1 = MenuOpcao.sc.nextInt();
			if (Beb1 == 1) {
				T1 = true;
			} else
				T1 = false;
		} while (Beb1 != 0 && Beb1 != 1);
		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar Refrigerante?");
			System.out.println("\\-------------------------------------/");

			Beb2 = MenuOpcao.sc.nextInt();
			if (Beb2 == 1) {
				T2 = true;
			} else
				T2 = false;
		} while (Beb2 != 0 && Beb2 != 1);
		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar Suco?");
			System.out.println("\\-------------------------------------/");

			Beb3 = MenuOpcao.sc.nextInt();
			if (Beb3 == 1) {
				T3 = true;
			} else
				T3 = false;
		} while (Beb3 != 0 && Beb3 != 1);
		System.out.println("\n/-------------------------------------\\");
		System.out.println("Você gostaria de comprar Água");
		System.out.println("\\-------------------------------------/");

		do {
			Beb4 = MenuOpcao.sc.nextInt();
			if (Beb4 == 1) {
				T4 = true;
			} else
				T4 = false;
		} while (Beb4 != 0 && Beb4 != 1);

		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar Caipirinha?");
			System.out.println("\\-------------------------------------/");

			Beb5 = MenuOpcao.sc.nextInt();
			if (Beb5 == 1) {
				T5 = true;
			} else
				T5 = false;
		} while (Beb5 != 0 && Beb5 != 1);

		if (T1 == true) {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você selecionou Cerveja");
			BebidasSelecionadas.add("Cerveja");
		} else
			System.out.println("\n/-------------------------------------\\\n" + "Você não selecionou Cerveja");

		if (T2 == true) {
			System.out.println("Você selecionou Refrigerante");
			BebidasSelecionadas.add("Refrigerante");
		} else
			System.out.println("Você não selecionou Refrigerante");
		if (T3 == true) {
			System.out.println("Você selecionou Suco");
			BebidasSelecionadas.add("Suco");
		} else
			System.out.println("Você não selecionou Suco");
		if (T4 == true) {
			System.out.println("Você selecionou Água");
			BebidasSelecionadas.add("Água");
		} else
			System.out.println("Você não selecionou Água");
		if (T5 == true) {
			System.out.println("Você selecionou Caipirinha" + "\n\\\\-------------------------------------/");
			BebidasSelecionadas.add("Caipirinha");
		} else
			System.out.println("Você não selecionou Caipirinha" + "\n\\\\-------------------------------------/");
	BebidasMLTotal = Cadastro.quantosNomes * BebidaPessoa;
	if (BebidasMLTotal == 0) {
		System.out.println("Epa! Você não cadastrou ninguém no seu churrasco! \n"
				+ "Volte para o menu e cadastre os participantes. ");
	} else {
		System.out.println("Você deve comprar: " + BebidasMLTotal / 1000 + "L de bebidas, sendo elas: ");
		for (int k = 0; k < Bebidas.BebidasSelecionadas.size(); k++) {
			System.out.println(
					k + 1 + ". " + df.format((BebidasMLTotal / 1000) / Bebidas.BebidasSelecionadas.size())
							+ "L de " + Bebidas.BebidasSelecionadas.get(k));
		}
	
	}
}}