package principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		Scanner sc=new Scanner ( System.in);
		int s=0;
		int temps= 150;
		int salts = 25; 
		char [][] matriu= new char [7][15];
		System.out.println("");
		System.out.println("Introdueix nombre de vegades a repetir el missatge: ");
		int preg= sc.nextInt();
		while(s<preg){
		for(int i = 0; i < salts; i++){ 
			System.out.println(); 
		} 
		//LLETRA O
		lletra_o(matriu);
		comensar_posicio(matriu);
		canviar_posicio2(matriu,temps,salts);
		canviar_posicio(matriu,temps,salts);

		 
		for(int i = 0; i < salts; i++){ 
		System.out.println(); 
		} 

		//LLETRA R
		lletra_r(matriu);
		comensar_posicio(matriu);
		canviar_posicio2(matriu,temps,salts);
		canviar_posicio(matriu,temps,salts);
		
		
		 
		for(int i = 0; i < salts; i++){ 
		System.out.println(); 
		} 
		
			
		//LLETRA I
		lletra_i(matriu);
		comensar_posicio(matriu);
		canviar_posicio2(matriu,temps,salts);
		canviar_posicio(matriu,temps,salts);
		
		 
		for(int i = 0; i < salts; i++){ 
		System.out.println(); 
		} 
		
		//LLETRA O
		lletra_o(matriu);
		comensar_posicio(matriu);
		canviar_posicio2(matriu,temps, salts);
		canviar_posicio(matriu,temps, salts);
		
		 
		for(int i = 0; i < salts; i++){ 
		System.out.println(); 
		} 
	
		//LLETRA L
		lletra_l(matriu);
		comensar_posicio(matriu);
		canviar_posicio2(matriu,temps, salts);
		canviar_posicio(matriu,temps, salts);
		
		 
		for(int i = 0; i < salts; i++){ 
		System.out.println();
		}
		
		//EXCLAMACIONS!!!
		exclamacio_fer(matriu,temps,salts);
		
		for(int b = 0; b < salts; b++){ 
			System.out.println();
		}
		
		
		try {
			Thread.sleep (temps);
			} catch (InterruptedException e) {}
		s++;
		}
	}
	public static void lletra_o(char matriu [][]) {
		for (int i=0; i<6; i ++){
			matriu [0][i]= '0';
			matriu [1][i]= '0';
			matriu [4][i]= '0';
			matriu [5][i]= '0';
			matriu [i][0]= '0';
			matriu [i][1]= '0';
			matriu [i][4]= '0';
			matriu [i][5]= '0';
		}
		matriu [2][2]= ' ';
		matriu [3][2]= ' ';
		matriu [2][3]= ' ';
		matriu [3][3]= ' ';
	} 
	
	public static void lletra_r(char matriu [][]) {
		for (int i=0; i<6; i ++){
			matriu [i][0]= '0';
			matriu [i][1]= '0';
			matriu [i][3]= '0';
			matriu [i][5]= ' ';

		}
		matriu [0][2]= '0';
		matriu [1][2]= '0';
		matriu [2][2]= ' ';
		matriu [3][2]= '0';
		matriu [4][2]= '0';
		matriu [5][2]= ' ';
		
		matriu [0][4]= ' ';
		matriu [1][4]= '0';
		matriu [2][4]= '0';
		matriu [3][4]= ' ';
		matriu [4][4]= ' ';
		matriu [5][4]= '0';
	} 
	
	public static void lletra_i(char matriu [][]) {
		for (int i=0; i<6; i ++){
			matriu [0][i]= '0';
			matriu [1][i]= '0';
			matriu [i][2]= '0';
			matriu [i][3]= '0';
		}
		matriu [0][0]= '0';
		matriu [1][0]= '0';
		matriu [2][0]= ' ';
		matriu [3][0]= ' ';
		matriu [4][0]= '0';
		matriu [5][0]= '0';
		matriu [0][1]= '0';
		matriu [1][1]= '0';
		matriu [2][1]= ' ';
		matriu [3][1]= ' ';
		matriu [4][1]= '0';
		matriu [5][1]= '0';
		matriu [0][4]= '0';
		matriu [1][4]= '0';
		matriu [2][4]= ' ';
		matriu [3][4]= ' ';
		matriu [4][4]= '0';
		matriu [5][4]= '0';
		matriu [0][5]= '0';
		matriu [1][5]= '0';
		matriu [2][5]= ' ';
		matriu [3][5]= ' ';
		matriu [4][5]= '0';
		matriu [5][5]= '0';
		
		
	} 
	public static void exclamacio(char matriu [][]) {
		for (int i=0; i<6; i ++){
			matriu [i][0]= ' ';
			matriu [i][1]= ' ';
			matriu [i][4]= ' ';
			matriu [i][5]= ' ';
		}
		
		matriu [0][2]= '0';
		matriu [1][2]= '0';
		matriu [2][2]= '0';
		matriu [3][2]= ' ';
		matriu [4][2]= '0';
		matriu [5][2]= '0';
		matriu [0][3]= '0';
		matriu [1][3]= '0';
		matriu [2][3]= '0';
		matriu [3][3]= ' ';
		matriu [4][3]= '0';
		matriu [5][3]= '0';

	} 
	public static void exclamacio_fer(char matriu [][],int temps,int salts) {
		for(int o=0; o<3; o++){
		exclamacio(matriu);
		comensar_posicio(matriu);
		canviar_posicio2(matriu,temps, salts);
		canviar_posicio(matriu,temps, salts);
		}
	} 
	public static void lletra_l(char matriu [][]) {
		for (int i=0; i<6; i ++){
			matriu [i][0]= '0';
			matriu [i][1]= '0';
			matriu [4][i]= '0';
			matriu [5][i]= '0';
		}
		
		for (int i=0; i<4; i ++){
		matriu [i][2]= ' ';
		matriu [i][3]= ' ';
		matriu [i][4]= ' ';
		matriu [i][4]= ' ';
		}
	} 

	public static void canviar_posicio(char matriu [][],int temps, int salts) {
		
		
		for (int k=0; k<5; k++){
			for(int i = 0; i<6; i++){
				for(int j = 0; j<6;j++){
					matriu[i][j]= matriu [i][j+1];
				}
			}

			for(int i = 0; i<6; i++){
				for(int j = 0; j<6;j++){
					if(matriu[i][j]=='0'){
						
					}else{
						matriu[i][j]=' ';
					}
				}
			}
			for(int i = 0; i<6; i++){
				for(int j = 0; j<6;j++){
					System.out.print(matriu[i][j] + " ");
				}
				System.out.println();
			}
			try {
				
				Thread.sleep (temps);
				} catch (InterruptedException e) {}
			 
			for(int i = 0; i < salts; i++){ 
			System.out.println(); 
			} 
			
		}
		for(int i = 0; i<6; i++){
			for(int j = 0; j<6;j++){
				matriu[i][j+6]= ' ';
			}
		}
	}
	public static void canviar_posicio2(char matriu [][], int temps, int salts) {
		for (int k=0; k<6; k++){
			for(int i = 0; i<6; i++){
				for(int j = 0; j<13;j++){
					matriu[i][j]= matriu [i][j+1];
				}
			}
		
			for(int i = 0; i<6; i++){
				for(int j = 0; j<6;j++){
					if(matriu[i][j]=='0'){
						
					}else{
						matriu[i][j]=' ';
					}
				}
			}
			for(int i = 0; i<6; i++){
				for(int j = 0; j<6;j++){
					System.out.print(matriu[i][j] + " ");
				}
				System.out.println();
			}
			try {
				Thread.sleep (temps);
				} catch (InterruptedException e) {}
			
			for(int i = 0; i < salts; i++){ 
			System.out.println(); 
			} 
			
		}
		for(int i = 0; i<6; i++){
			for(int j = 0; j<6;j++){
				matriu[i][j+6]= ' ';
			}
		}
		
	}
	
	public static void comensar_posicio(char matriu [][]) {
			for(int i = 0; i<6; i++){
				for(int j = 0; j<6;j++){
					matriu[i][j+6]= matriu [i][j];
				}
			}
			for(int i = 0; i<6; i++){
				for(int j = 0; j<6;j++){
					matriu[i][j]= ' ';
				}
			}
			
	}
}
