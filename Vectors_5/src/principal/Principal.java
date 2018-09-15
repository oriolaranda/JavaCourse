package principal;

import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String espai=" ";
		char caracter='O';
		
		System.out.println("Introdueix la basse:");
		int base = sc.nextInt();
		
		System.out.println("Introdueix l'altura:");
		int altura = sc.nextInt();
		char [] [] quadre = new char[altura+1] [base+1];
	
		for (int i=0; i < base; i ++){
			quadre [0][i]= caracter;
			System.out.print(quadre[0][i]);
		}
		for(int p=1; p < base-2; p ++){
			espai= espai +" ";
		}
		
		System.out.println();
		for (int a= 1; a < altura-1; a ++){
			quadre [a][0] = caracter;
			quadre [a][base-1] = caracter;
			System.out.println(quadre [a][0]+espai + quadre [a][base-1]);	
		}
		for (int i=0; i < base; i ++){
			quadre [altura-1][i]= caracter;
			System.out.print(quadre[altura-1][i]);
		}
	}

}
