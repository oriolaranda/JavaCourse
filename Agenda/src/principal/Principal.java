package principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Agenda a = new Agenda();
		int num1=0;
		while(num1<1){
			Scanner sc= new Scanner (System.in);
			System.out.println("____________Menú_____________");		
			System.out.println("1 --> Afegeix contacte");
			System.out.println("2 --> Mostra agenda");
			System.out.println("3 --> Borrar contacte");
			System.out.println("4 --> Sortir");
			String opcio = sc.nextLine();
			
			switch (opcio){
			case "1":
				System.out.println();
				System.out.print("Afegeix nom: ");
				String nom1 = sc.nextLine().toLowerCase();
				String nom= nom1.substring(0,1).toUpperCase()+ nom1.substring(1,nom1.length());
				System.out.print("Afegeix cognom: ");
				String cognom1 = sc.nextLine().toLowerCase();
				String cognom= cognom1.substring(0,1).toUpperCase()+ cognom1.substring(1,cognom1.length());
				System.out.print("Afegeix telefon: ");
				String telefon = sc.nextLine();
				System.out.println();
				Persona p= new Persona();
				p.afegir_nom(nom);
				p.afegir_cognom(cognom);
				p.afegir_telefon(telefon);
				a.afegir(p);
				break;
				
			case "2":
				a.mostra();
				break;
			case "3":
				a.elimina();
				break;
			case "4":
				System.out.println("Has sortit de l'agenda");
				num1++;
				break;
			default:
				System.out.println("El numero introduït no correspon a cap opció");
				System.out.println();
				break;
			}
		}
	}

}
