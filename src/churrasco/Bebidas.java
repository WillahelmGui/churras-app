package churrasco;

public class Bebidas {
	public static void selecao() {
		System.out.println("\n/-------------------------------------\\");
		System.out.println("Você gostaria de comprar bebidas?");
		System.out.println("1. Sim 0. Não");
		System.out.println("\\-------------------------------------/");

		int kp = MenuOpcao.sc.nextByte();
		switch(kp) {
		case 1:
			break;
		case 0:
			break;
		default:
			break;
		}
	}
}
