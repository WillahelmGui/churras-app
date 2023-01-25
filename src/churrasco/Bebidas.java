package churrasco;

import java.util.ArrayList;

public class Bebidas {

	public static void selecao() {	
		
		int kp;
		
		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar bebidas?");
			System.out.println("1. Sim 0. Não");
			System.out.println("\\-------------------------------------/");
			switch (kp = MenuOpcao.sc.nextByte()) {
			//Código quando o usuário aceitar.
			case 1:
				Bebidas.mostrarBebidas();
				break;
			//Código quando o usuário negar.
			case 0:
				break;
			}
		} while (kp != 0 && kp!=1);
	}
	public static void mostrarBebidas() {
		System.out.println("\\n/-------------------------------------\\\\");
		System.out.println("Você gostaria de comprar bebidas?");
		System.out.println("1. Sim 0. Não");
		System.out.println("\\-------------------------------------/");
		
		//Declara a ArrayList "listaDeBebidas".
				ArrayList<String> listaDeBebidas = new ArrayList<String>();
				listaDeBebidas.add("Cerveja");
				listaDeBebidas.add("Refrigerante");
				listaDeBebidas.add("Suco");
				listaDeBebidas.add("Água");
				listaDeBebidas.add("Caipirinha");
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
					listaDeBebidas.add("Picanha");
				} else
					System.out.println("\n/-------------------------------------\\\n" + "Você não selecionou  Picanha");

				if (B2 == true) {
					System.out.println("Você selecionou Costela");
					listaDeBebidas.add("Costela");
				} else
					System.out.println("Você não selecionou Costela");
				if (B3 == true) {
					System.out.println("Você selecionou Asinha de Frango");
					listaDeBebidas.add("Asinha de Frango");
				} else
					System.out.println("Você não selecionou Asinha de Frango");
				if (B4 == true) {
					System.out.println("Você selecionou Linguiça");
					listaDeBebidas.add("Linguiça");
				} else
					System.out.println("Você não selecionou Linguiça");
				if (B5 == true) {
					System.out.println("Você selecionou Fraldinha" + "\n\\\\-------------------------------------/");
					listaDeBebidas.add("Fraldinha");

				} else
					System.out.println("Você não selecionou Faraldinha" + "\n\\\\-------------------------------------/");
	}
}