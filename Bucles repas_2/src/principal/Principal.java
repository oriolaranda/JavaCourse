package principal;

import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Opció 1:Mostrar un missatge");
		System.out.println("Opció 2:Mostrar un altre missatge");
		System.out.println("Opció 3:Mostrar un últim missatge");
		System.out.println("Opció 4:Sortir");
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
				System.out.println("Mostrar un últim missatge");
				opc= sc.nextInt();
				break;

			default:
				System.out.println("El numero no es correspon amb cap opció");
				opc= sc.nextInt();
			}
		
		}
	}

}
