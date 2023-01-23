package Churrasco;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class churrasAppMenu {
	static Scanner scan;


	public void CadastroClass() {
		scan = new Scanner(System.in);
		int quantosNomes;
		String nomes;
		
		ArrayList<String> nome = new ArrayList<>();
		System.out.println("quantos participantes comparecerão? ");
		quantosNomes = scan.nextInt();
		
		
		for(int i = 0; i<=quantosNomes; i++) {
		System.out.println("digite o nome do participante: ");
		
		nome.add(scan.nextLine());
			
		}
		System.out.println(nome);
		
		

		
		
		
	;
