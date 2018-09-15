package principal;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		Random r = new Random ();
		Scanner sc = new Scanner (System.in);
		System.out.println("Introdueix un número:");
		int introduit = sc.nextInt();
		int[] numero = new int[10];
		for(int i = 0; i < 10; i++){
			numero[i]= r.nextInt(10);
		}
		int num1= imprimeix_numero(numero,introduit);
		System.out.println("El numero aleatori que correspon amb el teu número és "+ num1);
	}
	public static int imprimeix_numero(int[] vector, int posicio){
		return vector[posicio] ;
	}
}
