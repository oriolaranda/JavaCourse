package principal;

import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Opci� A:Mostrar un missatge");
		System.out.println("Opci� B:Mostrar un altre missatge");
		System.out.println("Opci� C:Mostrar un �ltim missatge");
		System.out.println("Opci� O:Sortir");
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
				System.out.println("Mostrar un �ltim missatge");
				opc= sc.nextLine();
				break;
			case "O":
			case "o":
				break;
			default:
				System.out.println("La lletra no es correspon amb cap opci�");
				opc= sc.nextLine();
				}
			}
			
	}
}
