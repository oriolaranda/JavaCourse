import java.util.Random;
import java.util.Scanner;


public class Pricipal {

	/**
	 * Programa que crea una matriu 10x10 per omplir com una sopa de lletres
	 */
	public static void main(String[] args) {
		
		// Variables			
		char [][] matriu= new char [10][10];
		Scanner sc= new Scanner(System.in);		
		int opcio=0;
		String paraula = "";		
		int[] posicio= new int[2];
		int direccio=0;		
		
		//Opcions
				while(opcio!=5){
			//Menu
			System.out.println("Sopa de Lletres");
			System.out.println("1. Insertar paraula");
			System.out.println("2. Omplir matriu");
			System.out.println("3. Mostrar matriu");
			System.out.println("4. Borrar matriu");
			System.out.println("5. Sortir");		
			System.out.print("Introdueix una opció:");
			opcio= sc.nextInt();
			
			switch(opcio){
			case 1:
				System.out.println("Insertar una paraula");
				System.out.print("Escriu la paraula a insertar: ");
				paraula= sc.next();
				System.out.print("Determina la posicio X dins la matriu: ");
				posicio[0]= sc.nextInt();
				System.out.print("Determina la posicio Y dins la matriu: ");
				posicio[1]= sc.nextInt();
				System.out.print("Determina una direcció (1=Horitzontal/ 2=Vertical): ");
				direccio= sc.nextInt();
				insertarParaula(paraula,matriu,posicio,direccio);
				break;
			case 2:
				omplirMatriu(matriu);
				break;
			case 3:
				mostrarMatriu(matriu);
				break;
			case 4:
				borrarMatriu(matriu);
				break;
			case 5:
				break;
			default:
				System.out.println("Entra una opció correcta (1-5)");				
			}
		}
	}

	private static void borrarMatriu(char[][] matriu) {
		// Omple la matriu amb espais
		for(int j=0;j<matriu.length;j++){
			for(int i=0;i<matriu[j].length;i++){
				matriu[i][j]=(char)0;
			}
		}		
	}

	private static void mostrarMatriu(char[][] matriu) {
		// Mostra la matriu per pantalla
		for(int j=0;j<matriu.length;j++){
			for(int i=0;i<matriu[j].length;i++){
				System.out.print(matriu[i][j]);
			}
			System.out.println();
		}		
	}

	private static void omplirMatriu(char[][] matriu) {
		// Omple els espais buits amb lletres aleatóriament
		char caracter=' ';
		Random r= new Random();
		
		for(int j=0;j<matriu.length;j++){
			for(int i=0;i<matriu[j].length;i++){
				caracter= matriu[i][j];
				if(caracter==0) matriu[i][j]=(char)(r.nextInt(25)+97);
			}
		}		
	}

	private static void insertarParaula(String paraula,char[][] matriu, int[] posicio, int direccio) {
		// Inserta una paraula dins de la matriu
		
		int nlletres=0;
		int tamanyX=0;
		int tamanyY=0;	
		
		nlletres= paraula.length();
		tamanyX= posicio[0]+nlletres;
		tamanyY= posicio[1]+nlletres;
		
		if(tamanyX>10 || tamanyY>10){
			System.out.println("La paraula no hi cap");
		}else{
			if(direccio==1){
				for(int i=0;i<paraula.length();i++){
					matriu[posicio[0]+i][posicio[1]]=paraula.charAt(i);
				}
			}else{
				for(int i=0;i<paraula.length();i++){
					matriu[posicio[0]][posicio[1]+i]=paraula.charAt(i);
				}
			}			
		}		
	}
}
