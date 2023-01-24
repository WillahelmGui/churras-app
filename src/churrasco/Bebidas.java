package churrasco;

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
				
				break;
			//Código quando o usuário negar.
			case 0:
				break;
			}
		} while (kp != 0 && kp!=1);
	}
}