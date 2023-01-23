package churrasco;

import java.util.Scanner;

public class MenuOpcao {

	static Scanner sc = new Scanner(System.in);

	public static void menuopcao() {
		System.out.println("\n--------------------------");
		System.out.println("Escolha uma das opções");
		System.out.println("1. Cadastro");
		System.out.println("2. Seleção de Carnes");
		System.out.println("3. Cálculo");
		System.out.println("4. Sair");
		System.out.println("--------------------------");
		

	}
		

	public static void main(String[] args) {
		
		
		byte opcaoEscolhida = -1;
		

		while (opcaoEscolhida != 4) {
			menuopcao();
			opcaoEscolhida = sc.nextByte();

			switch (opcaoEscolhida) {
			case 1:
				cadastro.CadastroClass();
				break;
			case 2:
				SelecaoDeCarnes.selecao();
				break;
			case 3:
				Calculo.calcular();
				break;
			case 4:
				break;

			default:
				System.out.println("digite um numero valido");
				break;
			}
			
		}
		sc.close();
	}
	
}
