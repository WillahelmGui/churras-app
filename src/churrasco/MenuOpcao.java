package churrasco;

import java.util.Scanner;

public class MenuOpcao {

	static Scanner sc = new Scanner(System.in);

	public static void menuopcao() {
		System.out.println("\n--------------------------");
		System.out.println("Escolha uma das opções");
		System.out.println("1. Cadastro");
		System.out.println("2. Seleção de Carnes e Cálculo");
		System.out.println("3. Sair");
		System.out.println("--------------------------");

	}

	public static void main(String[] args) {

		byte opcaoEscolhida = -1;

		while (opcaoEscolhida != 3) {
			menuopcao();
			opcaoEscolhida = sc.nextByte();

			switch (opcaoEscolhida) {
			case 1:
				Cadastro.CadastroClass();
				break;
			case 2:
				SelecaoDeCarnes.chamarSelecao();
				break;
			case 3:
				System.out.println("Aplicação encerrada.");
				break;
			default:
				System.out.println("digite um numero valido");
				break;
			}

		}
		sc.close();
	}

}