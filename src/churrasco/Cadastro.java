package churrasco;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
	
	

	private static Scanner scan;
	
	public static void CadastroClass() {
		System.out.println("\\--------------------------------------------------\\");
		System.out.println("              CADASTRO SELECIONADO");
		System.out.println("\\--------------------------------------------------\\");

		System.out.println(" ");
		
		ArrayList<String> nome = new ArrayList<>();
		scan = new Scanner(System.in);
		int quantosNomes;
		System.out.println("quantos participantes comparecerão? ");
		quantosNomes = scan.nextInt();
		
		for(int i = 1; i<= quantosNomes; i++) {
		System.out.println("digite o nome do participante: ");
		nome.add(scan.next()+ scan.nextLine());
		
		}
		System.out.println("\\--------------------------------------------------\\");
		System.out.println("       LISTA DE PARTICIPANTES QUE COMPARECERÂO");
		System.out.println("\\--------------------------------------------------\\");
		System.out.println(" ");

		for(int j = 0; j < nome.size(); j++) {
			System.out.println(nome.get(j));
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
	}
}
