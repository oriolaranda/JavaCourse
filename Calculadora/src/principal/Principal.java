package principal;

import java.util.Scanner;


public class Principal {
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		Matematiques mat = new Matematiques();
		int a;
		int s=0;
		while (s<1){
			System.out.println("_______MENÚ_______");
			System.out.println("1--> Claculadora bàsica");
			System.out.println("2--> Calculadora científica");
			String menu = sc.nextLine();
			switch (menu){
			case "1":
				calculadora_basica(mat);
				break;
			case "2":
				calculadora_cientifica(mat);
				break;
			case "3":
				s++;
				System.out.println("Heu sortit de la calculadora");
				break;
			default:
		
				break;
			}
		}
		
	}
	public static void neteja(Matematiques mat){
		int salts=25;
		for(int i = 0; i < salts; i++){ 
			System.out.println(); 
		} 
	}
	public static void calculadora_basica(Matematiques mat) {
		Scanner sc=new Scanner (System.in);
		char a;
		int s=0;
		int j=0;
		while(s<1){
			System.out.println("_______MENÚ_______");
			System.out.println("1--> Suma");
			System.out.println("2--> Resta");
			System.out.println("3--> Multiplicació");
			System.out.println("4--> Divisió");
			System.out.println("5--> Potencies");
			System.out.println("6--> Arrel quadrada");
			System.out.println("7--> Tornar al menú principal");
			char menu = sc.next().charAt(0);
			
			
			switch (menu){
			case '1':
				while (j<1){
				neteja(mat);
				System.out.println("SUMA");
				mat.suma_cientifica();
				System.out.println("Retornar-->E");
				a= sc.next().charAt(0);
				if (a=='e'|a=='E'){
					j++;
				}else{
					
				}
				}
				j=0;
				break;
			case '2':
				while (j<1){
				mat.resta_cientifica();
				System.out.println("Retornar-->E");
				a= sc.next().charAt(0);
				if (a=='e'|a=='E'){
					j++;
				}
				}
				j=0;
				break;
			case '3':
				while (j<1){
				mat.multiplicacio();
				System.out.println("Retornar-->E");
				a= sc.next().charAt(0);
				if (a=='e'|a=='E'){
					j++;
				}
				}
				j=0;
				break;
			case '4':
				while (j<1){
				mat.divisio();
				System.out.println("Retornar-->E");
				a= sc.next().charAt(0);
				if (a=='e'|a=='E'){
					j++;
				}
				}
				j=0;
				break;
			case '5':
				while (j<1){
				mat.potencia();
				System.out.println("Retornar-->E");
				a= sc.next().charAt(0);
				if (a=='e'|a=='E'){
					j++;
				}
				}
				j=0;
				break;
			case '6':
				while (j<1){
				mat.arrelquadrada();
				System.out.println("Retornar-->E");
				a= sc.next().charAt(0);
				if (a=='e'|a=='E'){
					j++;
				}
				}
				j=0;
				break;
			case '7':
				s++;
				break;
			default:
				break;
			}
		}
	
	}
	
	public static void calculadora_cientifica(Matematiques mat) {
		Scanner sc=new Scanner (System.in);
		char a;
		int s=0;
		int j=0;
		while(s<1){
			System.out.println("_______MENÚ_______");
			System.out.println("1--> Descomposició Factorial");
			//System.out.println("2--> Resta");
			//System.out.println("3--> Multiplicació");
			//System.out.println("4--> Divisió");
			//System.out.println("5--> Potencies");
			//System.out.println("6--> Arrel quadrada");
			System.out.println("7--> Tornar al menú principal");
			char menu = sc.next().charAt(0);
			
			
			switch (menu){
			case '1':
				while (j<1){
				System.out.println("DESCOMPOSICIÓ FACTORIAL");
				mat.descomposicio_factorial();
				System.out.println("Retornar-->E");
				a= sc.next().charAt(0);
					if (a=='e'|a=='E'){
						j++;
					}
				}
				j=0;
				break;
			case '7':
				s++;
				break;
			default:
				break;
			}
		}
	}
}
