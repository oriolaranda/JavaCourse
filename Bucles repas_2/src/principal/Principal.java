package principal;

import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Opci� 1:Mostrar un missatge");
		System.out.println("Opci� 2:Mostrar un altre missatge");
		System.out.println("Opci� 3:Mostrar un �ltim missatge");
		System.out.println("Opci� 4:Sortir");
		int opc= sc.nextInt();
		while(opc != 4){
			
			switch(opc){
			case 1:
				System.out.println("Mostrar un missatge");
				opc = sc.nextInt();
				break;
			case 2:
				System.out.println("Mostrar un altre missatge");
				opc= sc.nextInt();
				break;
			case 3:
				System.out.println("Mostrar un �ltim missatge");
				opc= sc.nextInt();
				break;

			default:
				System.out.println("El numero no es correspon amb cap opci�");
				opc= sc.nextInt();
			}
		
		}
	}

}
