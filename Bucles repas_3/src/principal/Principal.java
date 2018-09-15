package principal;

import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Opció A:Mostrar un missatge");
		System.out.println("Opció B:Mostrar un altre missatge");
		System.out.println("Opció C:Mostrar un últim missatge");
		System.out.println("Opció O:Sortir");
		String opc =sc.nextLine();
		while (opc !="o"){
			switch(opc){
			case "A":
			case "a":
				System.out.println("Mostrar un missatge");
				opc = sc.nextLine();
				break;
			case "B":
			case "b":
				System.out.println("Mostrar un altre missatge");
				opc= sc.nextLine();
				break;
			case "C":
			case "c":
				System.out.println("Mostrar un últim missatge");
				opc= sc.nextLine();
				break;
			case "O":
			case "o":
				break;
			default:
				System.out.println("La lletra no es correspon amb cap opció");
				opc= sc.nextLine();
				}
			}
			
	}
}
