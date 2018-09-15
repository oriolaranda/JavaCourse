package principal;

import java.util.Random;
import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_76 = 0; 
		char[][] matriu = new char[10][10];
		omplir_matriu(matriu);
		while(num_76 != 1){	
		System.out.println("____________Menú_____________");		
		System.out.println("1 --> Insertar una paraula");
		System.out.println("2 --> Omplir matriu de caràcters aleatoris");
		System.out.println("3 --> Mostra la matriu");
		System.out.println("4 --> Borrar matriu");
		System.out.println("5 --> Sortir");
		int opcio = sc.nextInt();		
		switch (opcio){
		case 1:
			matriu = insertar_paraula(matriu); 
			break;
		case 2:
			matriu = omple_aleatori(matriu); 
			break;
		case 3:
			mostrar_matriu(matriu); 
			break;
		case 4:
			matriu = borrar_matriu(matriu); 
			break;
		case 5:
			System.out.println("Adéu!"); 
			num_76++;
			break;
		default:
			System.out.println("Has d'insertar un numero vàlid!"); 
		}
		}
	}
	
	public static char[][] omplir_matriu(char [][] matriu){
		for(int i = 0; i<10; i++){
			for(int j = 0; j<10;j++){
					matriu[i][j] = '0';
			}			
		}
		return matriu;
	}
	
	
	public static char[][] insertar_paraula(char[][] matriu){
		Scanner sc = new Scanner(System.in);
		int y = 0; int j = 0;
		System.out.println("Inserta la paraula que vols posar, les coordenades i després la direcció.");
		String paraula;
		do{
			System.out.println("Paraula: ");
			paraula = sc.nextLine().toUpperCase();
		}while ( paraula.length() > 10);
		
		System.out.println("Coordenada vertical(0/9): ");
		int posicio_1 = sc.nextInt();
		
		System.out.println("Coordenada horitzontal(0/9): ");
		int posicio_2 = sc.nextInt();
		
		
		System.out.println("Direcció (1 = d'esquerra a dreta i 2 = de dalt a baix)");
		int direccio = sc.nextInt();			 
		
		
		if(posicio_1+paraula.length()<=10 || posicio_2+paraula.length()<=10){	
			if (direccio==1){
				for(int i = posicio_2; j < paraula.length(); j++){		
					matriu [posicio_1][i]= paraula.charAt(y); 
					i++;
					y++;
				}
			}else{
				for(int i=posicio_1; j < paraula.length(); j++){
					matriu [i][posicio_2]= paraula.charAt(y);
					i++;
					y++;
				}
			}
		}else{
			System.out.println("La paraula no hi cap");
		}
		return matriu;
	}
		
	
	public static char[][] omple_aleatori(char [][] matriu){
		Random r = new Random();
		
		for(int i = 0; i<10; i++){
			for(int j = 0; j<10;j++){
					if (matriu[i][j] == '0'){
						matriu[i][j] = (char) (r.nextInt(25)+65);
					}
			}	
		}
		System.out.println("La matriu s'ha omplert de caràcters aleatoris.");
		return matriu;
	}
		
	
	public static void mostrar_matriu(char[][] matriu){
		for(int i = 0; i<10; i++){
			for(int j = 0; j<10;j++){
				System.out.print(matriu[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static char[][] borrar_matriu(char[][] matriu){
		for(int i = 0; i<10; i++){
			for(int j = 0; j<10;j++){
				matriu[i][j] = 32;
			}
		}
		return matriu;
	}
}
