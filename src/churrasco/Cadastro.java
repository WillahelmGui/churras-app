package churrasco;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
	
	

	private static Scanner scan;
	
	public static void CadastroClass() {
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		CADASTRO SELECIONADO");
		System.out.println("\\--------------------------------------------------/");
		
		ArrayList<String> nome = new ArrayList<>();
		scan = new Scanner(System.in);
		int quantosNomes;
		
		System.out.println("quantas pessoas comparecerão? ");
		quantosNomes = scan.nextInt();
		
		for(int i = 1; i<= quantosNomes; i++) {
		System.out.println("digite o nome dos participantes: ");
		nome.add(scan.next()+ scan.nextLine());
		
		}
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println("       LISTA DE PARTICIPANTES QUE COMPARECERÂO");
		System.out.println("\\--------------------------------------------------/");

		for(int j = 0; j < nome.size(); j++) {
			
			System.out.println(j + 1 +". " + nome.get(j));
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
	}
}
