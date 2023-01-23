package churrasco;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class menuOpcao {
	static Scanner scan;


	public void CadastroClass() {
		scan = new Scanner(System.in);
		int quantosNomes;

		
		ArrayList<String> nome = new ArrayList<>();
		System.out.println("quantos participantes comparecerão? ");
		quantosNomes = scan.nextInt();
		
		
		for(int i = 1; i<=quantosNomes; i++) {
		System.out.println("digite o nome do participante: ");
		
		nome.add(scan.next());
			
		}
		System.out.println("os paritipantes: "+ nome + " \nconfirmaram a presença");
		
		

		
		
		
	}
}
